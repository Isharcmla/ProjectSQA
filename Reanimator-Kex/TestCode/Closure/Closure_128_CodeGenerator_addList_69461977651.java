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
import java.lang.Boolean;
import java.lang.String;

public class CodeGenerator_addList_69461977651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6812;
     Object term6825;
     Object term6852;
     Object enum52;

    public CodeGenerator_addList_69461977651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6813 = new HashMap();
        term6812 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6812, term6812.getClass(), "ESCAPED_JS_STRINGS", term6813);
        setField(term6812, term6812.getClass(), "cc", null);
        setField(term6812, term6812.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6812, term6812.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6812, term6812.getClass(), "trustedStrings", true);
        term6825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6825, term6825.getClass(), "type", 941650513);
        setIntField(term6827, term6827.getClass(), "type", 444029505);
        setIntField(term6829, term6829.getClass(), "type", -1034506028);
        setIntField(term6831, term6831.getClass(), "type", -1263114719);
        setIntField(term6833, term6833.getClass(), "type", -894662986);
        setField(term6833, term6833.getClass(), "next", null);
        setField(term6833, term6833.getClass(), "first", null);
        setField(term6833, term6833.getClass(), "last", null);
        setField(term6833, term6833.getClass(), "propListHead", null);
        setIntField(term6833, term6833.getClass(), "sourcePosition", 0);
        setField(term6833, term6833.getClass(), "jsType", null);
        setField(term6833, term6833.getClass(), "parent", null);
        setField(term6831, term6831.getClass(), "next", term6833);
        setIntField(term6836, term6836.getClass(), "type", 304775596);
        setField(term6836, term6836.getClass(), "next", null);
        setField(term6836, term6836.getClass(), "first", null);
        setField(term6836, term6836.getClass(), "last", term6833);
        setField(term6836, term6836.getClass(), "propListHead", null);
        setIntField(term6836, term6836.getClass(), "sourcePosition", 0);
        setField(term6836, term6836.getClass(), "jsType", null);
        setField(term6836, term6836.getClass(), "parent", null);
        setField(term6831, term6831.getClass(), "first", term6836);
        setField(term6831, term6831.getClass(), "last", term6829);
        setField(term6831, term6831.getClass(), "propListHead", null);
        setIntField(term6831, term6831.getClass(), "sourcePosition", 0);
        setField(term6831, term6831.getClass(), "jsType", null);
        setField(term6831, term6831.getClass(), "parent", null);
        setField(term6829, term6829.getClass(), "next", term6831);
        setField(term6829, term6829.getClass(), "first", term6833);
        setIntField(term6840, term6840.getClass(), "type", -1888585309);
        setIntField(term6842, term6842.getClass(), "type", 683666002);
        setField(term6842, term6842.getClass(), "next", null);
        setField(term6842, term6842.getClass(), "first", term6836);
        setField(term6842, term6842.getClass(), "last", term6831);
        setField(term6842, term6842.getClass(), "propListHead", null);
        setIntField(term6842, term6842.getClass(), "sourcePosition", 0);
        setField(term6842, term6842.getClass(), "jsType", null);
        setField(term6842, term6842.getClass(), "parent", null);
        setField(term6840, term6840.getClass(), "next", term6842);
        setField(term6840, term6840.getClass(), "first", term6827);
        setField(term6840, term6840.getClass(), "last", term6827);
        setField(term6840, term6840.getClass(), "propListHead", null);
        setIntField(term6840, term6840.getClass(), "sourcePosition", 0);
        setField(term6840, term6840.getClass(), "jsType", null);
        setField(term6840, term6840.getClass(), "parent", null);
        setField(term6829, term6829.getClass(), "last", term6840);
        setField(term6829, term6829.getClass(), "propListHead", null);
        setIntField(term6829, term6829.getClass(), "sourcePosition", 0);
        setField(term6829, term6829.getClass(), "jsType", null);
        setField(term6829, term6829.getClass(), "parent", null);
        setField(term6827, term6827.getClass(), "next", term6829);
        setIntField(term6847, term6847.getClass(), "type", 1596213415);
        setField(term6847, term6847.getClass(), "next", term6840);
        setField(term6847, term6847.getClass(), "first", term6842);
        setField(term6847, term6847.getClass(), "last", term6825);
        setField(term6847, term6847.getClass(), "propListHead", null);
        setIntField(term6847, term6847.getClass(), "sourcePosition", 0);
        setField(term6847, term6847.getClass(), "jsType", null);
        setField(term6847, term6847.getClass(), "parent", null);
        setField(term6827, term6827.getClass(), "first", term6847);
        setField(term6827, term6827.getClass(), "last", term6847);
        setField(term6827, term6827.getClass(), "propListHead", null);
        setIntField(term6827, term6827.getClass(), "sourcePosition", 0);
        setField(term6827, term6827.getClass(), "jsType", null);
        setField(term6827, term6827.getClass(), "parent", null);
        setField(term6825, term6825.getClass(), "next", term6827);
        setField(term6825, term6825.getClass(), "first", term6831);
        setField(term6825, term6825.getClass(), "last", term6833);
        setField(term6825, term6825.getClass(), "propListHead", null);
        setIntField(term6825, term6825.getClass(), "sourcePosition", 0);
        setField(term6825, term6825.getClass(), "jsType", null);
        setField(term6825, term6825.getClass(), "parent", null);
        term6852 = new Boolean(false);
        Class<? extends Object> term21078 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term21077 = ((Class) term21078).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term21077).setAccessible(true);
        enum52 = ((Field) term21077).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term6825;
        args[1] = term6852;
        args[2] = enum52;
        try {
            callMethod(klass, "addList", argTypes, term6812, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


