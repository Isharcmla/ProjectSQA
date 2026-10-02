package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.JsonDeserializer;

public class JdkDeserializersTest {

    @Test
    public void testConstructor_instanceCreation() {
        JdkDeserializers deserializers = new JdkDeserializers();
        assertNotNull(deserializers);
    }

    @Test
    public void testFind_uuid_returnsUUIDDeserializer() {
        JsonDeserializer<?> deser = JdkDeserializers.find(UUID.class, UUID.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof UUIDDeserializer);
    }

    @Test
    public void testFind_stackTraceElement_returnsStackTraceElementDeserializer() {
        JsonDeserializer<?> deser = JdkDeserializers.find(StackTraceElement.class, StackTraceElement.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof StackTraceElementDeserializer);
    }

    @Test
    public void testFind_atomicBoolean_returnsAtomicBooleanDeserializer() {
        JsonDeserializer<?> deser = JdkDeserializers.find(AtomicBoolean.class, AtomicBoolean.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof AtomicBooleanDeserializer);
    }

    @Test
    public void testFind_byteBuffer_returnsByteBufferDeserializer() {
        JsonDeserializer<?> deser = JdkDeserializers.find(ByteBuffer.class, ByteBuffer.class.getName());
        assertNotNull(deser);
        assertTrue(deser instanceof ByteBufferDeserializer);
    }

    @Test
    public void testFind_fromStringDeserializerTypes_returnsDeserializer() {
        Class<?>[] types = new Class<?>[] {
            File.class,
            URL.class,
            URI.class,
            Class.class,
            Currency.class,
            Pattern.class,
            Locale.class,
            TimeZone.class
        };

        for (Class<?> cls : types) {
            JsonDeserializer<?> deser = JdkDeserializers.find(cls, cls.getName());
            assertNotNull("Deserializer for " + cls.getName() + " should not be null", deser);
        }
    }

    @Test
    public void testFind_nonJdkType_returnsNull() {
        JsonDeserializer<?> deser = JdkDeserializers.find(Object.class, Object.class.getName());
        assertNull(deser);
    }

    @Test
    public void testFind_emptyClassName_returnsNull() {
        JsonDeserializer<?> deser = JdkDeserializers.find(String.class, "");
        assertNull(deser);
    }

    @Test
    public void testFind_nullClassName_returnsNull() {
        JsonDeserializer<?> deser = JdkDeserializers.find(String.class, null);
        assertNull(deser);
    }

    @Test
    public void testFind_matchingClassNameWithMismatchedRawType_returnsNull() {
        // Name is in _classNames but rawType does not match any expected type
        JsonDeserializer<?> deser = JdkDeserializers.find(Object.class, UUID.class.getName());
        assertNull(deser);

        deser = JdkDeserializers.find(Object.class, StackTraceElement.class.getName());
        assertNull(deser);

        deser = JdkDeserializers.find(Object.class, AtomicBoolean.class.getName());
        assertNull(deser);

        deser = JdkDeserializers.find(Object.class, ByteBuffer.class.getName());
        assertNull(deser);
    }

    @Test
    public void testFind_nullRawTypeWithMatchingClassName_returnsNull() {
        JsonDeserializer<?> deser = JdkDeserializers.find(null, UUID.class.getName());
        assertNull(deser);
    }
}
