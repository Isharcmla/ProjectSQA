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

public class JsonWriter_beginObject_45091708143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753;

    public JsonWriter_beginObject_45091708143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term753 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term754 = (int[]) newIntArray(1);
        setField(term753, term753.getClass(), "out", null);
        setIntElement(term754, 0, -1968847291);
        setField(term753, term753.getClass(), "stack", term754);
        setIntField(term753, term753.getClass(), "stackSize", 579005622);
        setField(term753, term753.getClass(), "indent", "IoAlmYsBwc");
        setField(term753, term753.getClass(), "separator", "TEParAifyi");
        setBooleanField(term753, term753.getClass(), "lenient", true);
        setBooleanField(term753, term753.getClass(), "htmlSafe", true);
        setField(term753, term753.getClass(), "deferredName", "OWDIEULEFu");
        setBooleanField(term753, term753.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term753, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


