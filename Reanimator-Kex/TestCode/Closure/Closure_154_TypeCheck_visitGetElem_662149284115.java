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

public class TypeCheck_visitGetElem_662149284115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31561;
     Object term31721;

    public TypeCheck_visitGetElem_662149284115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31561 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term31651 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term31561, term31561.getClass(), "validator", term31651);
        term31721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term31721, term31721.getClass(), "first", term31721);
        setField(term31721, term31721.getClass(), "last", null);
        setField(term31721, term31721.getClass(), "jsType", term31819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31721;
        try {
            callMethod(klass, "visitGetElem", argTypes, term31561, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


