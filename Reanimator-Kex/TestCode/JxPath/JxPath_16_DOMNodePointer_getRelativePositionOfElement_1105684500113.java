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

public class DOMNodePointer_getRelativePositionOfElement_1105684500113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18668;
     Object term19466;

    public DOMNodePointer_getRelativePositionOfElement_1105684500113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18668 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18754 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        setField(term18668, term18668.getClass(), "node", term18754);
        term19466 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term19467 = newInstance(Class.forName("org.apache.xerces.dom.DeferredEntityImpl"));
        setIntField(term19467, term19467.getClass(), "fNodeIndex", 0);
        setField(term19467, term19467.getClass(), "name", null);
        setField(term19467, term19467.getClass(), "publicId", null);
        setField(term19467, term19467.getClass(), "systemId", null);
        setField(term19467, term19467.getClass(), "encoding", null);
        setField(term19467, term19467.getClass(), "actualEncoding", null);
        setField(term19467, term19467.getClass(), "version", null);
        setField(term19467, term19467.getClass(), "notationName", null);
        setField(term19467, term19467.getClass(), "baseURI", null);
        setField(term19467, term19467.getClass(), "ownerDocument", null);
        setField(term19467, term19467.getClass(), "firstChild", null);
        setField(term19467, term19467.getClass(), "fNodeListCache", null);
        setField(term19467, term19467.getClass(), "previousSibling", null);
        setField(term19467, term19467.getClass(), "nextSibling", null);
        setField(term19467, term19467.getClass(), "ownerNode", null);
        setShortField(term19467, term19467.getClass(), "flags", (short) 0);
        setField(term19466, term19466.getClass(), "node", term19467);
        setField(term19466, term19466.getClass(), "namespaces", null);
        setField(term19466, term19466.getClass(), "defaultNamespace", null);
        setField(term19466, term19466.getClass(), "id", null);
        setField(term19466, term19466.getClass(), "localNamespaceResolver", null);
        setIntField(term19466, term19466.getClass(), "index", 0);
        setBooleanField(term19466, term19466.getClass(), "attribute", false);
        setField(term19466, term19466.getClass(), "rootNode", null);
        setField(term19466, term19466.getClass(), "namespaceResolver", null);
        setField(term19466, term19466.getClass(), "parent", null);
        setField(term19466, term19466.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term18668, args);
        assertTrue(recursiveEquals(term18668, term19466));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


