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

public class FunctionToBlockMutator_aliasAndInlineArguments_38898233163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17521;
     Object term17613;
     Object term17753;
     Object term20355;
     Object term20356;
     Object term20358;
     Object term20316;

    public FunctionToBlockMutator_aliasAndInlineArguments_38898233163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17521 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        term17613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term17613, term17613.getClass(), "type", -39);
        setField(term17613, term17613.getClass(), "first", term17705);
        term17753 = new HashSet();
        term20355 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term20355, term20355.getClass(), "compiler", null);
        setField(term20355, term20355.getClass(), "safeNameIdSupplier", null);
        term20356 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term20356, term20356.getClass(), "number", 0.0);
        setIntField(term20356, term20356.getClass(), "type", -39);
        setField(term20356, term20356.getClass(), "next", null);
        setField(term20357, term20357.getClass(), "str", null);
        setIntField(term20357, term20357.getClass(), "type", 0);
        setField(term20357, term20357.getClass(), "next", null);
        setField(term20357, term20357.getClass(), "first", null);
        setField(term20357, term20357.getClass(), "last", null);
        setField(term20357, term20357.getClass(), "propListHead", null);
        setIntField(term20357, term20357.getClass(), "sourcePosition", 0);
        setField(term20357, term20357.getClass(), "jsType", null);
        setField(term20357, term20357.getClass(), "parent", null);
        setField(term20356, term20356.getClass(), "first", term20357);
        setField(term20356, term20356.getClass(), "last", null);
        setField(term20356, term20356.getClass(), "propListHead", null);
        setIntField(term20356, term20356.getClass(), "sourcePosition", 0);
        setField(term20356, term20356.getClass(), "jsType", null);
        setField(term20356, term20356.getClass(), "parent", null);
        HashMap term20359 = new HashMap();
        Set<Object> term20360 =  ((Map) term20359).keySet();
        term20358 = new HashSet((Collection<? extends Object>) term20360);
        term20316 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term20319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term20316, term20316.getClass(), "number", 0.0);
        setIntField(term20316, term20316.getClass(), "type", -39);
        setField(term20316, term20316.getClass(), "next", null);
        setField(term20319, term20319.getClass(), "str", null);
        setIntField(term20319, term20319.getClass(), "type", 0);
        setField(term20319, term20319.getClass(), "next", null);
        setField(term20319, term20319.getClass(), "first", null);
        setField(term20319, term20319.getClass(), "last", null);
        setField(term20319, term20319.getClass(), "propListHead", null);
        setIntField(term20319, term20319.getClass(), "sourcePosition", 0);
        setField(term20319, term20319.getClass(), "jsType", null);
        setField(term20319, term20319.getClass(), "parent", null);
        setField(term20316, term20316.getClass(), "first", term20319);
        setField(term20316, term20316.getClass(), "last", null);
        setField(term20316, term20316.getClass(), "propListHead", null);
        setIntField(term20316, term20316.getClass(), "sourcePosition", 0);
        setField(term20316, term20316.getClass(), "jsType", null);
        setField(term20316, term20316.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.LinkedHashMap");
        argTypes[2] = Class.forName("java.util.Set");
        Object[] args = new Object[3];
        args[0] = term17613;
        args[1] = null;
        args[2] = term17753;
        Object retValue = callMethod(klass, "aliasAndInlineArguments", argTypes, term17521, args);
        assertTrue(recursiveEquals(term17521, term20355));
        assertTrue(recursiveEquals(term17613, term20356));
        assertTrue(recursiveEquals(term17753, term20358));
        assertTrue(recursiveEquals(retValue, term20316));
    }

};


