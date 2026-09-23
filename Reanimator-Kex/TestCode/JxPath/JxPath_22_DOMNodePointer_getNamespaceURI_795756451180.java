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

public class DOMNodePointer_getNamespaceURI_795756451180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35251;
     Object term35966;

    public DOMNodePointer_getNamespaceURI_795756451180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35299 = new HashMap();
        term35251 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term35493 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term35251, term35251.getClass(), "namespaces", term35299);
        setField(term35251, term35251.getClass(), "node", term35493);
        HashMap term35968 = new HashMap();
        term35966 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term35967 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term35967, term35967.getClass(), "name", null);
        setField(term35967, term35967.getClass(), "attributes", null);
        setField(term35967, term35967.getClass(), "ownerDocument", null);
        setField(term35967, term35967.getClass(), "firstChild", null);
        setField(term35967, term35967.getClass(), "fNodeListCache", null);
        setField(term35967, term35967.getClass(), "previousSibling", null);
        setField(term35967, term35967.getClass(), "nextSibling", null);
        setField(term35967, term35967.getClass(), "ownerNode", null);
        setShortField(term35967, term35967.getClass(), "flags", (short) 0);
        setField(term35966, term35966.getClass(), "node", term35967);
        setField(term35966, term35966.getClass(), "namespaces", term35968);
        setField(term35966, term35966.getClass(), "defaultNamespace", null);
        setField(term35966, term35966.getClass(), "id", null);
        setField(term35966, term35966.getClass(), "localNamespaceResolver", null);
        setIntField(term35966, term35966.getClass(), "index", 0);
        setBooleanField(term35966, term35966.getClass(), "attribute", false);
        setField(term35966, term35966.getClass(), "namespaceResolver", null);
        setField(term35966, term35966.getClass(), "exceptionHandler", null);
        setField(term35966, term35966.getClass(), "rootNode", null);
        setField(term35966, term35966.getClass(), "parent", null);
        setField(term35966, term35966.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "::::::::::::::::::::::::::::::::\u0004:::::::::";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term35251, args);
        assertTrue(recursiveEquals(term35251, term35966));
        assertTrue(recursiveEquals(retValue, null));
    }

};


