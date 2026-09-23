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
import java.lang.Object;

public class MutableDateTime_parse_144534513591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public MutableDateTime_parse_144534513591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19704 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term19704, term19704.getClass(), "iNameKey", "UTC");
        setIntField(term19704, term19704.getClass(), "iWallOffset", 0);
        setIntField(term19704, term19704.getClass(), "iStandardOffset", 0);
        setField(term19704, term19704.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term19704);
        Object term19818 = newInstance(Class.forName("java.util.Locale"));
        setField(null, Class.forName("java.util.Locale"), "defaultLocale", term19818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.MutableDateTime");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parse", argTypes, null, args);
    }

};


