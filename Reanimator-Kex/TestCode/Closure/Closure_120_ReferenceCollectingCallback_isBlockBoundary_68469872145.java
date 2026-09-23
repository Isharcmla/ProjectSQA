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

public class ReferenceCollectingCallback_isBlockBoundary_68469872145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5756;
     Object term5771;

    public ReferenceCollectingCallback_isBlockBoundary_68469872145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5756, term5756.getClass(), "type", 113);
        term5771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5771, term5771.getClass(), "type", 113);
        setField(term5771, term5771.getClass(), "next", null);
        setField(term5771, term5771.getClass(), "first", null);
        setField(term5771, term5771.getClass(), "last", null);
        setField(term5771, term5771.getClass(), "propListHead", null);
        setIntField(term5771, term5771.getClass(), "sourcePosition", 0);
        setField(term5771, term5771.getClass(), "jsType", null);
        setField(term5771, term5771.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5756;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term5756, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


