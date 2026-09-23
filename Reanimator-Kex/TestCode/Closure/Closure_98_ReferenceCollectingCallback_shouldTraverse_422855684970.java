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

public class ReferenceCollectingCallback_shouldTraverse_422855684970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262472;
     Object term262558;
     Object term262650;
     Object term263231;
     Object term263232;
     Object term263233;

    public ReferenceCollectingCallback_shouldTraverse_422855684970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262472 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term262558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term262650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term262650, term262650.getClass(), "type", 4);
        term263231 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term263231, term263231.getClass(), "referenceMap", null);
        setField(term263231, term263231.getClass(), "blockStack", null);
        setField(term263231, term263231.getClass(), "behavior", null);
        setField(term263231, term263231.getClass(), "compiler", null);
        setField(term263231, term263231.getClass(), "varFilter", null);
        term263232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term263232, term263232.getClass(), "number", 0.0);
        setIntField(term263232, term263232.getClass(), "type", 4);
        setField(term263232, term263232.getClass(), "next", null);
        setField(term263232, term263232.getClass(), "first", null);
        setField(term263232, term263232.getClass(), "last", null);
        setField(term263232, term263232.getClass(), "propListHead", null);
        setIntField(term263232, term263232.getClass(), "sourcePosition", 0);
        setField(term263232, term263232.getClass(), "jsType", null);
        setField(term263232, term263232.getClass(), "parent", null);
        term263233 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term263233, term263233.getClass(), "functionName", null);
        setBooleanField(term263233, term263233.getClass(), "itsNeedsActivation", false);
        setIntField(term263233, term263233.getClass(), "itsFunctionType", 0);
        setBooleanField(term263233, term263233.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term263233, term263233.getClass(), "encodedSourceStart", 0);
        setIntField(term263233, term263233.getClass(), "encodedSourceEnd", 0);
        setField(term263233, term263233.getClass(), "sourceName", null);
        setIntField(term263233, term263233.getClass(), "baseLineno", 0);
        setIntField(term263233, term263233.getClass(), "endLineno", 0);
        setField(term263233, term263233.getClass(), "functions", null);
        setField(term263233, term263233.getClass(), "regexps", null);
        setField(term263233, term263233.getClass(), "itsVariables", null);
        setField(term263233, term263233.getClass(), "itsConst", null);
        setField(term263233, term263233.getClass(), "itsVariableNames", null);
        setIntField(term263233, term263233.getClass(), "varStart", 0);
        setField(term263233, term263233.getClass(), "compilerData", null);
        setIntField(term263233, term263233.getClass(), "type", 0);
        setField(term263233, term263233.getClass(), "next", null);
        setField(term263233, term263233.getClass(), "first", null);
        setField(term263233, term263233.getClass(), "last", null);
        setField(term263233, term263233.getClass(), "propListHead", null);
        setIntField(term263233, term263233.getClass(), "sourcePosition", 0);
        setField(term263233, term263233.getClass(), "jsType", null);
        setField(term263233, term263233.getClass(), "parent", null);
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
        args[1] = term262558;
        args[2] = term262650;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term262472, args);
        assertTrue(recursiveEquals(term262472, term263231));
        assertTrue(recursiveEquals(term262558, term263233));
        assertTrue(recursiveEquals(term262650, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


