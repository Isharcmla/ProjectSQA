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

public class DOMNodePointer_getNamespaceURI_795756451122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18854;
     Object term19818;

    public DOMNodePointer_getNamespaceURI_795756451122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term19818 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term19818, term19818.getClass(), "node", null);
        setField(term19818, term19818.getClass(), "namespaces", null);
        setField(term19818, term19818.getClass(), "defaultNamespace", "");
        setField(term19818, term19818.getClass(), "id", null);
        setIntField(term19818, term19818.getClass(), "index", 0);
        setBooleanField(term19818, term19818.getClass(), "attribute", false);
        setField(term19818, term19818.getClass(), "rootNode", null);
        setField(term19818, term19818.getClass(), "namespaceResolver", null);
        setField(term19818, term19818.getClass(), "parent", null);
        setField(term19818, term19818.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term18854, args);
        assertTrue(recursiveEquals(term18854, term19818));
        assertTrue(recursiveEquals(retValue, null));
    }

};


