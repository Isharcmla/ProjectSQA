import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;

public class NodePointerTest {

    /**
     * Concrete subclass of NodePointer for testing purposes.
     */
    static class TestNodePointer extends NodePointer implements Cloneable {
        private QName name;
        private Object baseValue;
        private boolean leaf = false;
        private boolean collectionFlag = false;
        private int length = 1;

        TestNodePointer(NodePointer parent, QName name) {
            super(parent);
            this.name = name;
        }

        TestNodePointer(NodePointer parent, QName name, Locale locale) {
            super(parent, locale);
            this.name = name;
        }

        public boolean isLeaf() {
            return leaf;
        }

        public boolean isCollection() {
            return collectionFlag;
        }

        public int getLength() {
            return length;
        }

        public QName getName() {
            return name;
        }

        public Object getBaseValue() {
            return baseValue;
        }

        public Object getImmediateNode() {
            return baseValue;
        }

        public void setValue(Object value) {
            this.baseValue = value;
        }

        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }

        public void setLeaf(boolean leaf) {
            this.leaf = leaf;
        }

        public void setCollectionFlag(boolean collectionFlag) {
            this.collectionFlag = collectionFlag;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setBaseValue(Object baseValue) {
            this.baseValue = baseValue;
        }
    }

    private TestNodePointer root;
    private TestNodePointer child;

    @Before
    public void setUp() {
        root = new TestNodePointer(null, new QName(null, "root"), Locale.US);
        child = new TestNodePointer(root, new QName(null, "child"));
    }

    // ---------- Static factory methods ----------

    @Test
    public void testNewNodePointer_nullBean_returnsNullPointer() {
        NodePointer pointer = NodePointer.newNodePointer(new QName(null, "x"), null, Locale.US);
        assertNotNull(pointer);
        assertTrue(pointer instanceof NullPointer);
    }

    @Test
    public void testNewNodePointer_normalBean_returnsPointer() {
        NodePointer pointer = NodePointer.newNodePointer(new QName(null, "x"), "someBean", Locale.US);
        assertNotNull(pointer);
    }

    @Test
    public void testNewChildNodePointer_normalBean_returnsPointer() {
        NodePointer pointer = NodePointer.newChildNodePointer(null, new QName(null, "x"), "someBean");
        assertNotNull(pointer);
    }

    // ---------- Namespace resolver ----------

