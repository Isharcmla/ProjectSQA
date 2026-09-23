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

public class FunctionTypeBuilder_reportWarning_99096424884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53077;
     Object term53319;

    public FunctionTypeBuilder_reportWarning_99096424884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53077 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term53157 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term53354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term53077, term53077.getClass(), "compiler", term53157);
        setField(term53077, term53077.getClass(), "sourceName", null);
        setIntField(term53354, term53354.getClass(), "sourcePosition", 0);
        setField(term53077, term53077.getClass(), "errorRoot", term53354);
        Class<? extends Object> term53478 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term53477 = ((Class) term53478).getDeclaredField((String) "OFF");
        ((Field) term53477).setAccessible(true);
        Object enum83 = ((Field) term53477).get((Object) null);
        term53319 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        setField(term53319, term53319.getClass(), "format", term53354);
        setField(term53319, term53319.getClass(), "level", enum83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term53319;
        args[1] = null;
        callMethod(klass, "reportWarning", argTypes, term53077, args);
    }

};


