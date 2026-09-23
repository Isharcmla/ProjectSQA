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
import java.util.HashSet;

public class DisambiguateProperties_process_497264529207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90494;

    public DisambiguateProperties_process_497264529207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92050 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term92049 = ((Class) term92050).getDeclaredField((String) "NORMALIZED");
        ((Field) term92049).setAccessible(true);
        Object enum51 = ((Field) term92049).get((Object) null);
        Object term90996 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term91088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term90996, term90996.getClass(), "typeA", term91088);
        setField(term90996, term90996.getClass(), "src", null);
        ArrayList term90880 = new ArrayList();
        ((ArrayList) term90880).add(term90996);
        HashSet term91282 = new HashSet();
        term90494 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term90574 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term90828 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term91234 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term90574, term90574.getClass(), "stage", enum51);
        setField(term90828, term90828.getClass(), "mismatches", term90880);
        setField(term90574, term90574.getClass(), "typeValidator", term90828);
        setField(term90494, term90494.getClass(), "compiler", term90574);
        setField(term91234, term91234.getClass(), "invalidatingTypes", term91282);
        setField(term90494, term90494.getClass(), "typeSystem", term91234);
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
            callMethod(klass, "process", argTypes, term90494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


