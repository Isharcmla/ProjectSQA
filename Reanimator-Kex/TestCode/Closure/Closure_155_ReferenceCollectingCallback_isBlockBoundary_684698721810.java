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

public class ReferenceCollectingCallback_isBlockBoundary_684698721810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207409;
     Object term207501;
     Object term208566;
     Object term208567;

    public ReferenceCollectingCallback_isBlockBoundary_684698721810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term207501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term207501, term207501.getClass(), "type", 12);
        term208566 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term208566, term208566.getClass(), "number", 0.0);
        setIntField(term208566, term208566.getClass(), "type", 12);
        setField(term208566, term208566.getClass(), "next", null);
        setField(term208566, term208566.getClass(), "first", null);
        setField(term208566, term208566.getClass(), "last", null);
        setField(term208566, term208566.getClass(), "propListHead", null);
        setIntField(term208566, term208566.getClass(), "sourcePosition", 0);
        setField(term208566, term208566.getClass(), "jsType", null);
        setField(term208566, term208566.getClass(), "parent", null);
        term208567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term208567, term208567.getClass(), "functionName", null);
        setBooleanField(term208567, term208567.getClass(), "itsNeedsActivation", false);
        setIntField(term208567, term208567.getClass(), "itsFunctionType", 0);
        setBooleanField(term208567, term208567.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term208567, term208567.getClass(), "encodedSourceStart", 0);
        setIntField(term208567, term208567.getClass(), "encodedSourceEnd", 0);
        setField(term208567, term208567.getClass(), "sourceName", null);
        setIntField(term208567, term208567.getClass(), "baseLineno", 0);
        setIntField(term208567, term208567.getClass(), "endLineno", 0);
        setField(term208567, term208567.getClass(), "functions", null);
        setField(term208567, term208567.getClass(), "regexps", null);
        setField(term208567, term208567.getClass(), "itsVariables", null);
        setField(term208567, term208567.getClass(), "itsConst", null);
        setField(term208567, term208567.getClass(), "itsVariableNames", null);
        setIntField(term208567, term208567.getClass(), "varStart", 0);
        setField(term208567, term208567.getClass(), "compilerData", null);
        setIntField(term208567, term208567.getClass(), "type", 0);
        setField(term208567, term208567.getClass(), "next", null);
        setField(term208567, term208567.getClass(), "first", null);
        setField(term208567, term208567.getClass(), "last", null);
        setField(term208567, term208567.getClass(), "propListHead", null);
        setIntField(term208567, term208567.getClass(), "sourcePosition", 0);
        setField(term208567, term208567.getClass(), "jsType", null);
        setField(term208567, term208567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term207409;
        args[1] = term207501;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term207409, term208566));
        assertTrue(recursiveEquals(term207501, term208567));
        assertTrue(recursiveEquals(retValue, false));
    }

};


