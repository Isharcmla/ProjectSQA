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

public class VarCheck_process_146632422071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25100;
     Object term25170;

    public VarCheck_process_146632422071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25100 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        setBooleanField(term25100, term25100.getClass(), "sanityCheck", false);
        setField(term25100, term25100.getClass(), "compiler", null);
        term25170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25170, term25170.getClass(), "type", 0);
        setField(term25310, term25310.getClass(), "next", term25380);
        setIntField(term25310, term25310.getClass(), "type", 0);
        setField(term25310, term25310.getClass(), "first", null);
        setField(term25240, term25240.getClass(), "next", term25310);
        setIntField(term25240, term25240.getClass(), "type", 0);
        setField(term25450, term25450.getClass(), "next", null);
        setIntField(term25450, term25450.getClass(), "type", 0);
        setField(term25450, term25450.getClass(), "first", null);
        setField(term25240, term25240.getClass(), "first", term25450);
        setField(term25170, term25170.getClass(), "first", term25240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term25170;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term25100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


