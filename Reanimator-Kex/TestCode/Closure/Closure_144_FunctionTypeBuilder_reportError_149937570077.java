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

public class FunctionTypeBuilder_reportError_149937570077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50120;
     Object term50362;

    public FunctionTypeBuilder_reportError_149937570077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50120 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term50200 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term50397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50120, term50120.getClass(), "compiler", term50200);
        setField(term50120, term50120.getClass(), "sourceName", null);
        setIntField(term50397, term50397.getClass(), "sourcePosition", 0);
        setField(term50120, term50120.getClass(), "errorRoot", term50397);
        Class<? extends Object> term50521 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term50520 = ((Class) term50521).getDeclaredField((String) "OFF");
        ((Field) term50520).setAccessible(true);
        Object enum82 = ((Field) term50520).get((Object) null);
        term50362 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        setField(term50362, term50362.getClass(), "format", term50397);
        setField(term50362, term50362.getClass(), "level", enum82);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term50362;
        args[1] = null;
        callMethod(klass, "reportError", argTypes, term50120, args);
    }

};


