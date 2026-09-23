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

public class ReferenceCollectingCallback_shouldTraverse_4228556841067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273449;
     Object term273535;
     Object term273830;
     Object term273831;

    public ReferenceCollectingCallback_shouldTraverse_4228556841067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273449 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term273535 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term273535, term273535.getClass(), "type", 100);
        term273830 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term273830, term273830.getClass(), "referenceMap", null);
        setField(term273830, term273830.getClass(), "blockStack", null);
        setField(term273830, term273830.getClass(), "behavior", null);
        setField(term273830, term273830.getClass(), "compiler", null);
        setField(term273830, term273830.getClass(), "varFilter", null);
        term273831 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term273831, term273831.getClass(), "functionName", null);
        setBooleanField(term273831, term273831.getClass(), "itsNeedsActivation", false);
        setIntField(term273831, term273831.getClass(), "itsFunctionType", 0);
        setBooleanField(term273831, term273831.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term273831, term273831.getClass(), "encodedSourceStart", 0);
        setIntField(term273831, term273831.getClass(), "encodedSourceEnd", 0);
        setField(term273831, term273831.getClass(), "sourceName", null);
        setIntField(term273831, term273831.getClass(), "baseLineno", 0);
        setIntField(term273831, term273831.getClass(), "endLineno", 0);
        setField(term273831, term273831.getClass(), "functions", null);
        setField(term273831, term273831.getClass(), "regexps", null);
        setField(term273831, term273831.getClass(), "itsVariables", null);
        setField(term273831, term273831.getClass(), "itsConst", null);
        setField(term273831, term273831.getClass(), "itsVariableNames", null);
        setIntField(term273831, term273831.getClass(), "varStart", 0);
        setField(term273831, term273831.getClass(), "compilerData", null);
        setIntField(term273831, term273831.getClass(), "type", 100);
        setField(term273831, term273831.getClass(), "next", null);
        setField(term273831, term273831.getClass(), "first", null);
        setField(term273831, term273831.getClass(), "last", null);
        setField(term273831, term273831.getClass(), "propListHead", null);
        setIntField(term273831, term273831.getClass(), "sourcePosition", 0);
        setField(term273831, term273831.getClass(), "jsType", null);
        setField(term273831, term273831.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term273535;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term273449, args);
        assertTrue(recursiveEquals(term273449, term273830));
        assertTrue(recursiveEquals(term273535, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


