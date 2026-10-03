package org.apache.commons.collections4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class IteratorUtilsTest {

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor<IteratorUtils> constructor = IteratorUtils.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void testConstants() {
        assertSame(EmptyIterator.RESETTABLE_INSTANCE, IteratorUtils.EMPTY_ITERATOR);
        assertSame(EmptyListIterator.RESETTABLE_INSTANCE, IteratorUtils.EMPTY_LIST_ITERATOR);
        assertSame(EmptyOrderedIterator.INSTANCE, IteratorUtils.EMPTY_ORDERED_ITERATOR);
        assertSame(EmptyMapIterator.INSTANCE, IteratorUtils.EMPTY_MAP_ITERATOR);
        assertSame(EmptyOrderedMapIterator.INSTANCE, IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR);
    }

    @Test
    public void testEmptyIterators() {
        assertFalse(IteratorUtils.emptyIterator().hasNext());
        assertFalse(IteratorUtils.emptyListIterator().hasNext());
        assertFalse(IteratorUtils.emptyOrderedIterator().hasNext());
        assertFalse(IteratorUtils.emptyMapIterator().hasNext());
        assertFalse(IteratorUtils.emptyOrderedMapIterator().hasNext());
    }

    @Test
    public void testSingletonIterator() {
        ResettableIterator<String> it = IteratorUtils.singletonIterator("test");
        assertTrue(it.hasNext());
        assertEquals("test", it.next());
        assertFalse(it.hasNext());
        it.reset();
        assertTrue(it.hasNext());
    }

    @Test
    public void testSingletonListIterator() {
        ListIterator<String> it = IteratorUtils.singletonListIterator("test");
        assertTrue(it.hasNext());
        assertEquals("test", it.next());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
        assertEquals("test", it.previous());
    }

    @Test
    public void testArrayIterator_varargs() {
        ResettableIterator<String> it = IteratorUtils.arrayIterator("a", "b");
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testArrayIterator_varargsNull() {
        IteratorUtils.arrayIterator((Object[]) null);
    }

    @Test
    public void testArrayIterator_objectArray() {
        int[] array = new int[] { 1, 2, 3 };
        ResettableIterator<Integer> it = IteratorUtils.arrayIterator((Object) array);
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayIterator_notAnArray() {
        IteratorUtils.arrayIterator("not an array");
    }

    @Test
    public void testArrayIterator_arrayStart() {
        String[] array = new String[] { "a", "b", "c" };
        ResettableIterator<String> it = IteratorUtils.arrayIterator(array, 1);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIterator_primitiveArrayStart() {
        int[] array = new int[] { 1, 2, 3 };
        ResettableIterator<Integer> it = IteratorUtils.arrayIterator((Object) array, 1);
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(3), it.next());
    }

    @Test
    public void testArrayIterator_arrayStartEnd() {
        String[] array = new String[] { "a", "b", "c", "d" };
        ResettableIterator<String> it = IteratorUtils.arrayIterator(array, 1, 3);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIterator_primitiveArrayStartEnd() {
        int[] array = new int[] { 1, 2, 3, 4 };
        ResettableIterator<Integer> it = IteratorUtils.arrayIterator((Object) array, 1, 3);
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayListIterator_varargs() {
        ResettableListIterator<String> it = IteratorUtils.arrayListIterator("a", "b");
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayListIterator_objectArray() {
        int[] array = new int[] { 1, 2 };
        ResettableListIterator<Integer> it = IteratorUtils.arrayListIterator((Object) array);
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.next());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayListIterator_notAnArray() {
        IteratorUtils.arrayListIterator("not an array");
    }

    @Test
    public void testArrayListIterator_arrayStart() {
        String[] array = new String[] { "a", "b", "c" };
        ResettableListIterator<String> it = IteratorUtils.arrayListIterator(array, 1);
        assertEquals("b", it.next());
    }

    @Test
    public void testArrayListIterator_primitiveArrayStart() {
        int[] array = new int[] { 1, 2, 3 };
        ResettableListIterator<Integer> it = IteratorUtils.arrayListIterator((Object) array, 1);
        assertEquals(Integer.valueOf(2), it.next());
    }

    @Test
    public void testArrayListIterator_arrayStartEnd() {
        String[] array = new String[] { "a", "b", "c", "d" };
        ResettableListIterator<String> it = IteratorUtils.arrayListIterator(array, 1, 3);
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayListIterator_primitiveArrayStartEnd() {
        int[] array = new int[] { 1, 2, 3, 4 };
        ResettableListIterator<Integer> it = IteratorUtils.arrayListIterator((Object) array, 1, 3);
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testBoundedIterator() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        BoundedIterator<String> it = IteratorUtils.boundedIterator(list.iterator(), 2);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());

        BoundedIterator<String> itOffset = IteratorUtils.boundedIterator(list.iterator(), 1, 2);
        assertEquals("b", itOffset.next());
        assertEquals("c", itOffset.next());
        assertFalse(itOffset.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBoundedIterator_nullIterator() {
        IteratorUtils.boundedIterator(null, 1);
    }

    @Test
    public void testUnmodifiableIterator() {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b"));
        Iterator<String> it = IteratorUtils.unmodifiableIterator(list.iterator());
        assertEquals("a", it.next());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableIterator_null() {
        IteratorUtils.unmodifiableIterator(null);
    }

    @Test
    public void testUnmodifiableListIterator() {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b"));
        ListIterator<String> it = IteratorUtils.unmodifiableListIterator(list.listIterator());
        assertEquals("a", it.next());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        try {
            it.set("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
        try {
            it.add("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableListIterator_null() {
        IteratorUtils.unmodifiableListIterator(null);
    }

    @Test
    public void testUnmodifiableMapIterator() {
        MapIterator<String, String> empty = IteratorUtils.emptyMapIterator();
        MapIterator<String, String> unmod = IteratorUtils.unmodifiableMapIterator(empty);
        assertNotNull(unmod);
        try {
            unmod.setValue("val");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableMapIterator_null() {
        IteratorUtils.unmodifiableMapIterator(null);
    }

    @Test
    public void testChainedIterator_two() {
        Iterator<String> it1 = Arrays.asList("a", "b").iterator();
        Iterator<String> it2 = Arrays.asList("c", "d").iterator();
        Iterator<String> chain = IteratorUtils.chainedIterator(it1, it2);
        assertEquals("a", chain.next());
        assertEquals("b", chain.next());
        assertEquals("c", chain.next());
        assertEquals("d", chain.next());
        assertFalse(chain.hasNext());
    }

    @Test
    public void testChainedIterator_array() {
        Iterator<String> it1 = Arrays.asList("a").iterator();
        Iterator<String> it2 = Arrays.asList("b").iterator();
        Iterator<String> chain = IteratorUtils.chainedIterator(it1, it2);
        assertEquals("a", chain.next());
        assertEquals("b", chain.next());
        assertFalse(chain.hasNext());
    }

    @Test
    public void testChainedIterator_collection() {
        List<Iterator<? extends String>> list = new ArrayList<Iterator<? extends String>>();
        list.add(Arrays.asList("a").iterator());
        list.add(Arrays.asList("b").iterator());
        Iterator<String> chain = IteratorUtils.chainedIterator(list);
        assertEquals("a", chain.next());
        assertEquals("b", chain.next());
        assertFalse(chain.hasNext());
    }

    @Test
    public void testCollatedIterator_two() {
        Iterator<Integer> it1 = Arrays.asList(1, 3, 5).iterator();
        Iterator<Integer> it2 = Arrays.asList(2, 4, 6).iterator();
        Iterator<Integer> collated = IteratorUtils.collatedIterator(null, it1, it2);
        for (int i = 1; i <= 6; i++) {
            assertEquals(Integer.valueOf(i), collated.next());
        }
        assertFalse(collated.hasNext());
    }

    @Test
    public void testCollatedIterator_array() {
        Iterator<Integer> it1 = Arrays.asList(1, 4).iterator();
        Iterator<Integer> it2 = Arrays.asList(2, 5).iterator();
        Iterator<Integer> it3 = Arrays.asList(3, 6).iterator();
        Iterator<Integer> collated = IteratorUtils.collatedIterator(Comparator.<Integer>naturalOrder(), it1, it2, it3);
        for (int i = 1; i <= 6; i++) {
            assertEquals(Integer.valueOf(i), collated.next());
        }
        assertFalse(collated.hasNext());
    }

    @Test
    public void testCollatedIterator_collection() {
        List<Iterator<? extends Integer>> list = new ArrayList<Iterator<? extends Integer>>();
        list.add(Arrays.asList(1, 3).iterator());
        list.add(Arrays.asList(2, 4).iterator());
        Iterator<Integer> collated = IteratorUtils.collatedIterator(null, list);
        for (int i = 1; i <= 4; i++) {
            assertEquals(Integer.valueOf(i), collated.next());
        }
        assertFalse(collated.hasNext());
    }

    @Test
    public void testObjectGraphIterator() {
        List<String> list = Arrays.asList("a", "b");
        Transformer<Object, Object> transformer = new Transformer<Object, Object>() {
            @Override
            public Object transform(Object input) {
                if (input instanceof List) {
                    return ((List<?>) input).iterator();
                }
                return input;
            }
        };
        Iterator<Object> it = IteratorUtils.objectGraphIterator(list, transformer);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testTransformedIterator() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Transformer<Integer, String> transformer = new Transformer<Integer, String>() {
            @Override
            public String transform(Integer input) {
                return "num" + input;
            }
        };
        Iterator<String> it = IteratorUtils.transformedIterator(list.iterator(), transformer);
        assertEquals("num1", it.next());
        assertEquals("num2", it.next());
        assertEquals("num3", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIterator_nullIterator() {
        IteratorUtils.transformedIterator(null, TransformerUtils.stringValueTransformer());
    }

    @Test(expected = NullPointerException.class)
    public void testTransformedIterator_nullTransformer() {
        IteratorUtils.transformedIterator(Collections.emptyIterator(), null);
    }

    @Test
    public void testFilteredIterator() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Predicate<Integer> evenPredicate = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object % 2 == 0;
            }
        };
        Iterator<Integer> it = IteratorUtils.filteredIterator(list.iterator(), evenPredicate);
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(4), it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredIterator_nullIterator() {
        IteratorUtils.filteredIterator(null, TruePredicate.truePredicate());
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredIterator_nullPredicate() {
        IteratorUtils.filteredIterator(Collections.emptyIterator(), null);
    }

    @Test
    public void testFilteredListIterator() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Predicate<Integer> evenPredicate = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object % 2 == 0;
            }
        };
        ListIterator<Integer> it = IteratorUtils.filteredListIterator(list.listIterator(), evenPredicate);
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(4), it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredListIterator_nullIterator() {
        IteratorUtils.filteredListIterator(null, TruePredicate.truePredicate());
    }

    @Test(expected = NullPointerException.class)
    public void testFilteredListIterator_nullPredicate() {
        IteratorUtils.filteredListIterator(new ArrayList<String>().listIterator(), null);
    }

    @Test
    public void testLoopingIterator() {
        List<String> list = Arrays.asList("a", "b");
        ResettableIterator<String> it = IteratorUtils.loopingIterator(list);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingIterator_null() {
        IteratorUtils.loopingIterator(null);
    }

    @Test
    public void testLoopingListIterator() {
        List<String> list = Arrays.asList("a", "b");
        ResettableListIterator<String> it = IteratorUtils.loopingListIterator(list);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("a", it.next());
    }

    @Test(expected = NullPointerException.class)
    public void testLoopingListIterator_null() {
        IteratorUtils.loopingListIterator(null);
    }

    private static class DummyNodeList implements NodeList {
        private final List<Node> nodes;

        DummyNodeList(List<Node> nodes) {
            this.nodes = nodes;
        }

        @Override
        public Node item(int index) {
            return (index >= 0 && index < nodes.size()) ? nodes.get(index) : null;
        }

        @Override
        public int getLength() {
            return nodes.size();
        }
    }

    private static abstract class DummyNode implements Node {
        private final NodeList children;

        DummyNode(NodeList children) {
            this.children = children;
        }

        @Override
        public NodeList getChildNodes() {
            return children;
        }
    }

    @Test
    public void testNodeListIterator_nodeList() {
        final DummyNode dummyNode = new DummyNode(null) {
            @Override
            public String getNodeName() {
                return "testNode";
            }
            @Override
            public short getNodeType() {
                return Node.ELEMENT_NODE;
            }
            @Override
            public String getNodeValue() {
                return null;
            }
            @Override
            public void setNodeValue(String nodeValue) {}
            @Override
            public Node getParentNode() { return null; }
            @Override
            public Node getFirstChild() { return null; }
            @Override
            public Node getLastChild() { return null; }
            @Override
            public Node getPreviousSibling() { return null; }
            @Override
            public Node getNextSibling() { return null; }
            @Override
            public org.w3c.dom.NamedNodeMap getAttributes() { return null; }
            @Override
            public org.w3c.dom.Document getOwnerDocument() { return null; }
            @Override
            public Node insertBefore(Node newChild, Node refChild) { return null; }
            @Override
            public Node replaceChild(Node newChild, Node oldChild) { return null; }
            @Override
            public Node removeChild(Node oldChild) { return null; }
            @Override
            public Node appendChild(Node newChild) { return null; }
            @Override
            public boolean hasChildNodes() { return false; }
            @Override
            public Node cloneNode(boolean deep) { return null; }
            @Override
            public void normalize() {}
            @Override
            public boolean isSupported(String feature, String version) { return false; }
            @Override
            public String getNamespaceURI() { return null; }
            @Override
            public String getPrefix() { return null; }
            @Override
            public void setPrefix(String prefix) {}
            @Override
            public String getLocalName() { return null; }
            @Override
            public boolean hasAttributes() { return false; }
            @Override
            public String getBaseURI() { return null; }
            @Override
            public short compareDocumentPosition(Node other) { return 0; }
            @Override
            public String getTextContent() { return null; }
            @Override
            public void setTextContent(String textContent) {}
            @Override
            public boolean isSameNode(Node other) { return false; }
            @Override
            public String lookupPrefix(String namespaceURI) { return null; }
            @Override
            public boolean isDefaultNamespace(String namespaceURI) { return false; }
            @Override
            public String lookupNamespaceURI(String prefix) { return null; }
            @Override
            public boolean isEqualNode(Node arg) { return false; }
            @Override
            public Object getFeature(String feature, String version) { return null; }
            @Override
            public Object setUserData(String key, Object data, org.w3c.dom.UserDataHandler handler) { return null; }
            @Override
            public Object getUserData(String key) { return null; }
        };

        DummyNodeList nl = new DummyNodeList(Arrays.<Node>asList(dummyNode));
        NodeListIterator it = IteratorUtils.nodeListIterator(nl);
        assertTrue(it.hasNext());
        assertSame(dummyNode, it.next());
        assertFalse(it.hasNext());

        DummyNode parent = new DummyNode(nl) {
            @Override public String getNodeName() { return null; }
            @Override public String getNodeValue() { return null; }
            @Override public void setNodeValue(String nodeValue) {}
            @Override public short getNodeType() { return 0; }
            @Override public Node getParentNode() { return null; }
            @Override public Node getFirstChild() { return null; }
            @Override public Node getLastChild() { return null; }
            @Override public Node getPreviousSibling() { return null; }
            @Override public Node getNextSibling() { return null; }
            @Override public org.w3c.dom.NamedNodeMap getAttributes() { return null; }
            @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
            @Override public Node insertBefore(Node newChild, Node refChild) { return null; }
            @Override public Node replaceChild(Node newChild, Node oldChild) { return null; }
            @Override public Node removeChild(Node oldChild) { return null; }
            @Override public Node appendChild(Node newChild) { return null; }
            @Override public boolean hasChildNodes() { return false; }
            @Override public Node cloneNode(boolean deep) { return null; }
            @Override public void normalize() {}
            @Override public boolean isSupported(String feature, String version) { return false; }
            @Override public String getNamespaceURI() { return null; }
            @Override public String getPrefix() { return null; }
            @Override public void setPrefix(String prefix) {}
            @Override public String getLocalName() { return null; }
            @Override public boolean hasAttributes() { return false; }
            @Override public String getBaseURI() { return null; }
            @Override public short compareDocumentPosition(Node other) { return 0; }
            @Override public String getTextContent() { return null; }
            @Override public void setTextContent(String textContent) {}
            @Override public boolean isSameNode(Node other) { return false; }
            @Override public String lookupPrefix(String namespaceURI) { return null; }
            @Override public boolean isDefaultNamespace(String namespaceURI) { return false; }
            @Override public String lookupNamespaceURI(String prefix) { return null; }
            @Override public boolean isEqualNode(Node arg) { return false; }
            @Override public Object getFeature(String feature, String version) { return null; }
            @Override public Object setUserData(String key, Object data, org.w3c.dom.UserDataHandler handler) { return null; }
            @Override public Object getUserData(String key) { return null; }
        };

        NodeListIterator itNode = IteratorUtils.nodeListIterator((Node) parent);
        assertTrue(itNode.hasNext());
        assertSame(dummyNode, itNode.next());
    }

    @Test(expected = NullPointerException.class)
    public void testNodeListIterator_nullNodeList() {
        IteratorUtils.nodeListIterator((NodeList) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNodeListIterator_nullNode() {
        IteratorUtils.nodeListIterator((Node) null);
    }

    @Test
    public void testPeekingIterator() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        Iterator<String> peeking = IteratorUtils.peekingIterator(it);
        assertEquals("a", peeking.next());
    }

    @Test(expected = NullPointerException.class)
    public void testPeekingIterator_null() {
        IteratorUtils.peekingIterator(null);
    }

    @Test
    public void testPushbackIterator() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        Iterator<String> pushback = IteratorUtils.pushbackIterator(it);
        assertEquals("a", pushback.next());
    }

    @Test(expected = NullPointerException.class)
    public void testPushbackIterator_null() {
        IteratorUtils.pushbackIterator(null);
    }

    @Test
    public void testSkippingIterator() {
        Iterator<String> it = Arrays.asList("a", "b", "c").iterator();
        SkippingIterator<String> skipping = IteratorUtils.skippingIterator(it, 1);
        assertEquals("b", skipping.next());
        assertEquals("c", skipping.next());
        assertFalse(skipping.hasNext());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkippingIterator_null() {
        IteratorUtils.skippingIterator(null, 1);
    }

    @Test
    public void testZippingIterator() {
        Iterator<String> it1 = Arrays.asList("a1", "a2").iterator();
        Iterator<String> it2 = Arrays.asList("b1", "b2").iterator();
        Iterator<String> it3 = Arrays.asList("c1", "c2").iterator();

        ZippingIterator<String> zip2 = IteratorUtils.zippingIterator(it1, it2);
        assertEquals("a1", zip2.next());
        assertEquals("b1", zip2.next());
        assertEquals("a2", zip2.next());
        assertEquals("b2", zip2.next());

        it1 = Arrays.asList("a1").iterator();
        it2 = Arrays.asList("b1").iterator();
        ZippingIterator<String> zip3 = IteratorUtils.zippingIterator(it1, it2, it3);
        assertEquals("a1", zip3.next());
        assertEquals("b1", zip3.next());
        assertEquals("c1", zip3.next());
        assertEquals("c2", zip3.next());

        it1 = Arrays.asList("a").iterator();
        it2 = Arrays.asList("b").iterator();
        ZippingIterator<String> zipArr = IteratorUtils.zippingIterator(new Iterator[] { it1, it2 });
        assertEquals("a", zipArr.next());
        assertEquals("b", zipArr.next());
    }

    @Test
    public void testAsIterator() {
        Vector<String> vector = new Vector<String>(Arrays.asList("a", "b"));
        Enumeration<String> en = vector.elements();
        Iterator<String> it = IteratorUtils.asIterator(en);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test(expected = NullPointerException.class)
    public void testAsIterator_null() {
        IteratorUtils.asIterator(null);
    }

    @Test
    public void testAsIterator_withRemoveCollection() {
        Vector<String> vector = new Vector<String>(Arrays.asList("a", "b"));
        List<String> removeList = new ArrayList<String>(Arrays.asList("a", "b"));
        Iterator<String> it = IteratorUtils.asIterator(vector.elements(), removeList);
        assertEquals("a", it.next());
        it.remove();
        assertEquals(1, removeList.size());
        assertEquals("b", removeList.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void testAsIterator_withRemoveCollection_nullEnum() {
        IteratorUtils.asIterator(null, new ArrayList<String>());
    }

    @Test(expected = NullPointerException.class)
    public void testAsIterator_withRemoveCollection_nullColl() {
        Vector<String> vector = new Vector<String>();
        IteratorUtils.asIterator(vector.elements(), null);
    }

    @Test
    public void testAsEnumeration() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        Enumeration<String> en = IteratorUtils.asEnumeration(it);
        assertTrue(en.hasMoreElements());
        assertEquals("a", en.nextElement());
        assertEquals("b", en.nextElement());
        assertFalse(en.hasMoreElements());
    }

    @Test(expected = NullPointerException.class)
    public void testAsEnumeration_null() {
        IteratorUtils.asEnumeration(null);
    }

    @Test
    public void testAsIterable() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        Iterable<String> iterable = IteratorUtils.asIterable(it);
        int count = 0;
        for (String s : iterable) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test(expected = NullPointerException.class)
    public void testAsIterable_null() {
        IteratorUtils.asIterable(null);
    }

    @Test
    public void testAsMultipleUseIterable() {
        List<String> list = Arrays.asList("a", "b");
        Iterable<String> iterable = IteratorUtils.asMultipleUseIterable(list.iterator());
        int count1 = 0;
        for (String s : iterable) {
            count1++;
        }
        assertEquals(2, count1);

        int count2 = 0;
        for (String s : iterable) {
            count2++;
        }
        assertEquals(2, count2);
    }

    @Test(expected = NullPointerException.class)
    public void testAsMultipleUseIterable_null() {
        IteratorUtils.asMultipleUseIterable(null);
    }

    @Test
    public void testToListIterator() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        ListIterator<String> listIt = IteratorUtils.toListIterator(it);
        assertTrue(listIt.hasNext());
        assertEquals("a", listIt.next());
        assertEquals("b", listIt.next());
        assertTrue(listIt.hasPrevious());
        assertEquals("b", listIt.previous());
    }

    @Test(expected = NullPointerException.class)
    public void testToListIterator_null() {
        IteratorUtils.toListIterator(null);
    }

    @Test
    public void testToArray() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        Object[] array = IteratorUtils.toArray(it);
        assertArrayEquals(new Object[] { "a", "b" }, array);
    }

    @Test(expected = NullPointerException.class)
    public void testToArray_null() {
        IteratorUtils.toArray(null);
    }

    @Test
    public void testToArray_withClass() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        String[] array = IteratorUtils.toArray(it, String.class);
        assertArrayEquals(new String[] { "a", "b" }, array);
    }

    @Test(expected = NullPointerException.class)
    public void testToArray_withClass_nullIt() {
        IteratorUtils.toArray(null, String.class);
    }

    @Test(expected = NullPointerException.class)
    public void testToArray_withClass_nullClass() {
        IteratorUtils.toArray(Collections.emptyIterator(), null);
    }

    @Test
    public void testToList() {
        Iterator<String> it = Arrays.asList("a", "b").iterator();
        List<String> list = IteratorUtils.toList(it);
        assertEquals(Arrays.asList("a", "b"), list);

        it = Arrays.asList("c", "d").iterator();
        List<String> listWithSize = IteratorUtils.toList(it, 5);
        assertEquals(Arrays.asList("c", "d"), listWithSize);
    }

    @Test(expected = NullPointerException.class)
    public void testToList_null() {
        IteratorUtils.toList(null);
    }

    @Test(expected = NullPointerException.class)
    public void testToList_withSize_null() {
        IteratorUtils.toList(null, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToList_invalidSize() {
        IteratorUtils.toList(Collections.emptyIterator(), 0);
    }

    private static class IterableClass {
        public Iterator<String> iterator() {
            return Arrays.asList("x", "y").iterator();
        }
    }

    private static class ReflectiveThrows {
        public Iterator<String> iterator() {
            throw new RuntimeException("reflection fail");
        }
    }

    @Test
    public void testGetIterator() {
        assertFalse(IteratorUtils.getIterator(null).hasNext());

        Iterator<String> it = Arrays.asList("a").iterator();
        assertSame(it, IteratorUtils.getIterator(it));

        Iterable<String> iterable = Arrays.asList("a");
        assertEquals("a", IteratorUtils.getIterator(iterable).next());

        Object[] objArr = new Object[] { "a", "b" };
        assertEquals("a", IteratorUtils.getIterator(objArr).next());

        Vector<String> vec = new Vector<String>(Arrays.asList("a"));
        assertEquals("a", IteratorUtils.getIterator(vec.elements()).next());

        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "val");
        assertEquals("val", IteratorUtils.getIterator(map).next());

        final DummyNode dummyNode = new DummyNode(null) {
            @Override public String getNodeName() { return null; }
            @Override public String getNodeValue() { return null; }
            @Override public void setNodeValue(String nodeValue) {}
            @Override public short getNodeType() { return 0; }
            @Override public Node getParentNode() { return null; }
            @Override public Node getFirstChild() { return null; }
            @Override public Node getLastChild() { return null; }
            @Override public Node getPreviousSibling() { return null; }
            @Override public Node getNextSibling() { return null; }
            @Override public org.w3c.dom.NamedNodeMap getAttributes() { return null; }
            @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
            @Override public Node insertBefore(Node newChild, Node refChild) { return null; }
            @Override public Node replaceChild(Node newChild, Node oldChild) { return null; }
            @Override public Node removeChild(Node oldChild) { return null; }
            @Override public Node appendChild(Node newChild) { return null; }
            @Override public boolean hasChildNodes() { return false; }
            @Override public Node cloneNode(boolean deep) { return null; }
            @Override public void normalize() {}
            @Override public boolean isSupported(String feature, String version) { return false; }
            @Override public String getNamespaceURI() { return null; }
            @Override public String getPrefix() { return null; }
            @Override public void setPrefix(String prefix) {}
            @Override public String getLocalName() { return null; }
            @Override public boolean hasAttributes() { return false; }
            @Override public String getBaseURI() { return null; }
            @Override public short compareDocumentPosition(Node other) { return 0; }
            @Override public String getTextContent() { return null; }
            @Override public void setTextContent(String textContent) {}
            @Override public boolean isSameNode(Node other) { return false; }
            @Override public String lookupPrefix(String namespaceURI) { return null; }
            @Override public boolean isDefaultNamespace(String namespaceURI) { return false; }
            @Override public String lookupNamespaceURI(String prefix) { return null; }
            @Override public boolean isEqualNode(Node arg) { return false; }
            @Override public Object getFeature(String feature, String version) { return null; }
            @Override public Object setUserData(String key, Object data, org.w3c.dom.UserDataHandler handler) { return null; }
            @Override public Object getUserData(String key) { return null; }
        };

        DummyNodeList nl = new DummyNodeList(Arrays.<Node>asList(dummyNode));
        assertEquals(dummyNode, IteratorUtils.getIterator(nl).next());

        DummyNode parent = new DummyNode(nl) {
            @Override public String getNodeName() { return null; }
            @Override public String getNodeValue() { return null; }
            @Override public void setNodeValue(String nodeValue) {}
            @Override public short getNodeType() { return 0; }
            @Override public Node getParentNode() { return null; }
            @Override public Node getFirstChild() { return null; }
            @Override public Node getLastChild() { return null; }
            @Override public Node getPreviousSibling() { return null; }
            @Override public Node getNextSibling() { return null; }
            @Override public org.w3c.dom.NamedNodeMap getAttributes() { return null; }
            @Override public org.w3c.dom.Document getOwnerDocument() { return null; }
            @Override public Node insertBefore(Node newChild, Node refChild) { return null; }
            @Override public Node replaceChild(Node newChild, Node oldChild) { return null; }
            @Override public Node removeChild(Node oldChild) { return null; }
            @Override public Node appendChild(Node newChild) { return null; }
            @Override public boolean hasChildNodes() { return false; }
            @Override public Node cloneNode(boolean deep) { return null; }
            @Override public void normalize() {}
            @Override public boolean isSupported(String feature, String version) { return false; }
            @Override public String getNamespaceURI() { return null; }
            @Override public String getPrefix() { return null; }
            @Override public void setPrefix(String prefix) {}
            @Override public String getLocalName() { return null; }
            @Override public boolean hasAttributes() { return false; }
            @Override public String getBaseURI() { return null; }
            @Override public short compareDocumentPosition(Node other) { return 0; }
            @Override public String getTextContent() { return null; }
            @Override public void setTextContent(String textContent) {}
            @Override public boolean isSameNode(Node other) { return false; }
            @Override public String lookupPrefix(String namespaceURI) { return null; }
            @Override public boolean isDefaultNamespace(String namespaceURI) { return false; }
            @Override public String lookupNamespaceURI(String prefix) { return null; }
            @Override public boolean isEqualNode(Node arg) { return false; }
            @Override public Object getFeature(String feature, String version) { return null; }
            @Override public Object setUserData(String key, Object data, org.w3c.dom.UserDataHandler handler) { return null; }
            @Override public Object getUserData(String key) { return null; }
        };
        assertEquals(dummyNode, IteratorUtils.getIterator((Node) parent).next());

        Hashtable<String, String> dict = new Hashtable<String, String>();
        dict.put("k", "v");
        assertEquals("v", IteratorUtils.getIterator(dict).next());

        int[] primArr = new int[] { 42 };
        assertEquals(Integer.valueOf(42), IteratorUtils.getIterator(primArr).next());

        IterableClass reflective = new IterableClass();
        Iterator<?> refIt = IteratorUtils.getIterator(reflective);
        assertEquals("x", refIt.next());
        assertEquals("y", refIt.next());

        ReflectiveThrows refThrows = new ReflectiveThrows();
        Iterator<?> fallbackIt = IteratorUtils.getIterator(refThrows);
        assertEquals(refThrows, fallbackIt.next());

        Object plainObj = 12345;
        Iterator<?> plainIt = IteratorUtils.getIterator(plainObj);
        assertEquals(12345, plainIt.next());
    }

    @Test
    public void testApply() {
        final List<String> result = new ArrayList<String>();
        Closure<String> closure = new Closure<String>() {
            @Override
            public void execute(String input) {
                result.add(input);
            }
        };
        IteratorUtils.apply(Arrays.asList("a", "b").iterator(), closure);
        assertEquals(Arrays.asList("a", "b"), result);

        IteratorUtils.apply(null, closure);
    }

    @Test(expected = NullPointerException.class)
    public void testApply_nullClosure() {
        IteratorUtils.apply(Collections.emptyIterator(), null);
    }

    @Test
    public void testFind() {
        Predicate<Integer> predicate = EqualPredicate.equalPredicate(3);
        Integer found = IteratorUtils.find(Arrays.asList(1, 2, 3, 4).iterator(), predicate);
        assertEquals(Integer.valueOf(3), found);

        Integer notFound = IteratorUtils.find(Arrays.asList(1, 2).iterator(), predicate);
        assertNull(notFound);

        assertNull(IteratorUtils.find(null, predicate));
    }

    @Test(expected = NullPointerException.class)
    public void testFind_nullPredicate() {
        IteratorUtils.find(Collections.emptyIterator(), null);
    }

    @Test
    public void testMatchesAny() {
        Predicate<Integer> predicate = EqualPredicate.equalPredicate(3);
        assertTrue(IteratorUtils.matchesAny(Arrays.asList(1, 2, 3).iterator(), predicate));
        assertFalse(IteratorUtils.matchesAny(Arrays.asList(1, 2).iterator(), predicate));
        assertFalse(IteratorUtils.matchesAny(null, predicate));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesAny_nullPredicate() {
        IteratorUtils.matchesAny(Collections.emptyIterator(), null);
    }

    @Test
    public void testMatchesAll() {
        Predicate<Integer> isPositive = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object > 0;
            }
        };
        assertTrue(IteratorUtils.matchesAll(Arrays.asList(1, 2, 3).iterator(), isPositive));
        assertFalse(IteratorUtils.matchesAll(Arrays.asList(1, -2, 3).iterator(), isPositive));
        assertTrue(IteratorUtils.matchesAll(null, isPositive));
    }

    @Test(expected = NullPointerException.class)
    public void testMatchesAll_nullPredicate() {
        IteratorUtils.matchesAll(Collections.emptyIterator(), null);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(IteratorUtils.isEmpty(null));
        assertTrue(IteratorUtils.isEmpty(Collections.emptyIterator()));
        assertFalse(IteratorUtils.isEmpty(Arrays.asList("a").iterator()));
    }

    @Test
    public void testContains() {
        assertTrue(IteratorUtils.contains(Arrays.asList("a", "b").iterator(), "b"));
        assertFalse(IteratorUtils.contains(Arrays.asList("a", "b").iterator(), "c"));
        assertFalse(IteratorUtils.contains(null, "a"));
    }

    @Test
    public void testGet() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertEquals("a", IteratorUtils.get(list.iterator(), 0));
        assertEquals("b", IteratorUtils.get(list.iterator(), 1));
        assertEquals("c", IteratorUtils.get(list.iterator(), 2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_negativeIndex() {
        IteratorUtils.get(Arrays.asList("a").iterator(), -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_indexOutOfBounds() {
        IteratorUtils.get(Arrays.asList("a").iterator(), 5);
    }

    @Test
    public void testSize() {
        assertEquals(0, IteratorUtils.size(null));
        assertEquals(0, IteratorUtils.size(Collections.emptyIterator()));
        assertEquals(3, IteratorUtils.size(Arrays.asList("a", "b", "c").iterator()));
    }

    @Test
    public void testToString() {
        assertEquals("[a, b, c]", IteratorUtils.toString(Arrays.asList("a", "b", "c").iterator()));
        assertEquals("[]", IteratorUtils.toString(Collections.emptyIterator()));
        assertEquals("[]", IteratorUtils.toString(null));

        Transformer<Integer, String> intTransformer = new Transformer<Integer, String>() {
            @Override
            public String transform(Integer input) {
                return "val:" + input;
            }
        };
        assertEquals("[val:1, val:2]", IteratorUtils.toString(Arrays.asList(1, 2).iterator(), intTransformer));

        assertEquals("{a|b}", IteratorUtils.toString(Arrays.asList("a", "b").iterator(),
                TransformerUtils.<String>stringValueTransformer(), "|", "{", "}"));
        assertEquals("{}", IteratorUtils.toString(Collections.<String>emptyIterator(),
                TransformerUtils.<String>stringValueTransformer(), "|", "{", "}"));
    }

    @Test(expected = NullPointerException.class)
    public void testToString_nullTransformer() {
        IteratorUtils.toString(Collections.emptyIterator(), null);
    }

    @Test(expected = NullPointerException.class)
    public void testToString_nullDelimiter() {
        IteratorUtils.toString(Collections.emptyIterator(), TransformerUtils.stringValueTransformer(), null, "[", "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToString_nullPrefix() {
        IteratorUtils.toString(Collections.emptyIterator(), TransformerUtils.stringValueTransformer(), ",", null, "]");
    }

    @Test(expected = NullPointerException.class)
    public void testToString_nullSuffix() {
        IteratorUtils.toString(Collections.emptyIterator(), TransformerUtils.stringValueTransformer(), ",", "[", null);
    }
}
