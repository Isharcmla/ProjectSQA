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

public class DOMNodePointer_getNamespaceURI_795756451226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58590;
     Object term62032;

    public DOMNodePointer_getNamespaceURI_795756451226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term58676 = newInstance(Class.forName("org.apache.html.dom.HTMLQuoteElementImpl"));
        setField(term58590, term58590.getClass(), "namespaces", null);
        setField(term58590, term58590.getClass(), "node", term58676);
        HashMap term62034 = new HashMap();
        term62032 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term62033 = newInstance(Class.forName("org.apache.html.dom.HTMLQuoteElementImpl"));
        setField(term62033, term62033.getClass(), "name", null);
        setField(term62033, term62033.getClass(), "attributes", null);
        setField(term62033, term62033.getClass(), "ownerDocument", null);
        setField(term62033, term62033.getClass(), "firstChild", null);
        setField(term62033, term62033.getClass(), "fNodeListCache", null);
        setField(term62033, term62033.getClass(), "previousSibling", null);
        setField(term62033, term62033.getClass(), "nextSibling", null);
        setField(term62033, term62033.getClass(), "ownerNode", null);
        setShortField(term62033, term62033.getClass(), "flags", (short) 0);
        setField(term62032, term62032.getClass(), "node", term62033);
        setField(term62032, term62032.getClass(), "namespaces", term62034);
        setField(term62032, term62032.getClass(), "defaultNamespace", null);
        setField(term62032, term62032.getClass(), "id", null);
        setIntField(term62032, term62032.getClass(), "index", 0);
        setBooleanField(term62032, term62032.getClass(), "attribute", false);
        setField(term62032, term62032.getClass(), "rootNode", null);
        setField(term62032, term62032.getClass(), "namespaceResolver", null);
        setField(term62032, term62032.getClass(), "parent", null);
        setField(term62032, term62032.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term58590, args);
        assertTrue(recursiveEquals(term58590, term62032));
        assertTrue(recursiveEquals(retValue, null));
    }

};


