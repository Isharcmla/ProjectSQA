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

public class ReferenceCollectingCallback_isBlockBoundary_684698721904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241736;
     Object term242105;

    public ReferenceCollectingCallback_isBlockBoundary_684698721904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241736 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term241736, term241736.getClass(), "type", 114);
        term242105 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term242105, term242105.getClass(), "functionName", null);
        setBooleanField(term242105, term242105.getClass(), "itsNeedsActivation", false);
        setIntField(term242105, term242105.getClass(), "itsFunctionType", 0);
        setBooleanField(term242105, term242105.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term242105, term242105.getClass(), "encodedSourceStart", 0);
        setIntField(term242105, term242105.getClass(), "encodedSourceEnd", 0);
        setField(term242105, term242105.getClass(), "sourceName", null);
        setIntField(term242105, term242105.getClass(), "baseLineno", 0);
        setIntField(term242105, term242105.getClass(), "endLineno", 0);
        setField(term242105, term242105.getClass(), "functions", null);
        setField(term242105, term242105.getClass(), "regexps", null);
        setField(term242105, term242105.getClass(), "itsVariables", null);
        setField(term242105, term242105.getClass(), "itsConst", null);
        setField(term242105, term242105.getClass(), "itsVariableNames", null);
        setIntField(term242105, term242105.getClass(), "varStart", 0);
        setField(term242105, term242105.getClass(), "compilerData", null);
        setIntField(term242105, term242105.getClass(), "type", 114);
        setField(term242105, term242105.getClass(), "next", null);
        setField(term242105, term242105.getClass(), "first", null);
        setField(term242105, term242105.getClass(), "last", null);
        setField(term242105, term242105.getClass(), "propListHead", null);
        setIntField(term242105, term242105.getClass(), "sourcePosition", 0);
        setField(term242105, term242105.getClass(), "jsType", null);
        setField(term242105, term242105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term241736;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term241736, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


