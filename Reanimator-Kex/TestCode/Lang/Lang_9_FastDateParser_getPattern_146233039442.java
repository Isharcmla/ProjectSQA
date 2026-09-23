package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;

public class FastDateParser_getPattern_146233039442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;
     Object term10564;

    public FastDateParser_getPattern_146233039442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term861, term861.getClass(), "pattern", null);
        setField(term861, term861.getClass(), "timeZone", null);
        setField(term861, term861.getClass(), "locale", null);
        setField(term861, term861.getClass(), "parsePattern", null);
        setField(term861, term861.getClass(), "strategies", null);
        setIntField(term861, term861.getClass(), "thisYear", 0);
        setField(term861, term861.getClass(), "nameValues", null);
        setField(term861, term861.getClass(), "currentFormatField", null);
        setField(term861, term861.getClass(), "nextStrategy", null);
        term10564 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term10564, term10564.getClass(), "pattern", null);
        setField(term10564, term10564.getClass(), "timeZone", null);
        setField(term10564, term10564.getClass(), "locale", null);
        setField(term10564, term10564.getClass(), "parsePattern", null);
        setField(term10564, term10564.getClass(), "strategies", null);
        setIntField(term10564, term10564.getClass(), "thisYear", 0);
        setField(term10564, term10564.getClass(), "nameValues", null);
        setField(term10564, term10564.getClass(), "currentFormatField", null);
        setField(term10564, term10564.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPattern", argTypes, term861, args);
        assertTrue(recursiveEquals(term861, term10564));
        assertTrue(recursiveEquals(retValue, null));
    }

};


