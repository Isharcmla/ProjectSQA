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
     Object term25502;
     Object term25451;

    public FunctionTypeBuilder_reportError_149937570077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25502 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term25542 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term25577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25502, term25502.getClass(), "compiler", term25542);
        setField(term25502, term25502.getClass(), "sourceName", null);
        setIntField(term25577, term25577.getClass(), "sourcePosition", 0);
        setField(term25502, term25502.getClass(), "errorRoot", term25577);
        Class<? extends Object> term25701 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term25700 = ((Class) term25701).getDeclaredField((String) "OFF");
        ((Field) term25700).setAccessible(true);
        Object enum28 = ((Field) term25700).get((Object) null);
        term25451 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        setField(term25451, term25451.getClass(), "format", term25502);
        setField(term25451, term25451.getClass(), "level", enum28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term25451;
        args[1] = null;
        callMethod(klass, "reportError", argTypes, term25502, args);
    }

};


