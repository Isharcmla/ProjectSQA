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

public class NodeUtil_mayEffectMutableState_1910072630545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46895;
     Object term46908;

    public NodeUtil_mayEffectMutableState_1910072630545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46895, term46895.getClass(), "type", 85);
        term46908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46908, term46908.getClass(), "type", 85);
        setField(term46908, term46908.getClass(), "next", null);
        setField(term46908, term46908.getClass(), "first", null);
        setField(term46908, term46908.getClass(), "last", null);
        setField(term46908, term46908.getClass(), "propListHead", null);
        setIntField(term46908, term46908.getClass(), "sourcePosition", 0);
        setField(term46908, term46908.getClass(), "jsType", null);
        setField(term46908, term46908.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46895;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term46895, term46908));
    }

};


