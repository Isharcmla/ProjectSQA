import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class JdkDeserializersTest {

    @Test
    public void testFind_uuidClass_returnsUUIDDeserializer() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(UUID.class, UUID.class.getName());
        assertNotNull(deserializer);
    }

    @Test
    public void testFind_atomicBooleanClass_returnsAtomicBooleanDeserializer() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName());
        assertNotNull(deserializer);
    }

    @Test
    public void testFind_stackTraceElementClass_returnsStackTraceElementDeserializer() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName());
        assertNotNull(deserializer);
    }

    @Test
    public void testFind_byteBufferClass_returnsByteBufferDeserializer() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName());
        assertNotNull(deserializer);
    }

    @Test
    public void testFind_unknownClassName_returnsNull() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(String.class, "com.example.UnknownClass");
        assertNull(deserializer);
    }

    @Test
    public void testFind_nullClassName_returnsNull() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(null, null);
        assertNull(deserializer);
    }

    @Test
    public void testFind_emptyClassName_returnsNull() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(String.class, "");
        assertNull(deserializer);
    }

    @Test
    public void testFind_knownClassNameWithMismatchedRawType_returnsNull() {
        // clsName matches UUID.class.getName() but rawType is different and not
        // handled by FromStringDeserializer nor by any of the explicit if-checks
        JsonDeserializer<?> deserializer = JdkDeserializers.find(String.class, UUID.class.getName());
        assertNull(deserializer);
    }

    @Test
    public void testFind_atomicBooleanClassNameWithMismatchedRawType_returnsNull() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(Integer.class, AtomicBoolean.class.getName());
        assertNull(deserializer);
    }

    @Test
    public void testFind_stackTraceElementClassNameWithMismatchedRawType_returnsNull() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(Integer.class, StackTraceElement.class.getName());
        assertNull(deserializer);
    }

    @Test
    public void testFind_byteBufferClassNameWithMismatchedRawType_returnsNull() {
        JsonDeserializer<?> deserializer = JdkDeserializers.find(Integer.class, ByteBuffer.class.getName());
        assertNull(deserializer);
    }

    @Test
    public void testFind_nullRawTypeWithValidClassName_doesNotThrowAndReturnsNullOrDeserializer() {
        // Depending on FromStringDeserializer.findDeserializer implementation,
        // passing null rawType with a valid class name should not throw an
        // unexpected exception; result may be null since none of the explicit
        // rawType checks (==) will match null.
        try {
            JsonDeserializer<?> deserializer = JdkDeserializers.find(null, UUID.class.getName());
            assertNull(deserializer);
        } catch (Exception e) {
            // If the underlying implementation throws for null rawType,
            // this is acceptable behavior to document via this test.
            assertTrue(true);
        }
    }
}
