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

public class ClosureCodingConvention_identifyTypeDeclarationCall_2134058849576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185530;
     Object term185622;

    public ClosureCodingConvention_identifyTypeDeclarationCall_2134058849576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185530 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term185622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term185714 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term185714, term185714.getClass(), "type", 33);
        setField(term185622, term185622.getClass(), "first", term185714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185622;
        try {
            callMethod(klass, "identifyTypeDeclarationCall", argTypes, term185530, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


