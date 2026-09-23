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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618999;
     Object term619085;
     Object term619241;
     Object term619327;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618999 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term619085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term619155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term619155, term619155.getClass(), "type", 108);
        setField(term619085, term619085.getClass(), "parent", term619155);
        setIntField(term619085, term619085.getClass(), "type", 0);
        term619241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term619241, term619241.getClass(), "type", 88);
        term619327 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term619327, term619327.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term619085;
        args[1] = term619241;
        args[2] = term619327;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term618999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


