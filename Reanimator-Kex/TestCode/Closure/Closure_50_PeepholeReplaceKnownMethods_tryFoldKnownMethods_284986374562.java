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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3523662;
     Object term3523754;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3523662 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3523754 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3523846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3523938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3524030 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3524160 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3523846, term3523846.getClass(), "type", 35);
        setIntField(term3524030, term3524030.getClass(), "type", 40);
        setField(term3524030, term3524030.getClass(), "str", "charCodeAt");
        setField(term3523938, term3523938.getClass(), "next", term3524030);
        setIntField(term3523938, term3523938.getClass(), "type", 40);
        setField(term3523846, term3523846.getClass(), "first", term3523938);
        setIntField(term3524160, term3524160.getClass(), "type", 39);
        setField(term3523846, term3523846.getClass(), "next", term3524160);
        setField(term3523754, term3523754.getClass(), "first", term3523846);
        setIntField(term3523754, term3523754.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3523754;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3523662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


