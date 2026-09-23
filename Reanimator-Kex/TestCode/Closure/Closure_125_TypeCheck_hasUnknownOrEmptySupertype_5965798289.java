package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeCheck_hasUnknownOrEmptySupertype_5965798289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6089;

    public TypeCheck_hasUnknownOrEmptySupertype_5965798289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19126 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term19125 = ((Class) term19126).getDeclaredField((String) "INTERFACE");
        ((Field) term19125).setAccessible(true);
        Object enum23 = ((Field) term19125).get((Object) null);
        Class<? extends Object> term19420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term19419 = ((Class) term19420).getDeclaredField((String) "DICT");
        ((Field) term19419).setAccessible(true);
        Object enum24 = ((Field) term19419).get((Object) null);
        term6089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setIntField(term6091, term6091.getClass(), "type", 1084849225);
        setIntField(term6093, term6093.getClass(), "type", -1702055571);
        setIntField(term6095, term6095.getClass(), "type", -944542900);
        setField(term6095, term6095.getClass(), "next", null);
        setField(term6095, term6095.getClass(), "first", null);
        setField(term6095, term6095.getClass(), "last", null);
        setField(term6095, term6095.getClass(), "propListHead", null);
        setIntField(term6095, term6095.getClass(), "sourcePosition", 0);
        setField(term6095, term6095.getClass(), "jsType", null);
        setField(term6095, term6095.getClass(), "parent", null);
        setField(term6093, term6093.getClass(), "next", term6095);
        setIntField(term6098, term6098.getClass(), "type", 0);
        setField(term6098, term6098.getClass(), "next", null);
        setField(term6098, term6098.getClass(), "first", null);
        setField(term6098, term6098.getClass(), "last", null);
        setField(term6098, term6098.getClass(), "propListHead", null);
        setIntField(term6098, term6098.getClass(), "sourcePosition", 0);
        setField(term6098, term6098.getClass(), "jsType", null);
        setField(term6098, term6098.getClass(), "parent", null);
        setField(term6093, term6093.getClass(), "first", term6098);
        setIntField(term6101, term6101.getClass(), "type", 977862393);
        setField(term6101, term6101.getClass(), "next", null);
        setField(term6101, term6101.getClass(), "first", term6098);
        setField(term6101, term6101.getClass(), "last", term6101);
        setField(term6101, term6101.getClass(), "propListHead", null);
        setIntField(term6101, term6101.getClass(), "sourcePosition", 0);
        setField(term6101, term6101.getClass(), "jsType", null);
        setField(term6101, term6101.getClass(), "parent", null);
        setField(term6093, term6093.getClass(), "last", term6101);
        setField(term6093, term6093.getClass(), "propListHead", null);
        setIntField(term6093, term6093.getClass(), "sourcePosition", 0);
        setField(term6093, term6093.getClass(), "jsType", null);
        setField(term6093, term6093.getClass(), "parent", null);
        setField(term6091, term6091.getClass(), "next", term6093);
        setIntField(term6105, term6105.getClass(), "type", 2143282300);
        setIntField(term6107, term6107.getClass(), "type", 1137624258);
        setField(term6107, term6107.getClass(), "next", term6101);
        setField(term6107, term6107.getClass(), "first", null);
        setField(term6107, term6107.getClass(), "last", term6091);
        setField(term6107, term6107.getClass(), "propListHead", null);
        setIntField(term6107, term6107.getClass(), "sourcePosition", 0);
        setField(term6107, term6107.getClass(), "jsType", null);
        setField(term6107, term6107.getClass(), "parent", null);
        setField(term6105, term6105.getClass(), "next", term6107);
        setField(term6105, term6105.getClass(), "first", term6105);
        setIntField(term6110, term6110.getClass(), "type", 2063762142);
        setField(term6110, term6110.getClass(), "next", null);
        setField(term6110, term6110.getClass(), "first", term6098);
        setField(term6110, term6110.getClass(), "last", term6101);
        setField(term6110, term6110.getClass(), "propListHead", null);
        setIntField(term6110, term6110.getClass(), "sourcePosition", 0);
        setField(term6110, term6110.getClass(), "jsType", null);
        setField(term6110, term6110.getClass(), "parent", null);
        setField(term6105, term6105.getClass(), "last", term6110);
        setField(term6105, term6105.getClass(), "propListHead", null);
        setIntField(term6105, term6105.getClass(), "sourcePosition", 0);
        setField(term6105, term6105.getClass(), "jsType", null);
        setField(term6105, term6105.getClass(), "parent", null);
        setField(term6091, term6091.getClass(), "first", term6105);
        setField(term6091, term6091.getClass(), "last", term6095);
        setField(term6091, term6091.getClass(), "propListHead", null);
        setIntField(term6091, term6091.getClass(), "sourcePosition", 0);
        setField(term6091, term6091.getClass(), "jsType", null);
        setField(term6091, term6091.getClass(), "parent", null);
        setField(term6090, term6090.getClass(), "parameters", term6091);
        setField(term6090, term6090.getClass(), "returnType", null);
        setBooleanField(term6090, term6090.getClass(), "returnTypeInferred", false);
        setBooleanField(term6090, term6090.getClass(), "resolved", false);
        setField(term6090, term6090.getClass(), "resolveResult", null);
        setField(term6090, term6090.getClass(), "templateTypeMap", null);
        setBooleanField(term6090, term6090.getClass(), "inTemplatedCheckVisit", false);
        setField(term6090, term6090.getClass(), "registry", null);
        setField(term6089, term6089.getClass(), "call", term6090);
        setField(term6118, term6118.getClass(), "name", null);
        setField(term6118, term6118.getClass(), "type", null);
        setBooleanField(term6118, term6118.getClass(), "inferred", false);
        setField(term6118, term6118.getClass(), "propertyNode", null);
        setField(term6118, term6118.getClass(), "docInfo", null);
        setField(term6089, term6089.getClass(), "prototypeSlot", term6118);
        setField(term6089, term6089.getClass(), "kind", enum23);
        setField(term6089, term6089.getClass(), "propAccess", enum24);
        setField(term6089, term6089.getClass(), "typeOfThis", null);
        setField(term6089, term6089.getClass(), "source", null);
        setField(term6089, term6089.getClass(), "implementedInterfaces", null);
        setField(term6089, term6089.getClass(), "extendedInterfaces", null);
        setField(term6089, term6089.getClass(), "subTypes", null);
        setField(term6089, term6089.getClass(), "className", null);
        setField(term6089, term6089.getClass(), "properties", null);
        setBooleanField(term6089, term6089.getClass(), "nativeType", false);
        setField(term6089, term6089.getClass(), "implicitPrototypeFallback", null);
        setField(term6089, term6089.getClass(), "ownerFunction", null);
        setBooleanField(term6089, term6089.getClass(), "prettyPrint", false);
        setBooleanField(term6089, term6089.getClass(), "visited", false);
        setField(term6089, term6089.getClass(), "docInfo", null);
        setBooleanField(term6089, term6089.getClass(), "unknown", false);
        setBooleanField(term6089, term6089.getClass(), "resolved", false);
        setField(term6089, term6089.getClass(), "resolveResult", null);
        setField(term6089, term6089.getClass(), "templateTypeMap", null);
        setBooleanField(term6089, term6089.getClass(), "inTemplatedCheckVisit", false);
        setField(term6089, term6089.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term6089;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


