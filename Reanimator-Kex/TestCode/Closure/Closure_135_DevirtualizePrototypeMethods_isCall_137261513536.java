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

public class DevirtualizePrototypeMethods_isCall_137261513536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7088;

    public DevirtualizePrototypeMethods_isCall_137261513536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7088 = newInstance(Class.forName("com.google.javascript.jscomp.UseSite"));
        Object term7158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7158, term7158.getClass(), "parent", term7158);
        setField(term7158, term7158.getClass(), "first", term7158);
        setField(term7088, term7088.getClass(), "node", term7158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.UseSite");
        Object[] args = new Object[1];
        args[0] = term7088;
        callMethod(klass, "isCall", argTypes, null, args);
    }

};


