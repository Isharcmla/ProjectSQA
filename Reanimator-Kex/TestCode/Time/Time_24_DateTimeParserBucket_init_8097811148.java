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

public class DateTimeParserBucket_init_8097811148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public DateTimeParserBucket_init_8097811148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16374 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object[] term16206 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 0);
        setField(term16374, term16374.getClass(), "iSavedFields", term16206);
        Object term16446 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", null);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cProvider", term16446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        argTypes[2] = Class.forName("java.util.Locale");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = 0L;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


