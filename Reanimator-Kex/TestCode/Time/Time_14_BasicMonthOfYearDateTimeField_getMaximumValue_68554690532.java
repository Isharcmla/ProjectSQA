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

public class BasicMonthOfYearDateTimeField_getMaximumValue_68554690532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term3308;

    public BasicMonthOfYearDateTimeField_getMaximumValue_68554690532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term96, term96.getClass(), "iChronology", null);
        setIntField(term96, term96.getClass(), "iMax", -469968304);
        setIntField(term96, term96.getClass(), "iLeapMonth", -1145578966);
        setLongField(term96, term96.getClass(), "iUnitMillis", -4365849114644724155L);
        setField(term96, term96.getClass(), "iDurationField", null);
        setField(term96, term96.getClass(), "iType", null);
        term3308 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term3308, term3308.getClass(), "iChronology", null);
        setIntField(term3308, term3308.getClass(), "iMax", -469968304);
        setIntField(term3308, term3308.getClass(), "iLeapMonth", -1145578966);
        setLongField(term3308, term3308.getClass(), "iUnitMillis", -4365849114644724155L);
        setField(term3308, term3308.getClass(), "iDurationField", null);
        setField(term3308, term3308.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximumValue", argTypes, term96, args);
        assertTrue(recursiveEquals(term96, term3308));
        assertTrue(recursiveEquals(retValue, -469968304));
    }

};


