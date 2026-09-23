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

public class FunctionTypeBuilder_reportWarning_990964248293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111484;
     Object term111662;

    public FunctionTypeBuilder_reportWarning_990964248293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111484 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term111570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term111484, term111484.getClass(), "compiler", null);
        setField(term111484, term111484.getClass(), "sourceName", null);
        setIntField(term111570, term111570.getClass(), "sourcePosition", 0);
        setField(term111484, term111484.getClass(), "errorRoot", term111570);
        term111662 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term111662;
        args[1] = null;
        callMethod(klass, "reportWarning", argTypes, term111484, args);
    }

};


