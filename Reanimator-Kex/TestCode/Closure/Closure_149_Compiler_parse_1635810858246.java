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
import java.lang.String;

public class Compiler_parse_1635810858246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2412765;

    public Compiler_parse_1635810858246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2413249 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2413248 = ((Class) term2413249).getDeclaredField((String) "OFF");
        ((Field) term2413248).setAccessible(true);
        Object enum2714 = ((Field) term2413248).get((Object) null);
        Class<? extends Object> term2413525 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term2413524 = ((Class) term2413525).getDeclaredField((String) "OFF");
        ((Field) term2413524).setAccessible(true);
        Object enum2715 = ((Field) term2413524).get((Object) null);
        term2412765 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2412859 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2413247 = newInstance(Class.forName("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(term2412859, term2412859.getClass(), "devMode", enum2714);
        setField(term2412859, term2412859.getClass(), "tracer", enum2715);
        setField(term2412765, term2412765.getClass(), "options", term2412859);
        setField(term2412765, term2412765.getClass(), "externsRoot", null);
        setField(term2412765, term2412765.getClass(), "jsRoot", null);
        setField(term2412765, term2412765.getClass(), "recentChange", term2413247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parse", argTypes, term2412765, args);
    }

};


