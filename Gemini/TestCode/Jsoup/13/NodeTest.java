package org.jsoup.nodes;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NodeTest {

    private static class ConcreteNode extends Node {
        ConcreteNode(String baseUri, Attributes attributes) {
            super(baseUri, attributes);
        }

        ConcreteNode(String baseUri) {
            super(baseUri);
        }

        ConcreteNode() {
            super();
        }

        @Override
        public String nodeName() {
            return "concreteNode";
        }

        @Override
        void outerHtmlHead(StringBuilder accum, int depth, Document.OutputSettings out) {
            indent(accum, depth, out);
            accum.append("<concreteNode>");
        }

        @Override
        void outerHtmlTail(StringBuilder accum, int depth, Document.OutputSettings out) {
            accum.append("</concreteNode>");
        }
    }

    @Test
    public void testConstructors_validInputs_initializedCorrectly() {
        Attributes attrs = new Attributes();
        attrs.put("key", "val");
        ConcreteNode node1 = new ConcreteNode(" http://example.com/ ", attrs);
        assertEquals("http://example.com/", node1.baseUri());
        assertEquals(attrs, node1.attributes());
        assertEquals(0, node1.childNodes().size());

        ConcreteNode node2 = new ConcreteNode("http://example.com");
        assertEquals("http://example.com", node2.baseUri());
        assertNotNull(node2.attributes());

        ConcreteNode node3 = new ConcreteNode();
        assertNull(node3.baseUri());
        assertNull(node3.attributes());
        assertEquals(0, node3.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullBaseUri_throwsException() {
        new ConcreteNode(null, new Attributes());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullAttributes_throwsException() {
        new ConcreteNode("http://example.com", null);
    }

    @Test
    public void testAttr_existingAttribute_returnsValue() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("class", "main");
        assertEquals("main", node.attr("class"));
    }

    @Test
    public void testAttr_missingAttribute_returnsEmptyString() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        assertEquals("", node.attr("missing"));
    }

    @Test
    public void testAttr_absPrefix_returnsAbsoluteUrl() {
        ConcreteNode node = new ConcreteNode("http://example.com/path/");
        node.attr("href", "sub/page.html");
        assertEquals("http://example.com/path/sub/page.html", node.attr("abs:href"));
        assertEquals("http://example.com/path/sub/page.html", node.attr("ABS:href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr(null);
    }

    @Test
    public void testHasAttr_existingAndMissing_returnsExpected() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("id", "testId");
        assertTrue(node.hasAttr("id"));
        assertFalse(node.hasAttr("name"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.hasAttr(null);
    }

    @Test
    public void testRemoveAttr_existingAttribute_removesAttribute() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.attr("title", "tooltip");
        assertTrue(node.hasAttr("title"));
        Node returned = node.removeAttr("title");
        assertSame(node, returned);
        assertFalse(node.hasAttr("title"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAttr_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.removeAttr(null);
    }

    @Test
    public void testSetBaseUri_validUri_updatesBaseUri() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setBaseUri("http://other.com");
        assertEquals("http://other.com", node.baseUri());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseUri_nullUri_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setBaseUri(null);
    }

    @Test
    public void testAbsUrl_variousScenarios_returnsExpectedAbsoluteUrl() {
        Element el = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com/dir/file.html");
        el.attr("href", "other.html");
        assertEquals("http://example.com/dir/other.html", el.absUrl("href"));

        el.attr("href", "?query=1");
        assertEquals("http://example.com/dir/file.html?query=1", el.absUrl("href"));

        el.attr("href", "http://other.com/index.html");
        assertEquals("http://other.com/index.html", el.absUrl("href"));

        assertEquals("", el.absUrl("nonexistent"));

        Element invalidBase = new Element(org.jsoup.parser.Tag.valueOf("a"), "invalid_base_uri");
        invalidBase.attr("href", "http://valid.com/page");
        assertEquals("http://valid.com/page", invalidBase.absUrl("href"));

        invalidBase.attr("href", "relative_page");
        assertEquals("", invalidBase.absUrl("href"));

        Element malformedUrlAttr = new Element(org.jsoup.parser.Tag.valueOf("a"), "http://example.com");
        malformedUrlAttr.attr("href", "http://::invalid-url");
        assertEquals("", malformedUrlAttr.absUrl("href"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAbsUrl_emptyKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.absUrl("");
    }

    @Test
    public void testAbsUrl_nullKey_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        try {
            node.absUrl(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testChildNodesAndArray_childrenPresent_returnsCorrectListAndArray() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");

        parent.addChildren(child1, child2);

        assertEquals(2, parent.childNodes().size());
        assertSame(child1, parent.childNode(0));
        assertSame(child2, parent.childNode(1));

        Node[] childArray = parent.childNodesAsArray();
        assertEquals(2, childArray.length);
        assertSame(child1, childArray[0]);
        assertSame(child2, childArray[1]);

        try {
            parent.childNodes().add(new ConcreteNode("http://example.com"));
            fail("childNodes() should be unmodifiable");
        } catch (UnsupportedOperationException ignored) {
        }
    }

    @Test
    public void testParentAndOwnerDocument_treeStructure_returnsExpectedDocument() {
        Document doc = new Document("http://example.com");
        Element el = doc.appendElement("div");
        TextNode textNode = new TextNode("Hello", "http://example.com");
        el.appendChild(textNode);

        assertSame(doc, doc.ownerDocument());
        assertSame(doc, el.ownerDocument());
        assertSame(doc, textNode.ownerDocument());
        assertSame(el, textNode.parent());

        ConcreteNode orphan = new ConcreteNode("http://example.com");
        assertNull(orphan.ownerDocument());
        assertNull(orphan.parent());
    }

    @Test
    public void testRemove_nodeWithParent_removedSuccessfully() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("span");

        assertEquals(1, parent.childNodes().size());
        child.remove();
        assertEquals(0, parent.childNodes().size());
        assertNull(child.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove_orphanNode_throwsException() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.remove();
    }

    @Test
    public void testBeforeAndAfter_withHtmlAndNodes_positionedCorrectly() {
        Element doc = new Document("http://example.com");
        Element body = doc.appendElement("body");
        Element middle = body.appendElement("p");

        middle.before("<div>beforeHtml</div>");
        middle.after("<span>afterHtml</span>");

        assertEquals(3, body.childNodes().size());
        assertEquals("div", ((Element) body.childNode(0)).tagName());
        assertSame(middle, body.childNode(1));
        assertEquals("span", ((Element) body.childNode(2)).tagName());

        Element beforeNode = new Element(org.jsoup.parser.Tag.valueOf("h1"), "http://example.com");
        Element afterNode = new Element(org.jsoup.parser.Tag.valueOf("h2"), "http://example.com");

        middle.before(beforeNode);
        middle.after(afterNode);

        assertEquals(5, body.childNodes().size());
        assertSame(beforeNode, body.childNode(1));
        assertSame(middle, body.childNode(2));
        assertSame(afterNode, body.childNode(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_nullNode_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("span");
        child.before((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeNode_orphanNode_throwsException() {
        ConcreteNode orphan = new ConcreteNode("http://example.com");
        orphan.before(new ConcreteNode("http://example.com"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBeforeHtml_orphanNode_throwsException() {
        ConcreteNode orphan = new ConcreteNode("http://example.com");
        orphan.before("<p>test</p>");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNode_nullNode_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("span");
        child.after((Node) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterNode_orphanNode_throwsException() {
        ConcreteNode orphan = new ConcreteNode("http://example.com");
        orphan.after(new ConcreteNode("http://example.com"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAfterHtml_orphanNode_throwsException() {
        ConcreteNode orphan = new ConcreteNode("http://example.com");
        orphan.after("<p>test</p>");
    }

    @Test
    public void testWrap_validHtml_wrapsCorrectly() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("body"), "http://example.com");
        Element target = parent.appendElement("p");
        target.attr("id", "target");

        Node wrapped = target.wrap("<div class='outer'><section class='inner'></section></div>");
        assertSame(target, wrapped);
        assertEquals("body", parent.tagName());
        assertEquals("div", ((Element) parent.childNode(0)).tagName());
        assertEquals("section", ((Element) parent.childNode(0).childNode(0)).tagName());
        assertSame(target, parent.childNode(0).childNode(0).childNode(0));
    }

    @Test
    public void testWrap_multipleRoots_addsRemainder() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("body"), "http://example.com");
        Element target = parent.appendElement("p");

        target.wrap("<div></div><span></span>");
        assertEquals(1, parent.childNodes().size());
        Element wrapDiv = (Element) parent.childNode(0);
        assertEquals("div", wrapDiv.tagName());
        assertEquals(2, wrapDiv.childNodes().size());
        assertSame(target, wrapDiv.childNode(0));
        assertEquals("span", ((Element) wrapDiv.childNode(1)).tagName());
    }

    @Test
    public void testWrap_nonElementHtml_returnsNull() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("body"), "http://example.com");
        Element target = parent.appendElement("p");

        Node result = target.wrap("plain text without tags");
        assertNull(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrap_emptyHtml_throwsException() {
        Element target = new Element(org.jsoup.parser.Tag.valueOf("p"), "http://example.com");
        target.wrap("");
    }

    @Test
    public void testReplaceWith_validNode_replacesInParent() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com");
        Element child1 = parent.appendElement("p");
        Element child2 = new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com");

        child1.replaceWith(child2);

        assertEquals(1, parent.childNodes().size());
        assertSame(child2, parent.childNode(0));
        assertNull(child1.parent());
        assertSame(parent, child2.parent());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_nullNode_throwsException() {
        Element parent = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://example.com");
        Element child = parent.appendElement("p");
        child.replaceWith(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceWith_orphanNode_throwsException() {
        Element orphan = new Element(org.jsoup.parser.Tag.valueOf("p"), "http://example.com");
        orphan.replaceWith(new Element(org.jsoup.parser.Tag.valueOf("span"), "http://example.com"));
    }

    @Test
    public void testSetParentNode_reparenting_removesFromOldParent() {
        ConcreteNode parent1 = new ConcreteNode("http://example.com");
        ConcreteNode parent2 = new ConcreteNode("http://example.com");
        ConcreteNode child = new ConcreteNode("http://example.com");

        parent1.addChildren(child);
        assertEquals(1, parent1.childNodes().size());
        assertSame(parent1, child.parent());

        child.setParentNode(parent2);
        assertEquals(0, parent1.childNodes().size());
        assertSame(parent2, child.parent());
    }

    @Test
    public void testAddChildrenAtIndex_validNodes_insertedInOrder() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");
        ConcreteNode child3 = new ConcreteNode("http://example.com");
        ConcreteNode child4 = new ConcreteNode("http://example.com");

        parent.addChildren(child1, child4);
        parent.addChildren(1, child2, child3);

        assertEquals(4, parent.childNodes().size());
        assertSame(child1, parent.childNode(0));
        assertEquals(0, child1.siblingIndex());
        assertSame(child2, parent.childNode(1));
        assertEquals(1, child2.siblingIndex());
        assertSame(child3, parent.childNode(2));
        assertEquals(2, child3.siblingIndex());
        assertSame(child4, parent.childNode(3));
        assertEquals(3, child4.siblingIndex());
    }

    @Test
    public void testReplaceChild_existingChild_replacedCorrectly() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode oldChild = new ConcreteNode("http://example.com");
        ConcreteNode newChild = new ConcreteNode("http://example.com");
        ConcreteNode anotherParent = new ConcreteNode("http://example.com");

        anotherParent.addChildren(newChild);
        parent.addChildren(oldChild);

        parent.replaceChild(oldChild, newChild);

        assertEquals(1, parent.childNodes().size());
        assertSame(newChild, parent.childNode(0));
        assertEquals(0, newChild.siblingIndex());
        assertSame(parent, newChild.parent());
        assertNull(oldChild.parent());
        assertEquals(0, anotherParent.childNodes().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReplaceChild_childNotBelongingToParent_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode other = new ConcreteNode("http://example.com");
        ConcreteNode replacement = new ConcreteNode("http://example.com");

        parent.replaceChild(other, replacement);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveChild_childNotBelongingToParent_throwsException() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode other = new ConcreteNode("http://example.com");

        parent.removeChild(other);
    }

    @Test
    public void testSiblingNavigation_treeNodes_navigatesCorrectly() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        ConcreteNode child1 = new ConcreteNode("http://example.com");
        ConcreteNode child2 = new ConcreteNode("http://example.com");
        ConcreteNode child3 = new ConcreteNode("http://example.com");

        parent.addChildren(child1, child2, child3);

        List<Node> siblings = child1.siblingNodes();
        assertEquals(3, siblings.size());

        assertNull(child1.previousSibling());
        assertSame(child2, child1.nextSibling());

        assertSame(child1, child2.previousSibling());
        assertSame(child3, child2.nextSibling());

        assertSame(child2, child3.previousSibling());
        assertNull(child3.nextSibling());

        ConcreteNode orphan = new ConcreteNode("http://example.com");
        assertNull(orphan.nextSibling());
    }

    @Test
    public void testOuterHtmlAndToString_formatting_generatesExpectedString() {
        ConcreteNode node = new ConcreteNode("http://example.com");
        node.setSiblingIndex(0);
        String expected = "\n<concreteNode></concreteNode>";
        assertEquals(expected, node.outerHtml());
        assertEquals(expected, node.toString());

        Element doc = new Document("http://example.com");
        Element p = doc.appendElement("p");
        p.appendText("Text node");
        assertTrue(p.outerHtml().contains("Text node"));
    }

    @Test
    public void testEqualsAndHashCode_variousStates_behaveAsExpected() {
        ConcreteNode node1 = new ConcreteNode("http://example.com");
        ConcreteNode node2 = new ConcreteNode("http://example.com");

        assertTrue(node1.equals(node1));
        assertFalse(node1.equals(node2));
        assertFalse(node1.equals(null));
        assertFalse(node1.equals("String Object"));

        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.addChildren(node1);

        int hashWithParent = node1.hashCode();
        node1.attr("k", "v");
        int hashWithAttr = node1.hashCode();
        assertTrue(hashWithParent != 0);
        assertTrue(hashWithAttr != 0);

        ConcreteNode defaultNode = new ConcreteNode();
        assertEquals(0, defaultNode.hashCode());
    }

    @Test
    public void testClone_deepClone_createsIndependentCopy() {
        ConcreteNode parent = new ConcreteNode("http://example.com");
        parent.attr("parentKey", "parentVal");
        ConcreteNode child = new ConcreteNode("http://example.com");
        child.attr("childKey", "childVal");
        parent.addChildren(child);

        ConcreteNode clone = (ConcreteNode) parent.clone();

        assertNotSame(parent, clone);
        assertNull(clone.parent());
        assertEquals(0, clone.siblingIndex());
        assertEquals("http://example.com", clone.baseUri());
        assertEquals("parentVal", clone.attr("parentKey"));
        assertEquals(1, clone.childNodes().size());

        Node clonedChild = clone.childNode(0);
        assertNotSame(child, clonedChild);
        assertSame(clone, clonedChild.parent());
        assertEquals(0, clonedChild.siblingIndex());
        assertEquals("childVal", clonedChild.attr("childKey"));

        clone.attr("parentKey", "modifiedVal");
        assertEquals("parentVal", parent.attr("parentKey"));
    }
}
