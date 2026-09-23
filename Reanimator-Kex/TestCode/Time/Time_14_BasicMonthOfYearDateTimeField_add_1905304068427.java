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
import java.lang.Object;

public class BasicMonthOfYearDateTimeField_add_1905304068427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146020;
     Object term146078;

    public BasicMonthOfYearDateTimeField_add_1905304068427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146020 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term146078 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
        Object term146162 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        Object term146266 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term146352 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term146458 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term146352, term146352.getClass(), "iType", null);
        setField(term146266, term146266.getClass(), "iUnitField", term146352);
        setField(term146162, term146162.getClass(), "iYear", term146266);
        setField(term146162, term146162.getClass(), "iMonthOfYear", term146458);
        setField(term146078, term146078.getClass(), "iChronology", term146162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term146078;
        args[1] = 0;
        args[2] = null;
        args[3] = -1;
        try {
            callMethod(klass, "add", argTypes, term146020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


