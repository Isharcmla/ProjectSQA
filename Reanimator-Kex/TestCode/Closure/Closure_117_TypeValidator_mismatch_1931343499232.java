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

public class TypeValidator_mismatch_1931343499232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85301;
     Object term85409;
     Object term85543;

    public TypeValidator_mismatch_1931343499232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85301 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term85301, term85301.getClass(), "shouldReport", false);
        term85409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85409, term85409.getClass(), "sourcePosition", 0);
        term85543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = "";
        args[1] = term85409;
        args[2] = "";
        args[3] = term85543;
        args[4] = null;
        callMethod(klass, "mismatch", argTypes, term85301, args);
    }

};


