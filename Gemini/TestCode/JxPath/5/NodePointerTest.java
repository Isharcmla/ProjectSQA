package org.apache.commons.jxpath.ri.model;

import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodePointerTest {

    private static class TestNodePointer extends NodePointer {
        private static final long serialVersionUID = 1L;
        private QName name;
        private Object node;
        private boolean leaf;
        private boolean collection;
        private int length = 1;
        private boolean container;
        private NodePointer immediateValuePointer = this;
        private String namespaceURI;
        private String defaultNamespaceURI;

        public TestNodePointer(NodePointer parent) {
            super(parent);
        }

        public TestNodePointer(NodePointer parent, Locale locale) {
            super(parent, locale);
        }

        public TestNodePointer(NodePointer parent, QName name, Object node) {
            super(parent);
            this.name = name;
            this.node = node;
        }

        public void setName(QName name) {
            this.name = name;
        }

        public void setNode(Object node) {
            this.node = node;
        }

        public void setLeaf(boolean leaf) {
            this.leaf = leaf;
        }

        public void setCollection(boolean collection) {
            this.collection = collection;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setContainer(boolean container) {
            this.container = container;
        }

        public void setImmediateValuePointer(NodePointer ivp) {
            this.immediateValuePointer = ivp;
        }

        public void setTestNamespaceURI(String uri) {
            this.namespaceURI = uri;
        }

        public void setTestDefaultNamespaceURI(String uri) {
            this.defaultNamespaceURI = uri;
        }

        @Override
        public boolean isLeaf() {
            return leaf;
        }

        @Override
        public boolean isCollection() {
            return collection;
        }

        @Override
        public int getLength() {
            return length;
        }

        @Override
        public boolean isContainer() {
            return container;
        }

        @Override
        public QName getName() {
            return name;
        }

        @Override
        public Object getBaseValue() {
            return node;
        }

        @Override
        public Object getImmediateNode() {
            return node;
        }

        @Override
        public void setValue(Object value) {
            this.node = value;
        }

        @Override
        public NodePointer getImmediateValuePointer() {
            return immediateValuePointer;
        }

        @Override
        public String getNamespaceURI(String prefix) {
            if ("testPrefix".equals(prefix)) {
                return "http://test.org";
            }
            if ("otherPrefix".equals(prefix)) {
                return "http://other.org";
            }
            return namespaceURI;
        }

        @Override
        public String getDefaultNamespaceURI() {
            return defaultNamespaceURI;
        }

        @Override
        public boolean isDefaultNamespace(String prefix) {
            return super.isDefaultNamespace(prefix);
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            if (pointer1 == pointer2) {
                return 0;
            }
            if (pointer1 == null) {
                return -1;
            }
            if (pointer2 == null) {
                return 1;
            }
            String n1 = pointer1.getName() != null ? pointer1.getName().getName() : "";
            String n2 = pointer2.getName() != null ? pointer2.getName().getName() : "";
            return n1.compareTo(n2);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TestNodePointer)) {
                return false;
            }
            TestNodePointer other = (TestNodePointer) obj;
            if (name == null ? other.name != null : !name.equals(other.name)) {
                return false;
            }
            return node == null ? other.node == null : node.equals(other.node);
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }

    @Test
    public void testNewNodePointer_nullBean_returnsNullPointer() {
        QName name = new QName("test");
        NodePointer pointer = NodePointer.newNodePointer(name, null, Locale.ENGLISH);
        assertNotNull(pointer);
        assertTrue(pointer instanceof NullPointer);
        assertEquals(name, pointer.getName());
        assertEquals(Locale.ENGLISH, pointer.getLocale());
    }

    @Test
    public void testNewNodePointer_validBean_returnsPointer() {
        QName name = new QName("test");
        String bean = "Hello JXPath";
        NodePointer pointer = NodePointer.newNodePointer(name, bean, Locale.US);
        assertNotNull(pointer);
        assertEquals(bean, pointer.getNode());
        assertEquals(Locale.US, pointer.getLocale());
    }

    @Test
    public void testNewChildNodePointer_validBean_returnsChildPointer() {
        TestNodePointer parent = new TestNodePointer(null);
        QName name = new QName("child");
        String bean = "Child Value";
        NodePointer childPointer = NodePointer.newChildNodePointer(parent, name, bean);
        assertNotNull(childPointer);
        assertEquals(parent, childPointer.getImmediateParentPointer());
        assertEquals(bean, childPointer.getNode());
    }

    @Test
    public void testNamespaceResolver_setAndGetDirectAndInherited() {
        TestNodePointer root = new TestNodePointer(null);
        assertNull(root.getNamespaceResolver());

        NamespaceResolver nr = new NamespaceResolver();
        root.setNamespaceResolver(nr);
        assertSame(nr, root.getNamespaceResolver());

        TestNodePointer child = new TestNodePointer(root);
        assertSame(nr, child.getNamespaceResolver());

        NamespaceResolver childNr = new NamespaceResolver();
        child.setNamespaceResolver(childNr);
        assertSame(childNr, child.getNamespaceResolver());
    }

    @Test
    public void testGetParent_withContainers_skipsContainers() {
        TestNodePointer root = new TestNodePointer(null);
        TestNodePointer container = new TestNodePointer(root);
        container.setContainer(true);

        TestNodePointer child = new TestNodePointer(container);
        child.setContainer(false);

        assertSame(root, child.getParent());
        assertSame(container, child.getImmediateParentPointer());
    }

    @Test
    public void testGetParent_noParent_returnsNull() {
        TestNodePointer root = new TestNodePointer(null);
        assertNull(root.getParent());
        assertNull(root.getImmediateParentPointer());
    }

    @Test
    public void testAttributeAndIsRoot() {
        TestNodePointer root = new TestNodePointer(null);
        assertTrue(root.isRoot());
        assertFalse(root.isAttribute());

        root.setAttribute(true);
        assertTrue(root.isAttribute());
        root.setAttribute(false);
        assertFalse(root.isAttribute());

        TestNodePointer child = new TestNodePointer(root);
        assertFalse(child.isRoot());
    }

    @Test
    public void testIsNode() {
        TestNodePointer ptr = new TestNodePointer(null);
        ptr.setContainer(false);
        assertTrue(ptr.isNode());

        ptr.setContainer(true);
        assertFalse(ptr.isNode());
    }

    @Test
    public void testIndexHandling() {
        TestNodePointer ptr = new TestNodePointer(null);
        assertEquals(NodePointer.WHOLE_COLLECTION, ptr.getIndex());

        ptr.setIndex(2);
        assertEquals(2, ptr.getIndex());
    }

    @Test
    public void testIsActual() {
        TestNodePointer ptr = new TestNodePointer(null);
        ptr.setLength(3);

        ptr.setIndex(NodePointer.WHOLE_COLLECTION);
        assertTrue(ptr.isActual());

        ptr.setIndex(0);
        assertTrue(ptr.isActual());

        ptr.setIndex(2);
        assertTrue(ptr.isActual());

        ptr.setIndex(3);
        assertFalse(ptr.isActual());

        ptr.setIndex(-1);
        assertFalse(ptr.isActual());
    }

    @Test
    public void testGetValueAndValuePointerRecursion() {
        TestNodePointer inner = new TestNodePointer(null, new QName("inner"), "innerValue");
        TestNodePointer middle = new TestNodePointer(null, new QName("middle"), "middleValue");
        middle.setImmediateValuePointer(inner);

        TestNodePointer outer = new TestNodePointer(null, new QName("outer"), "outerValue");
        outer.setImmediateValuePointer(middle);

        assertSame(inner, outer.getValuePointer());
        assertEquals("innerValue", outer.getValue());
        assertEquals("innerValue", inner.getValue());
        assertEquals("innerValue", outer.getNodeValue());
    }

    @Test
    public void testGetRootNode() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootNode");
        TestNodePointer child1 = new TestNodePointer(root, new QName("child1"), "child1Node");
        TestNodePointer child2 = new TestNodePointer(child1, new QName("child2"), "child2Node");

        assertEquals("rootNode", root.getRootNode());
        assertEquals("rootNode", child2.getRootNode());
    }

    @Test
    public void testTestNode_nullTest_returnsTrue() {
        TestNodePointer ptr = new TestNodePointer(null);
        assertTrue(ptr.testNode(null));
    }

    @Test
    public void testTestNode_nodeNameTest() {
        TestNodePointer container = new TestNodePointer(null, new QName("elem"), "val");
        container.setContainer(true);
        assertFalse(container.testNode(new NodeNameTest(new QName("elem"))));

        TestNodePointer nullNamed = new TestNodePointer(null, null, "val");
        assertFalse(nullNamed.testNode(new NodeNameTest(new QName("elem"))));

        TestNodePointer ptr = new TestNodePointer(null, new QName("elem"), "val");
        assertTrue(ptr.testNode(new NodeNameTest(new QName("elem"))));
        assertFalse(ptr.testNode(new NodeNameTest(new QName("other"))));
        assertTrue(ptr.testNode(new NodeNameTest(new QName(null, "*"))));

        TestNodePointer nsPtr = new TestNodePointer(null, new QName("testPrefix", "elem"), "val");
        assertTrue(nsPtr.testNode(new NodeNameTest(new QName("testPrefix", "elem"))));
        assertTrue(nsPtr.testNode(new NodeNameTest(new QName("testPrefix", "*"))));

        assertFalse(nsPtr.testNode(new NodeNameTest(new QName("otherPrefix", "elem"))));
    }

    @Test
    public void testTestNode_nodeTypeTest() {
        TestNodePointer ptr = new TestNodePointer(null);
        ptr.setContainer(false);
        assertTrue(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertFalse(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));

        ptr.setContainer(true);
        assertFalse(ptr.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));

        NodeTest otherTest = new NodeTest() {};
        assertFalse(ptr.testNode(otherTest));
    }

    @Test
    public void testCreatePathAndRemove() {
        TestNodePointer ptr = new TestNodePointer(null, new QName("test"), "val");
        JXPathContext context = JXPathContext.newContext(new Object());

        assertSame(ptr, ptr.createPath(context));
        assertSame(ptr, ptr.createPath(context, "newVal"));
        assertEquals("newVal", ptr.getBaseValue());

        ptr.remove();
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_fourParams_throwsException() {
        TestNodePointer ptr = new TestNodePointer(null, new QName("test"), "val");
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createChild(context, new QName("child"), 0, "val");
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_threeParams_throwsException() {
        TestNodePointer ptr = new TestNodePointer(null, new QName("test"), "val");
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createChild(context, new QName("child"), 0);
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_throwsException() {
        TestNodePointer ptr = new TestNodePointer(null, new QName("test"), "val");
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createAttribute(context, new QName("attr"));
    }

    @Test
    public void testLocaleAndIsLanguage() {
        TestNodePointer root = new TestNodePointer(null, Locale.GERMANY);
        assertEquals(Locale.GERMANY, root.getLocale());
        assertTrue(root.isLanguage("de"));
        assertTrue(root.isLanguage("de-DE"));
        assertFalse(root.isLanguage("en"));

        TestNodePointer child = new TestNodePointer(root);
        assertEquals(Locale.GERMANY, child.getLocale());
    }

    @Test
    public void testIteratorsAndNamespaceMethodsDefaults() {
        TestNodePointer ptr = new TestNodePointer(null, new QName("test"), "val");
        assertNull(ptr.childIterator(null, false, null));
        assertNull(ptr.attributeIterator(new QName("attr")));
        assertNull(ptr.namespaceIterator());
        assertNull(ptr.namespacePointer("ns"));
        assertNull(ptr.getNamespaceURI());
        assertNull(ptr.getDefaultNamespaceURI());

        TestNodePointer container = new TestNodePointer(null, new QName("cont"), "contVal");
        TestNodePointer target = new TestNodePointer(null, new QName("target"), "targetVal");
        container.setImmediateValuePointer(target);

        assertNull(container.childIterator(null, false, null));
        assertNull(container.attributeIterator(new QName("attr")));
    }

    @Test
    public void testIsDefaultNamespace() {
        TestNodePointer ptr = new TestNodePointer(null);
        assertTrue(ptr.isDefaultNamespace(null));

        ptr.setTestNamespaceURI("http://example.com");
        ptr.setTestDefaultNamespaceURI("http://example.com");
        assertTrue(ptr.isDefaultNamespace("anyPrefix"));

        ptr.setTestDefaultNamespaceURI("http://other.com");
        assertFalse(ptr.isDefaultNamespace("anyPrefix"));

        ptr.setTestNamespaceURI(null);
        assertFalse(ptr.isDefaultNamespace("anyPrefix"));
    }

    @Test
    public void testGetPointerByIDAndKey() {
        Object bean = new Object();
        JXPathContext context = JXPathContext.newContext(bean);
        TestNodePointer ptr = new TestNodePointer(null);

        Pointer p1 = ptr.getPointerByID(context, "id1");
        assertNotNull(p1);

        Pointer p2 = ptr.getPointerByKey(context, "key1", "val1");
        assertNotNull(p2);
    }

    @Test
    public void testAsPathAndToString() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootVal");
        assertEquals("/root", root.asPath());
        assertEquals("/root", root.toString());

        TestNodePointer child = new TestNodePointer(root, new QName("child"), "childVal");
        assertEquals("/root/child", child.asPath());

        TestNodePointer attr = new TestNodePointer(child, new QName("id"), "123");
        attr.setAttribute(true);
        assertEquals("/root/child/@id", attr.asPath());

        TestNodePointer item = new TestNodePointer(root, new QName("item"), "itemVal");
        item.setCollection(true);
        item.setIndex(1);
        assertEquals("/root/item[2]", item.asPath());

        TestNodePointer container = new TestNodePointer(root, new QName("container"), "cVal");
        container.setContainer(true);
        TestNodePointer insideContainer = new TestNodePointer(container, new QName("inside"), "iVal");
        assertEquals("/root/container", insideContainer.asPath());
    }

    @Test
    public void testClone() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootVal");
        TestNodePointer child = new TestNodePointer(root, new QName("child"), "childVal");

        TestNodePointer clonedChild = (TestNodePointer) child.clone();
        assertNotNull(clonedChild);
        assertNotSame(child, clonedChild);
        assertNotNull(clonedChild.getImmediateParentPointer());
        assertNotSame(root, clonedChild.getImmediateParentPointer());
        assertEquals(child.asPath(), clonedChild.asPath());
    }

    @Test
    public void testCompareTo_sameParent() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootVal");
        TestNodePointer childA = new TestNodePointer(root, new QName("a"), "valA");
        TestNodePointer childB = new TestNodePointer(root, new QName("b"), "valB");

        assertTrue(childA.compareTo(childB) < 0);
        assertTrue(childB.compareTo(childA) > 0);
        assertEquals(0, childA.compareTo(childA));
    }

    @Test
    public void testCompareTo_differentDepthsSameTree() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootVal");
        TestNodePointer child1 = new TestNodePointer(root, new QName("child1"), "val1");
        TestNodePointer child2 = new TestNodePointer(root, new QName("child2"), "val2");
        TestNodePointer grandChild = new TestNodePointer(child1, new QName("grandChild"), "valG");

        assertTrue(grandChild.compareTo(child2) < 0);
        assertTrue(child2.compareTo(grandChild) > 0);
    }

    @Test
    public void testCompareTo_differentBranchesSameDepth() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootVal");
        TestNodePointer branchA = new TestNodePointer(root, new QName("branchA"), "valA");
        TestNodePointer branchB = new TestNodePointer(root, new QName("branchB"), "valB");
        TestNodePointer leafA = new TestNodePointer(branchA, new QName("leaf"), "leafA");
        TestNodePointer leafB = new TestNodePointer(branchB, new QName("leaf"), "leafB");

        assertTrue(leafA.compareTo(leafB) < 0);
        assertTrue(leafB.compareTo(leafA) > 0);
    }

    @Test
    public void testCompareTo_bothRoots() {
        TestNodePointer root1 = new TestNodePointer(null, new QName("root"), "val");
        TestNodePointer root2 = new TestNodePointer(null, new QName("root"), "val");
        assertEquals(0, root1.compareTo(root2));
    }

    @Test(expected = JXPathException.class)
    public void testCompareTo_differentTrees_throwsException() {
        TestNodePointer root1 = new TestNodePointer(null, new QName("tree1"), "val1");
        TestNodePointer root2 = new TestNodePointer(null, new QName("tree2"), "val2");
        TestNodePointer child1 = new TestNodePointer(root1, new QName("child1"), "c1");
        TestNodePointer child2 = new TestNodePointer(root2, new QName("child2"), "c2");

        child1.compareTo(child2);
    }

    @Test
    public void testPrintPointerChain() {
        TestNodePointer root = new TestNodePointer(null, new QName("root"), "rootVal");
        TestNodePointer child = new TestNodePointer(root, new QName("child"), "childVal");

        root.printPointerChain();
        child.printPointerChain();
    }
}
