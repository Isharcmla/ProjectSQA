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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_typeofClassDefiningName_1978408985117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57147;
     Object term57239;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57147 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term57239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term57331 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term57239, term57239.getClass(), "type", 33);
        setField(term57239, term57239.getClass(), "last", term57331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57239;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term57147, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


