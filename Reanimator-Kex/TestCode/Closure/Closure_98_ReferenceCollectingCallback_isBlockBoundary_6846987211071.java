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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297527;
     Object term297806;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297527 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term297527, term297527.getClass(), "type", 108);
        term297806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term297806, term297806.getClass(), "str", null);
        setIntField(term297806, term297806.getClass(), "type", 108);
        setField(term297806, term297806.getClass(), "next", null);
        setField(term297806, term297806.getClass(), "first", null);
        setField(term297806, term297806.getClass(), "last", null);
        setField(term297806, term297806.getClass(), "propListHead", null);
        setIntField(term297806, term297806.getClass(), "sourcePosition", 0);
        setField(term297806, term297806.getClass(), "jsType", null);
        setField(term297806, term297806.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term297527;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term297527, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


