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

public class JsonWriter_endArray_176375075542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;

    public JsonWriter_endArray_176375075542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term668 = (int[]) newIntArray(7);
        setField(term667, term667.getClass(), "out", null);
        setIntElement(term668, 0, 679763016);
        setIntElement(term668, 1, 1962444399);
        setIntElement(term668, 2, 767834723);
        setIntElement(term668, 3, -602026508);
        setIntElement(term668, 4, -157887805);
        setIntElement(term668, 5, 1876565163);
        setIntElement(term668, 6, -817164822);
        setField(term667, term667.getClass(), "stack", term668);
        setIntField(term667, term667.getClass(), "stackSize", -1016503459);
        setField(term667, term667.getClass(), "indent", "vrQLuWIDJX");
        setField(term667, term667.getClass(), "separator", "flxyYxBRtu");
        setBooleanField(term667, term667.getClass(), "lenient", false);
        setBooleanField(term667, term667.getClass(), "htmlSafe", true);
        setField(term667, term667.getClass(), "deferredName", "OclPbYPkcH");
        setBooleanField(term667, term667.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endArray", argTypes, term667, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


