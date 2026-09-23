package com.google.gson.internal;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class _Gson_Types_resolve_1298521219187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507243;

    public _Gson_Types_resolve_1298521219187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term508987 = Class.forName((String) "java.math.BigDecimal$2");
        term507243 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term507365 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term507487 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term507609 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term507731 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term507853 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term507975 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508097 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508219 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508341 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508463 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508585 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508707 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508829 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        Object term508951 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl"));
        setField(term508951, term508951.getClass(), "ownerType", term508987);
        setField(term508829, term508829.getClass(), "ownerType", term508951);
        setField(term508707, term508707.getClass(), "ownerType", term508829);
        setField(term508585, term508585.getClass(), "ownerType", term508707);
        setField(term508463, term508463.getClass(), "ownerType", term508585);
        setField(term508341, term508341.getClass(), "ownerType", term508463);
        setField(term508219, term508219.getClass(), "ownerType", term508341);
        setField(term508097, term508097.getClass(), "ownerType", term508219);
        setField(term507975, term507975.getClass(), "ownerType", term508097);
        setField(term507853, term507853.getClass(), "ownerType", term507975);
        setField(term507731, term507731.getClass(), "ownerType", term507853);
        setField(term507609, term507609.getClass(), "ownerType", term507731);
        setField(term507487, term507487.getClass(), "ownerType", term507609);
        setField(term507365, term507365.getClass(), "ownerType", term507487);
        setField(term507243, term507243.getClass(), "ownerType", term507365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term507243;
        try {
            callMethod(klass, "resolve", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


