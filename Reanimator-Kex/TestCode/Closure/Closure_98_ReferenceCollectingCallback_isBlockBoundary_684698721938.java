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

public class ReferenceCollectingCallback_isBlockBoundary_684698721938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252371;
     Object term253564;

    public ReferenceCollectingCallback_isBlockBoundary_684698721938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term252371, term252371.getClass(), "type", 100);
        term253564 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term253564, term253564.getClass(), "functionName", null);
        setBooleanField(term253564, term253564.getClass(), "itsNeedsActivation", false);
        setIntField(term253564, term253564.getClass(), "itsFunctionType", 0);
        setBooleanField(term253564, term253564.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253564, term253564.getClass(), "encodedSourceStart", 0);
        setIntField(term253564, term253564.getClass(), "encodedSourceEnd", 0);
        setField(term253564, term253564.getClass(), "sourceName", null);
        setIntField(term253564, term253564.getClass(), "baseLineno", 0);
        setIntField(term253564, term253564.getClass(), "endLineno", 0);
        setField(term253564, term253564.getClass(), "functions", null);
        setField(term253564, term253564.getClass(), "regexps", null);
        setField(term253564, term253564.getClass(), "itsVariables", null);
        setField(term253564, term253564.getClass(), "itsConst", null);
        setField(term253564, term253564.getClass(), "itsVariableNames", null);
        setIntField(term253564, term253564.getClass(), "varStart", 0);
        setField(term253564, term253564.getClass(), "compilerData", null);
        setIntField(term253564, term253564.getClass(), "type", 100);
        setField(term253564, term253564.getClass(), "next", null);
        setField(term253564, term253564.getClass(), "first", null);
        setField(term253564, term253564.getClass(), "last", null);
        setField(term253564, term253564.getClass(), "propListHead", null);
        setIntField(term253564, term253564.getClass(), "sourcePosition", 0);
        setField(term253564, term253564.getClass(), "jsType", null);
        setField(term253564, term253564.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term252371;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term252371, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


