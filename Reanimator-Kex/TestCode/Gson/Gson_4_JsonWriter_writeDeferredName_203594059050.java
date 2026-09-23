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

public class JsonWriter_writeDeferredName_203594059050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1451;

    public JsonWriter_writeDeferredName_203594059050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1451 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term1452 = (int[]) newIntArray(2);
        setField(term1451, term1451.getClass(), "out", null);
        setIntElement(term1452, 0, 1240914516);
        setIntElement(term1452, 1, -1465035361);
        setField(term1451, term1451.getClass(), "stack", term1452);
        setIntField(term1451, term1451.getClass(), "stackSize", 1090617576);
        setField(term1451, term1451.getClass(), "indent", "YRHGsAkhxb");
        setField(term1451, term1451.getClass(), "separator", "ffYhPOzlUs");
        setBooleanField(term1451, term1451.getClass(), "lenient", true);
        setBooleanField(term1451, term1451.getClass(), "htmlSafe", false);
        setField(term1451, term1451.getClass(), "deferredName", "MLqYREekMl");
        setBooleanField(term1451, term1451.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeDeferredName", argTypes, term1451, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


