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

public class DisambiguateProperties_process_497264529119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39776;

    public DisambiguateProperties_process_497264529119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41095 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term41094 = ((Class) term41095).getDeclaredField((String) "NORMALIZED");
        ((Field) term41094).setAccessible(true);
        Object enum20 = ((Field) term41094).get((Object) null);
        ArrayList term40162 = new ArrayList();
        ((ArrayList) term40162).add((Object)null);
        term39776 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term39856 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term40110 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term39856, term39856.getClass(), "stage", enum20);
        setField(term40110, term40110.getClass(), "mismatches", term40162);
        setField(term39856, term39856.getClass(), "typeValidator", term40110);
        setField(term39776, term39776.getClass(), "compiler", term39856);
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
            callMethod(klass, "process", argTypes, term39776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


