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
import java.lang.Object;

public class FastDateParser_isNextNumber_10688931197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22647;
     Object term22756;

    public FastDateParser_isNextNumber_10688931197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22647 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term22745 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$4"));
        setField(term22647, term22647.getClass(), "nextStrategy", term22745);
        term22756 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term22757 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$4"));
        setField(term22756, term22756.getClass(), "pattern", null);
        setField(term22756, term22756.getClass(), "timeZone", null);
        setField(term22756, term22756.getClass(), "locale", null);
        setField(term22756, term22756.getClass(), "parsePattern", null);
        setField(term22756, term22756.getClass(), "strategies", null);
        setIntField(term22756, term22756.getClass(), "thisYear", 0);
        setField(term22756, term22756.getClass(), "nameValues", null);
        setField(term22756, term22756.getClass(), "currentFormatField", null);
        setIntField(term22757, term22757.getClass(), "field", 0);
        setField(term22756, term22756.getClass(), "nextStrategy", term22757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNextNumber", argTypes, term22647, args);
        assertTrue(recursiveEquals(term22647, term22756));
        assertTrue(recursiveEquals(retValue, true));
    }

};


