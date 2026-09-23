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

public class ReferenceCollectingCallback_isBlockBoundary_684698721961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260503;
     Object term260938;

    public ReferenceCollectingCallback_isBlockBoundary_684698721961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term260503, term260503.getClass(), "type", 77);
        term260938 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term260938, term260938.getClass(), "number", 0.0);
        setIntField(term260938, term260938.getClass(), "type", 77);
        setField(term260938, term260938.getClass(), "next", null);
        setField(term260938, term260938.getClass(), "first", null);
        setField(term260938, term260938.getClass(), "last", null);
        setField(term260938, term260938.getClass(), "propListHead", null);
        setIntField(term260938, term260938.getClass(), "sourcePosition", 0);
        setField(term260938, term260938.getClass(), "jsType", null);
        setField(term260938, term260938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term260503;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term260503, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


