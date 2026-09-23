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

public class TypeCheck_checkEnumInitializer_1123305787453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124728;
     Object term124798;

    public TypeCheck_checkEnumInitializer_1123305787453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124728 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term124798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term124798, term124798.getClass(), "type", -65);
        setField(term124798, term124798.getClass(), "jsType", term124890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term124798;
        args[2] = null;
        try {
            callMethod(klass, "checkEnumInitializer", argTypes, term124728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


