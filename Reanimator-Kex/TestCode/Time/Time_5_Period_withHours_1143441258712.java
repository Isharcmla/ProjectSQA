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

public class Period_withHours_1143441258712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302756;

    public Period_withHours_1143441258712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1302756 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1302810 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1274353 = (Object[]) newArray("org.joda.time.DurationFieldType", 109);
        int[] term1274464 = (int[]) newIntArray(249);
        setField(term1302810, term1302810.getClass(), "iTypes", term1274353);
        setField(term1302756, term1302756.getClass(), "iType", term1302810);
        setField(term1302756, term1302756.getClass(), "iValues", term1274464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1302756, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


