/** Generated by BaggageBuffersCompiler */
package brown.tracingplane.bdl.examples;

import brown.tracingplane.bdl.Struct;
import brown.tracingplane.bdl.StructHelpers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import brown.tracingplane.bdl.BDLUtils;
import java.nio.ByteBuffer;


public class SimpleStruct1 implements Struct {

    private static final Logger _log = LoggerFactory.getLogger(SimpleStruct1.class);

    public Integer integerField = 0;
    public String stringField = "";

    private static final SimpleStruct1 _defaultValue = new SimpleStruct1();
    private static final Integer _integerField_defaultValue = 0;
    private static final String _stringField_defaultValue = "";

    @Override
    public Struct.StructHandler<?> handler() {
        return Handler.instance;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("SimpleStruct1{\n");
            b.append(BDLUtils.indent(String.format("integerField = %s\n", String.valueOf(this.integerField == null ? _integerField_defaultValue : this.integerField))));
            b.append(BDLUtils.indent(String.format("stringField = %s\n", String.valueOf(this.stringField == null ? _stringField_defaultValue : this.stringField))));
            b.append("}");
        return b.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return SimpleStruct1.equals(this, _defaultValue);
        } else if (!(other instanceof SimpleStruct1)) {
            return false;
        } else {
            return SimpleStruct1.equals(this, (SimpleStruct1) other);
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result * 37 + (this.integerField == null ? _integerField_defaultValue : this.integerField).hashCode();
        result = result * 37 + (this.stringField == null ? _stringField_defaultValue : this.stringField).hashCode();
        return result;
    }

    private static boolean equals(SimpleStruct1 a, SimpleStruct1 b) {
        if (!BDLUtils.equals(a.integerField, b.integerField, _integerField_defaultValue)) return false;
        if (!BDLUtils.equals(a.stringField, b.stringField, _stringField_defaultValue)) return false;
        return true;
    }

    public static class Handler implements Struct.StructHandler<SimpleStruct1> {

        public static final Handler instance = new Handler();

        private Handler(){}


        private static final Struct.StructReader<Integer> _integerFieldReader = StructHelpers.int32Reader;
        private static final Struct.StructSizer<Integer> _integerFieldSizer = StructHelpers.int32Sizer;
        private static final Struct.StructWriter<Integer> _integerFieldWriter = StructHelpers.int32Writer;

        private static final Struct.StructReader<String> _stringFieldReader = StructHelpers.stringReader;
        private static final Struct.StructSizer<String> _stringFieldSizer = StructHelpers.stringSizer;
        private static final Struct.StructWriter<String> _stringFieldWriter = StructHelpers.stringWriter;

        @Override
        public SimpleStruct1 readFrom(ByteBuffer buf) throws Exception {
            SimpleStruct1 instance = new SimpleStruct1();

            try {
                instance.integerField = _integerFieldReader.readFrom(buf);
                instance.stringField = _stringFieldReader.readFrom(buf);
            } catch (Exception e) {
                _log.warn("Exception parsing SimpleStruct1 ", e);
            }

            return instance;
        }

        @Override
        public void writeTo(ByteBuffer buf, SimpleStruct1 instance) {
            try {
                _integerFieldWriter.writeTo(buf, instance.integerField == null ? _integerField_defaultValue : instance.integerField);
                _stringFieldWriter.writeTo(buf, instance.stringField == null ? _stringField_defaultValue : instance.stringField);
            } catch (Exception e) {
                _log.warn("Exception serializing SimpleStruct1 ", e);
            }
        }

        @Override
        public int serializedSize(SimpleStruct1 instance) {
            int size = 0;
            size += _integerFieldSizer.serializedSize(instance.integerField == null ? _integerField_defaultValue : instance.integerField);
            size += _stringFieldSizer.serializedSize(instance.stringField == null ? _stringField_defaultValue : instance.stringField);
            return size;
        }
    }
}