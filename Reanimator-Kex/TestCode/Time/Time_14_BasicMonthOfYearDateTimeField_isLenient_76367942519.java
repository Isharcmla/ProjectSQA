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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.chrono.EqualityUtils.*;

public class BasicMonthOfYearDateTimeField_isLenient_76367942519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term511;

    public BasicMonthOfYearDateTimeField_isLenient_76367942519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term3, term3.getClass(), "iChronology", null);
        setIntField(term3, term3.getClass(), "iMax", 1162663216);
        setIntField(term3, term3.getClass(), "iLeapMonth", 1484323161);
        setLongField(term3, term3.getClass(), "iUnitMillis", 2442117782898005296L);
        setField(term3, term3.getClass(), "iDurationField", null);
        setField(term3, term3.getClass(), "iType", null);
        term511 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term511, term511.getClass(), "iChronology", null);
        setIntField(term511, term511.getClass(), "iMax", 1162663216);
        setIntField(term511, term511.getClass(), "iLeapMonth", 1484323161);
        setLongField(term511, term511.getClass(), "iUnitMillis", 2442117782898005296L);
        setField(term511, term511.getClass(), "iDurationField", null);
        setField(term511, term511.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLenient", argTypes, term3, args);
        assertTrue(recursiveEquals(term3, term511));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


