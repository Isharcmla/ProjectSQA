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

public class FastDateParser_isNextNumber_10688931161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9163;
     Object term16650;

    public FastDateParser_isNextNumber_10688931161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9163 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term9163, term9163.getClass(), "pattern", null);
        setField(term9163, term9163.getClass(), "timeZone", null);
        setField(term9163, term9163.getClass(), "locale", null);
        setField(term9163, term9163.getClass(), "parsePattern", null);
        setField(term9163, term9163.getClass(), "strategies", null);
        setIntField(term9163, term9163.getClass(), "thisYear", 0);
        setField(term9163, term9163.getClass(), "nameValues", null);
        setField(term9163, term9163.getClass(), "currentFormatField", null);
        setField(term9163, term9163.getClass(), "nextStrategy", null);
        term16650 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term16650, term16650.getClass(), "pattern", null);
        setField(term16650, term16650.getClass(), "timeZone", null);
        setField(term16650, term16650.getClass(), "locale", null);
        setField(term16650, term16650.getClass(), "parsePattern", null);
        setField(term16650, term16650.getClass(), "strategies", null);
        setIntField(term16650, term16650.getClass(), "thisYear", 0);
        setField(term16650, term16650.getClass(), "nameValues", null);
        setField(term16650, term16650.getClass(), "currentFormatField", null);
        setField(term16650, term16650.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNextNumber", argTypes, term9163, args);
        assertTrue(recursiveEquals(term9163, term16650));
        assertTrue(recursiveEquals(retValue, false));
    }

};


