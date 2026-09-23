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

public class IR_paramList_1936790638145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17296;
     Object term17551;
     Object term17547;

    public IR_paramList_1936790638145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17296 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term17551 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
        term17547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17547, term17547.getClass(), "type", 83);
        setField(term17547, term17547.getClass(), "next", null);
        setField(term17547, term17547.getClass(), "first", null);
        setField(term17547, term17547.getClass(), "last", null);
        setField(term17547, term17547.getClass(), "propListHead", null);
        setIntField(term17547, term17547.getClass(), "sourcePosition", -1);
        setField(term17547, term17547.getClass(), "jsType", null);
        setField(term17547, term17547.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term17296;
        Object retValue = callMethod(klass, "paramList", argTypes, null, args);
        assertTrue(recursiveEquals(term17296, term17551));
        assertTrue(recursiveEquals(retValue, term17547));
    }

};


