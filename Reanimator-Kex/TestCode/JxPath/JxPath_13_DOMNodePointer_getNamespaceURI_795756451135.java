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
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getNamespaceURI_795756451135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23266;
     Object term23966;

    public DOMNodePointer_getNamespaceURI_795756451135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23314 = new HashMap();
        term23266 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term23500 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setField(term23266, term23266.getClass(), "namespaces", term23314);
        setField(term23266, term23266.getClass(), "node", term23500);
        HashMap term23968 = new HashMap();
        term23966 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term23967 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setField(term23967, term23967.getClass(), "name", null);
        setField(term23967, term23967.getClass(), "attributes", null);
        setField(term23967, term23967.getClass(), "ownerDocument", null);
        setField(term23967, term23967.getClass(), "firstChild", null);
        setField(term23967, term23967.getClass(), "fNodeListCache", null);
        setField(term23967, term23967.getClass(), "previousSibling", null);
        setField(term23967, term23967.getClass(), "nextSibling", null);
        setField(term23967, term23967.getClass(), "ownerNode", null);
        setShortField(term23967, term23967.getClass(), "flags", (short) 0);
        setField(term23966, term23966.getClass(), "node", term23967);
        setField(term23966, term23966.getClass(), "namespaces", term23968);
        setField(term23966, term23966.getClass(), "defaultNamespace", null);
        setField(term23966, term23966.getClass(), "id", null);
        setIntField(term23966, term23966.getClass(), "index", 0);
        setBooleanField(term23966, term23966.getClass(), "attribute", false);
        setField(term23966, term23966.getClass(), "rootNode", null);
        setField(term23966, term23966.getClass(), "namespaceResolver", null);
        setField(term23966, term23966.getClass(), "parent", null);
        setField(term23966, term23966.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "::::::::::::::::::::::::::::::::\u0004:::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term23266, args);
        assertTrue(recursiveEquals(term23266, term23966));
        assertTrue(recursiveEquals(retValue, null));
    }

};


