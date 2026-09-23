package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.util.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class ClassUtil_findSuperTypes_25822007877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term37807;
     Object term37798;

    public ClassUtil_findSuperTypes_25822007877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new LinkedList();
        ((LinkedList) term7).add((Object)null);
        ((LinkedList) term7).add((Object)null);
        ((LinkedList) term7).add((Object)null);
        ((LinkedList) term7).add((Object)null);
        ((LinkedList) term7).add((Object)null);
        term37807 = new LinkedList();
        ((LinkedList) term37807).add((Object)null);
        ((LinkedList) term37807).add((Object)null);
        ((LinkedList) term37807).add((Object)null);
        ((LinkedList) term37807).add((Object)null);
        ((LinkedList) term37807).add((Object)null);
        term37798 = new LinkedList();
        ((LinkedList) term37798).add((Object)null);
        ((LinkedList) term37798).add((Object)null);
        ((LinkedList) term37798).add((Object)null);
        ((LinkedList) term37798).add((Object)null);
        ((LinkedList) term37798).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.ClassUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term7;
        Object retValue = callMethod(klass, "findSuperTypes", argTypes, null, args);
        assertTrue(recursiveEquals(term7, term37807));
        assertTrue(recursiveEquals(retValue, term37798));
    }

};


