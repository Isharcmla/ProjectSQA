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

public class NodeUtil_mayHaveSideEffects_109682951117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term4559;

    public NodeUtil_mayHaveSideEffects_109682951117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term319 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term296, term296.getClass(), "type", 568954359);
        setIntField(term298, term298.getClass(), "type", 480137250);
        setIntField(term300, term300.getClass(), "type", 0);
        setField(term300, term300.getClass(), "next", null);
        setField(term300, term300.getClass(), "first", null);
        setField(term300, term300.getClass(), "last", null);
        setField(term300, term300.getClass(), "propListHead", null);
        setIntField(term300, term300.getClass(), "sourcePosition", 0);
        setField(term300, term300.getClass(), "jsType", null);
        setField(term300, term300.getClass(), "parent", null);
        setField(term298, term298.getClass(), "next", term300);
        setIntField(term303, term303.getClass(), "type", 0);
        setField(term303, term303.getClass(), "next", null);
        setField(term303, term303.getClass(), "first", null);
        setField(term303, term303.getClass(), "last", null);
        setField(term303, term303.getClass(), "propListHead", null);
        setIntField(term303, term303.getClass(), "sourcePosition", 0);
        setField(term303, term303.getClass(), "jsType", null);
        setField(term303, term303.getClass(), "parent", null);
        setField(term298, term298.getClass(), "first", term303);
        setIntField(term306, term306.getClass(), "type", 0);
        setField(term306, term306.getClass(), "next", null);
        setField(term306, term306.getClass(), "first", null);
        setField(term306, term306.getClass(), "last", null);
        setField(term306, term306.getClass(), "propListHead", null);
        setIntField(term306, term306.getClass(), "sourcePosition", 0);
        setField(term306, term306.getClass(), "jsType", null);
        setField(term306, term306.getClass(), "parent", null);
        setField(term298, term298.getClass(), "last", term306);
        setField(term309, term309.getClass(), "next", null);
        setIntField(term309, term309.getClass(), "type", 0);
        setIntField(term309, term309.getClass(), "intValue", 0);
        setField(term309, term309.getClass(), "objectValue", null);
        setField(term298, term298.getClass(), "propListHead", term309);
        setIntField(term298, term298.getClass(), "sourcePosition", 538259104);
        setField(term298, term298.getClass(), "jsType", null);
        setField(term298, term298.getClass(), "parent", null);
        setField(term296, term296.getClass(), "next", term298);
        setIntField(term313, term313.getClass(), "type", 0);
        setField(term313, term313.getClass(), "next", null);
        setField(term313, term313.getClass(), "first", null);
        setField(term313, term313.getClass(), "last", null);
        setField(term313, term313.getClass(), "propListHead", null);
        setIntField(term313, term313.getClass(), "sourcePosition", 0);
        setField(term313, term313.getClass(), "jsType", null);
        setField(term313, term313.getClass(), "parent", null);
        setField(term296, term296.getClass(), "first", term313);
        setIntField(term316, term316.getClass(), "type", 0);
        setField(term316, term316.getClass(), "next", null);
        setField(term316, term316.getClass(), "first", null);
        setField(term316, term316.getClass(), "last", null);
        setField(term316, term316.getClass(), "propListHead", null);
        setIntField(term316, term316.getClass(), "sourcePosition", 0);
        setField(term316, term316.getClass(), "jsType", null);
        setField(term316, term316.getClass(), "parent", null);
        setField(term296, term296.getClass(), "last", term316);
        setField(term319, term319.getClass(), "next", null);
        setIntField(term319, term319.getClass(), "type", 0);
        setIntField(term319, term319.getClass(), "intValue", 0);
        setField(term319, term319.getClass(), "objectValue", null);
        setField(term296, term296.getClass(), "propListHead", term319);
        setIntField(term296, term296.getClass(), "sourcePosition", 96566506);
        setField(term296, term296.getClass(), "jsType", null);
        setField(term296, term296.getClass(), "parent", null);
        term4559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4564 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4567 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4559, term4559.getClass(), "type", 568954359);
        setIntField(term4560, term4560.getClass(), "type", 480137250);
        setIntField(term4561, term4561.getClass(), "type", 0);
        setField(term4561, term4561.getClass(), "next", null);
        setField(term4561, term4561.getClass(), "first", null);
        setField(term4561, term4561.getClass(), "last", null);
        setField(term4561, term4561.getClass(), "propListHead", null);
        setIntField(term4561, term4561.getClass(), "sourcePosition", 0);
        setField(term4561, term4561.getClass(), "jsType", null);
        setField(term4561, term4561.getClass(), "parent", null);
        setField(term4560, term4560.getClass(), "next", term4561);
        setIntField(term4562, term4562.getClass(), "type", 0);
        setField(term4562, term4562.getClass(), "next", null);
        setField(term4562, term4562.getClass(), "first", null);
        setField(term4562, term4562.getClass(), "last", null);
        setField(term4562, term4562.getClass(), "propListHead", null);
        setIntField(term4562, term4562.getClass(), "sourcePosition", 0);
        setField(term4562, term4562.getClass(), "jsType", null);
        setField(term4562, term4562.getClass(), "parent", null);
        setField(term4560, term4560.getClass(), "first", term4562);
        setIntField(term4563, term4563.getClass(), "type", 0);
        setField(term4563, term4563.getClass(), "next", null);
        setField(term4563, term4563.getClass(), "first", null);
        setField(term4563, term4563.getClass(), "last", null);
        setField(term4563, term4563.getClass(), "propListHead", null);
        setIntField(term4563, term4563.getClass(), "sourcePosition", 0);
        setField(term4563, term4563.getClass(), "jsType", null);
        setField(term4563, term4563.getClass(), "parent", null);
        setField(term4560, term4560.getClass(), "last", term4563);
        setField(term4564, term4564.getClass(), "next", null);
        setIntField(term4564, term4564.getClass(), "type", 0);
        setIntField(term4564, term4564.getClass(), "intValue", 0);
        setField(term4564, term4564.getClass(), "objectValue", null);
        setField(term4560, term4560.getClass(), "propListHead", term4564);
        setIntField(term4560, term4560.getClass(), "sourcePosition", 538259104);
        setField(term4560, term4560.getClass(), "jsType", null);
        setField(term4560, term4560.getClass(), "parent", null);
        setField(term4559, term4559.getClass(), "next", term4560);
        setIntField(term4565, term4565.getClass(), "type", 0);
        setField(term4565, term4565.getClass(), "next", null);
        setField(term4565, term4565.getClass(), "first", null);
        setField(term4565, term4565.getClass(), "last", null);
        setField(term4565, term4565.getClass(), "propListHead", null);
        setIntField(term4565, term4565.getClass(), "sourcePosition", 0);
        setField(term4565, term4565.getClass(), "jsType", null);
        setField(term4565, term4565.getClass(), "parent", null);
        setField(term4559, term4559.getClass(), "first", term4565);
        setIntField(term4566, term4566.getClass(), "type", 0);
        setField(term4566, term4566.getClass(), "next", null);
        setField(term4566, term4566.getClass(), "first", null);
        setField(term4566, term4566.getClass(), "last", null);
        setField(term4566, term4566.getClass(), "propListHead", null);
        setIntField(term4566, term4566.getClass(), "sourcePosition", 0);
        setField(term4566, term4566.getClass(), "jsType", null);
        setField(term4566, term4566.getClass(), "parent", null);
        setField(term4559, term4559.getClass(), "last", term4566);
        setField(term4567, term4567.getClass(), "next", null);
        setIntField(term4567, term4567.getClass(), "type", 0);
        setIntField(term4567, term4567.getClass(), "intValue", 0);
        setField(term4567, term4567.getClass(), "objectValue", null);
        setField(term4559, term4559.getClass(), "propListHead", term4567);
        setIntField(term4559, term4559.getClass(), "sourcePosition", 96566506);
        setField(term4559, term4559.getClass(), "jsType", null);
        setField(term4559, term4559.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term296;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term296, term4559));
    }

};


