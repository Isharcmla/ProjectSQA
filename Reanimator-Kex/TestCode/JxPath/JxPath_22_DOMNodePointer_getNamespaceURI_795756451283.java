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

public class DOMNodePointer_getNamespaceURI_795756451283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69882;
     Object term70000;

    public DOMNodePointer_getNamespaceURI_795756451283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69964 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setField(term69882, term69882.getClass(), "defaultNamespace", null);
        setField(term69882, term69882.getClass(), "node", term69964);
        term70000 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term70001 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setField(term70001, term70001.getClass(), "name", null);
        setField(term70001, term70001.getClass(), "attributes", null);
        setField(term70001, term70001.getClass(), "ownerDocument", null);
        setField(term70001, term70001.getClass(), "firstChild", null);
        setField(term70001, term70001.getClass(), "fNodeListCache", null);
        setField(term70001, term70001.getClass(), "previousSibling", null);
        setField(term70001, term70001.getClass(), "nextSibling", null);
        setField(term70001, term70001.getClass(), "ownerNode", null);
        setShortField(term70001, term70001.getClass(), "flags", (short) 0);
        setField(term70000, term70000.getClass(), "node", term70001);
        setField(term70000, term70000.getClass(), "namespaces", null);
        setField(term70000, term70000.getClass(), "defaultNamespace", "");
        setField(term70000, term70000.getClass(), "id", null);
        setField(term70000, term70000.getClass(), "localNamespaceResolver", null);
        setIntField(term70000, term70000.getClass(), "index", 0);
        setBooleanField(term70000, term70000.getClass(), "attribute", false);
        setField(term70000, term70000.getClass(), "namespaceResolver", null);
        setField(term70000, term70000.getClass(), "exceptionHandler", null);
        setField(term70000, term70000.getClass(), "rootNode", null);
        setField(term70000, term70000.getClass(), "parent", null);
        setField(term70000, term70000.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term69882, args);
        assertTrue(recursiveEquals(term69882, term70000));
        assertTrue(recursiveEquals(retValue, null));
    }

};


