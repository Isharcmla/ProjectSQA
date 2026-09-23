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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class AbstractCommandLineRunner_createJsModules_155090448310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6137;
     Object term6198;

    public AbstractCommandLineRunner_createJsModules_155090448310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6137 = new LinkedList();
        ((LinkedList) term6137).add("wSQxaModmm");
        ((LinkedList) term6137).add("UlajhuVLaP");
        ((LinkedList) term6137).add("");
        ((LinkedList) term6137).add((Object)null);
        ((LinkedList) term6137).add((Object)null);
        ((LinkedList) term6137).add((Object)null);
        ((LinkedList) term6137).add((Object)null);
        ((LinkedList) term6137).add((Object)null);
        ((LinkedList) term6137).add((Object)null);
        term6198 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term6137;
        args[1] = term6198;
        callMethod(klass, "createJsModules", argTypes, null, args);
    }

};


