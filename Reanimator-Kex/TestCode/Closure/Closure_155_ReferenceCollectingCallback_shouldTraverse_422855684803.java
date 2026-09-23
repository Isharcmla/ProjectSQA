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

public class ReferenceCollectingCallback_shouldTraverse_422855684803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206756;
     Object term206842;
     Object term207193;
     Object term207194;

    public ReferenceCollectingCallback_shouldTraverse_422855684803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206756 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term206842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term207193 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term207193, term207193.getClass(), "referenceMap", null);
        setField(term207193, term207193.getClass(), "blockStack", null);
        setField(term207193, term207193.getClass(), "behavior", null);
        setField(term207193, term207193.getClass(), "compiler", null);
        setField(term207193, term207193.getClass(), "varFilter", null);
        term207194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term207194, term207194.getClass(), "functionName", null);
        setBooleanField(term207194, term207194.getClass(), "itsNeedsActivation", false);
        setIntField(term207194, term207194.getClass(), "itsFunctionType", 0);
        setBooleanField(term207194, term207194.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term207194, term207194.getClass(), "encodedSourceStart", 0);
        setIntField(term207194, term207194.getClass(), "encodedSourceEnd", 0);
        setField(term207194, term207194.getClass(), "sourceName", null);
        setIntField(term207194, term207194.getClass(), "baseLineno", 0);
        setIntField(term207194, term207194.getClass(), "endLineno", 0);
        setField(term207194, term207194.getClass(), "functions", null);
        setField(term207194, term207194.getClass(), "regexps", null);
        setField(term207194, term207194.getClass(), "itsVariables", null);
        setField(term207194, term207194.getClass(), "itsConst", null);
        setField(term207194, term207194.getClass(), "itsVariableNames", null);
        setIntField(term207194, term207194.getClass(), "varStart", 0);
        setField(term207194, term207194.getClass(), "compilerData", null);
        setIntField(term207194, term207194.getClass(), "type", 0);
        setField(term207194, term207194.getClass(), "next", null);
        setField(term207194, term207194.getClass(), "first", null);
        setField(term207194, term207194.getClass(), "last", null);
        setField(term207194, term207194.getClass(), "propListHead", null);
        setIntField(term207194, term207194.getClass(), "sourcePosition", 0);
        setField(term207194, term207194.getClass(), "jsType", null);
        setField(term207194, term207194.getClass(), "parent", null);
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
        args[1] = term206842;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term206756, args);
        assertTrue(recursiveEquals(term206756, term207193));
        assertTrue(recursiveEquals(term206842, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


