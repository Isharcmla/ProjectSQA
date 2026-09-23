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

public class JSTypeRegistry_createParametersWithVarArgs_1421861665171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527034;
     Object term526700;

    public JSTypeRegistry_createParametersWithVarArgs_1421861665171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term526700 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term527158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term527254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term527366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setElement(term526700, 1, term527158);
        setElement(term526700, 2, term527254);
        setElement(term526700, 3, term527366);
        setElement(term526700, 4, term527158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term526700;
        try {
            callMethod(klass, "createParametersWithVarArgs", argTypes, term527034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


