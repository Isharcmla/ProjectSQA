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

public class TypeValidator_mismatch_193134349991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37338;
     Object term37408;
     Object term37540;
     Object term37642;

    public TypeValidator_mismatch_193134349991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37338 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setBooleanField(term37338, term37338.getClass(), "shouldReport", false);
        term37408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37408, term37408.getClass(), "sourcePosition", 0);
        term37540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term37642 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamespaceType"));
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
        args[0] = null;
        args[1] = term37408;
        args[2] = "{0}\nfound   : {1}\nrequired: {2}";
        args[3] = term37540;
        args[4] = term37642;
        try {
            callMethod(klass, "mismatch", argTypes, term37338, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


