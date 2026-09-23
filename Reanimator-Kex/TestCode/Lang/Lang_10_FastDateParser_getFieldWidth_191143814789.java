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

public class FastDateParser_getFieldWidth_191143814789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22170;
     Object term22214;

    public FastDateParser_getFieldWidth_191143814789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22170 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term22170, term22170.getClass(), "currentFormatField", "");
        term22214 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term22214, term22214.getClass(), "pattern", null);
        setField(term22214, term22214.getClass(), "timeZone", null);
        setField(term22214, term22214.getClass(), "locale", null);
        setField(term22214, term22214.getClass(), "parsePattern", null);
        setField(term22214, term22214.getClass(), "strategies", null);
        setIntField(term22214, term22214.getClass(), "thisYear", 0);
        setField(term22214, term22214.getClass(), "nameValues", null);
        setField(term22214, term22214.getClass(), "currentFormatField", "");
        setField(term22214, term22214.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFieldWidth", argTypes, term22170, args);
        assertTrue(recursiveEquals(term22170, term22214));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


