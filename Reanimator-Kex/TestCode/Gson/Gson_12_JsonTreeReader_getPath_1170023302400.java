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

public class JsonTreeReader_getPath_1170023302400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167566;

    public JsonTreeReader_getPath_1170023302400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167566 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term167301 = (Object[]) newArray("java.lang.Object", 491);
        Object term167624 = newInstance(Class.forName("com.google.gson.JsonObject"));
        Object term167680 = newInstance(Class.forName("com.google.gson.JsonArray"));
        Object term167756 = newInstance(Class.forName("java.util.concurrent.DelayQueue$Itr"));
        setIntField(term167566, term167566.getClass(), "stackSize", 3);
        setElement(term167301, 0, term167624);
        setElement(term167301, 2, term167680);
        setElement(term167301, 3, term167756);
        setField(term167566, term167566.getClass(), "stack", term167301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPath", argTypes, term167566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


