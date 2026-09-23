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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class InlineVariables_process_209005721581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82820;

    public InlineVariables_process_209005721581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84212 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term84211 = ((Class) term84212).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term84211).setAccessible(true);
        Object enum128 = ((Field) term84211).get((Object) null);
        term82820 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term82900 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82820, term82820.getClass(), "compiler", term82900);
        setField(term82820, term82820.getClass(), "mode", enum128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term82820, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


