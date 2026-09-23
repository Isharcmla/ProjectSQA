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

public class DisambiguateProperties_process_497264529175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66860;

    public DisambiguateProperties_process_497264529175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68196 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term68195 = ((Class) term68196).getDeclaredField((String) "NORMALIZED");
        ((Field) term68195).setAccessible(true);
        Object enum33 = ((Field) term68195).get((Object) null);
        Object term67362 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term67466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term67362, term67362.getClass(), "typeA", term67466);
        setField(term67362, term67362.getClass(), "src", null);
        Object term67504 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term67246 = new ArrayList();
        ((ArrayList) term67246).add(term67362);
        ((ArrayList) term67246).add(term67504);
        term66860 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term66940 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term67194 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term66940, term66940.getClass(), "stage", enum33);
        setField(term67194, term67194.getClass(), "mismatches", term67246);
        setField(term66940, term66940.getClass(), "typeValidator", term67194);
        setField(term66860, term66860.getClass(), "compiler", term66940);
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
            callMethod(klass, "process", argTypes, term66860, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


