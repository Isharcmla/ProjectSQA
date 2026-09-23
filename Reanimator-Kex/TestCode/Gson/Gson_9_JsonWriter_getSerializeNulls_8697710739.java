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

public class JsonWriter_getSerializeNulls_8697710739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;
     Object term3903;

    public JsonWriter_getSerializeNulls_8697710739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term508 = (int[]) newIntArray(2);
        setField(term507, term507.getClass(), "out", null);
        setIntElement(term508, 0, -244121226);
        setIntElement(term508, 1, -203030934);
        setField(term507, term507.getClass(), "stack", term508);
        setIntField(term507, term507.getClass(), "stackSize", -1179120542);
        setField(term507, term507.getClass(), "indent", "pCTimMblYc");
        setField(term507, term507.getClass(), "separator", "hNxWaHcfhY");
        setBooleanField(term507, term507.getClass(), "lenient", true);
        setBooleanField(term507, term507.getClass(), "htmlSafe", true);
        setField(term507, term507.getClass(), "deferredName", "RkybSrpybU");
        setBooleanField(term507, term507.getClass(), "serializeNulls", true);
        term3903 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3904 = (int[]) newIntArray(2);
        setField(term3903, term3903.getClass(), "out", null);
        setIntElement(term3904, 0, -244121226);
        setIntElement(term3904, 1, -203030934);
        setField(term3903, term3903.getClass(), "stack", term3904);
        setIntField(term3903, term3903.getClass(), "stackSize", -1179120542);
        setField(term3903, term3903.getClass(), "indent", "pCTimMblYc");
        setField(term3903, term3903.getClass(), "separator", "hNxWaHcfhY");
        setBooleanField(term3903, term3903.getClass(), "lenient", true);
        setBooleanField(term3903, term3903.getClass(), "htmlSafe", true);
        setField(term3903, term3903.getClass(), "deferredName", "RkybSrpybU");
        setBooleanField(term3903, term3903.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSerializeNulls", argTypes, term507, args);
        assertTrue(recursiveEquals(term507, term3903));
    }

};


