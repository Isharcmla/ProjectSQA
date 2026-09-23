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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287635;
     Object term287659;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287635 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term287635, term287635.getClass(), "type", 108);
        term287659 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term287659, term287659.getClass(), "functionName", null);
        setBooleanField(term287659, term287659.getClass(), "itsNeedsActivation", false);
        setIntField(term287659, term287659.getClass(), "itsFunctionType", 0);
        setBooleanField(term287659, term287659.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term287659, term287659.getClass(), "encodedSourceStart", 0);
        setIntField(term287659, term287659.getClass(), "encodedSourceEnd", 0);
        setField(term287659, term287659.getClass(), "sourceName", null);
        setIntField(term287659, term287659.getClass(), "baseLineno", 0);
        setIntField(term287659, term287659.getClass(), "endLineno", 0);
        setField(term287659, term287659.getClass(), "functions", null);
        setField(term287659, term287659.getClass(), "regexps", null);
        setField(term287659, term287659.getClass(), "itsVariables", null);
        setField(term287659, term287659.getClass(), "itsConst", null);
        setField(term287659, term287659.getClass(), "itsVariableNames", null);
        setIntField(term287659, term287659.getClass(), "varStart", 0);
        setField(term287659, term287659.getClass(), "compilerData", null);
        setIntField(term287659, term287659.getClass(), "type", 108);
        setField(term287659, term287659.getClass(), "next", null);
        setField(term287659, term287659.getClass(), "first", null);
        setField(term287659, term287659.getClass(), "last", null);
        setField(term287659, term287659.getClass(), "propListHead", null);
        setIntField(term287659, term287659.getClass(), "sourcePosition", 0);
        setField(term287659, term287659.getClass(), "jsType", null);
        setField(term287659, term287659.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term287635;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term287635, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


