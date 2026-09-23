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

public class BasicMonthOfYearDateTimeField_getDifferenceAsLong_67843448325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term60;
     Object term62;

    public BasicMonthOfYearDateTimeField_getDifferenceAsLong_67843448325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term56, term56.getClass(), "iChronology", null);
        setIntField(term56, term56.getClass(), "iMax", -2068769794);
        setIntField(term56, term56.getClass(), "iLeapMonth", -117576464);
        setLongField(term56, term56.getClass(), "iUnitMillis", -8885298608300233488L);
        setField(term56, term56.getClass(), "iDurationField", null);
        setField(term56, term56.getClass(), "iType", null);
        term60 = new Long(-4325723315152823407L);
        term62 = new Long(2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term60;
        args[1] = term62;
        try {
            callMethod(klass, "getDifferenceAsLong", argTypes, term56, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


