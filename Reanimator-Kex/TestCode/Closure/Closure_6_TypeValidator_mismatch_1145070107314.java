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

public class TypeValidator_mismatch_1145070107314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104600;
     Object term104690;
     Object term104798;
     Object term104927;

    public TypeValidator_mismatch_1145070107314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104600 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term104600, term104600.getClass(), "shouldReport", false);
        term104690 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term104690, term104690.getClass(), "sourceName", "");
        term104798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104798, term104798.getClass(), "sourcePosition", 0);
        term104927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term104690;
        args[1] = term104798;
        args[2] = "";
        args[3] = term104927;
        args[4] = null;
        callMethod(klass, "mismatch", argTypes, term104600, args);
    }

};


