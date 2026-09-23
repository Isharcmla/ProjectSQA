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

public class TypeCheck_checkNoTypeCheckSection_1637574393173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46553;
     Object term46623;

    public TypeCheck_checkNoTypeCheckSection_1637574393173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46553 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term46623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46623, term46623.getClass(), "type", 125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term46623;
        args[1] = false;
        try {
            callMethod(klass, "checkNoTypeCheckSection", argTypes, term46553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


