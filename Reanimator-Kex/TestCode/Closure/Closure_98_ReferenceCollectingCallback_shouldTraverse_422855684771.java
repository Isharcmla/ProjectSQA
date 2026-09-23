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

public class ReferenceCollectingCallback_shouldTraverse_422855684771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206325;
     Object term206417;
     Object term206503;
     Object term206527;
     Object term206528;
     Object term206529;

    public ReferenceCollectingCallback_shouldTraverse_422855684771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206325 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term206417 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term206503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term206503, term206503.getClass(), "type", 12);
        term206527 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term206527, term206527.getClass(), "referenceMap", null);
        setField(term206527, term206527.getClass(), "blockStack", null);
        setField(term206527, term206527.getClass(), "behavior", null);
        setField(term206527, term206527.getClass(), "compiler", null);
        setField(term206527, term206527.getClass(), "varFilter", null);
        term206528 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term206528, term206528.getClass(), "functionName", null);
        setBooleanField(term206528, term206528.getClass(), "itsNeedsActivation", false);
        setIntField(term206528, term206528.getClass(), "itsFunctionType", 0);
        setBooleanField(term206528, term206528.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term206528, term206528.getClass(), "encodedSourceStart", 0);
        setIntField(term206528, term206528.getClass(), "encodedSourceEnd", 0);
        setField(term206528, term206528.getClass(), "sourceName", null);
        setIntField(term206528, term206528.getClass(), "baseLineno", 0);
        setIntField(term206528, term206528.getClass(), "endLineno", 0);
        setField(term206528, term206528.getClass(), "functions", null);
        setField(term206528, term206528.getClass(), "regexps", null);
        setField(term206528, term206528.getClass(), "itsVariables", null);
        setField(term206528, term206528.getClass(), "itsConst", null);
        setField(term206528, term206528.getClass(), "itsVariableNames", null);
        setIntField(term206528, term206528.getClass(), "varStart", 0);
        setField(term206528, term206528.getClass(), "compilerData", null);
        setIntField(term206528, term206528.getClass(), "type", 12);
        setField(term206528, term206528.getClass(), "next", null);
        setField(term206528, term206528.getClass(), "first", null);
        setField(term206528, term206528.getClass(), "last", null);
        setField(term206528, term206528.getClass(), "propListHead", null);
        setIntField(term206528, term206528.getClass(), "sourcePosition", 0);
        setField(term206528, term206528.getClass(), "jsType", null);
        setField(term206528, term206528.getClass(), "parent", null);
        term206529 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term206529, term206529.getClass(), "number", 0.0);
        setIntField(term206529, term206529.getClass(), "type", 0);
        setField(term206529, term206529.getClass(), "next", null);
        setField(term206529, term206529.getClass(), "first", null);
        setField(term206529, term206529.getClass(), "last", null);
        setField(term206529, term206529.getClass(), "propListHead", null);
        setIntField(term206529, term206529.getClass(), "sourcePosition", 0);
        setField(term206529, term206529.getClass(), "jsType", null);
        setField(term206529, term206529.getClass(), "parent", null);
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
        args[1] = term206417;
        args[2] = term206503;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term206325, args);
        assertTrue(recursiveEquals(term206325, term206527));
        assertTrue(recursiveEquals(term206417, term206529));
        assertTrue(recursiveEquals(term206503, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


