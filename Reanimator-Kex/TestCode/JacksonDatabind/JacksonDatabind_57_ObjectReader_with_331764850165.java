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

public class ObjectReader_with_331764850165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public ObjectReader_with_331764850165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term57, term57.getClass(), "rawOffset", 18000000);
        setIntField(term57, term57.getClass(), "rawOffsetDiff", 0);
        setIntField(term57, term57.getClass(), "checksum", 0);
        setIntField(term57, term57.getClass(), "dstSavings", 0);
        setField(term57, term57.getClass(), "transitions", null);
        setField(term57, term57.getClass(), "offsets", null);
        setField(term57, term57.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term57, term57.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term57, term57.getClass(), "dirty", false);
        setField(term57, term57.getClass(), "lastRule", null);
        setField(term57, term57.getClass(), "ID", "Etc/GMT-5");
        setField(term57, term57.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term57;
        try {
            callMethod(klass, "with", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


