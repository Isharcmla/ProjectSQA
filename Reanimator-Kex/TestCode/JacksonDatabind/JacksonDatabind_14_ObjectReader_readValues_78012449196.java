package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ObjectReader_readValues_78012449196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;

    public ObjectReader_readValues_78012449196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23536 = Class.forName((String) "java.io.File$PathStatus");
        Field term23535 = ((Class) term23536).getDeclaredField((String) "INVALID");
        ((Field) term23535).setAccessible(true);
        Object enum4 = ((Field) term23535).get((Object) null);
        term524 = newInstance(Class.forName("java.io.File"));
        setField(term524, term524.getClass(), "path", "EGtDIRbSSb");
        setField(term524, term524.getClass(), "status", enum4);
        setIntField(term524, term524.getClass(), "prefixLength", -616727354);
        setField(term524, term524.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term524;
        try {
            callMethod(klass, "readValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


