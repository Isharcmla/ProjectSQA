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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class NameAnalyzer_collapseReplacements_213420461469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20454;
     Object term20508;

    public NameAnalyzer_collapseReplacements_213420461469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20454 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term20598 = newInstance(Class.forName("java.lang.Object"));
        term20508 = new LinkedList();
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
        ((LinkedList) term20508).add(term20598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term20508;
        try {
            callMethod(klass, "collapseReplacements", argTypes, term20454, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


