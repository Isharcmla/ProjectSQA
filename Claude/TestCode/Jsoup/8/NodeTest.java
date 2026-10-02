package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;

public class NodeTest {

    private Element parent;
    private Element child1;
    private Element child2;

    @Before
    public void setUp() {
        parent = new Element(Tag.valueOf("div"), "http://example.com/");
        child1 = new Element(Tag.valueOf("p"), "http://example.com/");
        child2 = new Element(Tag.valueOf("span"), "http://example.com/");
        parent.appendChild(child1);
        parent.appendChild(child2);
    }

    // ---------- nodeName ----------
    @Test
    public void testNodeName_element_returnsTagName() {
        assertEquals("div", parent.nodeName());
    }

    // ---------- attr(String) ----------
    @Test
    public void testAttr_getExisting_returnsValue() {
        parent.attr("id", "main");
        assertEquals("main", parent.attr("id"));
    }

    @Test
    public void testAttr_getNonExisting_returnsEmptyString() {
        assertEquals("", parent.attr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_getNullKey_throwsException() {
        parent.attr(null);
    }

    @Test
    public void testAttr_absPrefix_returnsAbsUrl() {
        child1.attr("href", "page.html");
        String abs = child1.attr("abs:href");
        assertTrue(abs.startsWith("http"));
    }

    @Test
    public void testAttr_absPrefixUpperCase_returnsAbsUrl() {
        child1.attr("href", "page.html");
        String abs = child1.attr("ABS:href");
        assertTrue(abs.startsWith("http"));
    }

    // ---------- attr(String, String) ----------
    @Test
    public void testAttrSet_setNewAttribute_setsCorrectly() {
        Node result = parent.attr("class", "container");
        assertSame(parent, result);
        assertEquals("container", parent.attr("class"));
    }

    // ---------- attributes() ----------
    @Test
    public void testAttributes_returnsAttributesObject() {
        assertNotNull(parent.attributes());
    }

    // ---------- hasAttr ----------
    @Test
    public void testHasAttr_existingAttribute_returnsTrue() {
        parent.attr("id", "x");
        assertTrue(parent.hasAttr("id"));
    }

    @Test
    public void testHasAttr_nonExistingAttribute_returnsFalse() {
        assertFalse(parent.hasAttr("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        parent.hasAttr(null);
    }

    // ---------- removeAttr ----------
    @Test
    public void testRemoveAttr_existingAttribute_removesIt() {
        parent.attr("id", "x");
        parent.removeAttr("id");
        assertFalse(parent.hasAttr("id"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        parent.removeAttr(null);
    }

    // ---------- baseUri / setBaseUri ----------
    @Test
    public void testBaseUri_returnsCorrectUri() {
        assertEquals("http://example.com/", parent.baseUri());
    }

    @Test
    public void testSetBaseUri_updatesBaseUri() {
        parent.setBaseUri("http://new.com/");
        assertEquals("http://new.com/", parent.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_nullValue_throwsException() {
        parent.setBaseUri(null);
    }

    // ---------- absUrl ----------
    @Test
    public void testAbsUrl_relativeUrl_returnsAbsoluteUrl() {
        child1.attr("href", "page.html");
        String abs = child1.absUrl("href");
        assertEquals("http://example.com/page.html", abs);
    }

    @Test
    public void testAbsUrl_absoluteUrlAttribute_returnsSameUrl() {
        child1.attr("href", "http://other.com/page.html");
        String abs = child1.absUrl("href");
        assertEquals("http://other.com/page.html", abs);
    }

    @Test
    public void testAbsUrl_missingAttribute_returnsEmptyString() {
        String abs = child1.absUrl("href");
        assertEquals("", abs);
    }

    @Test
    public void testAbsUrl_malformedBaseAndRelative_returnsEmptyString() {
        Element e = new Element(Tag.valueOf("a"), "not a url");
        e.attr("href", "also not a url");
        String abs = e.absUrl("href");
        assertEquals("", abs);
    }

    @Test
    public void testAbsUrl_malformedBaseButAbsoluteAttribute_returnsAttribute() {
        Element e = new Element(Tag.valueOf("a"), "not a url");
        e.attr("href", "http://example.com/page.html");
        String abs = e.absUrl("href");
        assertEquals("http://example.com/page.html", abs);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        child1.absUrl("");
    }

    // ---------- childNode ----------
    @Test
    public void testChildNode_validIndex_returnsCorrectChild() {
        assertSame(child1, parent.childNode(0));
        assertSame(child2, parent.childNode(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testChildNode_invalidIndex_throwsException() {
        parent.childNode(5);
    }

    // ---------- childNodes ----------
    @Test
    public void testChildNodes_returnsListOfChildren() {
        List<Node> children = parent.childNodes();
        assertEquals(2, children.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testChildNodes_isUnmodifiable_throwsException() {
        List<Node> children = parent.childNodes();
        children.add(new TextNode("x", ""));
    }

    @Test
    public void testChildNodes_noChildren_returnsEmptyList() {
        Element empty = new Element(Tag.valueOf("div"), "http://example.com/");
        assertTrue(empty.childNodes().isEmpty());
    }

    // ---------- parent ----------
    @Test
    public void testParent_returnsParentNode() {
        assertSame(parent, child1.parent());
    }

    @Test
    public void testParent_noParent_returnsNull() {
        assertNull(parent.parent());
    }

    // ---------- ownerDocument ----------
    @Test
    public void testOwnerDocument_elementInDocument_returnsDocument() {
        Document doc = new Document("http://example.com/");
        Element html = new Element(Tag.valueOf("html"), "http://example.com/");
        doc.appendChild(html);
        assertSame(doc, html.ownerDocument());
    }

    @Test
    public void testOwnerDocument_documentItself_returnsItself() {
        Document doc = new Document("http://example.com/");
        assertSame(doc, doc.ownerDocument());
    }

    @Test
    public void testOwnerDocument_noParentNoDocument_returnsNull() {
        Element standalone = new Element(Tag.valueOf("div"), "http://example.com/");
        assertNull(standalone.ownerDocument());
    }

    // ---------- remove ----------
    @Test
    public void testRemove_childWithParent_removesFromParent() {
        child1.remove();
        assertEquals(1, parent.childNodes().size());
        assertSame(child2, parent.childNode(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_noParent_throwsException() {
        parent.remove();
    }

    // ---------- replaceWith ----------
    @Test
    public void testReplaceWith_validReplacement_replacesNode() {
        Element replacement = new Element(Tag.valueOf("b"), "http://example.com/");
        child1.replaceWith(replacement);
        assertSame(replacement, parent.childNode(0));
        assertNull(child1.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullArgument_throwsException() {
        child1.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_noParent_throwsException() {
        parent.replaceWith(child1);
    }

    // ---------- siblingNodes ----------
    @Test
    public void testSiblingNodes_returnsParentChildNodes() {
        List<Node> siblings = child1.siblingNodes();
        assertEquals(2, siblings.size());
    }

    // ---------- nextSibling ----------
    @Test
    public void testNextSibling_hasNext_returnsNextNode() {
        assertSame(child2, child1.nextSibling());
    }

    @Test
    public void testNextSibling_isLast_returnsNull() {
        assertNull(child2.nextSibling());
    }

    @Test
    public void testNextSibling_noParent_returnsNull() {
        assertNull(parent.nextSibling());
    }

    // ---------- previousSibling ----------
    @Test
    public void testPreviousSibling_hasPrevious_returnsPreviousNode() {
        assertSame(child1, child2.previousSibling());
    }

    @Test
    public void testPreviousSibling_isFirst_returnsNull() {
        assertNull(child1.previousSibling());
    }

    // ---------- siblingIndex ----------
    @Test
    public void testSiblingIndex_returnsCorrectIndex() {
        assertEquals(0, child1.siblingIndex().intValue());
        assertEquals(1, child2.siblingIndex().intValue());
    }

    // ---------- outerHtml ----------
    @Test
    public void testOuterHtml_returnsHtmlString() {
        String html = parent.outerHtml();
        assertNotNull(html);
        assertTrue(html.contains("div"));
    }

    // ---------- toString ----------
    @Test
    public void testToString_returnsOuterHtml() {
        assertEquals(parent.outerHtml(), parent.toString());
    }

    // ---------- equals ----------
    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(parent.equals(parent));
    }

    @Test
    public void testEquals_differentObject_returnsFalse() {
        assertFalse(parent.equals(child1));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(parent.equals(null));
    }

    // ---------- hashCode ----------
    @Test
    public void testHashCode_consistentForSameObject() {
        int hash1 = parent.hashCode();
        int hash2 = parent.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void testHashCode_withParent_doesNotThrow() {
        int childHash = child1.hashCode();
        assertTrue(childHash == childHash);
    }

    @Test
    public void testHashCode_noParentNoAttributes_returnsZeroOrValid() {
        Element e = new Element(Tag.valueOf("div"), "http://example.com/");
        int hash = e.hashCode();
        assertTrue(hash >= 0 || hash < 0); // just ensure no exception
    }
}
