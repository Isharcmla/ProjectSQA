package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_close_48159369961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2317;

    public JsonWriter_close_48159369961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2317 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2318 = (int[]) newIntArray(3);
        setField(term2317, term2317.getClass(), "out", null);
        setIntElement(term2318, 0, -1222006000);
        setIntElement(term2318, 1, 2095798786);
        setIntElement(term2318, 2, -1565502840);
        setField(term2317, term2317.getClass(), "stack", term2318);
        setIntField(term2317, term2317.getClass(), "stackSize", 344323424);
        setField(term2317, term2317.getClass(), "indent", "TimdotUuNC");
        setField(term2317, term2317.getClass(), "separator", "PkWMRdJcBb");
        setBooleanField(term2317, term2317.getClass(), "lenient", false);
        setBooleanField(term2317, term2317.getClass(), "htmlSafe", true);
        setField(term2317, term2317.getClass(), "deferredName", "jSpAteRute");
        setBooleanField(term2317, term2317.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term2317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


