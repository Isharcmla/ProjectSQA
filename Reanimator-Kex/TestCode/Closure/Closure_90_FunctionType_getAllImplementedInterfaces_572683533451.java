package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class FunctionType_getAllImplementedInterfaces_572683533451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370447;
     Object term371259;
     Object term371251;

    public FunctionType_getAllImplementedInterfaces_572683533451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term371268 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term371267 = ((Class) term371268).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term371267).setAccessible(true);
        Object enum631 = ((Field) term371267).get((Object) null);
        Object term370865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        ArrayList term370765 = new ArrayList();
        ((ArrayList) term370765).add(term370865);
        term370447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term370713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term370447, term370447.getClass(), "kind", enum631);
        setField(term370713, term370713.getClass(), "implicitPrototypeFallback", null);
        setField(term370447, term370447.getClass(), "prototype", term370713);
        setField(term370447, term370447.getClass(), "implementedInterfaces", term370765);
        Class<? extends Object> term371568 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term371567 = ((Class) term371568).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term371567).setAccessible(true);
        Object enum632 = ((Field) term371567).get((Object) null);
        Object term371266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term371266, term371266.getClass(), "call", null);
        setField(term371266, term371266.getClass(), "prototype", null);
        setField(term371266, term371266.getClass(), "kind", null);
        setField(term371266, term371266.getClass(), "typeOfThis", null);
        setField(term371266, term371266.getClass(), "source", null);
        setField(term371266, term371266.getClass(), "implementedInterfaces", null);
        setField(term371266, term371266.getClass(), "subTypes", null);
        setField(term371266, term371266.getClass(), "templateTypeName", null);
        setField(term371266, term371266.getClass(), "className", null);
        setField(term371266, term371266.getClass(), "properties", null);
        setBooleanField(term371266, term371266.getClass(), "nativeType", false);
        setField(term371266, term371266.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term371266, term371266.getClass(), "prettyPrint", false);
        setBooleanField(term371266, term371266.getClass(), "visited", false);
        setField(term371266, term371266.getClass(), "docInfo", null);
        setBooleanField(term371266, term371266.getClass(), "unknown", false);
        setBooleanField(term371266, term371266.getClass(), "resolved", false);
        setField(term371266, term371266.getClass(), "resolveResult", null);
        setField(term371266, term371266.getClass(), "registry", null);
        ArrayList term371264 = new ArrayList();
        ((ArrayList) term371264).add(term371266);
        term371259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term371260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term371259, term371259.getClass(), "call", null);
        setField(term371260, term371260.getClass(), "ownerFunction", null);
        setField(term371260, term371260.getClass(), "className", null);
        setField(term371260, term371260.getClass(), "properties", null);
        setBooleanField(term371260, term371260.getClass(), "nativeType", false);
        setField(term371260, term371260.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term371260, term371260.getClass(), "prettyPrint", false);
        setBooleanField(term371260, term371260.getClass(), "visited", false);
        setField(term371260, term371260.getClass(), "docInfo", null);
        setBooleanField(term371260, term371260.getClass(), "unknown", false);
        setBooleanField(term371260, term371260.getClass(), "resolved", false);
        setField(term371260, term371260.getClass(), "resolveResult", null);
        setField(term371260, term371260.getClass(), "registry", null);
        setField(term371259, term371259.getClass(), "prototype", term371260);
        setField(term371259, term371259.getClass(), "kind", enum632);
        setField(term371259, term371259.getClass(), "typeOfThis", null);
        setField(term371259, term371259.getClass(), "source", null);
        setField(term371259, term371259.getClass(), "implementedInterfaces", term371264);
        setField(term371259, term371259.getClass(), "subTypes", null);
        setField(term371259, term371259.getClass(), "templateTypeName", null);
        setField(term371259, term371259.getClass(), "className", null);
        setField(term371259, term371259.getClass(), "properties", null);
        setBooleanField(term371259, term371259.getClass(), "nativeType", false);
        setField(term371259, term371259.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term371259, term371259.getClass(), "prettyPrint", false);
        setBooleanField(term371259, term371259.getClass(), "visited", false);
        setField(term371259, term371259.getClass(), "docInfo", null);
        setBooleanField(term371259, term371259.getClass(), "unknown", false);
        setBooleanField(term371259, term371259.getClass(), "resolved", false);
        setField(term371259, term371259.getClass(), "resolveResult", null);
        setField(term371259, term371259.getClass(), "registry", null);
        LinkedHashMap term371252 = new LinkedHashMap();
        Set<Object> term371867 =  ((Map) term371252).keySet();
        term371251 = new LinkedHashSet((Collection<? extends Object>) term371867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term370447, args);
        assertTrue(recursiveEquals(term370447, term371259));
        assertTrue(recursiveEquals(retValue, term371251));
    }

};


