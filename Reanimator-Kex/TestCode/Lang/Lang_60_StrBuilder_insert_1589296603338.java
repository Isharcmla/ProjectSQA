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

public class StrBuilder_insert_1589296603338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64947;
     Object term149338;
     Object term149332;

    public StrBuilder_insert_1589296603338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64947 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term149338 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149338, term149338.getClass(), "buffer", null);
        setIntField(term149338, term149338.getClass(), "size", 0);
        setField(term149338, term149338.getClass(), "newLine", null);
        setField(term149338, term149338.getClass(), "nullText", null);
        term149332 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term149332, term149332.getClass(), "buffer", null);
        setIntField(term149332, term149332.getClass(), "size", 0);
        setField(term149332, term149332.getClass(), "newLine", null);
        setField(term149332, term149332.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        Object retValue = callMethod(klass, "insert", argTypes, term64947, args);
        assertTrue(recursiveEquals(term64947, term149338));
        assertTrue(recursiveEquals(retValue, term149332));
    }

};


