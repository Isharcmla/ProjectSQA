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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181489;
     Object term181581;
     Object term181715;
     Object term181716;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181489 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term181581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term181667, term181667.getClass(), "type", 42);
        setField(term181581, term181581.getClass(), "first", term181667);
        term181715 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term181715, term181715.getClass(), "propertyTestFunctions", null);
        term181716 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term181717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term181716, term181716.getClass(), "str", null);
        setIntField(term181716, term181716.getClass(), "type", 0);
        setField(term181716, term181716.getClass(), "next", null);
        setField(term181717, term181717.getClass(), "functionName", null);
        setBooleanField(term181717, term181717.getClass(), "itsNeedsActivation", false);
        setIntField(term181717, term181717.getClass(), "itsFunctionType", 0);
        setBooleanField(term181717, term181717.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term181717, term181717.getClass(), "encodedSourceStart", 0);
        setIntField(term181717, term181717.getClass(), "encodedSourceEnd", 0);
        setField(term181717, term181717.getClass(), "sourceName", null);
        setIntField(term181717, term181717.getClass(), "baseLineno", 0);
        setIntField(term181717, term181717.getClass(), "endLineno", 0);
        setField(term181717, term181717.getClass(), "functions", null);
        setField(term181717, term181717.getClass(), "regexps", null);
        setField(term181717, term181717.getClass(), "itsVariables", null);
        setField(term181717, term181717.getClass(), "itsConst", null);
        setField(term181717, term181717.getClass(), "itsVariableNames", null);
        setIntField(term181717, term181717.getClass(), "varStart", 0);
        setField(term181717, term181717.getClass(), "compilerData", null);
        setIntField(term181717, term181717.getClass(), "type", 42);
        setField(term181717, term181717.getClass(), "next", null);
        setField(term181717, term181717.getClass(), "first", null);
        setField(term181717, term181717.getClass(), "last", null);
        setField(term181717, term181717.getClass(), "propListHead", null);
        setIntField(term181717, term181717.getClass(), "sourcePosition", 0);
        setField(term181717, term181717.getClass(), "jsType", null);
        setField(term181717, term181717.getClass(), "parent", null);
        setField(term181716, term181716.getClass(), "first", term181717);
        setField(term181716, term181716.getClass(), "last", null);
        setField(term181716, term181716.getClass(), "propListHead", null);
        setIntField(term181716, term181716.getClass(), "sourcePosition", 0);
        setField(term181716, term181716.getClass(), "jsType", null);
        setField(term181716, term181716.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term181581;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term181489, args);
        assertTrue(recursiveEquals(term181489, term181715));
        assertTrue(recursiveEquals(term181581, term181716));
        assertTrue(recursiveEquals(retValue, null));
    }

};


