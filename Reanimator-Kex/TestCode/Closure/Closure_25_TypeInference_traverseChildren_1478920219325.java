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

public class TypeInference_traverseChildren_1478920219325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822153;
     Object term822223;

    public TypeInference_traverseChildren_1478920219325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822153 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term822223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term823343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term822293, term822293.getClass(), "type", 18);
        setIntField(term822363, term822363.getClass(), "type", 18);
        setIntField(term822433, term822433.getClass(), "type", 18);
        setIntField(term822503, term822503.getClass(), "type", 18);
        setIntField(term822573, term822573.getClass(), "type", 18);
        setIntField(term822643, term822643.getClass(), "type", 18);
        setIntField(term822713, term822713.getClass(), "type", 18);
        setIntField(term822783, term822783.getClass(), "type", 18);
        setIntField(term822853, term822853.getClass(), "type", 18);
        setIntField(term822923, term822923.getClass(), "type", 18);
        setIntField(term822993, term822993.getClass(), "type", 18);
        setIntField(term823063, term823063.getClass(), "type", 18);
        setIntField(term823133, term823133.getClass(), "type", 18);
        setIntField(term823203, term823203.getClass(), "type", 18);
        setIntField(term823273, term823273.getClass(), "type", 18);
        setIntField(term823343, term823343.getClass(), "type", 41);
        setField(term823273, term823273.getClass(), "first", term823343);
        setField(term823203, term823203.getClass(), "first", term823273);
        setField(term823133, term823133.getClass(), "first", term823203);
        setField(term823063, term823063.getClass(), "first", term823133);
        setField(term822993, term822993.getClass(), "first", term823063);
        setField(term822923, term822923.getClass(), "first", term822993);
        setField(term822853, term822853.getClass(), "first", term822923);
        setField(term822783, term822783.getClass(), "first", term822853);
        setField(term822713, term822713.getClass(), "first", term822783);
        setField(term822643, term822643.getClass(), "first", term822713);
        setField(term822573, term822573.getClass(), "first", term822643);
        setField(term822503, term822503.getClass(), "first", term822573);
        setField(term822433, term822433.getClass(), "first", term822503);
        setField(term822363, term822363.getClass(), "first", term822433);
        setField(term822293, term822293.getClass(), "first", term822363);
        setField(term822223, term822223.getClass(), "first", term822293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term822223;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term822153, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


