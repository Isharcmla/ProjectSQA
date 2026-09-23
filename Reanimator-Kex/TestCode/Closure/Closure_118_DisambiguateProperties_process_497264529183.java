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

public class DisambiguateProperties_process_497264529183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73551;

    public DisambiguateProperties_process_497264529183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75096 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term75095 = ((Class) term75096).getDeclaredField((String) "NORMALIZED");
        ((Field) term75095).setAccessible(true);
        Object enum39 = ((Field) term75095).get((Object) null);
        Object term74053 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term74151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term74053, term74053.getClass(), "typeA", term74151);
        setField(term74053, term74053.getClass(), "src", null);
        ArrayList term73937 = new ArrayList();
        ((ArrayList) term73937).add(term74053);
        HashSet term74333 = new HashSet();
        term73551 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term73631 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term73885 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term74285 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term73631, term73631.getClass(), "stage", enum39);
        setField(term73885, term73885.getClass(), "mismatches", term73937);
        setField(term73631, term73631.getClass(), "typeValidator", term73885);
        setField(term73551, term73551.getClass(), "compiler", term73631);
        setField(term74285, term74285.getClass(), "invalidatingTypes", term74333);
        setField(term73551, term73551.getClass(), "typeSystem", term74285);
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
            callMethod(klass, "process", argTypes, term73551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


