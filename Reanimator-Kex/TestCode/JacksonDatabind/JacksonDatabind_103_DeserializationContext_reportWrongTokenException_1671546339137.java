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

public class DeserializationContext_reportWrongTokenException_1671546339137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5819;

    public DeserializationContext_reportWrongTokenException_1671546339137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5819 = (Object[]) newArray("java.lang.Object", 6);
        Object term5820 = newInstance(Class.forName("java.lang.Object"));
        Object term5821 = newInstance(Class.forName("java.lang.Object"));
        Object term5822 = newInstance(Class.forName("java.lang.Object"));
        Object term5823 = newInstance(Class.forName("java.lang.Object"));
        Object term5824 = newInstance(Class.forName("java.lang.Object"));
        Object term5825 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5819, 0, term5820);
        setElement(term5819, 1, term5821);
        setElement(term5819, 2, term5822);
        setElement(term5819, 3, term5823);
        setElement(term5819, 4, term5824);
        setElement(term5819, 5, term5825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonToken");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = "aJlieCFVtF";
        args[3] = term5819;
        try {
            callMethod(klass, "reportWrongTokenException", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


