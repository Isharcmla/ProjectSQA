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

public class BasicMonthOfYearDateTimeField_add_179186314921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term17;
     Object term19;

    public BasicMonthOfYearDateTimeField_add_179186314921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term13, term13.getClass(), "iChronology", null);
        setIntField(term13, term13.getClass(), "iMax", -616727354);
        setIntField(term13, term13.getClass(), "iLeapMonth", -1955890973);
        setLongField(term13, term13.getClass(), "iUnitMillis", -8400487765614892086L);
        setField(term13, term13.getClass(), "iDurationField", null);
        setField(term13, term13.getClass(), "iType", null);
        term17 = new Long(5270370404989704783L);
        term19 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term17;
        args[1] = term19;
        try {
            callMethod(klass, "add", argTypes, term13, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


