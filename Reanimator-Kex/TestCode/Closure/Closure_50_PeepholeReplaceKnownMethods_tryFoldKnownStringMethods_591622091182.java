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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53768;
     Object term53854;
     Object term54641;
     Object term54642;
     Object term54586;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term53854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term53854, term53854.getClass(), "type", 37);
        setField(term53854, term53854.getClass(), "first", term53940);
        term54641 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term54641, term54641.getClass(), "currentTraversal", null);
        term54642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term54642, term54642.getClass(), "functionName", null);
        setBooleanField(term54642, term54642.getClass(), "itsNeedsActivation", false);
        setIntField(term54642, term54642.getClass(), "itsFunctionType", 0);
        setBooleanField(term54642, term54642.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54642, term54642.getClass(), "encodedSourceStart", 0);
        setIntField(term54642, term54642.getClass(), "encodedSourceEnd", 0);
        setField(term54642, term54642.getClass(), "sourceName", null);
        setIntField(term54642, term54642.getClass(), "baseLineno", 0);
        setIntField(term54642, term54642.getClass(), "endLineno", 0);
        setField(term54642, term54642.getClass(), "functions", null);
        setField(term54642, term54642.getClass(), "regexps", null);
        setField(term54642, term54642.getClass(), "itsVariables", null);
        setField(term54642, term54642.getClass(), "itsConst", null);
        setField(term54642, term54642.getClass(), "itsVariableNames", null);
        setIntField(term54642, term54642.getClass(), "varStart", 0);
        setField(term54642, term54642.getClass(), "compilerData", null);
        setIntField(term54642, term54642.getClass(), "type", 37);
        setField(term54642, term54642.getClass(), "next", null);
        setField(term54643, term54643.getClass(), "functionName", null);
        setBooleanField(term54643, term54643.getClass(), "itsNeedsActivation", false);
        setIntField(term54643, term54643.getClass(), "itsFunctionType", 0);
        setBooleanField(term54643, term54643.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54643, term54643.getClass(), "encodedSourceStart", 0);
        setIntField(term54643, term54643.getClass(), "encodedSourceEnd", 0);
        setField(term54643, term54643.getClass(), "sourceName", null);
        setIntField(term54643, term54643.getClass(), "baseLineno", 0);
        setIntField(term54643, term54643.getClass(), "endLineno", 0);
        setField(term54643, term54643.getClass(), "functions", null);
        setField(term54643, term54643.getClass(), "regexps", null);
        setField(term54643, term54643.getClass(), "itsVariables", null);
        setField(term54643, term54643.getClass(), "itsConst", null);
        setField(term54643, term54643.getClass(), "itsVariableNames", null);
        setIntField(term54643, term54643.getClass(), "varStart", 0);
        setField(term54643, term54643.getClass(), "compilerData", null);
        setIntField(term54643, term54643.getClass(), "type", 0);
        setField(term54643, term54643.getClass(), "next", null);
        setField(term54643, term54643.getClass(), "first", null);
        setField(term54643, term54643.getClass(), "last", null);
        setField(term54643, term54643.getClass(), "propListHead", null);
        setIntField(term54643, term54643.getClass(), "sourcePosition", 0);
        setField(term54643, term54643.getClass(), "jsType", null);
        setField(term54643, term54643.getClass(), "parent", null);
        setField(term54642, term54642.getClass(), "first", term54643);
        setField(term54642, term54642.getClass(), "last", null);
        setField(term54642, term54642.getClass(), "propListHead", null);
        setIntField(term54642, term54642.getClass(), "sourcePosition", 0);
        setField(term54642, term54642.getClass(), "jsType", null);
        setField(term54642, term54642.getClass(), "parent", null);
        term54586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term54586, term54586.getClass(), "functionName", null);
        setBooleanField(term54586, term54586.getClass(), "itsNeedsActivation", false);
        setIntField(term54586, term54586.getClass(), "itsFunctionType", 0);
        setBooleanField(term54586, term54586.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54586, term54586.getClass(), "encodedSourceStart", 0);
        setIntField(term54586, term54586.getClass(), "encodedSourceEnd", 0);
        setField(term54586, term54586.getClass(), "sourceName", null);
        setIntField(term54586, term54586.getClass(), "baseLineno", 0);
        setIntField(term54586, term54586.getClass(), "endLineno", 0);
        setField(term54586, term54586.getClass(), "functions", null);
        setField(term54586, term54586.getClass(), "regexps", null);
        setField(term54586, term54586.getClass(), "itsVariables", null);
        setField(term54586, term54586.getClass(), "itsConst", null);
        setField(term54586, term54586.getClass(), "itsVariableNames", null);
        setIntField(term54586, term54586.getClass(), "varStart", 0);
        setField(term54586, term54586.getClass(), "compilerData", null);
        setIntField(term54586, term54586.getClass(), "type", 37);
        setField(term54586, term54586.getClass(), "next", null);
        setField(term54596, term54596.getClass(), "functionName", null);
        setBooleanField(term54596, term54596.getClass(), "itsNeedsActivation", false);
        setIntField(term54596, term54596.getClass(), "itsFunctionType", 0);
        setBooleanField(term54596, term54596.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term54596, term54596.getClass(), "encodedSourceStart", 0);
        setIntField(term54596, term54596.getClass(), "encodedSourceEnd", 0);
        setField(term54596, term54596.getClass(), "sourceName", null);
        setIntField(term54596, term54596.getClass(), "baseLineno", 0);
        setIntField(term54596, term54596.getClass(), "endLineno", 0);
        setField(term54596, term54596.getClass(), "functions", null);
        setField(term54596, term54596.getClass(), "regexps", null);
        setField(term54596, term54596.getClass(), "itsVariables", null);
        setField(term54596, term54596.getClass(), "itsConst", null);
        setField(term54596, term54596.getClass(), "itsVariableNames", null);
        setIntField(term54596, term54596.getClass(), "varStart", 0);
        setField(term54596, term54596.getClass(), "compilerData", null);
        setIntField(term54596, term54596.getClass(), "type", 0);
        setField(term54596, term54596.getClass(), "next", null);
        setField(term54596, term54596.getClass(), "first", null);
        setField(term54596, term54596.getClass(), "last", null);
        setField(term54596, term54596.getClass(), "propListHead", null);
        setIntField(term54596, term54596.getClass(), "sourcePosition", 0);
        setField(term54596, term54596.getClass(), "jsType", null);
        setField(term54596, term54596.getClass(), "parent", null);
        setField(term54586, term54586.getClass(), "first", term54596);
        setField(term54586, term54586.getClass(), "last", null);
        setField(term54586, term54586.getClass(), "propListHead", null);
        setIntField(term54586, term54586.getClass(), "sourcePosition", 0);
        setField(term54586, term54586.getClass(), "jsType", null);
        setField(term54586, term54586.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53854;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term53768, args);
        assertTrue(recursiveEquals(term53768, term54641));
        assertTrue(recursiveEquals(term53854, term54642));
        assertTrue(recursiveEquals(retValue, term54586));
    }

};


