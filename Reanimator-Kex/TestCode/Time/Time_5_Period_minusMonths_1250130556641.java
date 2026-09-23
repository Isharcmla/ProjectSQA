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

public class Period_minusMonths_1250130556641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470654;

    public Period_minusMonths_1250130556641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470654 = newInstance(Class.forName("org.joda.time.Period"));
        Object term470708 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term459192 = (Object[]) newArray("org.joda.time.DurationFieldType", 22);
        int[] term459216 = (int[]) newIntArray(507);
        setField(term470708, term470708.getClass(), "iTypes", term459192);
        setField(term470654, term470654.getClass(), "iType", term470708);
        setField(term470654, term470654.getClass(), "iValues", term459216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMonths", argTypes, term470654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


