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

public class ReferenceCollectingCallback_isBlockBoundary_684698721781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202741;
     Object term202760;

    public ReferenceCollectingCallback_isBlockBoundary_684698721781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term202741, term202741.getClass(), "type", 115);
        term202760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term202760, term202760.getClass(), "functionName", null);
        setBooleanField(term202760, term202760.getClass(), "itsNeedsActivation", false);
        setIntField(term202760, term202760.getClass(), "itsFunctionType", 0);
        setBooleanField(term202760, term202760.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term202760, term202760.getClass(), "encodedSourceStart", 0);
        setIntField(term202760, term202760.getClass(), "encodedSourceEnd", 0);
        setField(term202760, term202760.getClass(), "sourceName", null);
        setIntField(term202760, term202760.getClass(), "baseLineno", 0);
        setIntField(term202760, term202760.getClass(), "endLineno", 0);
        setField(term202760, term202760.getClass(), "functions", null);
        setField(term202760, term202760.getClass(), "regexps", null);
        setField(term202760, term202760.getClass(), "itsVariables", null);
        setField(term202760, term202760.getClass(), "itsConst", null);
        setField(term202760, term202760.getClass(), "itsVariableNames", null);
        setIntField(term202760, term202760.getClass(), "varStart", 0);
        setField(term202760, term202760.getClass(), "compilerData", null);
        setIntField(term202760, term202760.getClass(), "type", 115);
        setField(term202760, term202760.getClass(), "next", null);
        setField(term202760, term202760.getClass(), "first", null);
        setField(term202760, term202760.getClass(), "last", null);
        setField(term202760, term202760.getClass(), "propListHead", null);
        setIntField(term202760, term202760.getClass(), "sourcePosition", 0);
        setField(term202760, term202760.getClass(), "jsType", null);
        setField(term202760, term202760.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term202741;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term202741, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


