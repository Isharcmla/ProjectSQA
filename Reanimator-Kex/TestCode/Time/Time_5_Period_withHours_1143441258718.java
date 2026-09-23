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

public class Period_withHours_1143441258718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1491515;

    public Period_withHours_1143441258718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1491515 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1491569 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1369990 = (Object[]) newArray("org.joda.time.DurationFieldType", 241);
        int[] term1370233 = (int[]) newIntArray(493);
        setField(term1491569, term1491569.getClass(), "iTypes", term1369990);
        setField(term1491515, term1491515.getClass(), "iType", term1491569);
        setField(term1491515, term1491515.getClass(), "iValues", term1370233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1491515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


