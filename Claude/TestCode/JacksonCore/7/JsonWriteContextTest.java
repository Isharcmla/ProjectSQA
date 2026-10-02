import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.StringWriter;
import java.io.IOException;

public class JsonWriteContextTest {

    private JsonWriteContext rootContext;

    @Before
    public void setUp() {
        rootContext = JsonWriteContext.createRootContext(null);
    }

    // -----------------------------------------------------------------
    // createRootContext() - deprecated
    // -----------------------------------------------------------------

    @SuppressWarnings("deprecation")
    @Test
    public void testCreateRootContext_deprecatedNoArg_returnsValidRootContext() {
        JsonWriteContext ctx = JsonWriteContext.createRootContext();
        assertNotNull(ctx);
        assertTrue(ctx.inRoot());
        assertNull(ctx.getParent());
        assertNull(ctx.getCurrentName());
        assertNull(ctx.getDupDetector());
    }

    @Test
    public void testCreateRootContext_withNullDupDetector_returnsValidRootContext() {
        JsonWriteContext ctx = JsonWriteContext.createRootContext(null);
        assertNotNull(ctx);
        assertTrue(ctx.inRoot());
        assertNull(ctx.getParent());
        assertNull(ctx.getDupDetector());
    }

    // -----------------------------------------------------------------
    // createChildArrayContext()
    // -----------------------------------------------------------------

    @Test
    public void testCreateChildArrayContext_fromRoot_returnsArrayContextWithCorrectParent() {
        JsonWriteContext arr = rootContext.createChildArrayContext();
        assertNotNull(arr);
        assertTrue(arr.inArray());
        assertSame(rootContext, arr.getParent());
        assertNull(arr.getDupDetector());
    }

    @Test
    public void testCreateChildArrayContext_calledTwice_reusesSameChildInstance() {
        JsonWriteContext arr1 = rootContext.createChildArrayContext();
        arr1.writeValue();
        arr1.writeValue();

        JsonWriteContext arr2 = rootContext.createChildArrayContext();

        assertSame(arr1, arr2);
        // reset() should have restored the initial index state
        assertEquals(0, arr2.getEntryCount());
    }

    // -----------------------------------------------------------------
    // createChildObjectContext()
    // -----------------------------------------------------------------

    @Test
    public void testCreateChildObjectContext_fromRoot_returnsObjectContextWithCorrectParent() {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        assertNotNull(obj);
        assertTrue(obj.inObject());
        assertSame(rootContext, obj.getParent());
        assertNull(obj.getDupDetector());
    }

    @Test
    public void testCreateChildObjectContext_calledTwice_reusesSameChildInstance() {
        JsonWriteContext obj1 = rootContext.createChildObjectContext();
        obj1.writeFieldName("someField");
        obj1.writeValue();

        JsonWriteContext obj2 = rootContext.createChildObjectContext();

        assertSame(obj1, obj2);
        assertNull(obj2.getCurrentName());
        assertEquals(0, obj2.getEntryCount());
    }

    @Test
    public void testCreateChildArrayContext_withDupDetector_childHasNonNullDupDetector() throws IOException {
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        DupDetector dd = DupDetector.rootDetector(gen);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        JsonWriteContext arr = root.createChildArrayContext();
        assertNotNull(arr.getDupDetector());
    }

    @Test
    public void testCreateChildObjectContext_withDupDetector_childHasNonNullDupDetector() throws IOException {
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        DupDetector dd = DupDetector.rootDetector(gen);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);

