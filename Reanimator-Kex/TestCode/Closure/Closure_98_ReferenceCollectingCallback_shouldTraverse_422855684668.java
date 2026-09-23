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

public class ReferenceCollectingCallback_shouldTraverse_422855684668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179945;
     Object term180031;
     Object term180091;
     Object term180092;

    public ReferenceCollectingCallback_shouldTraverse_422855684668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179945 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term180031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term180031, term180031.getClass(), "type", 98);
        term180091 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term180091, term180091.getClass(), "referenceMap", null);
        setField(term180091, term180091.getClass(), "blockStack", null);
        setField(term180091, term180091.getClass(), "behavior", null);
        setField(term180091, term180091.getClass(), "compiler", null);
        setField(term180091, term180091.getClass(), "varFilter", null);
        term180092 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180092, term180092.getClass(), "functionName", null);
        setBooleanField(term180092, term180092.getClass(), "itsNeedsActivation", false);
        setIntField(term180092, term180092.getClass(), "itsFunctionType", 0);
        setBooleanField(term180092, term180092.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180092, term180092.getClass(), "encodedSourceStart", 0);
        setIntField(term180092, term180092.getClass(), "encodedSourceEnd", 0);
        setField(term180092, term180092.getClass(), "sourceName", null);
        setIntField(term180092, term180092.getClass(), "baseLineno", 0);
        setIntField(term180092, term180092.getClass(), "endLineno", 0);
        setField(term180092, term180092.getClass(), "functions", null);
        setField(term180092, term180092.getClass(), "regexps", null);
        setField(term180092, term180092.getClass(), "itsVariables", null);
        setField(term180092, term180092.getClass(), "itsConst", null);
        setField(term180092, term180092.getClass(), "itsVariableNames", null);
        setIntField(term180092, term180092.getClass(), "varStart", 0);
        setField(term180092, term180092.getClass(), "compilerData", null);
        setIntField(term180092, term180092.getClass(), "type", 98);
        setField(term180092, term180092.getClass(), "next", null);
        setField(term180092, term180092.getClass(), "first", null);
        setField(term180092, term180092.getClass(), "last", null);
        setField(term180092, term180092.getClass(), "propListHead", null);
        setIntField(term180092, term180092.getClass(), "sourcePosition", 0);
        setField(term180092, term180092.getClass(), "jsType", null);
        setField(term180092, term180092.getClass(), "parent", null);
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
        args[2] = term180031;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term179945, args);
        assertTrue(recursiveEquals(term179945, term180091));
        assertTrue(recursiveEquals(term180031, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


