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

public class TypeCheck_visit_8595247841214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359034;
     Object term359104;

    public TypeCheck_visit_8595247841214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359034 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term359104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359288 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term359358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term359104, term359104.getClass(), "type", 93);
        setIntField(term359174, term359174.getClass(), "type", 93);
        setField(term359174, term359174.getClass(), "jsType", term359288);
        setField(term359104, term359104.getClass(), "first", term359174);
        setField(term359104, term359104.getClass(), "last", term359358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term359104;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term359034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


