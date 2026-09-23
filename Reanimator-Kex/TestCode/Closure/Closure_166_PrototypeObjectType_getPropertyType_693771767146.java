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

public class PrototypeObjectType_getPropertyType_693771767146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26445;

    public PrototypeObjectType_getPropertyType_693771767146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26583 = newInstance(Class.forName("java.lang.Object"));
        HashMap term26493 = new HashMap();
        ((HashMap) term26493).put(term26583, term26583);
        ArrayList term26787 = new ArrayList();
        term26445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term26735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term26445, term26445.getClass(), "properties", term26493);
        setField(term26445, term26445.getClass(), "implicitPrototypeFallback", null);
        setField(term26735, term26735.getClass(), "extendedInterfaces", term26787);
        setField(term26445, term26445.getClass(), "ownerFunction", term26735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getPropertyType", argTypes, term26445, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


