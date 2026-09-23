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

public class ReferenceCollectingCallback_isBlockBoundary_684698721744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194377;
     Object term194463;
     Object term194797;
     Object term194798;

    public ReferenceCollectingCallback_isBlockBoundary_684698721744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term194463 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term194463, term194463.getClass(), "type", 12);
        term194797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term194797, term194797.getClass(), "functionName", null);
        setBooleanField(term194797, term194797.getClass(), "itsNeedsActivation", false);
        setIntField(term194797, term194797.getClass(), "itsFunctionType", 0);
        setBooleanField(term194797, term194797.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term194797, term194797.getClass(), "encodedSourceStart", 0);
        setIntField(term194797, term194797.getClass(), "encodedSourceEnd", 0);
        setField(term194797, term194797.getClass(), "sourceName", null);
        setIntField(term194797, term194797.getClass(), "baseLineno", 0);
        setIntField(term194797, term194797.getClass(), "endLineno", 0);
        setField(term194797, term194797.getClass(), "functions", null);
        setField(term194797, term194797.getClass(), "regexps", null);
        setField(term194797, term194797.getClass(), "itsVariables", null);
        setField(term194797, term194797.getClass(), "itsConst", null);
        setField(term194797, term194797.getClass(), "itsVariableNames", null);
        setIntField(term194797, term194797.getClass(), "varStart", 0);
        setField(term194797, term194797.getClass(), "compilerData", null);
        setIntField(term194797, term194797.getClass(), "type", 12);
        setField(term194797, term194797.getClass(), "next", null);
        setField(term194797, term194797.getClass(), "first", null);
        setField(term194797, term194797.getClass(), "last", null);
        setField(term194797, term194797.getClass(), "propListHead", null);
        setIntField(term194797, term194797.getClass(), "sourcePosition", 0);
        setField(term194797, term194797.getClass(), "jsType", null);
        setField(term194797, term194797.getClass(), "parent", null);
        term194798 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term194798, term194798.getClass(), "functionName", null);
        setBooleanField(term194798, term194798.getClass(), "itsNeedsActivation", false);
        setIntField(term194798, term194798.getClass(), "itsFunctionType", 0);
        setBooleanField(term194798, term194798.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term194798, term194798.getClass(), "encodedSourceStart", 0);
        setIntField(term194798, term194798.getClass(), "encodedSourceEnd", 0);
        setField(term194798, term194798.getClass(), "sourceName", null);
        setIntField(term194798, term194798.getClass(), "baseLineno", 0);
        setIntField(term194798, term194798.getClass(), "endLineno", 0);
        setField(term194798, term194798.getClass(), "functions", null);
        setField(term194798, term194798.getClass(), "regexps", null);
        setField(term194798, term194798.getClass(), "itsVariables", null);
        setField(term194798, term194798.getClass(), "itsConst", null);
        setField(term194798, term194798.getClass(), "itsVariableNames", null);
        setIntField(term194798, term194798.getClass(), "varStart", 0);
        setField(term194798, term194798.getClass(), "compilerData", null);
        setIntField(term194798, term194798.getClass(), "type", 0);
        setField(term194798, term194798.getClass(), "next", null);
        setField(term194798, term194798.getClass(), "first", null);
        setField(term194798, term194798.getClass(), "last", null);
        setField(term194798, term194798.getClass(), "propListHead", null);
        setIntField(term194798, term194798.getClass(), "sourcePosition", 0);
        setField(term194798, term194798.getClass(), "jsType", null);
        setField(term194798, term194798.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term194377;
        args[1] = term194463;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term194377, term194797));
        assertTrue(recursiveEquals(term194463, term194798));
        assertTrue(recursiveEquals(retValue, false));
    }

};


