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

public class ReferenceCollectingCallback_shouldTraverse_4228556841196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321011;
     Object term321097;
     Object term321535;
     Object term321536;

    public ReferenceCollectingCallback_shouldTraverse_4228556841196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321011 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term321097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term321535 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term321535, term321535.getClass(), "referenceMap", null);
        setField(term321535, term321535.getClass(), "blockStack", null);
        setField(term321535, term321535.getClass(), "behavior", null);
        setField(term321535, term321535.getClass(), "compiler", null);
        setField(term321535, term321535.getClass(), "varFilter", null);
        term321536 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term321536, term321536.getClass(), "functionName", null);
        setBooleanField(term321536, term321536.getClass(), "itsNeedsActivation", false);
        setIntField(term321536, term321536.getClass(), "itsFunctionType", 0);
        setBooleanField(term321536, term321536.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term321536, term321536.getClass(), "encodedSourceStart", 0);
        setIntField(term321536, term321536.getClass(), "encodedSourceEnd", 0);
        setField(term321536, term321536.getClass(), "sourceName", null);
        setIntField(term321536, term321536.getClass(), "baseLineno", 0);
        setIntField(term321536, term321536.getClass(), "endLineno", 0);
        setField(term321536, term321536.getClass(), "functions", null);
        setField(term321536, term321536.getClass(), "regexps", null);
        setField(term321536, term321536.getClass(), "itsVariables", null);
        setField(term321536, term321536.getClass(), "itsConst", null);
        setField(term321536, term321536.getClass(), "itsVariableNames", null);
        setIntField(term321536, term321536.getClass(), "varStart", 0);
        setField(term321536, term321536.getClass(), "compilerData", null);
        setIntField(term321536, term321536.getClass(), "type", 0);
        setField(term321536, term321536.getClass(), "next", null);
        setField(term321536, term321536.getClass(), "first", null);
        setField(term321536, term321536.getClass(), "last", null);
        setField(term321536, term321536.getClass(), "propListHead", null);
        setIntField(term321536, term321536.getClass(), "sourcePosition", 0);
        setField(term321536, term321536.getClass(), "jsType", null);
        setField(term321536, term321536.getClass(), "parent", null);
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
        args[1] = term321097;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term321011, args);
        assertTrue(recursiveEquals(term321011, term321535));
        assertTrue(recursiveEquals(term321097, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


