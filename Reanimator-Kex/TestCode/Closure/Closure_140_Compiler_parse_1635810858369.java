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
import java.lang.String;

public class Compiler_parse_1635810858369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2567290;

    public Compiler_parse_1635810858369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2778910 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2778909 = ((Class) term2778910).getDeclaredField((String) "OFF");
        ((Field) term2778909).setAccessible(true);
        Object enum1996 = ((Field) term2778909).get((Object) null);
        Class<? extends Object> term2779186 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term2779185 = ((Class) term2779186).getDeclaredField((String) "FAST");
        ((Field) term2779185).setAccessible(true);
        Object enum1997 = ((Field) term2779185).get((Object) null);
        term2567290 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2567384 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2567756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2567826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2567384, term2567384.getClass(), "devMode", enum1996);
        setField(term2567384, term2567384.getClass(), "tracer", enum1997);
        setField(term2567290, term2567290.getClass(), "options", term2567384);
        setField(term2567756, term2567756.getClass(), "first", null);
        setField(term2567756, term2567756.getClass(), "last", term2567826);
        setField(term2567290, term2567290.getClass(), "externsRoot", term2567756);
        setField(term2567290, term2567290.getClass(), "jsRoot", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term2567290, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


