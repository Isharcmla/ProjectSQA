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

public class ReferenceCollectingCallback_isBlockBoundary_684698721981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250148;
     Object term250705;

    public ReferenceCollectingCallback_isBlockBoundary_684698721981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term250148, term250148.getClass(), "type", 114);
        term250705 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term250705, term250705.getClass(), "functionName", null);
        setBooleanField(term250705, term250705.getClass(), "itsNeedsActivation", false);
        setIntField(term250705, term250705.getClass(), "itsFunctionType", 0);
        setBooleanField(term250705, term250705.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term250705, term250705.getClass(), "encodedSourceStart", 0);
        setIntField(term250705, term250705.getClass(), "encodedSourceEnd", 0);
        setField(term250705, term250705.getClass(), "sourceName", null);
        setIntField(term250705, term250705.getClass(), "baseLineno", 0);
        setIntField(term250705, term250705.getClass(), "endLineno", 0);
        setField(term250705, term250705.getClass(), "functions", null);
        setField(term250705, term250705.getClass(), "regexps", null);
        setField(term250705, term250705.getClass(), "itsVariables", null);
        setField(term250705, term250705.getClass(), "itsConst", null);
        setField(term250705, term250705.getClass(), "itsVariableNames", null);
        setIntField(term250705, term250705.getClass(), "varStart", 0);
        setField(term250705, term250705.getClass(), "compilerData", null);
        setIntField(term250705, term250705.getClass(), "type", 114);
        setField(term250705, term250705.getClass(), "next", null);
        setField(term250705, term250705.getClass(), "first", null);
        setField(term250705, term250705.getClass(), "last", null);
        setField(term250705, term250705.getClass(), "propListHead", null);
        setIntField(term250705, term250705.getClass(), "sourcePosition", 0);
        setField(term250705, term250705.getClass(), "jsType", null);
        setField(term250705, term250705.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term250148;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term250148, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


