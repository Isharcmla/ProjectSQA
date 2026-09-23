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

public class NamedType_defineProperty_346418567251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77878;

    public NamedType_defineProperty_346418567251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term77990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term78090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term77878, term77878.getClass(), "resolved", true);
        setField(term78090, term78090.getClass(), "prototypeSlot", null);
        setField(term78090, term78090.getClass(), "className", "");
        setField(term77990, term77990.getClass(), "constructor", term78090);
        setField(term77878, term77878.getClass(), "referencedObjType", term77990);
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
            callMethod(klass, "defineProperty", argTypes, term77878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


