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
import java.lang.Integer;

public class JsonWriter_close_54062314845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017;
     Object term1064;
     Object term1066;

    public JsonWriter_close_54062314845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1017 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1018 = (int[]) newIntArray(5);
        setField(term1017, term1017.getClass(), "out", null);
        setIntElement(term1018, 0, -2095575670);
        setIntElement(term1018, 1, 1225272962);
        setIntElement(term1018, 2, 1324040357);
        setIntElement(term1018, 3, -1588772968);
        setIntElement(term1018, 4, -93135961);
        setField(term1017, term1017.getClass(), "stack", term1018);
        setIntField(term1017, term1017.getClass(), "stackSize", -112921587);
        setField(term1017, term1017.getClass(), "indent", "nyiiPDVjAc");
        setField(term1017, term1017.getClass(), "separator", "aKnKipADSo");
        setBooleanField(term1017, term1017.getClass(), "lenient", false);
        setBooleanField(term1017, term1017.getClass(), "htmlSafe", false);
        setField(term1017, term1017.getClass(), "deferredName", "wSQxaModmm");
        setBooleanField(term1017, term1017.getClass(), "serializeNulls", false);
        term1064 = new Integer(933028652);
        term1066 = new Integer(287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1064;
        args[1] = term1066;
        args[2] = "UlajhuVLaP";
        try {
            callMethod(klass, "close", argTypes, term1017, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


