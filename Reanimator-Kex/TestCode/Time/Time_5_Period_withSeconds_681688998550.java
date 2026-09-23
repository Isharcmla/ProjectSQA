package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_withSeconds_681688998550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316784;

    public Period_withSeconds_681688998550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316784 = newInstance(Class.forName("org.joda.time.Period"));
        Object term316838 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term316718 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term316838, term316838.getClass(), "iTypes", term316718);
        setField(term316784, term316784.getClass(), "iType", term316838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withSeconds", argTypes, term316784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


