package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_handleBlockComment_510063534232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71397;
     Object term71635;

    public IRFactory_handleBlockComment_510063534232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71397 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term71541 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter"));
        setField(term71397, term71397.getClass(), "errorReporter", term71541);
        setField(term71397, term71397.getClass(), "sourceName", null);
        term71635 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term71635, term71635.getClass(), "value", "\n * @");
        setIntField(term71635, term71635.getClass(), "lineno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term71635;
        callMethod(klass, "handleBlockComment", argTypes, term71397, args);
    }

};


