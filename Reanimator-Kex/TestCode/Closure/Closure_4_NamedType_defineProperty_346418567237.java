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
import java.lang.Object;

public class NamedType_defineProperty_346418567237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73403;

    public NamedType_defineProperty_346418567237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term73503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term73601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PropertyMap"));
        setBooleanField(term73403, term73403.getClass(), "resolved", true);
        setField(term73503, term73503.getClass(), "properties", term73601);
        setField(term73403, term73403.getClass(), "referencedObjType", term73503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        try {
            callMethod(klass, "defineProperty", argTypes, term73403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


