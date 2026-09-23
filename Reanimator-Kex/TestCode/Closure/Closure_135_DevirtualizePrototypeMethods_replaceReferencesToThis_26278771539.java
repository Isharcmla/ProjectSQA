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

public class DevirtualizePrototypeMethods_replaceReferencesToThis_26278771539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7859;
     Object term7929;

    public DevirtualizePrototypeMethods_replaceReferencesToThis_26278771539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7859 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        term7929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7929, term7929.getClass(), "type", 0);
        setField(term7999, term7999.getClass(), "next", null);
        setIntField(term7999, term7999.getClass(), "type", 0);
        setField(term7999, term7999.getClass(), "first", term7999);
        setField(term7929, term7929.getClass(), "first", term7999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term7929;
        args[1] = null;
        callMethod(klass, "replaceReferencesToThis", argTypes, term7859, args);
    }

};


