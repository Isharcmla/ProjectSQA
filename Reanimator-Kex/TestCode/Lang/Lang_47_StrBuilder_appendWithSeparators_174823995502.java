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

public class StrBuilder_appendWithSeparators_174823995502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367286;
     Object term367189;
     Object term394754;
     Object term394755;

    public StrBuilder_appendWithSeparators_174823995502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367286 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term367189 = (Object[]) newArray("java.lang.Object", 489);
        term394754 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term394754, term394754.getClass(), "buffer", null);
        setIntField(term394754, term394754.getClass(), "size", 0);
        setField(term394754, term394754.getClass(), "newLine", null);
        setField(term394754, term394754.getClass(), "nullText", null);
        term394755 = (Object[]) newArray("java.lang.Object", 489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term367189;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term367286, args);
        assertTrue(recursiveEquals(term367286, term394754));
        assertTrue(recursiveEquals(term367189, term394755));
    }

};


