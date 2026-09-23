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
import java.lang.Object;

public class DevirtualizePrototypeMethods_replaceReferencesToThis_26278771522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3036;
     Object term3106;

    public DevirtualizePrototypeMethods_replaceReferencesToThis_26278771522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3036 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term3106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3106, term3106.getClass(), "type", 1);
        setField(term3176, term3176.getClass(), "next", term3176);
        setIntField(term3176, term3176.getClass(), "type", 0);
        setField(term3176, term3176.getClass(), "first", null);
        setField(term3106, term3106.getClass(), "first", term3176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3106;
        args[1] = null;
        callMethod(klass, "replaceReferencesToThis", argTypes, term3036, args);
    }

};


