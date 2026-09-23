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
import java.lang.Object;

public class UnionType_getLeastSupertype_1460961551226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77279;
     Object term77379;

    public UnionType_getLeastSupertype_1460961551226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        term77379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term77479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term77379, term77379.getClass(), "referencedType", term77479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term77379;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term77279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


