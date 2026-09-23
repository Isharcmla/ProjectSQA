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
     Object term18773;
     Object term18870;

    public DOMNodePointer_getRelativePositionOfElement_1105684500113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18855 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term18773, term18773.getClass(), "node", term18855);
        term18870 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18871 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term18871, term18871.getClass(), "name", null);
        setField(term18871, term18871.getClass(), "entities", null);
        setField(term18871, term18871.getClass(), "notations", null);
        setField(term18871, term18871.getClass(), "elements", null);
        setField(term18871, term18871.getClass(), "publicID", null);
        setField(term18871, term18871.getClass(), "systemID", null);
        setField(term18871, term18871.getClass(), "internalSubset", null);
        setIntField(term18871, term18871.getClass(), "doctypeNumber", 0);
        setField(term18871, term18871.getClass(), "ownerDocument", null);
        setField(term18871, term18871.getClass(), "firstChild", null);
        setField(term18871, term18871.getClass(), "fNodeListCache", null);
        setField(term18871, term18871.getClass(), "previousSibling", null);
        setField(term18871, term18871.getClass(), "nextSibling", null);
        setField(term18871, term18871.getClass(), "ownerNode", null);
        setShortField(term18871, term18871.getClass(), "flags", (short) 0);
        setField(term18870, term18870.getClass(), "node", term18871);
        setField(term18870, term18870.getClass(), "namespaces", null);
        setField(term18870, term18870.getClass(), "defaultNamespace", null);
        setField(term18870, term18870.getClass(), "id", null);
        setField(term18870, term18870.getClass(), "localNamespaceResolver", null);
        setIntField(term18870, term18870.getClass(), "index", 0);
        setBooleanField(term18870, term18870.getClass(), "attribute", false);
        setField(term18870, term18870.getClass(), "namespaceResolver", null);
        setField(term18870, term18870.getClass(), "exceptionHandler", null);
        setField(term18870, term18870.getClass(), "rootNode", null);
        setField(term18870, term18870.getClass(), "parent", null);
        setField(term18870, term18870.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term18773, args);
        assertTrue(recursiveEquals(term18773, term18870));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


