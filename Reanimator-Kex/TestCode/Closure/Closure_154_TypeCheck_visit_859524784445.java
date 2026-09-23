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

public class TypeCheck_visit_859524784445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122143;
     Object term122317;

    public TypeCheck_visit_859524784445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122143 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term122247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setIntField(term122143, term122143.getClass(), "noTypeCheckSection", -1);
        setField(term122143, term122143.getClass(), "typeRegistry", term122247);
        term122317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term122317, term122317.getClass(), "type", 62);
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
        args[1] = term122317;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term122143, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


