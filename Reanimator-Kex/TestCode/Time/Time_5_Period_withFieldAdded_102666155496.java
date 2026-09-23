package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class Period_withFieldAdded_102666155496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273166;
     Object term273286;
     Object term274077;
     Object term274078;
     Object term274073;

    public Period_withFieldAdded_102666155496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273166 = newInstance(Class.forName("org.joda.time.Period"));
        term273286 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        term274077 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term274077, term274077.getClass(), "iType", null);
        setField(term274077, term274077.getClass(), "iValues", null);
        term274078 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setByteField(term274078, term274078.getClass(), "iOrdinal", (byte) 0);
        setField(term274078, term274078.getClass(), "iName", null);
        term274073 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term274073, term274073.getClass(), "iType", null);
        setField(term274073, term274073.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term273286;
        args[1] = 0;
        Object retValue = callMethod(klass, "withFieldAdded", argTypes, term273166, args);
        assertTrue(recursiveEquals(term273166, term274077));
        assertTrue(recursiveEquals(term273286, term274078));
        assertTrue(recursiveEquals(retValue, term274073));
    }

};


