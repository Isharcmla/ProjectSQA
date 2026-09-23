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

public class InlineVariables_process_209005721567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66447;
     Object term66739;

    public InlineVariables_process_209005721567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68040 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term68039 = ((Class) term68040).getDeclaredField((String) "CONSTANTS_ONLY");
        ((Field) term68039).setAccessible(true);
        Object enum107 = ((Field) term68039).get((Object) null);
        term66447 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        Object term66527 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term66447, term66447.getClass(), "compiler", term66527);
        setField(term66447, term66447.getClass(), "mode", enum107);
        term66739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term66739;
        try {
            callMethod(klass, "process", argTypes, term66447, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


