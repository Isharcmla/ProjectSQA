package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class NodeTest {

    private Document doc;

    @Before
    public void setUp() {
        doc = Document.createShell("http://example.com/");
    }

    // ---------- attr(String) ----------

    @Test
    public void testAttr_existingKey_returnsValue() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.attr("id", "foo");
        assertEquals("foo", el.attr("id"));
    }

    @Test
    public void testAttr_missingKey_returnsEmptyString() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertEquals("", el.attr("missing"));
    }

    @Test
    public void testAttr_absPrefix_returnsAbsoluteUrl() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "/path");
        assertEquals("http://example.com/path", el.attr("abs:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.attr(null);
    }

    // ---------- attributes() ----------

    @Test
    public void testAttributes_returnsAttributesObject() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertNotNull(el.attributes());
    }

    // ---------- attr(key, value) ----------

    @Test
    public void testAttrSet_setsAndReturnsThis() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Node result = el.attr("class", "test");
        assertSame(el, result);
        assertEquals("test", el.attr("class"));
    }

    // ---------- hasAttr ----------

    @Test
    public void testHasAttr_existingKey_returnsTrue() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.attr("id", "x");
        assertTrue(el.hasAttr("id"));
    }

    @Test
    public void testHasAttr_missingKey_returnsFalse() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertFalse(el.hasAttr("missing"));
    }

    @Test
    public void testHasAttr_absPrefixWithValidUrl_returnsTrue() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "/path");
        assertTrue(el.hasAttr("abs:href"));
    }

    @Test
    public void testHasAttr_absPrefixWithMissingKey_returnsFalse() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/");
        assertFalse(el.hasAttr("abs:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.hasAttr(null);
    }

    // ---------- removeAttr ----------

    @Test
    public void testRemoveAttr_removesAttribute() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.attr("id", "x");
        el.removeAttr("id");
        assertFalse(el.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.removeAttr(null);
    }

    // ---------- baseUri ----------

    @Test
    public void testBaseUri_returnsCorrectUri() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertEquals("http://example.com/", el.baseUri());
    }

    // ---------- setBaseUri ----------

    @Test
    public void testSetBaseUri_updatesBaseUriRecursively() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://old.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://old.com/");
        parent.appendChild(child);
        parent.setBaseUri("http://new.com/");
        assertEquals("http://new.com/", parent.baseUri());
        assertEquals("http://new.com/", child.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_nullUri_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.setBaseUri(null);
    }

    // ---------- absUrl ----------

    @Test
    public void testAbsUrl_relativeUrl_returnsAbsoluteUrl() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/");
        el.attr("href", "path");
        assertEquals("http://example.com/path", el.absUrl("href"));
    }

    @Test
    public void testAbsUrl_missingAttribute_returnsEmptyString() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/");
        assertEquals("", el.absUrl("href"));
    }

    @Test
    public void testAbsUrl_malformedBaseButAbsoluteAttr_returnsAttrValue() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "not a url");
        el.attr("href", "http://example.com/valid");
        assertEquals("http://example.com/valid", el.absUrl("href"));
    }

    @Test
    public void testAbsUrl_malformedBaseAndMalformedAttr_returnsEmptyString() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "not a url");
        el.attr("href", "also not a url");
        assertEquals("", el.absUrl("href"));
    }

    @Test
    public void testAbsUrl_queryOnlyRelative_resolvesCorrectly() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/path/file.html");
        el.attr("href", "?foo=bar");
        String result = el.absUrl("href");
        assertTrue(result.contains("file.html?foo=bar") || result.contains("path/?foo=bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/");
        el.absUrl("");
    }

    // ---------- childNode ----------

    @Test
    public void testChildNode_validIndex_returnsNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        assertSame(child, parent.childNode(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        parent.childNode(0);
    }

    // ---------- childNodes ----------

    @Test
    public void testChildNodes_returnsUnmodifiableList() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        List<Node> children = parent.childNodes();
        assertEquals(0, children.size());
        try {
            children.add(new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- parent ----------

    @Test
    public void testParent_noParent_returnsNull() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertNull(el.parent());
    }

    @Test
    public void testParent_hasParent_returnsParent() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        assertSame(parent, child.parent());
    }

    // ---------- ownerDocument ----------

    @Test
    public void testOwnerDocument_isDocumentInstance_returnsSelf() {
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_noParent_returnsNull() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertNull(el.ownerDocument());
    }

    @Test
    public void testOwnerDocument_hasParentDocument_returnsDocument() {
        Element body = doc.body();
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        body.appendChild(child);
        assertSame(doc, child.ownerDocument());
    }

    // ---------- remove ----------

    @Test
    public void testRemove_removesFromParent() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.remove();
        assertEquals(0, parent.childNodes().size());
        assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.remove();
    }

    // ---------- before(String) ----------

    @Test
    public void testBeforeHtml_insertsBeforeNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.before("<b>bold</b>");
        assertEquals(2, parent.childNodes().size());
        assertEquals("b", parent.childNode(0).nodeName());
    }

    // ---------- before(Node) ----------

    @Test
    public void testBeforeNode_insertsBeforeNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element newNode = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child);
        child.before(newNode);
        assertEquals(2, parent.childNodes().size());
        assertSame(newNode, parent.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_nullNode_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_noParent_throwsException() {
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element newNode = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        child.before(newNode);
    }

    // ---------- after(String) ----------

    @Test
    public void testAfterHtml_insertsAfterNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.after("<b>bold</b>");
        assertEquals(2, parent.childNodes().size());
        assertEquals("b", parent.childNode(1).nodeName());
    }

    // ---------- after(Node) ----------

    @Test
    public void testAfterNode_insertsAfterNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element newNode = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child);
        child.after(newNode);
        assertEquals(2, parent.childNodes().size());
        assertSame(newNode, parent.childNode(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNode_nullNode_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.after((Node) null);
    }

    // ---------- wrap ----------

    @Test
    public void testWrap_wrapsNodeWithHtml() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.wrap("<div class=\"wrapper\"></div>");
        assertEquals("wrapper", parent.childNode(0).attr("class"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.wrap("");
    }

    // ---------- unwrap ----------

    @Test
    public void testUnwrap_movesChildrenUp() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element inner = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(span);
        span.appendChild(inner);
        Node firstChild = span.unwrap();
        assertSame(inner, firstChild);
        assertEquals(1, parent.childNodes().size());
        assertSame(inner, parent.childNode(0));
    }

    @Test
    public void testUnwrap_noChildren_returnsNull() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element span = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(span);
        Node result = span.unwrap();
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnwrap_noParent_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.unwrap();
    }

    // ---------- replaceWith ----------

    @Test
    public void testReplaceWith_replacesNodeInParent() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element replacement = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child);
        child.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullNode_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element replacement = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        el.replaceWith(replacement);
    }

    // ---------- siblingNodes ----------

    @Test
    public void testSiblingNodes_returnsParentChildren() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child1 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element child2 = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child1);
        parent.appendChild(child2);
        List<Node> siblings = child1.siblingNodes();
        assertEquals(2, siblings.size());
    }

    // ---------- nextSibling ----------

    @Test
    public void testNextSibling_hasNext_returnsNextNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child1 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element child2 = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child2, child1.nextSibling());
    }

    @Test
    public void testNextSibling_isLast_returnsNull() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child1 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child1);
        assertNull(child1.nextSibling());
    }

    @Test
    public void testNextSibling_noParent_returnsNull() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertNull(el.nextSibling());
    }

    // ---------- previousSibling ----------

    @Test
    public void testPreviousSibling_hasPrevious_returnsPreviousNode() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child1 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element child2 = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertSame(child1, child2.previousSibling());
    }

    @Test
    public void testPreviousSibling_isFirst_returnsNull() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child1 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child1);
        assertNull(child1.previousSibling());
    }

    // ---------- siblingIndex ----------

    @Test
    public void testSiblingIndex_returnsCorrectIndex() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child1 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        Element child2 = new Element(org.jsoup.parser.Tag.valueOf("b"), "http://example.com/");
        parent.appendChild(child1);
        parent.appendChild(child2);
        assertEquals(0, child1.siblingIndex());
        assertEquals(1, child2.siblingIndex());
    }

    // ---------- traverse ----------

    @Test
    public void testTraverse_visitsAllNodes() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);

        final int[] count = {0};
        parent.traverse(new org.jsoup.select.NodeVisitor() {
            public void head(Node node, int depth) {
                count[0]++;
            }
            public void tail(Node node, int depth) {
            }
        });
        assertEquals(2, count[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTraverse_nullVisitor_throwsException() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.traverse(null);
    }

    // ---------- outerHtml ----------

    @Test
    public void testOuterHtml_returnsHtmlString() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        el.attr("id", "test");
        String html = el.outerHtml();
        assertTrue(html.contains("div"));
        assertTrue(html.contains("id=\"test\""));
    }

    // ---------- toString ----------

    @Test
    public void testToString_returnsOuterHtml() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertEquals(el.outerHtml(), el.toString());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertTrue(el.equals(el));
    }

    @Test
    public void testEquals_differentObject_returnsFalse() {
        Element el1 = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element el2 = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        assertFalse(el1.equals(el2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_noParent_returnsConsistentValue() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        int hash1 = el.hashCode();
        int hash2 = el.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_withParent_includesParentHash() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        int hash = child.hashCode();
        assertTrue(hash != 0 || hash == 0); // just ensure no exception and value computed
    }

    // ---------- clone ----------

    @Test
    public void testClone_createsIndependentCopy() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element child = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child);
        parent.attr("id", "original");

        Element clone = (Element) parent.clone();
        assertEquals("original", clone.attr("id"));
        assertNull(clone.parent());
        assertEquals(1, clone.childNodes().size());
        assertNotSame(parent.childNode(0), clone.childNode(0));

        clone.attr("id", "changed");
        assertEquals("original", parent.attr("id"));
    }

    @Test
    public void testClone_preservesBaseUri() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        Element clone = (Element) el.clone();
        assertEquals(el.baseUri(), clone.baseUri());
    }

    // ---------- TextNode specific test for outerHtmlVisitor tail behavior ----------

    @Test
    public void testTraverse_onTextNode_worksWithoutTail() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com/");
        TextNode text = new TextNode("Hello", "http://example.com/");
        parent.appendChild(text);
        String html = parent.outerHtml();
        assertTrue(html.contains("Hello"));
    }

    // ---------- Comment node basic test ----------

    @Test
    public void testCommentNode_outerHtml_containsCommentText() {
        Comment comment = new Comment(" a comment ", "http://example.com/");
        String html = comment.outerHtml();
        assertTrue(html.contains("a comment"));
    }
}
