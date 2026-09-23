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

public class DisambiguateProperties_process_497264529217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98235;

    public DisambiguateProperties_process_497264529217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99795 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term99794 = ((Class) term99795).getDeclaredField((String) "NORMALIZED");
        ((Field) term99794).setAccessible(true);
        Object enum57 = ((Field) term99794).get((Object) null);
        Object term98737 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term98841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term98737, term98737.getClass(), "typeA", term98841);
        setField(term98737, term98737.getClass(), "src", null);
        ArrayList term98621 = new ArrayList();
        ((ArrayList) term98621).add(term98737);
        HashSet term99023 = new HashSet();
        term98235 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term98315 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term98569 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term98975 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term98315, term98315.getClass(), "stage", enum57);
        setField(term98569, term98569.getClass(), "mismatches", term98621);
        setField(term98315, term98315.getClass(), "typeValidator", term98569);
        setField(term98235, term98235.getClass(), "compiler", term98315);
        setField(term98975, term98975.getClass(), "invalidatingTypes", term99023);
        setField(term98235, term98235.getClass(), "typeSystem", term98975);
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
            callMethod(klass, "process", argTypes, term98235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


