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

public class ClosureCodingConvention_getSingletonGetterClassName_1481393479393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142291;
     Object term142383;
     Object term142513;
     Object term142514;

    public ClosureCodingConvention_getSingletonGetterClassName_1481393479393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142291 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term142383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142469 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term142383, term142383.getClass(), "first", term142469);
        term142513 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term142513, term142513.getClass(), "propertyTestFunctions", null);
        term142514 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term142515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term142514, term142514.getClass(), "number", 0.0);
        setIntField(term142514, term142514.getClass(), "type", 0);
        setField(term142514, term142514.getClass(), "next", null);
        setField(term142515, term142515.getClass(), "functionName", null);
        setBooleanField(term142515, term142515.getClass(), "itsNeedsActivation", false);
        setIntField(term142515, term142515.getClass(), "itsFunctionType", 0);
        setBooleanField(term142515, term142515.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term142515, term142515.getClass(), "encodedSourceStart", 0);
        setIntField(term142515, term142515.getClass(), "encodedSourceEnd", 0);
        setField(term142515, term142515.getClass(), "sourceName", null);
        setIntField(term142515, term142515.getClass(), "baseLineno", 0);
        setIntField(term142515, term142515.getClass(), "endLineno", 0);
        setField(term142515, term142515.getClass(), "functions", null);
        setField(term142515, term142515.getClass(), "regexps", null);
        setField(term142515, term142515.getClass(), "itsVariables", null);
        setField(term142515, term142515.getClass(), "itsConst", null);
        setField(term142515, term142515.getClass(), "itsVariableNames", null);
        setIntField(term142515, term142515.getClass(), "varStart", 0);
        setField(term142515, term142515.getClass(), "compilerData", null);
        setIntField(term142515, term142515.getClass(), "type", 0);
        setField(term142515, term142515.getClass(), "next", null);
        setField(term142515, term142515.getClass(), "first", null);
        setField(term142515, term142515.getClass(), "last", null);
        setField(term142515, term142515.getClass(), "propListHead", null);
        setIntField(term142515, term142515.getClass(), "sourcePosition", 0);
        setField(term142515, term142515.getClass(), "jsType", null);
        setField(term142515, term142515.getClass(), "parent", null);
        setField(term142514, term142514.getClass(), "first", term142515);
        setField(term142514, term142514.getClass(), "last", null);
        setField(term142514, term142514.getClass(), "propListHead", null);
        setIntField(term142514, term142514.getClass(), "sourcePosition", 0);
        setField(term142514, term142514.getClass(), "jsType", null);
        setField(term142514, term142514.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term142383;
        Object retValue = callMethod(klass, "getSingletonGetterClassName", argTypes, term142291, args);
        assertTrue(recursiveEquals(term142291, term142513));
        assertTrue(recursiveEquals(term142383, term142514));
        assertTrue(recursiveEquals(retValue, null));
    }

};


