package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JSTypeRegistry_createFromTypeNodesInternal_1247680207169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525886;
     Object term525956;

    public JSTypeRegistry_createFromTypeNodesInternal_1247680207169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term525956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term525956, term525956.getClass(), "type", 124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term525956;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "createFromTypeNodesInternal", argTypes, term525886, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


