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

public class InlineVariables_process_209005721545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43359;
     Object term43571;

    public InlineVariables_process_209005721545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44460 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term44459 = ((Class) term44460).getDeclaredField((String) "LOCALS_ONLY");
        ((Field) term44459).setAccessible(true);
        Object enum73 = ((Field) term44459).get((Object) null);
        term43359 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term43359, term43359.getClass(), "compiler", null);
        setField(term43359, term43359.getClass(), "mode", enum73);
        term43571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43571;
        try {
            callMethod(klass, "process", argTypes, term43359, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


