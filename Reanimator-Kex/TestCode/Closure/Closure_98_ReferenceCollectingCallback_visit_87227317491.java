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

public class ReferenceCollectingCallback_visit_87227317491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18885;
     Object term18971;
     Object term19057;
     Object term19679;
     Object term19680;
     Object term19681;

    public ReferenceCollectingCallback_visit_87227317491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18885 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term18971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term18971, term18971.getClass(), "type", -39);
        term19057 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term19679 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term19679, term19679.getClass(), "referenceMap", null);
        setField(term19679, term19679.getClass(), "blockStack", null);
        setField(term19679, term19679.getClass(), "behavior", null);
        setField(term19679, term19679.getClass(), "compiler", null);
        setField(term19679, term19679.getClass(), "varFilter", null);
        term19680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term19680, term19680.getClass(), "functionName", null);
        setBooleanField(term19680, term19680.getClass(), "itsNeedsActivation", false);
        setIntField(term19680, term19680.getClass(), "itsFunctionType", 0);
        setBooleanField(term19680, term19680.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term19680, term19680.getClass(), "encodedSourceStart", 0);
        setIntField(term19680, term19680.getClass(), "encodedSourceEnd", 0);
        setField(term19680, term19680.getClass(), "sourceName", null);
        setIntField(term19680, term19680.getClass(), "baseLineno", 0);
        setIntField(term19680, term19680.getClass(), "endLineno", 0);
        setField(term19680, term19680.getClass(), "functions", null);
        setField(term19680, term19680.getClass(), "regexps", null);
        setField(term19680, term19680.getClass(), "itsVariables", null);
        setField(term19680, term19680.getClass(), "itsConst", null);
        setField(term19680, term19680.getClass(), "itsVariableNames", null);
        setIntField(term19680, term19680.getClass(), "varStart", 0);
        setField(term19680, term19680.getClass(), "compilerData", null);
        setIntField(term19680, term19680.getClass(), "type", -39);
        setField(term19680, term19680.getClass(), "next", null);
        setField(term19680, term19680.getClass(), "first", null);
        setField(term19680, term19680.getClass(), "last", null);
        setField(term19680, term19680.getClass(), "propListHead", null);
        setIntField(term19680, term19680.getClass(), "sourcePosition", 0);
        setField(term19680, term19680.getClass(), "jsType", null);
        setField(term19680, term19680.getClass(), "parent", null);
        term19681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term19681, term19681.getClass(), "functionName", null);
        setBooleanField(term19681, term19681.getClass(), "itsNeedsActivation", false);
        setIntField(term19681, term19681.getClass(), "itsFunctionType", 0);
        setBooleanField(term19681, term19681.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term19681, term19681.getClass(), "encodedSourceStart", 0);
        setIntField(term19681, term19681.getClass(), "encodedSourceEnd", 0);
        setField(term19681, term19681.getClass(), "sourceName", null);
        setIntField(term19681, term19681.getClass(), "baseLineno", 0);
        setIntField(term19681, term19681.getClass(), "endLineno", 0);
        setField(term19681, term19681.getClass(), "functions", null);
        setField(term19681, term19681.getClass(), "regexps", null);
        setField(term19681, term19681.getClass(), "itsVariables", null);
        setField(term19681, term19681.getClass(), "itsConst", null);
        setField(term19681, term19681.getClass(), "itsVariableNames", null);
        setIntField(term19681, term19681.getClass(), "varStart", 0);
        setField(term19681, term19681.getClass(), "compilerData", null);
        setIntField(term19681, term19681.getClass(), "type", 0);
        setField(term19681, term19681.getClass(), "next", null);
        setField(term19681, term19681.getClass(), "first", null);
        setField(term19681, term19681.getClass(), "last", null);
        setField(term19681, term19681.getClass(), "propListHead", null);
        setIntField(term19681, term19681.getClass(), "sourcePosition", 0);
        setField(term19681, term19681.getClass(), "jsType", null);
        setField(term19681, term19681.getClass(), "parent", null);
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
        args[1] = term18971;
        args[2] = term19057;
        callMethod(klass, "visit", argTypes, term18885, args);
        assertTrue(recursiveEquals(term18885, term19679));
        assertTrue(recursiveEquals(term18971, term19681));
        assertTrue(recursiveEquals(term19057, null));
    }

};


