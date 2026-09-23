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

public class JsonWriter_value_129621706757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067;
     Object term9429;
     Object term9394;

    public JsonWriter_value_129621706757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2067 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2068 = (int[]) newIntArray(5);
        setField(term2067, term2067.getClass(), "out", null);
        setIntElement(term2068, 0, 1072005683);
        setIntElement(term2068, 1, 1861318859);
        setIntElement(term2068, 2, 1474524152);
        setIntElement(term2068, 3, 568954359);
        setIntElement(term2068, 4, 53410913);
        setField(term2067, term2067.getClass(), "stack", term2068);
        setIntField(term2067, term2067.getClass(), "stackSize", -375014958);
        setField(term2067, term2067.getClass(), "indent", "OWKQODBLzb");
        setField(term2067, term2067.getClass(), "separator", "wGmYcqUkgE");
        setBooleanField(term2067, term2067.getClass(), "lenient", true);
        setBooleanField(term2067, term2067.getClass(), "htmlSafe", false);
        setField(term2067, term2067.getClass(), "deferredName", "idgaQsnJpQ");
        setBooleanField(term2067, term2067.getClass(), "serializeNulls", false);
        term9429 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term9430 = (int[]) newIntArray(5);
        setField(term9429, term9429.getClass(), "out", null);
        setIntElement(term9430, 0, 1072005683);
        setIntElement(term9430, 1, 1861318859);
        setIntElement(term9430, 2, 1474524152);
        setIntElement(term9430, 3, 568954359);
        setIntElement(term9430, 4, 53410913);
        setField(term9429, term9429.getClass(), "stack", term9430);
        setIntField(term9429, term9429.getClass(), "stackSize", -375014958);
        setField(term9429, term9429.getClass(), "indent", "OWKQODBLzb");
        setField(term9429, term9429.getClass(), "separator", "wGmYcqUkgE");
        setBooleanField(term9429, term9429.getClass(), "lenient", true);
        setBooleanField(term9429, term9429.getClass(), "htmlSafe", false);
        setField(term9429, term9429.getClass(), "deferredName", null);
        setBooleanField(term9429, term9429.getClass(), "serializeNulls", false);
        term9394 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term9395 = (int[]) newIntArray(5);
        setField(term9394, term9394.getClass(), "out", null);
        setIntElement(term9395, 0, 1072005683);
        setIntElement(term9395, 1, 1861318859);
        setIntElement(term9395, 2, 1474524152);
        setIntElement(term9395, 3, 568954359);
        setIntElement(term9395, 4, 53410913);
        setField(term9394, term9394.getClass(), "stack", term9395);
        setIntField(term9394, term9394.getClass(), "stackSize", -375014958);
        setField(term9394, term9394.getClass(), "indent", "OWKQODBLzb");
        setField(term9394, term9394.getClass(), "separator", "wGmYcqUkgE");
        setBooleanField(term9394, term9394.getClass(), "lenient", true);
        setBooleanField(term9394, term9394.getClass(), "htmlSafe", false);
        setField(term9394, term9394.getClass(), "deferredName", null);
        setBooleanField(term9394, term9394.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term2067, args);
        assertTrue(recursiveEquals(term2067, term9429));
        assertTrue(recursiveEquals(retValue, term9394));
    }

};


