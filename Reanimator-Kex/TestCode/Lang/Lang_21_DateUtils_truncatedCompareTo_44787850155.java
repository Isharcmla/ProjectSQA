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
import java.lang.Integer;

public class DateUtils_truncatedCompareTo_44787850155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12962;
     Object term12964;
     Object term12966;

    public DateUtils_truncatedCompareTo_44787850155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12962 = newInstance(Class.forName("java.util.Date"));
        setLongField(term12962, term12962.getClass(), "fastTime", 1876890800559L);
        setField(term12962, term12962.getClass(), "cdate", null);
        term12964 = newInstance(Class.forName("java.util.Date"));
        setLongField(term12964, term12964.getClass(), "fastTime", 1304550099366L);
        setField(term12964, term12964.getClass(), "cdate", null);
        term12966 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term12962;
        args[1] = term12964;
        args[2] = term12966;
        callMethod(klass, "truncatedCompareTo", argTypes, null, args);
    }

};


