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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashMap;

public class MakeDeclaredNamesUnique_getContextualRenameInverter_55411439611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704;

    public MakeDeclaredNamesUnique_getContextualRenameInverter_55411439611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term706 = new ArrayDeque();
        HashMap term710 = new HashMap();
        term704 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter"));
        Object term705 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term704, term704.getClass(), "compiler", null);
        setField(term705, term705.getClass(), "asList", null);
        setField(term704, term704.getClass(), "referencedNames", term705);
        setField(term704, term704.getClass(), "referenceStack", term706);
        setField(term704, term704.getClass(), "nameMap", term710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getContextualRenameInverter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term704));
    }

};


