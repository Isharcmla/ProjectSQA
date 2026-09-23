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

public class TypeCheck_visitObjLitKey_7430116531422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449128;
     Object term449198;
     Object term449268;
     Object term449364;

    public TypeCheck_visitObjLitKey_7430116531422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449128 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term449198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term449268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term449268, term449268.getClass(), "propListHead", null);
        term449364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term449198;
        args[2] = term449268;
        args[3] = term449364;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term449128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


