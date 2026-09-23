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

public class SourceFile_getNumLines_1744244282337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58226;

    public SourceFile_getNumLines_1744244282337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58226 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term58330 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$Generated"));
        setField(term58226, term58226.getClass(), "lineOffsets", null);
        setField(term58226, term58226.getClass(), "referenced", term58330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNumLines", argTypes, term58226, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


