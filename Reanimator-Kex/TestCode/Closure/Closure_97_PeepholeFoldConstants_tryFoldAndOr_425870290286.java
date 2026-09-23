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

public class PeepholeFoldConstants_tryFoldAndOr_425870290286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56906;
     Object term56998;
     Object term57090;
     Object term57176;
     Object term57278;
     Object term57279;
     Object term57280;
     Object term57281;
     Object term57230;

    public PeepholeFoldConstants_tryFoldAndOr_425870290286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56906 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term56998 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term56998, term56998.getClass(), "parent", null);
        setIntField(term56998, term56998.getClass(), "type", 0);
        term57090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57090, term57090.getClass(), "type", 0);
        term57176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term57278 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term57278, term57278.getClass(), "currentTraversal", null);
        term57279 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57279, term57279.getClass(), "number", 0.0);
        setIntField(term57279, term57279.getClass(), "type", 0);
        setField(term57279, term57279.getClass(), "next", null);
        setField(term57279, term57279.getClass(), "first", null);
        setField(term57279, term57279.getClass(), "last", null);
        setField(term57279, term57279.getClass(), "propListHead", null);
        setIntField(term57279, term57279.getClass(), "sourcePosition", 0);
        setField(term57279, term57279.getClass(), "jsType", null);
        setField(term57279, term57279.getClass(), "parent", null);
        term57280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57280, term57280.getClass(), "number", 0.0);
        setIntField(term57280, term57280.getClass(), "type", 0);
        setField(term57280, term57280.getClass(), "next", null);
        setField(term57280, term57280.getClass(), "first", null);
        setField(term57280, term57280.getClass(), "last", null);
        setField(term57280, term57280.getClass(), "propListHead", null);
        setIntField(term57280, term57280.getClass(), "sourcePosition", 0);
        setField(term57280, term57280.getClass(), "jsType", null);
        setField(term57280, term57280.getClass(), "parent", null);
        term57281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term57281, term57281.getClass(), "functionName", null);
        setBooleanField(term57281, term57281.getClass(), "itsNeedsActivation", false);
        setIntField(term57281, term57281.getClass(), "itsFunctionType", 0);
        setBooleanField(term57281, term57281.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term57281, term57281.getClass(), "encodedSourceStart", 0);
        setIntField(term57281, term57281.getClass(), "encodedSourceEnd", 0);
        setField(term57281, term57281.getClass(), "sourceName", null);
        setIntField(term57281, term57281.getClass(), "baseLineno", 0);
        setIntField(term57281, term57281.getClass(), "endLineno", 0);
        setField(term57281, term57281.getClass(), "functions", null);
        setField(term57281, term57281.getClass(), "regexps", null);
        setField(term57281, term57281.getClass(), "itsVariables", null);
        setField(term57281, term57281.getClass(), "itsConst", null);
        setField(term57281, term57281.getClass(), "itsVariableNames", null);
        setIntField(term57281, term57281.getClass(), "varStart", 0);
        setField(term57281, term57281.getClass(), "compilerData", null);
        setIntField(term57281, term57281.getClass(), "type", 0);
        setField(term57281, term57281.getClass(), "next", null);
        setField(term57281, term57281.getClass(), "first", null);
        setField(term57281, term57281.getClass(), "last", null);
        setField(term57281, term57281.getClass(), "propListHead", null);
        setIntField(term57281, term57281.getClass(), "sourcePosition", 0);
        setField(term57281, term57281.getClass(), "jsType", null);
        setField(term57281, term57281.getClass(), "parent", null);
        term57230 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57230, term57230.getClass(), "number", 0.0);
        setIntField(term57230, term57230.getClass(), "type", 0);
        setField(term57230, term57230.getClass(), "next", null);
        setField(term57230, term57230.getClass(), "first", null);
        setField(term57230, term57230.getClass(), "last", null);
        setField(term57230, term57230.getClass(), "propListHead", null);
        setIntField(term57230, term57230.getClass(), "sourcePosition", 0);
        setField(term57230, term57230.getClass(), "jsType", null);
        setField(term57230, term57230.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term56998;
        args[1] = term57090;
        args[2] = term57176;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term56906, args);
        assertTrue(recursiveEquals(term56906, term57278));
        assertTrue(recursiveEquals(term56998, term57279));
        assertTrue(recursiveEquals(term57090, term57280));
        assertTrue(recursiveEquals(term57176, term57281));
        assertTrue(recursiveEquals(retValue, term57230));
    }

};


