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
import java.util.HashMap;
import java.lang.Object;

public class NameAnalyzer_referenceAliases_160787909663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18611;

    public NameAnalyzer_referenceAliases_160787909663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18749 = newInstance(Class.forName("java.lang.Object"));
        Object term18787 = newInstance(Class.forName("java.lang.Object"));
        HashMap term18659 = new HashMap();
        ((HashMap) term18659).put(term18749, term18749);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        ((HashMap) term18659).put(term18787, term18787);
        term18611 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term18611, term18611.getClass(), "aliases", term18659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "referenceAliases", argTypes, term18611, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


