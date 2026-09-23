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

public class DOMNodePointer_getNamespaceURI_795756451246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65831;
     Object term66273;

    public DOMNodePointer_getNamespaceURI_795756451246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65831 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65915 = newInstance(Class.forName("org.apache.html.dom.HTMLHtmlElementImpl"));
        setField(term65831, term65831.getClass(), "defaultNamespace", null);
        setField(term65831, term65831.getClass(), "node", term65915);
        term66273 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66274 = newInstance(Class.forName("org.apache.html.dom.HTMLHtmlElementImpl"));
        setField(term66274, term66274.getClass(), "name", null);
        setField(term66274, term66274.getClass(), "attributes", null);
        setField(term66274, term66274.getClass(), "ownerDocument", null);
        setField(term66274, term66274.getClass(), "firstChild", null);
        setField(term66274, term66274.getClass(), "fNodeListCache", null);
        setField(term66274, term66274.getClass(), "previousSibling", null);
        setField(term66274, term66274.getClass(), "nextSibling", null);
        setField(term66274, term66274.getClass(), "ownerNode", null);
        setShortField(term66274, term66274.getClass(), "flags", (short) 0);
        setField(term66273, term66273.getClass(), "node", term66274);
        setField(term66273, term66273.getClass(), "namespaces", null);
        setField(term66273, term66273.getClass(), "defaultNamespace", "");
        setField(term66273, term66273.getClass(), "id", null);
        setIntField(term66273, term66273.getClass(), "index", 0);
        setBooleanField(term66273, term66273.getClass(), "attribute", false);
        setField(term66273, term66273.getClass(), "rootNode", null);
        setField(term66273, term66273.getClass(), "namespaceResolver", null);
        setField(term66273, term66273.getClass(), "parent", null);
        setField(term66273, term66273.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term65831, args);
        assertTrue(recursiveEquals(term65831, term66273));
        assertTrue(recursiveEquals(retValue, null));
    }

};


