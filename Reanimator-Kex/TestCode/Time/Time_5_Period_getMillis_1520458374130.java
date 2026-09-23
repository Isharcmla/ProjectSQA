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

public class Period_getMillis_1520458374130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;

    public Period_getMillis_1520458374130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term962 = newInstance(Class.forName("org.joda.time.Period"));
        Object term963 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term976 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term977 = (int[]) newIntArray(5);
        int[] term983 = (int[]) newIntArray(6);
        setField(term963, term963.getClass(), "iName", "MjGYSRKTNF");
        setField(term963, term963.getClass(), "iTypes", term976);
        setIntElement(term977, 0, -2068769794);
        setIntElement(term977, 1, -117576464);
        setIntElement(term977, 2, -1007160944);
        setIntElement(term977, 3, 1135664017);
        setIntElement(term977, 4, 590364439);
        setField(term963, term963.getClass(), "iIndices", term977);
        setField(term962, term962.getClass(), "iType", term963);
        setField(term962, term962.getClass(), "iValues", term983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getMillis", argTypes, term962, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


