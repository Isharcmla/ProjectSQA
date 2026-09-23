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
import java.lang.Object;

public class Node_useSourceInfoFromForTree_1587283735809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91944;
     Object term92332;

    public Node_useSourceInfoFromForTree_1587283735809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92262 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term91944, term91944.getClass(), "propListHead", null);
        setIntField(term91944, term91944.getClass(), "sourcePosition", 0);
        setField(term92014, term92014.getClass(), "propListHead", null);
        setIntField(term92014, term92014.getClass(), "sourcePosition", 0);
        setField(term92084, term92084.getClass(), "propListHead", null);
        setIntField(term92084, term92084.getClass(), "sourcePosition", 0);
        setField(term92084, term92084.getClass(), "first", null);
        setField(term92084, term92084.getClass(), "next", null);
        setField(term92014, term92014.getClass(), "first", term92084);
        setIntField(term92262, term92262.getClass(), "propType", 40);
        setField(term92154, term92154.getClass(), "propListHead", term92262);
        setField(term92014, term92014.getClass(), "next", term92154);
        setField(term91944, term91944.getClass(), "first", term92014);
        term92332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term92332, term92332.getClass(), "propListHead", null);
        setIntField(term92332, term92332.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92332;
        callMethod(klass, "useSourceInfoFromForTree", argTypes, term91944, args);
    }

};


