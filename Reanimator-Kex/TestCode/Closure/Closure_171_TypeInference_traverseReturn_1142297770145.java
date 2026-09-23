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

public class TypeInference_traverseReturn_1142297770145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77897;
     Object term77967;

    public TypeInference_traverseReturn_1142297770145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77897 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term77967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78037, term78037.getClass(), "type", -344842608);
        setIntField(term78107, term78107.getClass(), "type", 145);
        setField(term78037, term78037.getClass(), "next", term78107);
        setField(term77967, term77967.getClass(), "first", term78037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term77967;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term77897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


