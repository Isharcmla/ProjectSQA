package org.apache.commons.lang3;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SerializationUtilsTest {

    static class SimpleTestObject implements Serializable {
        private static final long serialVersionUID = 1L;
        private final String name;
        private final int value;

        SimpleTestObject(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            SimpleTestObject that = (SimpleTestObject) obj;
            return value == that.value && (name != null ? name.equals(that.name) : that.name == null);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + value;
            return result;
        }
    }

    static class NonSerializableFieldObject implements Serializable {
        private static final long serialVersionUID = 1L;
        @SuppressWarnings("unused")
        private final Object nonSerializable = new Object();
    }

    static class ReadObjectExceptionObject implements Serializable {
        private static final long serialVersionUID = 1L;

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new IOException("Simulated readObject IOException");
        }
    }

    static class ReadObjectClassNotFoundExceptionObject implements Serializable {
        private static final long serialVersionUID = 1L;

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new ClassNotFoundException("Simulated readObject ClassNotFoundException");
        }
    }

    static class BrokenOutputStream extends OutputStream {
        @Override
        public void write(int b) throws IOException {
            throw new IOException("Simulated write IOException");
        }
    }

    static class CloseThrowingOutputStream extends OutputStream {
        @Override
        public void write(int b) {
            // no-op
        }

        @Override
        public void close() throws IOException {
            throw new IOException("Simulated close IOException");
        }
    }

    static class BrokenInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("Simulated read IOException");
        }
    }

    static class CloseThrowingInputStream extends InputStream {
        private final InputStream delegate;

        CloseThrowingInputStream(InputStream delegate) {
            this.delegate = delegate;
        }

        @Override
        public int read() throws IOException {
            return delegate.read();
        }

        @Override
        public void close() throws IOException {
            throw new IOException("Simulated close IOException");
        }
    }

    @Test
    public void testConstructor_instantiation_notNull() {
        SerializationUtils utils = new SerializationUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testClone_nullInput_returnsNull() {
        Serializable result = SerializationUtils.clone(null);
        Assert.assertNull(result);
    }

    @Test
    public void testClone_validObject_clonedSuccessfully() {
        SimpleTestObject original = new SimpleTestObject("test", 123);
        SimpleTestObject clone = SerializationUtils.clone(original);

        Assert.assertNotNull(clone);
        Assert.assertNotSame(original, clone);
        Assert.assertEquals(original, clone);
        Assert.assertEquals("test", clone.getName());
        Assert.assertEquals(123, clone.getValue());
    }

    @Test
    public void testClone_complexObject_clonedSuccessfully() {
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        map.put("key", list);

        HashMap<String, List<Integer>> clone = SerializationUtils.clone((HashMap<String, List<Integer>>) map);

        Assert.assertNotNull(clone);
        Assert.assertNotSame(map, clone);
        Assert.assertEquals(map, clone);
        Assert.assertNotSame(map.get("key"), clone.get("key"));
    }

    @Test(expected = SerializationException.class)
    public void testClone_unserializableObject_throwsSerializationException() {
        SerializationUtils.clone(new NonSerializableFieldObject());
    }

    @Test(expected = SerializationException.class)
    public void testClone_readObjectIOException_throwsSerializationException() {
        SerializationUtils.clone(new ReadObjectExceptionObject());
    }

    @Test(expected = SerializationException.class)
    public void testClone_readObjectClassNotFoundException_throwsSerializationException() {
        SerializationUtils.clone(new ReadObjectClassNotFoundExceptionObject());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSerialize_nullOutputStream_throwsIllegalArgumentException() {
        SerializationUtils.serialize("test", null);
    }

    @Test
    public void testSerialize_nullObjectToStream_successful() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(null, baos);

        Object result = SerializationUtils.deserialize(baos.toByteArray());
        Assert.assertNull(result);
    }

    @Test
    public void testSerialize_validObjectToStream_successful() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SimpleTestObject original = new SimpleTestObject("streamTest", 456);

        SerializationUtils.serialize(original, baos);
        Object deserialized = SerializationUtils.deserialize(baos.toByteArray());

        Assert.assertEquals(original, deserialized);
    }

    @Test(expected = SerializationException.class)
    public void testSerialize_toBrokenStream_throwsSerializationException() {
        SerializationUtils.serialize("test", new BrokenOutputStream());
    }

    @Test
    public void testSerialize_streamCloseThrowsException_exceptionIgnored() {
        CloseThrowingOutputStream out = new CloseThrowingOutputStream();
        SerializationUtils.serialize("test", out);
    }

    @Test
    public void testSerialize_toByteArray_successful() {
        SimpleTestObject original = new SimpleTestObject("bytesTest", 789);
        byte[] bytes = SerializationUtils.serialize(original);

        Assert.assertNotNull(bytes);
        Assert.assertTrue(bytes.length > 0);

        Object deserialized = SerializationUtils.deserialize(bytes);
        Assert.assertEquals(original, deserialized);
    }

    @Test
    public void testSerialize_nullToByteArray_successful() {
        byte[] bytes = SerializationUtils.serialize(null);

        Assert.assertNotNull(bytes);
        Assert.assertTrue(bytes.length > 0);

        Object deserialized = SerializationUtils.deserialize(bytes);
        Assert.assertNull(deserialized);
    }

    @Test(expected = SerializationException.class)
    public void testSerialize_unserializableObjectToByteArray_throwsSerializationException() {
        SerializationUtils.serialize(new NonSerializableFieldObject());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_nullInputStream_throwsIllegalArgumentException() {
        SerializationUtils.deserialize((InputStream) null);
    }

    @Test
    public void testDeserialize_validInputStream_successful() {
        byte[] bytes = SerializationUtils.serialize("hello world");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        Object result = SerializationUtils.deserialize(bais);
        Assert.assertEquals("hello world", result);
    }

    @Test(expected = SerializationException.class)
    public void testDeserialize_invalidInputStreamData_throwsSerializationException() {
        byte[] invalidBytes = new byte[]{0, 1, 2, 3, 4, 5};
        ByteArrayInputStream bais = new ByteArrayInputStream(invalidBytes);
        SerializationUtils.deserialize(bais);
    }

    @Test(expected = SerializationException.class)
    public void testDeserialize_brokenInputStream_throwsSerializationException() {
        SerializationUtils.deserialize(new BrokenInputStream());
    }

    @Test
    public void testDeserialize_streamCloseThrowsException_exceptionIgnored() {
        byte[] bytes = SerializationUtils.serialize("testClose");
        CloseThrowingInputStream in = new CloseThrowingInputStream(new ByteArrayInputStream(bytes));

        Object result = SerializationUtils.deserialize(in);
        Assert.assertEquals("testClose", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserialize_nullByteArray_throwsIllegalArgumentException() {
        SerializationUtils.deserialize((byte[]) null);
    }

    @Test
    public void testDeserialize_validByteArray_successful() {
        byte[] bytes = SerializationUtils.serialize(Integer.valueOf(42));
        Object result = SerializationUtils.deserialize(bytes);
        Assert.assertEquals(Integer.valueOf(42), result);
    }

    @Test(expected = SerializationException.class)
    public void testDeserialize_emptyByteArray_throwsSerializationException() {
        SerializationUtils.deserialize(new byte[0]);
    }

    @Test(expected = SerializationException.class)
    public void testDeserialize_corruptedByteArray_throwsSerializationException() {
        byte[] corruptData = new byte[]{(byte) 0xAC, (byte) 0xED, 0x00, 0x05, 0x77, 0x01, 0x00};
        SerializationUtils.deserialize(corruptData);
    }

    @Test
    public void testClassLoaderAwareObjectInputStream_resolveClassWithCustomAndContextClassLoader() throws Exception {
        byte[] bytes = SerializationUtils.serialize("testClassLoader");
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        ClassLoader dummyClassLoader = new ClassLoader(null) {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                throw new ClassNotFoundException("Dummy class loader cannot find class: " + name);
            }
        };

        SerializationUtils.ClassLoaderAwareObjectInputStream clIn =
                new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, dummyClassLoader);

        Object result = clIn.readObject();
        clIn.close();

        Assert.assertEquals("testClassLoader", result);
    }

    @Test
    public void testClassLoaderAwareObjectInputStream_resolveClassDirectly() throws Exception {
        byte[] bytes = SerializationUtils.serialize(new SimpleTestObject("direct", 1));
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        SerializationUtils.ClassLoaderAwareObjectInputStream clIn =
                new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, getClass().getClassLoader());

        ObjectStreamClass desc = ObjectStreamClass.lookup(SimpleTestObject.class);
        Class<?> resolvedClass = clIn.resolveClass(desc);
        clIn.close();

        Assert.assertEquals(SimpleTestObject.class, resolvedClass);
    }
}
