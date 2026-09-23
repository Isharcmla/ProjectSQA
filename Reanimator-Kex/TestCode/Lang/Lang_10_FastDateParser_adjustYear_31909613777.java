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

public class FastDateParser_adjustYear_31909613777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20327;
     Object term20333;

    public FastDateParser_adjustYear_31909613777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20327 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setIntField(term20327, term20327.getClass(), "thisYear", 2147483627);
        term20333 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term20333, term20333.getClass(), "pattern", null);
        setField(term20333, term20333.getClass(), "timeZone", null);
        setField(term20333, term20333.getClass(), "locale", null);
        setField(term20333, term20333.getClass(), "parsePattern", null);
        setField(term20333, term20333.getClass(), "strategies", null);
        setIntField(term20333, term20333.getClass(), "thisYear", 2147483627);
        setField(term20333, term20333.getClass(), "nameValues", null);
        setField(term20333, term20333.getClass(), "currentFormatField", null);
        setField(term20333, term20333.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 47;
        Object retValue = callMethod(klass, "adjustYear", argTypes, term20327, args);
        assertTrue(recursiveEquals(term20327, term20333));
        assertTrue(recursiveEquals(retValue, 2147483547));
    }

};


