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

public class Compiler_init_1176485500305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661050;
     Object term660803;
     Object term661144;

    public Compiler_init_1176485500305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661050 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term661050, term661050.getClass(), "options", null);
        setField(term661050, term661050.getClass(), "errorManager", null);
        setField(term661050, term661050.getClass(), "outStream", null);
        term660803 = (Object[]) newArray("com.google.javascript.jscomp.JSModule", 0);
        Class<? extends Object> term2542645 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term2542644 = ((Class) term2542645).getDeclaredField((String) "MULTILINE");
        ((Field) term2542644).setAccessible(true);
        Object enum1953 = ((Field) term2542644).get((Object) null);
        term661144 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term661144, term661144.getClass(), "colorizeErrorOutput", false);
        setField(term661144, term661144.getClass(), "errorFormat", enum1953);
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
        args[1] = term660803;
        args[2] = term661144;
        try {
            callMethod(klass, "init", argTypes, term661050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


