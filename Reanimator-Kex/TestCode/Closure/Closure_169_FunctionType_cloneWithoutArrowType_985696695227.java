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

public class FunctionType_cloneWithoutArrowType_985696695227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235019;

    public FunctionType_cloneWithoutArrowType_985696695227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235019 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term235123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term235193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term235019, term235019.getClass(), "registry", term235123);
        setField(term235019, term235019.getClass(), "className", null);
        setField(term235019, term235019.getClass(), "ownerFunction", null);
        setField(term235019, term235019.getClass(), "source", term235193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "cloneWithoutArrowType", argTypes, term235019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


