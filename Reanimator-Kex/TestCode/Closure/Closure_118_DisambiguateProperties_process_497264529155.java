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

public class DisambiguateProperties_process_497264529155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56789;

    public DisambiguateProperties_process_497264529155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58074 = Class.forName((String) "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage");
        Field term58073 = ((Class) term58074).getDeclaredField((String) "NORMALIZED");
        ((Field) term58073).setAccessible(true);
        Object enum29 = ((Field) term58073).get((Object) null);
        Object term57291 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        Object term57389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term57291, term57291.getClass(), "typeA", term57389);
        setField(term57291, term57291.getClass(), "src", null);
        ArrayList term57175 = new ArrayList();
        ((ArrayList) term57175).add(term57291);
        term56789 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term56869 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term57123 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term56869, term56869.getClass(), "stage", enum29);
        setField(term57123, term57123.getClass(), "mismatches", term57175);
        setField(term56869, term56869.getClass(), "typeValidator", term57123);
        setField(term56789, term56789.getClass(), "compiler", term56869);
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
            callMethod(klass, "process", argTypes, term56789, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


