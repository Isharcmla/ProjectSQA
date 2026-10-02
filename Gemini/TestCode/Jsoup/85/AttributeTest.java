package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class AttributeTest {

    @Test
    public void testConstructor_validKeyAndValue_createsAttribute() {
        Attribute attr = new Attribute("href", "http://example.com");
        assertEquals("href", attr.getKey());
        assertEquals("http://example.com", attr.getValue());
    }

    @Test
    public void testConstructor_keyWithWhitespace_trimsKey() {
        Attribute attr = new Attribute("  class  ", "btn btn-primary");
        assertEquals("class", attr.getKey());
        assertEquals("btn btn-primary", attr.getValue());
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
    public void testSetKey_validKeyWithoutParent_updatesKey() {
        Attribute attr = new Attribute("href", "http://example.com");
        attr.setKey("src");
        assertEquals("src", attr.getKey());
    }

    @Test
    public void testSetKey_keyWithWhitespace_trimsKey() {
        Attribute attr = new Attribute("href", "http://example.com");
        attr.setKey("  data-url  ");
        assertEquals("data-url", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_nullKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("href", "http://example.com");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_emptyKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("href", "http://example.com");
        attr.setKey("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_whitespaceOnlyKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("href", "http://example.com");
        attr.setKey("   ");
    }

    @Test
    public void testSetKey_withParentContainingKey_updatesParentKey() {
        Attributes parent = new Attributes();
        parent.put("oldKey", "testVal");
        Attribute attr = parent.asList().get(0);
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
        assertTrue(parent.hasKey("newKey"));
        assertFalse(parent.hasKey("oldKey"));
    }

    @Test
    public void testSetKey_withParentNotContainingKey_updatesOnlyAttributeKey() {
        Attributes parent = new Attributes();
        Attribute attr = new Attribute("keyNotInParent", "value", parent);
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
        assertFalse(parent.hasKey("newKey"));
    }

    @Test
    public void testGetValue_returnsValue() {
        Attribute attr = new Attribute("title", "tooltip");
        assertEquals("tooltip", attr.getValue());
    }

    @Test
    public void testSetValue_withParent_updatesValueAndReturnsOldValue() {
        Attributes parent = new Attributes();
        parent.put("k", "old");
        Attribute attr = parent.asList().get(0);

        String oldVal = attr.setValue("new");
        assertEquals("old", oldVal);
        assertEquals("new", attr.getValue());
        assertEquals("new", parent.get("k"));
    }

    @Test
    public void testSetValue_withParentKeyNotInParent_updatesValueAndReturnsEmpty() {
        Attributes parent = new Attributes();
        Attribute attr = new Attribute("k", "old", parent);
        String oldVal = attr.setValue("new");
        assertEquals("", oldVal);
        assertEquals("new", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testSetValue_withoutParent_throwsNullPointerException() {
        Attribute attr = new Attribute("k", "old");
        attr.setValue("new");
    }

    @Test
    public void testHtml_standardAttribute_rendersCorrectly() {
        Attribute attr = new Attribute("href", "http://example.com?a=1&b=2");
        assertEquals("href=\"http://example.com?a=1&amp;b=2\"", attr.html());
        assertEquals("href=\"http://example.com?a=1&amp;b=2\"", attr.toString());
    }

    @Test
    public void testHtml_booleanAttributeHtmlMode_collapsesAttribute() {
        Attribute attr = new Attribute("disabled", "");
        assertEquals("disabled", attr.html());

        Attribute attrSameNameVal = new Attribute("required", "required");
        assertEquals("required", attrSameNameVal.html());

        Attribute attrSameNameValCase = new Attribute("checked", "CHECKED");
        assertEquals("checked", attrSameNameValCase.html());
    }

    @Test
    public void testHtml_booleanAttributeDifferentValue_doesNotCollapse() {
        Attribute attr = new Attribute("checked", "false");
        assertEquals("checked=\"false\"", attr.html());
    }

    @Test
    public void testHtml_xmlMode_doesNotCollapseBooleanAttribute() throws IOException {
        Attribute attr = new Attribute("disabled", "disabled");
        Document.OutputSettings out = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.xml);
        StringBuilder sb = new StringBuilder();
        attr.html(sb, out);
        assertEquals("disabled=\"disabled\"", sb.toString());
    }

    @Test
    public void testHtml_withAppendableAndOutputSettings() throws IOException {
        Attribute attr = new Attribute("class", "my-class");
        Document.OutputSettings out = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        attr.html(sb, out);
        assertEquals("class=\"my-class\"", sb.toString());
    }

    @Test
    public void testStaticHtml_rendersCorrectly() throws IOException {
        Document.OutputSettings out = new Document.OutputSettings();
        StringBuilder sb = new StringBuilder();
        Attribute.html("id", "main", sb, out);
        assertEquals("id=\"main\"", sb.toString());
    }

    @Test(expected = SerializationException.class)
    public void testHtml_ioExceptionThrown_wrapsInSerializationException() {
        Attribute attr = new Attribute("k", "v") {
            @Override
            protected void html(Appendable accum, Document.OutputSettings out) throws IOException {
                throw new IOException("Simulated IO failure");
            }
        };
        attr.html();
    }

    @Test
    public void testCreateFromEncoded_unescapesHtmlEntities() {
        Attribute attr = Attribute.createFromEncoded("title", "Tom &amp; Jerry &quot;Show&quot;");
        assertEquals("title", attr.getKey());
        assertEquals("Tom & Jerry \"Show\"", attr.getValue());
    }

    @Test
    public void testIsDataAttribute_instanceMethod() {
        Attribute validDataAttr = new Attribute("data-name", "value");
        assertTrue(validDataAttr.isDataAttribute());

        Attribute emptyDataKeyAttr = new Attribute("data-", "value");
        assertFalse(emptyDataKeyAttr.isDataAttribute());

        Attribute nonDataAttr = new Attribute("class", "value");
        assertFalse(nonDataAttr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_staticMethod() {
        assertTrue(Attribute.isDataAttribute("data-user-id"));
        assertFalse(Attribute.isDataAttribute("data-"));
        assertFalse(Attribute.isDataAttribute("data"));
        assertFalse(Attribute.isDataAttribute("custom-data"));
    }

    @Test
    public void testShouldCollapseAttribute_instanceMethod() {
        Attribute collapsible = new Attribute("checked", "checked");
        Document.OutputSettings htmlOut = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.html);
        assertTrue(collapsible.shouldCollapseAttribute(htmlOut));

        Attribute nonCollapsible = new Attribute("href", "http://example.com");
        assertFalse(nonCollapsible.shouldCollapseAttribute(htmlOut));
    }

    @Test
    public void testShouldCollapseAttribute_staticMethod() {
        Document.OutputSettings htmlOut = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.html);
        Document.OutputSettings xmlOut = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.xml);

        assertTrue(Attribute.shouldCollapseAttribute("readonly", "", htmlOut));
        assertTrue(Attribute.shouldCollapseAttribute("readonly", "readonly", htmlOut));
        assertTrue(Attribute.shouldCollapseAttribute("readonly", "READONLY", htmlOut));
        assertTrue(Attribute.shouldCollapseAttribute("readonly", null, htmlOut));
        assertTrue(Attribute.shouldCollapseAttribute("custom", null, htmlOut));

        assertFalse(Attribute.shouldCollapseAttribute("readonly", "readonly", xmlOut));
        assertFalse(Attribute.shouldCollapseAttribute("custom", "", htmlOut));
        assertFalse(Attribute.shouldCollapseAttribute("readonly", "false", htmlOut));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testIsBooleanAttribute_instanceMethod() {
        Attribute booleanAttr = new Attribute("checked", "true");
        assertTrue(booleanAttr.isBooleanAttribute());

        Attribute nullValAttr = new Attribute("custom", null);
        assertTrue(nullValAttr.isBooleanAttribute());

        Attribute nonBooleanAttr = new Attribute("href", "http://example.com");
        assertFalse(nonBooleanAttr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_staticMethod() {
        assertTrue(Attribute.isBooleanAttribute("allowfullscreen"));
        assertTrue(Attribute.isBooleanAttribute("async"));
        assertTrue(Attribute.isBooleanAttribute("autofocus"));
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("disabled"));
        assertTrue(Attribute.isBooleanAttribute("hidden"));
        assertTrue(Attribute.isBooleanAttribute("multiple"));
        assertTrue(Attribute.isBooleanAttribute("open"));
        assertTrue(Attribute.isBooleanAttribute("readonly"));
        assertTrue(Attribute.isBooleanAttribute("required"));
        assertTrue(Attribute.isBooleanAttribute("selected"));

        assertFalse(Attribute.isBooleanAttribute("href"));
        assertFalse(Attribute.isBooleanAttribute("class"));
        assertFalse(Attribute.isBooleanAttribute("style"));
        assertFalse(Attribute.isBooleanAttribute("unknown"));
    }

    @Test
    public void testEqualsAndHashCode() {
        Attribute attr1 = new Attribute("key", "val");
        Attribute attr2 = new Attribute("key", "val");
        Attribute attr3 = new Attribute("differentKey", "val");
        Attribute attr4 = new Attribute("key", "differentVal");
        Attribute attr5 = new Attribute("key", null);
        Attribute attr6 = new Attribute("key", null);

        // Reflexive
        assertTrue(attr1.equals(attr1));
        assertEquals(attr1.hashCode(), attr1.hashCode());

        // Symmetric
        assertTrue(attr1.equals(attr2));
        assertTrue(attr2.equals(attr1));
        assertEquals(attr1.hashCode(), attr2.hashCode());

        // Different values
        assertFalse(attr1.equals(attr3));
        assertFalse(attr1.equals(attr4));
        assertFalse(attr1.equals(attr5));
        assertFalse(attr5.equals(attr1));

        // Both null values
        assertTrue(attr5.equals(attr6));
        assertEquals(attr5.hashCode(), attr6.hashCode());

        // Null and other types
        assertFalse(attr1.equals(null));
        assertFalse(attr1.equals("not an attribute"));
    }

    @Test
    public void testClone() {
        Attribute original = new Attribute("key", "value");
        Attribute cloned = original.clone();

        assertNotSame(original, cloned);
        assertEquals(original.getKey(), cloned.getKey());
        assertEquals(original.getValue(), cloned.getValue());
        assertEquals(original, cloned);

        cloned.setKey("newKey");
        assertEquals("key", original.getKey());
        assertEquals("newKey", cloned.getKey());
    }
}
