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

public class TypeCheck_visitCall_361944333856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236521;
     Object term236695;

    public TypeCheck_visitCall_361944333856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236521 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term236625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setIntField(term236521, term236521.getClass(), "noTypeCheckSection", -1);
        setField(term236521, term236521.getClass(), "typeRegistry", term236625);
        term236695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term236791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term236695, term236695.getClass(), "first", term236695);
        setField(term236791, term236791.getClass(), "className", null);
        setField(term236791, term236791.getClass(), "ownerFunction", null);
        setBooleanField(term236791, term236791.getClass(), "prettyPrint", false);
        setField(term236695, term236695.getClass(), "jsType", term236791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term236695;
        try {
            callMethod(klass, "visitCall", argTypes, term236521, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


