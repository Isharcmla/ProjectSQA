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

public class JSType_isSubtype_437021077393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94165;
     Object term94369;

    public JSType_isSubtype_437021077393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term94275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term94165, term94165.getClass(), "referencedType", term94275);
        term94369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term94457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term94457, term94457.getClass(), "unknown", false);
        setField(term94369, term94369.getClass(), "referencedType", term94457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term94165;
        args[1] = term94369;
        try {
            callMethod(klass, "isSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


