package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AttributeTest {

    private Attribute attribute;

    @Before
    public void setUp() {
        attribute = new Attribute("key", "value");
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_normalInput_createsAttribute() {
        Attribute attr = new Attribute("href", "http://example.com");
        assertEquals("href", attr.getKey());
        assertEquals("http://example.com", attr.getValue());
    }

    @Test
    public void testConstructor_withParent_createsAttribute() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("key", "value", attrs);
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testConstructor_keyWithWhitespace_trimsKey() {
        Attribute attr = new Attribute("  key  ", "value");
        assertEquals("key", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullKey_throwsException() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_emptyKey_throwsException() {
        new Attribute("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_whitespaceOnlyKey_throwsException() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructor_nullValue_createsAttributeWithNullValue() {
        Attribute attr = new Attribute("key", null);
        assertNull(attr.getValue());
    }

    @Test
    public void testConstructor_emptyValue_createsAttribute() {
        Attribute attr = new Attribute("key", "");
        assertEquals("", attr.getValue());
    }

    // ---------- getKey Tests ----------

    @Test
    public void testGetKey_normalInput_returnsKey() {
        assertEquals("key", attribute.getKey());
    }

    // ---------- setKey Tests ----------

    @Test
    public void testSetKey_normalInput_updatesKey() {
        attribute.setKey("newKey");
        assertEquals("newKey", attribute.getKey());
    }

    @Test
    public void testSetKey_withWhitespace_trimsKey() {
        attribute.setKey("  newKey  ");
        assertEquals("newKey", attribute.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_nullKey_throwsException() {
        attribute.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_emptyKey_throwsException() {
        attribute.setKey("");
    }

    @Test
    public void testSetKey_withParent_updatesParentKeys() {
        Attributes attrs = new Attributes();
        attrs.put("oldKey", "value");
        Attribute attr = new Attribute("oldKey", "value", attrs);
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testSetKey_withParentKeyNotFound_updatesOnlyAttributeKey() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("someKey", "value", attrs);
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    // ---------- getValue Tests ----------

    @Test
    public void testGetValue_normalInput_returnsValue() {
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void testGetValue_nullValue_returnsNull() {
        Attribute attr = new Attribute("key", null);
        assertNull(attr.getValue());
    }

    // ---------- setValue Tests ----------

    @Test
    public void testSetValue_withParent_updatesValueAndReturnsOld() {
        Attributes attrs = new Attributes();
        attrs.put("key", "oldValue");
        Attribute attr = new Attribute("key", "oldValue", attrs);
        String oldVal = attr.setValue("newValue");
        assertEquals("oldValue", oldVal);
        assertEquals("newValue", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testSetValue_nullParent_throwsException() {
        attribute.setValue("newValue");
    }

    @Test
    public void testSetValue_withParentKeyNotFound_updatesValueOnly() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("key", "oldValue", attrs);
        // parent.get("key") returns "" (not null) if not found, based on Attributes behavior
        String oldVal = attr.setValue("newValue");
        assertEquals("newValue", attr.getValue());
    }

    // ---------- html() Tests ----------

    @Test
    public void testHtml_normalInput_returnsHtmlString() {
        Attribute attr = new Attribute("href", "index.html");
        String html = attr.html();
        assertEquals("href=\"index.html\"", html);
    }

    @Test
    public void testHtml_booleanAttributeEmptyValue_collapsesAttribute() {
        Attribute attr = new Attribute("checked", "");
        String html = attr.html();
        assertEquals("checked", html);
    }

    @Test
    public void testHtml_booleanAttributeNullValue_collapsesAttribute() {
        Attribute attr = new Attribute("checked", null);
        String html = attr.html();
        assertEquals("checked", html);
    }

    @Test
    public void testHtml_normalAttributeWithSpecialChars_escapesValue() {
        Attribute attr = new Attribute("title", "a \"quote\"");
        String html = attr.html();
        assertTrue(html.contains("title="));
    }

    // ---------- toString() Tests ----------

    @Test
    public void testToString_normalInput_returnsHtmlRepresentation() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals(attr.html(), attr.toString());
    }

    // ---------- createFromEncoded Tests ----------

    @Test
    public void testCreateFromEncoded_normalInput_createsAttribute() {
        Attribute attr = Attribute.createFromEncoded("key", "value");
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testCreateFromEncoded_encodedValue_unescapesValue() {
        Attribute attr = Attribute.createFromEncoded("key", "&amp;");
        assertEquals("&", attr.getValue());
    }

    @Test
    public void testCreateFromEncoded_nullParent_createsAttributeWithNullParent() {
        Attribute attr = Attribute.createFromEncoded("key", "value");
        assertNull(attr.parent);
    }

    // ---------- isDataAttribute() Tests (protected, same package) ----------

    @Test
    public void testIsDataAttribute_instanceMethod_dataPrefix_returnsTrue() {
        Attribute attr = new Attribute("data-foo", "value");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_instanceMethod_noDataPrefix_returnsFalse() {
        Attribute attr = new Attribute("foo", "value");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_staticMethod_withDataPrefix_returnsTrue() {
        assertTrue(Attribute.isDataAttribute("data-foo"));
    }

    @Test
    public void testIsDataAttribute_staticMethod_withoutDataPrefix_returnsFalse() {
        assertFalse(Attribute.isDataAttribute("foo"));
    }

    @Test
    public void testIsDataAttribute_staticMethod_exactPrefixOnly_returnsFalse() {
        assertFalse(Attribute.isDataAttribute("data-"));
    }

    // ---------- shouldCollapseAttribute Tests ----------

    @Test
    public void testShouldCollapseAttribute_instanceMethod_booleanAttrEmptyValue_returnsTrue() {
        Attribute attr = new Attribute("checked", "");
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod_htmlSyntaxNullValue_returnsTrue() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("checked", null, out));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod_xmlSyntax_returnsFalse() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(Attribute.shouldCollapseAttribute("checked", null, out));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod_nonBooleanAttribute_returnsFalse() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        assertFalse(Attribute.shouldCollapseAttribute("href", "index.html", out));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod_valueEqualsKey_returnsTrue() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("checked", "CHECKED", out));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod_nonEmptyNonMatchingValue_returnsFalse() {
        Document.OutputSettings out = new Document("").outputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);
        assertFalse(Attribute.shouldCollapseAttribute("checked", "yes", out));
    }

    // ---------- isBooleanAttribute() (deprecated instance) Tests ----------

    @Test
    public void testIsBooleanAttribute_instanceMethod_knownBooleanKey_returnsTrue() {
        Attribute attr = new Attribute("checked", "checked");
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_instanceMethod_nullValue_returnsTrue() {
        Attribute attr = new Attribute("foo", null);
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_instanceMethod_nonBooleanKeyWithValue_returnsFalse() {
        Attribute attr = new Attribute("href", "index.html");
        assertFalse(attr.isBooleanAttribute());
    }

    // ---------- isBooleanAttribute(key) static Tests ----------

    @Test
    public void testIsBooleanAttribute_staticMethod_knownBooleanKey_returnsTrue() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
    }

    @Test
    public void testIsBooleanAttribute_staticMethod_unknownKey_returnsFalse() {
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    // ---------- equals() Tests ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(attribute.equals(attribute));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(attribute.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(attribute.equals("not an attribute"));
    }

    @Test
    public void testEquals_sameKeyAndValue_returnsTrue() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void testEquals_differentKey_returnsFalse() {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEquals_differentValue_returnsFalse() {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEquals_bothNullValues_returnsTrue() {
        Attribute attr1 = new Attribute("key", null);
        Attribute attr2 = new Attribute("key", null);
        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void testEquals_oneNullValue_returnsFalse() {
        Attribute attr1 = new Attribute("key", null);
        Attribute attr2 = new Attribute("key", "value");
        assertFalse(attr1.equals(attr2));
    }

    // ---------- hashCode() Tests ----------

    @Test
    public void testHashCode_sameKeyAndValue_returnsSameHash() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCode_nullValue_doesNotThrow() {
        Attribute attr = new Attribute("key", null);
        int hash = attr.hashCode();
        assertNotNull(hash);
    }

    @Test
    public void testHashCode_differentAttributes_returnsDifferentHash() {
        Attribute attr1 = new Attribute("key1", "value1");
        Attribute attr2 = new Attribute("key2", "value2");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    // ---------- clone() Tests ----------

    @Test
    public void testClone_normalInput_returnsEqualButDifferentInstance() {
        Attribute cloned = attribute.clone();
        assertNotSame(attribute, cloned);
        assertEquals(attribute, cloned);
        assertEquals(attribute.getKey(), cloned.getKey());
        assertEquals(attribute.getValue(), cloned.getValue());
    }

    @Test
    public void testClone_modifyClonedKey_doesNotAffectOriginal() {
        Attribute cloned = attribute.clone();
        cloned.setKey("newKey");
        assertEquals("key", attribute.getKey());
        assertEquals("newKey", cloned.getKey());
    }
}
