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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3770279;
     Object term3770365;
     Object term3771649;
     Object term3771650;
     Object term3771477;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3770279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3770365 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3770457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3770549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3770679 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3770365, term3770365.getClass(), "type", 37);
        setIntField(term3770457, term3770457.getClass(), "type", 35);
        setField(term3770549, term3770549.getClass(), "next", term3770549);
        setIntField(term3770549, term3770549.getClass(), "type", 40);
        setField(term3770549, term3770549.getClass(), "str", "substr");
        setField(term3770457, term3770457.getClass(), "first", term3770549);
        setIntField(term3770679, term3770679.getClass(), "type", 41);
        setField(term3770457, term3770457.getClass(), "next", term3770679);
        setField(term3770365, term3770365.getClass(), "first", term3770457);
        term3771649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3771649, term3771649.getClass(), "currentTraversal", null);
        term3771650 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3771651 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771653 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3771650, term3771650.getClass(), "functionName", null);
        setBooleanField(term3771650, term3771650.getClass(), "itsNeedsActivation", false);
        setIntField(term3771650, term3771650.getClass(), "itsFunctionType", 0);
        setBooleanField(term3771650, term3771650.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3771650, term3771650.getClass(), "encodedSourceStart", 0);
        setIntField(term3771650, term3771650.getClass(), "encodedSourceEnd", 0);
        setField(term3771650, term3771650.getClass(), "sourceName", null);
        setIntField(term3771650, term3771650.getClass(), "baseLineno", 0);
        setIntField(term3771650, term3771650.getClass(), "endLineno", 0);
        setField(term3771650, term3771650.getClass(), "functions", null);
        setField(term3771650, term3771650.getClass(), "regexps", null);
        setField(term3771650, term3771650.getClass(), "itsVariables", null);
        setField(term3771650, term3771650.getClass(), "itsConst", null);
        setField(term3771650, term3771650.getClass(), "itsVariableNames", null);
        setIntField(term3771650, term3771650.getClass(), "varStart", 0);
        setField(term3771650, term3771650.getClass(), "compilerData", null);
        setIntField(term3771650, term3771650.getClass(), "type", 37);
        setField(term3771650, term3771650.getClass(), "next", null);
        setField(term3771651, term3771651.getClass(), "str", null);
        setIntField(term3771651, term3771651.getClass(), "type", 35);
        setField(term3771652, term3771652.getClass(), "str", null);
        setIntField(term3771652, term3771652.getClass(), "type", 41);
        setField(term3771652, term3771652.getClass(), "next", null);
        setField(term3771652, term3771652.getClass(), "first", null);
        setField(term3771652, term3771652.getClass(), "last", null);
        setField(term3771652, term3771652.getClass(), "propListHead", null);
        setIntField(term3771652, term3771652.getClass(), "sourcePosition", 0);
        setField(term3771652, term3771652.getClass(), "jsType", null);
        setField(term3771652, term3771652.getClass(), "parent", null);
        setField(term3771651, term3771651.getClass(), "next", term3771652);
        setField(term3771653, term3771653.getClass(), "str", "substr");
        setIntField(term3771653, term3771653.getClass(), "type", 40);
        setField(term3771653, term3771653.getClass(), "next", term3771653);
        setField(term3771653, term3771653.getClass(), "first", null);
        setField(term3771653, term3771653.getClass(), "last", null);
        setField(term3771653, term3771653.getClass(), "propListHead", null);
        setIntField(term3771653, term3771653.getClass(), "sourcePosition", 0);
        setField(term3771653, term3771653.getClass(), "jsType", null);
        setField(term3771653, term3771653.getClass(), "parent", null);
        setField(term3771651, term3771651.getClass(), "first", term3771653);
        setField(term3771651, term3771651.getClass(), "last", null);
        setField(term3771651, term3771651.getClass(), "propListHead", null);
        setIntField(term3771651, term3771651.getClass(), "sourcePosition", 0);
        setField(term3771651, term3771651.getClass(), "jsType", null);
        setField(term3771651, term3771651.getClass(), "parent", null);
        setField(term3771650, term3771650.getClass(), "first", term3771651);
        setField(term3771650, term3771650.getClass(), "last", null);
        setField(term3771650, term3771650.getClass(), "propListHead", null);
        setIntField(term3771650, term3771650.getClass(), "sourcePosition", 0);
        setField(term3771650, term3771650.getClass(), "jsType", null);
        setField(term3771650, term3771650.getClass(), "parent", null);
        term3771477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3771487 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771489 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3771492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3771477, term3771477.getClass(), "functionName", null);
        setBooleanField(term3771477, term3771477.getClass(), "itsNeedsActivation", false);
        setIntField(term3771477, term3771477.getClass(), "itsFunctionType", 0);
        setBooleanField(term3771477, term3771477.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3771477, term3771477.getClass(), "encodedSourceStart", 0);
        setIntField(term3771477, term3771477.getClass(), "encodedSourceEnd", 0);
        setField(term3771477, term3771477.getClass(), "sourceName", null);
        setIntField(term3771477, term3771477.getClass(), "baseLineno", 0);
        setIntField(term3771477, term3771477.getClass(), "endLineno", 0);
        setField(term3771477, term3771477.getClass(), "functions", null);
        setField(term3771477, term3771477.getClass(), "regexps", null);
        setField(term3771477, term3771477.getClass(), "itsVariables", null);
        setField(term3771477, term3771477.getClass(), "itsConst", null);
        setField(term3771477, term3771477.getClass(), "itsVariableNames", null);
        setIntField(term3771477, term3771477.getClass(), "varStart", 0);
        setField(term3771477, term3771477.getClass(), "compilerData", null);
        setIntField(term3771477, term3771477.getClass(), "type", 37);
        setField(term3771477, term3771477.getClass(), "next", null);
        setField(term3771487, term3771487.getClass(), "str", null);
        setIntField(term3771487, term3771487.getClass(), "type", 35);
        setField(term3771489, term3771489.getClass(), "str", null);
        setIntField(term3771489, term3771489.getClass(), "type", 41);
        setField(term3771489, term3771489.getClass(), "next", null);
        setField(term3771489, term3771489.getClass(), "first", null);
        setField(term3771489, term3771489.getClass(), "last", null);
        setField(term3771489, term3771489.getClass(), "propListHead", null);
        setIntField(term3771489, term3771489.getClass(), "sourcePosition", 0);
        setField(term3771489, term3771489.getClass(), "jsType", null);
        setField(term3771489, term3771489.getClass(), "parent", null);
        setField(term3771487, term3771487.getClass(), "next", term3771489);
        setField(term3771492, term3771492.getClass(), "str", "substr");
        setIntField(term3771492, term3771492.getClass(), "type", 40);
        setField(term3771492, term3771492.getClass(), "next", term3771492);
        setField(term3771492, term3771492.getClass(), "first", null);
        setField(term3771492, term3771492.getClass(), "last", null);
        setField(term3771492, term3771492.getClass(), "propListHead", null);
        setIntField(term3771492, term3771492.getClass(), "sourcePosition", 0);
        setField(term3771492, term3771492.getClass(), "jsType", null);
        setField(term3771492, term3771492.getClass(), "parent", null);
        setField(term3771487, term3771487.getClass(), "first", term3771492);
        setField(term3771487, term3771487.getClass(), "last", null);
        setField(term3771487, term3771487.getClass(), "propListHead", null);
        setIntField(term3771487, term3771487.getClass(), "sourcePosition", 0);
        setField(term3771487, term3771487.getClass(), "jsType", null);
        setField(term3771487, term3771487.getClass(), "parent", null);
        setField(term3771477, term3771477.getClass(), "first", term3771487);
        setField(term3771477, term3771477.getClass(), "last", null);
        setField(term3771477, term3771477.getClass(), "propListHead", null);
        setIntField(term3771477, term3771477.getClass(), "sourcePosition", 0);
        setField(term3771477, term3771477.getClass(), "jsType", null);
        setField(term3771477, term3771477.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3770365;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3770279, args);
        assertTrue(recursiveEquals(term3770279, term3771649));
        assertTrue(recursiveEquals(term3770365, term3771650));
        assertTrue(recursiveEquals(retValue, term3771477));
    }

};


