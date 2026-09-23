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

public class StdDateFormat_getRFC1123Format_58229583512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1068;

    public StdDateFormat_getRFC1123Format_58229583512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1068 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term1073 = (long[]) newLongArray(7);
        int[] term1081 = (int[]) newIntArray(4);
        setIntField(term1068, term1068.getClass(), "rawOffset", 10800000);
        setIntField(term1068, term1068.getClass(), "rawOffsetDiff", 0);
        setIntField(term1068, term1068.getClass(), "checksum", -1382808297);
        setIntField(term1068, term1068.getClass(), "dstSavings", 0);
        setLongElement(term1073, 0, -9048018124799999L);
        setLongElement(term1073, 1, -7971507552255998L);
        setLongElement(term1073, 2, -5364722073600000L);
        setLongElement(term1073, 3, -5169025843199998L);
        setLongElement(term1073, 4, -4265526067199997L);
        setLongElement(term1073, 5, -3544292966400000L);
        setLongElement(term1073, 6, 8660459520000000L);
        setField(term1068, term1068.getClass(), "transitions", term1073);
        setIntElement(term1081, 0, 10800000);
        setIntElement(term1081, 1, 8836000);
        setIntElement(term1081, 2, 9000000);
        setIntElement(term1081, 3, 9900000);
        setField(term1068, term1068.getClass(), "offsets", term1081);
        setField(term1068, term1068.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1068, term1068.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1068, term1068.getClass(), "dirty", false);
        setField(term1068, term1068.getClass(), "lastRule", null);
        setField(term1068, term1068.getClass(), "ID", "Africa/Mogadishu");
        setField(term1068, term1068.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term1068;
        callMethod(klass, "getRFC1123Format", argTypes, null, args);
    }

};


