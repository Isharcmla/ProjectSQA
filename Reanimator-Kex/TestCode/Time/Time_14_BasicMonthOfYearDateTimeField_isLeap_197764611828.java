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

public class BasicMonthOfYearDateTimeField_isLeap_197764611828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term80;

    public BasicMonthOfYearDateTimeField_isLeap_197764611828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term76, term76.getClass(), "iChronology", null);
        setIntField(term76, term76.getClass(), "iMax", -244121226);
        setIntField(term76, term76.getClass(), "iLeapMonth", -203030934);
        setLongField(term76, term76.getClass(), "iUnitMillis", 5127676408959197577L);
        setField(term76, term76.getClass(), "iDurationField", null);
        setField(term76, term76.getClass(), "iType", null);
        term80 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term80;
        try {
            callMethod(klass, "isLeap", argTypes, term76, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


