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

public class DisambiguateProperties_process_497264529209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92672;

    public DisambiguateProperties_process_497264529209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94246 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term94245 = ((Class) term94246).getDeclaredField((String) "NORMALIZED");
        ((Field) term94245).setAccessible(true);
        Object enum53 = ((Field) term94245).get((Object) null);
        Object term93174 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term93278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term93174, term93174.getClass(), "typeA", term93278);
        setField(term93174, term93174.getClass(), "src", null);
        ArrayList term93058 = new ArrayList();
        ((ArrayList) term93058).add(term93174);
        HashSet term93472 = new HashSet();
        term92672 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term92752 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term93006 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term93424 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term92752, term92752.getClass(), "stage", enum53);
        setField(term93006, term93006.getClass(), "mismatches", term93058);
        setField(term92752, term92752.getClass(), "typeValidator", term93006);
        setField(term92672, term92672.getClass(), "compiler", term92752);
        setField(term93424, term93424.getClass(), "invalidatingTypes", term93472);
        setField(term92672, term92672.getClass(), "typeSystem", term93424);
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
            callMethod(klass, "process", argTypes, term92672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