        JsonWriteContext obj = root.createChildObjectContext();
        assertNotNull(obj.getDupDetector());
    }

    // -----------------------------------------------------------------
    // getParent() / getCurrentName()
    // -----------------------------------------------------------------

    @Test
    public void testGetParent_forRootContext_returnsNull() {
        assertNull(rootContext.getParent());
    }

    @Test
    public void testGetParent_forChildContext_returnsRoot() {
        JsonWriteContext child = rootContext.createChildObjectContext();
        assertSame(rootContext, child.getParent());
    }

    @Test
    public void testGetCurrentName_initialState_returnsNull() {
        assertNull(rootContext.getCurrentName());
    }

    @Test
    public void testGetCurrentName_afterWriteFieldName_returnsSetName() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        obj.writeFieldName("myField");
        assertEquals("myField", obj.getCurrentName());
        assertTrue(obj.hasCurrentName());
    }

    // -----------------------------------------------------------------
    // withDupDetector() / getDupDetector()
    // -----------------------------------------------------------------

    @Test
    public void testGetDupDetector_initialWithNull_returnsNull() {
        assertNull(rootContext.getDupDetector());
    }

    @Test
    public void testWithDupDetector_setAndReset_updatesDupDetector() throws IOException {
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        DupDetector dd = DupDetector.rootDetector(gen);

        JsonWriteContext returned = rootContext.withDupDetector(dd);
        assertSame(rootContext, returned);
        assertSame(dd, rootContext.getDupDetector());

        JsonWriteContext returned2 = rootContext.withDupDetector(null);
        assertSame(rootContext, returned2);
        assertNull(rootContext.getDupDetector());
    }

    // -----------------------------------------------------------------
    // getCurrentValue() / setCurrentValue()
    // -----------------------------------------------------------------

    @Test
    public void testGetCurrentValue_initialState_returnsNull() {
        assertNull(rootContext.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue_thenGetCurrentValue_returnsSetValue() {
        rootContext.setCurrentValue("hello");
        assertEquals("hello", rootContext.getCurrentValue());
    }

    @Test
    public void testSetCurrentValue_withNull_returnsNull() {
        rootContext.setCurrentValue("something");
        rootContext.setCurrentValue(null);
        assertNull(rootContext.getCurrentValue());
    }

    // -----------------------------------------------------------------
    // writeFieldName()
    // -----------------------------------------------------------------

    @Test
    public void testWriteFieldName_firstCallInObjectContext_returnsStatusOkAsIs() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        int status = obj.writeFieldName("field1");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertEquals("field1", obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_afterWriteValue_returnsStatusOkAfterComma() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        obj.writeFieldName("field1");
        obj.writeValue();
        int status = obj.writeFieldName("field2");
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
    }

    @Test
    public void testWriteFieldName_calledTwiceWithoutValue_returnsStatusExpectValue() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        obj.writeFieldName("field1");
        int status = obj.writeFieldName("field2");
        assertEquals(JsonWriteContext.STATUS_EXPECT_VALUE, status);
    }

    @Test
    public void testWriteFieldName_withEmptyStringName_setsEmptyName() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        int status = obj.writeFieldName("");
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertEquals("", obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_withNullName_setsNullCurrentNameWithoutThrowing() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        int status = obj.writeFieldName(null);
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        assertNull(obj.getCurrentName());
    }

    @Test
    public void testWriteFieldName_withDupDetectorNoDuplicate_doesNotThrow() throws IOException {
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        DupDetector dd = DupDetector.rootDetector(gen);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext obj = root.createChildObjectContext();

        try {
            int status = obj.writeFieldName("unique");
            assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
        } catch (JsonProcessingException e) {
            fail("Should not have thrown for a non-duplicate field name");
        }
    }

    @Test(expected = JsonProcessingException.class)
    public void testWriteFieldName_duplicateFieldName_throwsJsonProcessingException() throws Exception {
        JsonFactory factory = new JsonFactory();
        JsonGenerator gen = factory.createGenerator(new StringWriter());
        DupDetector dd = DupDetector.rootDetector(gen);
        JsonWriteContext root = JsonWriteContext.createRootContext(dd);
        JsonWriteContext obj = root.createChildObjectContext();

        obj.writeFieldName("dupName");
        obj.writeValue();
        // Second occurrence of the same field name in the same object -> should throw
        obj.writeFieldName("dupName");
    }

    // -----------------------------------------------------------------
    // writeValue()
    // -----------------------------------------------------------------

    @Test
    public void testWriteValue_inObjectContext_returnsStatusOkAfterColonAndIncrementsIndex() {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        int status1 = obj.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, status1);
        assertEquals(1, obj.getEntryCount());

        int status2 = obj.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COLON, status2);
        assertEquals(2, obj.getEntryCount());
    }

    @Test
    public void testWriteValue_inArrayContext_firstCallReturnsStatusOkAsIs() {
        JsonWriteContext arr = rootContext.createChildArrayContext();
        int status = arr.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
    }

    @Test
    public void testWriteValue_inArrayContext_secondCallReturnsStatusOkAfterComma() {
        JsonWriteContext arr = rootContext.createChildArrayContext();
        arr.writeValue();
        int status = arr.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_COMMA, status);
    }

    @Test
    public void testWriteValue_inRootContext_firstCallReturnsStatusOkAsIs() {
        int status = rootContext.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AS_IS, status);
    }

    @Test
    public void testWriteValue_inRootContext_secondCallReturnsStatusOkAfterSpace() {
        rootContext.writeValue();
        int status = rootContext.writeValue();
        assertEquals(JsonWriteContext.STATUS_OK_AFTER_SPACE, status);
    }

    // -----------------------------------------------------------------
    // toString() / appendDesc()
    // -----------------------------------------------------------------

    @Test
    public void testToString_forRootContext_returnsSlash() {
        assertEquals("/", rootContext.toString());
    }

    @Test
    public void testToString_forArrayContextWithNoElements_returnsBracketZero() {
        JsonWriteContext arr = rootContext.createChildArrayContext();
        assertEquals("[0]", arr.toString());
    }

    @Test
    public void testToString_forArrayContextAfterWriteValue_returnsCorrectIndex() {
        JsonWriteContext arr = rootContext.createChildArrayContext();
        arr.writeValue();
        arr.writeValue();
        // index is now 1 (0-based) after two writeValue() calls
        assertEquals("[1]", arr.toString());
    }

    @Test
    public void testToString_forObjectContextWithoutCurrentName_returnsQuestionMark() {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        assertEquals("{?}", obj.toString());
    }

    @Test
    public void testToString_forObjectContextWithCurrentName_returnsNameInQuotes() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        obj.writeFieldName("myKey");
        assertEquals("{\"myKey\"}", obj.toString());
    }

    // -----------------------------------------------------------------
    // Inherited convenience methods sanity checks
    // -----------------------------------------------------------------

    @Test
    public void testInRoot_forRootContext_returnsTrue() {
        assertTrue(rootContext.inRoot());
        assertFalse(rootContext.inArray());
        assertFalse(rootContext.inObject());
    }

    @Test
    public void testInArray_forArrayContext_returnsTrue() {
        JsonWriteContext arr = rootContext.createChildArrayContext();
        assertTrue(arr.inArray());
        assertFalse(arr.inRoot());
        assertFalse(arr.inObject());
    }

    @Test
    public void testInObject_forObjectContext_returnsTrue() {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        assertTrue(obj.inObject());
        assertFalse(obj.inRoot());
        assertFalse(obj.inArray());
    }

    @Test
    public void testHasCurrentName_initiallyFalse_thenTrueAfterFieldName() throws JsonProcessingException {
        JsonWriteContext obj = rootContext.createChildObjectContext();
        assertFalse(obj.hasCurrentName());
        obj.writeFieldName("x");
        assertTrue(obj.hasCurrentName());
    }
}
