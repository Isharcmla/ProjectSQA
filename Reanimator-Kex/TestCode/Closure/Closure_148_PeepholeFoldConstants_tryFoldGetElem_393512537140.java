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

public class PeepholeFoldConstants_tryFoldGetElem_393512537140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25021;
     Object term25091;
     Object term25161;

    public PeepholeFoldConstants_tryFoldGetElem_393512537140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25021 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25091, term25091.getClass(), "type", 35);
        term25161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25161, term25161.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term25091;
        args[1] = term25161;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldGetElem", argTypes, term25021, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


