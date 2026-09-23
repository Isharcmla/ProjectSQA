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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16696;
     Object term16766;
     Object term16900;
     Object term20177;
     Object term20178;
     Object term20180;
     Object term20100;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16696 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term16766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term16766, term16766.getClass(), "type", -39);
        setField(term16766, term16766.getClass(), "first", term16852);
        term16900 = new HashSet();
        term20177 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term20177, term20177.getClass(), "compiler", null);
        setField(term20177, term20177.getClass(), "safeNameIdSupplier", null);
        term20178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20179 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20178, term20178.getClass(), "type", -39);
        setField(term20178, term20178.getClass(), "next", null);
        setField(term20179, term20179.getClass(), "functionName", null);
        setBooleanField(term20179, term20179.getClass(), "itsNeedsActivation", false);
        setIntField(term20179, term20179.getClass(), "itsFunctionType", 0);
        setBooleanField(term20179, term20179.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term20179, term20179.getClass(), "encodedSourceStart", 0);
        setIntField(term20179, term20179.getClass(), "encodedSourceEnd", 0);
        setField(term20179, term20179.getClass(), "sourceName", null);
        setIntField(term20179, term20179.getClass(), "baseLineno", 0);
        setIntField(term20179, term20179.getClass(), "endLineno", 0);
        setField(term20179, term20179.getClass(), "functions", null);
        setField(term20179, term20179.getClass(), "regexps", null);
        setField(term20179, term20179.getClass(), "itsVariables", null);
        setField(term20179, term20179.getClass(), "itsConst", null);
        setField(term20179, term20179.getClass(), "itsVariableNames", null);
        setIntField(term20179, term20179.getClass(), "varStart", 0);
        setField(term20179, term20179.getClass(), "compilerData", null);
        setIntField(term20179, term20179.getClass(), "type", 0);
        setField(term20179, term20179.getClass(), "next", null);
        setField(term20179, term20179.getClass(), "first", null);
        setField(term20179, term20179.getClass(), "last", null);
        setField(term20179, term20179.getClass(), "propListHead", null);
        setIntField(term20179, term20179.getClass(), "sourcePosition", 0);
        setField(term20179, term20179.getClass(), "jsType", null);
        setField(term20179, term20179.getClass(), "parent", null);
        setField(term20178, term20178.getClass(), "first", term20179);
        setField(term20178, term20178.getClass(), "last", null);
        setField(term20178, term20178.getClass(), "propListHead", null);
        setIntField(term20178, term20178.getClass(), "sourcePosition", 0);
        setField(term20178, term20178.getClass(), "jsType", null);
        setField(term20178, term20178.getClass(), "parent", null);
        HashMap term20181 = new HashMap();
        Set<Object> term20182 =  ((Map) term20181).keySet();
        term20180 = new HashSet((Collection<? extends Object>) term20182);
        term20100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20102 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20100, term20100.getClass(), "type", -39);
        setField(term20100, term20100.getClass(), "next", null);
        setField(term20102, term20102.getClass(), "functionName", null);
        setBooleanField(term20102, term20102.getClass(), "itsNeedsActivation", false);
        setIntField(term20102, term20102.getClass(), "itsFunctionType", 0);
        setBooleanField(term20102, term20102.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term20102, term20102.getClass(), "encodedSourceStart", 0);
        setIntField(term20102, term20102.getClass(), "encodedSourceEnd", 0);
        setField(term20102, term20102.getClass(), "sourceName", null);
        setIntField(term20102, term20102.getClass(), "baseLineno", 0);
        setIntField(term20102, term20102.getClass(), "endLineno", 0);
        setField(term20102, term20102.getClass(), "functions", null);
        setField(term20102, term20102.getClass(), "regexps", null);
        setField(term20102, term20102.getClass(), "itsVariables", null);
        setField(term20102, term20102.getClass(), "itsConst", null);
        setField(term20102, term20102.getClass(), "itsVariableNames", null);
        setIntField(term20102, term20102.getClass(), "varStart", 0);
        setField(term20102, term20102.getClass(), "compilerData", null);
        setIntField(term20102, term20102.getClass(), "type", 0);
        setField(term20102, term20102.getClass(), "next", null);
        setField(term20102, term20102.getClass(), "first", null);
        setField(term20102, term20102.getClass(), "last", null);
        setField(term20102, term20102.getClass(), "propListHead", null);
        setIntField(term20102, term20102.getClass(), "sourcePosition", 0);
        setField(term20102, term20102.getClass(), "jsType", null);
        setField(term20102, term20102.getClass(), "parent", null);
        setField(term20100, term20100.getClass(), "first", term20102);
        setField(term20100, term20100.getClass(), "last", null);
        setField(term20100, term20100.getClass(), "propListHead", null);
        setIntField(term20100, term20100.getClass(), "sourcePosition", 0);
        setField(term20100, term20100.getClass(), "jsType", null);
        setField(term20100, term20100.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term16766;
        args[1] = null;
        args[2] = term16900;
        Object retValue = callMethod(klass, "aliasAndInlineArguments", argTypes, term16696, args);
        assertTrue(recursiveEquals(term16696, term20177));
        assertTrue(recursiveEquals(term16766, term20178));
        assertTrue(recursiveEquals(term16900, term20180));
        assertTrue(recursiveEquals(retValue, term20100));
    }

};


