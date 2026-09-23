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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155017;

    public JsonReader_syntaxError_824930160243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155017 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term152911 = (int[]) newIntArray(491);
        int[] term154388 = (int[]) newIntArray(489);
        setIntField(term155017, term155017.getClass(), "lineNumber", 0);
        setIntField(term155017, term155017.getClass(), "pos", 0);
        setIntField(term155017, term155017.getClass(), "lineStart", 0);
        setIntField(term155017, term155017.getClass(), "stackSize", 3);
        setIntElement(term152911, 0, -752870423);
        setIntElement(term152911, 1, -1698809299);
        setIntElement(term152911, 2, 2);
        setField(term155017, term155017.getClass(), "stack", term152911);
        setIntElement(term154388, 0, 32);
        setIntElement(term154388, 1, 112);
        setIntElement(term154388, 2, 97);
        setIntElement(term154388, 3, 116);
        setIntElement(term154388, 4, 104);
        setIntElement(term154388, 5, 32);
        setField(term155017, term155017.getClass(), "pathIndices", term154388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term155017, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


