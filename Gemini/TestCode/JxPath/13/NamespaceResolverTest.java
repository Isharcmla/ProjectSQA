package org.apache.commons.jxpath.ri;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.Test;

public class NamespaceResolverTest {

    @Test
    public void testDefaultConstructor_initialState() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.parent);
        assertFalse(resolver.isSealed());
        assertNull(resolver.getNamespaceContextPointer());
        assertNull(resolver.getNamespaceURI("xml"));
    }

    @Test
    public void testConstructor_withParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertSame(parent, child.parent);
        assertFalse(child.isSealed());
    }

    @Test
    public void testRegisterNamespace_normalAndEdgeCases() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix1", "http://example.com/1");
        assertEquals("http://example.com/1", resolver.getNamespaceURI("prefix1"));

        // Register empty prefix and empty URI
        resolver.registerNamespace("", "");
        assertEquals("", resolver.getNamespaceURI(""));

        // Register null prefix and URI
        resolver.registerNamespace(null, null);
        assertNull(resolver.getNamespaceURI(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testRegisterNamespace_whenSealed_throwsIllegalStateException() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        assertTrue(resolver.isSealed());
        resolver.registerNamespace("pre", "http://example.com");
    }

    @Test
    public void testSetAndGetNamespaceContextPointer_standalone() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getNamespaceContextPointer());

        StubNodePointer pointer = new StubNodePointer();
        resolver.setNamespaceContextPointer(pointer);
        assertSame(pointer, resolver.getNamespaceContextPointer());

        resolver.setNamespaceContextPointer(null);
        assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointer_delegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);

        StubNodePointer parentPointer = new StubNodePointer();
        parent.setNamespaceContextPointer(parentPointer);

        assertSame(parentPointer, child.getNamespaceContextPointer());

        StubNodePointer childPointer = new StubNodePointer();
        child.setNamespaceContextPointer(childPointer);
        assertSame(childPointer, child.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceURI_fromLocalMap() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("ns", "http://ns.example.com");
        assertEquals("http://ns.example.com", resolver.getNamespaceURI("ns"));
        assertNull(resolver.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURI_fromPointer() {
        NamespaceResolver resolver = new NamespaceResolver();
        StubNodePointer pointer = new StubNodePointer();
        pointer.addNamespace("pointerNs", "http://pointer.example.com");

        resolver.setNamespaceContextPointer(pointer);

        assertEquals("http://pointer.example.com", resolver.getNamespaceURI("pointerNs"));
        assertNull(resolver.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURI_fromParentHierarchy() {
        NamespaceResolver root = new NamespaceResolver();
        root.registerNamespace("rootNs", "http://root.example.com");

        NamespaceResolver parent = new NamespaceResolver(root);
        StubNodePointer parentPointer = new StubNodePointer();
        parentPointer.addNamespace("parentPointerNs", "http://parentpointer.example.com");
        parent.setNamespaceContextPointer(parentPointer);

        NamespaceResolver child = new NamespaceResolver(parent);
        child.registerNamespace("childNs", "http://child.example.com");

        assertEquals("http://child.example.com", child.getNamespaceURI("childNs"));
        assertEquals("http://parentpointer.example.com", child.getNamespaceURI("parentPointerNs"));
        assertEquals("http://root.example.com", child.getNamespaceURI("rootNs"));
        assertNull(child.getNamespaceURI("nonExistent"));
    }

    @Test
    public void testGetPrefix_nullPointer_throwsNullPointerException() {
        NamespaceResolver resolver = new NamespaceResolver();
        try {
            resolver.getPrefix("http://example.com");
            fail("Expected NullPointerException when pointer is null and reverseMap is not initialized");
        } catch (NullPointerException expected) {
            // expected
        }
    }

    @Test
    public void testGetPrefix_withPointerAndLocalRegistration() {
        NamespaceResolver resolver = new NamespaceResolver();
        StubNodePointer pointer = new StubNodePointer();
        pointer.addNamespace("pNs", "http://pointer.example.com");
        pointer.addNamespace("", "http://default.example.com"); // empty prefix should be ignored

        resolver.setNamespaceContextPointer(pointer);
        resolver.registerNamespace("localNs", "http://local.example.com");

        // First call populates reverseMap
        assertEquals("pNs", resolver.getPrefix("http://pointer.example.com"));
        assertEquals("localNs", resolver.getPrefix("http://local.example.com"));
        // Empty prefix was not added to reverseMap
        assertNull(resolver.getPrefix("http://default.example.com"));

        // Subsequent call uses cached reverseMap
        assertEquals("pNs", resolver.getPrefix("http://pointer.example.com"));

        // Registering new namespace invalidates reverseMap
        resolver.registerNamespace("overrideNs", "http://pointer.example.com");
        assertEquals("overrideNs", resolver.getPrefix("http://pointer.example.com"));
    }

    @Test
    public void testGetPrefix_nullNamespaceIterator() {
        NamespaceResolver resolver = new NamespaceResolver();
        StubNodePointer pointer = new StubNodePointer() {
            @Override
            public NodeIterator namespaceIterator() {
                return null;
            }
        };

        resolver.setNamespaceContextPointer(pointer);
        resolver.registerNamespace("localNs", "http://local.example.com");

        assertEquals("localNs", resolver.getPrefix("http://local.example.com"));
        assertNull(resolver.getPrefix("http://unknown.example.com"));
    }

    @Test
    public void testGetPrefix_delegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        StubNodePointer parentPointer = new StubNodePointer();
        parentPointer.addNamespace("parentNs", "http://parent.example.com");
        parent.setNamespaceContextPointer(parentPointer);

        NamespaceResolver child = new NamespaceResolver(parent);
        StubNodePointer childPointer = new StubNodePointer();
        childPointer.addNamespace("childNs", "http://child.example.com");
        child.setNamespaceContextPointer(childPointer);

        assertEquals("childNs", child.getPrefix("http://child.example.com"));
        assertEquals("parentNs", child.getPrefix("http://parent.example.com"));
        assertNull(child.getPrefix("http://unregistered.example.com"));
    }

    @Test
    public void testSeal_sealsResolverAndParents() {
        NamespaceResolver root = new NamespaceResolver();
        NamespaceResolver parent = new NamespaceResolver(root);
        NamespaceResolver child = new NamespaceResolver(parent);

        assertFalse(root.isSealed());
        assertFalse(parent.isSealed());
        assertFalse(child.isSealed());

        child.seal();

        assertTrue(child.isSealed());
        assertTrue(parent.isSealed());
        assertTrue(root.isSealed());
    }

    @Test
    public void testClone_createsUnsealedCopy() {
        NamespaceResolver original = new NamespaceResolver();
        original.registerNamespace("test", "http://test.example.com");
        StubNodePointer pointer = new StubNodePointer();
        original.setNamespaceContextPointer(pointer);
        original.seal();

        assertTrue(original.isSealed());

        NamespaceResolver copy = (NamespaceResolver) original.clone();

        assertNotNull(copy);
        assertNotSame(original, copy);
        assertFalse(copy.isSealed());
        assertEquals("http://test.example.com", copy.getNamespaceURI("test"));
        assertSame(pointer, copy.getNamespaceContextPointer());

        // Modifying clone does not fail because clone is unsealed
        copy.registerNamespace("newPrefix", "http://new.example.com");
        assertEquals("http://new.example.com", copy.getNamespaceURI("newPrefix"));
    }

    // Helper Stub classes to satisfy NodePointer abstract methods
    private static class StubNodePointer extends NodePointer {
        private final Map<String, String> namespaces = new HashMap<String, String>();
        private final List<NodePointer> nsPointers = new ArrayList<NodePointer>();

        public StubNodePointer() {
            super(null, Locale.getDefault());
        }

        public void addNamespace(String prefix, String uri) {
            namespaces.put(prefix, uri);
            nsPointers.add(new StubNamespaceNodePointer(this, prefix, uri));
        }

        @Override
        public String getNamespaceURI(String prefix) {
            return namespaces.get(prefix);
        }

        @Override
        public NodeIterator namespaceIterator() {
            return new StubNodeIterator(nsPointers);
        }

        @Override
        public boolean isLeaf() {
            return true;
        }

        @Override
        public boolean isCollection() {
            return false;
        }

        @Override
        public int getLength() {
            return 1;
        }

        @Override
        public QName getName() {
            return new QName("stub");
        }

        @Override
        public Object getBaseValue() {
            return null;
        }

        @Override
        public Object getImmediateNode() {
            return null;
        }

        @Override
        public void setValue(Object value) {
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }

    private static class StubNamespaceNodePointer extends NodePointer {
        private final String prefix;
        private final String uri;

        public StubNamespaceNodePointer(NodePointer parent, String prefix, String uri) {
            super(parent);
            this.prefix = prefix;
            this.uri = uri;
        }

        @Override
        public QName getName() {
            return new QName(prefix);
        }

        @Override
        public String getNamespaceURI() {
            return uri;
        }

        @Override
        public boolean isLeaf() {
            return true;
        }

        @Override
        public boolean isCollection() {
            return false;
        }

        @Override
        public int getLength() {
            return 1;
        }

        @Override
        public Object getBaseValue() {
            return null;
        }

        @Override
        public Object getImmediateNode() {
            return null;
        }

        @Override
        public void setValue(Object value) {
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }

    private static class StubNodeIterator implements NodeIterator {
        private final List<NodePointer> list;
        private int position = 0;

        public StubNodeIterator(List<NodePointer> list) {
            this.list = list;
        }

        @Override
        public int getPosition() {
            return position;
        }

        @Override
        public boolean setPosition(int position) {
            this.position = position;
            return position >= 1 && position <= list.size();
        }

        @Override
        public NodePointer getNodePointer() {
            if (position >= 1 && position <= list.size()) {
                return list.get(position - 1);
            }
            return null;
        }
    }
}
