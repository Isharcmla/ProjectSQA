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

public class FlowSensitiveInlineVariables_checkRightOf_146623795672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18325;
     Object term18465;
     Object term18565;

    public FlowSensitiveInlineVariables_checkRightOf_146623795672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18395, term18395.getClass(), "type", -39);
        setField(term18325, term18325.getClass(), "next", term18395);
        term18465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term18565 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector$2"));
        setBooleanField(term18565, term18565.getClass(), "val$assumeMinimumCapture", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term18325;
        args[1] = term18465;
        args[2] = term18565;
        try {
            callMethod(klass, "checkRightOf", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


