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

public class TypedScopeCreator_getPrototypePropertyOwner_120862705815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4263;
     Object term10593;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4276 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4286 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4263, term4263.getClass(), "type", -93135961);
        setIntField(term4265, term4265.getClass(), "type", 962840079);
        setIntField(term4267, term4267.getClass(), "type", 0);
        setField(term4267, term4267.getClass(), "next", null);
        setField(term4267, term4267.getClass(), "first", null);
        setField(term4267, term4267.getClass(), "last", null);
        setField(term4267, term4267.getClass(), "propListHead", null);
        setIntField(term4267, term4267.getClass(), "sourcePosition", 0);
        setField(term4267, term4267.getClass(), "jsType", null);
        setField(term4267, term4267.getClass(), "parent", null);
        setField(term4265, term4265.getClass(), "next", term4267);
        setIntField(term4270, term4270.getClass(), "type", 0);
        setField(term4270, term4270.getClass(), "next", null);
        setField(term4270, term4270.getClass(), "first", null);
        setField(term4270, term4270.getClass(), "last", null);
        setField(term4270, term4270.getClass(), "propListHead", null);
        setIntField(term4270, term4270.getClass(), "sourcePosition", 0);
        setField(term4270, term4270.getClass(), "jsType", null);
        setField(term4270, term4270.getClass(), "parent", null);
        setField(term4265, term4265.getClass(), "first", term4270);
        setIntField(term4273, term4273.getClass(), "type", 0);
        setField(term4273, term4273.getClass(), "next", null);
        setField(term4273, term4273.getClass(), "first", null);
        setField(term4273, term4273.getClass(), "last", null);
        setField(term4273, term4273.getClass(), "propListHead", null);
        setIntField(term4273, term4273.getClass(), "sourcePosition", 0);
        setField(term4273, term4273.getClass(), "jsType", null);
        setField(term4273, term4273.getClass(), "parent", null);
        setField(term4265, term4265.getClass(), "last", term4273);
        setField(term4276, term4276.getClass(), "next", null);
        setIntField(term4276, term4276.getClass(), "type", 0);
        setIntField(term4276, term4276.getClass(), "intValue", 0);
        setField(term4276, term4276.getClass(), "objectValue", null);
        setField(term4265, term4265.getClass(), "propListHead", term4276);
        setIntField(term4265, term4265.getClass(), "sourcePosition", 335112684);
        setField(term4265, term4265.getClass(), "jsType", null);
        setField(term4265, term4265.getClass(), "parent", null);
        setField(term4263, term4263.getClass(), "next", term4265);
        setIntField(term4280, term4280.getClass(), "type", 0);
        setField(term4280, term4280.getClass(), "next", null);
        setField(term4280, term4280.getClass(), "first", null);
        setField(term4280, term4280.getClass(), "last", null);
        setField(term4280, term4280.getClass(), "propListHead", null);
        setIntField(term4280, term4280.getClass(), "sourcePosition", 0);
        setField(term4280, term4280.getClass(), "jsType", null);
        setField(term4280, term4280.getClass(), "parent", null);
        setField(term4263, term4263.getClass(), "first", term4280);
        setIntField(term4283, term4283.getClass(), "type", 0);
        setField(term4283, term4283.getClass(), "next", null);
        setField(term4283, term4283.getClass(), "first", null);
        setField(term4283, term4283.getClass(), "last", null);
        setField(term4283, term4283.getClass(), "propListHead", null);
        setIntField(term4283, term4283.getClass(), "sourcePosition", 0);
        setField(term4283, term4283.getClass(), "jsType", null);
        setField(term4283, term4283.getClass(), "parent", null);
        setField(term4263, term4263.getClass(), "last", term4283);
        setField(term4286, term4286.getClass(), "next", null);
        setIntField(term4286, term4286.getClass(), "type", 0);
        setIntField(term4286, term4286.getClass(), "intValue", 0);
        setField(term4286, term4286.getClass(), "objectValue", null);
        setField(term4263, term4263.getClass(), "propListHead", term4286);
        setIntField(term4263, term4263.getClass(), "sourcePosition", 1551099402);
        setField(term4263, term4263.getClass(), "jsType", null);
        setField(term4263, term4263.getClass(), "parent", null);
        term10593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10598 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10601 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10593, term10593.getClass(), "type", -93135961);
        setIntField(term10594, term10594.getClass(), "type", 962840079);
        setIntField(term10595, term10595.getClass(), "type", 0);
        setField(term10595, term10595.getClass(), "next", null);
        setField(term10595, term10595.getClass(), "first", null);
        setField(term10595, term10595.getClass(), "last", null);
        setField(term10595, term10595.getClass(), "propListHead", null);
        setIntField(term10595, term10595.getClass(), "sourcePosition", 0);
        setField(term10595, term10595.getClass(), "jsType", null);
        setField(term10595, term10595.getClass(), "parent", null);
        setField(term10594, term10594.getClass(), "next", term10595);
        setIntField(term10596, term10596.getClass(), "type", 0);
        setField(term10596, term10596.getClass(), "next", null);
        setField(term10596, term10596.getClass(), "first", null);
        setField(term10596, term10596.getClass(), "last", null);
        setField(term10596, term10596.getClass(), "propListHead", null);
        setIntField(term10596, term10596.getClass(), "sourcePosition", 0);
        setField(term10596, term10596.getClass(), "jsType", null);
        setField(term10596, term10596.getClass(), "parent", null);
        setField(term10594, term10594.getClass(), "first", term10596);
        setIntField(term10597, term10597.getClass(), "type", 0);
        setField(term10597, term10597.getClass(), "next", null);
        setField(term10597, term10597.getClass(), "first", null);
        setField(term10597, term10597.getClass(), "last", null);
        setField(term10597, term10597.getClass(), "propListHead", null);
        setIntField(term10597, term10597.getClass(), "sourcePosition", 0);
        setField(term10597, term10597.getClass(), "jsType", null);
        setField(term10597, term10597.getClass(), "parent", null);
        setField(term10594, term10594.getClass(), "last", term10597);
        setField(term10598, term10598.getClass(), "next", null);
        setIntField(term10598, term10598.getClass(), "type", 0);
        setIntField(term10598, term10598.getClass(), "intValue", 0);
        setField(term10598, term10598.getClass(), "objectValue", null);
        setField(term10594, term10594.getClass(), "propListHead", term10598);
        setIntField(term10594, term10594.getClass(), "sourcePosition", 335112684);
        setField(term10594, term10594.getClass(), "jsType", null);
        setField(term10594, term10594.getClass(), "parent", null);
        setField(term10593, term10593.getClass(), "next", term10594);
        setIntField(term10599, term10599.getClass(), "type", 0);
        setField(term10599, term10599.getClass(), "next", null);
        setField(term10599, term10599.getClass(), "first", null);
        setField(term10599, term10599.getClass(), "last", null);
        setField(term10599, term10599.getClass(), "propListHead", null);
        setIntField(term10599, term10599.getClass(), "sourcePosition", 0);
        setField(term10599, term10599.getClass(), "jsType", null);
        setField(term10599, term10599.getClass(), "parent", null);
        setField(term10593, term10593.getClass(), "first", term10599);
        setIntField(term10600, term10600.getClass(), "type", 0);
        setField(term10600, term10600.getClass(), "next", null);
        setField(term10600, term10600.getClass(), "first", null);
        setField(term10600, term10600.getClass(), "last", null);
        setField(term10600, term10600.getClass(), "propListHead", null);
        setIntField(term10600, term10600.getClass(), "sourcePosition", 0);
        setField(term10600, term10600.getClass(), "jsType", null);
        setField(term10600, term10600.getClass(), "parent", null);
        setField(term10593, term10593.getClass(), "last", term10600);
        setField(term10601, term10601.getClass(), "next", null);
        setIntField(term10601, term10601.getClass(), "type", 0);
        setIntField(term10601, term10601.getClass(), "intValue", 0);
        setField(term10601, term10601.getClass(), "objectValue", null);
        setField(term10593, term10593.getClass(), "propListHead", term10601);
        setIntField(term10593, term10593.getClass(), "sourcePosition", 1551099402);
        setField(term10593, term10593.getClass(), "jsType", null);
        setField(term10593, term10593.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4263;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term4263, term10593));
        assertTrue(recursiveEquals(retValue, null));
    }

};


