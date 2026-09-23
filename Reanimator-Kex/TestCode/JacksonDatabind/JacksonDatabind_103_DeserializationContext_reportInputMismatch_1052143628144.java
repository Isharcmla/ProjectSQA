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
import java.lang.Object;

public class DeserializationContext_reportInputMismatch_1052143628144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5975;

    public DeserializationContext_reportInputMismatch_1052143628144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5975 = (Object[]) newArray("java.lang.Object", 9);
        Object term5976 = newInstance(Class.forName("java.lang.Object"));
        Object term5977 = newInstance(Class.forName("java.lang.Object"));
        Object term5978 = newInstance(Class.forName("java.lang.Object"));
        Object term5979 = newInstance(Class.forName("java.lang.Object"));
        Object term5980 = newInstance(Class.forName("java.lang.Object"));
        Object term5981 = newInstance(Class.forName("java.lang.Object"));
        Object term5982 = newInstance(Class.forName("java.lang.Object"));
        Object term5983 = newInstance(Class.forName("java.lang.Object"));
        Object term5984 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5975, 0, term5976);
        setElement(term5975, 1, term5977);
        setElement(term5975, 2, term5978);
        setElement(term5975, 3, term5979);
        setElement(term5975, 4, term5980);
        setElement(term5975, 5, term5981);
        setElement(term5975, 6, term5982);
        setElement(term5975, 7, term5983);
        setElement(term5975, 8, term5984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "RkybSrpybU";
        args[2] = term5975;
        try {
            callMethod(klass, "reportInputMismatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


