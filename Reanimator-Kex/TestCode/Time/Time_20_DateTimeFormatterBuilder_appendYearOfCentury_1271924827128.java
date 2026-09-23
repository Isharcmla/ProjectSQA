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

public class DateTimeFormatterBuilder_appendYearOfCentury_1271924827128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;
     Object term456;
     Object term458;

    public DateTimeFormatterBuilder_appendYearOfCentury_1271924827128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term451 = new ArrayList();
        term450 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term455 = newInstance(Class.forName("java.lang.Object"));
        setField(term450, term450.getClass(), "iElementPairs", term451);
        setField(term450, term450.getClass(), "iFormatter", term455);
        term456 = new Integer(-602026508);
        term458 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term456;
        args[1] = term458;
        try {
            callMethod(klass, "appendYearOfCentury", argTypes, term450, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


