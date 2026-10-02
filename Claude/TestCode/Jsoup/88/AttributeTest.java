package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

public class AttributeTest {

    private Attribute attribute;

    @Before
    public void setUp() {
        attribute = new Attribute("class", "foo");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalKeyValue_createsAttribute() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href", attr.getKey());
        assertEquals("index.html", attr.getValue());
    }

    @Test
    public void testConstructor_trimsKey_keyIsTrimmed() {
        Attribute attr = new Attribute("  href  ", "index.html");
        assertEquals("href", attr.getKey());
    }

    @Test
    public void testConstructor_nullValueAllowed_valueIsNull() {
        Attribute attr = new Attribute("disabled", null);
        assertNull(attr.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullKey_throwsException() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_emptyKeyAfterTrim_throwsException() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructor_withParent_parentSet() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        Attribute attr = new Attribute("foo", "bar", attrs);
        assertEquals("foo", attr.getKey());
        assertEquals("bar", attr.getValue());
    }

    // ---------- getKey / setKey ----------

    @Test
    public void testGetKey_returnsCorrectKey() {
        assertEquals("class", attribute.getKey());
    }

    @Test
    public void testSetKey_updatesKey_noParent() {
        attribute.setKey("id");
        assertEquals("id", attribute.getKey());
    }

    @Test
    public void testSetKey_trimsKey() {
        attribute.setKey("  id  ");
        assertEquals("id", attribute.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_nullKey_throwsException() {
        attribute.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_emptyKeyAfterTrim_throwsException() {
        attribute.setKey("   ");
    }

    @Test
    public void testSetKey_withParent_updatesParentKeys() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        List<Attribute> list = attrs.asList();
        Attribute attr = list.get(0);
        attr.setKey("foo2");
        assertEquals("foo2", attr.getKey());
        assertEquals("bar", attrs.get("foo2"));
    }

    // ---------- getValue / setValue ----------

    @Test
    public void testGetValue_returnsCorrectValue() {
        assertEquals("foo", attribute.getValue());
    }

    @Test
    public void testSetValue_withParent_updatesValueAndReturnsOldValue() {
        Attributes attrs = new Attributes();
        attrs.put("foo", "bar");
        List<Attribute> list = attrs.asList();
        Attribute attr = list.get(0);
        String oldVal = attr.setValue("newVal");
        assertEquals("bar", oldVal);
        assertEquals("newVal", attr.getValue());
        assertEquals("newVal", attrs.get("foo"));
    }

    @Test(expected = NullPointerException.class)
    public void testSetValue_noParent_throwsNullPointerException() {
        Attribute attr = new Attribute("foo", "bar");
        attr.setValue("newVal");
    }

    // ---------- html() ----------

    @Test
    public void testHtml_normalAttribute_returnsFormattedHtml() {
        Attribute attr = new Attribute("class", "foo");
        String html = attr.html();
        assertEquals("class=\"foo\"", html);
    }

    @Test
    public void testHtml_booleanAttributeWithSameValue_collapses() {
        Attribute attr = new Attribute("hidden", "hidden");
        String html = attr.html();
        assertEquals("hidden", html);
    }

    @Test
    public void testHtml_booleanAttributeWithEmptyValue_collapses() {
        Attribute attr = new Attribute("hidden", "");
        String html = attr.html();
        assertEquals("hidden", html);
    }

    @Test
    public void testHtml_booleanAttributeWithDifferentValue_doesNotCollapse() {
        Attribute attr = new Attribute("hidden", "something");
        String html = attr.html();
        assertEquals("hidden=\"something\"", html);
    }

    @Test
    public void testHtmlStatic_normalKeyValue_appendsCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Attribute.html("class", "foo", sb, out);
        assertEquals("class=\"foo\"", sb.toString());
    }

    @Test
    public void testHtmlStatic_xmlSyntax_doesNotCollapseBoolean() throws IOException {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        Attribute.html("hidden", "hidden", sb, out);
        assertEquals("hidden=\"hidden\"", sb.toString());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_returnsSameAsHtml() {
        Attribute attr = new Attribute("class", "foo");
        assertEquals(attr.html(), attr.toString());
    }

    // ---------- createFromEncoded ----------

    @Test
    public void testCreateFromEncoded_unescapesValue() {
        Attribute attr = Attribute.createFromEncoded("href", "&amp;");
        assertEquals("href", attr.getKey());
        assertEquals("&", attr.getValue());
    }

    @Test
    public void testCreateFromEncoded_normalValue_noChange() {
        Attribute attr = Attribute.createFromEncoded("title", "hello");
        assertEquals("hello", attr.getValue());
    }

    // ---------- isDataAttribute ----------

    @Test
    public void testIsDataAttribute_instance_dataPrefix_true() {
        Attribute attr = new Attribute("data-foo", "bar");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_instance_noPrefix_false() {
        Attribute attr = new Attribute("foo", "bar");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_static_withPrefix_true() {
        assertTrue(Attribute.isDataAttribute("data-foo"));
    }

    @Test
    public void testIsDataAttribute_static_exactPrefixOnly_false() {
        assertFalse(Attribute.isDataAttribute("data-"));
    }

    @Test
    public void testIsDataAttribute_static_noPrefix_false() {
        assertFalse(Attribute.isDataAttribute("foo"));
    }

    // ---------- shouldCollapseAttribute ----------

    @Test
    public void testShouldCollapseAttribute_instance_htmlSyntaxBooleanSameValue_true() {
        Attribute attr = new Attribute("hidden", "hidden");
        Document.OutputSettings out = new Document.OutputSettings();
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testShouldCollapseAttribute_static_xmlSyntax_false() {
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(Attribute.shouldCollapseAttribute("hidden", "hidden", out));
    }

    @Test
    public void testShouldCollapseAttribute_static_htmlSyntaxNullValue_true() {
        Document.OutputSettings out = new Document.OutputSettings();
        assertTrue(Attribute.shouldCollapseAttribute("hidden", null, out));
    }

    @Test
    public void testShouldCollapseAttribute_static_nonBooleanAttribute_false() {
        Document.OutputSettings out = new Document.OutputSettings();
        assertFalse(Attribute.shouldCollapseAttribute("class", "", out));
    }

    // ---------- isBooleanAttribute ----------

    @Test
    public void testIsBooleanAttribute_instance_knownBoolean_true() {
        Attribute attr = new Attribute("hidden", "hidden");
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_instance_nullValue_true() {
        Attribute attr = new Attribute("foo", null);
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_instance_notBoolean_false() {
        Attribute attr = new Attribute("class", "foo");
        assertFalse(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_static_knownBoolean_true() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
    }

    @Test
    public void testIsBooleanAttribute_static_notBoolean_false() {
        assertFalse(Attribute.isBooleanAttribute("class"));
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_true() {
        assertTrue(attribute.equals(attribute));
    }

    @Test
    public void testEquals_sameKeyValue_true() {
        Attribute other = new Attribute("class", "foo");
        assertTrue(attribute.equals(other));
    }

    @Test
    public void testEquals_differentKey_false() {
        Attribute other = new Attribute("id", "foo");
        assertFalse(attribute.equals(other));
    }

    @Test
    public void testEquals_differentValue_false() {
        Attribute other = new Attribute("class", "bar");
        assertFalse(attribute.equals(other));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(attribute.equals(null));
    }

    @Test
    public void testEquals_differentClass_false() {
        assertFalse(attribute.equals("class=\"foo\""));
    }

    @Test
    public void testEquals_bothNullValues_true() {
        Attribute a1 = new Attribute("foo", null);
        Attribute a2 = new Attribute("foo", null);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void testEquals_oneNullValue_false() {
        Attribute a1 = new Attribute("foo", null);
        Attribute a2 = new Attribute("foo", "bar");
        assertFalse(a1.equals(a2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        Attribute other = new Attribute("class", "foo");
        assertEquals(attribute.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_nullValue_doesNotThrow() {
        Attribute attr = new Attribute("foo", null);
        int hash = attr.hashCode();
        assertTrue(hash == hash);
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsEqualButDistinctObject() {
        Attribute cloned = attribute.clone();
        assertNotSame(attribute, cloned);
        assertEquals(attribute, cloned);
        assertEquals(attribute.getKey(), cloned.getKey());
        assertEquals(attribute.getValue(), cloned.getValue());
    }
}
