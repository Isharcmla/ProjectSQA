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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_isLenient_23081965035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;
     Object term3420;

    public JsonWriter_isLenient_23081965035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term188 = (int[]) newIntArray(3);
        setField(term187, term187.getClass(), "out", null);
        setIntElement(term188, 0, -522618178);
        setIntElement(term188, 1, 1134449235);
        setIntElement(term188, 2, -883034806);
        setField(term187, term187.getClass(), "stack", term188);
        setIntField(term187, term187.getClass(), "stackSize", 1585847225);
        setField(term187, term187.getClass(), "indent", "MjGYSRKTNF");
        setField(term187, term187.getClass(), "separator", "hRNSzYYIrc");
        setBooleanField(term187, term187.getClass(), "lenient", true);
        setBooleanField(term187, term187.getClass(), "htmlSafe", false);
        setField(term187, term187.getClass(), "deferredName", "RMFIsYGgne");
        setBooleanField(term187, term187.getClass(), "serializeNulls", true);
        term3420 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3421 = (int[]) newIntArray(3);
        setField(term3420, term3420.getClass(), "out", null);
        setIntElement(term3421, 0, -522618178);
        setIntElement(term3421, 1, 1134449235);
        setIntElement(term3421, 2, -883034806);
        setField(term3420, term3420.getClass(), "stack", term3421);
        setIntField(term3420, term3420.getClass(), "stackSize", 1585847225);
        setField(term3420, term3420.getClass(), "indent", "MjGYSRKTNF");
        setField(term3420, term3420.getClass(), "separator", "hRNSzYYIrc");
        setBooleanField(term3420, term3420.getClass(), "lenient", true);
        setBooleanField(term3420, term3420.getClass(), "htmlSafe", false);
        setField(term3420, term3420.getClass(), "deferredName", "RMFIsYGgne");
        setBooleanField(term3420, term3420.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLenient", argTypes, term187, args);
        assertTrue(recursiveEquals(term187, term3420));
    }

};


