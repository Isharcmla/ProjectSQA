package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86241;
     Object term86389;

    public UnionType_getLeastSupertype_1460961551245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term86289 = new HashSet();
        term86241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term86241, term86241.getClass(), "alternates", term86289);
        term86389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term86499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term86499, term86499.getClass(), "unknown", false);
        setField(term86389, term86389.getClass(), "referencedType", term86499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term86389;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term86241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


