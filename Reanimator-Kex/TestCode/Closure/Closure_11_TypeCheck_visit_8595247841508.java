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

public class TypeCheck_visit_8595247841508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470682;
     Object term470752;

    public TypeCheck_visit_8595247841508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470682 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term470752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term470822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term470918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term470752, term470752.getClass(), "type", 17);
        setField(term470822, term470822.getClass(), "jsType", term470918);
        setField(term470752, term470752.getClass(), "first", term470822);
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
        args[1] = term470752;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term470682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


