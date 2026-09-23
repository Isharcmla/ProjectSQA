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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class FunctionType_setImplementedInterfaces_1966858440151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72244;
     Object term72298;

    public FunctionType_setImplementedInterfaces_1966858440151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term72388 = newInstance(Class.forName("java.lang.Object"));
        term72298 = new LinkedList();
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
        ((LinkedList) term72298).add(term72388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term72298;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term72244, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


