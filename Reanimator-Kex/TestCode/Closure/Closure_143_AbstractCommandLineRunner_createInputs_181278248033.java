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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Boolean;

public class AbstractCommandLineRunner_createInputs_181278248033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6002;
     Object term6047;

    public AbstractCommandLineRunner_createInputs_181278248033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6002 = new LinkedList();
        ((LinkedList) term6002).add("OWDIEULEFu");
        ((LinkedList) term6002).add("dWRymuLBtr");
        ((LinkedList) term6002).add("");
        ((LinkedList) term6002).add((Object)null);
        ((LinkedList) term6002).add((Object)null);
        term6047 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term6002;
        args[1] = term6047;
        try {
            callMethod(klass, "createInputs", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


