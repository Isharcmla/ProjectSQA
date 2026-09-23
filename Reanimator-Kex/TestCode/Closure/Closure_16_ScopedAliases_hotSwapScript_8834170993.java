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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_hotSwapScript_8834170993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55376;
     Object term55446;
     Object term56510;
     Object term56511;

    public ScopedAliases_hotSwapScript_8834170993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55376 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term55376, term55376.getClass(), "compiler", null);
        term55446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55446, term55446.getClass(), "type", 0);
        setField(term55446, term55446.getClass(), "parent", null);
        setField(term55656, term55656.getClass(), "next", null);
        setIntField(term55656, term55656.getClass(), "type", 0);
        setField(term55656, term55656.getClass(), "first", null);
        setField(term55586, term55586.getClass(), "next", term55656);
        setIntField(term55586, term55586.getClass(), "type", 37);
        setField(term55726, term55726.getClass(), "next", null);
        setIntField(term55726, term55726.getClass(), "type", 0);
        setField(term55726, term55726.getClass(), "first", null);
        setField(term55586, term55586.getClass(), "first", term55726);
        setField(term55516, term55516.getClass(), "next", term55586);
        setIntField(term55516, term55516.getClass(), "type", 0);
        setField(term55516, term55516.getClass(), "first", term55656);
        setField(term55446, term55446.getClass(), "first", term55516);
        term56510 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term56510, term56510.getClass(), "compiler", null);
        setField(term56510, term56510.getClass(), "preprocessorSymbolTable", null);
        setField(term56510, term56510.getClass(), "transformationHandler", null);
        term56511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56511, term56511.getClass(), "type", 0);
        setField(term56511, term56511.getClass(), "next", null);
        setIntField(term56512, term56512.getClass(), "type", 0);
        setIntField(term56513, term56513.getClass(), "type", 37);
        setIntField(term56514, term56514.getClass(), "type", 0);
        setField(term56514, term56514.getClass(), "next", null);
        setField(term56514, term56514.getClass(), "first", null);
        setField(term56514, term56514.getClass(), "last", null);
        setField(term56514, term56514.getClass(), "propListHead", null);
        setIntField(term56514, term56514.getClass(), "sourcePosition", 0);
        setField(term56514, term56514.getClass(), "jsType", null);
        setField(term56514, term56514.getClass(), "parent", null);
        setField(term56513, term56513.getClass(), "next", term56514);
        setIntField(term56515, term56515.getClass(), "type", 0);
        setField(term56515, term56515.getClass(), "next", null);
        setField(term56515, term56515.getClass(), "first", null);
        setField(term56515, term56515.getClass(), "last", null);
        setField(term56515, term56515.getClass(), "propListHead", null);
        setIntField(term56515, term56515.getClass(), "sourcePosition", 0);
        setField(term56515, term56515.getClass(), "jsType", null);
        setField(term56515, term56515.getClass(), "parent", null);
        setField(term56513, term56513.getClass(), "first", term56515);
        setField(term56513, term56513.getClass(), "last", null);
        setField(term56513, term56513.getClass(), "propListHead", null);
        setIntField(term56513, term56513.getClass(), "sourcePosition", 0);
        setField(term56513, term56513.getClass(), "jsType", null);
        setField(term56513, term56513.getClass(), "parent", null);
        setField(term56512, term56512.getClass(), "next", term56513);
        setField(term56512, term56512.getClass(), "first", term56514);
        setField(term56512, term56512.getClass(), "last", null);
        setField(term56512, term56512.getClass(), "propListHead", null);
        setIntField(term56512, term56512.getClass(), "sourcePosition", 0);
        setField(term56512, term56512.getClass(), "jsType", null);
        setField(term56512, term56512.getClass(), "parent", null);
        setField(term56511, term56511.getClass(), "first", term56512);
        setField(term56511, term56511.getClass(), "last", null);
        setField(term56511, term56511.getClass(), "propListHead", null);
        setIntField(term56511, term56511.getClass(), "sourcePosition", 0);
        setField(term56511, term56511.getClass(), "jsType", null);
        setField(term56511, term56511.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55446;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term55376, args);
        assertTrue(recursiveEquals(term55376, term56510));
        assertTrue(recursiveEquals(term55446, term56511));
    }

};


