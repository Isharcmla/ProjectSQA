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

public class JSType_getGreatestSubtype_1951394506301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56740;
     Object term56916;
     Object term56986;
     Object term56987;
     Object term56933;

    public JSType_getGreatestSubtype_1951394506301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term56828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term56740, term56740.getClass(), "referencedType", term56828);
        term56916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term56986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term56986, term56986.getClass(), "call", null);
        setField(term56986, term56986.getClass(), "prototype", null);
        setField(term56986, term56986.getClass(), "kind", null);
        setField(term56986, term56986.getClass(), "typeOfThis", null);
        setField(term56986, term56986.getClass(), "source", null);
        setField(term56986, term56986.getClass(), "implementedInterfaces", null);
        setField(term56986, term56986.getClass(), "subTypes", null);
        setField(term56986, term56986.getClass(), "templateTypeName", null);
        setField(term56986, term56986.getClass(), "className", null);
        setField(term56986, term56986.getClass(), "properties", null);
        setBooleanField(term56986, term56986.getClass(), "nativeType", false);
        setField(term56986, term56986.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term56986, term56986.getClass(), "prettyPrint", false);
        setBooleanField(term56986, term56986.getClass(), "visited", false);
        setField(term56986, term56986.getClass(), "docInfo", null);
        setBooleanField(term56986, term56986.getClass(), "unknown", false);
        setBooleanField(term56986, term56986.getClass(), "resolved", false);
        setField(term56986, term56986.getClass(), "resolveResult", null);
        setField(term56986, term56986.getClass(), "registry", null);
        term56987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term56988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term56987, term56987.getClass(), "indexType", null);
        setField(term56988, term56988.getClass(), "call", null);
        setField(term56988, term56988.getClass(), "prototype", null);
        setField(term56988, term56988.getClass(), "kind", null);
        setField(term56988, term56988.getClass(), "typeOfThis", null);
        setField(term56988, term56988.getClass(), "source", null);
        setField(term56988, term56988.getClass(), "implementedInterfaces", null);
        setField(term56988, term56988.getClass(), "subTypes", null);
        setField(term56988, term56988.getClass(), "templateTypeName", null);
        setField(term56988, term56988.getClass(), "className", null);
        setField(term56988, term56988.getClass(), "properties", null);
        setBooleanField(term56988, term56988.getClass(), "nativeType", false);
        setField(term56988, term56988.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term56988, term56988.getClass(), "prettyPrint", false);
        setBooleanField(term56988, term56988.getClass(), "visited", false);
        setField(term56988, term56988.getClass(), "docInfo", null);
        setBooleanField(term56988, term56988.getClass(), "unknown", false);
        setBooleanField(term56988, term56988.getClass(), "resolved", false);
        setField(term56988, term56988.getClass(), "resolveResult", null);
        setField(term56988, term56988.getClass(), "registry", null);
        setField(term56987, term56987.getClass(), "referencedType", term56988);
        setField(term56987, term56987.getClass(), "referencedObjType", null);
        setBooleanField(term56987, term56987.getClass(), "visited", false);
        setField(term56987, term56987.getClass(), "docInfo", null);
        setBooleanField(term56987, term56987.getClass(), "unknown", false);
        setBooleanField(term56987, term56987.getClass(), "resolved", false);
        setField(term56987, term56987.getClass(), "resolveResult", null);
        setField(term56987, term56987.getClass(), "registry", null);
        term56933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term56934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term56933, term56933.getClass(), "indexType", null);
        setField(term56934, term56934.getClass(), "call", null);
        setField(term56934, term56934.getClass(), "prototype", null);
        setField(term56934, term56934.getClass(), "kind", null);
        setField(term56934, term56934.getClass(), "typeOfThis", null);
        setField(term56934, term56934.getClass(), "source", null);
        setField(term56934, term56934.getClass(), "implementedInterfaces", null);
        setField(term56934, term56934.getClass(), "subTypes", null);
        setField(term56934, term56934.getClass(), "templateTypeName", null);
        setField(term56934, term56934.getClass(), "className", null);
        setField(term56934, term56934.getClass(), "properties", null);
        setBooleanField(term56934, term56934.getClass(), "nativeType", false);
        setField(term56934, term56934.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term56934, term56934.getClass(), "prettyPrint", false);
        setBooleanField(term56934, term56934.getClass(), "visited", false);
        setField(term56934, term56934.getClass(), "docInfo", null);
        setBooleanField(term56934, term56934.getClass(), "unknown", false);
        setBooleanField(term56934, term56934.getClass(), "resolved", false);
        setField(term56934, term56934.getClass(), "resolveResult", null);
        setField(term56934, term56934.getClass(), "registry", null);
        setField(term56933, term56933.getClass(), "referencedType", term56934);
        setField(term56933, term56933.getClass(), "referencedObjType", null);
        setBooleanField(term56933, term56933.getClass(), "visited", false);
        setField(term56933, term56933.getClass(), "docInfo", null);
        setBooleanField(term56933, term56933.getClass(), "unknown", false);
        setBooleanField(term56933, term56933.getClass(), "resolved", false);
        setField(term56933, term56933.getClass(), "resolveResult", null);
        setField(term56933, term56933.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term56740;
        args[1] = term56916;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term56740, term56986));
        assertTrue(recursiveEquals(term56916, term56987));
        assertTrue(recursiveEquals(retValue, term56933));
    }

};


