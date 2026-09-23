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

public class TypeValidator_mismatch_1145070107311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103230;
     Object term103320;
     Object term103390;
     Object term103522;
     Object term103610;

    public TypeValidator_mismatch_1145070107311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103230 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term103230, term103230.getClass(), "shouldReport", false);
        term103320 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term103320, term103320.getClass(), "sourceName", null);
        term103390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103390, term103390.getClass(), "sourcePosition", 0);
        term103522 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term103610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
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
        args[0] = term103320;
        args[1] = term103390;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term103522;
        args[4] = term103610;
        callMethod(klass, "mismatch", argTypes, term103230, args);
    }

};


