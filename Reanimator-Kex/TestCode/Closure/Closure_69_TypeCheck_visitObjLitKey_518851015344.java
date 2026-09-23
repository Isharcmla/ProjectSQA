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

public class TypeCheck_visitObjLitKey_518851015344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99803;
     Object term99873;

    public TypeCheck_visitObjLitKey_518851015344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99803 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term99873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term99943, term99943.getClass(), "jsType", term100039);
        setField(term99873, term99873.getClass(), "first", term99943);
        setIntField(term99873, term99873.getClass(), "type", 0);
        setField(term99873, term99873.getClass(), "jsType", null);
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
        args[1] = term99873;
        args[2] = null;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term99803, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


