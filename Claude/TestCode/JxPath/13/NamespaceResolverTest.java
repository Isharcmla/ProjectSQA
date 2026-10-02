package org.apache.commons.jxpath.ri;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class NamespaceResolverTest {

    private NamespaceResolver resolver;

    @Before
    public void setUp() {
        resolver = new NamespaceResolver();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsInstance() {
        NamespaceResolver r = new NamespaceResolver();
        assertNotNull(r);
        assertFalse(r.isSealed());
    }

    @Test
    public void testConstructorWithParent_setsParentReference() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertNotNull(child);
        // verify delegation works through parent when pointer is null
        assertNull(child.getNamespaceContextPointer());
    }

    @Test
    public void testConstructorWithNullParent_behavesLikeDefault() {
        NamespaceResolver r = new NamespaceResolver(null);
        assertNotNull(r);
        assertFalse(r.isSealed());
    }

    // ---------- registerNamespace tests ----------

    @Test
    public void testRegisterNamespace_normalInput_retrievedCorrectly() {
        resolver.registerNamespace("ns", "http://example.com/ns");
        assertEquals("http://example.com/ns", resolver.getNamespaceURI("ns"));
    }

    @Test
    public void testRegisterNamespace_emptyStringPrefix_storedCorrectly() {
        resolver.registerNamespace("", "http://example.com/default");
        assertEquals("http://example.com/default", resolver.getNamespaceURI(""));
    }

    @Test
    public void testRegisterNamespace_overwriteExistingPrefix_updatesValue() {
        resolver.registerNamespace("ns", "http://example.com/old");
        resolver.registerNamespace("ns", "http://example.com/new");
        assertEquals("http://example.com/new", resolver.getNamespaceURI("ns"));
    }

    @Test(expected = IllegalStateException.class)
    public void testRegisterNamespace_sealedResolver_throwsIllegalStateException() {
        resolver.seal();
        resolver.registerNamespace("ns", "http://example.com/ns");
    }

    @Test
    public void testRegisterNamespace_sealedResolver_throwsIllegalStateException_tryCatch() {
        resolver.seal();
        try {
            resolver.registerNamespace("ns", "http://example.com/ns");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(true);
        }
    }

    // ---------- setNamespaceContextPointer / getNamespaceContextPointer ----------

    @Test
    public void testSetNamespaceContextPointer_nullPointer_doesNotThrow() {
        resolver.setNamespaceContextPointer(null);
        assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointer_noPointerNoParent_returnsNull() {
        assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointer_noPointerWithParent_delegatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertNull(child.getNamespaceContextPointer());
    }

    // ---------- getNamespaceURI tests ----------

    @Test
    public void testGetNamespaceURI_registeredPrefix_returnsUri() {
        resolver.registerNamespace("foo", "http://foo.com");
        assertEquals("http://foo.com", resolver.getNamespaceURI("foo"));
    }

    @Test
    public void testGetNamespaceURI_unregisteredPrefixNoParent_returnsNull() {
        assertNull(resolver.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURI_nullPrefix_returnsNull() {
        assertNull(resolver.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURI_unregisteredPrefixWithParentHavingIt_returnsParentUri() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("foo", "http://foo.com");
        NamespaceResolver child = new NamespaceResolver(parent);
        assertEquals("http://foo.com", child.getNamespaceURI("foo"));
    }

    @Test
    public void testGetNamespaceURI_unregisteredPrefixWithParentNotHavingIt_returnsNull() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertNull(child.getNamespaceURI("doesNotExist"));
    }

    // ---------- getPrefix tests ----------

    @Test(expected = NullPointerException.class)
    public void testGetPrefix_pointerNotSet_throwsNullPointerException() {
        // pointer field is null by default; getPrefix calls pointer.namespaceIterator()
        // which should throw NPE since no NodePointer has been configured.
        resolver.getPrefix("http://example.com/ns");
    }

    @Test
    public void testGetPrefix_pointerNotSetOnChild_throwsNullPointerExceptionEvenWithParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        try {
            child.getPrefix("http://example.com/ns");
            fail("Expected NullPointerException because pointer is null");
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    // ---------- isSealed / seal tests ----------

    @Test
    public void testIsSealed_defaultState_returnsFalse() {
        assertFalse(resolver.isSealed());
    }

    @Test
    public void testIsSealed_afterSeal_returnsTrue() {
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    public void testSeal_propagatesToParent() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        child.seal();
        assertTrue(child.isSealed());
        assertTrue(parent.isSealed());
    }

    @Test
    public void testSeal_noParent_doesNotThrow() {
        NamespaceResolver r = new NamespaceResolver();
        r.seal();
        assertTrue(r.isSealed());
    }

    // ---------- clone tests ----------

    @Test
    public void testClone_returnsDifferentInstance() {
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertNotNull(clone);
        assertNotSame(resolver, clone);
    }

    @Test
    public void testClone_resetsSealedToFalse() {
        resolver.seal();
        assertTrue(resolver.isSealed());
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertFalse(clone.isSealed());
        // original should remain sealed
        assertTrue(resolver.isSealed());
    }

    @Test
    public void testClone_preservesNamespaceMapValues() {
        resolver.registerNamespace("ns", "http://example.com/ns");
        NamespaceResolver clone = (NamespaceResolver) resolver.clone();
        assertEquals("http://example.com/ns", clone.getNamespaceURI("ns"));
    }

    @Test
    public void testClone_isInstanceOfNamespaceResolver() {
        Object clone = resolver.clone();
        assertTrue(clone instanceof NamespaceResolver);
    }
}
