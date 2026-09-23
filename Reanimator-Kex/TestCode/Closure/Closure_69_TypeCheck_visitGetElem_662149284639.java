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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitGetElem_662149284639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206677;
     Object term206837;

    public TypeCheck_visitGetElem_662149284639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206677 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term206767 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term206677, term206677.getClass(), "validator", term206767);
        term206837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setField(term206837, term206837.getClass(), "first", term206837);
        setField(term206837, term206837.getClass(), "last", null);
        setField(term206837, term206837.getClass(), "jsType", term206933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term206837;
        callMethod(klass, "visitGetElem", argTypes, term206677, args);
    }

};


