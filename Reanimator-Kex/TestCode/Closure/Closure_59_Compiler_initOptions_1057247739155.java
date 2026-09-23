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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Compiler_initOptions_1057247739155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852840;
     Object term853028;

    public Compiler_initOptions_1057247739155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852840 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term852934 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term852840, term852840.getClass(), "options", term852934);
        setField(term852840, term852840.getClass(), "errorManager", null);
        setField(term852840, term852840.getClass(), "outStream", null);
        Class<? extends Object> term853302 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term853301 = ((Class) term853302).getDeclaredField((String) "SINGLELINE");
        ((Field) term853301).setAccessible(true);
        Object enum1929 = ((Field) term853301).get((Object) null);
        term853028 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term853260 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        Object term853300 = newInstance(Class.forName("java.util.TreeSet"));
        setBooleanField(term853028, term853028.getClass(), "colorizeErrorOutput", false);
        setField(term853028, term853028.getClass(), "errorFormat", enum1929);
        setField(term853260, term853260.getClass(), "guards", term853300);
        setField(term853028, term853028.getClass(), "warningsGuard", term853260);
        setField(null, Class.forName("com.google.javascript.jscomp.DiagnosticGroups"), "CHECK_TYPES", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term853028;
        callMethod(klass, "initOptions", argTypes, term852840, args);
    }

};


