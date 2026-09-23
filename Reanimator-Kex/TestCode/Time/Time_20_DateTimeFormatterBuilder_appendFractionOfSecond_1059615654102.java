package org.joda.time.format;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendFractionOfSecond_1059615654102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;
     Object term230;
     Object term232;

    public DateTimeFormatterBuilder_appendFractionOfSecond_1059615654102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term225 = new ArrayList();
        term224 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term229 = newInstance(Class.forName("java.lang.Object"));
        setField(term224, term224.getClass(), "iElementPairs", term225);
        setField(term224, term224.getClass(), "iFormatter", term229);
        term230 = new Integer(-1339778481);
        term232 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term230;
        args[1] = term232;
        try {
            callMethod(klass, "appendFractionOfSecond", argTypes, term224, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


