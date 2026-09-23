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

public class JsonWriter_beginArray_149550516741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;

    public JsonWriter_beginArray_149550516741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term583 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term584 = (int[]) newIntArray(6);
        setField(term583, term583.getClass(), "out", null);
        setIntElement(term584, 0, -73683645);
        setIntElement(term584, 1, -226514366);
        setIntElement(term584, 2, 1193880199);
        setIntElement(term584, 3, -1087774327);
        setIntElement(term584, 4, -1530420153);
        setIntElement(term584, 5, -469968304);
        setField(term583, term583.getClass(), "stack", term584);
        setIntField(term583, term583.getClass(), "stackSize", -1145578966);
        setField(term583, term583.getClass(), "indent", "xOEqzGAmDU");
        setField(term583, term583.getClass(), "separator", "eZFUvlxvGV");
        setBooleanField(term583, term583.getClass(), "lenient", true);
        setBooleanField(term583, term583.getClass(), "htmlSafe", false);
        setField(term583, term583.getClass(), "deferredName", "BYqFIqCKAV");
        setBooleanField(term583, term583.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginArray", argTypes, term583, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


