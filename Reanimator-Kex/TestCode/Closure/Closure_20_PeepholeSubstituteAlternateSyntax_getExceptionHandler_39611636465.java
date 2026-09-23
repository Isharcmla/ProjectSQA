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

public class PeepholeSubstituteAlternateSyntax_getExceptionHandler_39611636465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537;
     Object term540;

    public PeepholeSubstituteAlternateSyntax_getExceptionHandler_39611636465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term537, term537.getClass(), "late", true);
        setIntField(term537, term537.getClass(), "STRING_SPLIT_OVERHEAD", 389427431);
        setField(term537, term537.getClass(), "compiler", null);
        term540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term540, term540.getClass(), "type", -1945706126);
        setIntField(term542, term542.getClass(), "type", 1152356969);
        setIntField(term544, term544.getClass(), "type", -1667990367);
        setIntField(term546, term546.getClass(), "type", -1214628358);
        setIntField(term548, term548.getClass(), "type", 1102721075);
        setField(term548, term548.getClass(), "next", null);
        setField(term548, term548.getClass(), "first", null);
        setField(term548, term548.getClass(), "last", null);
        setField(term548, term548.getClass(), "propListHead", null);
        setIntField(term548, term548.getClass(), "sourcePosition", 0);
        setField(term548, term548.getClass(), "jsType", null);
        setField(term548, term548.getClass(), "parent", null);
        setField(term546, term546.getClass(), "next", term548);
        setIntField(term551, term551.getClass(), "type", -426764678);
        setField(term551, term551.getClass(), "next", null);
        setField(term551, term551.getClass(), "first", null);
        setField(term551, term551.getClass(), "last", term548);
        setField(term551, term551.getClass(), "propListHead", null);
        setIntField(term551, term551.getClass(), "sourcePosition", 0);
        setField(term551, term551.getClass(), "jsType", null);
        setField(term551, term551.getClass(), "parent", null);
        setField(term546, term546.getClass(), "first", term551);
        setField(term546, term546.getClass(), "last", term544);
        setField(term546, term546.getClass(), "propListHead", null);
        setIntField(term546, term546.getClass(), "sourcePosition", 0);
        setField(term546, term546.getClass(), "jsType", null);
        setField(term546, term546.getClass(), "parent", null);
        setField(term544, term544.getClass(), "next", term546);
        setField(term544, term544.getClass(), "first", term548);
        setIntField(term555, term555.getClass(), "type", -1870495012);
        setIntField(term557, term557.getClass(), "type", -1310015129);
        setField(term557, term557.getClass(), "next", null);
        setField(term557, term557.getClass(), "first", term551);
        setField(term557, term557.getClass(), "last", term546);
        setField(term557, term557.getClass(), "propListHead", null);
        setIntField(term557, term557.getClass(), "sourcePosition", 0);
        setField(term557, term557.getClass(), "jsType", null);
        setField(term557, term557.getClass(), "parent", null);
        setField(term555, term555.getClass(), "next", term557);
        setField(term555, term555.getClass(), "first", term542);
        setField(term555, term555.getClass(), "last", term542);
        setField(term555, term555.getClass(), "propListHead", null);
        setIntField(term555, term555.getClass(), "sourcePosition", 0);
        setField(term555, term555.getClass(), "jsType", null);
        setField(term555, term555.getClass(), "parent", null);
        setField(term544, term544.getClass(), "last", term555);
        setField(term544, term544.getClass(), "propListHead", null);
        setIntField(term544, term544.getClass(), "sourcePosition", 0);
        setField(term544, term544.getClass(), "jsType", null);
        setField(term544, term544.getClass(), "parent", null);
        setField(term542, term542.getClass(), "next", term544);
        setIntField(term562, term562.getClass(), "type", -2104981311);
        setField(term562, term562.getClass(), "next", term555);
        setField(term562, term562.getClass(), "first", term557);
        setField(term562, term562.getClass(), "last", term540);
        setField(term562, term562.getClass(), "propListHead", null);
        setIntField(term562, term562.getClass(), "sourcePosition", 0);
        setField(term562, term562.getClass(), "jsType", null);
        setField(term562, term562.getClass(), "parent", null);
        setField(term542, term542.getClass(), "first", term562);
        setField(term542, term542.getClass(), "last", term562);
        setField(term542, term542.getClass(), "propListHead", null);
        setIntField(term542, term542.getClass(), "sourcePosition", 0);
        setField(term542, term542.getClass(), "jsType", null);
        setField(term542, term542.getClass(), "parent", null);
        setField(term540, term540.getClass(), "next", term542);
        setField(term540, term540.getClass(), "first", term546);
        setField(term540, term540.getClass(), "last", term548);
        setField(term540, term540.getClass(), "propListHead", null);
        setIntField(term540, term540.getClass(), "sourcePosition", 0);
        setField(term540, term540.getClass(), "jsType", null);
        setField(term540, term540.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term540;
        try {
            callMethod(klass, "getExceptionHandler", argTypes, term537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


