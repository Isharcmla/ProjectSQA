import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SerializationUtilsTest {

    // Simple serializable helper class for cloning/serialization tests
    static class SerializableTestObject implements Serializable {
        private static final long serialVersionUID = 1L;
        private int value;
        private String name;

        public SerializableTestObject(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public int getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableTestObject)) {
                return false;
            }
            SerializableTestObject other = (SerializableTestObject) obj;
            return value == other.value && (name == null ? other.name == null : name.equals(other.name));
        }

        @Override
        public int hashCode() {
            return value;
        }
    }

    // Non-serializable helper class to trigger SerializationException
    static class NonSerializableObject {
        private int value;

        public NonSerializableObject(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // A Serializable wrapper that holds a non-serializable field,
    // which will cause NotSerializableException during serialization.
    static class WrapperWithNonSerializableField implements Serializable {
        private static final long serialVersionUID = 1L;
        @SuppressWarnings("unused")
        private NonSerializableObject nonSerializableField;

        public WrapperWithNonSerializableField(NonSerializableObject obj) {
            this.nonSerializableField = obj;
        }
    }

    // ---------- Constructor ----------

    @Test
    public void testConstructor_normalInstantiation_createsInstance() {
        SerializationUtils utils = new SerializationUtils();
        assertNotNull(utils);
    }

    // ---------- clone(T) ----------

    @Test
    public void testClone_nullObject_returnsNull() {
        Object result = SerializationUtils.clone(null);
        assertNull(result);
    }

    @Test
    public void testClone_normalSerializableObject_returnsEqualButDifferentInstance() {
        SerializableTestObject original = new SerializableTestObject(42, "test");
        SerializableTestObject cloned = SerializationUtils.clone(original);

        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertEquals(original, cloned);
        assertEquals(original.getValue(), cloned.getValue());
        assertEquals(original.getName(), cloned.getName());
    }

    @Test
    public void testClone_stringObject_returnsEqualClone() {
        String original = "Hello World";
        String cloned = SerializationUtils.clone(original);

        assertNotNull(cloned);
        assertEquals(original, cloned);
    }

    @Test
    public void testClone_integerObject_returnsEqualClone() {
        Integer original = 12345;
        Integer cloned = SerializationUtils.clone(original);

        assertNotNull(cloned);
        assertEquals(original, cloned);
    }

    @Test
    public void testClone_listObject_returnsEqualClone() {
        List<String> original = new ArrayList<String>();
        original.add("a");
        original.add("b");
        original.add("c");

        List<String> cloned = SerializationUtils.clone((Serializable) original);

        assertNotNull(cloned);
        assertEquals(original, cloned);
        assertNotSame(original, cloned);
    }

    @Test(expected = SerializationException.class)
    public void testClone_nonSerializableField_throwsSerializationException() {
        WrapperWithNonSerializableField wrapper =
                new WrapperWithNonSerializableField(new NonSerializableObject(1));
        SerializationUtils.clone(wrapper);
    }

    // ---------- serialize(Serializable, OutputStream) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testSerializeToStream_nullOutputStream_throwsIllegalArgumentException() {
        SerializationUtils.serialize(new SerializableTestObject(1, "x"), null);
    }

    @Test
    public void testSerializeToStream_normalObject_writesDataToStream() {
        SerializableTestObject obj = new SerializableTestObject(99, "serialize-test");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        SerializationUtils.serialize(obj, baos);

        byte[] data = baos.toByteArray();
        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test
    public void testSerializeToStream_nullObject_writesNullMarker() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        SerializationUtils.serialize(null, baos);

        byte[] data = baos.toByteArray();
        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test(expected = SerializationException.class)
    public void testSerializeToStream_nonSerializableField_throwsSerializationException() {
        WrapperWithNonSerializableField wrapper =
                new WrapperWithNonSerializableField(new NonSerializableObject(2));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        SerializationUtils.serialize(wrapper, baos);
    }

    @Test(expected = SerializationException.class)
    public void testSerializeToStream_outputStreamThrowsOnWrite_throwsSerializationException() {
        SerializableTestObject obj = new SerializableTestObject(1, "x");

        OutputStream failingStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                throw new IOException("Simulated IO failure");
            }
        };

        SerializationUtils.serialize(obj, failingStream);
    }

    // ---------- serialize(Serializable) ----------

    @Test
    public void testSerializeToByteArray_normalObject_returnsNonEmptyByteArray() {
        SerializableTestObject obj = new SerializableTestObject(7, "byte-array-test");
        byte[] data = SerializationUtils.serialize(obj);

        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test
    public void testSerializeToByteArray_nullObject_returnsNonEmptyByteArray() {
        byte[] data = SerializationUtils.serialize(null);

        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test(expected = SerializationException.class)
    public void testSerializeToByteArray_nonSerializableField_throwsSerializationException() {
        WrapperWithNonSerializableField wrapper =
                new WrapperWithNonSerializableField(new NonSerializableObject(3));
        SerializationUtils.serialize(wrapper);
    }

    // ---------- deserialize(InputStream) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeFromStream_nullInputStream_throwsIllegalArgumentException() {
        SerializationUtils.deserialize((java.io.InputStream) null);
    }

    @Test
    public void testDeserializeFromStream_normalSerializedObject_returnsDeserializedObject() {
        SerializableTestObject original = new SerializableTestObject(55, "deserialize-test");
        byte[] data = SerializationUtils.serialize(original);

        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(data);
        Object result = SerializationUtils.deserialize(bais);

        assertNotNull(result);
        assertTrue(result instanceof SerializableTestObject);
        assertEquals(original, result);
    }

    @Test
    public void testDeserializeFromStream_nullSerializedObject_returnsNull() {
        byte[] data = SerializationUtils.serialize(null);
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(data);

        Object result = SerializationUtils.deserialize(bais);

        assertNull(result);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeFromStream_corruptedData_throwsSerializationException() {
        byte[] corruptData = new byte[] { 0, 1, 2, 3, 4, 5 };
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(corruptData);

        SerializationUtils.deserialize(bais);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeFromStream_emptyData_throwsSerializationException() {
        byte[] emptyData = new byte[0];
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(emptyData);

        SerializationUtils.deserialize(bais);
    }

    // ---------- deserialize(byte[]) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeFromByteArray_nullByteArray_throwsIllegalArgumentException() {
        SerializationUtils.deserialize((byte[]) null);
    }

    @Test
    public void testDeserializeFromByteArray_normalSerializedObject_returnsDeserializedObject() {
        SerializableTestObject original = new SerializableTestObject(88, "byte-array-deserialize");
        byte[] data = SerializationUtils.serialize(original);

        Object result = SerializationUtils.deserialize(data);

        assertNotNull(result);
        assertTrue(result instanceof SerializableTestObject);
        assertEquals(original, result);
    }

    @Test
    public void testDeserializeFromByteArray_stringObject_returnsEqualString() {
        String original = "deserialize-string-test";
        byte[] data = SerializationUtils.serialize(original);

        Object result = SerializationUtils.deserialize(data);

        assertNotNull(result);
        assertEquals(original, result);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeFromByteArray_corruptedData_throwsSerializationException() {
        byte[] corruptData = new byte[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        SerializationUtils.deserialize(corruptData);
    }

    // ---------- round-trip clone with list including custom object ----------

    @Test
    public void testClone_listOfCustomObjects_returnsEqualClone() {
        List<SerializableTestObject> original = new ArrayList<SerializableTestObject>();
        original.add(new SerializableTestObject(1, "one"));
        original.add(new SerializableTestObject(2, "two"));

        List<SerializableTestObject> cloned = SerializationUtils.clone((Serializable) original);

        assertNotNull(cloned);
        assertEquals(original.size(), cloned.size());
        assertEquals(original, cloned);
        assertNotSame(original, cloned);
    }
}
