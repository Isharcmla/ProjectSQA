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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755637;
     Object term3755723;
     Object term3756109;
     Object term3756110;
     Object term3756017;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3755637 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3755723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3755815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3755907 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3756015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3755723, term3755723.getClass(), "type", 37);
        setIntField(term3755815, term3755815.getClass(), "type", 33);
        setField(term3755907, term3755907.getClass(), "next", term3755907);
        setIntField(term3755907, term3755907.getClass(), "type", 40);
        setField(term3755907, term3755907.getClass(), "str", "");
        setField(term3755815, term3755815.getClass(), "first", term3755907);
        setIntField(term3756015, term3756015.getClass(), "type", 43);
        setField(term3755815, term3755815.getClass(), "next", term3756015);
        setField(term3755723, term3755723.getClass(), "first", term3755815);
        term3756109 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3756109, term3756109.getClass(), "currentTraversal", null);
        term3756110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3756111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3756112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3756113 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3756110, term3756110.getClass(), "functionName", null);
        setBooleanField(term3756110, term3756110.getClass(), "itsNeedsActivation", false);
        setIntField(term3756110, term3756110.getClass(), "itsFunctionType", 0);
        setBooleanField(term3756110, term3756110.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3756110, term3756110.getClass(), "encodedSourceStart", 0);
        setIntField(term3756110, term3756110.getClass(), "encodedSourceEnd", 0);
        setField(term3756110, term3756110.getClass(), "sourceName", null);
        setIntField(term3756110, term3756110.getClass(), "baseLineno", 0);
        setIntField(term3756110, term3756110.getClass(), "endLineno", 0);
        setField(term3756110, term3756110.getClass(), "functions", null);
        setField(term3756110, term3756110.getClass(), "regexps", null);
        setField(term3756110, term3756110.getClass(), "itsVariables", null);
        setField(term3756110, term3756110.getClass(), "itsConst", null);
        setField(term3756110, term3756110.getClass(), "itsVariableNames", null);
        setIntField(term3756110, term3756110.getClass(), "varStart", 0);
        setField(term3756110, term3756110.getClass(), "compilerData", null);
        setIntField(term3756110, term3756110.getClass(), "type", 37);
        setField(term3756110, term3756110.getClass(), "next", null);
        setField(term3756111, term3756111.getClass(), "str", null);
        setIntField(term3756111, term3756111.getClass(), "type", 33);
        setIntField(term3756112, term3756112.getClass(), "type", 43);
        setField(term3756112, term3756112.getClass(), "next", null);
        setField(term3756112, term3756112.getClass(), "first", null);
        setField(term3756112, term3756112.getClass(), "last", null);
        setField(term3756112, term3756112.getClass(), "propListHead", null);
        setIntField(term3756112, term3756112.getClass(), "sourcePosition", 0);
        setField(term3756112, term3756112.getClass(), "jsType", null);
        setField(term3756112, term3756112.getClass(), "parent", null);
        setField(term3756111, term3756111.getClass(), "next", term3756112);
        setField(term3756113, term3756113.getClass(), "str", "");
        setIntField(term3756113, term3756113.getClass(), "type", 40);
        setField(term3756113, term3756113.getClass(), "next", term3756113);
        setField(term3756113, term3756113.getClass(), "first", null);
        setField(term3756113, term3756113.getClass(), "last", null);
        setField(term3756113, term3756113.getClass(), "propListHead", null);
        setIntField(term3756113, term3756113.getClass(), "sourcePosition", 0);
        setField(term3756113, term3756113.getClass(), "jsType", null);
        setField(term3756113, term3756113.getClass(), "parent", null);
        setField(term3756111, term3756111.getClass(), "first", term3756113);
        setField(term3756111, term3756111.getClass(), "last", null);
        setField(term3756111, term3756111.getClass(), "propListHead", null);
        setIntField(term3756111, term3756111.getClass(), "sourcePosition", 0);
        setField(term3756111, term3756111.getClass(), "jsType", null);
        setField(term3756111, term3756111.getClass(), "parent", null);
        setField(term3756110, term3756110.getClass(), "first", term3756111);
        setField(term3756110, term3756110.getClass(), "last", null);
        setField(term3756110, term3756110.getClass(), "propListHead", null);
        setIntField(term3756110, term3756110.getClass(), "sourcePosition", 0);
        setField(term3756110, term3756110.getClass(), "jsType", null);
        setField(term3756110, term3756110.getClass(), "parent", null);
        term3756017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3756027 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3756029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3756032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3756017, term3756017.getClass(), "functionName", null);
        setBooleanField(term3756017, term3756017.getClass(), "itsNeedsActivation", false);
        setIntField(term3756017, term3756017.getClass(), "itsFunctionType", 0);
        setBooleanField(term3756017, term3756017.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3756017, term3756017.getClass(), "encodedSourceStart", 0);
        setIntField(term3756017, term3756017.getClass(), "encodedSourceEnd", 0);
        setField(term3756017, term3756017.getClass(), "sourceName", null);
        setIntField(term3756017, term3756017.getClass(), "baseLineno", 0);
        setIntField(term3756017, term3756017.getClass(), "endLineno", 0);
        setField(term3756017, term3756017.getClass(), "functions", null);
        setField(term3756017, term3756017.getClass(), "regexps", null);
        setField(term3756017, term3756017.getClass(), "itsVariables", null);
        setField(term3756017, term3756017.getClass(), "itsConst", null);
        setField(term3756017, term3756017.getClass(), "itsVariableNames", null);
        setIntField(term3756017, term3756017.getClass(), "varStart", 0);
        setField(term3756017, term3756017.getClass(), "compilerData", null);
        setIntField(term3756017, term3756017.getClass(), "type", 37);
        setField(term3756017, term3756017.getClass(), "next", null);
        setField(term3756027, term3756027.getClass(), "str", null);
        setIntField(term3756027, term3756027.getClass(), "type", 33);
        setIntField(term3756029, term3756029.getClass(), "type", 43);
        setField(term3756029, term3756029.getClass(), "next", null);
        setField(term3756029, term3756029.getClass(), "first", null);
        setField(term3756029, term3756029.getClass(), "last", null);
        setField(term3756029, term3756029.getClass(), "propListHead", null);
        setIntField(term3756029, term3756029.getClass(), "sourcePosition", 0);
        setField(term3756029, term3756029.getClass(), "jsType", null);
        setField(term3756029, term3756029.getClass(), "parent", null);
        setField(term3756027, term3756027.getClass(), "next", term3756029);
        setField(term3756032, term3756032.getClass(), "str", "");
        setIntField(term3756032, term3756032.getClass(), "type", 40);
        setField(term3756032, term3756032.getClass(), "next", term3756032);
        setField(term3756032, term3756032.getClass(), "first", null);
        setField(term3756032, term3756032.getClass(), "last", null);
        setField(term3756032, term3756032.getClass(), "propListHead", null);
        setIntField(term3756032, term3756032.getClass(), "sourcePosition", 0);
        setField(term3756032, term3756032.getClass(), "jsType", null);
        setField(term3756032, term3756032.getClass(), "parent", null);
        setField(term3756027, term3756027.getClass(), "first", term3756032);
        setField(term3756027, term3756027.getClass(), "last", null);
        setField(term3756027, term3756027.getClass(), "propListHead", null);
        setIntField(term3756027, term3756027.getClass(), "sourcePosition", 0);
        setField(term3756027, term3756027.getClass(), "jsType", null);
        setField(term3756027, term3756027.getClass(), "parent", null);
        setField(term3756017, term3756017.getClass(), "first", term3756027);
        setField(term3756017, term3756017.getClass(), "last", null);
        setField(term3756017, term3756017.getClass(), "propListHead", null);
        setIntField(term3756017, term3756017.getClass(), "sourcePosition", 0);
        setField(term3756017, term3756017.getClass(), "jsType", null);
        setField(term3756017, term3756017.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3755723;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3755637, args);
        assertTrue(recursiveEquals(term3755637, term3756109));
        assertTrue(recursiveEquals(term3755723, term3756110));
        assertTrue(recursiveEquals(retValue, term3756017));
    }

};


