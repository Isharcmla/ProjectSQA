package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_appendTimeZoneShortName_1598799027138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539;
     Object term11339;
     Object term11332;

    public DateTimeFormatterBuilder_appendTimeZoneShortName_1598799027138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term540 = new ArrayList();
        term539 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term544 = newInstance(Class.forName("java.lang.Object"));
        setField(term539, term539.getClass(), "iElementPairs", term540);
        setField(term539, term539.getClass(), "iFormatter", term544);
        Object term11342 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11342, term11342.getClass(), "iParseLookup", null);
        setIntField(term11342, term11342.getClass(), "iType", 1);
        ArrayList term11340 = new ArrayList();
        ((ArrayList) term11340).add(term11342);
        ((ArrayList) term11340).add((Object)null);
        term11339 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11339, term11339.getClass(), "iElementPairs", term11340);
        setField(term11339, term11339.getClass(), "iFormatter", null);
        Object term11335 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11335, term11335.getClass(), "iParseLookup", null);
        setIntField(term11335, term11335.getClass(), "iType", 1);
        ArrayList term11333 = new ArrayList();
        ((ArrayList) term11333).add(term11335);
        ((ArrayList) term11333).add((Object)null);
        term11332 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11332, term11332.getClass(), "iElementPairs", term11333);
        setField(term11332, term11332.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendTimeZoneShortName", argTypes, term539, args);
        assertTrue(recursiveEquals(term539, term11339));
        assertTrue(recursiveEquals(retValue, term11332));
    }

};


