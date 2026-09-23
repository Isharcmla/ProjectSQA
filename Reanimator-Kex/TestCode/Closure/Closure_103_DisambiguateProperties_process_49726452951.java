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
import java.util.ArrayList;

public class DisambiguateProperties_process_49726452951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208432;

    public DisambiguateProperties_process_49726452951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term208654 = new ArrayList();
        term208432 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term208512 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term208602 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term208602, term208602.getClass(), "mismatches", term208654);
        setField(term208512, term208512.getClass(), "typeValidator", term208602);
        setField(term208432, term208432.getClass(), "compiler", term208512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term208432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


