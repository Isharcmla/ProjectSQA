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

public class ReferenceCollectingCallback_shouldTraverse_422855684680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181389;
     Object term181475;
     Object term181766;
     Object term181767;

    public ReferenceCollectingCallback_shouldTraverse_422855684680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181389 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term181475 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term181475, term181475.getClass(), "type", 100);
        term181766 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term181766, term181766.getClass(), "referenceMap", null);
        setField(term181766, term181766.getClass(), "blockStack", null);
        setField(term181766, term181766.getClass(), "behavior", null);
        setField(term181766, term181766.getClass(), "compiler", null);
        setField(term181766, term181766.getClass(), "varFilter", null);
        term181767 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term181767, term181767.getClass(), "functionName", null);
        setBooleanField(term181767, term181767.getClass(), "itsNeedsActivation", false);
        setIntField(term181767, term181767.getClass(), "itsFunctionType", 0);
        setBooleanField(term181767, term181767.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term181767, term181767.getClass(), "encodedSourceStart", 0);
        setIntField(term181767, term181767.getClass(), "encodedSourceEnd", 0);
        setField(term181767, term181767.getClass(), "sourceName", null);
        setIntField(term181767, term181767.getClass(), "baseLineno", 0);
        setIntField(term181767, term181767.getClass(), "endLineno", 0);
        setField(term181767, term181767.getClass(), "functions", null);
        setField(term181767, term181767.getClass(), "regexps", null);
        setField(term181767, term181767.getClass(), "itsVariables", null);
        setField(term181767, term181767.getClass(), "itsConst", null);
        setField(term181767, term181767.getClass(), "itsVariableNames", null);
        setIntField(term181767, term181767.getClass(), "varStart", 0);
        setField(term181767, term181767.getClass(), "compilerData", null);
        setIntField(term181767, term181767.getClass(), "type", 100);
        setField(term181767, term181767.getClass(), "next", null);
        setField(term181767, term181767.getClass(), "first", null);
        setField(term181767, term181767.getClass(), "last", null);
        setField(term181767, term181767.getClass(), "propListHead", null);
        setIntField(term181767, term181767.getClass(), "sourcePosition", 0);
        setField(term181767, term181767.getClass(), "jsType", null);
        setField(term181767, term181767.getClass(), "parent", null);
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
        args[2] = term181475;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term181389, args);
        assertTrue(recursiveEquals(term181389, term181766));
        assertTrue(recursiveEquals(term181475, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


