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

public class DevirtualizePrototypeMethods_replaceReferencesToThis_26278771529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4805;
     Object term4875;

    public DevirtualizePrototypeMethods_replaceReferencesToThis_26278771529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4805 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term4875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4875, term4875.getClass(), "type", -106);
        setField(term4875, term4875.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4875;
        args[1] = null;
        callMethod(klass, "replaceReferencesToThis", argTypes, term4805, args);
    }

};


