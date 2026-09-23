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

public class Compiler_initModules_781501394155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971769;
     Object term971957;

    public Compiler_initModules_781501394155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term971769 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term971863 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term971769, term971769.getClass(), "options", term971863);
        setField(term971769, term971769.getClass(), "errorManager", null);
        setField(term971769, term971769.getClass(), "outStream", null);
        Class<? extends Object> term972231 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term972230 = ((Class) term972231).getDeclaredField((String) "SINGLELINE");
        ((Field) term972230).setAccessible(true);
        Object enum2064 = ((Field) term972230).get((Object) null);
        term971957 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term972189 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        Object term972229 = newInstance(Class.forName("java.util.TreeSet"));
        setBooleanField(term971957, term971957.getClass(), "colorizeErrorOutput", false);
        setField(term971957, term971957.getClass(), "errorFormat", enum2064);
        setField(term972189, term972189.getClass(), "guards", term972229);
        setField(term971957, term971957.getClass(), "warningsGuard", term972189);
        setField(null, Class.forName("com.google.javascript.jscomp.DiagnosticGroups"), "CHECK_TYPES", null);
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
        args[1] = null;
        args[2] = term971957;
        callMethod(klass, "initModules", argTypes, term971769, args);
    }

};


