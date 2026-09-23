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
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_12086270587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2426;

    public TypedScopeCreator_getPrototypePropertyOwner_12086270587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2439 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2449 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2426, term2426.getClass(), "type", -93135961);
        setIntField(term2428, term2428.getClass(), "type", 962840079);
        setIntField(term2430, term2430.getClass(), "type", 0);
        setField(term2430, term2430.getClass(), "next", null);
        setField(term2430, term2430.getClass(), "first", null);
        setField(term2430, term2430.getClass(), "last", null);
        setField(term2430, term2430.getClass(), "propListHead", null);
        setIntField(term2430, term2430.getClass(), "sourcePosition", 0);
        setField(term2430, term2430.getClass(), "jsType", null);
        setField(term2430, term2430.getClass(), "parent", null);
        setField(term2428, term2428.getClass(), "next", term2430);
        setIntField(term2433, term2433.getClass(), "type", 0);
        setField(term2433, term2433.getClass(), "next", null);
        setField(term2433, term2433.getClass(), "first", null);
        setField(term2433, term2433.getClass(), "last", null);
        setField(term2433, term2433.getClass(), "propListHead", null);
        setIntField(term2433, term2433.getClass(), "sourcePosition", 0);
        setField(term2433, term2433.getClass(), "jsType", null);
        setField(term2433, term2433.getClass(), "parent", null);
        setField(term2428, term2428.getClass(), "first", term2433);
        setIntField(term2436, term2436.getClass(), "type", 0);
        setField(term2436, term2436.getClass(), "next", null);
        setField(term2436, term2436.getClass(), "first", null);
        setField(term2436, term2436.getClass(), "last", null);
        setField(term2436, term2436.getClass(), "propListHead", null);
        setIntField(term2436, term2436.getClass(), "sourcePosition", 0);
        setField(term2436, term2436.getClass(), "jsType", null);
        setField(term2436, term2436.getClass(), "parent", null);
        setField(term2428, term2428.getClass(), "last", term2436);
        setField(term2439, term2439.getClass(), "next", null);
        setIntField(term2439, term2439.getClass(), "type", 0);
        setIntField(term2439, term2439.getClass(), "intValue", 0);
        setField(term2439, term2439.getClass(), "objectValue", null);
        setField(term2428, term2428.getClass(), "propListHead", term2439);
        setIntField(term2428, term2428.getClass(), "sourcePosition", 335112684);
        setField(term2428, term2428.getClass(), "jsType", null);
        setField(term2428, term2428.getClass(), "parent", null);
        setField(term2426, term2426.getClass(), "next", term2428);
        setIntField(term2443, term2443.getClass(), "type", 0);
        setField(term2443, term2443.getClass(), "next", null);
        setField(term2443, term2443.getClass(), "first", null);
        setField(term2443, term2443.getClass(), "last", null);
        setField(term2443, term2443.getClass(), "propListHead", null);
        setIntField(term2443, term2443.getClass(), "sourcePosition", 0);
        setField(term2443, term2443.getClass(), "jsType", null);
        setField(term2443, term2443.getClass(), "parent", null);
        setField(term2426, term2426.getClass(), "first", term2443);
        setIntField(term2446, term2446.getClass(), "type", 0);
        setField(term2446, term2446.getClass(), "next", null);
        setField(term2446, term2446.getClass(), "first", null);
        setField(term2446, term2446.getClass(), "last", null);
        setField(term2446, term2446.getClass(), "propListHead", null);
        setIntField(term2446, term2446.getClass(), "sourcePosition", 0);
        setField(term2446, term2446.getClass(), "jsType", null);
        setField(term2446, term2446.getClass(), "parent", null);
        setField(term2426, term2426.getClass(), "last", term2446);
        setField(term2449, term2449.getClass(), "next", null);
        setIntField(term2449, term2449.getClass(), "type", 0);
        setIntField(term2449, term2449.getClass(), "intValue", 0);
        setField(term2449, term2449.getClass(), "objectValue", null);
        setField(term2426, term2426.getClass(), "propListHead", term2449);
        setIntField(term2426, term2426.getClass(), "sourcePosition", 1551099402);
        setField(term2426, term2426.getClass(), "jsType", null);
        setField(term2426, term2426.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2426;
        callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
    }

};


