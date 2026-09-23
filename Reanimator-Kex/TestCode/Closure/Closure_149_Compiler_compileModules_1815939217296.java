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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class Compiler_compileModules_1815939217296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3010149;
     Object term3010203;
     Object term3010297;

    public Compiler_compileModules_1815939217296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3010149 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3010149, term3010149.getClass(), "jsRoot", null);
        setField(term3010149, term3010149.getClass(), "options", null);
        setField(term3010149, term3010149.getClass(), "errorManager", null);
        setField(term3010149, term3010149.getClass(), "outStream", null);
        term3010203 = new LinkedList();
        Class<? extends Object> term3012889 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term3012888 = ((Class) term3012889).getDeclaredField((String) "SOURCELESS");
        ((Field) term3012888).setAccessible(true);
        Object enum2981 = ((Field) term3012888).get((Object) null);
        term3010297 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setBooleanField(term3010297, term3010297.getClass(), "colorizeErrorOutput", false);
        setField(term3010297, term3010297.getClass(), "errorFormat", enum2981);
        setField(term3010297, term3010297.getClass(), "warningsGuard", null);
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
        args[1] = term3010203;
        args[2] = term3010297;
        try {
            callMethod(klass, "compileModules", argTypes, term3010149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


