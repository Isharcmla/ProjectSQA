package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AttributeTest {

    @Test
    public void testConstructor_normalKeyAndValue_createsInstance() {
        Attribute attr = new Attribute("href", "https://example.com");
        assertEquals("href", attr.getKey());
        assertEquals("https://example.com", attr.getValue());
    }

    @Test
    public void testConstructor_withSurroundingWhitespace_trimsKey() {
        Attribute attr = new Attribute("  class  ", "btn");
        assertEquals("class", attr.getKey());
        assertEquals("btn", attr.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullKey_throwsIllegalArgumentException() {
        new Attribute(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_emptyKey_throwsIllegalArgumentException() {
        new Attribute("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_whitespaceOnlyKey_throwsIllegalArgumentException() {
        new Attribute("   ", "value");
    }

    @Test
    public void testConstructor_nullValue_storesNull() {
        Attribute attr = new Attribute("disabled", null);
        assertEquals("disabled", attr.getKey());
        assertEquals("", attr.getValue()); // Attributes.checkNotNull returns "" for null
    }

    @Test
    public void testSetKey_validKey_updatesKey() {
        Attribute attr = new Attribute("src", "image.png");
        attr.setKey("data-src");
        assertEquals("data-src", attr.getKey());
    }

    @Test
    public void testSetKey_withWhitespace_trimsAndUpdatesKey() {
        Attribute attr = new Attribute("src", "image.png");
        attr.setKey("  data-src  ");
        assertEquals("data-src", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_nullKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("src", "image.png");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_emptyKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("src", "image.png");
        attr.setKey("");
    }

    @Test
    public void testSetKey_withParent_updatesParentKey() {
        Attributes parent = new Attributes();
        parent.put("oldKey", "val");
        Attribute attr = new Attribute("oldKey", "val", parent);

        attr.setKey("newKey");

        assertEquals("newKey", attr.getKey());
        assertTrue(parent.hasKey("newKey"));
        assertFalse(parent.hasKey("oldKey"));
    }

    @Test
    public void testSetKey_withParentKeyNotFound_doesNotUpdateParentKeys() {
        Attributes parent = new Attributes();
        parent.put("otherKey", "val");
        Attribute attr = new Attribute("notInParent", "val", parent);

        attr.setKey("newKey");

        assertEquals("newKey", attr.getKey());
        assertFalse(parent.hasKey("newKey"));
    }

    @Test
    public void testGetValue_nullValue_returnsEmptyString() {
        Attribute attr = new Attribute("checked", null);
        assertEquals("", attr.getValue());
    }

    @Test
    public void testSetValue_withParent_updatesParentAndReturnsOldVal() {
        Attributes parent = new Attributes();
        parent.put("key", "oldValue");
        Attribute attr = new Attribute("key", "oldValue", parent);

        String oldVal = attr.setValue("newValue");

        assertEquals("oldValue", oldVal);
        assertEquals("newValue", attr.getValue());
        assertEquals("newValue", parent.get("key"));
    }

    @Test
    public void testSetValue_withParentKeyNotFound_updatesLocalValue() {
        Attributes parent = new Attributes();
        parent.put("otherKey", "value");
        Attribute attr = new Attribute("key", "oldValue", parent);

        String oldVal = attr.setValue("newValue");

        assertEquals("", oldVal); // parent.get("key") returns ""
        assertEquals("newValue", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testSetValue_withoutParent_throwsNullPointerException() {
        Attribute attr = new Attribute("key", "val");
        attr.setValue("newVal");
    }

    @Test
    public void testHtml_simpleAttribute_returnsFormattedHtml() {
        Attribute attr = new Attribute("class", "container");
        assertEquals("class=\"container\"", attr.html());
    }

    @Test
    public void testHtml_escapesSpecialCharactersInValue() {
        Attribute attr = new Attribute("data-text", "<Hello & \"World\">");
        assertEquals("data-text=\"&lt;Hello &amp; &quot;World&quot;&gt;\"", attr.html());
    }

    @Test
    public void testHtml_booleanAttribute_htmlSyntax_collapsedWhenEmptyOrSameName() {
        Attribute attrEmpty = new Attribute("checked", "");
        assertEquals("checked", attrEmpty.html());

        Attribute attrSameName = new Attribute("checked", "checked");
        assertEquals("checked", attrSameName.html());

        Attribute attrNull = new Attribute("checked", null);
        assertEquals("checked", attrNull.html());
    }

    @Test
    public void testHtml_booleanAttribute_htmlSyntax_notCollapsedWhenDifferentValue() {
        Attribute attr = new Attribute("checked", "other");
        assertEquals("checked=\"other\"", attr.html());
    }

    @Test
    public void testHtml_customAppendableAndOutputSettings() throws IOException {
        Attribute attr = new Attribute("disabled", "");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.syntax(Document.OutputSettings.Syntax.xml);

        attr.html(sb, settings);
        assertEquals("disabled=\"\"", sb.toString());
    }

    @Test
    public void testHtml_staticMethod_outputsExpectedHtml() throws IOException {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        Attribute.html("href", "index.html", sb, settings);
        assertEquals("href=\"index.html\"", sb.toString());
    }

    @Test
    public void testToString_returnsHtml() {
        Attribute attr = new Attribute("type", "text");
        assertEquals("type=\"text\"", attr.toString());
    }

    @Test
    public void testCreateFromEncoded_unescapesHtmlEntities() {
        Attribute attr = Attribute.createFromEncoded("title", "One &amp; Two &quot;Three&quot;");
        assertEquals("title", attr.getKey());
        assertEquals("One & Two \"Three\"", attr.getValue());
    }

    @Test
    public void testIsDataAttribute_instanceMethod() {
        Attribute dataAttr = new Attribute("data-user-id", "123");
        Attribute notDataAttr = new Attribute("datatype", "text");
        Attribute prefixOnly = new Attribute("data-", "empty");

        assertTrue(dataAttr.isDataAttribute());
        assertFalse(notDataAttr.isDataAttribute());
        assertFalse(prefixOnly.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_staticMethod() {
        assertTrue(Attribute.isDataAttribute("data-name"));
        assertFalse(Attribute.isDataAttribute("data-"));
        assertFalse(Attribute.isDataAttribute("data"));
        assertFalse(Attribute.isDataAttribute("class"));
    }

    @Test
    public void testShouldCollapseAttribute_instanceMethod() {
        Document.OutputSettings htmlSettings = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.html);
        Document.OutputSettings xmlSettings = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.xml);

        Attribute booleanAttr = new Attribute("required", "");
        Attribute normalAttr = new Attribute("id", "");

        assertTrue(booleanAttr.shouldCollapseAttribute(htmlSettings));
        assertFalse(booleanAttr.shouldCollapseAttribute(xmlSettings));
        assertFalse(normalAttr.shouldCollapseAttribute(htmlSettings));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod() {
        Document.OutputSettings htmlSettings = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.html);
        Document.OutputSettings xmlSettings = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.xml);

        assertTrue(Attribute.shouldCollapseAttribute("allowfullscreen", null, htmlSettings));
        assertTrue(Attribute.shouldCollapseAttribute("allowfullscreen", "", htmlSettings));
        assertTrue(Attribute.shouldCollapseAttribute("allowfullscreen", "allowfullscreen", htmlSettings));
        assertTrue(Attribute.shouldCollapseAttribute("allowfullscreen", "ALLOWFULLSCREEN", htmlSettings));

        assertFalse(Attribute.shouldCollapseAttribute("allowfullscreen", "true", htmlSettings));
        assertFalse(Attribute.shouldCollapseAttribute("allowfullscreen", "", xmlSettings));
        assertFalse(Attribute.shouldCollapseAttribute("custom", "", htmlSettings));
        assertFalse(Attribute.shouldCollapseAttribute("custom", "custom", htmlSettings));
    }

    @Test
    public void testIsBooleanAttribute_instanceMethod() {
        Attribute boolAttr = new Attribute("async", "true");
        Attribute nonBoolAttr = new Attribute("custom", "true");
        Attribute nullValAttr = new Attribute("custom", null);

        assertTrue(boolAttr.isBooleanAttribute());
        assertFalse(nonBoolAttr.isBooleanAttribute());
        assertTrue(nullValAttr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_staticMethod() {
        assertTrue(Attribute.isBooleanAttribute("async"));
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("readonly"));
        assertTrue(Attribute.isBooleanAttribute("required"));
        assertTrue(Attribute.isBooleanAttribute("typemustmatch"));

        assertFalse(Attribute.isBooleanAttribute("class"));
        assertFalse(Attribute.isBooleanAttribute("href"));
        assertFalse(Attribute.isBooleanAttribute(""));
    }

    @Test
    public void testEqualsAndHashCode_contract() {
        Attribute attr1 = new Attribute("id", "main");
        Attribute attr2 = new Attribute("id", "main");
        Attribute attrDifferentKey = new Attribute("class", "main");
        Attribute attrDifferentVal = new Attribute("id", "footer");
        Attribute attrNullVal1 = new Attribute("disabled", null);
        Attribute attrNullVal2 = new Attribute("disabled", null);

        // Reflexive
        assertTrue(attr1.equals(attr1));
        assertEquals(attr1.hashCode(), attr1.hashCode());

        // Symmetric & Equal
        assertTrue(attr1.equals(attr2));
        assertTrue(attr2.equals(attr1));
        assertEquals(attr1.hashCode(), attr2.hashCode());

        // Null value equality
        assertTrue(attrNullVal1.equals(attrNullVal2));
        assertEquals(attrNullVal1.hashCode(), attrNullVal2.hashCode());

        // Different values
        assertFalse(attr1.equals(attrDifferentKey));
        assertFalse(attr1.equals(attrDifferentVal));
        assertFalse(attr1.equals(attrNullVal1));
        assertFalse(attrNullVal1.equals(attr1));

        // Incompatible types and null
        assertFalse(attr1.equals(null));
        assertFalse(attr1.equals("string-object"));
    }

    @Test
    public void testClone_createsIdenticalAndIndependentCopy() {
        Attribute original = new Attribute("title", "tooltip");
        Attribute clone = original.clone();

        assertNotSame(original, clone);
        assertEquals(original, clone);
        assertEquals(original.getKey(), clone.getKey());
        assertEquals(original.getValue(), clone.getValue());

        clone.setKey("alt");
        assertNotEquals(original.getKey(), clone.getKey());
    }
}
