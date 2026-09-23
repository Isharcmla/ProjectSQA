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
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_value_90933482261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8305;
     Object term8372;
     Object term8361;

    public JsonTreeWriter_value_90933482261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8357 = new ArrayList();
        term8305 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term8305, term8305.getClass(), "pendingName", null);
        setField(term8305, term8305.getClass(), "stack", term8357);
        ArrayList term8373 = new ArrayList();
        term8372 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term8375 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term8372, term8372.getClass(), "stack", term8373);
        setField(term8372, term8372.getClass(), "pendingName", null);
        setField(term8372, term8372.getClass(), "product", term8375);
        setField(term8372, term8372.getClass(), "out", null);
        setField(term8372, term8372.getClass(), "stack", null);
        setIntField(term8372, term8372.getClass(), "stackSize", 0);
        setField(term8372, term8372.getClass(), "indent", null);
        setField(term8372, term8372.getClass(), "separator", null);
        setBooleanField(term8372, term8372.getClass(), "lenient", false);
        setBooleanField(term8372, term8372.getClass(), "htmlSafe", false);
        setField(term8372, term8372.getClass(), "deferredName", null);
        setBooleanField(term8372, term8372.getClass(), "serializeNulls", false);
        ArrayList term8362 = new ArrayList();
        term8361 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term8366 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term8361, term8361.getClass(), "stack", term8362);
        setField(term8361, term8361.getClass(), "pendingName", null);
        setField(term8361, term8361.getClass(), "product", term8366);
        setField(term8361, term8361.getClass(), "out", null);
        setField(term8361, term8361.getClass(), "stack", null);
        setIntField(term8361, term8361.getClass(), "stackSize", 0);
        setField(term8361, term8361.getClass(), "indent", null);
        setField(term8361, term8361.getClass(), "separator", null);
        setBooleanField(term8361, term8361.getClass(), "lenient", false);
        setBooleanField(term8361, term8361.getClass(), "htmlSafe", false);
        setField(term8361, term8361.getClass(), "deferredName", null);
        setBooleanField(term8361, term8361.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "value", argTypes, term8305, args);
        assertTrue(recursiveEquals(term8305, term8372));
        assertTrue(recursiveEquals(retValue, term8361));
    }

};


