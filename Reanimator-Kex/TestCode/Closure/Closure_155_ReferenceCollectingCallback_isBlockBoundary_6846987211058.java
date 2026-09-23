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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270878;
     Object term271662;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term270878, term270878.getClass(), "type", 98);
        term271662 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term271662, term271662.getClass(), "functionName", null);
        setBooleanField(term271662, term271662.getClass(), "itsNeedsActivation", false);
        setIntField(term271662, term271662.getClass(), "itsFunctionType", 0);
        setBooleanField(term271662, term271662.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term271662, term271662.getClass(), "encodedSourceStart", 0);
        setIntField(term271662, term271662.getClass(), "encodedSourceEnd", 0);
        setField(term271662, term271662.getClass(), "sourceName", null);
        setIntField(term271662, term271662.getClass(), "baseLineno", 0);
        setIntField(term271662, term271662.getClass(), "endLineno", 0);
        setField(term271662, term271662.getClass(), "functions", null);
        setField(term271662, term271662.getClass(), "regexps", null);
        setField(term271662, term271662.getClass(), "itsVariables", null);
        setField(term271662, term271662.getClass(), "itsConst", null);
        setField(term271662, term271662.getClass(), "itsVariableNames", null);
        setIntField(term271662, term271662.getClass(), "varStart", 0);
        setField(term271662, term271662.getClass(), "compilerData", null);
        setIntField(term271662, term271662.getClass(), "type", 98);
        setField(term271662, term271662.getClass(), "next", null);
        setField(term271662, term271662.getClass(), "first", null);
        setField(term271662, term271662.getClass(), "last", null);
        setField(term271662, term271662.getClass(), "propListHead", null);
        setIntField(term271662, term271662.getClass(), "sourcePosition", 0);
        setField(term271662, term271662.getClass(), "jsType", null);
        setField(term271662, term271662.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term270878;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term270878, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


