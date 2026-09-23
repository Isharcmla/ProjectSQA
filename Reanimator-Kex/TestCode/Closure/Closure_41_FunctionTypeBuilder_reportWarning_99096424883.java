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

public class FunctionTypeBuilder_reportWarning_99096424883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27032;
     Object term26981;

    public FunctionTypeBuilder_reportWarning_99096424883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27032 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term27072 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term27107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27032, term27032.getClass(), "compiler", term27072);
        setField(term27032, term27032.getClass(), "sourceName", null);
        setIntField(term27107, term27107.getClass(), "sourcePosition", 0);
        setField(term27032, term27032.getClass(), "errorRoot", term27107);
        Class<? extends Object> term27231 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term27230 = ((Class) term27231).getDeclaredField((String) "OFF");
        ((Field) term27230).setAccessible(true);
        Object enum29 = ((Field) term27230).get((Object) null);
        term26981 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        setField(term26981, term26981.getClass(), "format", term27032);
        setField(term26981, term26981.getClass(), "level", enum29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term26981;
        args[1] = null;
        callMethod(klass, "reportWarning", argTypes, term27032, args);
    }

};


