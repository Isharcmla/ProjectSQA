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

public class NameAnalyzer_collapseReplacements_213420461461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14623;
     Object term14677;

    public NameAnalyzer_collapseReplacements_213420461461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14623 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term14767 = newInstance(Class.forName("java.lang.Object"));
        term14677 = new LinkedList();
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
        ((LinkedList) term14677).add(term14767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term14677;
        try {
            callMethod(klass, "collapseReplacements", argTypes, term14623, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


