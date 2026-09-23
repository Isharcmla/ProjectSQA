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

public class ObjectMapper_readValue_1509225500339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5169;

    public ObjectMapper_readValue_1509225500339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75671 = Class.forName((String) "java.io.File$PathStatus");
        Field term75670 = ((Class) term75671).getDeclaredField((String) "INVALID");
        ((Field) term75670).setAccessible(true);
        Object enum6 = ((Field) term75670).get((Object) null);
        term5169 = newInstance(Class.forName("java.io.File"));
        setField(term5169, term5169.getClass(), "path", "EGtDIRbSSb");
        setField(term5169, term5169.getClass(), "status", enum6);
        setIntField(term5169, term5169.getClass(), "prefixLength", 1162663216);
        setField(term5169, term5169.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term5169;
        args[1] = null;
        try {
            callMethod(klass, "readValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


