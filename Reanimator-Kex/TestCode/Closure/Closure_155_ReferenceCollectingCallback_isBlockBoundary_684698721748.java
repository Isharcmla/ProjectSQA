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

public class ReferenceCollectingCallback_isBlockBoundary_684698721748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194931;
     Object term195017;
     Object term195249;
     Object term195250;

    public ReferenceCollectingCallback_isBlockBoundary_684698721748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194931 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term195017 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term195017, term195017.getClass(), "type", 12);
        term195249 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term195249, term195249.getClass(), "functionName", null);
        setBooleanField(term195249, term195249.getClass(), "itsNeedsActivation", false);
        setIntField(term195249, term195249.getClass(), "itsFunctionType", 0);
        setBooleanField(term195249, term195249.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term195249, term195249.getClass(), "encodedSourceStart", 0);
        setIntField(term195249, term195249.getClass(), "encodedSourceEnd", 0);
        setField(term195249, term195249.getClass(), "sourceName", null);
        setIntField(term195249, term195249.getClass(), "baseLineno", 0);
        setIntField(term195249, term195249.getClass(), "endLineno", 0);
        setField(term195249, term195249.getClass(), "functions", null);
        setField(term195249, term195249.getClass(), "regexps", null);
        setField(term195249, term195249.getClass(), "itsVariables", null);
        setField(term195249, term195249.getClass(), "itsConst", null);
        setField(term195249, term195249.getClass(), "itsVariableNames", null);
        setIntField(term195249, term195249.getClass(), "varStart", 0);
        setField(term195249, term195249.getClass(), "compilerData", null);
        setIntField(term195249, term195249.getClass(), "type", 12);
        setField(term195249, term195249.getClass(), "next", null);
        setField(term195249, term195249.getClass(), "first", null);
        setField(term195249, term195249.getClass(), "last", null);
        setField(term195249, term195249.getClass(), "propListHead", null);
        setIntField(term195249, term195249.getClass(), "sourcePosition", 0);
        setField(term195249, term195249.getClass(), "jsType", null);
        setField(term195249, term195249.getClass(), "parent", null);
        term195250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term195250, term195250.getClass(), "str", null);
        setIntField(term195250, term195250.getClass(), "type", 0);
        setField(term195250, term195250.getClass(), "next", null);
        setField(term195250, term195250.getClass(), "first", null);
        setField(term195250, term195250.getClass(), "last", null);
        setField(term195250, term195250.getClass(), "propListHead", null);
        setIntField(term195250, term195250.getClass(), "sourcePosition", 0);
        setField(term195250, term195250.getClass(), "jsType", null);
        setField(term195250, term195250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term194931;
        args[1] = term195017;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term194931, term195249));
        assertTrue(recursiveEquals(term195017, term195250));
        assertTrue(recursiveEquals(retValue, false));
    }

};


