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

public class ReferenceCollectingCallback_shouldTraverse_422855684667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179726;
     Object term179812;
     Object term180070;
     Object term180071;

    public ReferenceCollectingCallback_shouldTraverse_422855684667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179726 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term179812 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term179812, term179812.getClass(), "type", 101);
        term180070 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180070, term180070.getClass(), "referenceMap", null);
        setField(term180070, term180070.getClass(), "blockStack", null);
        setField(term180070, term180070.getClass(), "behavior", null);
        setField(term180070, term180070.getClass(), "compiler", null);
        setField(term180070, term180070.getClass(), "varFilter", null);
        term180071 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180071, term180071.getClass(), "functionName", null);
        setBooleanField(term180071, term180071.getClass(), "itsNeedsActivation", false);
        setIntField(term180071, term180071.getClass(), "itsFunctionType", 0);
        setBooleanField(term180071, term180071.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180071, term180071.getClass(), "encodedSourceStart", 0);
        setIntField(term180071, term180071.getClass(), "encodedSourceEnd", 0);
        setField(term180071, term180071.getClass(), "sourceName", null);
        setIntField(term180071, term180071.getClass(), "baseLineno", 0);
        setIntField(term180071, term180071.getClass(), "endLineno", 0);
        setField(term180071, term180071.getClass(), "functions", null);
        setField(term180071, term180071.getClass(), "regexps", null);
        setField(term180071, term180071.getClass(), "itsVariables", null);
        setField(term180071, term180071.getClass(), "itsConst", null);
        setField(term180071, term180071.getClass(), "itsVariableNames", null);
        setIntField(term180071, term180071.getClass(), "varStart", 0);
        setField(term180071, term180071.getClass(), "compilerData", null);
        setIntField(term180071, term180071.getClass(), "type", 101);
        setField(term180071, term180071.getClass(), "next", null);
        setField(term180071, term180071.getClass(), "first", null);
        setField(term180071, term180071.getClass(), "last", null);
        setField(term180071, term180071.getClass(), "propListHead", null);
        setIntField(term180071, term180071.getClass(), "sourcePosition", 0);
        setField(term180071, term180071.getClass(), "jsType", null);
        setField(term180071, term180071.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term179812;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term179726, args);
        assertTrue(recursiveEquals(term179726, term180070));
        assertTrue(recursiveEquals(term179812, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


