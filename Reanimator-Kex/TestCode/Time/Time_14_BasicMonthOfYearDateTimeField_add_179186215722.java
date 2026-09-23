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

public class BasicMonthOfYearDateTimeField_add_179186215722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term25;
     Object term27;

    public BasicMonthOfYearDateTimeField_add_179186215722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term21, term21.getClass(), "iChronology", null);
        setIntField(term21, term21.getClass(), "iMax", 1227103734);
        setIntField(term21, term21.getClass(), "iLeapMonth", -1339778481);
        setLongField(term21, term21.getClass(), "iUnitMillis", 7411271909051562686L);
        setField(term21, term21.getClass(), "iDurationField", null);
        setField(term21, term21.getClass(), "iType", null);
        term25 = new Long(4872422362414183754L);
        term27 = new Long(6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term25;
        args[1] = term27;
        try {
            callMethod(klass, "add", argTypes, term21, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


