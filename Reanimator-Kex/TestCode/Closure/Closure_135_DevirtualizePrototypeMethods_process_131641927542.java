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

public class DevirtualizePrototypeMethods_process_131641927542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9019;
     Object term9169;

    public DevirtualizePrototypeMethods_process_131641927542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9019 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        Object term9099 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9019, term9019.getClass(), "compiler", term9099);
        term9169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9169, term9169.getClass(), "type", 0);
        setField(term9169, term9169.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term9169;
        args[1] = null;
        callMethod(klass, "process", argTypes, term9019, args);
    }

};


