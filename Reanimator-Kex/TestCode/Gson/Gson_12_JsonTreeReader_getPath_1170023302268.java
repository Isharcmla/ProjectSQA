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
import java.lang.NullPointerException;
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_getPath_1170023302268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87939;

    public JsonTreeReader_getPath_1170023302268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87939 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term87681 = (Object[]) newArray("java.lang.Object", 44);
        Object term87995 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term88071 = newInstance(Class.forName("java.util.concurrent.DelayQueue$Itr"));
        Object term88109 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87939, term87939.getClass(), "stackSize", 2);
        setElement(term87681, 1, term87995);
        setElement(term87681, 2, term88071);
        setElement(term87681, 8, term88109);
        setField(term87939, term87939.getClass(), "stack", term87681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term87939, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


