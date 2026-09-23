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

public class DateTimeParserBucket_init_8097811160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22055;

    public DateTimeParserBucket_init_8097811160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21977 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object[] term21877 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 0);
        setField(term21977, term21977.getClass(), "iSavedFields", term21877);
        term22055 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology"));
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
        args[1] = term22055;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


