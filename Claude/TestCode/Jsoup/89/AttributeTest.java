package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AttributeTest {

    private Attribute attribute;

    @Before
    public void setUp() {
        attribute = new Attribute("key", "value");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withValidKeyValue_createsAttribute() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href", attr.getKey());
        assertEquals("index.html", attr.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withNullKey_throwsException() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withEmptyKey_throwsException() {
        new Attribute("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withWhitespaceOnlyKey_trimsToEmptyAndThrows() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructor_withLeadingTrailingWhitespaceKey_trimsKey() {
        Attribute attr = new Attribute("  key  ", "value");
        assertEquals("key", attr.getKey());
    }

    @Test
    public void testConstructor_threeArgsWithNullParent_createsAttribute() {
        Attribute attr = new Attribute("key", "value", null);
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    // ---------- getKey / setKey tests ----------

    @Test
    public void testGetKey_returnsCorrectKey() {
        assertEquals("key", attribute.getKey());
    }

    @Test
    public void testSetKey_updatesKeySuccessfully() {
        attribute.setKey("newKey");
        assertEquals("newKey", attribute.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_withNullKey_throwsException() {
        attribute.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_withEmptyKey_throwsException() {
        attribute.setKey("");
    }

    @Test
    public void testSetKey_trimsWhitespace() {
        attribute.setKey("  trimmedKey  ");
        assertEquals("trimmedKey", attribute.getKey());
    }

    // ---------- getValue / setValue tests ----------

    @Test
    public void testGetValue_returnsCorrectValue() {
        assertEquals("value", attribute.getValue());
    }

    @Test
    public void testGetValue_withNullValue_returnsEmptyString() {
        Attribute attr = new Attribute("key", null);
        assertEquals("", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testSetValue_withNullParent_throwsNullPointerException() {
        attribute.setValue("newValue");
    }

    // ---------- html / toString tests ----------

    @Test
    public void testHtml_withNormalAttribute_returnsCorrectHtml() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href=\"index.html\"", attr.html());
    }

    @Test
    public void testHtml_withBooleanAttributeEmptyValue_collapsesAttribute() {
        Attribute attr = new Attribute("hidden", "");
        assertEquals("hidden", attr.html());
    }

    @Test
    public void testHtml_withBooleanAttributeNullValue_collapsesAttribute() {
        Attribute attr = new Attribute("checked", null);
        assertEquals("checked", attr.html());
    }

    @Test
    public void testHtml_withNonBooleanAttributeNullValue_doesNotCollapse() {
        Attribute attr = new Attribute("href", null);
        String html = attr.html();
        assertEquals("href=\"\"", html);
    }

    @Test
    public void testToString_returnsSameAsHtml() {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals(attr.html(), attr.toString());
    }

    // ---------- createFromEncoded tests ----------

    @Test
    public void testCreateFromEncoded_decodesValue() {
        Attribute attr = Attribute.createFromEncoded("href", "a&amp;b");
        assertEquals("href", attr.getKey());
        assertEquals("a&b", attr.getValue());
    }

    @Test
    public void testCreateFromEncoded_withPlainValue_returnsSameValue() {
        Attribute attr = Attribute.createFromEncoded("key", "plainValue");
        assertEquals("plainValue", attr.getValue());
    }

    // ---------- isDataAttribute tests ----------

    @Test
    public void testIsDataAttribute_withDataPrefix_returnsTrue() {
        Attribute attr = new Attribute("data-foo", "bar");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_withoutDataPrefix_returnsFalse() {
        Attribute attr = new Attribute("foo", "bar");
        assertFalse(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttributeStatic_withDataPrefix_returnsTrue() {
        assertTrue(Attribute.isDataAttribute("data-foo"));
    }

    @Test
    public void testIsDataAttributeStatic_withoutDataPrefix_returnsFalse() {
        assertFalse(Attribute.isDataAttribute("foo"));
    }

    @Test
    public void testIsDataAttributeStatic_withOnlyPrefixNoSuffix_returnsFalse() {
        assertFalse(Attribute.isDataAttribute("data-"));
    }

    // ---------- shouldCollapseAttribute tests ----------

    @Test
    public void testShouldCollapseAttribute_htmlSyntaxBooleanEmptyValue_returnsTrue() {
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("hidden", "", settings));
    }

    @Test
    public void testShouldCollapseAttribute_htmlSyntaxBooleanSameAsKey_returnsTrue() {
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        assertTrue(Attribute.shouldCollapseAttribute("hidden", "hidden", settings));
    }

    @Test
    public void testShouldCollapseAttribute_htmlSyntaxNonBooleanAttribute_returnsFalse() {
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        assertFalse(Attribute.shouldCollapseAttribute("href", "index.html", settings));
    }

    @Test
    public void testShouldCollapseAttribute_xmlSyntax_returnsFalse() {
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);
        assertFalse(Attribute.shouldCollapseAttribute("hidden", "", settings));
    }

    @Test
    public void testShouldCollapseAttribute_instanceMethod_booleanEmptyValue_returnsTrue() {
        Attribute attr = new Attribute("hidden", "");
        Document.OutputSettings settings = new Document("").outputSettings();
        settings.syntax(Document.OutputSettings.Syntax.html);
        assertTrue(attr.shouldCollapseAttribute(settings));
    }

    // ---------- isBooleanAttribute tests ----------

    @Test
    public void testIsBooleanAttributeInstance_withKnownBooleanKey_returnsTrue() {
        Attribute attr = new Attribute("disabled", "x");
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeInstance_withNullValue_returnsTrue() {
        Attribute attr = new Attribute("foo", null);
        assertTrue(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeInstance_withUnknownKeyAndValue_returnsFalse() {
        Attribute attr = new Attribute("foo", "bar");
        assertFalse(attr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttributeStatic_withKnownKey_returnsTrue() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
    }

    @Test
    public void testIsBooleanAttributeStatic_withUnknownKey_returnsFalse() {
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    // ---------- equals / hashCode tests ----------

    @Test
    public void testEquals_sameKeyAndValue_returnsTrue() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertTrue(attr1.equals(attr2));
    }

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
    public void testHashCode_equalAttributes_sameHashCode() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCode_withNullValue_computesHashCode() {
        Attribute attr = new Attribute("key", null);
        int hash = attr.hashCode();
        assertEquals(attr.hashCode(), hash);
    }

    // ---------- clone tests ----------

    @Test
    public void testClone_createsEqualButDistinctCopy() {
        Attribute original = new Attribute("key", "value");
        Attribute copy = original.clone();
        assertEquals(original, copy);
        assertNotSame(original, copy);
    }
}
