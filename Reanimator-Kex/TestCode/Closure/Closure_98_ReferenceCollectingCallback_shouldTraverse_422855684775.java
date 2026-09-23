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

public class ReferenceCollectingCallback_shouldTraverse_422855684775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206986;
     Object term207072;
     Object term207164;
     Object term207215;
     Object term207216;
     Object term207217;

    public ReferenceCollectingCallback_shouldTraverse_422855684775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206986 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term207072 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term207164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term207164, term207164.getClass(), "type", 12);
        term207215 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term207215, term207215.getClass(), "referenceMap", null);
        setField(term207215, term207215.getClass(), "blockStack", null);
        setField(term207215, term207215.getClass(), "behavior", null);
        setField(term207215, term207215.getClass(), "compiler", null);
        setField(term207215, term207215.getClass(), "varFilter", null);
        term207216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term207216, term207216.getClass(), "str", null);
        setIntField(term207216, term207216.getClass(), "type", 12);
        setField(term207216, term207216.getClass(), "next", null);
        setField(term207216, term207216.getClass(), "first", null);
        setField(term207216, term207216.getClass(), "last", null);
        setField(term207216, term207216.getClass(), "propListHead", null);
        setIntField(term207216, term207216.getClass(), "sourcePosition", 0);
        setField(term207216, term207216.getClass(), "jsType", null);
        setField(term207216, term207216.getClass(), "parent", null);
        term207217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term207217, term207217.getClass(), "functionName", null);
        setBooleanField(term207217, term207217.getClass(), "itsNeedsActivation", false);
        setIntField(term207217, term207217.getClass(), "itsFunctionType", 0);
        setBooleanField(term207217, term207217.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term207217, term207217.getClass(), "encodedSourceStart", 0);
        setIntField(term207217, term207217.getClass(), "encodedSourceEnd", 0);
        setField(term207217, term207217.getClass(), "sourceName", null);
        setIntField(term207217, term207217.getClass(), "baseLineno", 0);
        setIntField(term207217, term207217.getClass(), "endLineno", 0);
        setField(term207217, term207217.getClass(), "functions", null);
        setField(term207217, term207217.getClass(), "regexps", null);
        setField(term207217, term207217.getClass(), "itsVariables", null);
        setField(term207217, term207217.getClass(), "itsConst", null);
        setField(term207217, term207217.getClass(), "itsVariableNames", null);
        setIntField(term207217, term207217.getClass(), "varStart", 0);
        setField(term207217, term207217.getClass(), "compilerData", null);
        setIntField(term207217, term207217.getClass(), "type", 0);
        setField(term207217, term207217.getClass(), "next", null);
        setField(term207217, term207217.getClass(), "first", null);
        setField(term207217, term207217.getClass(), "last", null);
        setField(term207217, term207217.getClass(), "propListHead", null);
        setIntField(term207217, term207217.getClass(), "sourcePosition", 0);
        setField(term207217, term207217.getClass(), "jsType", null);
        setField(term207217, term207217.getClass(), "parent", null);
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
        args[1] = term207072;
        args[2] = term207164;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term206986, args);
        assertTrue(recursiveEquals(term206986, term207215));
        assertTrue(recursiveEquals(term207072, term207217));
        assertTrue(recursiveEquals(term207164, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


