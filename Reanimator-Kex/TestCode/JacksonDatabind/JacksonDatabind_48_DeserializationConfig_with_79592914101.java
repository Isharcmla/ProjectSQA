package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DeserializationConfig_with_79592914101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;

    public DeserializationConfig_with_79592914101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term37, term37.getClass(), "rawOffset", 18000000);
        setIntField(term37, term37.getClass(), "rawOffsetDiff", 0);
        setIntField(term37, term37.getClass(), "checksum", 0);
        setIntField(term37, term37.getClass(), "dstSavings", 0);
        setField(term37, term37.getClass(), "transitions", null);
        setField(term37, term37.getClass(), "offsets", null);
        setField(term37, term37.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term37, term37.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term37, term37.getClass(), "dirty", false);
        setField(term37, term37.getClass(), "lastRule", null);
        setField(term37, term37.getClass(), "ID", "Etc/GMT-5");
        setField(term37, term37.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term37;
        try {
            callMethod(klass, "with", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


