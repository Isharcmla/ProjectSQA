package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AttributeTest {

    @Test
    public void testConstructor_validKeyAndValue_success() {
        Attribute attr = new Attribute("href", "https://example.com");
        assertEquals("href", attr.getKey());
        assertEquals("https://example.com", attr.getValue());
    }

    @Test
    public void testConstructor_keyWithWhitespace_trimmed() {
        Attribute attr = new Attribute("  class  ", "container");
        assertEquals("class", attr.getKey());
        assertEquals("container", attr.getValue());
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
    public void testConstructor_withParent_success() {
        Attributes parent = new Attributes();
        parent.put("title", "original");
        Attribute attr = new Attribute("title", "original", parent);
        assertEquals("title", attr.getKey());
        assertEquals("original", attr.getValue());
    }

    @Test
    public void testSetKey_validKey_updatesKey() {
        Attribute attr = new Attribute("name", "test");
        attr.setKey("id");
        assertEquals("id", attr.getKey());
    }

    @Test
    public void testSetKey_keyWithWhitespace_trimmed() {
        Attribute attr = new Attribute("name", "test");
        attr.setKey("  newKey  ");
        assertEquals("newKey", attr.getKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_nullKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("name", "test");
        attr.setKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_emptyKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("name", "test");
        attr.setKey("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_whitespaceOnlyKey_throwsIllegalArgumentException() {
        Attribute attr = new Attribute("name", "test");
        attr.setKey("   ");
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
    public void testSetKey_withParentKeyNotFound_doesNotThrow() {
        Attributes parent = new Attributes();
        Attribute attr = new Attribute("notInParent", "val", parent);
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testGetValue_returnsValue() {
        Attribute attr = new Attribute("checked", "true");
        assertEquals("true", attr.getValue());
    }

    @Test
    public void testSetValue_withParent_updatesParentAndReturnsOldValue() {
        Attributes parent = new Attributes();
        parent.put("attrKey", "initial");
        Attribute attr = new Attribute("attrKey", "initial", parent);
        String oldVal = attr.setValue("updated");
        assertEquals("initial", oldVal);
        assertEquals("updated", attr.getValue());
        assertEquals("updated", parent.get("attrKey"));
    }

    @Test
    public void testSetValue_withParentKeyNotFound_updatesValue() {
        Attributes parent = new Attributes();
        Attribute attr = new Attribute("ghost", "initial", parent);
        attr.setValue("updated");
        assertEquals("updated", attr.getValue());
    }

    @Test(expected = NullPointerException.class)
    public void testSetValue_withoutParent_throwsNullPointerException() {
        Attribute attr = new Attribute("key", "val");
        attr.setValue("newVal");
    }

    @Test
    public void testHtml_standardAttribute_formatsCorrectly() {
        Attribute attr = new Attribute("href", "http://jsoup.org");
        assertEquals("href=\"http://jsoup.org\"", attr.html());
    }

    @Test
    public void testHtml_withSpecialCharacters_escapesProperly() {
        Attribute attr = new Attribute("title", "Hello & \"World\"");
        assertEquals("title=\"Hello &amp; &quot;World&quot;\"", attr.html());
    }

    @Test
    public void testHtml_booleanAttributeHtmlSyntax_collapses() {
        Attribute attr = new Attribute("disabled", "");
        assertEquals("disabled", attr.html());

        Attribute attrSame = new Attribute("disabled", "disabled");
        assertEquals("disabled", attrSame.html());

        Attribute attrNull = new Attribute("disabled", null);
        assertEquals("disabled", attrNull.html());
    }

    @Test
    public void testHtml_booleanAttributeXmlSyntax_doesNotCollapse() {
        Attribute attr = new Attribute("disabled", "disabled");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);

        StringBuilder sb = new StringBuilder();
        try {
            attr.html(sb, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertEquals("disabled=\"disabled\"", sb.toString());
    }

    @Test
    public void testHtml_staticMethod_appendsCorrectly() throws IOException {
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Attribute.html("class", "main", sb, out);
        assertEquals("class=\"main\"", sb.toString());
    }

    @Test(expected = IOException.class)
    public void testHtml_throwingAppendable_throwsIOException() throws IOException {
        Attribute attr = new Attribute("key", "value");
        Appendable throwingAppendable = new Appendable() {
            @Override
            public Appendable append(CharSequence csq) throws IOException {
                throw new IOException("Simulated append error");
            }

            @Override
            public Appendable append(CharSequence csq, int start, int end) throws IOException {
                throw new IOException("Simulated append error");
            }

            @Override
            public Appendable append(char c) throws IOException {
                throw new IOException("Simulated append error");
            }
        };
        attr.html(throwingAppendable, new Document("").outputSettings());
    }

    @Test
    public void testToString_returnsHtml() {
        Attribute attr = new Attribute("id", "main");
        assertEquals(attr.html(), attr.toString());
    }

    @Test
    public void testCreateFromEncoded_escapedValue_unescapesCorrectly() {
        Attribute attr = Attribute.createFromEncoded("title", "Hello &amp; &quot;World&quot;");
        assertEquals("title", attr.getKey());
        assertEquals("Hello & \"World\"", attr.getValue());
    }

    @Test
    public void testIsDataAttribute_instanceMethod() {
        Attribute dataAttr = new Attribute("data-id", "123");
        assertTrue(dataAttr.isDataAttribute());

        Attribute nonDataAttr = new Attribute("class", "my-class");
        assertFalse(nonDataAttr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_staticMethod() {
        assertTrue(Attribute.isDataAttribute("data-custom"));
        assertFalse(Attribute.isDataAttribute("data-"));
        assertFalse(Attribute.isDataAttribute("data"));
        assertFalse(Attribute.isDataAttribute("custom-data"));
    }

    @Test
    public void testShouldCollapseAttribute_variousConditions() {
        Document.OutputSettings htmlOut = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.html);
        Document.OutputSettings xmlOut = new Document.OutputSettings().syntax(Document.OutputSettings.Syntax.xml);

        Attribute boolEmpty = new Attribute("required", "");
        assertTrue(boolEmpty.shouldCollapseAttribute(htmlOut));
        assertFalse(boolEmpty.shouldCollapseAttribute(xmlOut));

        Attribute boolMatching = new Attribute("required", "required");
        assertTrue(boolMatching.shouldCollapseAttribute(htmlOut));

        Attribute boolCaseInsensitive = new Attribute("required", "REQUIRED");
        assertTrue(boolCaseInsensitive.shouldCollapseAttribute(htmlOut));

        Attribute boolNull = new Attribute("required", null);
        assertTrue(boolNull.shouldCollapseAttribute(htmlOut));

        Attribute boolDifferentValue = new Attribute("required", "something-else");
        assertFalse(boolDifferentValue.shouldCollapseAttribute(htmlOut));

        Attribute nonBoolEmpty = new Attribute("class", "");
        assertFalse(nonBoolEmpty.shouldCollapseAttribute(htmlOut));

        Attribute nonBoolNull = new Attribute("class", null);
        assertTrue(nonBoolNull.shouldCollapseAttribute(htmlOut));
    }

    @Test
    public void testIsBooleanAttribute_instanceMethod() {
        Attribute boolAttr = new Attribute("checked", "checked");
        assertTrue(boolAttr.isBooleanAttribute());

        Attribute nullValAttr = new Attribute("custom", null);
        assertTrue(nullValAttr.isBooleanAttribute());

        Attribute nonBoolAttr = new Attribute("href", "https://jsoup.org");
        assertFalse(nonBoolAttr.isBooleanAttribute());
    }

    @Test
    public void testIsBooleanAttribute_staticMethod() {
        assertTrue(Attribute.isBooleanAttribute("async"));
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertTrue(Attribute.isBooleanAttribute("typemustmatch"));
        assertFalse(Attribute.isBooleanAttribute("nonexistent"));
        assertFalse(Attribute.isBooleanAttribute(""));
    }

    @Test
    public void testEqualsAndHashCode_standard() {
        Attribute attr1 = new Attribute("key", "val");
        Attribute attr2 = new Attribute("key", "val");
        Attribute attr3 = new Attribute("key", "other");
        Attribute attr4 = new Attribute("otherKey", "val");
        Attribute attrNullVal1 = new Attribute("key", null);
        Attribute attrNullVal2 = new Attribute("key", null);

        // Reflexive
        assertEquals(attr1, attr1);

        // Symmetric
        assertEquals(attr1, attr2);
        assertEquals(attr2, attr1);
        assertEquals(attr1.hashCode(), attr2.hashCode());

        // Null value equality
        assertEquals(attrNullVal1, attrNullVal2);
        assertEquals(attrNullVal1.hashCode(), attrNullVal2.hashCode());

        // Inequity
        assertNotEquals(attr1, attr3);
        assertNotEquals(attr1, attr4);
        assertNotEquals(attr1, attrNullVal1);
        assertNotEquals(attrNullVal1, attr1);
        assertNotEquals(attr1, null);
        assertNotEquals(attr1, "different type");
    }

    @Test
    public void testClone_createsIndependentCopy() {
        Attribute original = new Attribute("key", "value");
        Attribute cloned = original.clone();

        assertNotNull(cloned);
        assertEquals(original, cloned);
        assertNotEquals(System.identityHashCode(original), System.identityHashCode(cloned));

        cloned.setKey("newKey");
        assertNotEquals(original.getKey(), cloned.getKey());
    }
}
