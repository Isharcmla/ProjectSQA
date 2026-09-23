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

public class JsonTreeWriter_beginArray_712666648320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81673;

    public JsonTreeWriter_beginArray_712666648320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81763 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term81725 = new ArrayList();
        ((ArrayList) term81725).add(term81763);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add((Object)null);
        ((ArrayList) term81725).add("");
        term81673 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        setField(term81673, term81673.getClass(), "pendingName", null);
        setField(term81673, term81673.getClass(), "stack", term81725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginArray", argTypes, term81673, args);
    }

};


