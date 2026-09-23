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

public class FastDateParser_getFieldWidth_1911438147106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24000;
     Object term24105;

    public FastDateParser_getFieldWidth_1911438147106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24000 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term24000, term24000.getClass(), "currentFormatField", "");
        term24105 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term24105, term24105.getClass(), "pattern", null);
        setField(term24105, term24105.getClass(), "timeZone", null);
        setField(term24105, term24105.getClass(), "locale", null);
        setField(term24105, term24105.getClass(), "parsePattern", null);
        setField(term24105, term24105.getClass(), "strategies", null);
        setIntField(term24105, term24105.getClass(), "thisYear", 0);
        setField(term24105, term24105.getClass(), "nameValues", null);
        setField(term24105, term24105.getClass(), "currentFormatField", "");
        setField(term24105, term24105.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFieldWidth", argTypes, term24000, args);
        assertTrue(recursiveEquals(term24000, term24105));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


