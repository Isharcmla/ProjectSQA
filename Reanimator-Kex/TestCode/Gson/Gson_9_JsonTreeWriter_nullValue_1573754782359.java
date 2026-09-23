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

public class JsonTreeWriter_nullValue_1573754782359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86583;

    public JsonTreeWriter_nullValue_1573754782359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term86743 = new ArrayList();
        Object term86691 = newInstance(Class.forName("com.google.gson.JsonArray"));
        setField(term86691, term86691.getClass(), "elements", term86743);
        ArrayList term86635 = new ArrayList();
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add((Object)null);
        ((ArrayList) term86635).add(term86691);
        term86583 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term86583, term86583.getClass(), "pendingName", null);
        setField(term86583, term86583.getClass(), "stack", term86635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nullValue", argTypes, term86583, args);
        assertTrue(recursiveEquals(retValue, 0));
    }

};


