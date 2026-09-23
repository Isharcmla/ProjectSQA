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

public class TypeValidator_mismatch_1145070107287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85153;
     Object term85243;
     Object term85423;
     Object term85527;

    public TypeValidator_mismatch_1145070107287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85153 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term85153, term85153.getClass(), "shouldReport", false);
        term85243 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term85243, term85243.getClass(), "sourceName", "");
        term85423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term85527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
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
        args[0] = term85243;
        args[1] = null;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term85423;
        args[4] = term85527;
        callMethod(klass, "mismatch", argTypes, term85153, args);
    }

};


