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
import java.util.HashMap;
import java.lang.Object;

public class Scope_isDeclared_28305908766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8078;

    public Scope_isDeclared_28305908766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8216 = newInstance(Class.forName("java.lang.Object"));
        HashMap term8126 = new HashMap();
        ((HashMap) term8126).put(term8216, term8216);
        HashMap term8428 = new HashMap();
        term8078 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term8380 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term8078, term8078.getClass(), "vars", term8126);
        setField(term8380, term8380.getClass(), "vars", term8428);
        setField(term8078, term8078.getClass(), "parent", term8380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        callMethod(klass, "isDeclared", argTypes, term8078, args);
    }

};


