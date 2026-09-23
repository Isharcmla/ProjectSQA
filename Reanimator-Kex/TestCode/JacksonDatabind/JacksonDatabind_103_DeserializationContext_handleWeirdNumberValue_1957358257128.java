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

public class DeserializationContext_handleWeirdNumberValue_1957358257128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2487;

    public DeserializationContext_handleWeirdNumberValue_1957358257128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2487 = (Object[]) newArray("java.lang.Object", 3);
        Object term2488 = newInstance(Class.forName("java.lang.Object"));
        Object term2489 = newInstance(Class.forName("java.lang.Object"));
        Object term2490 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2487, 0, term2488);
        setElement(term2487, 1, term2489);
        setElement(term2487, 2, term2490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Number");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = "hRNSzYYIrc";
        args[3] = term2487;
        try {
            callMethod(klass, "handleWeirdNumberValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


