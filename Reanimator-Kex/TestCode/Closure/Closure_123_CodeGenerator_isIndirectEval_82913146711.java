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

public class CodeGenerator_isIndirectEval_82913146711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8543;
     Object term8571;

    public CodeGenerator_isIndirectEval_82913146711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8544 = new HashMap();
        Class<? extends Object> term8599 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term8598 = ((Class) term8599).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term8598).setAccessible(true);
        Object enum23 = ((Field) term8598).get((Object) null);
        term8543 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term8543, term8543.getClass(), "escapedJsStrings", term8544);
        setField(term8543, term8543.getClass(), "cc", null);
        setField(term8543, term8543.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term8543, term8543.getClass(), "preferSingleQuotes", true);
        setBooleanField(term8543, term8543.getClass(), "trustedStrings", true);
        setField(term8543, term8543.getClass(), "languageMode", enum23);
        term8571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8571, term8571.getClass(), "type", -226514366);
        setIntField(term8573, term8573.getClass(), "type", 1193880199);
        setIntField(term8575, term8575.getClass(), "type", -1087774327);
        setIntField(term8577, term8577.getClass(), "type", -1530420153);
        setIntField(term8579, term8579.getClass(), "type", -469968304);
        setField(term8579, term8579.getClass(), "next", null);
        setField(term8579, term8579.getClass(), "first", null);
        setField(term8579, term8579.getClass(), "last", null);
        setField(term8579, term8579.getClass(), "propListHead", null);
        setIntField(term8579, term8579.getClass(), "sourcePosition", 0);
        setField(term8579, term8579.getClass(), "jsType", null);
        setField(term8579, term8579.getClass(), "parent", null);
        setField(term8577, term8577.getClass(), "next", term8579);
        setIntField(term8582, term8582.getClass(), "type", -1145578966);
        setField(term8582, term8582.getClass(), "next", null);
        setField(term8582, term8582.getClass(), "first", null);
        setField(term8582, term8582.getClass(), "last", term8579);
        setField(term8582, term8582.getClass(), "propListHead", null);
        setIntField(term8582, term8582.getClass(), "sourcePosition", 0);
        setField(term8582, term8582.getClass(), "jsType", null);
        setField(term8582, term8582.getClass(), "parent", null);
        setField(term8577, term8577.getClass(), "first", term8582);
        setField(term8577, term8577.getClass(), "last", term8575);
        setField(term8577, term8577.getClass(), "propListHead", null);
        setIntField(term8577, term8577.getClass(), "sourcePosition", 0);
        setField(term8577, term8577.getClass(), "jsType", null);
        setField(term8577, term8577.getClass(), "parent", null);
        setField(term8575, term8575.getClass(), "next", term8577);
        setField(term8575, term8575.getClass(), "first", term8579);
        setIntField(term8586, term8586.getClass(), "type", 1962444399);
        setIntField(term8588, term8588.getClass(), "type", 767834723);
        setField(term8588, term8588.getClass(), "next", null);
        setField(term8588, term8588.getClass(), "first", term8582);
        setField(term8588, term8588.getClass(), "last", term8577);
        setField(term8588, term8588.getClass(), "propListHead", null);
        setIntField(term8588, term8588.getClass(), "sourcePosition", 0);
        setField(term8588, term8588.getClass(), "jsType", null);
        setField(term8588, term8588.getClass(), "parent", null);
        setField(term8586, term8586.getClass(), "next", term8588);
        setField(term8586, term8586.getClass(), "first", term8573);
        setField(term8586, term8586.getClass(), "last", term8573);
        setField(term8586, term8586.getClass(), "propListHead", null);
        setIntField(term8586, term8586.getClass(), "sourcePosition", 0);
        setField(term8586, term8586.getClass(), "jsType", null);
        setField(term8586, term8586.getClass(), "parent", null);
        setField(term8575, term8575.getClass(), "last", term8586);
        setField(term8575, term8575.getClass(), "propListHead", null);
        setIntField(term8575, term8575.getClass(), "sourcePosition", 0);
        setField(term8575, term8575.getClass(), "jsType", null);
        setField(term8575, term8575.getClass(), "parent", null);
        setField(term8573, term8573.getClass(), "next", term8575);
        setIntField(term8593, term8593.getClass(), "type", -602026508);
        setField(term8593, term8593.getClass(), "next", term8586);
        setField(term8593, term8593.getClass(), "first", term8588);
        setField(term8593, term8593.getClass(), "last", term8571);
        setField(term8593, term8593.getClass(), "propListHead", null);
        setIntField(term8593, term8593.getClass(), "sourcePosition", 0);
        setField(term8593, term8593.getClass(), "jsType", null);
        setField(term8593, term8593.getClass(), "parent", null);
        setField(term8573, term8573.getClass(), "first", term8593);
        setField(term8573, term8573.getClass(), "last", term8593);
        setField(term8573, term8573.getClass(), "propListHead", null);
        setIntField(term8573, term8573.getClass(), "sourcePosition", 0);
        setField(term8573, term8573.getClass(), "jsType", null);
        setField(term8573, term8573.getClass(), "parent", null);
        setField(term8571, term8571.getClass(), "next", term8573);
        setField(term8571, term8571.getClass(), "first", term8577);
        setField(term8571, term8571.getClass(), "last", term8579);
        setField(term8571, term8571.getClass(), "propListHead", null);
        setIntField(term8571, term8571.getClass(), "sourcePosition", 0);
        setField(term8571, term8571.getClass(), "jsType", null);
        setField(term8571, term8571.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8571;
        callMethod(klass, "isIndirectEval", argTypes, term8543, args);
    }

};


