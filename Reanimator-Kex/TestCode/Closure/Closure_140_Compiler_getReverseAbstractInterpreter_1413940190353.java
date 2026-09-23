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

public class Compiler_getReverseAbstractInterpreter_1413940190353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573422;

    public Compiler_getReverseAbstractInterpreter_1413940190353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2573422 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2573516 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term2573624 = newInstance(Class.forName("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(term2573422, term2573422.getClass(), "abstractInterpreter", null);
        setField(term2573516, term2573516.getClass(), "codingConvention", term2573624);
        setField(term2573422, term2573422.getClass(), "options", term2573516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReverseAbstractInterpreter", argTypes, term2573422, args);
    }

};


