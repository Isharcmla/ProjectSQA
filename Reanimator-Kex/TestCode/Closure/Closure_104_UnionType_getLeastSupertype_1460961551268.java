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

public class UnionType_getLeastSupertype_1460961551268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94607;
     Object term94755;

    public UnionType_getLeastSupertype_1460961551268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term94655 = new HashSet();
        term94607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term94607, term94607.getClass(), "alternates", term94655);
        term94755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term94873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term94873, term94873.getClass(), "unknown", false);
        setField(term94755, term94755.getClass(), "referencedType", term94873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term94755;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term94607, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


