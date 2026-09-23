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

public class MustBeReachingVariableDef_flowThrough_1424472260109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29721;
     Object term29791;
     Object term29921;

    public MustBeReachingVariableDef_flowThrough_1424472260109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29721 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term29791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29791, term29791.getClass(), "type", 100);
        term29921 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term29921, term29921.getClass(), "reachingDef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[2];
        args[0] = term29791;
        args[1] = term29921;
        try {
            callMethod(klass, "flowThrough", argTypes, term29721, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


