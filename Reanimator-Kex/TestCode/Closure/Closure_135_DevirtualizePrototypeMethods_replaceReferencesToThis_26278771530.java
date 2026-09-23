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

public class DevirtualizePrototypeMethods_replaceReferencesToThis_26278771530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5051;
     Object term5121;

    public DevirtualizePrototypeMethods_replaceReferencesToThis_26278771530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5051 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term5121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5121, term5121.getClass(), "type", 1);
        setField(term5191, term5191.getClass(), "next", null);
        setIntField(term5191, term5191.getClass(), "type", 0);
        setField(term5191, term5191.getClass(), "first", null);
        setField(term5121, term5121.getClass(), "first", term5191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term5121;
        args[1] = null;
        callMethod(klass, "replaceReferencesToThis", argTypes, term5051, args);
    }

};


