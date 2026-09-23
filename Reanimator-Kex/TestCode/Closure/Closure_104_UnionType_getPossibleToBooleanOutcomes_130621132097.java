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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashSet;
import java.lang.Object;

public class UnionType_getPossibleToBooleanOutcomes_130621132097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25845;

    public UnionType_getPossibleToBooleanOutcomes_130621132097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26031 = newInstance(Class.forName("java.lang.Object"));
        HashSet term25893 = new HashSet();
        ((HashSet) term25893).add((Object)null);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        ((HashSet) term25893).add(term26031);
        term25845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term25845, term25845.getClass(), "alternates", term25893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPossibleToBooleanOutcomes", argTypes, term25845, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


