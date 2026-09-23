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
import java.lang.Boolean;

public class JsonTreeWriter_value_1061588875124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26083;
     Object term26370;
     Object term26357;

    public JsonTreeWriter_value_1061588875124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26135 = new ArrayList();
        term26083 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term26083, term26083.getClass(), "pendingName", null);
        setField(term26083, term26083.getClass(), "stack", term26135);
        ArrayList term26371 = new ArrayList();
        Boolean term26374 = new Boolean(false);
        term26370 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term26373 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term26370, term26370.getClass(), "stack", term26371);
        setField(term26370, term26370.getClass(), "pendingName", null);
        setField(term26373, term26373.getClass(), "value", term26374);
        setField(term26370, term26370.getClass(), "product", term26373);
        setField(term26370, term26370.getClass(), "out", null);
        setField(term26370, term26370.getClass(), "stack", null);
        setIntField(term26370, term26370.getClass(), "stackSize", 0);
        setField(term26370, term26370.getClass(), "indent", null);
        setField(term26370, term26370.getClass(), "separator", null);
        setBooleanField(term26370, term26370.getClass(), "lenient", false);
        setBooleanField(term26370, term26370.getClass(), "htmlSafe", false);
        setField(term26370, term26370.getClass(), "deferredName", null);
        setBooleanField(term26370, term26370.getClass(), "serializeNulls", false);
        ArrayList term26358 = new ArrayList();
        Boolean term26363 = new Boolean(false);
        term26357 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term26362 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term26357, term26357.getClass(), "stack", term26358);
        setField(term26357, term26357.getClass(), "pendingName", null);
        setField(term26362, term26362.getClass(), "value", term26363);
        setField(term26357, term26357.getClass(), "product", term26362);
        setField(term26357, term26357.getClass(), "out", null);
        setField(term26357, term26357.getClass(), "stack", null);
        setIntField(term26357, term26357.getClass(), "stackSize", 0);
        setField(term26357, term26357.getClass(), "indent", null);
        setField(term26357, term26357.getClass(), "separator", null);
        setBooleanField(term26357, term26357.getClass(), "lenient", false);
        setBooleanField(term26357, term26357.getClass(), "htmlSafe", false);
        setField(term26357, term26357.getClass(), "deferredName", null);
        setBooleanField(term26357, term26357.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object retValue = callMethod(klass, "value", argTypes, term26083, args);
        assertTrue(recursiveEquals(term26083, term26370));
        assertTrue(recursiveEquals(retValue, term26357));
    }

};


