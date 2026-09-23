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

public class ReferenceCollectingCallback_isBlockBoundary_684698721411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97415;
     Object term97485;
     Object term97500;
     Object term97501;

    public ReferenceCollectingCallback_isBlockBoundary_684698721411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97415, term97415.getClass(), "type", 111);
        term97485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97485, term97485.getClass(), "type", 12);
        term97500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97500, term97500.getClass(), "type", 12);
        setField(term97500, term97500.getClass(), "next", null);
        setField(term97500, term97500.getClass(), "first", null);
        setField(term97500, term97500.getClass(), "last", null);
        setField(term97500, term97500.getClass(), "propListHead", null);
        setIntField(term97500, term97500.getClass(), "sourcePosition", 0);
        setField(term97500, term97500.getClass(), "jsType", null);
        setField(term97500, term97500.getClass(), "parent", null);
        term97501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97501, term97501.getClass(), "type", 111);
        setField(term97501, term97501.getClass(), "next", null);
        setField(term97501, term97501.getClass(), "first", null);
        setField(term97501, term97501.getClass(), "last", null);
        setField(term97501, term97501.getClass(), "propListHead", null);
        setIntField(term97501, term97501.getClass(), "sourcePosition", 0);
        setField(term97501, term97501.getClass(), "jsType", null);
        setField(term97501, term97501.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term97415;
        args[1] = term97485;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term97415, term97500));
        assertTrue(recursiveEquals(term97485, term97501));
        assertTrue(recursiveEquals(retValue, true));
    }

};


