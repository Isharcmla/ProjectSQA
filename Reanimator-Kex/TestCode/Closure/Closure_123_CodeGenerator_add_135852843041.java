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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_add_135852843041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6593;
     Object term6621;
     Object enum79;

    public CodeGenerator_add_135852843041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6594 = new HashMap();
        Class<? extends Object> term28538 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term28537 = ((Class) term28538).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term28537).setAccessible(true);
        Object enum78 = ((Field) term28537).get((Object) null);
        term6593 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6593, term6593.getClass(), "escapedJsStrings", term6594);
        setField(term6593, term6593.getClass(), "cc", null);
        setField(term6593, term6593.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6593, term6593.getClass(), "preferSingleQuotes", true);
        setBooleanField(term6593, term6593.getClass(), "trustedStrings", true);
        setField(term6593, term6593.getClass(), "languageMode", enum78);
        term6621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6621, term6621.getClass(), "type", 1725571209);
        setIntField(term6623, term6623.getClass(), "type", -522618178);
        setIntField(term6625, term6625.getClass(), "type", 1134449235);
        setIntField(term6627, term6627.getClass(), "type", -883034806);
        setIntField(term6629, term6629.getClass(), "type", 1585847225);
        setField(term6629, term6629.getClass(), "next", null);
        setField(term6629, term6629.getClass(), "first", null);
        setField(term6629, term6629.getClass(), "last", null);
        setField(term6629, term6629.getClass(), "propListHead", null);
        setIntField(term6629, term6629.getClass(), "sourcePosition", 0);
        setField(term6629, term6629.getClass(), "jsType", null);
        setField(term6629, term6629.getClass(), "parent", null);
        setField(term6627, term6627.getClass(), "next", term6629);
        setIntField(term6632, term6632.getClass(), "type", 597278769);
        setField(term6632, term6632.getClass(), "next", null);
        setField(term6632, term6632.getClass(), "first", null);
        setField(term6632, term6632.getClass(), "last", term6629);
        setField(term6632, term6632.getClass(), "propListHead", null);
        setIntField(term6632, term6632.getClass(), "sourcePosition", 0);
        setField(term6632, term6632.getClass(), "jsType", null);
        setField(term6632, term6632.getClass(), "parent", null);
        setField(term6627, term6627.getClass(), "first", term6632);
        setField(term6627, term6627.getClass(), "last", term6625);
        setField(term6627, term6627.getClass(), "propListHead", null);
        setIntField(term6627, term6627.getClass(), "sourcePosition", 0);
        setField(term6627, term6627.getClass(), "jsType", null);
        setField(term6627, term6627.getClass(), "parent", null);
        setField(term6625, term6625.getClass(), "next", term6627);
        setField(term6625, term6625.getClass(), "first", term6629);
        setIntField(term6636, term6636.getClass(), "type", -1456670397);
        setIntField(term6638, term6638.getClass(), "type", 1622346318);
        setField(term6638, term6638.getClass(), "next", null);
        setField(term6638, term6638.getClass(), "first", term6632);
        setField(term6638, term6638.getClass(), "last", term6627);
        setField(term6638, term6638.getClass(), "propListHead", null);
        setIntField(term6638, term6638.getClass(), "sourcePosition", 0);
        setField(term6638, term6638.getClass(), "jsType", null);
        setField(term6638, term6638.getClass(), "parent", null);
        setField(term6636, term6636.getClass(), "next", term6638);
        setField(term6636, term6636.getClass(), "first", term6623);
        setField(term6636, term6636.getClass(), "last", term6623);
        setField(term6636, term6636.getClass(), "propListHead", null);
        setIntField(term6636, term6636.getClass(), "sourcePosition", 0);
        setField(term6636, term6636.getClass(), "jsType", null);
        setField(term6636, term6636.getClass(), "parent", null);
        setField(term6625, term6625.getClass(), "last", term6636);
        setField(term6625, term6625.getClass(), "propListHead", null);
        setIntField(term6625, term6625.getClass(), "sourcePosition", 0);
        setField(term6625, term6625.getClass(), "jsType", null);
        setField(term6625, term6625.getClass(), "parent", null);
        setField(term6623, term6623.getClass(), "next", term6625);
        setIntField(term6643, term6643.getClass(), "type", 1048535127);
        setField(term6643, term6643.getClass(), "next", term6636);
        setField(term6643, term6643.getClass(), "first", term6638);
        setField(term6643, term6643.getClass(), "last", term6621);
        setField(term6643, term6643.getClass(), "propListHead", null);
        setIntField(term6643, term6643.getClass(), "sourcePosition", 0);
        setField(term6643, term6643.getClass(), "jsType", null);
        setField(term6643, term6643.getClass(), "parent", null);
        setField(term6623, term6623.getClass(), "first", term6643);
        setField(term6623, term6623.getClass(), "last", term6643);
        setField(term6623, term6623.getClass(), "propListHead", null);
        setIntField(term6623, term6623.getClass(), "sourcePosition", 0);
        setField(term6623, term6623.getClass(), "jsType", null);
        setField(term6623, term6623.getClass(), "parent", null);
        setField(term6621, term6621.getClass(), "next", term6623);
        setField(term6621, term6621.getClass(), "first", term6627);
        setField(term6621, term6621.getClass(), "last", term6629);
        setField(term6621, term6621.getClass(), "propListHead", null);
        setIntField(term6621, term6621.getClass(), "sourcePosition", 0);
        setField(term6621, term6621.getClass(), "jsType", null);
        setField(term6621, term6621.getClass(), "parent", null);
        Class<? extends Object> term28863 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term28862 = ((Class) term28863).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term28862).setAccessible(true);
        enum79 = ((Field) term28862).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term6621;
        args[1] = enum79;
        try {
            callMethod(klass, "add", argTypes, term6593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


