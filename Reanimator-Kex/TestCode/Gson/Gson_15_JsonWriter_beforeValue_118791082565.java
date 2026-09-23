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

public class JsonWriter_beforeValue_118791082565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2663;

    public JsonWriter_beforeValue_118791082565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2663 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2664 = (int[]) newIntArray(6);
        setField(term2663, term2663.getClass(), "out", null);
        setIntElement(term2664, 0, 1398204340);
        setIntElement(term2664, 1, 229204365);
        setIntElement(term2664, 2, -461771056);
        setIntElement(term2664, 3, -243422082);
        setIntElement(term2664, 4, 1384592638);
        setIntElement(term2664, 5, -1002370457);
        setField(term2663, term2663.getClass(), "stack", term2664);
        setIntField(term2663, term2663.getClass(), "stackSize", -2014576105);
        setField(term2663, term2663.getClass(), "indent", "SPpkrGcPRr");
        setField(term2663, term2663.getClass(), "separator", "sEccwbJKYE");
        setBooleanField(term2663, term2663.getClass(), "lenient", true);
        setBooleanField(term2663, term2663.getClass(), "htmlSafe", true);
        setField(term2663, term2663.getClass(), "deferredName", "AWRooQKkdW");
        setBooleanField(term2663, term2663.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beforeValue", argTypes, term2663, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


