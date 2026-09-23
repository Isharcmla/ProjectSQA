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
import java.util.ArrayList;

public class DisambiguateProperties_process_497264529179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69586;

    public DisambiguateProperties_process_497264529179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70910 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term70909 = ((Class) term70910).getDeclaredField((String) "NORMALIZED");
        ((Field) term70909).setAccessible(true);
        Object enum35 = ((Field) term70909).get((Object) null);
        Object term70088 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term70180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term70088, term70088.getClass(), "typeA", term70180);
        setField(term70088, term70088.getClass(), "src", null);
        Object term70218 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term69972 = new ArrayList();
        ((ArrayList) term69972).add(term70088);
        ((ArrayList) term69972).add(term70218);
        term69586 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term69666 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term69920 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term69666, term69666.getClass(), "stage", enum35);
        setField(term69920, term69920.getClass(), "mismatches", term69972);
        setField(term69666, term69666.getClass(), "typeValidator", term69920);
        setField(term69586, term69586.getClass(), "compiler", term69666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term69586, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


