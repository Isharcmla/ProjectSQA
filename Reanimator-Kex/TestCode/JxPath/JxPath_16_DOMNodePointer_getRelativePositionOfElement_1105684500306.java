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

public class DOMNodePointer_getRelativePositionOfElement_1105684500306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80723;
     Object term81628;

    public DOMNodePointer_getRelativePositionOfElement_1105684500306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80809 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        Object term80895 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        Object term80981 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        setShortField(term80809, term80809.getClass(), "flags", (short) 0);
        setShortField(term80895, term80895.getClass(), "flags", (short) 0);
        setField(term80895, term80895.getClass(), "previousSibling", term80981);
        setField(term80809, term80809.getClass(), "previousSibling", term80895);
        setField(term80723, term80723.getClass(), "node", term80809);
        term81628 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term81629 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        Object term81630 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        Object term81631 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        setIntField(term81629, term81629.getClass(), "fNodeIndex", 0);
        setField(term81629, term81629.getClass(), "name", null);
        setField(term81629, term81629.getClass(), "publicId", null);
        setField(term81629, term81629.getClass(), "systemId", null);
        setField(term81629, term81629.getClass(), "encoding", null);
        setField(term81629, term81629.getClass(), "actualEncoding", null);
        setField(term81629, term81629.getClass(), "version", null);
        setField(term81629, term81629.getClass(), "notationName", null);
        setField(term81629, term81629.getClass(), "baseURI", null);
        setField(term81629, term81629.getClass(), "ownerDocument", null);
        setField(term81629, term81629.getClass(), "firstChild", null);
        setField(term81629, term81629.getClass(), "fNodeListCache", null);
        setIntField(term81630, term81630.getClass(), "fNodeIndex", 0);
        setField(term81630, term81630.getClass(), "name", null);
        setField(term81630, term81630.getClass(), "publicId", null);
        setField(term81630, term81630.getClass(), "systemId", null);
        setField(term81630, term81630.getClass(), "encoding", null);
        setField(term81630, term81630.getClass(), "actualEncoding", null);
        setField(term81630, term81630.getClass(), "version", null);
        setField(term81630, term81630.getClass(), "notationName", null);
        setField(term81630, term81630.getClass(), "baseURI", null);
        setField(term81630, term81630.getClass(), "ownerDocument", null);
        setField(term81630, term81630.getClass(), "firstChild", null);
        setField(term81630, term81630.getClass(), "fNodeListCache", null);
        setIntField(term81631, term81631.getClass(), "fNodeIndex", 0);
        setField(term81631, term81631.getClass(), "name", null);
        setField(term81631, term81631.getClass(), "publicId", null);
        setField(term81631, term81631.getClass(), "systemId", null);
        setField(term81631, term81631.getClass(), "encoding", null);
        setField(term81631, term81631.getClass(), "actualEncoding", null);
        setField(term81631, term81631.getClass(), "version", null);
        setField(term81631, term81631.getClass(), "notationName", null);
        setField(term81631, term81631.getClass(), "baseURI", null);
        setField(term81631, term81631.getClass(), "ownerDocument", null);
        setField(term81631, term81631.getClass(), "firstChild", null);
        setField(term81631, term81631.getClass(), "fNodeListCache", null);
        setField(term81631, term81631.getClass(), "previousSibling", null);
        setField(term81631, term81631.getClass(), "nextSibling", null);
        setField(term81631, term81631.getClass(), "ownerNode", null);
        setShortField(term81631, term81631.getClass(), "flags", (short) 0);
        setField(term81630, term81630.getClass(), "previousSibling", term81631);
        setField(term81630, term81630.getClass(), "nextSibling", null);
        setField(term81630, term81630.getClass(), "ownerNode", null);
        setShortField(term81630, term81630.getClass(), "flags", (short) 0);
        setField(term81629, term81629.getClass(), "previousSibling", term81630);
        setField(term81629, term81629.getClass(), "nextSibling", null);
        setField(term81629, term81629.getClass(), "ownerNode", null);
        setShortField(term81629, term81629.getClass(), "flags", (short) 0);
        setField(term81628, term81628.getClass(), "node", term81629);
        setField(term81628, term81628.getClass(), "namespaces", null);
        setField(term81628, term81628.getClass(), "defaultNamespace", null);
        setField(term81628, term81628.getClass(), "id", null);
        setField(term81628, term81628.getClass(), "localNamespaceResolver", null);
        setIntField(term81628, term81628.getClass(), "index", 0);
        setBooleanField(term81628, term81628.getClass(), "attribute", false);
        setField(term81628, term81628.getClass(), "rootNode", null);
        setField(term81628, term81628.getClass(), "namespaceResolver", null);
        setField(term81628, term81628.getClass(), "parent", null);
        setField(term81628, term81628.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfElement", argTypes, term80723, args);
        assertTrue(recursiveEquals(term80723, term81628));
    }

};


