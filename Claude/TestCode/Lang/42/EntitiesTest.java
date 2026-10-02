package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class EntitiesTest {

    // ---------------------------------------------------------------------
    // addEntity / entityValue / entityName - normal cases
    // ---------------------------------------------------------------------

    @Test
    public void testAddEntityAndEntityValue_normalInput_returnsCorrectValue() {
        Entities entities = new Entities();
        entities.addEntity("foo", 0xA1);
        assertEquals(0xA1, entities.entityValue("foo"));
    }

    @Test
    public void testAddEntityAndEntityName_normalInput_returnsCorrectName() {
        Entities entities = new Entities();
        entities.addEntity("foo", 0xA1);
        assertEquals("foo", entities.entityName(0xA1));
    }

    @Test
    public void testEntityValue_nameNotFound_returnsMinusOne() {
        Entities entities = new Entities();
        assertEquals(-1, entities.entityValue("doesNotExist"));
    }

    @Test
    public void testEntityValue_nullName_returnsMinusOne() {
        Entities entities = new Entities();
        assertEquals(-1, entities.entityValue(null));
    }

    @Test
    public void testEntityName_valueNotFound_returnsNull() {
        Entities entities = new Entities();
        assertNull(entities.entityName(50));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEntityName_negativeValue_throwsException() {
        Entities entities = new Entities();
        entities.entityName(-1);
    }

    // ---------------------------------------------------------------------
    // addEntities
    // ---------------------------------------------------------------------

    @Test
    public void testAddEntities_arrayOfEntities_addsAllEntities() {
        Entities entities = new Entities();
        String[][] array = {{"one", "1"}, {"two", "2"}};
        entities.addEntities(array);
        assertEquals(1, entities.entityValue("one"));
        assertEquals(2, entities.entityValue("two"));
    }

    // ---------------------------------------------------------------------
    // Static instances
    // ---------------------------------------------------------------------

    @Test
    public void testStaticXmlInstance_notNull_andHasExpectedEntities() {
        assertNotNull(Entities.XML);
        assertEquals(34, Entities.XML.entityValue("quot"));
        assertEquals(38, Entities.XML.entityValue("amp"));
        assertEquals(60, Entities.XML.entityValue("lt"));
        assertEquals(62, Entities.XML.entityValue("gt"));
        assertEquals(39, Entities.XML.entityValue("apos"));
    }

    @Test
    public void testStaticHtml32Instance_notNull_andHasExpectedEntities() {
        assertNotNull(Entities.HTML32);
        assertEquals(160, Entities.HTML32.entityValue("nbsp"));
        assertEquals(34, Entities.HTML32.entityValue("quot"));
    }

    @Test
    public void testStaticHtml40Instance_notNull_andHasExpectedEntities() {
        assertNotNull(Entities.HTML40);
        assertEquals(8364, Entities.HTML40.entityValue("euro"));
        assertEquals(160, Entities.HTML40.entityValue("nbsp"));
        assertEquals(34, Entities.HTML40.entityValue("quot"));
    }

    @Test
    public void testFillWithHtml40Entities_fillsNewInstanceCorrectly() {
        Entities entities = new Entities();
        Entities.fillWithHtml40Entities(entities);
        assertEquals(8364, entities.entityValue("euro"));
        assertEquals(160, entities.entityValue("nbsp"));
        assertEquals(34, entities.entityValue("quot"));
    }

    // ---------------------------------------------------------------------
    // escape(String)
    // ---------------------------------------------------------------------

    @Test
    public void testEscapeString_basicEntities_returnsEscapedString() {
        assertEquals("&lt;", Entities.XML.escape("<"));
        assertEquals("&amp;", Entities.XML.escape("&"));
        assertEquals("&gt;", Entities.XML.escape(">"));
        assertEquals("&quot;", Entities.XML.escape("\""));
        assertEquals("&apos;", Entities.XML.escape("'"));
    }

    @Test
    public void testEscapeString_asciiCharWithoutEntity_returnsSameChar() {
        assertEquals("A", Entities.XML.escape("A"));
    }

    @Test
    public void testEscapeString_nonAsciiCharWithoutEntity_returnsNumericReference() {
        String input = String.valueOf((char) 0x100);
        assertEquals("&#256;", Entities.XML.escape(input));
    }

    @Test
    public void testEscapeString_nonAsciiCharWithEntity_returnsNamedEntity() {
        String input = String.valueOf((char) 160);
        assertEquals("&nbsp;", Entities.HTML40.escape(input));
    }

    @Test
    public void testEscapeString_emptyString_returnsEmptyString() {
        assertEquals("", Entities.XML.escape(""));
    }

    @Test(expected = NullPointerException.class)
    public void testEscapeString_nullString_throwsNullPointerException() {
        Entities.XML.escape(null);
    }

    // ---------------------------------------------------------------------
    // escape(Writer, String)
    // ---------------------------------------------------------------------

    @Test
    public void testEscapeWriter_basicEntities_writesEscapedString() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.escape(writer, "<a>&");
        assertEquals("&lt;a&gt;&amp;", writer.toString());
    }

    @Test
    public void testEscapeWriter_emptyString_writesNothing() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.escape(writer, "");
        assertEquals("", writer.toString());
    }

    // ---------------------------------------------------------------------
    // unescape(String)
    // ---------------------------------------------------------------------

    @Test
    public void testUnescapeString_noAmpersand_returnsSameString() {
        String input = "no entities here";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeString_namedEntity_returnsUnescapedString() {
        assertEquals("<", Entities.XML.unescape("&lt;"));
        assertEquals("&", Entities.XML.unescape("&amp;"));
        assertEquals("'", Entities.XML.unescape("&apos;"));
    }

    @Test
    public void testUnescapeString_decimalNumericEntity_returnsCharacter() {
        assertEquals("A", Entities.XML.unescape("&#65;"));
    }

    @Test
    public void testUnescapeString_hexNumericEntityLowercase_returnsCharacter() {
        assertEquals("a", Entities.XML.unescape("&#x61;"));
    }

    @Test
    public void testUnescapeString_hexNumericEntityUppercase_returnsCharacter() {
        assertEquals("A", Entities.XML.unescape("&#X41;"));
    }

    @Test
    public void testUnescapeString_unknownEntityName_keepsOriginal() {
        String input = "&unknownEntity;";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeString_noSemicolon_keepsOriginal() {
        String input = "&amp";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeString_ampersandBeforeSemicolon_keepsOriginal() {
        Entities entities = new Entities();
        String input = "&amp&times;";
        assertEquals(input, entities.unescape(input));
    }

    @Test
    public void testUnescapeString_numericValueTooLarge_keepsOriginal() {
        String input = "&#1114112;";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeString_numericValueInvalidFormat_keepsOriginal() {
        String input = "&#xZZ;";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeString_emptyEntityContent_keepsOriginal() {
        String input = "&;";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test
    public void testUnescapeString_hashOnlyNoDigits_keepsOriginal() {
        String input = "&#;";
        assertEquals(input, Entities.XML.unescape(input));
    }

    @Test(expected = NullPointerException.class)
    public void testUnescapeString_nullString_throwsNullPointerException() {
        Entities.XML.unescape(null);
    }

    // ---------------------------------------------------------------------
    // unescape(Writer, String)
    // ---------------------------------------------------------------------

    @Test
    public void testUnescapeWriter_noAmpersand_writesStringDirectly() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.unescape(writer, "no entities");
        assertEquals("no entities", writer.toString());
    }

    @Test
    public void testUnescapeWriter_withAmpersand_unescapesCorrectly() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.XML.unescape(writer, "a &lt; b");
        assertEquals("a < b", writer.toString());
    }

    @Test
    public void testUnescapeWriter_html40EuroEntity_unescapesCorrectly() throws IOException {
        StringWriter writer = new StringWriter();
        Entities.HTML40.unescape(writer, "&euro;");
        assertEquals(String.valueOf((char) 8364), writer.toString());
    }

    // ---------------------------------------------------------------------
    // Nested EntityMap implementations - additional coverage
    // ---------------------------------------------------------------------

    @Test
    public void testHashEntityMap_addNameValue_worksCorrectly() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("foo", 100);
        assertEquals(100, map.value("foo"));
        assertEquals("foo", map.name(100));
        assertEquals(-1, map.value("missing"));
        assertNull(map.name(999));
    }

    @Test
    public void testTreeEntityMap_addNameValue_worksCorrectly() {
        Entities.TreeEntityMap map = new Entities.TreeEntityMap();
        map.add("bar", 200);
        assertEquals(200, map.value("bar"));
        assertEquals("bar", map.name(200));
        assertEquals(-1, map.value("missing"));
        assertNull(map.name(999));
    }

    @Test
    public void testPrimitiveEntityMap_addNameValue_worksCorrectly() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("baz", 300);
        assertEquals(300, map.value("baz"));
        assertEquals("baz", map.name(300));
        assertEquals(-1, map.value("missing"));
        assertNull(map.name(999));
    }

    @Test
    public void testArrayEntityMap_addNameValue_worksCorrectly() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap();
        map.add("qux", 400);
        assertEquals(400, map.value("qux"));
        assertEquals("qux", map.name(400));
        assertEquals(-1, map.value("missing"));
        assertNull(map.name(999));
    }

    @Test
    public void testArrayEntityMap_growBeyondInitialCapacity_growsCorrectly() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(2);
        for (int i = 0; i < 10; i++) {
            map.add("name" + i, i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, map.value("name" + i));
            assertEquals("name" + i, map.name(i));
        }
    }

    @Test
    public void testBinaryEntityMap_addNameValue_worksCorrectly() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("a", 10);
        map.add("b", 5);
        map.add("c", 20);
        assertEquals("a", map.name(10));
        assertEquals("b", map.name(5));
        assertEquals("c", map.name(20));
        assertNull(map.name(999));
    }

    @Test
    public void testBinaryEntityMap_addDuplicateValue_ignoresSecondAdd() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("first", 1);
        map.add("second", 1);
        // Since value already exists, the second add should be ignored
        assertEquals("first", map.name(1));
    }

    @Test
    public void testBinaryEntityMap_growBeyondInitialCapacity_growsCorrectly() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap(2);
        for (int i = 0; i < 10; i++) {
            map.add("name" + i, i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals("name" + i, map.name(i));
        }
    }

    @Test
    public void testLookupEntityMap_valueBelowTableSize_usesLookupTable() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("small", 50);
        assertEquals("small", map.name(50));
    }

    @Test
    public void testLookupEntityMap_valueAboveTableSize_usesSuperLookup() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("big", 1000);
        assertEquals("big", map.name(1000));
    }

    @Test
    public void testLookupEntityMap_valueBelowTableSizeNotFound_returnsNull() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        assertNull(map.name(10));
    }
}
