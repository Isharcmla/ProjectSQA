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

public class ReferenceCollectingCallback_isBlockBoundary_684698721822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216704;
     Object term216719;

    public ReferenceCollectingCallback_isBlockBoundary_684698721822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216704 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term216704, term216704.getClass(), "type", 119);
        term216719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term216719, term216719.getClass(), "functionName", null);
        setBooleanField(term216719, term216719.getClass(), "itsNeedsActivation", false);
        setIntField(term216719, term216719.getClass(), "itsFunctionType", 0);
        setBooleanField(term216719, term216719.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term216719, term216719.getClass(), "encodedSourceStart", 0);
        setIntField(term216719, term216719.getClass(), "encodedSourceEnd", 0);
        setField(term216719, term216719.getClass(), "sourceName", null);
        setIntField(term216719, term216719.getClass(), "baseLineno", 0);
        setIntField(term216719, term216719.getClass(), "endLineno", 0);
        setField(term216719, term216719.getClass(), "functions", null);
        setField(term216719, term216719.getClass(), "regexps", null);
        setField(term216719, term216719.getClass(), "itsVariables", null);
        setField(term216719, term216719.getClass(), "itsConst", null);
        setField(term216719, term216719.getClass(), "itsVariableNames", null);
        setIntField(term216719, term216719.getClass(), "varStart", 0);
        setField(term216719, term216719.getClass(), "compilerData", null);
        setIntField(term216719, term216719.getClass(), "type", 119);
        setField(term216719, term216719.getClass(), "next", null);
        setField(term216719, term216719.getClass(), "first", null);
        setField(term216719, term216719.getClass(), "last", null);
        setField(term216719, term216719.getClass(), "propListHead", null);
        setIntField(term216719, term216719.getClass(), "sourcePosition", 0);
        setField(term216719, term216719.getClass(), "jsType", null);
        setField(term216719, term216719.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term216704;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term216704, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


