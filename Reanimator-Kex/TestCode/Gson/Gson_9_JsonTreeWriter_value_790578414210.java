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
import java.lang.Float;
import java.lang.Object;

public class JsonTreeWriter_value_790578414210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49192;
     Object term49288;
     Object term49527;
     Object term49532;
     Object term49503;

    public JsonTreeWriter_value_790578414210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term49244 = new ArrayList();
        term49192 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setBooleanField(term49192, term49192.getClass(), "lenient", true);
        setField(term49192, term49192.getClass(), "pendingName", null);
        setField(term49192, term49192.getClass(), "stack", term49244);
        term49288 = new Float(0.0F);
        ArrayList term49528 = new ArrayList();
        Float term49531 = new Float(0.0F);
        term49527 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term49530 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term49527, term49527.getClass(), "stack", term49528);
        setField(term49527, term49527.getClass(), "pendingName", null);
        setField(term49530, term49530.getClass(), "value", term49531);
        setField(term49527, term49527.getClass(), "product", term49530);
        setField(term49527, term49527.getClass(), "out", null);
        setField(term49527, term49527.getClass(), "stack", null);
        setIntField(term49527, term49527.getClass(), "stackSize", 0);
        setField(term49527, term49527.getClass(), "indent", null);
        setField(term49527, term49527.getClass(), "separator", null);
        setBooleanField(term49527, term49527.getClass(), "lenient", true);
        setBooleanField(term49527, term49527.getClass(), "htmlSafe", false);
        setField(term49527, term49527.getClass(), "deferredName", null);
        setBooleanField(term49527, term49527.getClass(), "serializeNulls", false);
        term49532 = new Float(0.0F);
        ArrayList term49504 = new ArrayList();
        Float term49509 = new Float(0.0F);
        term49503 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term49508 = newInstance(Class.forName("com.google.gson.JsonPrimitive"));
        setField(term49503, term49503.getClass(), "stack", term49504);
        setField(term49503, term49503.getClass(), "pendingName", null);
        setField(term49508, term49508.getClass(), "value", term49509);
        setField(term49503, term49503.getClass(), "product", term49508);
        setField(term49503, term49503.getClass(), "out", null);
        setField(term49503, term49503.getClass(), "stack", null);
        setIntField(term49503, term49503.getClass(), "stackSize", 0);
        setField(term49503, term49503.getClass(), "indent", null);
        setField(term49503, term49503.getClass(), "separator", null);
        setBooleanField(term49503, term49503.getClass(), "lenient", true);
        setBooleanField(term49503, term49503.getClass(), "htmlSafe", false);
        setField(term49503, term49503.getClass(), "deferredName", null);
        setBooleanField(term49503, term49503.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term49288;
        Object retValue = callMethod(klass, "value", argTypes, term49192, args);
        assertTrue(recursiveEquals(term49192, term49527));
        assertTrue(recursiveEquals(term49288, term49532));
        assertTrue(recursiveEquals(retValue, term49503));
    }

};


