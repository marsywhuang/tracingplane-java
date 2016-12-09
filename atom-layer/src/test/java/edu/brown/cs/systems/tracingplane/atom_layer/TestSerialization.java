package edu.brown.cs.systems.tracingplane.atom_layer;

import static org.junit.Assert.assertNull;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.junit.Test;

public class TestSerialization {

    @Test
    public void testSerializeNulls() {

        assertNull(AtomLayerSerialization.serialize(null));
        assertNull(AtomLayerSerialization.serialize(new ArrayList<ByteBuffer>()));

    }

}
