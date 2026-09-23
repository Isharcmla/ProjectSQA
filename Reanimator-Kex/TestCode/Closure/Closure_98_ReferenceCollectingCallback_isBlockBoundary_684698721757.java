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

public class ReferenceCollectingCallback_isBlockBoundary_684698721757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202651;
     Object term202667;

    public ReferenceCollectingCallback_isBlockBoundary_684698721757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202651 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term202651, term202651.getClass(), "type", 101);
        term202667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term202667, term202667.getClass(), "functionName", null);
        setBooleanField(term202667, term202667.getClass(), "itsNeedsActivation", false);
        setIntField(term202667, term202667.getClass(), "itsFunctionType", 0);
        setBooleanField(term202667, term202667.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term202667, term202667.getClass(), "encodedSourceStart", 0);
        setIntField(term202667, term202667.getClass(), "encodedSourceEnd", 0);
        setField(term202667, term202667.getClass(), "sourceName", null);
        setIntField(term202667, term202667.getClass(), "baseLineno", 0);
        setIntField(term202667, term202667.getClass(), "endLineno", 0);
        setField(term202667, term202667.getClass(), "functions", null);
        setField(term202667, term202667.getClass(), "regexps", null);
        setField(term202667, term202667.getClass(), "itsVariables", null);
        setField(term202667, term202667.getClass(), "itsConst", null);
        setField(term202667, term202667.getClass(), "itsVariableNames", null);
        setIntField(term202667, term202667.getClass(), "varStart", 0);
        setField(term202667, term202667.getClass(), "compilerData", null);
        setIntField(term202667, term202667.getClass(), "type", 101);
        setField(term202667, term202667.getClass(), "next", null);
        setField(term202667, term202667.getClass(), "first", null);
        setField(term202667, term202667.getClass(), "last", null);
        setField(term202667, term202667.getClass(), "propListHead", null);
        setIntField(term202667, term202667.getClass(), "sourcePosition", 0);
        setField(term202667, term202667.getClass(), "jsType", null);
        setField(term202667, term202667.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term202651;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term202651, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


