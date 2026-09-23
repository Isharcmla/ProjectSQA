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

public class NodeUtil_mayHaveSideEffects_109682951116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term4532;

    public NodeUtil_mayHaveSideEffects_109682951116() {
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
        term4532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4537 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4540 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4532, term4532.getClass(), "type", 568954359);
        setIntField(term4533, term4533.getClass(), "type", 480137250);
        setIntField(term4534, term4534.getClass(), "type", 0);
        setField(term4534, term4534.getClass(), "next", null);
        setField(term4534, term4534.getClass(), "first", null);
        setField(term4534, term4534.getClass(), "last", null);
        setField(term4534, term4534.getClass(), "propListHead", null);
        setIntField(term4534, term4534.getClass(), "sourcePosition", 0);
        setField(term4534, term4534.getClass(), "jsType", null);
        setField(term4534, term4534.getClass(), "parent", null);
        setField(term4533, term4533.getClass(), "next", term4534);
        setIntField(term4535, term4535.getClass(), "type", 0);
        setField(term4535, term4535.getClass(), "next", null);
        setField(term4535, term4535.getClass(), "first", null);
        setField(term4535, term4535.getClass(), "last", null);
        setField(term4535, term4535.getClass(), "propListHead", null);
        setIntField(term4535, term4535.getClass(), "sourcePosition", 0);
        setField(term4535, term4535.getClass(), "jsType", null);
        setField(term4535, term4535.getClass(), "parent", null);
        setField(term4533, term4533.getClass(), "first", term4535);
        setIntField(term4536, term4536.getClass(), "type", 0);
        setField(term4536, term4536.getClass(), "next", null);
        setField(term4536, term4536.getClass(), "first", null);
        setField(term4536, term4536.getClass(), "last", null);
        setField(term4536, term4536.getClass(), "propListHead", null);
        setIntField(term4536, term4536.getClass(), "sourcePosition", 0);
        setField(term4536, term4536.getClass(), "jsType", null);
        setField(term4536, term4536.getClass(), "parent", null);
        setField(term4533, term4533.getClass(), "last", term4536);
        setField(term4537, term4537.getClass(), "next", null);
        setIntField(term4537, term4537.getClass(), "type", 0);
        setIntField(term4537, term4537.getClass(), "intValue", 0);
        setField(term4537, term4537.getClass(), "objectValue", null);
        setField(term4533, term4533.getClass(), "propListHead", term4537);
        setIntField(term4533, term4533.getClass(), "sourcePosition", 538259104);
        setField(term4533, term4533.getClass(), "jsType", null);
        setField(term4533, term4533.getClass(), "parent", null);
        setField(term4532, term4532.getClass(), "next", term4533);
        setIntField(term4538, term4538.getClass(), "type", 0);
        setField(term4538, term4538.getClass(), "next", null);
        setField(term4538, term4538.getClass(), "first", null);
        setField(term4538, term4538.getClass(), "last", null);
        setField(term4538, term4538.getClass(), "propListHead", null);
        setIntField(term4538, term4538.getClass(), "sourcePosition", 0);
        setField(term4538, term4538.getClass(), "jsType", null);
        setField(term4538, term4538.getClass(), "parent", null);
        setField(term4532, term4532.getClass(), "first", term4538);
        setIntField(term4539, term4539.getClass(), "type", 0);
        setField(term4539, term4539.getClass(), "next", null);
        setField(term4539, term4539.getClass(), "first", null);
        setField(term4539, term4539.getClass(), "last", null);
        setField(term4539, term4539.getClass(), "propListHead", null);
        setIntField(term4539, term4539.getClass(), "sourcePosition", 0);
        setField(term4539, term4539.getClass(), "jsType", null);
        setField(term4539, term4539.getClass(), "parent", null);
        setField(term4532, term4532.getClass(), "last", term4539);
        setField(term4540, term4540.getClass(), "next", null);
        setIntField(term4540, term4540.getClass(), "type", 0);
        setIntField(term4540, term4540.getClass(), "intValue", 0);
        setField(term4540, term4540.getClass(), "objectValue", null);
        setField(term4532, term4532.getClass(), "propListHead", term4540);
        setIntField(term4532, term4532.getClass(), "sourcePosition", 96566506);
        setField(term4532, term4532.getClass(), "jsType", null);
        setField(term4532, term4532.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term296;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term296, term4532));
    }

};


