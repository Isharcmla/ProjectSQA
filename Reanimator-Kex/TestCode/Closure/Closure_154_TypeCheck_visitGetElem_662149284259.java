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

public class TypeCheck_visitGetElem_662149284259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73640;
     Object term73800;

    public TypeCheck_visitGetElem_662149284259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73640 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term73730 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term73640, term73640.getClass(), "validator", term73730);
        term73800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term74064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term73870, term73870.getClass(), "jsType", term73994);
        setField(term73800, term73800.getClass(), "first", term73870);
        setField(term73800, term73800.getClass(), "last", term74064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term73800;
        try {
            callMethod(klass, "visitGetElem", argTypes, term73640, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


