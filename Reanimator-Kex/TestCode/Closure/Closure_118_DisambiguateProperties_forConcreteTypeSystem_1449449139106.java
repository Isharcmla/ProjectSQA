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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DisambiguateProperties_forConcreteTypeSystem_1449449139106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30099;

    public DisambiguateProperties_forConcreteTypeSystem_1449449139106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30099 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term30193 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term30099, term30099.getClass(), "options", term30193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.TightenTypes");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term30099;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "forConcreteTypeSystem", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


