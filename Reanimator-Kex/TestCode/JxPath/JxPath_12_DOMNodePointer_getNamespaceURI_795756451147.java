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

public class DOMNodePointer_getNamespaceURI_795756451147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23775;
     Object term24052;

    public DOMNodePointer_getNamespaceURI_795756451147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23823 = new HashMap();
        ((HashMap) term23823).put(" ", " ");
        term23775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term23775, term23775.getClass(), "namespaces", term23823);
        HashMap term24053 = new HashMap();
        term24052 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24052, term24052.getClass(), "node", null);
        setField(term24052, term24052.getClass(), "namespaces", term24053);
        setField(term24052, term24052.getClass(), "defaultNamespace", null);
        setField(term24052, term24052.getClass(), "id", null);
        setIntField(term24052, term24052.getClass(), "index", 0);
        setBooleanField(term24052, term24052.getClass(), "attribute", false);
        setField(term24052, term24052.getClass(), "rootNode", null);
        setField(term24052, term24052.getClass(), "namespaceResolver", null);
        setField(term24052, term24052.getClass(), "parent", null);
        setField(term24052, term24052.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term23775, args);
        assertTrue(recursiveEquals(term23775, term24052));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


