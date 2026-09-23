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

public class MustBeReachingVariableDef_flowThrough_1424472260147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40575;
     Object term40645;
     Object term40985;

    public MustBeReachingVariableDef_flowThrough_1424472260147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40575 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term40645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40645, term40645.getClass(), "type", 292681826);
        setIntField(term40715, term40715.getClass(), "type", 493620644);
        setIntField(term40785, term40785.getClass(), "type", 1596070772);
        setField(term40785, term40785.getClass(), "first", null);
        setField(term40785, term40785.getClass(), "next", null);
        setField(term40715, term40715.getClass(), "first", term40785);
        setIntField(term40855, term40855.getClass(), "type", 104);
        setField(term40715, term40715.getClass(), "next", term40855);
        setField(term40645, term40645.getClass(), "first", term40715);
        term40985 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term40985, term40985.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term40645;
        args[1] = term40985;
        try {
            callMethod(klass, "flowThrough", argTypes, term40575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


