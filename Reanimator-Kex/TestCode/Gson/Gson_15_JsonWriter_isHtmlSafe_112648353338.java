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

public class JsonWriter_isHtmlSafe_112648353338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;
     Object term3745;

    public JsonWriter_isHtmlSafe_112648353338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term348 = (int[]) newIntArray(1);
        setField(term347, term347.getClass(), "out", null);
        setIntElement(term348, 0, -655067527);
        setField(term347, term347.getClass(), "stack", term348);
        setIntField(term347, term347.getClass(), "stackSize", -6029667);
        setField(term347, term347.getClass(), "indent", "LQFpaHEwXR");
        setField(term347, term347.getClass(), "separator", "oVcInYnLWB");
        setBooleanField(term347, term347.getClass(), "lenient", false);
        setBooleanField(term347, term347.getClass(), "htmlSafe", false);
        setField(term347, term347.getClass(), "deferredName", "aJlieCFVtF");
        setBooleanField(term347, term347.getClass(), "serializeNulls", true);
        term3745 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term3746 = (int[]) newIntArray(1);
        setField(term3745, term3745.getClass(), "out", null);
        setIntElement(term3746, 0, -655067527);
        setField(term3745, term3745.getClass(), "stack", term3746);
        setIntField(term3745, term3745.getClass(), "stackSize", -6029667);
        setField(term3745, term3745.getClass(), "indent", "LQFpaHEwXR");
        setField(term3745, term3745.getClass(), "separator", "oVcInYnLWB");
        setBooleanField(term3745, term3745.getClass(), "lenient", false);
        setBooleanField(term3745, term3745.getClass(), "htmlSafe", false);
        setField(term3745, term3745.getClass(), "deferredName", "aJlieCFVtF");
        setBooleanField(term3745, term3745.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHtmlSafe", argTypes, term347, args);
        assertTrue(recursiveEquals(term347, term3745));
    }

};


