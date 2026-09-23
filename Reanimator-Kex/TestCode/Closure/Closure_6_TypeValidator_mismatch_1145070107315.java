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

public class TypeValidator_mismatch_1145070107315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105095;
     Object term105185;
     Object term105255;
     Object term105361;
     Object term105457;

    public TypeValidator_mismatch_1145070107315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105095 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term105185 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term105185, term105185.getClass(), "sourceName", null);
        term105255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term105361 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        term105457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
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
        args[0] = term105185;
        args[1] = term105255;
        args[2] = null;
        args[3] = term105361;
        args[4] = term105457;
        callMethod(klass, "mismatch", argTypes, term105095, args);
    }

};


