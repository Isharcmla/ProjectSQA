package org.apache.commons.jxpath.ri.model.dom;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;

public class DOMNodePointer_getRelativePositionOfElement_1105684500185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37638;
     Object term37840;

    public DOMNodePointer_getRelativePositionOfElement_1105684500185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37638 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37724 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        Object term37810 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        setShortField(term37724, term37724.getClass(), "flags", (short) 0);
        setField(term37724, term37724.getClass(), "previousSibling", term37810);
        setField(term37638, term37638.getClass(), "node", term37724);
        term37840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37841 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        Object term37842 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        setIntField(term37841, term37841.getClass(), "fNodeIndex", 0);
        setField(term37841, term37841.getClass(), "name", null);
        setField(term37841, term37841.getClass(), "publicId", null);
        setField(term37841, term37841.getClass(), "systemId", null);
        setField(term37841, term37841.getClass(), "encoding", null);
        setField(term37841, term37841.getClass(), "actualEncoding", null);
        setField(term37841, term37841.getClass(), "version", null);
        setField(term37841, term37841.getClass(), "notationName", null);
        setField(term37841, term37841.getClass(), "baseURI", null);
        setField(term37841, term37841.getClass(), "ownerDocument", null);
        setField(term37841, term37841.getClass(), "firstChild", null);
        setField(term37841, term37841.getClass(), "fNodeListCache", null);
        setIntField(term37842, term37842.getClass(), "fNodeIndex", 0);
        setField(term37842, term37842.getClass(), "name", null);
        setField(term37842, term37842.getClass(), "publicId", null);
        setField(term37842, term37842.getClass(), "systemId", null);
        setField(term37842, term37842.getClass(), "encoding", null);
        setField(term37842, term37842.getClass(), "actualEncoding", null);
        setField(term37842, term37842.getClass(), "version", null);
        setField(term37842, term37842.getClass(), "notationName", null);
        setField(term37842, term37842.getClass(), "baseURI", null);
        setField(term37842, term37842.getClass(), "ownerDocument", null);
        setField(term37842, term37842.getClass(), "firstChild", null);
        setField(term37842, term37842.getClass(), "fNodeListCache", null);
        setField(term37842, term37842.getClass(), "previousSibling", null);
        setField(term37842, term37842.getClass(), "nextSibling", null);
        setField(term37842, term37842.getClass(), "ownerNode", null);
        setShortField(term37842, term37842.getClass(), "flags", (short) 0);
        setField(term37841, term37841.getClass(), "previousSibling", term37842);
        setField(term37841, term37841.getClass(), "nextSibling", null);
        setField(term37841, term37841.getClass(), "ownerNode", null);
        setShortField(term37841, term37841.getClass(), "flags", (short) 0);
        setField(term37840, term37840.getClass(), "node", term37841);
        setField(term37840, term37840.getClass(), "namespaces", null);
        setField(term37840, term37840.getClass(), "defaultNamespace", null);
        setField(term37840, term37840.getClass(), "id", null);
        setField(term37840, term37840.getClass(), "localNamespaceResolver", null);
        setIntField(term37840, term37840.getClass(), "index", 0);
        setBooleanField(term37840, term37840.getClass(), "attribute", false);
        setField(term37840, term37840.getClass(), "rootNode", null);
        setField(term37840, term37840.getClass(), "namespaceResolver", null);
        setField(term37840, term37840.getClass(), "parent", null);
        setField(term37840, term37840.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfElement", argTypes, term37638, args);
        assertTrue(recursiveEquals(term37638, term37840));
    }

};


