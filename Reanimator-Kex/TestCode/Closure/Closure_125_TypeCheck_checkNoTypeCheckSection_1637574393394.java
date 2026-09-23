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

public class TypeCheck_checkNoTypeCheckSection_1637574393394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97260;
     Object term97330;

    public TypeCheck_checkNoTypeCheckSection_1637574393394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97260 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term97260, term97260.getClass(), "validator", null);
        setIntField(term97260, term97260.getClass(), "noTypeCheckSection", -1);
        term97330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97330, term97330.getClass(), "type", 86);
        setField(term97330, term97330.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term97330;
        args[1] = false;
        try {
            callMethod(klass, "checkNoTypeCheckSection", argTypes, term97260, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


