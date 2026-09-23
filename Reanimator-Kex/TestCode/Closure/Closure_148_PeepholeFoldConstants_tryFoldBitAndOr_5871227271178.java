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

public class PeepholeFoldConstants_tryFoldBitAndOr_5871227271178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278439;
     Object term278509;
     Object term278579;

    public PeepholeFoldConstants_tryFoldBitAndOr_5871227271178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term278509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term278509, term278509.getClass(), "type", 11);
        term278579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term278579, term278579.getClass(), "type", 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term278509;
        args[1] = term278579;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBitAndOr", argTypes, term278439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


