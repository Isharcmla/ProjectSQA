package org.apache.commons.lang;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class EntitiesTest {

    @Test
    public void testXmlEntities_escapeAndUnescape_success() {
        Entities xml = Entities.XML;
        assertEquals("&quot;&amp;&apos;&lt;&gt;", xml.escape("\"&\'<>"));
        assertEquals("\"&\'<>", xml.unescape("&quot;&amp;&apos;&lt;&gt;"));
        assertEquals("quot", xml.entityName(34));
        assertEquals(34, xml.entityValue("quot"));
        assertEquals(39, xml.entityValue("apos"));
    }

    @Test
    public void testHtml32Entities_escapeAndUnescape_success() {
        Entities html32 = Entities.HTML32;
        assertEquals("&nbsp;&copy;&reg;", html32.escape("\u00A0\u00A9\u00AE"));
        assertEquals("\u00A0\u00A9\u00AE", html32.unescape("&nbsp;&copy;&reg;"));
        assertEquals("nbsp", html32.entityName(160));
        assertEquals(160, html32.entityValue("nbsp"));
    }

    @Test
    public void testHtml40Entities_escapeAndUnescape_success() {
        Entities html40 = Entities.HTML40;
        assertEquals("&euro;&Alpha;&radic;", html40.escape("\u20AC\u0391\u221A"));
        assertEquals("\u20AC\u0391\u221A", html40.unescape("&euro;&Alpha;&radic;"));
        assertEquals("euro", html40.entityName(8364));
        assertEquals(8364, html40.entityValue("euro"));
    }

    @Test
    public void testFillWithHtml40Entities_customInstance_populatesProperly() {
        Entities custom = new Entities();
        Entities.fillWithHtml40Entities(custom);
        assertEquals("quot", custom.entityName(34));
        assertEquals("copy", custom.entityName(169));
        assertEquals("trade", custom.entityName(8482));
    }

    @Test
    public void testAddEntities_customArray_mappedCorrectly() {
        Entities custom = new Entities();
        String[][] data = {{"foo", "1001"}, {"bar", "1002"}};
        custom.addEntities(data);
        assertEquals("foo", custom.entityName(1001));
        assertEquals(1001, custom.entityValue("foo"));
        assertEquals("bar", custom.entityName(1002));
        assertEquals(1002, custom.entityValue("bar"));
    }

    @Test
    public void testAddEntity_singleEntity_mappedCorrectly() {
        Entities entities = new Entities();
        entities.addEntity("custom", 999);
        assertEquals("custom", entities.entityName(999));
        assertEquals(999, entities.entityValue("custom"));
        assertNull(entities.entityName(1234));
        assertEquals(-1, entities.entityValue("nonexistent"));
    }

    @Test
    public void testEscape_normalAsciiString_noChange() {
        Entities entities = Entities.XML;
        String input = "Hello World 123!+-=";
        assertEquals(input, entities.escape(input));
    }

    @Test
    public void testEscape_emptyString_returnsEmptyString() {
        Entities entities = Entities.XML;
        assertEquals("", entities.escape(""));
    }

    @Test
    public void testEscape_unmappedCharactersAbove0x7F_escapedToDecimalEntity() {
        Entities entities = new Entities();
        assertEquals("&#256;&#1000;", entities.escape("\u0100\u03E8"));
    }

    @Test
    public void testEscape_writerThrowsIOException_throwsUnhandledException() {
        Entities entities = Entities.XML;
        Writer failingWriter = new Writer() {
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Simulated write failure");
            }
            public void flush() throws IOException {}
            public void close() throws IOException {}
        };

        try {
            entities.escape(failingWriter, "<test>");
            fail("Expected IOException wrapped in UnhandledException or rethrown");
        } catch (IOException e) {
            assertEquals("Simulated write failure", e.getMessage());
        }
    }

    @Test
    public void testUnescape_noAmpersand_returnsOriginalString() {
        Entities entities = Entities.HTML40;
        String input = "Plain text without ampersands.";
        assertEquals(input, entities.unescape(input));
    }

    @Test
    public void testUnescape_emptyString_returnsEmptyString() {
        Entities entities = Entities.HTML40;
        assertEquals("", entities.unescape(""));
    }

    @Test
    public void testUnescape_writerWithoutAmpersand_writesOriginalString() throws IOException {
        Entities entities = Entities.HTML40;
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "No entities here");
        assertEquals("No entities here", writer.toString());
    }

    @Test
    public void testUnescape_ampersandWithoutSemicolon_keepsAmpersand() {
        Entities entities = Entities.XML;
        String input = "foo & bar &amp";
        assertEquals("foo & bar &amp", entities.unescape(input));
    }

    @Test
    public void testUnescape_consecutiveAmpersandsBeforeSemicolon_keepsFirstAmpersand() {
        Entities entities = Entities.XML;
        String input = "&foo&amp;";
        assertEquals("&foo&", entities.unescape(input));
    }

    @Test
    public void testUnescape_emptyEntityContent_keepsEntityAsIs() {
        Entities entities = Entities.XML;
        assertEquals("&;", entities.unescape("&;"));
    }

    @Test
    public void testUnescape_decimalEntity_unescapesCorrectly() {
        Entities entities = Entities.XML;
        assertEquals("A", entities.unescape("&#65;"));
        assertEquals("Z", entities.unescape("&#90;"));
    }

    @Test
    public void testUnescape_hexLowerEntity_unescapesCorrectly() {
        Entities entities = Entities.XML;
        assertEquals("A", entities.unescape("&#x41;"));
        assertEquals("Z", entities.unescape("&#x5a;"));
    }

    @Test
    public void testUnescape_hexUpperEntity_unescapesCorrectly() {
        Entities entities = Entities.XML;
        assertEquals("A", entities.unescape("&#X41;"));
        assertEquals("Z", entities.unescape("&#X5A;"));
    }

    @Test
    public void testUnescape_invalidHexEntity_keepsOriginal() {
        Entities entities = Entities.XML;
        assertEquals("&#xZZ;", entities.unescape("&#xZZ;"));
    }

    @Test
    public void testUnescape_invalidDecimalEntity_keepsOriginal() {
        Entities entities = Entities.XML;
        assertEquals("&#abc;", entities.unescape("&#abc;"));
    }

    @Test
    public void testUnescape_onlyHashEntity_keepsOriginal() {
        Entities entities = Entities.XML;
        assertEquals("&#;", entities.unescape("&#;"));
    }

    @Test
    public void testUnescape_numericEntityGreaterThan0xFFFF_keepsOriginal() {
        Entities entities = Entities.XML;
        assertEquals("&#70000;", entities.unescape("&#70000;"));
    }

    @Test
    public void testUnescape_unknownNamedEntity_keepsOriginal() {
        Entities entities = Entities.XML;
        assertEquals("&nonexistent;", entities.unescape("&nonexistent;"));
    }

    @Test
    public void testPrimitiveEntityMap_addAndLookup() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("alpha", 1);
        map.add("beta", 2);

        assertEquals("alpha", map.name(1));
        assertEquals("beta", map.name(2));
        assertNull(map.name(3));

        assertEquals(1, map.value("alpha"));
        assertEquals(2, map.value("beta"));
        assertEquals(-1, map.value("gamma"));
    }

    @Test
    public void testHashEntityMap_addAndLookup() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("h1", 100);

        assertEquals("h1", map.name(100));
        assertNull(map.name(999));
        assertEquals(100, map.value("h1"));
        assertEquals(-1, map.value("h2"));
    }

    @Test
    public void testTreeEntityMap_addAndLookup() {
        Entities.TreeEntityMap map = new Entities.TreeEntityMap();
        map.add("t1", 200);

        assertEquals("t1", map.name(200));
        assertNull(map.name(999));
        assertEquals(200, map.value("t1"));
        assertEquals(-1, map.value("t2"));
    }

    @Test
    public void testLookupEntityMap_belowAndAbove256() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("low", 50);
        map.add("high", 300);

        assertEquals("low", map.name(50));
        assertNull(map.name(51));
        assertEquals("high", map.name(300));
        assertNull(map.name(301));

        assertEquals(50, map.value("low"));
        assertEquals(300, map.value("high"));
        assertEquals(-1, map.value("unknown"));
    }

    @Test
    public void testArrayEntityMap_addGrowAndLookup() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(2);
        map.add("e1", 1);
        map.add("e2", 2);
        map.add("e3", 3); // triggers ensureCapacity

        assertEquals("e1", map.name(1));
        assertEquals("e2", map.name(2));
        assertEquals("e3", map.name(3));
        assertNull(map.name(4));

        assertEquals(1, map.value("e1"));
        assertEquals(2, map.value("e2"));
        assertEquals(3, map.value("e3"));
        assertEquals(-1, map.value("e4"));

        Entities.ArrayEntityMap defaultMap = new Entities.ArrayEntityMap();
        defaultMap.add("d1", 10);
        assertEquals("d1", defaultMap.name(10));
    }

    @Test
    public void testBinaryEntityMap_addGrowDuplicateAndLookup() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap(2);
        map.add("b20", 20);
        map.add("b10", 10);
        map.add("b30", 30); // triggers ensureCapacity
        map.add("b20_duplicate", 20); // duplicate key found at index > 0

        assertEquals("b10", map.name(10));
        assertEquals("b20", map.name(20));
        assertEquals("b30", map.name(30));
        assertNull(map.name(5));
        assertNull(map.name(25));
        assertNull(map.name(40));

        assertEquals(10, map.value("b10"));
        assertEquals(-1, map.value("notfound"));

        Entities.BinaryEntityMap defaultMap = new Entities.BinaryEntityMap();
        defaultMap.add("first", 1);
        assertEquals("first", defaultMap.name(1));
    }

    @Test
    public void testEntitiesWithDifferentMapImplementations() {
        Entities eHash = new Entities();
        eHash.map = new Entities.HashEntityMap();
        eHash.addEntity("hash", 10);
        assertEquals("&hash;", eHash.escape("\n"));
        assertEquals("\n", eHash.unescape("&hash;"));

        Entities eTree = new Entities();
        eTree.map = new Entities.TreeEntityMap();
        eTree.addEntity("tree", 10);
        assertEquals("&tree;", eTree.escape("\n"));
        assertEquals("\n", eTree.unescape("&tree;"));

        Entities eArray = new Entities();
        eArray.map = new Entities.ArrayEntityMap();
        eArray.addEntity("array", 10);
        assertEquals("&array;", eArray.escape("\n"));
        assertEquals("\n", eArray.unescape("&array;"));

        Entities eBinary = new Entities();
        eBinary.map = new Entities.BinaryEntityMap();
        eBinary.addEntity("binary", 10);
        assertEquals("&binary;", eBinary.escape("\n"));
        assertEquals("\n", eBinary.unescape("&binary;"));
    }
}
