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

public class DOMNodePointer_getNamespaceURI_795756451261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63107;
     Object term63253;

    public DOMNodePointer_getNamespaceURI_795756451261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term63107, term63107.getClass(), "namespaces", null);
        HashMap term63254 = new HashMap();
        term63253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term63253, term63253.getClass(), "node", null);
        setField(term63253, term63253.getClass(), "namespaces", term63254);
        setField(term63253, term63253.getClass(), "defaultNamespace", null);
        setField(term63253, term63253.getClass(), "id", null);
        setField(term63253, term63253.getClass(), "localNamespaceResolver", null);
        setIntField(term63253, term63253.getClass(), "index", 0);
        setBooleanField(term63253, term63253.getClass(), "attribute", false);
        setField(term63253, term63253.getClass(), "rootNode", null);
        setField(term63253, term63253.getClass(), "namespaceResolver", null);
        setField(term63253, term63253.getClass(), "parent", null);
        setField(term63253, term63253.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term63107, args);
        assertTrue(recursiveEquals(term63107, term63253));
        assertTrue(recursiveEquals(retValue, null));
    }

};


