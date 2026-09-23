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

public class ReferenceCollectingCallback_isBlockBoundary_684698721717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189720;
     Object term189735;

    public ReferenceCollectingCallback_isBlockBoundary_684698721717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189720 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term189720, term189720.getClass(), "type", 119);
        term189735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term189735, term189735.getClass(), "functionName", null);
        setBooleanField(term189735, term189735.getClass(), "itsNeedsActivation", false);
        setIntField(term189735, term189735.getClass(), "itsFunctionType", 0);
        setBooleanField(term189735, term189735.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term189735, term189735.getClass(), "encodedSourceStart", 0);
        setIntField(term189735, term189735.getClass(), "encodedSourceEnd", 0);
        setField(term189735, term189735.getClass(), "sourceName", null);
        setIntField(term189735, term189735.getClass(), "baseLineno", 0);
        setIntField(term189735, term189735.getClass(), "endLineno", 0);
        setField(term189735, term189735.getClass(), "functions", null);
        setField(term189735, term189735.getClass(), "regexps", null);
        setField(term189735, term189735.getClass(), "itsVariables", null);
        setField(term189735, term189735.getClass(), "itsConst", null);
        setField(term189735, term189735.getClass(), "itsVariableNames", null);
        setIntField(term189735, term189735.getClass(), "varStart", 0);
        setField(term189735, term189735.getClass(), "compilerData", null);
        setIntField(term189735, term189735.getClass(), "type", 119);
        setField(term189735, term189735.getClass(), "next", null);
        setField(term189735, term189735.getClass(), "first", null);
        setField(term189735, term189735.getClass(), "last", null);
        setField(term189735, term189735.getClass(), "propListHead", null);
        setIntField(term189735, term189735.getClass(), "sourcePosition", 0);
        setField(term189735, term189735.getClass(), "jsType", null);
        setField(term189735, term189735.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term189720;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term189720, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


