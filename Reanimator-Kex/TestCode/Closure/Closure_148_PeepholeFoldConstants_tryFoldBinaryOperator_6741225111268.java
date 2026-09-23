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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303156;
     Object term303248;
     Object term303632;
     Object term303633;
     Object term303539;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303156 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term303248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303340 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303522 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term303432, term303432.getClass(), "first", term303522);
        setField(term303340, term303340.getClass(), "next", term303432);
        setField(term303248, term303248.getClass(), "first", term303340);
        setIntField(term303248, term303248.getClass(), "type", 86);
        term303632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303632, term303632.getClass(), "currentTraversal", null);
        term303633 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303635 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303636 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term303633, term303633.getClass(), "number", 0.0);
        setIntField(term303633, term303633.getClass(), "type", 86);
        setField(term303633, term303633.getClass(), "next", null);
        setDoubleField(term303634, term303634.getClass(), "number", 0.0);
        setIntField(term303634, term303634.getClass(), "type", 0);
        setDoubleField(term303635, term303635.getClass(), "number", 0.0);
        setIntField(term303635, term303635.getClass(), "type", 0);
        setField(term303635, term303635.getClass(), "next", null);
        setIntField(term303636, term303636.getClass(), "encodedSourceStart", 0);
        setIntField(term303636, term303636.getClass(), "encodedSourceEnd", 0);
        setField(term303636, term303636.getClass(), "sourceName", null);
        setIntField(term303636, term303636.getClass(), "baseLineno", 0);
        setIntField(term303636, term303636.getClass(), "endLineno", 0);
        setField(term303636, term303636.getClass(), "functions", null);
        setField(term303636, term303636.getClass(), "regexps", null);
        setField(term303636, term303636.getClass(), "itsVariables", null);
        setField(term303636, term303636.getClass(), "itsConst", null);
        setField(term303636, term303636.getClass(), "itsVariableNames", null);
        setIntField(term303636, term303636.getClass(), "varStart", 0);
        setField(term303636, term303636.getClass(), "compilerData", null);
        setIntField(term303636, term303636.getClass(), "type", 0);
        setField(term303636, term303636.getClass(), "next", null);
        setField(term303636, term303636.getClass(), "first", null);
        setField(term303636, term303636.getClass(), "last", null);
        setField(term303636, term303636.getClass(), "propListHead", null);
        setIntField(term303636, term303636.getClass(), "sourcePosition", 0);
        setField(term303636, term303636.getClass(), "jsType", null);
        setField(term303636, term303636.getClass(), "parent", null);
        setField(term303635, term303635.getClass(), "first", term303636);
        setField(term303635, term303635.getClass(), "last", null);
        setField(term303635, term303635.getClass(), "propListHead", null);
        setIntField(term303635, term303635.getClass(), "sourcePosition", 0);
        setField(term303635, term303635.getClass(), "jsType", null);
        setField(term303635, term303635.getClass(), "parent", null);
        setField(term303634, term303634.getClass(), "next", term303635);
        setField(term303634, term303634.getClass(), "first", null);
        setField(term303634, term303634.getClass(), "last", null);
        setField(term303634, term303634.getClass(), "propListHead", null);
        setIntField(term303634, term303634.getClass(), "sourcePosition", 0);
        setField(term303634, term303634.getClass(), "jsType", null);
        setField(term303634, term303634.getClass(), "parent", null);
        setField(term303633, term303633.getClass(), "first", term303634);
        setField(term303633, term303633.getClass(), "last", null);
        setField(term303633, term303633.getClass(), "propListHead", null);
        setIntField(term303633, term303633.getClass(), "sourcePosition", 0);
        setField(term303633, term303633.getClass(), "jsType", null);
        setField(term303633, term303633.getClass(), "parent", null);
        term303539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303542 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303545 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303548 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term303539, term303539.getClass(), "number", 0.0);
        setIntField(term303539, term303539.getClass(), "type", 86);
        setField(term303539, term303539.getClass(), "next", null);
        setDoubleField(term303542, term303542.getClass(), "number", 0.0);
        setIntField(term303542, term303542.getClass(), "type", 0);
        setDoubleField(term303545, term303545.getClass(), "number", 0.0);
        setIntField(term303545, term303545.getClass(), "type", 0);
        setField(term303545, term303545.getClass(), "next", null);
        setIntField(term303548, term303548.getClass(), "encodedSourceStart", 0);
        setIntField(term303548, term303548.getClass(), "encodedSourceEnd", 0);
        setField(term303548, term303548.getClass(), "sourceName", null);
        setIntField(term303548, term303548.getClass(), "baseLineno", 0);
        setIntField(term303548, term303548.getClass(), "endLineno", 0);
        setField(term303548, term303548.getClass(), "functions", null);
        setField(term303548, term303548.getClass(), "regexps", null);
        setField(term303548, term303548.getClass(), "itsVariables", null);
        setField(term303548, term303548.getClass(), "itsConst", null);
        setField(term303548, term303548.getClass(), "itsVariableNames", null);
        setIntField(term303548, term303548.getClass(), "varStart", 0);
        setField(term303548, term303548.getClass(), "compilerData", null);
        setIntField(term303548, term303548.getClass(), "type", 0);
        setField(term303548, term303548.getClass(), "next", null);
        setField(term303548, term303548.getClass(), "first", null);
        setField(term303548, term303548.getClass(), "last", null);
        setField(term303548, term303548.getClass(), "propListHead", null);
        setIntField(term303548, term303548.getClass(), "sourcePosition", 0);
        setField(term303548, term303548.getClass(), "jsType", null);
        setField(term303548, term303548.getClass(), "parent", null);
        setField(term303545, term303545.getClass(), "first", term303548);
        setField(term303545, term303545.getClass(), "last", null);
        setField(term303545, term303545.getClass(), "propListHead", null);
        setIntField(term303545, term303545.getClass(), "sourcePosition", 0);
        setField(term303545, term303545.getClass(), "jsType", null);
        setField(term303545, term303545.getClass(), "parent", null);
        setField(term303542, term303542.getClass(), "next", term303545);
        setField(term303542, term303542.getClass(), "first", null);
        setField(term303542, term303542.getClass(), "last", null);
        setField(term303542, term303542.getClass(), "propListHead", null);
        setIntField(term303542, term303542.getClass(), "sourcePosition", 0);
        setField(term303542, term303542.getClass(), "jsType", null);
        setField(term303542, term303542.getClass(), "parent", null);
        setField(term303539, term303539.getClass(), "first", term303542);
        setField(term303539, term303539.getClass(), "last", null);
        setField(term303539, term303539.getClass(), "propListHead", null);
        setIntField(term303539, term303539.getClass(), "sourcePosition", 0);
        setField(term303539, term303539.getClass(), "jsType", null);
        setField(term303539, term303539.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term303248;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term303156, args);
        assertTrue(recursiveEquals(term303156, term303632));
        assertTrue(recursiveEquals(term303248, term303633));
        assertTrue(recursiveEquals(retValue, term303539));
    }

};


