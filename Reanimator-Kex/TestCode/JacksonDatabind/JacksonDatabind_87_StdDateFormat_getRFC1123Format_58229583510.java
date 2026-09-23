package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StdDateFormat_getRFC1123Format_58229583510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1092;

    public StdDateFormat_getRFC1123Format_58229583510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1092 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term1097 = (long[]) newLongArray(7);
        int[] term1105 = (int[]) newIntArray(4);
        setIntField(term1092, term1092.getClass(), "rawOffset", 10800000);
        setIntField(term1092, term1092.getClass(), "rawOffsetDiff", 0);
        setIntField(term1092, term1092.getClass(), "checksum", -1382808297);
        setIntField(term1092, term1092.getClass(), "dstSavings", 0);
        setLongElement(term1097, 0, -9048018124799999L);
        setLongElement(term1097, 1, -7971507552255998L);
        setLongElement(term1097, 2, -5364722073600000L);
        setLongElement(term1097, 3, -5169025843199998L);
        setLongElement(term1097, 4, -4265526067199997L);
        setLongElement(term1097, 5, -3544292966400000L);
        setLongElement(term1097, 6, 8660459520000000L);
        setField(term1092, term1092.getClass(), "transitions", term1097);
        setIntElement(term1105, 0, 10800000);
        setIntElement(term1105, 1, 8836000);
        setIntElement(term1105, 2, 9000000);
        setIntElement(term1105, 3, 9900000);
        setField(term1092, term1092.getClass(), "offsets", term1105);
        setField(term1092, term1092.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1092, term1092.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1092, term1092.getClass(), "dirty", false);
        setField(term1092, term1092.getClass(), "lastRule", null);
        setField(term1092, term1092.getClass(), "ID", "Africa/Mogadishu");
        setField(term1092, term1092.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term1092;
        callMethod(klass, "getRFC1123Format", argTypes, null, args);
    }

};


