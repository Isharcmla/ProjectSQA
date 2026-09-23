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

public class FastDateParser_getParsePattern_118418362645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2021;
     Object term10573;

    public FastDateParser_getParsePattern_118418362645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2021 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term2021, term2021.getClass(), "pattern", null);
        setField(term2021, term2021.getClass(), "timeZone", null);
        setField(term2021, term2021.getClass(), "locale", null);
        setField(term2021, term2021.getClass(), "parsePattern", null);
        setField(term2021, term2021.getClass(), "strategies", null);
        setIntField(term2021, term2021.getClass(), "thisYear", 0);
        setField(term2021, term2021.getClass(), "nameValues", null);
        setField(term2021, term2021.getClass(), "currentFormatField", null);
        setField(term2021, term2021.getClass(), "nextStrategy", null);
        term10573 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term10573, term10573.getClass(), "pattern", null);
        setField(term10573, term10573.getClass(), "timeZone", null);
        setField(term10573, term10573.getClass(), "locale", null);
        setField(term10573, term10573.getClass(), "parsePattern", null);
        setField(term10573, term10573.getClass(), "strategies", null);
        setIntField(term10573, term10573.getClass(), "thisYear", 0);
        setField(term10573, term10573.getClass(), "nameValues", null);
        setField(term10573, term10573.getClass(), "currentFormatField", null);
        setField(term10573, term10573.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParsePattern", argTypes, term2021, args);
        assertTrue(recursiveEquals(term2021, term10573));
        assertTrue(recursiveEquals(retValue, null));
    }

};


