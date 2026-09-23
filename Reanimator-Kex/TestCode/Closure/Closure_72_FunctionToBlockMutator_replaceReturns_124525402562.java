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

public class FunctionToBlockMutator_replaceReturns_124525402562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17188;
     Object term20308;
     Object term20184;

    public FunctionToBlockMutator_replaceReturns_124525402562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17188, term17188.getClass(), "type", 96);
        setField(term17188, term17188.getClass(), "parent", null);
        setIntField(term17258, term17258.getClass(), "type", 0);
        setField(term17258, term17258.getClass(), "parent", null);
        setField(term17258, term17258.getClass(), "first", null);
        setField(term17258, term17258.getClass(), "next", term17328);
        setField(term17188, term17188.getClass(), "first", term17258);
        term20308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20308, term20308.getClass(), "type", 96);
        setField(term20308, term20308.getClass(), "next", null);
        setIntField(term20309, term20309.getClass(), "type", 0);
        setIntField(term20310, term20310.getClass(), "type", 0);
        setField(term20310, term20310.getClass(), "next", null);
        setField(term20310, term20310.getClass(), "first", null);
        setField(term20310, term20310.getClass(), "last", null);
        setField(term20310, term20310.getClass(), "propListHead", null);
        setIntField(term20310, term20310.getClass(), "sourcePosition", 0);
        setField(term20310, term20310.getClass(), "jsType", null);
        setField(term20310, term20310.getClass(), "parent", null);
        setField(term20309, term20309.getClass(), "next", term20310);
        setField(term20309, term20309.getClass(), "first", null);
        setField(term20309, term20309.getClass(), "last", null);
        setField(term20309, term20309.getClass(), "propListHead", null);
        setIntField(term20309, term20309.getClass(), "sourcePosition", 0);
        setField(term20309, term20309.getClass(), "jsType", null);
        setField(term20309, term20309.getClass(), "parent", null);
        setField(term20308, term20308.getClass(), "first", term20309);
        setField(term20308, term20308.getClass(), "last", null);
        setField(term20308, term20308.getClass(), "propListHead", null);
        setIntField(term20308, term20308.getClass(), "sourcePosition", 0);
        setField(term20308, term20308.getClass(), "jsType", null);
        setField(term20308, term20308.getClass(), "parent", null);
        term20184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20184, term20184.getClass(), "type", 96);
        setField(term20184, term20184.getClass(), "next", null);
        setIntField(term20186, term20186.getClass(), "type", 0);
        setIntField(term20188, term20188.getClass(), "type", 0);
        setField(term20188, term20188.getClass(), "next", null);
        setField(term20188, term20188.getClass(), "first", null);
        setField(term20188, term20188.getClass(), "last", null);
        setField(term20188, term20188.getClass(), "propListHead", null);
        setIntField(term20188, term20188.getClass(), "sourcePosition", 0);
        setField(term20188, term20188.getClass(), "jsType", null);
        setField(term20188, term20188.getClass(), "parent", null);
        setField(term20186, term20186.getClass(), "next", term20188);
        setField(term20186, term20186.getClass(), "first", null);
        setField(term20186, term20186.getClass(), "last", null);
        setField(term20186, term20186.getClass(), "propListHead", null);
        setIntField(term20186, term20186.getClass(), "sourcePosition", 0);
        setField(term20186, term20186.getClass(), "jsType", null);
        setField(term20186, term20186.getClass(), "parent", null);
        setField(term20184, term20184.getClass(), "first", term20186);
        setField(term20184, term20184.getClass(), "last", null);
        setField(term20184, term20184.getClass(), "propListHead", null);
        setIntField(term20184, term20184.getClass(), "sourcePosition", 0);
        setField(term20184, term20184.getClass(), "jsType", null);
        setField(term20184, term20184.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term17188;
        args[1] = null;
        args[2] = "";
        args[3] = false;
        Object retValue = callMethod(klass, "replaceReturns", argTypes, null, args);
        assertTrue(recursiveEquals(term17188, term20308));
        assertTrue(recursiveEquals(retValue, term20184));
    }

};


