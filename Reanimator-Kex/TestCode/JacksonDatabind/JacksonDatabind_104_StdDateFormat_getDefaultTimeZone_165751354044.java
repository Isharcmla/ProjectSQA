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
import static com.fasterxml.jackson.databind.util.EqualityUtils.*;

public class StdDateFormat_getDefaultTimeZone_165751354044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3597;

    public StdDateFormat_getDefaultTimeZone_165751354044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3597 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term3597, term3597.getClass(), "rawOffset", 0);
        setIntField(term3597, term3597.getClass(), "rawOffsetDiff", 0);
        setIntField(term3597, term3597.getClass(), "checksum", 0);
        setIntField(term3597, term3597.getClass(), "dstSavings", 0);
        setField(term3597, term3597.getClass(), "transitions", null);
        setField(term3597, term3597.getClass(), "offsets", null);
        setField(term3597, term3597.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term3597, term3597.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term3597, term3597.getClass(), "dirty", false);
        setField(term3597, term3597.getClass(), "lastRule", null);
        setField(term3597, term3597.getClass(), "ID", "UTC");
        setField(term3597, term3597.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultTimeZone", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3597));
    }

};


