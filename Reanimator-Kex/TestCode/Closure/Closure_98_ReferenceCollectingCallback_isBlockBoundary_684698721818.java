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

public class ReferenceCollectingCallback_isBlockBoundary_684698721818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215510;
     Object term215596;
     Object term215920;
     Object term215921;

    public ReferenceCollectingCallback_isBlockBoundary_684698721818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215510 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term215596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term215596, term215596.getClass(), "type", 12);
        term215920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215920, term215920.getClass(), "functionName", null);
        setBooleanField(term215920, term215920.getClass(), "itsNeedsActivation", false);
        setIntField(term215920, term215920.getClass(), "itsFunctionType", 0);
        setBooleanField(term215920, term215920.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215920, term215920.getClass(), "encodedSourceStart", 0);
        setIntField(term215920, term215920.getClass(), "encodedSourceEnd", 0);
        setField(term215920, term215920.getClass(), "sourceName", null);
        setIntField(term215920, term215920.getClass(), "baseLineno", 0);
        setIntField(term215920, term215920.getClass(), "endLineno", 0);
        setField(term215920, term215920.getClass(), "functions", null);
        setField(term215920, term215920.getClass(), "regexps", null);
        setField(term215920, term215920.getClass(), "itsVariables", null);
        setField(term215920, term215920.getClass(), "itsConst", null);
        setField(term215920, term215920.getClass(), "itsVariableNames", null);
        setIntField(term215920, term215920.getClass(), "varStart", 0);
        setField(term215920, term215920.getClass(), "compilerData", null);
        setIntField(term215920, term215920.getClass(), "type", 12);
        setField(term215920, term215920.getClass(), "next", null);
        setField(term215920, term215920.getClass(), "first", null);
        setField(term215920, term215920.getClass(), "last", null);
        setField(term215920, term215920.getClass(), "propListHead", null);
        setIntField(term215920, term215920.getClass(), "sourcePosition", 0);
        setField(term215920, term215920.getClass(), "jsType", null);
        setField(term215920, term215920.getClass(), "parent", null);
        term215921 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215921, term215921.getClass(), "functionName", null);
        setBooleanField(term215921, term215921.getClass(), "itsNeedsActivation", false);
        setIntField(term215921, term215921.getClass(), "itsFunctionType", 0);
        setBooleanField(term215921, term215921.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215921, term215921.getClass(), "encodedSourceStart", 0);
        setIntField(term215921, term215921.getClass(), "encodedSourceEnd", 0);
        setField(term215921, term215921.getClass(), "sourceName", null);
        setIntField(term215921, term215921.getClass(), "baseLineno", 0);
        setIntField(term215921, term215921.getClass(), "endLineno", 0);
        setField(term215921, term215921.getClass(), "functions", null);
        setField(term215921, term215921.getClass(), "regexps", null);
        setField(term215921, term215921.getClass(), "itsVariables", null);
        setField(term215921, term215921.getClass(), "itsConst", null);
        setField(term215921, term215921.getClass(), "itsVariableNames", null);
        setIntField(term215921, term215921.getClass(), "varStart", 0);
        setField(term215921, term215921.getClass(), "compilerData", null);
        setIntField(term215921, term215921.getClass(), "type", 0);
        setField(term215921, term215921.getClass(), "next", null);
        setField(term215921, term215921.getClass(), "first", null);
        setField(term215921, term215921.getClass(), "last", null);
        setField(term215921, term215921.getClass(), "propListHead", null);
        setIntField(term215921, term215921.getClass(), "sourcePosition", 0);
        setField(term215921, term215921.getClass(), "jsType", null);
        setField(term215921, term215921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term215510;
        args[1] = term215596;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term215510, term215920));
        assertTrue(recursiveEquals(term215596, term215921));
        assertTrue(recursiveEquals(retValue, false));
    }

};


