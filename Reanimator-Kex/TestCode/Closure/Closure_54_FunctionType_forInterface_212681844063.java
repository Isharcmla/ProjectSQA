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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_forInterface_212681844063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;
     Object term402;

    public FunctionType_forInterface_212681844063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term308 = new HashMap();
        HashMap term318 = new HashMap();
        Set<Object> term22651 =  ((Map) term318).keySet();
        HashSet term317 = new HashSet((Collection<? extends Object>) term22651);
        HashMap term335 = new HashMap();
        Set<Object> term22652 =  ((Map) term335).keySet();
        HashSet term334 = new HashSet((Collection<? extends Object>) term22652);
        HashMap term346 = new HashMap();
        Set<Object> term22653 =  ((Map) term346).keySet();
        HashSet term345 = new HashSet((Collection<? extends Object>) term22653);
        HashMap term360 = new HashMap();
        HashMap term374 = new HashMap();
        HashMap term379 = new HashMap();
        term306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term307 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term306, term306.getClass(), "reporter", null);
        setField(term306, term306.getClass(), "nativeTypes", term307);
        setField(term306, term306.getClass(), "namesToTypes", term308);
        setField(term306, term306.getClass(), "namespaces", term317);
        setField(term306, term306.getClass(), "nonNullableTypeNames", term334);
        setField(term306, term306.getClass(), "forwardDeclaredTypes", term345);
        setField(term306, term306.getClass(), "typesIndexedByProperty", term360);
        setField(term306, term306.getClass(), "eachRefTypeIndexedByProperty", term374);
        setField(term306, term306.getClass(), "greatestSubtypeByProperty", term379);
        setField(term306, term306.getClass(), "interfaceToImplementors", null);
        setField(term306, term306.getClass(), "unresolvedNamedTypes", null);
        setField(term306, term306.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term306, term306.getClass(), "lastGeneration", false);
        setField(term306, term306.getClass(), "templateTypeName", null);
        setField(term306, term306.getClass(), "templateType", null);
        setBooleanField(term306, term306.getClass(), "tolerateUndefinedValues", false);
        setField(term306, term306.getClass(), "resolveMode", null);
        term402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term402, term402.getClass(), "type", 767834723);
        setIntField(term404, term404.getClass(), "type", -817164822);
        setIntField(term406, term406.getClass(), "type", 0);
        setField(term406, term406.getClass(), "next", null);
        setField(term406, term406.getClass(), "first", null);
        setField(term406, term406.getClass(), "last", null);
        setField(term406, term406.getClass(), "propListHead", null);
        setIntField(term406, term406.getClass(), "sourcePosition", 0);
        setField(term406, term406.getClass(), "jsType", null);
        setField(term406, term406.getClass(), "parent", null);
        setField(term404, term404.getClass(), "next", term406);
        setIntField(term409, term409.getClass(), "type", 0);
        setField(term409, term409.getClass(), "next", null);
        setField(term409, term409.getClass(), "first", null);
        setField(term409, term409.getClass(), "last", null);
        setField(term409, term409.getClass(), "propListHead", null);
        setIntField(term409, term409.getClass(), "sourcePosition", 0);
        setField(term409, term409.getClass(), "jsType", null);
        setField(term409, term409.getClass(), "parent", null);
        setField(term404, term404.getClass(), "first", term409);
        setIntField(term412, term412.getClass(), "type", 0);
        setField(term412, term412.getClass(), "next", null);
        setField(term412, term412.getClass(), "first", null);
        setField(term412, term412.getClass(), "last", null);
        setField(term412, term412.getClass(), "propListHead", null);
        setIntField(term412, term412.getClass(), "sourcePosition", 0);
        setField(term412, term412.getClass(), "jsType", null);
        setField(term412, term412.getClass(), "parent", null);
        setField(term404, term404.getClass(), "last", term412);
        setField(term404, term404.getClass(), "propListHead", null);
        setIntField(term404, term404.getClass(), "sourcePosition", 0);
        setField(term404, term404.getClass(), "jsType", null);
        setField(term404, term404.getClass(), "parent", null);
        setField(term402, term402.getClass(), "next", term404);
        setIntField(term416, term416.getClass(), "type", 0);
        setField(term416, term416.getClass(), "next", null);
        setField(term416, term416.getClass(), "first", null);
        setField(term416, term416.getClass(), "last", null);
        setField(term416, term416.getClass(), "propListHead", null);
        setIntField(term416, term416.getClass(), "sourcePosition", 0);
        setField(term416, term416.getClass(), "jsType", null);
        setField(term416, term416.getClass(), "parent", null);
        setField(term402, term402.getClass(), "first", term416);
        setIntField(term419, term419.getClass(), "type", 0);
        setField(term419, term419.getClass(), "next", null);
        setField(term419, term419.getClass(), "first", null);
        setField(term419, term419.getClass(), "last", null);
        setField(term419, term419.getClass(), "propListHead", null);
        setIntField(term419, term419.getClass(), "sourcePosition", 0);
        setField(term419, term419.getClass(), "jsType", null);
        setField(term419, term419.getClass(), "parent", null);
        setField(term402, term402.getClass(), "last", term419);
        setField(term402, term402.getClass(), "propListHead", null);
        setIntField(term402, term402.getClass(), "sourcePosition", 0);
        setField(term402, term402.getClass(), "jsType", null);
        setField(term402, term402.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term306;
        args[1] = "jwsfVjMoJT";
        args[2] = term402;
        try {
            callMethod(klass, "forInterface", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


