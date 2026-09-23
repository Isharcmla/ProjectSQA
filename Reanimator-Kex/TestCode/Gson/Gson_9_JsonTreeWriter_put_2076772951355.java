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

public class JsonTreeWriter_put_2076772951355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86163;
     Object term86307;

    public JsonTreeWriter_put_2076772951355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term86253 = new ArrayList();
        term86163 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term86163, term86163.getClass(), "pendingName", "");
        setBooleanField(term86163, term86163.getClass(), "serializeNulls", true);
        setField(term86163, term86163.getClass(), "stack", term86253);
        term86307 = newInstance(Class.forName("com.google.gson.JsonNull"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.gson.JsonElement");
        Object[] args = new Object[1];
        args[0] = term86307;
        callMethod(klass, "put", argTypes, term86163, args);
    }

};


