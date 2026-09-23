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
import java.lang.Object;

public class FunctionType_hasAnyTemplateInternal_552628159261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255610;

    public FunctionType_hasAnyTemplateInternal_552628159261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term255742 = newInstance(Class.forName("com.google.common.collect.ImmutableMultimap$Keys$KeysEntrySet$1"));
        setField(term255610, term255610.getClass(), "templateTypeNames", term255742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasAnyTemplateInternal", argTypes, term255610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


