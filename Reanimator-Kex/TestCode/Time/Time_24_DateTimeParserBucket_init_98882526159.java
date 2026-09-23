package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeParserBucket_init_98882526159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public DateTimeParserBucket_init_98882526159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21796 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object[] term21692 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 0);
        setField(term21796, term21796.getClass(), "iSavedFields", term21692);
        Object term21872 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term21872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        argTypes[2] = Class.forName("java.util.Locale");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = 0L;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = 0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


