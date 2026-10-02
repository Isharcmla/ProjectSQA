package org.apache.commons.lang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class EntitiesTest {

    private Entities entities;

    @Before
    public void setUp() {
        entities = new Entities();
    }

    @Test
    public void testXmlEntities_predefinedConstants() {
        Assert.assertEquals("quot", Entities.XML.entityName(34));
        Assert.assertEquals("amp", Entities.XML.entityName(38));
        Assert.assertEquals("apos", Entities.XML.entityName(39));
        Assert.assertEquals("lt", Entities.XML.entityName(60));
        Assert.assertEquals("gt", Entities.XML.entityName(62));

        Assert.assertEquals(34, Entities.XML.entityValue("quot"));
        Assert.assertEquals(38, Entities.XML.entityValue("amp"));
        Assert.assertEquals(39, Entities.XML.entityValue("apos"));
        Assert.assertEquals(60, Entities.XML.entityValue("lt"));
        Assert.assertEquals(62, Entities.XML.entityValue("gt"));
    }

    @Test
    public void testHtml32Entities_predefinedConstants() {
        Assert.assertEquals("nbsp", Entities.HTML32.entityName(160));
        Assert.assertEquals(160, Entities.HTML32.entityValue("nbsp"));
        Assert.assertEquals("copy", Entities.HTML32.entityName(169));
        Assert.assertEquals(169, Entities.HTML32.entityValue("copy"));
        Assert.assertEquals(-1, Entities.HTML32.entityValue("euro"));
    }

    @Test
    public void testHtml40Entities_predefinedConstants() {
        Assert.assertEquals("euro", Entities.HTML40.entityName(8364));
        Assert.assertEquals(8364, Entities.HTML40.entityValue("euro"));
        Assert.assertEquals("Alpha", Entities.HTML40.entityName(913));
        Assert.assertEquals(913, Entities.HTML40.entityValue("Alpha"));
    }

    @Test
    public void testFillWithHtml40Entities_customInstance() {
        Entities custom = new Entities();
        Entities.fillWithHtml40Entities(custom);
        Assert.assertEquals("euro", custom.entityName(8364));
        Assert.assertEquals(8364, custom.entityValue("euro"));
        Assert.assertEquals("quot", custom.entityName(34));
        Assert.assertEquals("nbsp", custom.entityName(160));
    }

    @Test
    public void testAddEntity_andAddEntities_normalLookup() {
        entities.addEntity("foo", 1000);
        Assert.assertEquals("foo", entities.entityName(1000));
        Assert.assertEquals(1000, entities.entityValue("foo"));
        Assert.assertEquals(-1, entities.entityValue("bar"));
        Assert.assertNull(entities.entityName(1001));

        String[][] customArray = {
            {"bar", "1001"},
            {"baz", "1002"}
        };
        entities.addEntities(customArray);
        Assert.assertEquals("bar", entities.entityName(1001));
        Assert.assertEquals("baz", entities.entityName(1002));
        Assert.assertEquals(1001, entities.entityValue("bar"));
        Assert.assertEquals(1002, entities.entityValue("baz"));
    }

    @Test
    public void testEscape_stringVariations() {
        entities.addEntity("lt", '<');
        entities.addEntity("gt", '>');

        Assert.assertEquals("", entities.escape(""));
        Assert.assertEquals("abc", entities.escape("abc"));
        Assert.assertEquals("&lt;abc&gt;", entities.escape("<abc>"));
        Assert.assertEquals("&#256;&#1000;", entities.escape("\u0100\u03E8"));
        Assert.assertEquals("&lt;\u0100&gt;", entities.escape("<\u0100>"));
    }

    @Test
    public void testEscape_writerVariations() throws IOException {
        entities.addEntity("lt", '<');
        entities.addEntity("gt", '>');

        StringWriter writer = new StringWriter();
        entities.escape(writer, "");
        Assert.assertEquals("", writer.toString());

        writer = new StringWriter();
        entities.escape(writer, "plain");
        Assert.assertEquals("plain", writer.toString());

        writer = new StringWriter();
        entities.escape(writer, "<foo>");
        Assert.assertEquals("&lt;foo&gt;", writer.toString());

        writer = new StringWriter();
        entities.escape(writer, "\u0100\u03E8");
        Assert.assertEquals("&#256;&#1000;", writer.toString());
    }

    @Test
    public void testUnescape_stringWithoutAmpersand() {
        Assert.assertEquals("plain text", entities.unescape("plain text"));
        Assert.assertEquals("", entities.unescape(""));
    }

    @Test
    public void testUnescape_ampersandVariations() {
        entities.addEntity("lt", '<');
        entities.addEntity("gt", '>');
        entities.addEntity("amp", '&');

        Assert.assertEquals("&", entities.unescape("&"));
        Assert.assertEquals("foo&bar", entities.unescape("foo&bar"));
        Assert.assertEquals("&foo&lt;", entities.unescape("&foo&lt;"));
        Assert.assertEquals("&;", entities.unescape("&;"));
        Assert.assertEquals("&#;", entities.unescape("&#;"));
        Assert.assertEquals("&unknown;", entities.unescape("&unknown;"));

        Assert.assertEquals("<foo>", entities.unescape("&lt;foo&gt;"));
    }

    @Test
    public void testUnescape_numericEntitiesDecimalAndHex() {
        Assert.assertEquals("A", entities.unescape("&#65;"));
        Assert.assertEquals("A", entities.unescape("&#x41;"));
        Assert.assertEquals("A", entities.unescape("&#X41;"));
        Assert.assertEquals("&#xZZ;", entities.unescape("&#xZZ;"));
        Assert.assertEquals("&#XYZ;", entities.unescape("&#XYZ;"));
        Assert.assertEquals("&#;", entities.unescape("&#;"));
    }

    @Test
    public void testUnescape_writerVariations() throws IOException {
        entities.addEntity("lt", '<');
        entities.addEntity("gt", '>');
        entities.addEntity("amp", '&');

        StringWriter writer = new StringWriter();
        entities.unescape(writer, "plain");
        Assert.assertEquals("plain", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "a&b");
        Assert.assertEquals("a&b", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "&;");
        Assert.assertEquals("&;", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "&#;");
        Assert.assertEquals("&#;", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "&foo&lt;");
        Assert.assertEquals("&foo<", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "&lt;&unknown;&gt;");
        Assert.assertEquals("<&unknown;>", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "&#65;&#invalid;");
        Assert.assertEquals("A&#invalid;", writer.toString());

        writer = new StringWriter();
        entities.unescape(writer, "&#x41;");
        Assert.assertEquals("&#x41;", writer.toString());
    }

    @Test
    public void testPrimitiveEntityMap_allMethods() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        Assert.assertEquals(-1, map.value("foo"));
        Assert.assertNull(map.name(100));

        map.add("foo", 100);
        map.add("bar", 200);

        Assert.assertEquals("foo", map.name(100));
        Assert.assertEquals("bar", map.name(200));
        Assert.assertEquals(100, map.value("foo"));
        Assert.assertEquals(200, map.value("bar"));
        Assert.assertEquals(-1, map.value("missing"));
        Assert.assertNull(map.name(999));
    }

    @Test
    public void testHashEntityMap_allMethods() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        Assert.assertEquals(-1, map.value("foo"));
        Assert.assertNull(map.name(100));

        map.add("foo", 100);
        Assert.assertEquals("foo", map.name(100));
        Assert.assertEquals(100, map.value("foo"));
        Assert.assertEquals(-1, map.value("missing"));
        Assert.assertNull(map.name(999));
    }

    @Test
    public void testTreeEntityMap_allMethods() {
        Entities.TreeEntityMap map = new Entities.TreeEntityMap();
        Assert.assertEquals(-1, map.value("foo"));
        Assert.assertNull(map.name(100));

        map.add("foo", 100);
        map.add("bar", 200);
        Assert.assertEquals("foo", map.name(100));
        Assert.assertEquals("bar", map.name(200));
        Assert.assertEquals(100, map.value("foo"));
        Assert.assertEquals(200, map.value("bar"));
        Assert.assertEquals(-1, map.value("missing"));
        Assert.assertNull(map.name(999));
    }

    @Test
    public void testLookupEntityMap_belowAndAbove256() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("low", 10);
        map.add("high", 300);

        Assert.assertEquals("low", map.name(10));
        Assert.assertNull(map.name(11));
        Assert.assertEquals("high", map.name(300));
        Assert.assertNull(map.name(301));
        Assert.assertEquals(10, map.value("low"));
        Assert.assertEquals(300, map.value("high"));
        Assert.assertEquals(-1, map.value("missing"));
    }

    @Test
    public void testArrayEntityMap_constructorsAndGrowth() {
        Entities.ArrayEntityMap mapDefault = new Entities.ArrayEntityMap();
        Assert.assertEquals(-1, mapDefault.value("foo"));
        Assert.assertNull(mapDefault.name(100));

        Entities.ArrayEntityMap mapCustom = new Entities.ArrayEntityMap(2);
        mapCustom.add("one", 1);
        mapCustom.add("two", 2);
        mapCustom.add("three", 3); // triggers ensureCapacity

        Assert.assertEquals("one", mapCustom.name(1));
        Assert.assertEquals("two", mapCustom.name(2));
        Assert.assertEquals("three", mapCustom.name(3));
        Assert.assertNull(mapCustom.name(4));

        Assert.assertEquals(1, mapCustom.value("one"));
        Assert.assertEquals(2, mapCustom.value("two"));
        Assert.assertEquals(3, mapCustom.value("three"));
        Assert.assertEquals(-1, mapCustom.value("four"));
    }

    @Test
    public void testBinaryEntityMap_constructorsAndOperations() {
        Entities.BinaryEntityMap mapDefault = new Entities.BinaryEntityMap();
        Assert.assertNull(mapDefault.name(100));

        Entities.BinaryEntityMap mapCustom = new Entities.BinaryEntityMap(2);
        mapCustom.add("c", 30);
        mapCustom.add("a", 10);
        mapCustom.add("b", 20); // triggers ensureCapacity & binary search insert
        mapCustom.add("duplicate", 20); // duplicate key, should be ignored (insertAt > 0)

        Assert.assertEquals("a", mapCustom.name(10));
        Assert.assertEquals("b", mapCustom.name(20));
        Assert.assertEquals("c", mapCustom.name(30));
        Assert.assertNull(mapCustom.name(5));
        Assert.assertNull(mapCustom.name(15));
        Assert.assertNull(mapCustom.name(40));

        Assert.assertEquals(10, mapCustom.value("a"));
        Assert.assertEquals(20, mapCustom.value("b"));
        Assert.assertEquals(30, mapCustom.value("c"));
        Assert.assertEquals(-1, mapCustom.value("missing"));
    }

    @Test
    public void testEntities_usingDifferentUnderlyingMaps() {
        Entities entTree = new Entities();
        entTree.map = new Entities.TreeEntityMap();
        entTree.addEntity("gt", '>');
        Assert.assertEquals("&gt;", entTree.escape(">"));
        Assert.assertEquals(">", entTree.unescape("&gt;"));

        Entities entHash = new Entities();
        entHash.map = new Entities.HashEntityMap();
        entHash.addEntity("lt", '<');
        Assert.assertEquals("&lt;", entHash.escape("<"));
        Assert.assertEquals("<", entHash.unescape("&lt;"));

        Entities entBinary = new Entities();
        entBinary.map = new Entities.BinaryEntityMap();
        entBinary.addEntity("amp", '&');
        Assert.assertEquals("&amp;", entBinary.escape("&"));
        Assert.assertEquals("&", entBinary.unescape("&amp;"));
    }
}
