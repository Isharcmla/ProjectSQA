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

public class DeserializationContext_handleUnexpectedToken_2003515323133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5727;

    public DeserializationContext_handleUnexpectedToken_2003515323133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5727 = (Object[]) newArray("java.lang.Object", 2);
        Object term5728 = newInstance(Class.forName("java.lang.Object"));
        Object term5729 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5727, 0, term5728);
        setElement(term5727, 1, term5729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonToken");
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = "uuaPigETmJ";
        args[4] = term5727;
        try {
            callMethod(klass, "handleUnexpectedToken", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


