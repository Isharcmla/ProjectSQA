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
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_getFormatter_212779326144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696;
     Object term12995;
     Object term12989;

    public DateTimeFormatterBuilder_getFormatter_212779326144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term697 = new ArrayList();
        term696 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term701 = newInstance(Class.forName("java.lang.Object"));
        setField(term696, term696.getClass(), "iElementPairs", term697);
        setField(term696, term696.getClass(), "iFormatter", term701);
        ArrayList term12996 = new ArrayList();
        term12995 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term12998 = newInstance(Class.forName("java.lang.Object"));
        setField(term12995, term12995.getClass(), "iElementPairs", term12996);
        setField(term12995, term12995.getClass(), "iFormatter", term12998);
        term12989 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFormatter", argTypes, term696, args);
        assertTrue(recursiveEquals(term696, term12995));
        assertTrue(recursiveEquals(retValue, term12989));
    }

};


