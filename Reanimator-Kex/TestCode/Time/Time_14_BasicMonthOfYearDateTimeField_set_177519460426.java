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
import java.lang.Long;
import java.lang.Integer;

public class BasicMonthOfYearDateTimeField_set_177519460426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;
     Object term68;
     Object term70;

    public BasicMonthOfYearDateTimeField_set_177519460426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term64, term64.getClass(), "iChronology", null);
        setIntField(term64, term64.getClass(), "iMax", -1007160944);
        setIntField(term64, term64.getClass(), "iLeapMonth", 1135664017);
        setLongField(term64, term64.getClass(), "iUnitMillis", -5476826692763582090L);
        setField(term64, term64.getClass(), "iDurationField", null);
        setField(term64, term64.getClass(), "iType", null);
        term68 = new Long(-872011222785455006L);
        term70 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term68;
        args[1] = term70;
        try {
            callMethod(klass, "set", argTypes, term64, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


