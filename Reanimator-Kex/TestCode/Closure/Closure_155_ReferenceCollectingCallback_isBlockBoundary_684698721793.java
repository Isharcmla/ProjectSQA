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

public class ReferenceCollectingCallback_isBlockBoundary_684698721793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204472;
     Object term204487;

    public ReferenceCollectingCallback_isBlockBoundary_684698721793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204472 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term204472, term204472.getClass(), "type", 115);
        term204487 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term204487, term204487.getClass(), "functionName", null);
        setBooleanField(term204487, term204487.getClass(), "itsNeedsActivation", false);
        setIntField(term204487, term204487.getClass(), "itsFunctionType", 0);
        setBooleanField(term204487, term204487.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term204487, term204487.getClass(), "encodedSourceStart", 0);
        setIntField(term204487, term204487.getClass(), "encodedSourceEnd", 0);
        setField(term204487, term204487.getClass(), "sourceName", null);
        setIntField(term204487, term204487.getClass(), "baseLineno", 0);
        setIntField(term204487, term204487.getClass(), "endLineno", 0);
        setField(term204487, term204487.getClass(), "functions", null);
        setField(term204487, term204487.getClass(), "regexps", null);
        setField(term204487, term204487.getClass(), "itsVariables", null);
        setField(term204487, term204487.getClass(), "itsConst", null);
        setField(term204487, term204487.getClass(), "itsVariableNames", null);
        setIntField(term204487, term204487.getClass(), "varStart", 0);
        setField(term204487, term204487.getClass(), "compilerData", null);
        setIntField(term204487, term204487.getClass(), "type", 115);
        setField(term204487, term204487.getClass(), "next", null);
        setField(term204487, term204487.getClass(), "first", null);
        setField(term204487, term204487.getClass(), "last", null);
        setField(term204487, term204487.getClass(), "propListHead", null);
        setIntField(term204487, term204487.getClass(), "sourcePosition", 0);
        setField(term204487, term204487.getClass(), "jsType", null);
        setField(term204487, term204487.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term204472;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term204472, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


