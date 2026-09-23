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

public class MustBeReachingVariableDef_flowThrough_1424472260153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43047;
     Object term43117;
     Object term43317;

    public MustBeReachingVariableDef_flowThrough_1424472260153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43047 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term43117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43117, term43117.getClass(), "type", 292681826);
        setIntField(term43187, term43187.getClass(), "type", 119);
        setField(term43117, term43117.getClass(), "first", term43187);
        term43317 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term43317, term43317.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term43117;
        args[1] = term43317;
        try {
            callMethod(klass, "flowThrough", argTypes, term43047, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


