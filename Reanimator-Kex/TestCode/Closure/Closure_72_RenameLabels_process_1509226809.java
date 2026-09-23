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

public class RenameLabels_process_1509226809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2152;
     Object term2238;
     Object term2614;
     Object term2615;

    public RenameLabels_process_1509226809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2152 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term2152, term2152.getClass(), "compiler", null);
        term2238 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2238, term2238.getClass(), "type", 0);
        setField(term2238, term2238.getClass(), "first", term2324);
        term2614 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term2614, term2614.getClass(), "compiler", null);
        setField(term2614, term2614.getClass(), "nameSupplier", null);
        setBooleanField(term2614, term2614.getClass(), "removeUnused", false);
        term2615 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2616 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term2615, term2615.getClass(), "functionName", null);
        setBooleanField(term2615, term2615.getClass(), "itsNeedsActivation", false);
        setIntField(term2615, term2615.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615, term2615.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615, term2615.getClass(), "encodedSourceStart", 0);
        setIntField(term2615, term2615.getClass(), "encodedSourceEnd", 0);
        setField(term2615, term2615.getClass(), "sourceName", null);
        setIntField(term2615, term2615.getClass(), "baseLineno", 0);
        setIntField(term2615, term2615.getClass(), "endLineno", 0);
        setField(term2615, term2615.getClass(), "functions", null);
        setField(term2615, term2615.getClass(), "regexps", null);
        setField(term2615, term2615.getClass(), "itsVariables", null);
        setField(term2615, term2615.getClass(), "itsConst", null);
        setField(term2615, term2615.getClass(), "itsVariableNames", null);
        setIntField(term2615, term2615.getClass(), "varStart", 0);
        setField(term2615, term2615.getClass(), "compilerData", null);
        setIntField(term2615, term2615.getClass(), "type", 0);
        setField(term2615, term2615.getClass(), "next", null);
        setField(term2616, term2616.getClass(), "functionName", null);
        setBooleanField(term2616, term2616.getClass(), "itsNeedsActivation", false);
        setIntField(term2616, term2616.getClass(), "itsFunctionType", 0);
        setBooleanField(term2616, term2616.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2616, term2616.getClass(), "encodedSourceStart", 0);
        setIntField(term2616, term2616.getClass(), "encodedSourceEnd", 0);
        setField(term2616, term2616.getClass(), "sourceName", null);
        setIntField(term2616, term2616.getClass(), "baseLineno", 0);
        setIntField(term2616, term2616.getClass(), "endLineno", 0);
        setField(term2616, term2616.getClass(), "functions", null);
        setField(term2616, term2616.getClass(), "regexps", null);
        setField(term2616, term2616.getClass(), "itsVariables", null);
        setField(term2616, term2616.getClass(), "itsConst", null);
        setField(term2616, term2616.getClass(), "itsVariableNames", null);
        setIntField(term2616, term2616.getClass(), "varStart", 0);
        setField(term2616, term2616.getClass(), "compilerData", null);
        setIntField(term2616, term2616.getClass(), "type", 0);
        setField(term2616, term2616.getClass(), "next", null);
        setField(term2616, term2616.getClass(), "first", null);
        setField(term2616, term2616.getClass(), "last", null);
        setField(term2616, term2616.getClass(), "propListHead", null);
        setIntField(term2616, term2616.getClass(), "sourcePosition", 0);
        setField(term2616, term2616.getClass(), "jsType", null);
        setField(term2616, term2616.getClass(), "parent", null);
        setField(term2615, term2615.getClass(), "first", term2616);
        setField(term2615, term2615.getClass(), "last", null);
        setField(term2615, term2615.getClass(), "propListHead", null);
        setIntField(term2615, term2615.getClass(), "sourcePosition", 0);
        setField(term2615, term2615.getClass(), "jsType", null);
        setField(term2615, term2615.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2238;
        callMethod(klass, "process", argTypes, term2152, args);
        assertTrue(recursiveEquals(term2152, term2614));
        assertTrue(recursiveEquals(term2238, null));
    }

};


