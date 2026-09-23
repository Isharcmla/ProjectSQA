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
import java.lang.Object;

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154848;
     Object term154940;
     Object term155152;
     Object term155153;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154848 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term154940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term154940, term154940.getClass(), "first", term155026);
        term155152 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term155152, term155152.getClass(), "propertyTestFunctions", null);
        term155153 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155154 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155153, term155153.getClass(), "str", null);
        setIntField(term155153, term155153.getClass(), "type", 0);
        setField(term155153, term155153.getClass(), "next", null);
        setField(term155154, term155154.getClass(), "functionName", null);
        setBooleanField(term155154, term155154.getClass(), "itsNeedsActivation", false);
        setIntField(term155154, term155154.getClass(), "itsFunctionType", 0);
        setBooleanField(term155154, term155154.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155154, term155154.getClass(), "encodedSourceStart", 0);
        setIntField(term155154, term155154.getClass(), "encodedSourceEnd", 0);
        setField(term155154, term155154.getClass(), "sourceName", null);
        setIntField(term155154, term155154.getClass(), "baseLineno", 0);
        setIntField(term155154, term155154.getClass(), "endLineno", 0);
        setField(term155154, term155154.getClass(), "functions", null);
        setField(term155154, term155154.getClass(), "regexps", null);
        setField(term155154, term155154.getClass(), "itsVariables", null);
        setField(term155154, term155154.getClass(), "itsConst", null);
        setField(term155154, term155154.getClass(), "itsVariableNames", null);
        setIntField(term155154, term155154.getClass(), "varStart", 0);
        setField(term155154, term155154.getClass(), "compilerData", null);
        setIntField(term155154, term155154.getClass(), "type", 0);
        setField(term155154, term155154.getClass(), "next", null);
        setField(term155154, term155154.getClass(), "first", null);
        setField(term155154, term155154.getClass(), "last", null);
        setField(term155154, term155154.getClass(), "propListHead", null);
        setIntField(term155154, term155154.getClass(), "sourcePosition", 0);
        setField(term155154, term155154.getClass(), "jsType", null);
        setField(term155154, term155154.getClass(), "parent", null);
        setField(term155153, term155153.getClass(), "first", term155154);
        setField(term155153, term155153.getClass(), "last", null);
        setField(term155153, term155153.getClass(), "propListHead", null);
        setIntField(term155153, term155153.getClass(), "sourcePosition", 0);
        setField(term155153, term155153.getClass(), "jsType", null);
        setField(term155153, term155153.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term154940;
        Object retValue = callMethod(klass, "identifyTypeDeclarationCall", argTypes, term154848, args);
        assertTrue(recursiveEquals(term154848, term155152));
        assertTrue(recursiveEquals(term154940, term155153));
        assertTrue(recursiveEquals(retValue, null));
    }

};


