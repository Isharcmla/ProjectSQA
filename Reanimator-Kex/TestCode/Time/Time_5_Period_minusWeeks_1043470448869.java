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

public class Period_minusWeeks_1043470448869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3985929;

    public Period_minusWeeks_1043470448869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3985929 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3985983 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3985562 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term3985574 = (int[]) newIntArray(19);
        setField(term3985983, term3985983.getClass(), "iTypes", term3985562);
        setField(term3985929, term3985929.getClass(), "iType", term3985983);
        setField(term3985929, term3985929.getClass(), "iValues", term3985574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term3985929, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


