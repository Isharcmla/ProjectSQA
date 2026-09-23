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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addList_69461977651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11427;
     Object term11455;
     Object term11482;
     Object enum92;

    public CodeGenerator_addList_69461977651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11428 = new HashMap();
        Class<? extends Object> term34599 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term34598 = ((Class) term34599).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term34598).setAccessible(true);
        Object enum91 = ((Field) term34598).get((Object) null);
        term11427 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term11427, term11427.getClass(), "escapedJsStrings", term11428);
        setField(term11427, term11427.getClass(), "cc", null);
        setField(term11427, term11427.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term11427, term11427.getClass(), "preferSingleQuotes", true);
        setBooleanField(term11427, term11427.getClass(), "trustedStrings", false);
        setField(term11427, term11427.getClass(), "languageMode", enum91);
        term11455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11455, term11455.getClass(), "type", 941650513);
        setIntField(term11457, term11457.getClass(), "type", 444029505);
        setIntField(term11459, term11459.getClass(), "type", -1034506028);
        setIntField(term11461, term11461.getClass(), "type", -1263114719);
        setIntField(term11463, term11463.getClass(), "type", -894662986);
        setField(term11463, term11463.getClass(), "next", null);
        setField(term11463, term11463.getClass(), "first", null);
        setField(term11463, term11463.getClass(), "last", null);
        setField(term11463, term11463.getClass(), "propListHead", null);
        setIntField(term11463, term11463.getClass(), "sourcePosition", 0);
        setField(term11463, term11463.getClass(), "jsType", null);
        setField(term11463, term11463.getClass(), "parent", null);
        setField(term11461, term11461.getClass(), "next", term11463);
        setIntField(term11466, term11466.getClass(), "type", 304775596);
        setField(term11466, term11466.getClass(), "next", null);
        setField(term11466, term11466.getClass(), "first", null);
        setField(term11466, term11466.getClass(), "last", term11463);
        setField(term11466, term11466.getClass(), "propListHead", null);
        setIntField(term11466, term11466.getClass(), "sourcePosition", 0);
        setField(term11466, term11466.getClass(), "jsType", null);
        setField(term11466, term11466.getClass(), "parent", null);
        setField(term11461, term11461.getClass(), "first", term11466);
        setField(term11461, term11461.getClass(), "last", term11459);
        setField(term11461, term11461.getClass(), "propListHead", null);
        setIntField(term11461, term11461.getClass(), "sourcePosition", 0);
        setField(term11461, term11461.getClass(), "jsType", null);
        setField(term11461, term11461.getClass(), "parent", null);
        setField(term11459, term11459.getClass(), "next", term11461);
        setField(term11459, term11459.getClass(), "first", term11463);
        setIntField(term11470, term11470.getClass(), "type", -1888585309);
        setIntField(term11472, term11472.getClass(), "type", 683666002);
        setField(term11472, term11472.getClass(), "next", null);
        setField(term11472, term11472.getClass(), "first", term11466);
        setField(term11472, term11472.getClass(), "last", term11461);
        setField(term11472, term11472.getClass(), "propListHead", null);
        setIntField(term11472, term11472.getClass(), "sourcePosition", 0);
        setField(term11472, term11472.getClass(), "jsType", null);
        setField(term11472, term11472.getClass(), "parent", null);
        setField(term11470, term11470.getClass(), "next", term11472);
        setField(term11470, term11470.getClass(), "first", term11457);
        setField(term11470, term11470.getClass(), "last", term11457);
        setField(term11470, term11470.getClass(), "propListHead", null);
        setIntField(term11470, term11470.getClass(), "sourcePosition", 0);
        setField(term11470, term11470.getClass(), "jsType", null);
        setField(term11470, term11470.getClass(), "parent", null);
        setField(term11459, term11459.getClass(), "last", term11470);
        setField(term11459, term11459.getClass(), "propListHead", null);
        setIntField(term11459, term11459.getClass(), "sourcePosition", 0);
        setField(term11459, term11459.getClass(), "jsType", null);
        setField(term11459, term11459.getClass(), "parent", null);
        setField(term11457, term11457.getClass(), "next", term11459);
        setIntField(term11477, term11477.getClass(), "type", 1596213415);
        setField(term11477, term11477.getClass(), "next", term11470);
        setField(term11477, term11477.getClass(), "first", term11472);
        setField(term11477, term11477.getClass(), "last", term11455);
        setField(term11477, term11477.getClass(), "propListHead", null);
        setIntField(term11477, term11477.getClass(), "sourcePosition", 0);
        setField(term11477, term11477.getClass(), "jsType", null);
        setField(term11477, term11477.getClass(), "parent", null);
        setField(term11457, term11457.getClass(), "first", term11477);
        setField(term11457, term11457.getClass(), "last", term11477);
        setField(term11457, term11457.getClass(), "propListHead", null);
        setIntField(term11457, term11457.getClass(), "sourcePosition", 0);
        setField(term11457, term11457.getClass(), "jsType", null);
        setField(term11457, term11457.getClass(), "parent", null);
        setField(term11455, term11455.getClass(), "next", term11457);
        setField(term11455, term11455.getClass(), "first", term11461);
        setField(term11455, term11455.getClass(), "last", term11463);
        setField(term11455, term11455.getClass(), "propListHead", null);
        setIntField(term11455, term11455.getClass(), "sourcePosition", 0);
        setField(term11455, term11455.getClass(), "jsType", null);
        setField(term11455, term11455.getClass(), "parent", null);
        term11482 = new Boolean(true);
        Class<? extends Object> term34924 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term34923 = ((Class) term34924).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term34923).setAccessible(true);
        enum92 = ((Field) term34923).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term11455;
        args[1] = term11482;
        args[2] = enum92;
        try {
            callMethod(klass, "addList", argTypes, term11427, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


