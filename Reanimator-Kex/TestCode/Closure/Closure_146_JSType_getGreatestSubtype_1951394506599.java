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

public class JSType_getGreatestSubtype_1951394506599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167059;
     Object term167275;
     Object term167517;
     Object term167519;
     Object term167365;

    public JSType_getGreatestSubtype_1951394506599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term167177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term167177, term167177.getClass(), "unknown", false);
        setField(term167059, term167059.getClass(), "referencedType", term167177);
        term167275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term167363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term167363, term167363.getClass(), "unknown", false);
        setField(term167275, term167275.getClass(), "referencedType", term167363);
        term167517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term167518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term167517, term167517.getClass(), "indexType", null);
        setField(term167518, term167518.getClass(), "leastSupertypeVisitor", null);
        setField(term167518, term167518.getClass(), "greatestSubtypeVisitor", null);
        setField(term167518, term167518.getClass(), "call", null);
        setField(term167518, term167518.getClass(), "prototype", null);
        setField(term167518, term167518.getClass(), "kind", null);
        setField(term167518, term167518.getClass(), "typeOfThis", null);
        setField(term167518, term167518.getClass(), "source", null);
        setField(term167518, term167518.getClass(), "implementedInterfaces", null);
        setField(term167518, term167518.getClass(), "subTypes", null);
        setField(term167518, term167518.getClass(), "templateTypeName", null);
        setField(term167518, term167518.getClass(), "className", null);
        setField(term167518, term167518.getClass(), "properties", null);
        setField(term167518, term167518.getClass(), "implicitPrototype", null);
        setBooleanField(term167518, term167518.getClass(), "nativeType", false);
        setBooleanField(term167518, term167518.getClass(), "prettyPrint", false);
        setBooleanField(term167518, term167518.getClass(), "visited", false);
        setField(term167518, term167518.getClass(), "docInfo", null);
        setBooleanField(term167518, term167518.getClass(), "unknown", false);
        setBooleanField(term167518, term167518.getClass(), "resolved", false);
        setField(term167518, term167518.getClass(), "resolveResult", null);
        setField(term167518, term167518.getClass(), "registry", null);
        setField(term167517, term167517.getClass(), "referencedType", term167518);
        setBooleanField(term167517, term167517.getClass(), "visited", false);
        setField(term167517, term167517.getClass(), "docInfo", null);
        setBooleanField(term167517, term167517.getClass(), "unknown", false);
        setBooleanField(term167517, term167517.getClass(), "resolved", false);
        setField(term167517, term167517.getClass(), "resolveResult", null);
        setField(term167517, term167517.getClass(), "registry", null);
        term167519 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term167520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term167519, term167519.getClass(), "parameterType", null);
        setField(term167520, term167520.getClass(), "ownerFunction", null);
        setField(term167520, term167520.getClass(), "className", null);
        setField(term167520, term167520.getClass(), "properties", null);
        setField(term167520, term167520.getClass(), "implicitPrototype", null);
        setBooleanField(term167520, term167520.getClass(), "nativeType", false);
        setBooleanField(term167520, term167520.getClass(), "prettyPrint", false);
        setBooleanField(term167520, term167520.getClass(), "visited", false);
        setField(term167520, term167520.getClass(), "docInfo", null);
        setBooleanField(term167520, term167520.getClass(), "unknown", false);
        setBooleanField(term167520, term167520.getClass(), "resolved", false);
        setField(term167520, term167520.getClass(), "resolveResult", null);
        setField(term167520, term167520.getClass(), "registry", null);
        setField(term167519, term167519.getClass(), "referencedType", term167520);
        setBooleanField(term167519, term167519.getClass(), "visited", false);
        setField(term167519, term167519.getClass(), "docInfo", null);
        setBooleanField(term167519, term167519.getClass(), "unknown", false);
        setBooleanField(term167519, term167519.getClass(), "resolved", false);
        setField(term167519, term167519.getClass(), "resolveResult", null);
        setField(term167519, term167519.getClass(), "registry", null);
        term167365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term167366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term167365, term167365.getClass(), "indexType", null);
        setField(term167366, term167366.getClass(), "leastSupertypeVisitor", null);
        setField(term167366, term167366.getClass(), "greatestSubtypeVisitor", null);
        setField(term167366, term167366.getClass(), "call", null);
        setField(term167366, term167366.getClass(), "prototype", null);
        setField(term167366, term167366.getClass(), "kind", null);
        setField(term167366, term167366.getClass(), "typeOfThis", null);
        setField(term167366, term167366.getClass(), "source", null);
        setField(term167366, term167366.getClass(), "implementedInterfaces", null);
        setField(term167366, term167366.getClass(), "subTypes", null);
        setField(term167366, term167366.getClass(), "templateTypeName", null);
        setField(term167366, term167366.getClass(), "className", null);
        setField(term167366, term167366.getClass(), "properties", null);
        setField(term167366, term167366.getClass(), "implicitPrototype", null);
        setBooleanField(term167366, term167366.getClass(), "nativeType", false);
        setBooleanField(term167366, term167366.getClass(), "prettyPrint", false);
        setBooleanField(term167366, term167366.getClass(), "visited", false);
        setField(term167366, term167366.getClass(), "docInfo", null);
        setBooleanField(term167366, term167366.getClass(), "unknown", false);
        setBooleanField(term167366, term167366.getClass(), "resolved", false);
        setField(term167366, term167366.getClass(), "resolveResult", null);
        setField(term167366, term167366.getClass(), "registry", null);
        setField(term167365, term167365.getClass(), "referencedType", term167366);
        setBooleanField(term167365, term167365.getClass(), "visited", false);
        setField(term167365, term167365.getClass(), "docInfo", null);
        setBooleanField(term167365, term167365.getClass(), "unknown", false);
        setBooleanField(term167365, term167365.getClass(), "resolved", false);
        setField(term167365, term167365.getClass(), "resolveResult", null);
        setField(term167365, term167365.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term167059;
        args[1] = term167275;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term167059, term167517));
        assertTrue(recursiveEquals(term167275, term167519));
        assertTrue(recursiveEquals(retValue, term167365));
    }

};


