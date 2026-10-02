package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsonWriteContextTest {

    @Test
    @SuppressWarnings("deprecation")
    public void testCreateRootContext_deprecatedNoArg_createsValidRootContext() {
        JsonWriteContext root = JsonWriteContext.createRootContext();
        assertNotNull(root);
        assertTrue(root.inRoot());
        assertNull(root.getParent());
        assertNull(root.getDupDetector());
        assertEquals(-1, root.getEntryCount());
        assertEquals(0, root.getCurrentIndex());
        assertNull(root.getCurrentName());
        assertNull(root.getCurrentValue());
    }

    @Test
    public void testCreateRootContext_withNullDupDetector_createsValidRootContext() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertNotNull(root);
        assertTrue(root.inRoot());
        assertNull(root.getParent());
        assertNull(root.getDupDetector());
    }

    @Test
    public void testCreateRootContext_withDupDetector_retainsDupDetector() {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        assertNotNull(root);
        assertSame(dd, root.getDupDetector());
    }

    @Test
    public void testWithDupDetector_setsNewDupDetector() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertNull(root.getDupDetector());
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext updated = root.withDupDetector(dd);
        assertSame(root, updated);
        assertSame(dd, root.getDupDetector());
    }

    @Test
    public void testGetAndSetCurrentValue_normalAndNull() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertNull(root.getCurrentValue());

        Object val = "Sample Value";
        root.setCurrentValue(val);
        assertSame(val, root.getCurrentValue());

        root.setCurrentValue(null);
        assertNull(root.getCurrentValue());

        Integer intVal = 123;
        root.setCurrentValue(intVal);
        assertEquals(intVal, root.getCurrentValue());
    }

    @Test
    public void testWriteValue_rootContext_returnsCorrectStatusTransitions() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);

        int status1 = root.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        assertEquals(0, root.getCurrentIndex());

        int status2 = root.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status2);
        assertEquals(1, root.getCurrentIndex());

        int status3 = root.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status3);
        assertEquals(2, root.getCurrentIndex());
    }

    @Test
    public void testCreateChildArrayContext_withoutDupDetector_andReuse() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);

        JsonWriteContext childArray1 = root.createChildArrayContext();
        assertNotNull(childArray1);
        assertTrue(childArray1.inArray());
        assertSame(root, childArray1.getParent());
        assertNull(childArray1.getDupDetector());

        int status1 = childArray1.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        int status2 = childArray1.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status2);

        JsonWriteContext childArrayReused = root.createChildArrayContext();
        assertSame(childArray1, childArrayReused);
        assertTrue(childArrayReused.inArray());
        assertEquals(-1, childArrayReused.getEntryCount());
    }

    @Test
    public void testCreateChildArrayContext_withDupDetector() {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        JsonWriteContext childArray = root.createChildArrayContext();
        assertNotNull(childArray);
        assertNotNull(childArray.getDupDetector());
        assertNotSame(dd, childArray.getDupDetector());

        JsonWriteContext childArrayReused = root.createChildArrayContext();
        assertSame(childArray, childArrayReused);
    }

    @Test
    public void testCreateChildObjectContext_withoutDupDetector_andReuse() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);

        JsonWriteContext childObj1 = root.createChildObjectContext();
        assertNotNull(childObj1);
        assertTrue(childObj1.inObject());
        assertSame(root, childObj1.getParent());
        assertNull(childObj1.getDupDetector());

        JsonWriteContext childObjReused = root.createChildObjectContext();
        assertSame(childObj1, childObjReused);
        assertTrue(childObjReused.inObject());
        assertEquals(-1, childObjReused.getEntryCount());
    }

    @Test
    public void testCreateChildObjectContext_withDupDetector() {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        JsonWriteContext childObj = root.createChildObjectContext();
        assertNotNull(childObj);
        assertNotNull(childObj.getDupDetector());
        assertNotSame(dd, childObj.getDupDetector());

        JsonWriteContext childObjReused = root.createChildObjectContext();
        assertSame(childObj, childObjReused);
    }

    @Test
    public void testWriteFieldNameAndValue_inObjectContext_normalFlow() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        int fieldStatus1 = obj.writeFieldName("field1");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, fieldStatus1);
        assertEquals("field1", obj.getCurrentName());

        int valStatus1 = obj.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, valStatus1);
        assertEquals(0, obj.getCurrentIndex());

        int fieldStatus2 = obj.writeFieldName("field2");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, fieldStatus2);
        assertEquals("field2", obj.getCurrentName());

        int valStatus2 = obj.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, valStatus2);
        assertEquals(1, obj.getCurrentIndex());
    }

    @Test
    public void testWriteFieldName_calledTwiceWithoutValue_returnsExpectValue() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        int status1 = obj.writeFieldName("name1");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);

        int status2 = obj.writeFieldName("name2");
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, status2);
    }

    @Test
    public void testWriteFieldName_withEmptyString() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        int status = obj.writeFieldName("");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertEquals("", obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_duplicateDetected_throwsJsonGenerationException() throws JsonProcessingException {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext obj = root.createChildObjectContext();

        int status1 = obj.writeFieldName("dupName");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status1);
        obj.writeValue();

        try {
            obj.writeFieldName("dupName");
            fail("Expected JsonGenerationException for duplicate field name");
        } catch (JsonGenerationException e) {
            assertTrue(e.getMessage().contains("Duplicate field 'dupName'"));
        }
    }

    @Test
    public void testReset_clearsCurrentValuesAndName() throws JsonProcessingException {
        DupDetector dd = DupDetector.rootDetector((JsonGenerator) null);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.setCurrentValue("valueBeforeReset");
        obj.writeFieldName("a");
        obj.writeValue();

        obj.reset(JsonWriteContext.TYPE_OBJECT);
        assertNull(obj.getCurrentValue());
        assertNull(obj.getCurrentName());
        assertEquals(-1, obj.getEntryCount());

        int status = obj.writeFieldName("a");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
    }

    @Test
    public void testToString_rootContext() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        assertEquals("/", root.toString());
    }

    @Test
    public void testToString_arrayContext() {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext array = root.createChildArrayContext();
        assertEquals("[0]", array.toString());

        array.writeValue();
        assertEquals("[0]", array.toString());

        array.writeValue();
        assertEquals("[1]", array.toString());

        array.writeValue();
        assertEquals("[2]", array.toString());
    }

    @Test
    public void testToString_objectContext_withoutAndWithCurrentName() throws JsonProcessingException {
        JsonWriteContext root = JsonWriteContext.createRootContext(null);
        JsonWriteContext obj = root.createChildObjectContext();

        assertEquals("{?}", obj.toString());

        obj.writeFieldName("testProp");
        assertEquals("{\"testProp\"}", obj.toString());

        obj.writeFieldName("");
        assertEquals("{\"testProp\"}", obj.toString());

        obj.writeValue();
        obj.writeFieldName("newProp");
        assertEquals("{\"newProp\"}", obj.toString());
    }
}
