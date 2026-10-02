import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AtomicReferenceDeserializerTest {

    private AtomicReferenceDeserializer deserializer;
    private JavaType fullType;

    @Before
    public void setUp() {
        // Construct a real JavaType for AtomicReference<Object> using Jackson's TypeFactory
        fullType = TypeFactory.defaultInstance().constructType(AtomicReference.class);
        // ValueInstantiator, TypeDeserializer, and JsonDeserializer are not used
        // internally by the methods under test (they only store references),
        // so passing null is safe for these dependencies.
        deserializer = new AtomicReferenceDeserializer(fullType, null, null, null);
    }

    @Test
    public void testConstructor_withValidArguments_createsInstance() {
        assertNotNull(deserializer);
    }

    @Test
    public void testWithResolved_withNonNullArguments_returnsNewInstance() {
        TypeDeserializer typeDeser = null; // no real TypeDeserializer implementation available without mocking
        JsonDeserializer<?> valueDeser = null; // no real deserializer instance required for this test

        AtomicReferenceDeserializer resolved = deserializer.withResolved(typeDeser, valueDeser);

        assertNotNull(resolved);
        assertNotSame(deserializer, resolved);
    }

    @Test
    public void testWithResolved_calledTwice_returnsDifferentInstancesEachTime() {
        AtomicReferenceDeserializer resolved1 = deserializer.withResolved(null, null);
        AtomicReferenceDeserializer resolved2 = deserializer.withResolved(null, null);

        assertNotNull(resolved1);
        assertNotNull(resolved2);
        assertNotSame(resolved1, resolved2);
    }

    @Test
    public void testGetNullValue_withNullContext_returnsNewAtomicReferenceWithNullContent() throws Exception {
        DeserializationContext ctxt = null; // ctxt is unused in implementation, safe to pass null

        AtomicReference<Object> result = deserializer.getNullValue(ctxt);

        assertNotNull(result);
        assertNull(result.get());
    }

    @Test
    public void testGetNullValue_calledMultipleTimes_returnsDistinctInstances() throws Exception {
        AtomicReference<Object> result1 = deserializer.getNullValue(null);
        AtomicReference<Object> result2 = deserializer.getNullValue(null);

        assertNotNull(result1);
        assertNotNull(result2);
        assertNotSame(result1, result2);
    }

    @Test
    public void testGetEmptyValue_withNullContext_returnsNewAtomicReferenceInstance() {
        DeserializationContext ctxt = null; // ctxt is unused in implementation, safe to pass null

        Object result = deserializer.getEmptyValue(ctxt);

        assertNotNull(result);
        assertTrue(result instanceof AtomicReference);
        assertNull(((AtomicReference<?>) result).get());
    }

    @Test
    public void testReferenceValue_withNonNullContents_returnsAtomicReferenceWrappingContents() {
        String contents = "testValue";

        AtomicReference<Object> result = deserializer.referenceValue(contents);

        assertNotNull(result);
        assertEquals(contents, result.get());
    }

    @Test
    public void testReferenceValue_withNullContents_returnsAtomicReferenceWithNull() {
        AtomicReference<Object> result = deserializer.referenceValue(null);

        assertNotNull(result);
        assertNull(result.get());
    }

    @Test
    public void testReferenceValue_withIntegerContents_returnsAtomicReferenceWrappingInteger() {
        Integer contents = 42;

        AtomicReference<Object> result = deserializer.referenceValue(contents);

        assertNotNull(result);
        assertEquals(contents, result.get());
    }

    @Test
    public void testGetReferenced_withPopulatedReference_returnsUnderlyingValue() {
        AtomicReference<Object> reference = new AtomicReference<Object>("hello");

        Object result = deserializer.getReferenced(reference);

        assertEquals("hello", result);
    }

    @Test
    public void testGetReferenced_withNullContentReference_returnsNull() {
        AtomicReference<Object> reference = new AtomicReference<Object>(null);

        Object result = deserializer.getReferenced(reference);

        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetReferenced_withNullReferenceItself_throwsNullPointerException() {
        AtomicReference<Object> reference = null;

        deserializer.getReferenced(reference);
    }

    @Test
    public void testUpdateReference_withNonNullContents_updatesAndReturnsSameReference() {
        AtomicReference<Object> reference = new AtomicReference<Object>("old");

        AtomicReference<Object> result = deserializer.updateReference(reference, "new");

        assertSame(reference, result);
        assertEquals("new", result.get());
    }

    @Test
    public void testUpdateReference_withNullContents_setsContentToNull() {
        AtomicReference<Object> reference = new AtomicReference<Object>("old");

        AtomicReference<Object> result = deserializer.updateReference(reference, null);

        assertSame(reference, result);
        assertNull(result.get());
    }

    @Test(expected = NullPointerException.class)
    public void testUpdateReference_withNullReferenceItself_throwsNullPointerException() {
        AtomicReference<Object> reference = null;

        deserializer.updateReference(reference, "value");
    }

    @Test
    public void testSupportsUpdate_withNullConfig_returnsTrue() {
        DeserializationConfig config = null; // config is unused in implementation, safe to pass null

        Boolean result = deserializer.supportsUpdate(config);

        assertNotNull(result);
        assertTrue(result);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testSupportsUpdate_calledMultipleTimes_alwaysReturnsTrue() {
        Boolean result1 = deserializer.supportsUpdate(null);
        Boolean result2 = deserializer.supportsUpdate(null);

        assertEquals(Boolean.TRUE, result1);
        assertEquals(Boolean.TRUE, result2);
    }
}
