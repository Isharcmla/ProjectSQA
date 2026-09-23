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

public class TypeCheck_visitGetElem_662149284528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139561;
     Object term139721;

    public TypeCheck_visitGetElem_662149284528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139561 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term139651 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term139561, term139561.getClass(), "validator", term139651);
        term139721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term139791, term139791.getClass(), "jsType", term139897);
        setField(term139721, term139721.getClass(), "first", term139791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term139721;
        try {
            callMethod(klass, "visitGetElem", argTypes, term139561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


