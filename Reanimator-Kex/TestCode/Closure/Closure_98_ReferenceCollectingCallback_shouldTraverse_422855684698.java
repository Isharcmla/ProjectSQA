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

public class ReferenceCollectingCallback_shouldTraverse_422855684698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184452;
     Object term184538;
     Object term184624;
     Object term184659;
     Object term184660;
     Object term184661;

    public ReferenceCollectingCallback_shouldTraverse_422855684698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184452 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term184538 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term184624 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term184624, term184624.getClass(), "type", 4);
        term184659 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term184659, term184659.getClass(), "referenceMap", null);
        setField(term184659, term184659.getClass(), "blockStack", null);
        setField(term184659, term184659.getClass(), "behavior", null);
        setField(term184659, term184659.getClass(), "compiler", null);
        setField(term184659, term184659.getClass(), "varFilter", null);
        term184660 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term184660, term184660.getClass(), "functionName", null);
        setBooleanField(term184660, term184660.getClass(), "itsNeedsActivation", false);
        setIntField(term184660, term184660.getClass(), "itsFunctionType", 0);
        setBooleanField(term184660, term184660.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term184660, term184660.getClass(), "encodedSourceStart", 0);
        setIntField(term184660, term184660.getClass(), "encodedSourceEnd", 0);
        setField(term184660, term184660.getClass(), "sourceName", null);
        setIntField(term184660, term184660.getClass(), "baseLineno", 0);
        setIntField(term184660, term184660.getClass(), "endLineno", 0);
        setField(term184660, term184660.getClass(), "functions", null);
        setField(term184660, term184660.getClass(), "regexps", null);
        setField(term184660, term184660.getClass(), "itsVariables", null);
        setField(term184660, term184660.getClass(), "itsConst", null);
        setField(term184660, term184660.getClass(), "itsVariableNames", null);
        setIntField(term184660, term184660.getClass(), "varStart", 0);
        setField(term184660, term184660.getClass(), "compilerData", null);
        setIntField(term184660, term184660.getClass(), "type", 4);
        setField(term184660, term184660.getClass(), "next", null);
        setField(term184660, term184660.getClass(), "first", null);
        setField(term184660, term184660.getClass(), "last", null);
        setField(term184660, term184660.getClass(), "propListHead", null);
        setIntField(term184660, term184660.getClass(), "sourcePosition", 0);
        setField(term184660, term184660.getClass(), "jsType", null);
        setField(term184660, term184660.getClass(), "parent", null);
        term184661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term184661, term184661.getClass(), "functionName", null);
        setBooleanField(term184661, term184661.getClass(), "itsNeedsActivation", false);
        setIntField(term184661, term184661.getClass(), "itsFunctionType", 0);
        setBooleanField(term184661, term184661.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term184661, term184661.getClass(), "encodedSourceStart", 0);
        setIntField(term184661, term184661.getClass(), "encodedSourceEnd", 0);
        setField(term184661, term184661.getClass(), "sourceName", null);
        setIntField(term184661, term184661.getClass(), "baseLineno", 0);
        setIntField(term184661, term184661.getClass(), "endLineno", 0);
        setField(term184661, term184661.getClass(), "functions", null);
        setField(term184661, term184661.getClass(), "regexps", null);
        setField(term184661, term184661.getClass(), "itsVariables", null);
        setField(term184661, term184661.getClass(), "itsConst", null);
        setField(term184661, term184661.getClass(), "itsVariableNames", null);
        setIntField(term184661, term184661.getClass(), "varStart", 0);
        setField(term184661, term184661.getClass(), "compilerData", null);
        setIntField(term184661, term184661.getClass(), "type", 0);
        setField(term184661, term184661.getClass(), "next", null);
        setField(term184661, term184661.getClass(), "first", null);
        setField(term184661, term184661.getClass(), "last", null);
        setField(term184661, term184661.getClass(), "propListHead", null);
        setIntField(term184661, term184661.getClass(), "sourcePosition", 0);
        setField(term184661, term184661.getClass(), "jsType", null);
        setField(term184661, term184661.getClass(), "parent", null);
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
        args[1] = term184538;
        args[2] = term184624;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term184452, args);
        assertTrue(recursiveEquals(term184452, term184659));
        assertTrue(recursiveEquals(term184538, term184661));
        assertTrue(recursiveEquals(term184624, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


