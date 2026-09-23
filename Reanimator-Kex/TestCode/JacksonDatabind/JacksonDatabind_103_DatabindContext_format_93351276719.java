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

public class DatabindContext_format_93351276719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;

    public DatabindContext_format_93351276719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = (Object[]) newArray("java.lang.Object", 5);
        Object term59 = newInstance(Class.forName("java.lang.Object"));
        Object term60 = newInstance(Class.forName("java.lang.Object"));
        Object term61 = newInstance(Class.forName("java.lang.Object"));
        Object term62 = newInstance(Class.forName("java.lang.Object"));
        Object term63 = newInstance(Class.forName("java.lang.Object"));
        setElement(term58, 0, term59);
        setElement(term58, 1, term60);
        setElement(term58, 2, term61);
        setElement(term58, 3, term62);
        setElement(term58, 4, term63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DatabindContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term58;
        try {
            callMethod(klass, "_format", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


