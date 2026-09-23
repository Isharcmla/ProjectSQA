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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463737;
     Object term463755;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463737 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term463737, term463737.getClass(), "type", 108);
        term463755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term463755, term463755.getClass(), "functionName", null);
        setBooleanField(term463755, term463755.getClass(), "itsNeedsActivation", false);
        setIntField(term463755, term463755.getClass(), "itsFunctionType", 0);
        setBooleanField(term463755, term463755.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term463755, term463755.getClass(), "encodedSourceStart", 0);
        setIntField(term463755, term463755.getClass(), "encodedSourceEnd", 0);
        setField(term463755, term463755.getClass(), "sourceName", null);
        setIntField(term463755, term463755.getClass(), "baseLineno", 0);
        setIntField(term463755, term463755.getClass(), "endLineno", 0);
        setField(term463755, term463755.getClass(), "functions", null);
        setField(term463755, term463755.getClass(), "regexps", null);
        setField(term463755, term463755.getClass(), "itsVariables", null);
        setField(term463755, term463755.getClass(), "itsConst", null);
        setField(term463755, term463755.getClass(), "itsVariableNames", null);
        setIntField(term463755, term463755.getClass(), "varStart", 0);
        setField(term463755, term463755.getClass(), "compilerData", null);
        setIntField(term463755, term463755.getClass(), "type", 108);
        setField(term463755, term463755.getClass(), "next", null);
        setField(term463755, term463755.getClass(), "first", null);
        setField(term463755, term463755.getClass(), "last", null);
        setField(term463755, term463755.getClass(), "propListHead", null);
        setIntField(term463755, term463755.getClass(), "sourcePosition", 0);
        setField(term463755, term463755.getClass(), "jsType", null);
        setField(term463755, term463755.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term463737;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term463737, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


