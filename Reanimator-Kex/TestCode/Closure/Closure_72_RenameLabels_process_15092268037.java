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

public class RenameLabels_process_15092268037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16962;
     Object term17032;

    public RenameLabels_process_15092268037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16962 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term16962, term16962.getClass(), "compiler", null);
        term17032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17032, term17032.getClass(), "type", 117);
        setField(term17172, term17172.getClass(), "next", null);
        setIntField(term17172, term17172.getClass(), "type", 0);
        setField(term17172, term17172.getClass(), "first", null);
        setField(term17102, term17102.getClass(), "next", term17172);
        setIntField(term17102, term17102.getClass(), "type", 116);
        setField(term17102, term17102.getClass(), "first", null);
        setField(term17032, term17032.getClass(), "first", term17102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17032;
        try {
            callMethod(klass, "process", argTypes, term16962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


