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

public class DisambiguateProperties_recordInvalidationError_1320724081111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37206;
     Object term37394;

    public DisambiguateProperties_recordInvalidationError_1320724081111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37206 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term37300 = newInstance(Class.forName("com.google.common.collect.LinkedHashMultimap"));
        setField(term37206, term37206.getClass(), "invalidationMap", term37300);
        ArrayList term37446 = new ArrayList();
        term37394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term37394, term37394.getClass(), "alternates", term37446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term37394;
        args[1] = null;
        try {
            callMethod(klass, "recordInvalidationError", argTypes, term37206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


