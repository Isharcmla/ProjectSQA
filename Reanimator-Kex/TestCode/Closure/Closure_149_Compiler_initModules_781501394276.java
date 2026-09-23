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
import java.util.LinkedList;
import java.util.ArrayList;
import java.lang.String;

public class Compiler_initModules_781501394276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1818223;
     Object term1818371;
     Object term1818649;

    public Compiler_initModules_781501394276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1818223 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1818317 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term1818223, term1818223.getClass(), "options", term1818317);
        setField(term1818223, term1818223.getClass(), "errorManager", null);
        setField(term1818223, term1818223.getClass(), "outStream", null);
        ArrayList term1818555 = new ArrayList();
        Object term1818503 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term1818503, term1818503.getClass(), "inputs", term1818555);
        term1818371 = new LinkedList();
        ((LinkedList) term1818371).add(term1818503);
        Class<? extends Object> term2987737 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term2987736 = ((Class) term2987737).getDeclaredField((String) "SINGLELINE");
        ((Field) term2987736).setAccessible(true);
        Object enum2964 = ((Field) term2987736).get((Object) null);
        term1818649 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term1818649, term1818649.getClass(), "colorizeErrorOutput", false);
        setField(term1818649, term1818649.getClass(), "errorFormat", enum2964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1818371;
        args[2] = term1818649;
        try {
            callMethod(klass, "initModules", argTypes, term1818223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


