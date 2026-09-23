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

public class JSType_getGreatestSubtype_1951394506355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76053;
     Object term76185;
     Object term76187;
     Object term76114;

    public JSType_getGreatestSubtype_1951394506355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76053 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term76112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term76053, term76053.getClass(), "referencedType", term76112);
        term76185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term76186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term76185, term76185.getClass(), "indexType", null);
        setField(term76186, term76186.getClass(), "ownerFunction", null);
        setField(term76186, term76186.getClass(), "className", null);
        setField(term76186, term76186.getClass(), "properties", null);
        setField(term76186, term76186.getClass(), "implicitPrototype", null);
        setBooleanField(term76186, term76186.getClass(), "nativeType", false);
        setBooleanField(term76186, term76186.getClass(), "prettyPrint", false);
        setBooleanField(term76186, term76186.getClass(), "visited", false);
        setField(term76186, term76186.getClass(), "docInfo", null);
        setBooleanField(term76186, term76186.getClass(), "unknown", false);
        setBooleanField(term76186, term76186.getClass(), "resolved", false);
        setField(term76186, term76186.getClass(), "resolveResult", null);
        setField(term76186, term76186.getClass(), "registry", null);
        setField(term76185, term76185.getClass(), "referencedType", term76186);
        setBooleanField(term76185, term76185.getClass(), "visited", false);
        setField(term76185, term76185.getClass(), "docInfo", null);
        setBooleanField(term76185, term76185.getClass(), "unknown", false);
        setBooleanField(term76185, term76185.getClass(), "resolved", false);
        setField(term76185, term76185.getClass(), "resolveResult", null);
        setField(term76185, term76185.getClass(), "registry", null);
        term76187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term76188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term76187, term76187.getClass(), "indexType", null);
        setField(term76188, term76188.getClass(), "ownerFunction", null);
        setField(term76188, term76188.getClass(), "className", null);
        setField(term76188, term76188.getClass(), "properties", null);
        setField(term76188, term76188.getClass(), "implicitPrototype", null);
        setBooleanField(term76188, term76188.getClass(), "nativeType", false);
        setBooleanField(term76188, term76188.getClass(), "prettyPrint", false);
        setBooleanField(term76188, term76188.getClass(), "visited", false);
        setField(term76188, term76188.getClass(), "docInfo", null);
        setBooleanField(term76188, term76188.getClass(), "unknown", false);
        setBooleanField(term76188, term76188.getClass(), "resolved", false);
        setField(term76188, term76188.getClass(), "resolveResult", null);
        setField(term76188, term76188.getClass(), "registry", null);
        setField(term76187, term76187.getClass(), "referencedType", term76188);
        setBooleanField(term76187, term76187.getClass(), "visited", false);
        setField(term76187, term76187.getClass(), "docInfo", null);
        setBooleanField(term76187, term76187.getClass(), "unknown", false);
        setBooleanField(term76187, term76187.getClass(), "resolved", false);
        setField(term76187, term76187.getClass(), "resolveResult", null);
        setField(term76187, term76187.getClass(), "registry", null);
        term76114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term76115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term76114, term76114.getClass(), "indexType", null);
        setField(term76115, term76115.getClass(), "ownerFunction", null);
        setField(term76115, term76115.getClass(), "className", null);
        setField(term76115, term76115.getClass(), "properties", null);
        setField(term76115, term76115.getClass(), "implicitPrototype", null);
        setBooleanField(term76115, term76115.getClass(), "nativeType", false);
        setBooleanField(term76115, term76115.getClass(), "prettyPrint", false);
        setBooleanField(term76115, term76115.getClass(), "visited", false);
        setField(term76115, term76115.getClass(), "docInfo", null);
        setBooleanField(term76115, term76115.getClass(), "unknown", false);
        setBooleanField(term76115, term76115.getClass(), "resolved", false);
        setField(term76115, term76115.getClass(), "resolveResult", null);
        setField(term76115, term76115.getClass(), "registry", null);
        setField(term76114, term76114.getClass(), "referencedType", term76115);
        setBooleanField(term76114, term76114.getClass(), "visited", false);
        setField(term76114, term76114.getClass(), "docInfo", null);
        setBooleanField(term76114, term76114.getClass(), "unknown", false);
        setBooleanField(term76114, term76114.getClass(), "resolved", false);
        setField(term76114, term76114.getClass(), "resolveResult", null);
        setField(term76114, term76114.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term76053;
        args[1] = term76053;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term76053, term76185));
        assertTrue(recursiveEquals(term76053, term76187));
        assertTrue(recursiveEquals(retValue, term76114));
    }

};


