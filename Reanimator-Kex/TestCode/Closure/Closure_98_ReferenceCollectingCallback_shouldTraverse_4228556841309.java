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

public class ReferenceCollectingCallback_shouldTraverse_4228556841309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399153;
     Object term399239;
     Object term399905;
     Object term399906;

    public ReferenceCollectingCallback_shouldTraverse_4228556841309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399153 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term399239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term399905 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term399905, term399905.getClass(), "referenceMap", null);
        setField(term399905, term399905.getClass(), "blockStack", null);
        setField(term399905, term399905.getClass(), "behavior", null);
        setField(term399905, term399905.getClass(), "compiler", null);
        setField(term399905, term399905.getClass(), "varFilter", null);
        term399906 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term399906, term399906.getClass(), "functionName", null);
        setBooleanField(term399906, term399906.getClass(), "itsNeedsActivation", false);
        setIntField(term399906, term399906.getClass(), "itsFunctionType", 0);
        setBooleanField(term399906, term399906.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term399906, term399906.getClass(), "encodedSourceStart", 0);
        setIntField(term399906, term399906.getClass(), "encodedSourceEnd", 0);
        setField(term399906, term399906.getClass(), "sourceName", null);
        setIntField(term399906, term399906.getClass(), "baseLineno", 0);
        setIntField(term399906, term399906.getClass(), "endLineno", 0);
        setField(term399906, term399906.getClass(), "functions", null);
        setField(term399906, term399906.getClass(), "regexps", null);
        setField(term399906, term399906.getClass(), "itsVariables", null);
        setField(term399906, term399906.getClass(), "itsConst", null);
        setField(term399906, term399906.getClass(), "itsVariableNames", null);
        setIntField(term399906, term399906.getClass(), "varStart", 0);
        setField(term399906, term399906.getClass(), "compilerData", null);
        setIntField(term399906, term399906.getClass(), "type", 0);
        setField(term399906, term399906.getClass(), "next", null);
        setField(term399906, term399906.getClass(), "first", null);
        setField(term399906, term399906.getClass(), "last", null);
        setField(term399906, term399906.getClass(), "propListHead", null);
        setIntField(term399906, term399906.getClass(), "sourcePosition", 0);
        setField(term399906, term399906.getClass(), "jsType", null);
        setField(term399906, term399906.getClass(), "parent", null);
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
        args[1] = term399239;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term399153, args);
        assertTrue(recursiveEquals(term399153, term399905));
        assertTrue(recursiveEquals(term399239, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


