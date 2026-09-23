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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_mismatch_1931343499194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52032;
     Object term52220;
     Object term52356;
     Object term52466;

    public TypeValidator_mismatch_1931343499194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52032 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term52112 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term52032, term52032.getClass(), "shouldReport", true);
        setField(term52032, term52032.getClass(), "compiler", term52112);
        term52220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52220, term52220.getClass(), "sourcePosition", 0);
        term52356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        term52466 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
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
        args[1] = term52220;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term52356;
        args[4] = term52466;
        try {
            callMethod(klass, "mismatch", argTypes, term52032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


