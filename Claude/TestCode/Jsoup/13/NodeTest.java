package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;

import java.util.List;

public class NodeTest {

    private Document doc;

    @Before
    public void setUp() {
        doc = Jsoup.parse("<html><head></head><body><div id='1'>One</div><div id='2'>Two</div><div id='3'>Three</div></body></html>");
    }

    private Element newElement(String tag) {
        return new Element(Tag.valueOf(tag), "");
    }

    // ---------- nodeName() ----------
    @Test
    public void testNodeName_element_returnsTagName() {
        Element el = newElement("div");
        assertEquals("div", el.nodeName());
    }

    // ---------- attr(String) ----------
    @Test
    public void testAttr_existingKey_returnsValue() {
        Element el = newElement("div");
        el.attr("class", "test");
        assertEquals("test", el.attr("class"));
    }

    @Test
    public void testAttr_nonExistingKey_returnsEmptyString() {
        Element el = newElement("div");
        assertEquals("", el.attr("nonexistent"));
    }

    @Test
    public void testAttr_absPrefix_returnsAbsoluteUrl() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "foo.html");
        assertEquals("http://example.com/foo.html", el.attr("abs:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        Element el = newElement("div");
        el.attr((String) null);
    }

    // ---------- attributes() ----------
    @Test
    public void testAttributes_returnsAttributesObject() {
        Element el = newElement("div");
        el.attr("id", "abc");
        Attributes attrs = el.attributes();
        assertNotNull(attrs);
        assertTrue(attrs.hasKey("id"));
    }

    // ---------- attr(String, String) ----------
    @Test
    public void testAttrSetter_setsAttribute_returnsThis() {
        Element el = newElement("div");
        Node result = el.attr("data-x", "y");
        assertSame(el, result);
        assertEquals("y", el.attr("data-x"));
    }

    // ---------- hasAttr() ----------
    @Test
    public void testHasAttr_existingKey_returnsTrue() {
        Element el = newElement("div");
        el.attr("id", "abc");
        assertTrue(el.hasAttr("id"));
    }

    @Test
    public void testHasAttr_nonExistingKey_returnsFalse() {
        Element el = newElement("div");
        assertFalse(el.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        Element el = newElement("div");
        el.hasAttr(null);
    }

    // ---------- removeAttr() ----------
    @Test
    public void testRemoveAttr_existingKey_removesAttribute() {
        Element el = newElement("div");
        el.attr("id", "abc");
        el.removeAttr("id");
        assertFalse(el.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        Element el = newElement("div");
        el.removeAttr(null);
    }

    // ---------- baseUri() ----------
    @Test
    public void testBaseUri_returnsBaseUri() {
        Element el = new Element(Tag.valueOf("div"), "http://example.com/");
        assertEquals("http://example.com/", el.baseUri());
    }

    // ---------- setBaseUri() ----------
    @Test
    public void testSetBaseUri_updatesBaseUri() {
        Element el = newElement("div");
        el.setBaseUri("http://newuri.com/");
        assertEquals("http://newuri.com/", el.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_null_throwsException() {
        Element el = newElement("div");
        el.setBaseUri(null);
    }

    // ---------- absUrl() ----------
    @Test
    public void testAbsUrl_relativeUrl_returnsAbsoluteUrl() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/path/");
        el.attr("href", "foo.html");
        assertEquals("http://example.com/path/foo.html", el.absUrl("href"));
    }

    @Test
    public void testAbsUrl_noAttribute_returnsEmptyString() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/");
        assertEquals("", el.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        Element el = newElement("a");
        el.absUrl("");
    }

    @Test
    public void testAbsUrl_malformedBase_absoluteAttr_returnsAttrValue() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.attr("href", "http://jsoup.org");
        String result = el.absUrl("href");
        assertEquals("http://jsoup.org", result);
    }

    @Test
    public void testAbsUrl_malformedBaseAndAttr_returnsEmptyString() {
        Element el = new Element(Tag.valueOf("a"), "");
        el.attr("href", "not a url");
        String result = el.absUrl("href");
        assertEquals("", result);
    }

    @Test
    public void testAbsUrl_queryOnlyRelUrl_resolvesWithBasePath() {
        Element el = new Element(Tag.valueOf("a"), "http://example.com/path/file.html");
        el.attr("href", "?foo=bar");
        String result = el.absUrl("href");
        assertTrue(result.contains("foo=bar"));
    }

    // ---------- childNode() ----------
    @Test
    public void testChildNode_validIndex_returnsChild() {
        Element body = doc.body();
        Node child = body.childNode(0);
        assertNotNull(child);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex_throwsException() {
        Element body = doc.body();
        body.childNode(999);
    }

    // ---------- childNodes() ----------
    @Test
    public void testChildNodes_returnsListOfChildren() {
        Element body = doc.body();
        List<Node> children = body.childNodes();
        assertEquals(3, children.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_unmodifiable_throwsException() {
        Element body = doc.body();
        List<Node> children = body.childNodes();
        children.add(newElement("span"));
    }

    // ---------- parent() ----------
    @Test
    public void testParent_hasParent_returnsParent() {
        Element div = doc.select("div#1").first();
        assertNotNull(div.parent());
        assertEquals("body", div.parent().nodeName());
    }

    @Test
    public void testParent_noParent_returnsNull() {
        Element el = newElement("div");
        assertNull(el.parent());
    }

    // ---------- ownerDocument() ----------
    @Test
    public void testOwnerDocument_returnsDocument() {
        Element div = doc.select("div#1").first();
        assertSame(doc, div.ownerDocument());
    }

    @Test
    public void testOwnerDocument_noDocument_returnsNull() {
        Element el = newElement("div");
        assertNull(el.ownerDocument());
    }

    @Test
    public void testOwnerDocument_isDocumentItself_returnsSelf() {
        assertSame(doc, doc.ownerDocument());
    }

    // ---------- remove() ----------
    @Test
    public void testRemove_removesNodeFromParent() {
        Element div = doc.select("div#1").first();
        div.remove();
        assertEquals(2, doc.body().childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throwsException() {
        Element el = newElement("div");
        el.remove();
    }

    // ---------- before(String) ----------
    @Test
    public void testBeforeString_insertsHtmlBefore() {
        Element div2 = doc.select("div#2").first();
        div2.before("<div id='new'>New</div>");
        Element inserted = doc.select("div#new").first();
        assertNotNull(inserted);
        assertEquals(inserted.nextSibling(), div2);
    }

    // ---------- before(Node) ----------
    @Test
    public void testBeforeNode_insertsNodeBefore() {
        Element div2 = doc.select("div#2").first();
        Element newDiv = newElement("span");
        newDiv.attr("id", "spanned");
        div2.before(newDiv);
        assertEquals(newDiv, div2.previousSibling());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_null_throwsException() {
        Element div2 = doc.select("div#2").first();
        div2.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_noParent_throwsException() {
        Element el = newElement("div");
        Element other = newElement("span");
        el.before(other);
    }

    // ---------- after(String) ----------
    @Test
    public void testAfterString_insertsHtmlAfter() {
        Element div2 = doc.select("div#2").first();
        div2.after("<div id='new'>New</div>");
        Element inserted = doc.select("div#new").first();
        assertNotNull(inserted);
        assertEquals(div2.nextSibling(), inserted);
    }

    // ---------- after(Node) ----------
    @Test
    public void testAfterNode_insertsNodeAfter() {
        Element div2 = doc.select("div#2").first();
        Element newDiv = newElement("span");
        newDiv.attr("id", "spanned");
        div2.after(newDiv);
        assertEquals(newDiv, div2.nextSibling());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNode_null_throwsException() {
        Element div2 = doc.select("div#2").first();
        div2.after((Node) null);
    }

    // ---------- wrap() ----------
    @Test
    public void testWrap_wrapsNodeWithHtml() {
        Element div1 = doc.select("div#1").first();
        div1.wrap("<div class='wrapper'></div>");
        Element parent = div1.parent();
        assertEquals("wrapper", parent.className());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        Element div1 = doc.select("div#1").first();
        div1.wrap("");
    }

    // ---------- replaceWith() ----------
    @Test
    public void testReplaceWith_replacesNode() {
        Element div1 = doc.select("div#1").first();
        Element replacement = newElement("span");
        replacement.attr("id", "replaced");
        div1.replaceWith(replacement);
        assertNull(div1.parent());
        assertNotNull(doc.select("span#replaced").first());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_null_throwsException() {
        Element div1 = doc.select("div#1").first();
        div1.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        Element el = newElement("div");
        Element other = newElement("span");
        el.replaceWith(other);
    }

    // ---------- siblingNodes() ----------
    @Test
    public void testSiblingNodes_returnsSiblingsIncludingSelf() {
        Element div2 = doc.select("div#2").first();
        List<Node> siblings = div2.siblingNodes();
        assertEquals(3, siblings.size());
    }

    // ---------- nextSibling() ----------
    @Test
    public void testNextSibling_hasNext_returnsNextSibling() {
        Element div1 = doc.select("div#1").first();
        Node next = div1.nextSibling();
        assertNotNull(next);
    }

    @Test
    public void testNextSibling_noParent_returnsNull() {
        Element el = newElement("div");
        assertNull(el.nextSibling());
    }

    @Test
    public void testNextSibling_lastSibling_returnsNull() {
        Element div3 = doc.select("div#3").first();
        assertNull(div3.nextSibling());
    }

    // ---------- previousSibling() ----------
    @Test
    public void testPreviousSibling_hasPrevious_returnsPreviousSibling() {
        Element div2 = doc.select("div#2").first();
        Node prev = div2.previousSibling();
        assertNotNull(prev);
    }

    @Test
    public void testPreviousSibling_firstSibling_returnsNull() {
        Element div1 = doc.select("div#1").first();
        assertNull(div1.previousSibling());
    }

    // ---------- siblingIndex() ----------
    @Test
    public void testSiblingIndex_returnsCorrectIndex() {
        Element div2 = doc.select("div#2").first();
        assertEquals(1, div2.siblingIndex());
    }

    @Test
    public void testSiblingIndex_firstNode_returnsZero() {
        Element div1 = doc.select("div#1").first();
        assertEquals(0, div1.siblingIndex());
    }

    // ---------- outerHtml() ----------
    @Test
    public void testOuterHtml_returnsHtmlString() {
        Element div1 = doc.select("div#1").first();
        String html = div1.outerHtml();
        assertTrue(html.contains("One"));
        assertTrue(html.contains("div"));
    }

    // ---------- toString() ----------
    @Test
    public void testToString_returnsOuterHtml() {
        Element div1 = doc.select("div#1").first();
        assertEquals(div1.outerHtml(), div1.toString());
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameObject_returnsTrue() {
        Element div1 = doc.select("div#1").first();
        assertTrue(div1.equals(div1));
    }

    @Test
    public void testEquals_differentObject_returnsFalse() {
        Element div1 = doc.select("div#1").first();
        Element div2 = doc.select("div#2").first();
        assertFalse(div1.equals(div2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        Element div1 = doc.select("div#1").first();
        assertFalse(div1.equals(null));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_consistentForSameObject() {
        Element div1 = doc.select("div#1").first();
        int h1 = div1.hashCode();
        int h2 = div1.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_noParentNoAttributes_returnsZeroBase() {
        Node node = new TextNode("text", "");
        int hash = node.hashCode();
        // just verifying no exception, and consistent
        assertEquals(hash, node.hashCode());
    }

    // ---------- clone() ----------
    @Test
    public void testClone_createsDeepCopy() {
        Element div1 = doc.select("div#1").first();
        Node clone = div1.clone();
        assertNotSame(div1, clone);
        assertNull(clone.parent());
        assertEquals(div1.outerHtml(), clone.outerHtml());
    }

    @Test
    public void testClone_withChildren_copiesChildrenIndependently() {
        Element body = doc.body();
        Element clonedBody = (Element) body.clone();
        assertEquals(body.childNodes().size(), clonedBody.childNodes().size());
        assertNotSame(body.childNode(0), clonedBody.childNode(0));
    }
}
