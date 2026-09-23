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

public class Compiler_compileInternal_1928486329294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3005532;

    public Compiler_compileInternal_1928486329294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3006016 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term3006015 = ((Class) term3006016).getDeclaredField((String) "OFF");
        ((Field) term3006015).setAccessible(true);
        Object enum2978 = ((Field) term3006015).get((Object) null);
        Class<? extends Object> term3006292 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term3006291 = ((Class) term3006292).getDeclaredField((String) "OFF");
        ((Field) term3006291).setAccessible(true);
        Object enum2979 = ((Field) term3006291).get((Object) null);
        term3005532 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term3005626 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term3006014 = newInstance(Class.forName("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        setField(term3005626, term3005626.getClass(), "devMode", enum2978);
        setField(term3005626, term3005626.getClass(), "tracer", enum2979);
        setField(term3005532, term3005532.getClass(), "options", term3005626);
        setField(term3005532, term3005532.getClass(), "externsRoot", null);
        setField(term3005532, term3005532.getClass(), "jsRoot", null);
        setField(term3005532, term3005532.getClass(), "recentChange", term3006014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compileInternal", argTypes, term3005532, args);
    }

};


