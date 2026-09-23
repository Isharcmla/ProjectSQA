package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BasicMonthOfYearDateTimeField_readResolve_59069893935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public BasicMonthOfYearDateTimeField_readResolve_59069893935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term112, term112.getClass(), "iChronology", null);
        setIntField(term112, term112.getClass(), "iMax", -157887805);
        setIntField(term112, term112.getClass(), "iLeapMonth", 1876565163);
        setLongField(term112, term112.getClass(), "iUnitMillis", 1967728129628047933L);
        setField(term112, term112.getClass(), "iDurationField", null);
        setField(term112, term112.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readResolve", argTypes, term112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


