package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class AnnotatedClass_init_12584037780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AnnotatedClass_init_12584037780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new LinkedList();
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


