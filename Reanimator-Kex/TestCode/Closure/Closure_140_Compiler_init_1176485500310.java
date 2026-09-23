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
import java.util.ArrayList;
import java.lang.String;

public class Compiler_init_1176485500310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1305346;
     Object term1305100;
     Object term1305572;

    public Compiler_init_1176485500310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1305346 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term1305346, term1305346.getClass(), "options", null);
        setField(term1305346, term1305346.getClass(), "errorManager", null);
        setField(term1305346, term1305346.getClass(), "outStream", null);
        ArrayList term1305478 = new ArrayList();
        term1305100 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 1);
        Object term1305426 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1305426, term1305426.getClass(), "inputs", term1305478);
        setElement(term1305100, 0, term1305426);
        Class<? extends Object> term2549092 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term2549091 = ((Class) term2549092).getDeclaredField((String) "SINGLELINE");
        ((Field) term2549091).setAccessible(true);
        Object enum1962 = ((Field) term2549091).get((Object) null);
        term1305572 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term1305572, term1305572.getClass(), "colorizeErrorOutput", false);
        setField(term1305572, term1305572.getClass(), "errorFormat", enum1962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1305100;
        args[2] = term1305572;
        try {
            callMethod(klass, "init", argTypes, term1305346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


