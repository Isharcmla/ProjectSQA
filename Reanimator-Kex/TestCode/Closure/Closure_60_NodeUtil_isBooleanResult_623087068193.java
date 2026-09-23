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

public class NodeUtil_isBooleanResult_623087068193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778;
     Object term9537;

    public NodeUtil_isBooleanResult_623087068193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term778, term778.getClass(), "type", -1697741155);
        setIntField(term780, term780.getClass(), "type", 1215150180);
        setIntField(term782, term782.getClass(), "type", 0);
        setField(term782, term782.getClass(), "next", null);
        setField(term782, term782.getClass(), "first", null);
        setField(term782, term782.getClass(), "last", null);
        setField(term782, term782.getClass(), "propListHead", null);
        setIntField(term782, term782.getClass(), "sourcePosition", 0);
        setField(term782, term782.getClass(), "jsType", null);
        setField(term782, term782.getClass(), "parent", null);
        setField(term780, term780.getClass(), "next", term782);
        setIntField(term785, term785.getClass(), "type", 0);
        setField(term785, term785.getClass(), "next", null);
        setField(term785, term785.getClass(), "first", null);
        setField(term785, term785.getClass(), "last", null);
        setField(term785, term785.getClass(), "propListHead", null);
        setIntField(term785, term785.getClass(), "sourcePosition", 0);
        setField(term785, term785.getClass(), "jsType", null);
        setField(term785, term785.getClass(), "parent", null);
        setField(term780, term780.getClass(), "first", term785);
        setIntField(term788, term788.getClass(), "type", 0);
        setField(term788, term788.getClass(), "next", null);
        setField(term788, term788.getClass(), "first", null);
        setField(term788, term788.getClass(), "last", null);
        setField(term788, term788.getClass(), "propListHead", null);
        setIntField(term788, term788.getClass(), "sourcePosition", 0);
        setField(term788, term788.getClass(), "jsType", null);
        setField(term788, term788.getClass(), "parent", null);
        setField(term780, term780.getClass(), "last", term788);
        setField(term780, term780.getClass(), "propListHead", null);
        setIntField(term780, term780.getClass(), "sourcePosition", 0);
        setField(term780, term780.getClass(), "jsType", null);
        setField(term780, term780.getClass(), "parent", null);
        setField(term778, term778.getClass(), "next", term780);
        setIntField(term792, term792.getClass(), "type", 0);
        setField(term792, term792.getClass(), "next", null);
        setField(term792, term792.getClass(), "first", null);
        setField(term792, term792.getClass(), "last", null);
        setField(term792, term792.getClass(), "propListHead", null);
        setIntField(term792, term792.getClass(), "sourcePosition", 0);
        setField(term792, term792.getClass(), "jsType", null);
        setField(term792, term792.getClass(), "parent", null);
        setField(term778, term778.getClass(), "first", term792);
        setIntField(term795, term795.getClass(), "type", 0);
        setField(term795, term795.getClass(), "next", null);
        setField(term795, term795.getClass(), "first", null);
        setField(term795, term795.getClass(), "last", null);
        setField(term795, term795.getClass(), "propListHead", null);
        setIntField(term795, term795.getClass(), "sourcePosition", 0);
        setField(term795, term795.getClass(), "jsType", null);
        setField(term795, term795.getClass(), "parent", null);
        setField(term778, term778.getClass(), "last", term795);
        setField(term778, term778.getClass(), "propListHead", null);
        setIntField(term778, term778.getClass(), "sourcePosition", 0);
        setField(term778, term778.getClass(), "jsType", null);
        setField(term778, term778.getClass(), "parent", null);
        term9537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9537, term9537.getClass(), "type", -1697741155);
        setIntField(term9538, term9538.getClass(), "type", 1215150180);
        setIntField(term9539, term9539.getClass(), "type", 0);
        setField(term9539, term9539.getClass(), "next", null);
        setField(term9539, term9539.getClass(), "first", null);
        setField(term9539, term9539.getClass(), "last", null);
        setField(term9539, term9539.getClass(), "propListHead", null);
        setIntField(term9539, term9539.getClass(), "sourcePosition", 0);
        setField(term9539, term9539.getClass(), "jsType", null);
        setField(term9539, term9539.getClass(), "parent", null);
        setField(term9538, term9538.getClass(), "next", term9539);
        setIntField(term9540, term9540.getClass(), "type", 0);
        setField(term9540, term9540.getClass(), "next", null);
        setField(term9540, term9540.getClass(), "first", null);
        setField(term9540, term9540.getClass(), "last", null);
        setField(term9540, term9540.getClass(), "propListHead", null);
        setIntField(term9540, term9540.getClass(), "sourcePosition", 0);
        setField(term9540, term9540.getClass(), "jsType", null);
        setField(term9540, term9540.getClass(), "parent", null);
        setField(term9538, term9538.getClass(), "first", term9540);
        setIntField(term9541, term9541.getClass(), "type", 0);
        setField(term9541, term9541.getClass(), "next", null);
        setField(term9541, term9541.getClass(), "first", null);
        setField(term9541, term9541.getClass(), "last", null);
        setField(term9541, term9541.getClass(), "propListHead", null);
        setIntField(term9541, term9541.getClass(), "sourcePosition", 0);
        setField(term9541, term9541.getClass(), "jsType", null);
        setField(term9541, term9541.getClass(), "parent", null);
        setField(term9538, term9538.getClass(), "last", term9541);
        setField(term9538, term9538.getClass(), "propListHead", null);
        setIntField(term9538, term9538.getClass(), "sourcePosition", 0);
        setField(term9538, term9538.getClass(), "jsType", null);
        setField(term9538, term9538.getClass(), "parent", null);
        setField(term9537, term9537.getClass(), "next", term9538);
        setIntField(term9542, term9542.getClass(), "type", 0);
        setField(term9542, term9542.getClass(), "next", null);
        setField(term9542, term9542.getClass(), "first", null);
        setField(term9542, term9542.getClass(), "last", null);
        setField(term9542, term9542.getClass(), "propListHead", null);
        setIntField(term9542, term9542.getClass(), "sourcePosition", 0);
        setField(term9542, term9542.getClass(), "jsType", null);
        setField(term9542, term9542.getClass(), "parent", null);
        setField(term9537, term9537.getClass(), "first", term9542);
        setIntField(term9543, term9543.getClass(), "type", 0);
        setField(term9543, term9543.getClass(), "next", null);
        setField(term9543, term9543.getClass(), "first", null);
        setField(term9543, term9543.getClass(), "last", null);
        setField(term9543, term9543.getClass(), "propListHead", null);
        setIntField(term9543, term9543.getClass(), "sourcePosition", 0);
        setField(term9543, term9543.getClass(), "jsType", null);
        setField(term9543, term9543.getClass(), "parent", null);
        setField(term9537, term9537.getClass(), "last", term9543);
        setField(term9537, term9537.getClass(), "propListHead", null);
        setIntField(term9537, term9537.getClass(), "sourcePosition", 0);
        setField(term9537, term9537.getClass(), "jsType", null);
        setField(term9537, term9537.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term778;
        callMethod(klass, "isBooleanResult", argTypes, null, args);
        assertTrue(recursiveEquals(term778, term9537));
    }

};


