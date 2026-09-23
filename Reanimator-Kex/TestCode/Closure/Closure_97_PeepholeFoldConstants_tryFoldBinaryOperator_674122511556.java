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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147104;
     Object term147196;
     Object term147582;
     Object term147583;
     Object term147522;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term147196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147288 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147380 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term147288, term147288.getClass(), "next", term147380);
        setIntField(term147288, term147288.getClass(), "type", 0);
        setField(term147196, term147196.getClass(), "first", term147288);
        setIntField(term147196, term147196.getClass(), "type", 100);
        setField(term147196, term147196.getClass(), "parent", null);
        term147582 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term147582, term147582.getClass(), "currentTraversal", null);
        term147583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term147583, term147583.getClass(), "number", 0.0);
        setIntField(term147583, term147583.getClass(), "type", 100);
        setField(term147583, term147583.getClass(), "next", null);
        setDoubleField(term147584, term147584.getClass(), "number", 0.0);
        setIntField(term147584, term147584.getClass(), "type", 0);
        setDoubleField(term147585, term147585.getClass(), "number", 0.0);
        setIntField(term147585, term147585.getClass(), "type", 0);
        setField(term147585, term147585.getClass(), "next", null);
        setField(term147585, term147585.getClass(), "first", null);
        setField(term147585, term147585.getClass(), "last", null);
        setField(term147585, term147585.getClass(), "propListHead", null);
        setIntField(term147585, term147585.getClass(), "sourcePosition", 0);
        setField(term147585, term147585.getClass(), "jsType", null);
        setField(term147585, term147585.getClass(), "parent", null);
        setField(term147584, term147584.getClass(), "next", term147585);
        setField(term147584, term147584.getClass(), "first", null);
        setField(term147584, term147584.getClass(), "last", null);
        setField(term147584, term147584.getClass(), "propListHead", null);
        setIntField(term147584, term147584.getClass(), "sourcePosition", 0);
        setField(term147584, term147584.getClass(), "jsType", null);
        setField(term147584, term147584.getClass(), "parent", null);
        setField(term147583, term147583.getClass(), "first", term147584);
        setField(term147583, term147583.getClass(), "last", null);
        setField(term147583, term147583.getClass(), "propListHead", null);
        setIntField(term147583, term147583.getClass(), "sourcePosition", 0);
        setField(term147583, term147583.getClass(), "jsType", null);
        setField(term147583, term147583.getClass(), "parent", null);
        term147522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147525 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term147528 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term147522, term147522.getClass(), "number", 0.0);
        setIntField(term147522, term147522.getClass(), "type", 100);
        setField(term147522, term147522.getClass(), "next", null);
        setDoubleField(term147525, term147525.getClass(), "number", 0.0);
        setIntField(term147525, term147525.getClass(), "type", 0);
        setDoubleField(term147528, term147528.getClass(), "number", 0.0);
        setIntField(term147528, term147528.getClass(), "type", 0);
        setField(term147528, term147528.getClass(), "next", null);
        setField(term147528, term147528.getClass(), "first", null);
        setField(term147528, term147528.getClass(), "last", null);
        setField(term147528, term147528.getClass(), "propListHead", null);
        setIntField(term147528, term147528.getClass(), "sourcePosition", 0);
        setField(term147528, term147528.getClass(), "jsType", null);
        setField(term147528, term147528.getClass(), "parent", null);
        setField(term147525, term147525.getClass(), "next", term147528);
        setField(term147525, term147525.getClass(), "first", null);
        setField(term147525, term147525.getClass(), "last", null);
        setField(term147525, term147525.getClass(), "propListHead", null);
        setIntField(term147525, term147525.getClass(), "sourcePosition", 0);
        setField(term147525, term147525.getClass(), "jsType", null);
        setField(term147525, term147525.getClass(), "parent", null);
        setField(term147522, term147522.getClass(), "first", term147525);
        setField(term147522, term147522.getClass(), "last", null);
        setField(term147522, term147522.getClass(), "propListHead", null);
        setIntField(term147522, term147522.getClass(), "sourcePosition", 0);
        setField(term147522, term147522.getClass(), "jsType", null);
        setField(term147522, term147522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term147196;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term147104, args);
        assertTrue(recursiveEquals(term147104, term147582));
        assertTrue(recursiveEquals(term147196, term147583));
        assertTrue(recursiveEquals(retValue, term147522));
    }

};


