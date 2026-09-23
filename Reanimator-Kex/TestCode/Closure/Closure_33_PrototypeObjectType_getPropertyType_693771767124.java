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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PrototypeObjectType_getPropertyType_693771767124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16117;

    public PrototypeObjectType_getPropertyType_693771767124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16255 = newInstance(Class.forName("java.lang.Object"));
        HashMap term16165 = new HashMap();
        ((HashMap) term16165).put(term16255, term16255);
        ArrayList term16459 = new ArrayList();
        term16117 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term16407 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term16117, term16117.getClass(), "properties", term16165);
        setField(term16117, term16117.getClass(), "implicitPrototypeFallback", null);
        setField(term16407, term16407.getClass(), "extendedInterfaces", term16459);
        setField(term16117, term16117.getClass(), "ownerFunction", term16407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getPropertyType", argTypes, term16117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


