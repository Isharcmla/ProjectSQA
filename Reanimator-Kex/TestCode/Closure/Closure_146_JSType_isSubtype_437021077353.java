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

public class JSType_isSubtype_437021077353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75070;
     Object term75258;

    public JSType_isSubtype_437021077353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term75164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term75070, term75070.getClass(), "referencedType", term75164);
        term75258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term75346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term75346, term75346.getClass(), "unknown", false);
        setField(term75258, term75258.getClass(), "referencedType", term75346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term75070;
        args[1] = term75258;
        try {
            callMethod(klass, "isSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


