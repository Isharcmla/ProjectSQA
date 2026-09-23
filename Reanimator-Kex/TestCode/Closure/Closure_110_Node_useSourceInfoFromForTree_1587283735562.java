package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_useSourceInfoFromForTree_1587283735562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46540;
     Object term46928;
     Object term47304;
     Object term47309;
     Object term47200;

    public Node_useSourceInfoFromForTree_1587283735562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46858 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term46540, term46540.getClass(), "propListHead", null);
        setIntField(term46540, term46540.getClass(), "sourcePosition", 0);
        setField(term46610, term46610.getClass(), "propListHead", null);
        setIntField(term46610, term46610.getClass(), "sourcePosition", 0);
        setField(term46680, term46680.getClass(), "propListHead", null);
        setIntField(term46680, term46680.getClass(), "sourcePosition", 0);
        setField(term46680, term46680.getClass(), "first", null);
        setField(term46680, term46680.getClass(), "next", null);
        setField(term46610, term46610.getClass(), "first", term46680);
        setField(term46750, term46750.getClass(), "propListHead", term46858);
        setField(term46610, term46610.getClass(), "next", term46750);
        setField(term46540, term46540.getClass(), "first", term46610);
        term46928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46928, term46928.getClass(), "propListHead", null);
        setIntField(term46928, term46928.getClass(), "sourcePosition", 0);
        term47304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47307 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term47308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47304, term47304.getClass(), "type", 0);
        setField(term47304, term47304.getClass(), "next", null);
        setIntField(term47305, term47305.getClass(), "type", 0);
        setIntField(term47306, term47306.getClass(), "type", 0);
        setField(term47306, term47306.getClass(), "next", null);
        setField(term47306, term47306.getClass(), "first", null);
        setField(term47306, term47306.getClass(), "last", null);
        setField(term47307, term47307.getClass(), "objectValue", null);
        setField(term47307, term47307.getClass(), "next", null);
        setIntField(term47307, term47307.getClass(), "propType", 0);
        setField(term47306, term47306.getClass(), "propListHead", term47307);
        setIntField(term47306, term47306.getClass(), "sourcePosition", 0);
        setField(term47306, term47306.getClass(), "jsType", null);
        setField(term47306, term47306.getClass(), "parent", null);
        setField(term47305, term47305.getClass(), "next", term47306);
        setIntField(term47308, term47308.getClass(), "type", 0);
        setField(term47308, term47308.getClass(), "next", null);
        setField(term47308, term47308.getClass(), "first", null);
        setField(term47308, term47308.getClass(), "last", null);
        setField(term47308, term47308.getClass(), "propListHead", null);
        setIntField(term47308, term47308.getClass(), "sourcePosition", 0);
        setField(term47308, term47308.getClass(), "jsType", null);
        setField(term47308, term47308.getClass(), "parent", null);
        setField(term47305, term47305.getClass(), "first", term47308);
        setField(term47305, term47305.getClass(), "last", null);
        setField(term47305, term47305.getClass(), "propListHead", null);
        setIntField(term47305, term47305.getClass(), "sourcePosition", 0);
        setField(term47305, term47305.getClass(), "jsType", null);
        setField(term47305, term47305.getClass(), "parent", null);
        setField(term47304, term47304.getClass(), "first", term47305);
        setField(term47304, term47304.getClass(), "last", null);
        setField(term47304, term47304.getClass(), "propListHead", null);
        setIntField(term47304, term47304.getClass(), "sourcePosition", 0);
        setField(term47304, term47304.getClass(), "jsType", null);
        setField(term47304, term47304.getClass(), "parent", null);
        term47309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47309, term47309.getClass(), "type", 0);
        setField(term47309, term47309.getClass(), "next", null);
        setField(term47309, term47309.getClass(), "first", null);
        setField(term47309, term47309.getClass(), "last", null);
        setField(term47309, term47309.getClass(), "propListHead", null);
        setIntField(term47309, term47309.getClass(), "sourcePosition", 0);
        setField(term47309, term47309.getClass(), "jsType", null);
        setField(term47309, term47309.getClass(), "parent", null);
        term47200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47206 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term47209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47200, term47200.getClass(), "type", 0);
        setField(term47200, term47200.getClass(), "next", null);
        setIntField(term47202, term47202.getClass(), "type", 0);
        setIntField(term47204, term47204.getClass(), "type", 0);
        setField(term47204, term47204.getClass(), "next", null);
        setField(term47204, term47204.getClass(), "first", null);
        setField(term47204, term47204.getClass(), "last", null);
        setField(term47206, term47206.getClass(), "objectValue", null);
        setField(term47206, term47206.getClass(), "next", null);
        setIntField(term47206, term47206.getClass(), "propType", 0);
        setField(term47204, term47204.getClass(), "propListHead", term47206);
        setIntField(term47204, term47204.getClass(), "sourcePosition", 0);
        setField(term47204, term47204.getClass(), "jsType", null);
        setField(term47204, term47204.getClass(), "parent", null);
        setField(term47202, term47202.getClass(), "next", term47204);
        setIntField(term47209, term47209.getClass(), "type", 0);
        setField(term47209, term47209.getClass(), "next", null);
        setField(term47209, term47209.getClass(), "first", null);
        setField(term47209, term47209.getClass(), "last", null);
        setField(term47209, term47209.getClass(), "propListHead", null);
        setIntField(term47209, term47209.getClass(), "sourcePosition", 0);
        setField(term47209, term47209.getClass(), "jsType", null);
        setField(term47209, term47209.getClass(), "parent", null);
        setField(term47202, term47202.getClass(), "first", term47209);
        setField(term47202, term47202.getClass(), "last", null);
        setField(term47202, term47202.getClass(), "propListHead", null);
        setIntField(term47202, term47202.getClass(), "sourcePosition", 0);
        setField(term47202, term47202.getClass(), "jsType", null);
        setField(term47202, term47202.getClass(), "parent", null);
        setField(term47200, term47200.getClass(), "first", term47202);
        setField(term47200, term47200.getClass(), "last", null);
        setField(term47200, term47200.getClass(), "propListHead", null);
        setIntField(term47200, term47200.getClass(), "sourcePosition", 0);
        setField(term47200, term47200.getClass(), "jsType", null);
        setField(term47200, term47200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46928;
        Object retValue = callMethod(klass, "useSourceInfoFromForTree", argTypes, term46540, args);
        assertTrue(recursiveEquals(term46540, term47304));
        assertTrue(recursiveEquals(term46928, term47309));
        assertTrue(recursiveEquals(retValue, term47200));
    }

};


