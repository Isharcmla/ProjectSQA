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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_isMatch_1654379670116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51189;

    public Partial_isMatch_1654379670116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51189 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term51064 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 2);
        setField(term51189, term51189.getClass(), "iTypes", term51064);
        Object term51263 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term51263, term51263.getClass(), "iNameKey", "UTC");
        setIntField(term51263, term51263.getClass(), "iWallOffset", 0);
        setIntField(term51263, term51263.getClass(), "iStandardOffset", 0);
        setField(term51263, term51263.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term51263);
        Object term51441 = newInstance(Class.forName("org.joda.time.DateTimeUtils$SystemMillisProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeUtils"), "cMillisProvider", term51441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isMatch", argTypes, term51189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
