package org.joda.time.base;

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
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BasePeriod_checkPeriodType_121496405222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BasePeriod_checkPeriodType_121496405222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term14 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term15 = (int[]) newIntArray(6);
        setField(term1, term1.getClass(), "iName", "RMFIsYGgne");
        setField(term1, term1.getClass(), "iTypes", term14);
        setIntElement(term15, 0, -73683645);
        setIntElement(term15, 1, -226514366);
        setIntElement(term15, 2, 1193880199);
        setIntElement(term15, 3, -1087774327);
        setIntElement(term15, 4, -1530420153);
        setIntElement(term15, 5, -469968304);
        setField(term1, term1.getClass(), "iIndices", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BasePeriod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            callMethod(klass, "checkPeriodType", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


