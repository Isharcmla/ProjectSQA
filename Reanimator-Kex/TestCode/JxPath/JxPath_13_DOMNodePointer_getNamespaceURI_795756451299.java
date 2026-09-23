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

public class DOMNodePointer_getNamespaceURI_795756451299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95164;
     Object term95274;

    public DOMNodePointer_getNamespaceURI_795756451299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term95236 = newInstance(Class.forName("org.apache.wml.dom.WMLElementImpl"));
        setField(term95164, term95164.getClass(), "defaultNamespace", null);
        setField(term95164, term95164.getClass(), "node", term95236);
        term95274 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term95275 = newInstance(Class.forName("org.apache.wml.dom.WMLElementImpl"));
        setField(term95275, term95275.getClass(), "name", null);
        setField(term95275, term95275.getClass(), "attributes", null);
        setField(term95275, term95275.getClass(), "ownerDocument", null);
        setField(term95275, term95275.getClass(), "firstChild", null);
        setField(term95275, term95275.getClass(), "fNodeListCache", null);
        setField(term95275, term95275.getClass(), "previousSibling", null);
        setField(term95275, term95275.getClass(), "nextSibling", null);
        setField(term95275, term95275.getClass(), "ownerNode", null);
        setShortField(term95275, term95275.getClass(), "flags", (short) 0);
        setField(term95274, term95274.getClass(), "node", term95275);
        setField(term95274, term95274.getClass(), "namespaces", null);
        setField(term95274, term95274.getClass(), "defaultNamespace", "");
        setField(term95274, term95274.getClass(), "id", null);
        setIntField(term95274, term95274.getClass(), "index", 0);
        setBooleanField(term95274, term95274.getClass(), "attribute", false);
        setField(term95274, term95274.getClass(), "rootNode", null);
        setField(term95274, term95274.getClass(), "namespaceResolver", null);
        setField(term95274, term95274.getClass(), "parent", null);
        setField(term95274, term95274.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term95164, args);
        assertTrue(recursiveEquals(term95164, term95274));
        assertTrue(recursiveEquals(retValue, null));
    }

};


