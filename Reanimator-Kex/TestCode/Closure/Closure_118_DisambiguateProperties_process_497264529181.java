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

public class DisambiguateProperties_process_497264529181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71507;

    public DisambiguateProperties_process_497264529181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term72945 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term72944 = ((Class) term72945).getDeclaredField((String) "NORMALIZED");
        ((Field) term72944).setAccessible(true);
        Object enum37 = ((Field) term72944).get((Object) null);
        Object term72009 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term72107 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term72009, term72009.getClass(), "typeA", term72107);
        setField(term72009, term72009.getClass(), "src", null);
        ArrayList term71893 = new ArrayList();
        ((ArrayList) term71893).add(term72009);
        term71507 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term71587 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term71841 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term72253 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term71587, term71587.getClass(), "stage", enum37);
        setField(term71841, term71841.getClass(), "mismatches", term71893);
        setField(term71587, term71587.getClass(), "typeValidator", term71841);
        setField(term71507, term71507.getClass(), "compiler", term71587);
        setField(term71507, term71507.getClass(), "typeSystem", term72253);
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
            callMethod(klass, "process", argTypes, term71507, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


