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

public class ReferenceCollectingCallback_shouldTraverse_4228556841243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374865;
     Object term374951;
     Object term375409;
     Object term375410;

    public ReferenceCollectingCallback_shouldTraverse_4228556841243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374865 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term374951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term375409 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term375409, term375409.getClass(), "referenceMap", null);
        setField(term375409, term375409.getClass(), "blockStack", null);
        setField(term375409, term375409.getClass(), "behavior", null);
        setField(term375409, term375409.getClass(), "compiler", null);
        setField(term375409, term375409.getClass(), "varFilter", null);
        term375410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term375410, term375410.getClass(), "functionName", null);
        setBooleanField(term375410, term375410.getClass(), "itsNeedsActivation", false);
        setIntField(term375410, term375410.getClass(), "itsFunctionType", 0);
        setBooleanField(term375410, term375410.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term375410, term375410.getClass(), "encodedSourceStart", 0);
        setIntField(term375410, term375410.getClass(), "encodedSourceEnd", 0);
        setField(term375410, term375410.getClass(), "sourceName", null);
        setIntField(term375410, term375410.getClass(), "baseLineno", 0);
        setIntField(term375410, term375410.getClass(), "endLineno", 0);
        setField(term375410, term375410.getClass(), "functions", null);
        setField(term375410, term375410.getClass(), "regexps", null);
        setField(term375410, term375410.getClass(), "itsVariables", null);
        setField(term375410, term375410.getClass(), "itsConst", null);
        setField(term375410, term375410.getClass(), "itsVariableNames", null);
        setIntField(term375410, term375410.getClass(), "varStart", 0);
        setField(term375410, term375410.getClass(), "compilerData", null);
        setIntField(term375410, term375410.getClass(), "type", 0);
        setField(term375410, term375410.getClass(), "next", null);
        setField(term375410, term375410.getClass(), "first", null);
        setField(term375410, term375410.getClass(), "last", null);
        setField(term375410, term375410.getClass(), "propListHead", null);
        setIntField(term375410, term375410.getClass(), "sourcePosition", 0);
        setField(term375410, term375410.getClass(), "jsType", null);
        setField(term375410, term375410.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term374951;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term374865, args);
        assertTrue(recursiveEquals(term374865, term375409));
        assertTrue(recursiveEquals(term374951, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


