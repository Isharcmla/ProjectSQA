package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Object;

public class StrBuilder_appendAll_249730901411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80123;
     Object term80022;
     Object term127416;
     Object term127417;

    public StrBuilder_appendAll_249730901411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80123 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term80022 = (Object[]) newArray("java.lang.Object", 489);
        term127416 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127416, term127416.getClass(), "buffer", null);
        setIntField(term127416, term127416.getClass(), "size", 0);
        setField(term127416, term127416.getClass(), "newLine", null);
        setField(term127416, term127416.getClass(), "nullText", null);
        term127417 = (Object[]) newArray("java.lang.Object", 489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80022;
        callMethod(klass, "appendAll", argTypes, term80123, args);
        assertTrue(recursiveEquals(term80123, term127416));
        assertTrue(recursiveEquals(term80022, term127417));
    }

};


