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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClosureCodingConvention_typeofClassDefiningName_1978408985259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113812;
     Object term113882;

    public ClosureCodingConvention_typeofClassDefiningName_1978408985259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113812 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term113882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113882, term113882.getClass(), "type", 33);
        setIntField(term113952, term113952.getClass(), "type", 40);
        setField(term113882, term113882.getClass(), "last", term113952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113882;
        try {
            callMethod(klass, "typeofClassDefiningName", argTypes, term113812, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