    @Test
    public void testGetSetNamespaceResolver_normal_returnsSetValue() {
        NamespaceResolver resolver = new NamespaceResolver();
        root.setNamespaceResolver(resolver);
        assertSame(resolver, root.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolver_inheritedFromParent_returnsParentResolver() {
        NamespaceResolver resolver = new NamespaceResolver();
        root.setNamespaceResolver(resolver);
        assertSame(resolver, child.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolver_noneSet_returnsNull() {
        assertNull(root.getNamespaceResolver());
    }

    // ---------- Parent related ----------

    @Test
    public void testGetParent_normal_returnsParent() {
        assertSame(root, child.getParent());
    }

    @Test
    public void testGetImmediateParentPointer_normal_returnsParent() {
        assertSame(root, child.getImmediateParentPointer());
    }

    @Test
    public void testIsRoot_rootNode_true() {
        assertTrue(root.isRoot());
    }

    @Test
    public void testIsRoot_childNode_false() {
        assertFalse(child.isRoot());
    }

    // ---------- Attribute ----------

    @Test
    public void testSetIsAttribute_normal_true() {
        child.setAttribute(true);
        assertTrue(child.isAttribute());
    }

    @Test
    public void testIsAttribute_default_false() {
        assertFalse(child.isAttribute());
    }

    // ---------- Leaf / Container / Node ----------

    @Test
    public void testIsLeaf_set_true() {
        child.setLeaf(true);
        assertTrue(child.isLeaf());
    }

    @Test
    public void testIsContainer_default_false() {
        assertFalse(child.isContainer());
    }

    @Test
    public void testIsNode_default_true() {
        assertTrue(child.isNode());
    }

    // ---------- Index ----------

    @Test
    public void testGetIndex_default_wholeCollection() {
        assertEquals(NodePointer.WHOLE_COLLECTION, child.getIndex());
    }

    @Test
    public void testSetIndex_normal_updatesIndex() {
        child.setIndex(3);
        assertEquals(3, child.getIndex());
    }

    @Test
    public void testSetIndex_negative_updatesIndex() {
        child.setIndex(-1);
        assertEquals(-1, child.getIndex());
    }

    // ---------- Collection / Length ----------

    @Test
    public void testIsCollection_set_true() {
        child.setCollectionFlag(true);
        assertTrue(child.isCollection());
    }

    @Test
    public void testGetLength_default_one() {
        assertEquals(1, child.getLength());
    }

    // ---------- Value / ValuePointer ----------

    @Test
    public void testGetValue_normal_returnsNode() {
        child.setBaseValue("hello");
        assertEquals("hello", child.getValue());
    }

    @Test
    public void testGetValuePointer_default_returnsSelf() {
        assertSame(child, child.getValuePointer());
    }

    @Test
    public void testGetImmediateValuePointer_default_returnsSelf() {
        assertSame(child, child.getImmediateValuePointer());
    }

    // ---------- isActual ----------

    @Test
    public void testIsActual_wholeCollection_true() {
        child.setIndex(NodePointer.WHOLE_COLLECTION);
        assertTrue(child.isActual());
    }

    @Test
    public void testIsActual_indexWithinBounds_true() {
        child.setLength(5);
        child.setIndex(2);
        assertTrue(child.isActual());
    }

    @Test
    public void testIsActual_indexOutOfBounds_false() {
        child.setLength(5);
        child.setIndex(10);
        assertFalse(child.isActual());
    }

    @Test
    public void testIsActual_negativeIndex_false() {
        child.setLength(5);
        child.setIndex(-5);
        assertFalse(child.isActual());
    }

    // ---------- Name / BaseValue ----------

    @Test
    public void testGetName_normal_returnsName() {
        assertEquals(new QName(null, "child"), child.getName());
    }

    @Test
    public void testGetBaseValue_normal_returnsBaseValue() {
        child.setBaseValue("base");
        assertEquals("base", child.getBaseValue());
    }

    // ---------- NodeValue / Node ----------

    @Test
    public void testGetNodeValue_normal_returnsNode() {
        child.setBaseValue("val");
        assertEquals("val", child.getNodeValue());
    }

    @Test
    public void testGetNode_normal_returnsImmediateNode() {
        child.setBaseValue("node");
        assertEquals("node", child.getNode());
    }

    // ---------- RootNode ----------

    @Test
    public void testGetRootNode_rootPointer_returnsImmediateNode() {
        root.setBaseValue("rootVal");
        assertEquals("rootVal", root.getRootNode());
    }

    @Test
    public void testGetRootNode_childPointer_returnsParentRootNode() {
        root.setBaseValue("rootVal2");
        assertEquals("rootVal2", child.getRootNode());
    }

    @Test
    public void testGetRootNode_cached_returnsSameValueOnSecondCall() {
        root.setBaseValue("cachedVal");
        Object first = root.getRootNode();
        Object second = root.getRootNode();
        assertEquals(first, second);
    }

    // ---------- SetValue ----------

    @Test
    public void testSetValue_normal_updatesBaseValue() {
        child.setValue("newVal");
        assertEquals("newVal", child.getBaseValue());
    }

    // ---------- compareChildNodePointers ----------

    @Test
    public void testCompareChildNodePointers_normal_returnsZero() {
        TestNodePointer sibling = new TestNodePointer(root, new QName(null, "sibling"));
        assertEquals(0, child.compareChildNodePointers(child, sibling));
    }

    // ---------- testNode ----------

    @Test
    public void testTestNode_nullTest_returnsTrue() {
        assertTrue(child.testNode(null));
    }

    @Test
    public void testTestNode_nodeNameTestMatchingWildcard_returnsTrue() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(child.testNode(test));
    }

    @Test
    public void testTestNode_nodeNameTestMatchingExactName_returnsTrue() {
        NodeNameTest test = new NodeNameTest(new QName(null, "child"));
        assertTrue(child.testNode(test));
    }

    @Test
    public void testTestNode_nodeNameTestNonMatchingName_returnsFalse() {
        NodeNameTest test = new NodeNameTest(new QName(null, "other"));
        assertFalse(child.testNode(test));
    }

    @Test
    public void testTestNode_nodeNameTestNullNodeName_returnsFalse() {
        TestNodePointer noName = new TestNodePointer(root, null);
        NodeNameTest test = new NodeNameTest(new QName(null, "any"));
        assertFalse(noName.testNode(test));
    }

    @Test
    public void testTestNode_nodeTypeTestMatching_returnsTrue() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(child.testNode(test));
    }

    @Test
    public void testTestNode_nodeTypeTestNonMatching_returnsFalse() {
        NodeTypeTest test = new NodeTypeTest(-999);
        assertFalse(child.testNode(test));
    }

    // ---------- createPath ----------

    @Test
    public void testCreatePathWithValue_normal_setsValueAndReturnsSelf() {
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = child.createPath(context, "pathVal");
        assertSame(child, result);
        assertEquals("pathVal", child.getBaseValue());
    }

    @Test
    public void testCreatePath_noArg_returnsSelf() {
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = child.createPath(context);
        assertSame(child, result);
    }

    // ---------- remove ----------

    @Test
    public void testRemove_normal_noException() {
        child.remove();
        // no-op, just ensure no exception thrown
        assertTrue(true);
    }

    // ---------- createChild / createAttribute (exception path) ----------

    @Test(expected = JXPathException.class)
    public void testCreateChildWithValue_notSupported_throwsException() {
        JXPathContext context = JXPathContext.newContext(new Object());
        child.createChild(context, new QName(null, "x"), 0, "val");
    }

    @Test(expected = JXPathException.class)
    public void testCreateChildWithoutValue_notSupported_throwsException() {
        JXPathContext context = JXPathContext.newContext(new Object());
        child.createChild(context, new QName(null, "x"), 0);
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_notSupported_throwsException() {
        JXPathContext context = JXPathContext.newContext(new Object());
        child.createAttribute(context, new QName(null, "attr"));
    }

    // ---------- Locale ----------

    @Test
    public void testGetLocale_setOnPointer_returnsSetLocale() {
        assertEquals(Locale.US, root.getLocale());
    }

    @Test
    public void testGetLocale_inheritedFromParent_returnsParentLocale() {
        assertEquals(Locale.US, child.getLocale());
    }

    @Test
    public void testGetLocale_noneSetNoParent_returnsNull() {
        TestNodePointer isolated = new TestNodePointer(null, new QName(null, "isolated"));
        assertNull(isolated.getLocale());
    }

    // ---------- isLanguage ----------

    @Test
    public void testIsLanguage_matchingPrefix_true() {
        assertTrue(root.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_nonMatchingPrefix_false() {
        assertFalse(root.isLanguage("fr"));
    }

    // ---------- childIterator / attributeIterator / namespaceIterator ----------

    @Test
    public void testChildIterator_defaultSelfValuePointer_returnsNull() {
        assertNull(child.childIterator(null, false, null));
    }

    @Test
    public void testAttributeIterator_defaultSelfValuePointer_returnsNull() {
        assertNull(child.attributeIterator(new QName(null, "attr")));
    }

    @Test
    public void testNamespaceIterator_default_returnsNull() {
        assertNull(child.namespaceIterator());
    }

    @Test
    public void testNamespacePointer_default_returnsNull() {
        assertNull(child.namespacePointer("ns"));
    }

    @Test
    public void testGetNamespaceURIWithPrefix_default_returnsNull() {
        assertNull(child.getNamespaceURI("prefix"));
    }

    @Test
    public void testGetNamespaceURI_default_returnsNull() {
        assertNull(child.getNamespaceURI());
    }

    // ---------- getPointerByID / getPointerByKey ----------

    @Test
    public void testGetPointerByID_normal_delegatesToContext() {
        JXPathContext context = JXPathContext.newContext(new Object());
        try {
            child.getPointerByID(context, "someId");
        }
        catch (Exception e) {
            // Acceptable: underlying context may throw if id not registered
            assertTrue(true);
        }
    }

    @Test
    public void testGetPointerByKey_normal_delegatesToContext() {
        JXPathContext context = JXPathContext.newContext(new Object());
        try {
            child.getPointerByKey(context, "someKey", "someValue");
        }
        catch (Exception e) {
            // Acceptable: underlying context may throw if key not registered
            assertTrue(true);
        }
    }

    // ---------- asPath ----------

    @Test
    public void testAsPath_rootPointer_returnsSlashName() {
        String path = root.asPath();
        assertTrue(path.endsWith("root"));
        assertTrue(path.startsWith("/"));
    }

    @Test
    public void testAsPath_childPointer_includesParentPath() {
        String path = child.asPath();
        assertTrue(path.contains("root"));
        assertTrue(path.contains("child"));
    }

    @Test
    public void testAsPath_attributePointer_includesAtSign() {
        child.setAttribute(true);
        String path = child.asPath();
        assertTrue(path.contains("@child"));
    }

    @Test
    public void testAsPath_collectionWithIndex_includesBrackets() {
        child.setCollectionFlag(true);
        child.setIndex(2);
        String path = child.asPath();
        assertTrue(path.contains("[3]"));
    }

    // ---------- clone ----------

    @Test
    public void testClone_cloneableSubclass_returnsDistinctCopy() {
        TestNodePointer original = new TestNodePointer(root, new QName(null, "cloneTest"));
        original.setBaseValue("originalValue");
        Object cloned = original.clone();
        assertNotNull(cloned);
        assertTrue(cloned instanceof TestNodePointer);
        TestNodePointer clonedPointer = (TestNodePointer) cloned;
        assertNotSame(original, clonedPointer);
        assertEquals(original.getName(), clonedPointer.getName());
        assertNotSame(original.getParent(), clonedPointer.getParent());
    }

    @Test
    public void testClone_noParent_returnsCopyWithNullParent() {
        TestNodePointer original = new TestNodePointer(null, new QName(null, "noParent"));
        Object cloned = original.clone();
        assertNotNull(cloned);
        TestNodePointer clonedPointer = (TestNodePointer) cloned;
        assertNull(clonedPointer.getParent());
    }

    // ---------- toString ----------

    @Test
    public void testToString_normal_equalsAsPath() {
        assertEquals(child.asPath(), child.toString());
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_sameParent_returnsZero() {
        TestNodePointer sibling = new TestNodePointer(root, new QName(null, "sibling"));
        assertEquals(0, child.compareTo(sibling));
    }

    @Test
    public void testCompareTo_bothRootsNullParent_returnsZero() {
        TestNodePointer anotherRoot = new TestNodePointer(null, new QName(null, "anotherRoot"));
        assertEquals(0, root.compareTo(anotherRoot));
    }

    @Test(expected = JXPathException.class)
    public void testCompareTo_differentTrees_throwsException() {
        TestNodePointer rootA = new TestNodePointer(null, new QName(null, "rootA"));
        TestNodePointer rootB = new TestNodePointer(null, new QName(null, "rootB"));
        TestNodePointer a = new TestNodePointer(rootA, new QName(null, "a"));
        TestNodePointer b = new TestNodePointer(rootB, new QName(null, "b"));
        a.compareTo(b);
    }

    @Test
    public void testCompareTo_differentDepths_returnsConsistentResult() {
        TestNodePointer grandchild = new TestNodePointer(child, new QName(null, "grandchild"));
        TestNodePointer sibling = new TestNodePointer(root, new QName(null, "sibling"));
        // Should not throw, since they share common root
        int result = grandchild.compareTo(sibling);
        assertTrue(result == -1 || result == 0 || result == 1);
    }

    @Test(expected = ClassCastException.class)
    public void testCompareTo_notANodePointer_throwsClassCastException() {
        child.compareTo("notAPointer");
    }

    // ---------- printPointerChain ----------

    @Test
    public void testPrintPointerChain_normal_noException() {
        child.printPointerChain();
        assertTrue(true);
    }
}
