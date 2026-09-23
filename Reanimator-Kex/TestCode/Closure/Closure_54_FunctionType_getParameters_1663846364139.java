package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionType_getParameters_1663846364139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68809;
     Object term69038;
     Object term69037;

    public FunctionType_getParameters_1663846364139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68809 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term68903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term68993 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term68903, term68903.getClass(), "parameters", term68993);
        setField(term68809, term68809.getClass(), "call", term68903);
        term69038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term69040 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term69040, term69040.getClass(), "encodedSourceStart", 0);
        setIntField(term69040, term69040.getClass(), "encodedSourceEnd", 0);
        setField(term69040, term69040.getClass(), "sourceName", null);
        setIntField(term69040, term69040.getClass(), "baseLineno", 0);
        setIntField(term69040, term69040.getClass(), "endLineno", 0);
        setField(term69040, term69040.getClass(), "functions", null);
        setField(term69040, term69040.getClass(), "regexps", null);
        setField(term69040, term69040.getClass(), "itsVariables", null);
        setField(term69040, term69040.getClass(), "itsConst", null);
        setField(term69040, term69040.getClass(), "itsVariableNames", null);
        setIntField(term69040, term69040.getClass(), "varStart", 0);
        setField(term69040, term69040.getClass(), "compilerData", null);
        setIntField(term69040, term69040.getClass(), "type", 0);
        setField(term69040, term69040.getClass(), "next", null);
        setField(term69040, term69040.getClass(), "first", null);
        setField(term69040, term69040.getClass(), "last", null);
        setField(term69040, term69040.getClass(), "propListHead", null);
        setIntField(term69040, term69040.getClass(), "sourcePosition", 0);
        setField(term69040, term69040.getClass(), "jsType", null);
        setField(term69040, term69040.getClass(), "parent", null);
        setField(term69039, term69039.getClass(), "parameters", term69040);
        setField(term69039, term69039.getClass(), "returnType", null);
        setBooleanField(term69039, term69039.getClass(), "returnTypeInferred", false);
        setBooleanField(term69039, term69039.getClass(), "resolved", false);
        setField(term69039, term69039.getClass(), "resolveResult", null);
        setField(term69039, term69039.getClass(), "registry", null);
        setField(term69038, term69038.getClass(), "call", term69039);
        setField(term69038, term69038.getClass(), "prototype", null);
        setField(term69038, term69038.getClass(), "prototypeSlot", null);
        setField(term69038, term69038.getClass(), "kind", null);
        setField(term69038, term69038.getClass(), "typeOfThis", null);
        setField(term69038, term69038.getClass(), "source", null);
        setField(term69038, term69038.getClass(), "implementedInterfaces", null);
        setField(term69038, term69038.getClass(), "extendedInterfaces", null);
        setField(term69038, term69038.getClass(), "subTypes", null);
        setField(term69038, term69038.getClass(), "templateTypeName", null);
        setField(term69038, term69038.getClass(), "className", null);
        setField(term69038, term69038.getClass(), "properties", null);
        setBooleanField(term69038, term69038.getClass(), "nativeType", false);
        setField(term69038, term69038.getClass(), "implicitPrototypeFallback", null);
        setField(term69038, term69038.getClass(), "ownerFunction", null);
        setBooleanField(term69038, term69038.getClass(), "prettyPrint", false);
        setBooleanField(term69038, term69038.getClass(), "visited", false);
        setField(term69038, term69038.getClass(), "docInfo", null);
        setBooleanField(term69038, term69038.getClass(), "unknown", false);
        setBooleanField(term69038, term69038.getClass(), "resolved", false);
        setField(term69038, term69038.getClass(), "resolveResult", null);
        setField(term69038, term69038.getClass(), "registry", null);
        term69037 = newInstance(Class.forName("java.util.Collections$EmptySet"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParameters", argTypes, term68809, args);
        assertTrue(recursiveEquals(term68809, term69038));
        assertTrue(recursiveEquals(retValue, term69037));
    }

};


