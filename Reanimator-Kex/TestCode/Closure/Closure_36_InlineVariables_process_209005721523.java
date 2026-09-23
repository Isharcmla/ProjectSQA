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

public class InlineVariables_process_209005721523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20505;

    public InlineVariables_process_209005721523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21903 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term21902 = ((Class) term21903).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term21902).setAccessible(true);
        Object enum38 = ((Field) term21902).get((Object) null);
        term20505 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term20585 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term20505, term20505.getClass(), "compiler", term20585);
        setField(term20505, term20505.getClass(), "mode", enum38);
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
            callMethod(klass, "process", argTypes, term20505, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


