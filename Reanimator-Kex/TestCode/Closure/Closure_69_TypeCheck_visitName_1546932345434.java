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

public class TypeCheck_visitName_1546932345434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130343;
     Object term130517;
     Object term130587;

    public TypeCheck_visitName_1546932345434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130343 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term130447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term130343, term130343.getClass(), "typeRegistry", term130447);
        term130517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130517, term130517.getClass(), "jsType", null);
        term130587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term130587, term130587.getClass(), "type", 0);
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
        args[1] = term130517;
        args[2] = term130587;
        try {
            callMethod(klass, "visitName", argTypes, term130343, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


