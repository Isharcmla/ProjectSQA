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

public class Period_withDays_1003115198482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260666;

    public Period_withDays_1003115198482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260666 = newInstance(Class.forName("org.joda.time.Period"));
        Object term260720 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term259059 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term259074 = (int[]) newIntArray(245);
        setField(term260720, term260720.getClass(), "iTypes", term259059);
        setField(term260666, term260666.getClass(), "iType", term260720);
        setField(term260666, term260666.getClass(), "iValues", term259074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withDays", argTypes, term260666, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


