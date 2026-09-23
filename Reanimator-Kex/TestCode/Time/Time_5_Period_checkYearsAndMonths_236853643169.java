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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_checkYearsAndMonths_236853643169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2960;

    public Period_checkYearsAndMonths_236853643169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2960 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2961 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2974 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term2975 = (int[]) newIntArray(5);
        int[] term2981 = (int[]) newIntArray(6);
        setField(term2961, term2961.getClass(), "iName", "MjGYSRKTNF");
        setField(term2961, term2961.getClass(), "iTypes", term2974);
        setIntElement(term2975, 0, -2068769794);
        setIntElement(term2975, 1, -117576464);
        setIntElement(term2975, 2, -1007160944);
        setIntElement(term2975, 3, 1135664017);
        setIntElement(term2975, 4, 590364439);
        setField(term2961, term2961.getClass(), "iIndices", term2975);
        setField(term2960, term2960.getClass(), "iType", term2961);
        setField(term2960, term2960.getClass(), "iValues", term2981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        try {
            callMethod(klass, "checkYearsAndMonths", argTypes, term2960, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


