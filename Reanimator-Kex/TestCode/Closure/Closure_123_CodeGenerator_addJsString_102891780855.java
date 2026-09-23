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

public class CodeGenerator_addJsString_102891780855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13318;
     Object term13346;

    public CodeGenerator_addJsString_102891780855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13319 = new HashMap();
        Class<? extends Object> term37342 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term37341 = ((Class) term37342).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term37341).setAccessible(true);
        Object enum96 = ((Field) term37341).get((Object) null);
        term13318 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term13318, term13318.getClass(), "escapedJsStrings", term13319);
        setField(term13318, term13318.getClass(), "cc", null);
        setField(term13318, term13318.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term13318, term13318.getClass(), "preferSingleQuotes", false);
        setBooleanField(term13318, term13318.getClass(), "trustedStrings", false);
        setField(term13318, term13318.getClass(), "languageMode", enum96);
        term13346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13346, term13346.getClass(), "type", 107945604);
        setIntField(term13348, term13348.getClass(), "type", -1963464809);
        setIntField(term13350, term13350.getClass(), "type", 71190297);
        setIntField(term13352, term13352.getClass(), "type", 1202361360);
        setIntField(term13354, term13354.getClass(), "type", -2015048153);
        setField(term13354, term13354.getClass(), "next", null);
        setField(term13354, term13354.getClass(), "first", null);
        setField(term13354, term13354.getClass(), "last", null);
        setField(term13354, term13354.getClass(), "propListHead", null);
        setIntField(term13354, term13354.getClass(), "sourcePosition", 0);
        setField(term13354, term13354.getClass(), "jsType", null);
        setField(term13354, term13354.getClass(), "parent", null);
        setField(term13352, term13352.getClass(), "next", term13354);
        setIntField(term13357, term13357.getClass(), "type", -2063457669);
        setField(term13357, term13357.getClass(), "next", null);
        setField(term13357, term13357.getClass(), "first", null);
        setField(term13357, term13357.getClass(), "last", term13354);
        setField(term13357, term13357.getClass(), "propListHead", null);
        setIntField(term13357, term13357.getClass(), "sourcePosition", 0);
        setField(term13357, term13357.getClass(), "jsType", null);
        setField(term13357, term13357.getClass(), "parent", null);
        setField(term13352, term13352.getClass(), "first", term13357);
        setField(term13352, term13352.getClass(), "last", term13350);
        setField(term13352, term13352.getClass(), "propListHead", null);
        setIntField(term13352, term13352.getClass(), "sourcePosition", 0);
        setField(term13352, term13352.getClass(), "jsType", null);
        setField(term13352, term13352.getClass(), "parent", null);
        setField(term13350, term13350.getClass(), "next", term13352);
        setField(term13350, term13350.getClass(), "first", term13354);
        setIntField(term13361, term13361.getClass(), "type", 2095798786);
        setIntField(term13363, term13363.getClass(), "type", -1565502840);
        setField(term13363, term13363.getClass(), "next", null);
        setField(term13363, term13363.getClass(), "first", term13357);
        setField(term13363, term13363.getClass(), "last", term13352);
        setField(term13363, term13363.getClass(), "propListHead", null);
        setIntField(term13363, term13363.getClass(), "sourcePosition", 0);
        setField(term13363, term13363.getClass(), "jsType", null);
        setField(term13363, term13363.getClass(), "parent", null);
        setField(term13361, term13361.getClass(), "next", term13363);
        setField(term13361, term13361.getClass(), "first", term13348);
        setField(term13361, term13361.getClass(), "last", term13348);
        setField(term13361, term13361.getClass(), "propListHead", null);
        setIntField(term13361, term13361.getClass(), "sourcePosition", 0);
        setField(term13361, term13361.getClass(), "jsType", null);
        setField(term13361, term13361.getClass(), "parent", null);
        setField(term13350, term13350.getClass(), "last", term13361);
        setField(term13350, term13350.getClass(), "propListHead", null);
        setIntField(term13350, term13350.getClass(), "sourcePosition", 0);
        setField(term13350, term13350.getClass(), "jsType", null);
        setField(term13350, term13350.getClass(), "parent", null);
        setField(term13348, term13348.getClass(), "next", term13350);
        setIntField(term13368, term13368.getClass(), "type", 344323424);
        setField(term13368, term13368.getClass(), "next", term13361);
        setField(term13368, term13368.getClass(), "first", term13363);
        setField(term13368, term13368.getClass(), "last", term13346);
        setField(term13368, term13368.getClass(), "propListHead", null);
        setIntField(term13368, term13368.getClass(), "sourcePosition", 0);
        setField(term13368, term13368.getClass(), "jsType", null);
        setField(term13368, term13368.getClass(), "parent", null);
        setField(term13348, term13348.getClass(), "first", term13368);
        setField(term13348, term13348.getClass(), "last", term13368);
        setField(term13348, term13348.getClass(), "propListHead", null);
        setIntField(term13348, term13348.getClass(), "sourcePosition", 0);
        setField(term13348, term13348.getClass(), "jsType", null);
        setField(term13348, term13348.getClass(), "parent", null);
        setField(term13346, term13346.getClass(), "next", term13348);
        setField(term13346, term13346.getClass(), "first", term13352);
        setField(term13346, term13346.getClass(), "last", term13354);
        setField(term13346, term13346.getClass(), "propListHead", null);
        setIntField(term13346, term13346.getClass(), "sourcePosition", 0);
        setField(term13346, term13346.getClass(), "jsType", null);
        setField(term13346, term13346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13346;
        try {
            callMethod(klass, "addJsString", argTypes, term13318, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


