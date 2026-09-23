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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class JsAst_init_119039659918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3406;
     Object term3608;
     Object term3611;

    public JsAst_init_119039659918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3302 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        term3406 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        term3608 = newInstance(Class.forName("com.google.javascript.jscomp.JsAst"));
        Object term3609 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        Object term3610 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term3609, term3609.getClass(), "id", null);
        setField(term3608, term3608.getClass(), "inputId", term3609);
        setField(term3610, term3610.getClass(), "fileName", null);
        setBooleanField(term3610, term3610.getClass(), "isExternFile", false);
        setField(term3610, term3610.getClass(), "originalPath", null);
        setField(term3610, term3610.getClass(), "lineOffsets", null);
        setField(term3610, term3610.getClass(), "code", null);
        setField(term3608, term3608.getClass(), "sourceFile", term3610);
        setField(term3608, term3608.getClass(), "fileName", null);
        setField(term3608, term3608.getClass(), "root", null);
        term3611 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(term3611, term3611.getClass(), "fileName", null);
        setBooleanField(term3611, term3611.getClass(), "isExternFile", false);
        setField(term3611, term3611.getClass(), "originalPath", null);
        setField(term3611, term3611.getClass(), "lineOffsets", null);
        setField(term3611, term3611.getClass(), "code", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.JsAst");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SourceFile");
        Object[] args = new Object[1];
        args[0] = term3406;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3608));
        assertTrue(recursiveEquals(term3406, term3611));
    }

};


