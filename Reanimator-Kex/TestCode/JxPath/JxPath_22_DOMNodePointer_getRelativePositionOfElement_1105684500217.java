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

public class DOMNodePointer_getRelativePositionOfElement_1105684500217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50975;
     Object term51169;

    public DOMNodePointer_getRelativePositionOfElement_1105684500217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50975 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51057 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term51139 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setShortField(term51057, term51057.getClass(), "flags", (short) 0);
        setField(term51057, term51057.getClass(), "previousSibling", term51139);
        setField(term50975, term50975.getClass(), "node", term51057);
        term51169 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51170 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term51171 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term51170, term51170.getClass(), "name", null);
        setField(term51170, term51170.getClass(), "entities", null);
        setField(term51170, term51170.getClass(), "notations", null);
        setField(term51170, term51170.getClass(), "elements", null);
        setField(term51170, term51170.getClass(), "publicID", null);
        setField(term51170, term51170.getClass(), "systemID", null);
        setField(term51170, term51170.getClass(), "internalSubset", null);
        setIntField(term51170, term51170.getClass(), "doctypeNumber", 0);
        setField(term51170, term51170.getClass(), "ownerDocument", null);
        setField(term51170, term51170.getClass(), "firstChild", null);
        setField(term51170, term51170.getClass(), "fNodeListCache", null);
        setField(term51171, term51171.getClass(), "name", null);
        setField(term51171, term51171.getClass(), "entities", null);
        setField(term51171, term51171.getClass(), "notations", null);
        setField(term51171, term51171.getClass(), "elements", null);
        setField(term51171, term51171.getClass(), "publicID", null);
        setField(term51171, term51171.getClass(), "systemID", null);
        setField(term51171, term51171.getClass(), "internalSubset", null);
        setIntField(term51171, term51171.getClass(), "doctypeNumber", 0);
        setField(term51171, term51171.getClass(), "ownerDocument", null);
        setField(term51171, term51171.getClass(), "firstChild", null);
        setField(term51171, term51171.getClass(), "fNodeListCache", null);
        setField(term51171, term51171.getClass(), "previousSibling", null);
        setField(term51171, term51171.getClass(), "nextSibling", null);
        setField(term51171, term51171.getClass(), "ownerNode", null);
        setShortField(term51171, term51171.getClass(), "flags", (short) 0);
        setField(term51170, term51170.getClass(), "previousSibling", term51171);
        setField(term51170, term51170.getClass(), "nextSibling", null);
        setField(term51170, term51170.getClass(), "ownerNode", null);
        setShortField(term51170, term51170.getClass(), "flags", (short) 0);
        setField(term51169, term51169.getClass(), "node", term51170);
        setField(term51169, term51169.getClass(), "namespaces", null);
        setField(term51169, term51169.getClass(), "defaultNamespace", null);
        setField(term51169, term51169.getClass(), "id", null);
        setField(term51169, term51169.getClass(), "localNamespaceResolver", null);
        setIntField(term51169, term51169.getClass(), "index", 0);
        setBooleanField(term51169, term51169.getClass(), "attribute", false);
        setField(term51169, term51169.getClass(), "namespaceResolver", null);
        setField(term51169, term51169.getClass(), "exceptionHandler", null);
        setField(term51169, term51169.getClass(), "rootNode", null);
        setField(term51169, term51169.getClass(), "parent", null);
        setField(term51169, term51169.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfElement", argTypes, term50975, args);
        assertTrue(recursiveEquals(term50975, term51169));
    }

};


