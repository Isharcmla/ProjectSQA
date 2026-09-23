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

public class NodeUtil_mayEffectMutableState_1245479864260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22401;
     Object term22512;

    public NodeUtil_mayEffectMutableState_1245479864260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22401, term22401.getClass(), "type", 114);
        term22512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22512, term22512.getClass(), "type", 114);
        setField(term22512, term22512.getClass(), "next", null);
        setField(term22512, term22512.getClass(), "first", null);
        setField(term22512, term22512.getClass(), "last", null);
        setField(term22512, term22512.getClass(), "propListHead", null);
        setIntField(term22512, term22512.getClass(), "sourcePosition", 0);
        setField(term22512, term22512.getClass(), "jsType", null);
        setField(term22512, term22512.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term22401;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term22401, term22512));
    }

};


