package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;

public class IR_block_182125852378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3657;

    public IR_block_182125852378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3657, term3657.getClass(), "type", 125);
        setField(term3657, term3657.getClass(), "next", null);
        setField(term3657, term3657.getClass(), "first", null);
        setField(term3657, term3657.getClass(), "last", null);
        setField(term3657, term3657.getClass(), "propListHead", null);
        setIntField(term3657, term3657.getClass(), "sourcePosition", -1);
        setField(term3657, term3657.getClass(), "jsType", null);
        setField(term3657, term3657.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "block", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3657));
    }

};


