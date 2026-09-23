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

public class Compiler_toSource_1654439666280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2992972;
     Object term2993324;

    public Compiler_toSource_1654439666280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2993326 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$TracerMode");
        Field term2993325 = ((Class) term2993326).getDeclaredField((String) "OFF");
        ((Field) term2993325).setAccessible(true);
        Object enum2970 = ((Field) term2993325).get((Object) null);
        term2992972 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2993066 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term2993066, term2993066.getClass(), "tracer", enum2970);
        setField(term2992972, term2992972.getClass(), "options", term2993066);
        setBooleanField(term2992972, term2992972.getClass(), "useThreads", true);
        term2993324 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler$CodeBuilder"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Compiler$CodeBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term2993324;
        args[1] = 0;
        args[2] = null;
        callMethod(klass, "toSource", argTypes, term2992972, args);
    }

};


