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

public class InlineVariables_process_209005721579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80713;

    public InlineVariables_process_209005721579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81747 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term81746 = ((Class) term81747).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term81746).setAccessible(true);
        Object enum125 = ((Field) term81746).get((Object) null);
        term80713 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term80713, term80713.getClass(), "compiler", null);
        setField(term80713, term80713.getClass(), "mode", enum125);
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
            callMethod(klass, "process", argTypes, term80713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


