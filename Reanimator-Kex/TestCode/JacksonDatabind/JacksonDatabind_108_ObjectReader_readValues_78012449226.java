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

public class ObjectReader_readValues_78012449226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;

    public ObjectReader_readValues_78012449226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26863 = Class.forName((String) "java.io.File$PathStatus");
        Field term26862 = ((Class) term26863).getDeclaredField((String) "INVALID");
        ((Field) term26862).setAccessible(true);
        Object enum4 = ((Field) term26862).get((Object) null);
        term531 = newInstance(Class.forName("java.io.File"));
        setField(term531, term531.getClass(), "path", "SzjVpOQTyS");
        setField(term531, term531.getClass(), "status", enum4);
        setIntField(term531, term531.getClass(), "prefixLength", -2038273078);
        setField(term531, term531.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term531;
        try {
            callMethod(klass, "readValues", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


