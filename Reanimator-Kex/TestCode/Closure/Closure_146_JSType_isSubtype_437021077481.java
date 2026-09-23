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

public class JSType_isSubtype_437021077481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127618;
     Object term127804;

    public JSType_isSubtype_437021077481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term127710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term127618, term127618.getClass(), "referencedType", term127710);
        term127804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term127892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term127892, term127892.getClass(), "unknown", false);
        setField(term127804, term127804.getClass(), "referencedType", term127892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term127618;
        args[1] = term127804;
        try {
            callMethod(klass, "isSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


