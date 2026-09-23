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
import java.lang.String;
import java.lang.Object;

public class InlineVariables_process_209005721519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16059;
     Object term16271;
     Object term16363;

    public InlineVariables_process_209005721519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17266 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term17265 = ((Class) term17266).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term17265).setAccessible(true);
        Object enum31 = ((Field) term17265).get((Object) null);
        term16059 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term16059, term16059.getClass(), "compiler", null);
        setField(term16059, term16059.getClass(), "mode", enum31);
        term16271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term16363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16271;
        args[1] = term16363;
        try {
            callMethod(klass, "process", argTypes, term16059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


