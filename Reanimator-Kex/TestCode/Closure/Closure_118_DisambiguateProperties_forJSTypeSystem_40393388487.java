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

public class DisambiguateProperties_forJSTypeSystem_40393388487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25499;

    public DisambiguateProperties_forJSTypeSystem_40393388487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25499 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term25593 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term25499, term25499.getClass(), "typeRegistry", null);
        setField(term25499, term25499.getClass(), "oldErrorReporter", null);
        setField(term25499, term25499.getClass(), "options", term25593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term25499;
        args[1] = null;
        callMethod(klass, "forJSTypeSystem", argTypes, null, args);
    }

};


