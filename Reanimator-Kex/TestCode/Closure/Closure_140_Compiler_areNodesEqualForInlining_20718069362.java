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

public class Compiler_areNodesEqualForInlining_20718069362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2576796;
     Object term2576960;

    public Compiler_areNodesEqualForInlining_20718069362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2576796 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2576890 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term2576890, term2576890.getClass(), "ambiguateProperties", false);
        setBooleanField(term2576890, term2576890.getClass(), "disambiguateProperties", false);
        setField(term2576796, term2576796.getClass(), "options", term2576890);
        term2576960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2576960;
        args[1] = null;
        callMethod(klass, "areNodesEqualForInlining", argTypes, term2576796, args);
    }

};


