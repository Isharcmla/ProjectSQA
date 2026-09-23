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
import java.util.HashMap;

public class MakeDeclaredNamesUnique_getContextualRenameInverter_55411439611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;

    public MakeDeclaredNamesUnique_getContextualRenameInverter_55411439611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term724 = new HashMap();
        term723 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenameInverter"));
        setField(term723, term723.getClass(), "compiler", null);
        setField(term723, term723.getClass(), "nameMap", term724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getContextualRenameInverter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term723));
    }

};


