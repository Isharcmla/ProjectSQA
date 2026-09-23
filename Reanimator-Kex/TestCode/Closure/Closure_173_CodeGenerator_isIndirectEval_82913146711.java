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
     Object term8546;
     Object term8574;

    public CodeGenerator_isIndirectEval_82913146711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8547 = new HashMap();
        Class<? extends Object> term8602 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term8601 = ((Class) term8602).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term8601).setAccessible(true);
        Object enum23 = ((Field) term8601).get((Object) null);
        term8546 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term8546, term8546.getClass(), "escapedJsStrings", term8547);
        setField(term8546, term8546.getClass(), "cc", null);
        setField(term8546, term8546.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term8546, term8546.getClass(), "preferSingleQuotes", true);
        setBooleanField(term8546, term8546.getClass(), "trustedStrings", false);
        setField(term8546, term8546.getClass(), "languageMode", enum23);
        term8574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8574, term8574.getClass(), "type", -226514366);
        setIntField(term8576, term8576.getClass(), "type", 1193880199);
        setIntField(term8578, term8578.getClass(), "type", -1087774327);
        setIntField(term8580, term8580.getClass(), "type", -1530420153);
        setIntField(term8582, term8582.getClass(), "type", -469968304);
        setField(term8582, term8582.getClass(), "next", null);
        setField(term8582, term8582.getClass(), "first", null);
        setField(term8582, term8582.getClass(), "last", null);
        setField(term8582, term8582.getClass(), "propListHead", null);
        setIntField(term8582, term8582.getClass(), "sourcePosition", 0);
        setField(term8582, term8582.getClass(), "jsType", null);
        setField(term8582, term8582.getClass(), "parent", null);
        setField(term8580, term8580.getClass(), "next", term8582);
        setIntField(term8585, term8585.getClass(), "type", -1145578966);
        setField(term8585, term8585.getClass(), "next", null);
        setField(term8585, term8585.getClass(), "first", null);
        setField(term8585, term8585.getClass(), "last", term8582);
        setField(term8585, term8585.getClass(), "propListHead", null);
        setIntField(term8585, term8585.getClass(), "sourcePosition", 0);
        setField(term8585, term8585.getClass(), "jsType", null);
        setField(term8585, term8585.getClass(), "parent", null);
        setField(term8580, term8580.getClass(), "first", term8585);
        setField(term8580, term8580.getClass(), "last", term8578);
        setField(term8580, term8580.getClass(), "propListHead", null);
        setIntField(term8580, term8580.getClass(), "sourcePosition", 0);
        setField(term8580, term8580.getClass(), "jsType", null);
        setField(term8580, term8580.getClass(), "parent", null);
        setField(term8578, term8578.getClass(), "next", term8580);
        setField(term8578, term8578.getClass(), "first", term8582);
        setIntField(term8589, term8589.getClass(), "type", 1962444399);
        setIntField(term8591, term8591.getClass(), "type", 767834723);
        setField(term8591, term8591.getClass(), "next", null);
        setField(term8591, term8591.getClass(), "first", term8585);
        setField(term8591, term8591.getClass(), "last", term8580);
        setField(term8591, term8591.getClass(), "propListHead", null);
        setIntField(term8591, term8591.getClass(), "sourcePosition", 0);
        setField(term8591, term8591.getClass(), "jsType", null);
        setField(term8591, term8591.getClass(), "parent", null);
        setField(term8589, term8589.getClass(), "next", term8591);
        setField(term8589, term8589.getClass(), "first", term8576);
        setField(term8589, term8589.getClass(), "last", term8576);
        setField(term8589, term8589.getClass(), "propListHead", null);
        setIntField(term8589, term8589.getClass(), "sourcePosition", 0);
        setField(term8589, term8589.getClass(), "jsType", null);
        setField(term8589, term8589.getClass(), "parent", null);
        setField(term8578, term8578.getClass(), "last", term8589);
        setField(term8578, term8578.getClass(), "propListHead", null);
        setIntField(term8578, term8578.getClass(), "sourcePosition", 0);
        setField(term8578, term8578.getClass(), "jsType", null);
        setField(term8578, term8578.getClass(), "parent", null);
        setField(term8576, term8576.getClass(), "next", term8578);
        setIntField(term8596, term8596.getClass(), "type", -602026508);
        setField(term8596, term8596.getClass(), "next", term8589);
        setField(term8596, term8596.getClass(), "first", term8591);
        setField(term8596, term8596.getClass(), "last", term8574);
        setField(term8596, term8596.getClass(), "propListHead", null);
        setIntField(term8596, term8596.getClass(), "sourcePosition", 0);
        setField(term8596, term8596.getClass(), "jsType", null);
        setField(term8596, term8596.getClass(), "parent", null);
        setField(term8576, term8576.getClass(), "first", term8596);
        setField(term8576, term8576.getClass(), "last", term8596);
        setField(term8576, term8576.getClass(), "propListHead", null);
        setIntField(term8576, term8576.getClass(), "sourcePosition", 0);
        setField(term8576, term8576.getClass(), "jsType", null);
        setField(term8576, term8576.getClass(), "parent", null);
        setField(term8574, term8574.getClass(), "next", term8576);
        setField(term8574, term8574.getClass(), "first", term8580);
        setField(term8574, term8574.getClass(), "last", term8582);
        setField(term8574, term8574.getClass(), "propListHead", null);
        setIntField(term8574, term8574.getClass(), "sourcePosition", 0);
        setField(term8574, term8574.getClass(), "jsType", null);
        setField(term8574, term8574.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8574;
        callMethod(klass, "isIndirectEval", argTypes, term8546, args);
    }

};


