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

public class ReferenceCollectingCallback_isBlockBoundary_684698721922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235912;
     Object term236146;

    public ReferenceCollectingCallback_isBlockBoundary_684698721922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term235912, term235912.getClass(), "type", 77);
        term236146 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term236146, term236146.getClass(), "functionName", null);
        setBooleanField(term236146, term236146.getClass(), "itsNeedsActivation", false);
        setIntField(term236146, term236146.getClass(), "itsFunctionType", 0);
        setBooleanField(term236146, term236146.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term236146, term236146.getClass(), "encodedSourceStart", 0);
        setIntField(term236146, term236146.getClass(), "encodedSourceEnd", 0);
        setField(term236146, term236146.getClass(), "sourceName", null);
        setIntField(term236146, term236146.getClass(), "baseLineno", 0);
        setIntField(term236146, term236146.getClass(), "endLineno", 0);
        setField(term236146, term236146.getClass(), "functions", null);
        setField(term236146, term236146.getClass(), "regexps", null);
        setField(term236146, term236146.getClass(), "itsVariables", null);
        setField(term236146, term236146.getClass(), "itsConst", null);
        setField(term236146, term236146.getClass(), "itsVariableNames", null);
        setIntField(term236146, term236146.getClass(), "varStart", 0);
        setField(term236146, term236146.getClass(), "compilerData", null);
        setIntField(term236146, term236146.getClass(), "type", 77);
        setField(term236146, term236146.getClass(), "next", null);
        setField(term236146, term236146.getClass(), "first", null);
        setField(term236146, term236146.getClass(), "last", null);
        setField(term236146, term236146.getClass(), "propListHead", null);
        setIntField(term236146, term236146.getClass(), "sourcePosition", 0);
        setField(term236146, term236146.getClass(), "jsType", null);
        setField(term236146, term236146.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term235912;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term235912, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


