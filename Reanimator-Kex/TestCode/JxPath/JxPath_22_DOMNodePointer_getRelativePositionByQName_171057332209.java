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

public class DOMNodePointer_getRelativePositionByQName_171057332209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49500;
     Object term49694;

    public DOMNodePointer_getRelativePositionByQName_171057332209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49582 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term49664 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setShortField(term49582, term49582.getClass(), "flags", (short) 0);
        setField(term49582, term49582.getClass(), "previousSibling", term49664);
        setField(term49500, term49500.getClass(), "node", term49582);
        term49694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49695 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term49696 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term49695, term49695.getClass(), "name", null);
        setField(term49695, term49695.getClass(), "entities", null);
        setField(term49695, term49695.getClass(), "notations", null);
        setField(term49695, term49695.getClass(), "elements", null);
        setField(term49695, term49695.getClass(), "publicID", null);
        setField(term49695, term49695.getClass(), "systemID", null);
        setField(term49695, term49695.getClass(), "internalSubset", null);
        setIntField(term49695, term49695.getClass(), "doctypeNumber", 0);
        setField(term49695, term49695.getClass(), "ownerDocument", null);
        setField(term49695, term49695.getClass(), "firstChild", null);
        setField(term49695, term49695.getClass(), "fNodeListCache", null);
        setField(term49696, term49696.getClass(), "name", null);
        setField(term49696, term49696.getClass(), "entities", null);
        setField(term49696, term49696.getClass(), "notations", null);
        setField(term49696, term49696.getClass(), "elements", null);
        setField(term49696, term49696.getClass(), "publicID", null);
        setField(term49696, term49696.getClass(), "systemID", null);
        setField(term49696, term49696.getClass(), "internalSubset", null);
        setIntField(term49696, term49696.getClass(), "doctypeNumber", 0);
        setField(term49696, term49696.getClass(), "ownerDocument", null);
        setField(term49696, term49696.getClass(), "firstChild", null);
        setField(term49696, term49696.getClass(), "fNodeListCache", null);
        setField(term49696, term49696.getClass(), "previousSibling", null);
        setField(term49696, term49696.getClass(), "nextSibling", null);
        setField(term49696, term49696.getClass(), "ownerNode", null);
        setShortField(term49696, term49696.getClass(), "flags", (short) 0);
        setField(term49695, term49695.getClass(), "previousSibling", term49696);
        setField(term49695, term49695.getClass(), "nextSibling", null);
        setField(term49695, term49695.getClass(), "ownerNode", null);
        setShortField(term49695, term49695.getClass(), "flags", (short) 0);
        setField(term49694, term49694.getClass(), "node", term49695);
        setField(term49694, term49694.getClass(), "namespaces", null);
        setField(term49694, term49694.getClass(), "defaultNamespace", null);
        setField(term49694, term49694.getClass(), "id", null);
        setField(term49694, term49694.getClass(), "localNamespaceResolver", null);
        setIntField(term49694, term49694.getClass(), "index", 0);
        setBooleanField(term49694, term49694.getClass(), "attribute", false);
        setField(term49694, term49694.getClass(), "namespaceResolver", null);
        setField(term49694, term49694.getClass(), "exceptionHandler", null);
        setField(term49694, term49694.getClass(), "rootNode", null);
        setField(term49694, term49694.getClass(), "parent", null);
        setField(term49694, term49694.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionByQName", argTypes, term49500, args);
        assertTrue(recursiveEquals(term49500, term49694));
    }

};


