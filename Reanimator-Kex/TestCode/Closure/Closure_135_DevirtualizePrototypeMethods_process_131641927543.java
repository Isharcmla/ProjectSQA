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

public class DevirtualizePrototypeMethods_process_131641927543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9666;
     Object term9736;
     Object term9876;

    public DevirtualizePrototypeMethods_process_131641927543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9666 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term9666, term9666.getClass(), "compiler", null);
        term9736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9736, term9736.getClass(), "type", 0);
        setField(term9806, term9806.getClass(), "next", null);
        setIntField(term9806, term9806.getClass(), "type", 0);
        setField(term9806, term9806.getClass(), "first", null);
        setField(term9736, term9736.getClass(), "first", term9806);
        term9876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9876, term9876.getClass(), "type", 120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term9736;
        args[1] = term9876;
        callMethod(klass, "process", argTypes, term9666, args);
    }

};


