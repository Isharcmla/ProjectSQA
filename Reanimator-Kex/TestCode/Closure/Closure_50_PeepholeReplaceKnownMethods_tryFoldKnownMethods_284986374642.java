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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3571972;
     Object term3572064;
     Object term3574080;
     Object term3574081;
     Object term3573752;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3571972 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3572064 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3572156 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3572248 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3572340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3572464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3572156, term3572156.getClass(), "type", 35);
        setIntField(term3572340, term3572340.getClass(), "type", 40);
        setField(term3572340, term3572340.getClass(), "str", "substr");
        setField(term3572248, term3572248.getClass(), "next", term3572340);
        setIntField(term3572248, term3572248.getClass(), "type", 40);
        setField(term3572156, term3572156.getClass(), "first", term3572248);
        setIntField(term3572464, term3572464.getClass(), "type", 40);
        setField(term3572156, term3572156.getClass(), "next", term3572464);
        setField(term3572064, term3572064.getClass(), "first", term3572156);
        setIntField(term3572064, term3572064.getClass(), "type", 37);
        term3574080 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3574080, term3574080.getClass(), "currentTraversal", null);
        term3574081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3574082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3574083 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3574084 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3574085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3574081, term3574081.getClass(), "str", null);
        setIntField(term3574081, term3574081.getClass(), "type", 37);
        setField(term3574081, term3574081.getClass(), "next", null);
        setField(term3574082, term3574082.getClass(), "str", null);
        setIntField(term3574082, term3574082.getClass(), "type", 35);
        setField(term3574083, term3574083.getClass(), "functionName", null);
        setBooleanField(term3574083, term3574083.getClass(), "itsNeedsActivation", false);
        setIntField(term3574083, term3574083.getClass(), "itsFunctionType", 0);
        setBooleanField(term3574083, term3574083.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3574083, term3574083.getClass(), "encodedSourceStart", 0);
        setIntField(term3574083, term3574083.getClass(), "encodedSourceEnd", 0);
        setField(term3574083, term3574083.getClass(), "sourceName", null);
        setIntField(term3574083, term3574083.getClass(), "baseLineno", 0);
        setIntField(term3574083, term3574083.getClass(), "endLineno", 0);
        setField(term3574083, term3574083.getClass(), "functions", null);
        setField(term3574083, term3574083.getClass(), "regexps", null);
        setField(term3574083, term3574083.getClass(), "itsVariables", null);
        setField(term3574083, term3574083.getClass(), "itsConst", null);
        setField(term3574083, term3574083.getClass(), "itsVariableNames", null);
        setIntField(term3574083, term3574083.getClass(), "varStart", 0);
        setField(term3574083, term3574083.getClass(), "compilerData", null);
        setIntField(term3574083, term3574083.getClass(), "type", 40);
        setField(term3574083, term3574083.getClass(), "next", null);
        setField(term3574083, term3574083.getClass(), "first", null);
        setField(term3574083, term3574083.getClass(), "last", null);
        setField(term3574083, term3574083.getClass(), "propListHead", null);
        setIntField(term3574083, term3574083.getClass(), "sourcePosition", 0);
        setField(term3574083, term3574083.getClass(), "jsType", null);
        setField(term3574083, term3574083.getClass(), "parent", null);
        setField(term3574082, term3574082.getClass(), "next", term3574083);
        setField(term3574084, term3574084.getClass(), "str", null);
        setIntField(term3574084, term3574084.getClass(), "type", 40);
        setField(term3574085, term3574085.getClass(), "str", "");
        setIntField(term3574085, term3574085.getClass(), "type", 40);
        setField(term3574085, term3574085.getClass(), "next", null);
        setField(term3574085, term3574085.getClass(), "first", null);
        setField(term3574085, term3574085.getClass(), "last", null);
        setField(term3574085, term3574085.getClass(), "propListHead", null);
        setIntField(term3574085, term3574085.getClass(), "sourcePosition", 0);
        setField(term3574085, term3574085.getClass(), "jsType", null);
        setField(term3574085, term3574085.getClass(), "parent", null);
        setField(term3574084, term3574084.getClass(), "next", term3574085);
        setField(term3574084, term3574084.getClass(), "first", null);
        setField(term3574084, term3574084.getClass(), "last", null);
        setField(term3574084, term3574084.getClass(), "propListHead", null);
        setIntField(term3574084, term3574084.getClass(), "sourcePosition", 0);
        setField(term3574084, term3574084.getClass(), "jsType", null);
        setField(term3574084, term3574084.getClass(), "parent", null);
        setField(term3574082, term3574082.getClass(), "first", term3574084);
        setField(term3574082, term3574082.getClass(), "last", null);
        setField(term3574082, term3574082.getClass(), "propListHead", null);
        setIntField(term3574082, term3574082.getClass(), "sourcePosition", 0);
        setField(term3574082, term3574082.getClass(), "jsType", null);
        setField(term3574082, term3574082.getClass(), "parent", null);
        setField(term3574081, term3574081.getClass(), "first", term3574082);
        setField(term3574081, term3574081.getClass(), "last", null);
        setField(term3574081, term3574081.getClass(), "propListHead", null);
        setIntField(term3574081, term3574081.getClass(), "sourcePosition", 0);
        setField(term3574081, term3574081.getClass(), "jsType", null);
        setField(term3574081, term3574081.getClass(), "parent", null);
        term3573752 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3573754 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3573756 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3573767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3573769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3573752, term3573752.getClass(), "str", null);
        setIntField(term3573752, term3573752.getClass(), "type", 37);
        setField(term3573752, term3573752.getClass(), "next", null);
        setField(term3573754, term3573754.getClass(), "str", null);
        setIntField(term3573754, term3573754.getClass(), "type", 35);
        setField(term3573756, term3573756.getClass(), "functionName", null);
        setBooleanField(term3573756, term3573756.getClass(), "itsNeedsActivation", false);
        setIntField(term3573756, term3573756.getClass(), "itsFunctionType", 0);
        setBooleanField(term3573756, term3573756.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3573756, term3573756.getClass(), "encodedSourceStart", 0);
        setIntField(term3573756, term3573756.getClass(), "encodedSourceEnd", 0);
        setField(term3573756, term3573756.getClass(), "sourceName", null);
        setIntField(term3573756, term3573756.getClass(), "baseLineno", 0);
        setIntField(term3573756, term3573756.getClass(), "endLineno", 0);
        setField(term3573756, term3573756.getClass(), "functions", null);
        setField(term3573756, term3573756.getClass(), "regexps", null);
        setField(term3573756, term3573756.getClass(), "itsVariables", null);
        setField(term3573756, term3573756.getClass(), "itsConst", null);
        setField(term3573756, term3573756.getClass(), "itsVariableNames", null);
        setIntField(term3573756, term3573756.getClass(), "varStart", 0);
        setField(term3573756, term3573756.getClass(), "compilerData", null);
        setIntField(term3573756, term3573756.getClass(), "type", 40);
        setField(term3573756, term3573756.getClass(), "next", null);
        setField(term3573756, term3573756.getClass(), "first", null);
        setField(term3573756, term3573756.getClass(), "last", null);
        setField(term3573756, term3573756.getClass(), "propListHead", null);
        setIntField(term3573756, term3573756.getClass(), "sourcePosition", 0);
        setField(term3573756, term3573756.getClass(), "jsType", null);
        setField(term3573756, term3573756.getClass(), "parent", null);
        setField(term3573754, term3573754.getClass(), "next", term3573756);
        setField(term3573767, term3573767.getClass(), "str", null);
        setIntField(term3573767, term3573767.getClass(), "type", 40);
        setField(term3573769, term3573769.getClass(), "str", "");
        setIntField(term3573769, term3573769.getClass(), "type", 40);
        setField(term3573769, term3573769.getClass(), "next", null);
        setField(term3573769, term3573769.getClass(), "first", null);
        setField(term3573769, term3573769.getClass(), "last", null);
        setField(term3573769, term3573769.getClass(), "propListHead", null);
        setIntField(term3573769, term3573769.getClass(), "sourcePosition", 0);
        setField(term3573769, term3573769.getClass(), "jsType", null);
        setField(term3573769, term3573769.getClass(), "parent", null);
        setField(term3573767, term3573767.getClass(), "next", term3573769);
        setField(term3573767, term3573767.getClass(), "first", null);
        setField(term3573767, term3573767.getClass(), "last", null);
        setField(term3573767, term3573767.getClass(), "propListHead", null);
        setIntField(term3573767, term3573767.getClass(), "sourcePosition", 0);
        setField(term3573767, term3573767.getClass(), "jsType", null);
        setField(term3573767, term3573767.getClass(), "parent", null);
        setField(term3573754, term3573754.getClass(), "first", term3573767);
        setField(term3573754, term3573754.getClass(), "last", null);
        setField(term3573754, term3573754.getClass(), "propListHead", null);
        setIntField(term3573754, term3573754.getClass(), "sourcePosition", 0);
        setField(term3573754, term3573754.getClass(), "jsType", null);
        setField(term3573754, term3573754.getClass(), "parent", null);
        setField(term3573752, term3573752.getClass(), "first", term3573754);
        setField(term3573752, term3573752.getClass(), "last", null);
        setField(term3573752, term3573752.getClass(), "propListHead", null);
        setIntField(term3573752, term3573752.getClass(), "sourcePosition", 0);
        setField(term3573752, term3573752.getClass(), "jsType", null);
        setField(term3573752, term3573752.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3572064;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3571972, args);
        assertTrue(recursiveEquals(term3571972, term3574080));
        assertTrue(recursiveEquals(term3572064, term3574081));
        assertTrue(recursiveEquals(retValue, term3573752));
    }

};


