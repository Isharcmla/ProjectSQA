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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4830;
     Object term4900;
     Object term4948;
     Object term14510;
     Object term14511;
     Object term14512;
     Object term14492;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4830 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term4900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4900, term4900.getClass(), "type", -39);
        setField(term4900, term4900.getClass(), "first", null);
        term4948 = new HashSet();
        term14510 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term14510, term14510.getClass(), "compiler", null);
        setField(term14510, term14510.getClass(), "safeNameIdSupplier", null);
        term14511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14511, term14511.getClass(), "type", -39);
        setField(term14511, term14511.getClass(), "next", null);
        setField(term14511, term14511.getClass(), "first", null);
        setField(term14511, term14511.getClass(), "last", null);
        setField(term14511, term14511.getClass(), "propListHead", null);
        setIntField(term14511, term14511.getClass(), "sourcePosition", 0);
        setField(term14511, term14511.getClass(), "jsType", null);
        setField(term14511, term14511.getClass(), "parent", null);
        HashMap term14513 = new HashMap();
        Set<Object> term14514 =  ((Map) term14513).keySet();
        term14512 = new HashSet((Collection<? extends Object>) term14514);
        term14492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14492, term14492.getClass(), "type", -39);
        setField(term14492, term14492.getClass(), "next", null);
        setField(term14492, term14492.getClass(), "first", null);
        setField(term14492, term14492.getClass(), "last", null);
        setField(term14492, term14492.getClass(), "propListHead", null);
        setIntField(term14492, term14492.getClass(), "sourcePosition", 0);
        setField(term14492, term14492.getClass(), "jsType", null);
        setField(term14492, term14492.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term4900;
        args[1] = null;
        args[2] = term4948;
        Object retValue = callMethod(klass, "aliasAndInlineArguments", argTypes, term4830, args);
        assertTrue(recursiveEquals(term4830, term14510));
        assertTrue(recursiveEquals(term4900, term14511));
        assertTrue(recursiveEquals(term4948, term14512));
        assertTrue(recursiveEquals(retValue, term14492));
    }

};


