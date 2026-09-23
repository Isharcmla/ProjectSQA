package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_peek_3368293412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;

    public JsonTreeWriter_peek_3368293412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term148 = new ArrayList();
        term147 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term164 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term165 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term166 = (int[]) newIntArray(32);
        setField(term147, term147.getClass(), "stack", term148);
        setField(term147, term147.getClass(), "pendingName", "xxtlPwDYFs");
        setField(term147, term147.getClass(), "product", term164);
        setField(term165, term165.getClass(), "writeBuffer", null);
        setField(term165, term165.getClass(), "lock", term165);
        setField(term147, term147.getClass(), "out", term165);
        setIntElement(term166, 0, 6);
        setField(term147, term147.getClass(), "stack", term166);
        setIntField(term147, term147.getClass(), "stackSize", 1);
        setField(term147, term147.getClass(), "indent", "jJCZpVmanW");
        setField(term147, term147.getClass(), "separator", ":");
        setBooleanField(term147, term147.getClass(), "lenient", false);
        setBooleanField(term147, term147.getClass(), "htmlSafe", false);
        setField(term147, term147.getClass(), "deferredName", "EGtDIRbSSb");
        setBooleanField(term147, term147.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term147, args);
    }

};


