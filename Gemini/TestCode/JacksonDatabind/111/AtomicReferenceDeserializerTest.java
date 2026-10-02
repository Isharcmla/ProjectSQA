package com.fasterxml.jackson.databind.deser.std;

import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;

public class AtomicReferenceDeserializerTest {

    private AtomicReferenceDeserializer createDeserializer() {
        JavaType type = TypeFactory.defaultInstance().constructType(
                new TypeReference<AtomicReference<Object>>() {}.getType());
        return new AtomicReferenceDeserializer(type, null, null, null);
    }

    @Test
    public void testConstructor_withNullParameters_createsInstance() {
        AtomicReferenceDeserializer deser = new AtomicReferenceDeserializer(null, null, null, null);
        Assert.assertNotNull(deser);
    }

    @Test
    public void testWithResolved_sameOrNullResolutions_returnsNewInstance() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReferenceDeserializer resolved = deser.withResolved(null, null);

        Assert.assertNotNull(resolved);
        Assert.assertNotSame(deser, resolved);
    }

    @Test
    public void testWithResolved_customResolutions_returnsNewInstance() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JsonDeserializer<?> mockValueDeser = StringDeserializer.instance;
        AtomicReferenceDeserializer deser = new AtomicReferenceDeserializer(type, null, null, null);

        AtomicReferenceDeserializer resolved = deser.withResolved(null, mockValueDeser);
        Assert.assertNotNull(resolved);
        Assert.assertNotSame(deser, resolved);
    }

    @Test
    public void testGetNullValue_withNullContext_returnsEmptyAtomicReference() throws JsonMappingException {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> nullVal = deser.getNullValue((DeserializationContext) null);

        Assert.assertNotNull(nullVal);
        Assert.assertNull(nullVal.get());
    }

    @Test
    public void testGetNullValue_withContext_returnsEmptyAtomicReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        AtomicReferenceDeserializer deser = createDeserializer();

        AtomicReference<Object> nullVal = deser.getNullValue(ctxt);
        Assert.assertNotNull(nullVal);
        Assert.assertNull(nullVal.get());
    }

    @Test
    public void testGetEmptyValue_withNullContext_returnsEmptyAtomicReference() {
        AtomicReferenceDeserializer deser = createDeserializer();
        Object emptyVal = deser.getEmptyValue((DeserializationContext) null);

        Assert.assertTrue(emptyVal instanceof AtomicReference);
        Assert.assertNull(((AtomicReference<?>) emptyVal).get());
    }

    @Test
    public void testGetEmptyValue_withContext_returnsEmptyAtomicReference() {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        AtomicReferenceDeserializer deser = createDeserializer();

        Object emptyVal = deser.getEmptyValue(ctxt);
        Assert.assertTrue(emptyVal instanceof AtomicReference);
        Assert.assertNull(((AtomicReference<?>) emptyVal).get());
    }

    @Test
    public void testReferenceValue_withNormalString_returnsAtomicReferenceContainingString() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = deser.referenceValue("test-value");

        Assert.assertNotNull(ref);
        Assert.assertEquals("test-value", ref.get());
    }

    @Test
    public void testReferenceValue_withNull_returnsAtomicReferenceContainingNull() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = deser.referenceValue(null);

        Assert.assertNotNull(ref);
        Assert.assertNull(ref.get());
    }

    @Test
    public void testReferenceValue_withZeroAndNegativeNumber_returnsExpectedValues() {
        AtomicReferenceDeserializer deser = createDeserializer();

        AtomicReference<Object> zeroRef = deser.referenceValue(0);
        Assert.assertNotNull(zeroRef);
        Assert.assertEquals(0, zeroRef.get());

        AtomicReference<Object> negRef = deser.referenceValue(-999);
        Assert.assertNotNull(negRef);
        Assert.assertEquals(-999, negRef.get());
    }

    @Test
    public void testReferenceValue_withEmptyStringAndEmptyArray_returnsExpectedValues() {
        AtomicReferenceDeserializer deser = createDeserializer();

        AtomicReference<Object> emptyStrRef = deser.referenceValue("");
        Assert.assertNotNull(emptyStrRef);
        Assert.assertEquals("", emptyStrRef.get());

        Object[] emptyArray = new Object[0];
        AtomicReference<Object> emptyArrayRef = deser.referenceValue(emptyArray);
        Assert.assertNotNull(emptyArrayRef);
        Assert.assertArrayEquals(emptyArray, (Object[]) emptyArrayRef.get());
    }

    @Test
    public void testGetReferenced_withPopulatedReference_returnsContent() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = new AtomicReference<Object>("hello");

        Object content = deser.getReferenced(ref);
        Assert.assertEquals("hello", content);
    }

    @Test
    public void testGetReferenced_withNullContentReference_returnsNull() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = new AtomicReference<Object>(null);

        Object content = deser.getReferenced(ref);
        Assert.assertNull(content);
    }

    @Test(expected = NullPointerException.class)
    public void testGetReferenced_withNullReference_throwsNullPointerException() {
        AtomicReferenceDeserializer deser = createDeserializer();
        deser.getReferenced(null);
    }

    @Test
    public void testUpdateReference_normalValue_updatesAndReturnsSameInstance() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = new AtomicReference<Object>("initial");

        AtomicReference<Object> result = deser.updateReference(ref, "updated");

        Assert.assertSame(ref, result);
        Assert.assertEquals("updated", result.get());
    }

    @Test
    public void testUpdateReference_withNullContent_updatesReferenceToNull() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = new AtomicReference<Object>("initial");

        AtomicReference<Object> result = deser.updateReference(ref, null);

        Assert.assertSame(ref, result);
        Assert.assertNull(result.get());
    }

    @Test
    public void testUpdateReference_withEdgeCases_updatesReferenceProperly() {
        AtomicReferenceDeserializer deser = createDeserializer();
        AtomicReference<Object> ref = new AtomicReference<Object>("initial");

        deser.updateReference(ref, 0);
        Assert.assertEquals(0, ref.get());

        deser.updateReference(ref, -1);
        Assert.assertEquals(-1, ref.get());

        deser.updateReference(ref, "");
        Assert.assertEquals("", ref.get());
    }

    @Test(expected = NullPointerException.class)
    public void testUpdateReference_withNullReference_throwsNullPointerException() {
        AtomicReferenceDeserializer deser = createDeserializer();
        deser.updateReference(null, "value");
    }

    @Test
    public void testSupportsUpdate_withNullOrValidConfig_returnsTrue() {
        AtomicReferenceDeserializer deser = createDeserializer();
        Assert.assertEquals(Boolean.TRUE, deser.supportsUpdate((DeserializationConfig) null));

        ObjectMapper mapper = new ObjectMapper();
        Assert.assertEquals(Boolean.TRUE, deser.supportsUpdate(mapper.getDeserializationConfig()));
    }

    @Test
    public void testIntegration_fullDeserializationFlow() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        AtomicReference<String> stringResult = mapper.readValue(
                "\"testString\"",
                new TypeReference<AtomicReference<String>>() {}
        );
        Assert.assertNotNull(stringResult);
        Assert.assertEquals("testString", stringResult.get());

        AtomicReference<String> nullResult = mapper.readValue(
                "null",
                new TypeReference<AtomicReference<String>>() {}
        );
        Assert.assertNotNull(nullResult);
        Assert.assertNull(nullResult.get());

        AtomicReference<Integer> intResult = mapper.readValue(
                "42",
                new TypeReference<AtomicReference<Integer>>() {}
        );
        Assert.assertNotNull(intResult);
        Assert.assertEquals(Integer.valueOf(42), intResult.get());
    }
}
