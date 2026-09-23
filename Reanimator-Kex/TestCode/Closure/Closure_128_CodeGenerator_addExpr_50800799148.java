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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addExpr_50800799148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6371;
     Object term6384;
     Object term6411;
     Object enum51;

    public CodeGenerator_addExpr_50800799148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6372 = new HashMap();
        term6371 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6371, term6371.getClass(), "ESCAPED_JS_STRINGS", term6372);
        setField(term6371, term6371.getClass(), "cc", null);
        setField(term6371, term6371.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6371, term6371.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6371, term6371.getClass(), "trustedStrings", false);
        term6384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6384, term6384.getClass(), "type", -2095575670);
        setIntField(term6386, term6386.getClass(), "type", 1225272962);
        setIntField(term6388, term6388.getClass(), "type", 1324040357);
        setIntField(term6390, term6390.getClass(), "type", -1588772968);
        setIntField(term6392, term6392.getClass(), "type", -93135961);
        setField(term6392, term6392.getClass(), "next", null);
        setField(term6392, term6392.getClass(), "first", null);
        setField(term6392, term6392.getClass(), "last", null);
        setField(term6392, term6392.getClass(), "propListHead", null);
        setIntField(term6392, term6392.getClass(), "sourcePosition", 0);
        setField(term6392, term6392.getClass(), "jsType", null);
        setField(term6392, term6392.getClass(), "parent", null);
        setField(term6390, term6390.getClass(), "next", term6392);
        setIntField(term6395, term6395.getClass(), "type", -112921587);
        setField(term6395, term6395.getClass(), "next", null);
        setField(term6395, term6395.getClass(), "first", null);
        setField(term6395, term6395.getClass(), "last", term6392);
        setField(term6395, term6395.getClass(), "propListHead", null);
        setIntField(term6395, term6395.getClass(), "sourcePosition", 0);
        setField(term6395, term6395.getClass(), "jsType", null);
        setField(term6395, term6395.getClass(), "parent", null);
        setField(term6390, term6390.getClass(), "first", term6395);
        setField(term6390, term6390.getClass(), "last", term6388);
        setField(term6390, term6390.getClass(), "propListHead", null);
        setIntField(term6390, term6390.getClass(), "sourcePosition", 0);
        setField(term6390, term6390.getClass(), "jsType", null);
        setField(term6390, term6390.getClass(), "parent", null);
        setField(term6388, term6388.getClass(), "next", term6390);
        setField(term6388, term6388.getClass(), "first", term6392);
        setIntField(term6399, term6399.getClass(), "type", 287287233);
        setIntField(term6401, term6401.getClass(), "type", 962840079);
        setField(term6401, term6401.getClass(), "next", null);
        setField(term6401, term6401.getClass(), "first", term6395);
        setField(term6401, term6401.getClass(), "last", term6390);
        setField(term6401, term6401.getClass(), "propListHead", null);
        setIntField(term6401, term6401.getClass(), "sourcePosition", 0);
        setField(term6401, term6401.getClass(), "jsType", null);
        setField(term6401, term6401.getClass(), "parent", null);
        setField(term6399, term6399.getClass(), "next", term6401);
        setField(term6399, term6399.getClass(), "first", term6386);
        setField(term6399, term6399.getClass(), "last", term6386);
        setField(term6399, term6399.getClass(), "propListHead", null);
        setIntField(term6399, term6399.getClass(), "sourcePosition", 0);
        setField(term6399, term6399.getClass(), "jsType", null);
        setField(term6399, term6399.getClass(), "parent", null);
        setField(term6388, term6388.getClass(), "last", term6399);
        setField(term6388, term6388.getClass(), "propListHead", null);
        setIntField(term6388, term6388.getClass(), "sourcePosition", 0);
        setField(term6388, term6388.getClass(), "jsType", null);
        setField(term6388, term6388.getClass(), "parent", null);
        setField(term6386, term6386.getClass(), "next", term6388);
        setIntField(term6406, term6406.getClass(), "type", 1540719661);
        setField(term6406, term6406.getClass(), "next", term6399);
        setField(term6406, term6406.getClass(), "first", term6401);
        setField(term6406, term6406.getClass(), "last", term6384);
        setField(term6406, term6406.getClass(), "propListHead", null);
        setIntField(term6406, term6406.getClass(), "sourcePosition", 0);
        setField(term6406, term6406.getClass(), "jsType", null);
        setField(term6406, term6406.getClass(), "parent", null);
        setField(term6386, term6386.getClass(), "first", term6406);
        setField(term6386, term6386.getClass(), "last", term6406);
        setField(term6386, term6386.getClass(), "propListHead", null);
        setIntField(term6386, term6386.getClass(), "sourcePosition", 0);
        setField(term6386, term6386.getClass(), "jsType", null);
        setField(term6386, term6386.getClass(), "parent", null);
        setField(term6384, term6384.getClass(), "next", term6386);
        setField(term6384, term6384.getClass(), "first", term6390);
        setField(term6384, term6384.getClass(), "last", term6392);
        setField(term6384, term6384.getClass(), "propListHead", null);
        setIntField(term6384, term6384.getClass(), "sourcePosition", 0);
        setField(term6384, term6384.getClass(), "jsType", null);
        setField(term6384, term6384.getClass(), "parent", null);
        term6411 = new Integer(1265463001);
        Class<? extends Object> term19877 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term19876 = ((Class) term19877).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term19876).setAccessible(true);
        enum51 = ((Field) term19876).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term6384;
        args[1] = term6411;
        args[2] = enum51;
        try {
            callMethod(klass, "addExpr", argTypes, term6371, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


