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
     Object term11430;
     Object term11458;
     Object term11485;
     Object enum92;

    public CodeGenerator_addList_69461977651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11431 = new HashMap();
        Class<? extends Object> term34624 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term34623 = ((Class) term34624).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term34623).setAccessible(true);
        Object enum91 = ((Field) term34623).get((Object) null);
        term11430 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term11430, term11430.getClass(), "escapedJsStrings", term11431);
        setField(term11430, term11430.getClass(), "cc", null);
        setField(term11430, term11430.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term11430, term11430.getClass(), "preferSingleQuotes", true);
        setBooleanField(term11430, term11430.getClass(), "trustedStrings", false);
        setField(term11430, term11430.getClass(), "languageMode", enum91);
        term11458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11458, term11458.getClass(), "type", 941650513);
        setIntField(term11460, term11460.getClass(), "type", 444029505);
        setIntField(term11462, term11462.getClass(), "type", -1034506028);
        setIntField(term11464, term11464.getClass(), "type", -1263114719);
        setIntField(term11466, term11466.getClass(), "type", -894662986);
        setField(term11466, term11466.getClass(), "next", null);
        setField(term11466, term11466.getClass(), "first", null);
        setField(term11466, term11466.getClass(), "last", null);
        setField(term11466, term11466.getClass(), "propListHead", null);
        setIntField(term11466, term11466.getClass(), "sourcePosition", 0);
        setField(term11466, term11466.getClass(), "jsType", null);
        setField(term11466, term11466.getClass(), "parent", null);
        setField(term11464, term11464.getClass(), "next", term11466);
        setIntField(term11469, term11469.getClass(), "type", 304775596);
        setField(term11469, term11469.getClass(), "next", null);
        setField(term11469, term11469.getClass(), "first", null);
        setField(term11469, term11469.getClass(), "last", term11466);
        setField(term11469, term11469.getClass(), "propListHead", null);
        setIntField(term11469, term11469.getClass(), "sourcePosition", 0);
        setField(term11469, term11469.getClass(), "jsType", null);
        setField(term11469, term11469.getClass(), "parent", null);
        setField(term11464, term11464.getClass(), "first", term11469);
        setField(term11464, term11464.getClass(), "last", term11462);
        setField(term11464, term11464.getClass(), "propListHead", null);
        setIntField(term11464, term11464.getClass(), "sourcePosition", 0);
        setField(term11464, term11464.getClass(), "jsType", null);
        setField(term11464, term11464.getClass(), "parent", null);
        setField(term11462, term11462.getClass(), "next", term11464);
        setField(term11462, term11462.getClass(), "first", term11466);
        setIntField(term11473, term11473.getClass(), "type", -1888585309);
        setIntField(term11475, term11475.getClass(), "type", 683666002);
        setField(term11475, term11475.getClass(), "next", null);
        setField(term11475, term11475.getClass(), "first", term11469);
        setField(term11475, term11475.getClass(), "last", term11464);
        setField(term11475, term11475.getClass(), "propListHead", null);
        setIntField(term11475, term11475.getClass(), "sourcePosition", 0);
        setField(term11475, term11475.getClass(), "jsType", null);
        setField(term11475, term11475.getClass(), "parent", null);
        setField(term11473, term11473.getClass(), "next", term11475);
        setField(term11473, term11473.getClass(), "first", term11460);
        setField(term11473, term11473.getClass(), "last", term11460);
        setField(term11473, term11473.getClass(), "propListHead", null);
        setIntField(term11473, term11473.getClass(), "sourcePosition", 0);
        setField(term11473, term11473.getClass(), "jsType", null);
        setField(term11473, term11473.getClass(), "parent", null);
        setField(term11462, term11462.getClass(), "last", term11473);
        setField(term11462, term11462.getClass(), "propListHead", null);
        setIntField(term11462, term11462.getClass(), "sourcePosition", 0);
        setField(term11462, term11462.getClass(), "jsType", null);
        setField(term11462, term11462.getClass(), "parent", null);
        setField(term11460, term11460.getClass(), "next", term11462);
        setIntField(term11480, term11480.getClass(), "type", 1596213415);
        setField(term11480, term11480.getClass(), "next", term11473);
        setField(term11480, term11480.getClass(), "first", term11475);
        setField(term11480, term11480.getClass(), "last", term11458);
        setField(term11480, term11480.getClass(), "propListHead", null);
        setIntField(term11480, term11480.getClass(), "sourcePosition", 0);
        setField(term11480, term11480.getClass(), "jsType", null);
        setField(term11480, term11480.getClass(), "parent", null);
        setField(term11460, term11460.getClass(), "first", term11480);
        setField(term11460, term11460.getClass(), "last", term11480);
        setField(term11460, term11460.getClass(), "propListHead", null);
        setIntField(term11460, term11460.getClass(), "sourcePosition", 0);
        setField(term11460, term11460.getClass(), "jsType", null);
        setField(term11460, term11460.getClass(), "parent", null);
        setField(term11458, term11458.getClass(), "next", term11460);
        setField(term11458, term11458.getClass(), "first", term11464);
        setField(term11458, term11458.getClass(), "last", term11466);
        setField(term11458, term11458.getClass(), "propListHead", null);
        setIntField(term11458, term11458.getClass(), "sourcePosition", 0);
        setField(term11458, term11458.getClass(), "jsType", null);
        setField(term11458, term11458.getClass(), "parent", null);
        term11485 = new Boolean(false);
        Class<? extends Object> term34949 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term34948 = ((Class) term34949).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term34948).setAccessible(true);
        enum92 = ((Field) term34948).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term11458;
        args[1] = term11485;
        args[2] = enum92;
        try {
            callMethod(klass, "addList", argTypes, term11430, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


