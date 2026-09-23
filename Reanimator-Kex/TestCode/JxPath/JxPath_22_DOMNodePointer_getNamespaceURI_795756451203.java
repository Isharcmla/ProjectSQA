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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceURI_795756451203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48150;
     Object term48524;

    public DOMNodePointer_getNamespaceURI_795756451203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48240 = newInstance(Class.forName("org.apache.xerces.dom.DocumentFragmentImpl"));
        setField(term48150, term48150.getClass(), "namespaces", null);
        setField(term48150, term48150.getClass(), "node", term48240);
        HashMap term48526 = new HashMap();
        term48524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48525 = newInstance(Class.forName("org.apache.xerces.dom.DocumentFragmentImpl"));
        setField(term48525, term48525.getClass(), "ownerDocument", null);
        setField(term48525, term48525.getClass(), "firstChild", null);
        setField(term48525, term48525.getClass(), "fNodeListCache", null);
        setField(term48525, term48525.getClass(), "previousSibling", null);
        setField(term48525, term48525.getClass(), "nextSibling", null);
        setField(term48525, term48525.getClass(), "ownerNode", null);
        setShortField(term48525, term48525.getClass(), "flags", (short) 0);
        setField(term48524, term48524.getClass(), "node", term48525);
        setField(term48524, term48524.getClass(), "namespaces", term48526);
        setField(term48524, term48524.getClass(), "defaultNamespace", null);
        setField(term48524, term48524.getClass(), "id", null);
        setField(term48524, term48524.getClass(), "localNamespaceResolver", null);
        setIntField(term48524, term48524.getClass(), "index", 0);
        setBooleanField(term48524, term48524.getClass(), "attribute", false);
        setField(term48524, term48524.getClass(), "namespaceResolver", null);
        setField(term48524, term48524.getClass(), "exceptionHandler", null);
        setField(term48524, term48524.getClass(), "rootNode", null);
        setField(term48524, term48524.getClass(), "parent", null);
        setField(term48524, term48524.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term48150, args);
        assertTrue(recursiveEquals(term48150, term48524));
        assertTrue(recursiveEquals(retValue, null));
    }

};


