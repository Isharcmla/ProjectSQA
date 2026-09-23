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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_endObject_159136444143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827;

    public JsonWriter_endObject_159136444143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term827 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term828 = (int[]) newIntArray(6);
        setField(term827, term827.getClass(), "out", null);
        setIntElement(term828, 0, -14890619);
        setIntElement(term828, 1, 1632125673);
        setIntElement(term828, 2, 454281060);
        setIntElement(term828, 3, -1786399638);
        setIntElement(term828, 4, 2055867847);
        setIntElement(term828, 5, -1048298087);
        setField(term827, term827.getClass(), "stack", term828);
        setIntField(term827, term827.getClass(), "stackSize", 292681826);
        setField(term827, term827.getClass(), "indent", "dWRymuLBtr");
        setField(term827, term827.getClass(), "separator", "AijpHYOFuy");
        setBooleanField(term827, term827.getClass(), "lenient", true);
        setBooleanField(term827, term827.getClass(), "htmlSafe", false);
        setField(term827, term827.getClass(), "deferredName", "SbAoxhfrkn");
        setBooleanField(term827, term827.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endObject", argTypes, term827, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


