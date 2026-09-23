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

public class BasicMonthOfYearDateTimeField_getMinimumValue_134246295531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term3301;

    public BasicMonthOfYearDateTimeField_getMinimumValue_134246295531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term92, term92.getClass(), "iChronology", null);
        setIntField(term92, term92.getClass(), "iMax", -1087774327);
        setIntField(term92, term92.getClass(), "iLeapMonth", -1530420153);
        setLongField(term92, term92.getClass(), "iUnitMillis", 8059786003080744426L);
        setField(term92, term92.getClass(), "iDurationField", null);
        setField(term92, term92.getClass(), "iType", null);
        term3301 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term3301, term3301.getClass(), "iChronology", null);
        setIntField(term3301, term3301.getClass(), "iMax", -1087774327);
        setIntField(term3301, term3301.getClass(), "iLeapMonth", -1530420153);
        setLongField(term3301, term3301.getClass(), "iUnitMillis", 8059786003080744426L);
        setField(term3301, term3301.getClass(), "iDurationField", null);
        setField(term3301, term3301.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinimumValue", argTypes, term92, args);
        assertTrue(recursiveEquals(term92, term3301));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


