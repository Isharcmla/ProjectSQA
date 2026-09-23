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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_hasFinally_1906674990205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3062;

    public NodeUtil_hasFinally_1906674990205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3075 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3085 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3062, term3062.getClass(), "type", -859828739);
        setIntField(term3064, term3064.getClass(), "type", -1592307668);
        setIntField(term3066, term3066.getClass(), "type", 0);
        setField(term3066, term3066.getClass(), "next", null);
        setField(term3066, term3066.getClass(), "first", null);
        setField(term3066, term3066.getClass(), "last", null);
        setField(term3066, term3066.getClass(), "propListHead", null);
        setIntField(term3066, term3066.getClass(), "sourcePosition", 0);
        setField(term3066, term3066.getClass(), "jsType", null);
        setField(term3066, term3066.getClass(), "parent", null);
        setField(term3064, term3064.getClass(), "next", term3066);
        setIntField(term3069, term3069.getClass(), "type", 0);
        setField(term3069, term3069.getClass(), "next", null);
        setField(term3069, term3069.getClass(), "first", null);
        setField(term3069, term3069.getClass(), "last", null);
        setField(term3069, term3069.getClass(), "propListHead", null);
        setIntField(term3069, term3069.getClass(), "sourcePosition", 0);
        setField(term3069, term3069.getClass(), "jsType", null);
        setField(term3069, term3069.getClass(), "parent", null);
        setField(term3064, term3064.getClass(), "first", term3069);
        setIntField(term3072, term3072.getClass(), "type", 0);
        setField(term3072, term3072.getClass(), "next", null);
        setField(term3072, term3072.getClass(), "first", null);
        setField(term3072, term3072.getClass(), "last", null);
        setField(term3072, term3072.getClass(), "propListHead", null);
        setIntField(term3072, term3072.getClass(), "sourcePosition", 0);
        setField(term3072, term3072.getClass(), "jsType", null);
        setField(term3072, term3072.getClass(), "parent", null);
        setField(term3064, term3064.getClass(), "last", term3072);
        setField(term3075, term3075.getClass(), "next", null);
        setIntField(term3075, term3075.getClass(), "type", 0);
        setIntField(term3075, term3075.getClass(), "intValue", 0);
        setField(term3075, term3075.getClass(), "objectValue", null);
        setField(term3064, term3064.getClass(), "propListHead", term3075);
        setIntField(term3064, term3064.getClass(), "sourcePosition", -1855819749);
        setField(term3064, term3064.getClass(), "jsType", null);
        setField(term3064, term3064.getClass(), "parent", null);
        setField(term3062, term3062.getClass(), "next", term3064);
        setIntField(term3079, term3079.getClass(), "type", 0);
        setField(term3079, term3079.getClass(), "next", null);
        setField(term3079, term3079.getClass(), "first", null);
        setField(term3079, term3079.getClass(), "last", null);
        setField(term3079, term3079.getClass(), "propListHead", null);
        setIntField(term3079, term3079.getClass(), "sourcePosition", 0);
        setField(term3079, term3079.getClass(), "jsType", null);
        setField(term3079, term3079.getClass(), "parent", null);
        setField(term3062, term3062.getClass(), "first", term3079);
        setIntField(term3082, term3082.getClass(), "type", 0);
        setField(term3082, term3082.getClass(), "next", null);
        setField(term3082, term3082.getClass(), "first", null);
        setField(term3082, term3082.getClass(), "last", null);
        setField(term3082, term3082.getClass(), "propListHead", null);
        setIntField(term3082, term3082.getClass(), "sourcePosition", 0);
        setField(term3082, term3082.getClass(), "jsType", null);
        setField(term3082, term3082.getClass(), "parent", null);
        setField(term3062, term3062.getClass(), "last", term3082);
        setField(term3085, term3085.getClass(), "next", null);
        setIntField(term3085, term3085.getClass(), "type", 0);
        setIntField(term3085, term3085.getClass(), "intValue", 0);
        setField(term3085, term3085.getClass(), "objectValue", null);
        setField(term3062, term3062.getClass(), "propListHead", term3085);
        setIntField(term3062, term3062.getClass(), "sourcePosition", 1059048043);
        setField(term3062, term3062.getClass(), "jsType", null);
        setField(term3062, term3062.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3062;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


