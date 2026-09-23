package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74041;

    public JsonTreeReader_getPath_1170023302247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74041 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term73780 = (Object[]) newArray("java.lang.Object", 491);
        Object term74099 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term74175 = newInstance(Class.forName("java.util.concurrent.DelayQueue$Itr"));
        Object term74213 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term74041, term74041.getClass(), "stackSize", 16);
        setElement(term73780, 1, term74099);
        setElement(term73780, 2, term74175);
        setElement(term73780, 8, term74213);
        setField(term74041, term74041.getClass(), "stack", term73780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term74041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


