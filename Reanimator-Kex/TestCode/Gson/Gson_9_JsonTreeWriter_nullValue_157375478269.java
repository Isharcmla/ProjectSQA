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

public class JsonTreeWriter_nullValue_157375478269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10509;
     Object term10575;
     Object term10564;

    public JsonTreeWriter_nullValue_157375478269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10561 = new ArrayList();
        term10509 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term10509, term10509.getClass(), "pendingName", null);
        setField(term10509, term10509.getClass(), "stack", term10561);
        ArrayList term10576 = new ArrayList();
        term10575 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term10578 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term10575, term10575.getClass(), "stack", term10576);
        setField(term10575, term10575.getClass(), "pendingName", null);
        setField(term10575, term10575.getClass(), "product", term10578);
        setField(term10575, term10575.getClass(), "out", null);
        setField(term10575, term10575.getClass(), "stack", null);
        setIntField(term10575, term10575.getClass(), "stackSize", 0);
        setField(term10575, term10575.getClass(), "indent", null);
        setField(term10575, term10575.getClass(), "separator", null);
        setBooleanField(term10575, term10575.getClass(), "lenient", false);
        setBooleanField(term10575, term10575.getClass(), "htmlSafe", false);
        setField(term10575, term10575.getClass(), "deferredName", null);
        setBooleanField(term10575, term10575.getClass(), "serializeNulls", false);
        ArrayList term10565 = new ArrayList();
        term10564 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term10569 = newInstance(Class.forName("com.google.gson.JsonNull"));
        setField(term10564, term10564.getClass(), "stack", term10565);
        setField(term10564, term10564.getClass(), "pendingName", null);
        setField(term10564, term10564.getClass(), "product", term10569);
        setField(term10564, term10564.getClass(), "out", null);
        setField(term10564, term10564.getClass(), "stack", null);
        setIntField(term10564, term10564.getClass(), "stackSize", 0);
        setField(term10564, term10564.getClass(), "indent", null);
        setField(term10564, term10564.getClass(), "separator", null);
        setBooleanField(term10564, term10564.getClass(), "lenient", false);
        setBooleanField(term10564, term10564.getClass(), "htmlSafe", false);
        setField(term10564, term10564.getClass(), "deferredName", null);
        setBooleanField(term10564, term10564.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nullValue", argTypes, term10509, args);
        assertTrue(recursiveEquals(term10509, term10575));
        assertTrue(recursiveEquals(retValue, term10564));
    }

};


