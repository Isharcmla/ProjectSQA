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
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143363;
     Object term143549;
     Object term143693;
     Object term143695;
     Object term143663;

    public JSType_getGreatestSubtype_1951394506519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term143451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term143451, term143451.getClass(), "unknown", false);
        setField(term143363, term143363.getClass(), "referencedType", term143451);
        term143549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term143637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term143549, term143549.getClass(), "referencedType", term143637);
        term143693 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term143694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term143693, term143693.getClass(), "indexType", null);
        setField(term143694, term143694.getClass(), "leastSupertypeVisitor", null);
        setField(term143694, term143694.getClass(), "greatestSubtypeVisitor", null);
        setField(term143694, term143694.getClass(), "call", null);
        setField(term143694, term143694.getClass(), "prototype", null);
        setField(term143694, term143694.getClass(), "kind", null);
        setField(term143694, term143694.getClass(), "typeOfThis", null);
        setField(term143694, term143694.getClass(), "source", null);
        setField(term143694, term143694.getClass(), "implementedInterfaces", null);
        setField(term143694, term143694.getClass(), "subTypes", null);
        setField(term143694, term143694.getClass(), "templateTypeName", null);
        setField(term143694, term143694.getClass(), "className", null);
        setField(term143694, term143694.getClass(), "properties", null);
        setField(term143694, term143694.getClass(), "implicitPrototype", null);
        setBooleanField(term143694, term143694.getClass(), "nativeType", false);
        setBooleanField(term143694, term143694.getClass(), "prettyPrint", false);
        setBooleanField(term143694, term143694.getClass(), "visited", false);
        setField(term143694, term143694.getClass(), "docInfo", null);
        setBooleanField(term143694, term143694.getClass(), "unknown", false);
        setBooleanField(term143694, term143694.getClass(), "resolved", false);
        setField(term143694, term143694.getClass(), "resolveResult", null);
        setField(term143694, term143694.getClass(), "registry", null);
        setField(term143693, term143693.getClass(), "referencedType", term143694);
        setBooleanField(term143693, term143693.getClass(), "visited", false);
        setField(term143693, term143693.getClass(), "docInfo", null);
        setBooleanField(term143693, term143693.getClass(), "unknown", false);
        setBooleanField(term143693, term143693.getClass(), "resolved", false);
        setField(term143693, term143693.getClass(), "resolveResult", null);
        setField(term143693, term143693.getClass(), "registry", null);
        term143695 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term143696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term143695, term143695.getClass(), "parameterType", null);
        setField(term143696, term143696.getClass(), "leastSupertypeVisitor", null);
        setField(term143696, term143696.getClass(), "greatestSubtypeVisitor", null);
        setField(term143696, term143696.getClass(), "call", null);
        setField(term143696, term143696.getClass(), "prototype", null);
        setField(term143696, term143696.getClass(), "kind", null);
        setField(term143696, term143696.getClass(), "typeOfThis", null);
        setField(term143696, term143696.getClass(), "source", null);
        setField(term143696, term143696.getClass(), "implementedInterfaces", null);
        setField(term143696, term143696.getClass(), "subTypes", null);
        setField(term143696, term143696.getClass(), "templateTypeName", null);
        setField(term143696, term143696.getClass(), "className", null);
        setField(term143696, term143696.getClass(), "properties", null);
        setField(term143696, term143696.getClass(), "implicitPrototype", null);
        setBooleanField(term143696, term143696.getClass(), "nativeType", false);
        setBooleanField(term143696, term143696.getClass(), "prettyPrint", false);
        setBooleanField(term143696, term143696.getClass(), "visited", false);
        setField(term143696, term143696.getClass(), "docInfo", null);
        setBooleanField(term143696, term143696.getClass(), "unknown", false);
        setBooleanField(term143696, term143696.getClass(), "resolved", false);
        setField(term143696, term143696.getClass(), "resolveResult", null);
        setField(term143696, term143696.getClass(), "registry", null);
        setField(term143695, term143695.getClass(), "referencedType", term143696);
        setBooleanField(term143695, term143695.getClass(), "visited", false);
        setField(term143695, term143695.getClass(), "docInfo", null);
        setBooleanField(term143695, term143695.getClass(), "unknown", false);
        setBooleanField(term143695, term143695.getClass(), "resolved", false);
        setField(term143695, term143695.getClass(), "resolveResult", null);
        setField(term143695, term143695.getClass(), "registry", null);
        term143663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term143664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term143663, term143663.getClass(), "parameterType", null);
        setField(term143664, term143664.getClass(), "leastSupertypeVisitor", null);
        setField(term143664, term143664.getClass(), "greatestSubtypeVisitor", null);
        setField(term143664, term143664.getClass(), "call", null);
        setField(term143664, term143664.getClass(), "prototype", null);
        setField(term143664, term143664.getClass(), "kind", null);
        setField(term143664, term143664.getClass(), "typeOfThis", null);
        setField(term143664, term143664.getClass(), "source", null);
        setField(term143664, term143664.getClass(), "implementedInterfaces", null);
        setField(term143664, term143664.getClass(), "subTypes", null);
        setField(term143664, term143664.getClass(), "templateTypeName", null);
        setField(term143664, term143664.getClass(), "className", null);
        setField(term143664, term143664.getClass(), "properties", null);
        setField(term143664, term143664.getClass(), "implicitPrototype", null);
        setBooleanField(term143664, term143664.getClass(), "nativeType", false);
        setBooleanField(term143664, term143664.getClass(), "prettyPrint", false);
        setBooleanField(term143664, term143664.getClass(), "visited", false);
        setField(term143664, term143664.getClass(), "docInfo", null);
        setBooleanField(term143664, term143664.getClass(), "unknown", false);
        setBooleanField(term143664, term143664.getClass(), "resolved", false);
        setField(term143664, term143664.getClass(), "resolveResult", null);
        setField(term143664, term143664.getClass(), "registry", null);
        setField(term143663, term143663.getClass(), "referencedType", term143664);
        setBooleanField(term143663, term143663.getClass(), "visited", false);
        setField(term143663, term143663.getClass(), "docInfo", null);
        setBooleanField(term143663, term143663.getClass(), "unknown", false);
        setBooleanField(term143663, term143663.getClass(), "resolved", false);
        setField(term143663, term143663.getClass(), "resolveResult", null);
        setField(term143663, term143663.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term143363;
        args[1] = term143549;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term143363, term143693));
        assertTrue(recursiveEquals(term143549, term143695));
        assertTrue(recursiveEquals(retValue, term143663));
    }

};


