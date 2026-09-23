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

public class TypeCheck_visitObjLitKey_518851015282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79028;
     Object term79098;

    public TypeCheck_visitObjLitKey_518851015282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79028 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term79098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term79098, term79098.getClass(), "first", term79098);
        setField(term79098, term79098.getClass(), "jsType", term79194);
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
        args[1] = term79098;
        args[2] = null;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term79028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


