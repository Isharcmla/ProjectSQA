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

public class FastDateParser_adjustYear_319096137115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25161;
     Object term25420;

    public FastDateParser_adjustYear_319096137115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25161 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setIntField(term25161, term25161.getClass(), "thisYear", 2147483627);
        term25420 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term25420, term25420.getClass(), "pattern", null);
        setField(term25420, term25420.getClass(), "timeZone", null);
        setField(term25420, term25420.getClass(), "locale", null);
        setField(term25420, term25420.getClass(), "parsePattern", null);
        setField(term25420, term25420.getClass(), "strategies", null);
        setIntField(term25420, term25420.getClass(), "thisYear", 2147483627);
        setField(term25420, term25420.getClass(), "nameValues", null);
        setField(term25420, term25420.getClass(), "currentFormatField", null);
        setField(term25420, term25420.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 47;
        Object retValue = callMethod(klass, "adjustYear", argTypes, term25161, args);
        assertTrue(recursiveEquals(term25161, term25420));
        assertTrue(recursiveEquals(retValue, 2147483547));
    }

};


