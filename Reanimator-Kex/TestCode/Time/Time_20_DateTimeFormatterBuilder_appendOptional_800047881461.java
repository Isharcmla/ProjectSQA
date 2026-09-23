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
import java.lang.Object;
import java.util.ArrayList;

public class DateTimeFormatterBuilder_appendOptional_800047881461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78813;
     Object term79025;
     Object term79053;
     Object term79058;
     Object term79027;

    public DateTimeFormatterBuilder_appendOptional_800047881461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term78903 = new ArrayList();
        term78813 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term78851 = newInstance(Class.forName("java.lang.Object"));
        setField(term78813, term78813.getClass(), "iFormatter", term78851);
        setField(term78813, term78813.getClass(), "iElementPairs", term78903);
        term79025 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setIntField(term79025, term79025.getClass(), "iType", -2);
        Object term79056 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term79057 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term79056, term79056.getClass(), "iParsers", term79057);
        setIntField(term79056, term79056.getClass(), "iParsedLengthEstimate", 20);
        ArrayList term79054 = new ArrayList();
        ((ArrayList) term79054).add((Object)null);
        ((ArrayList) term79054).add(term79056);
        term79053 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term79053, term79053.getClass(), "iElementPairs", term79054);
        setField(term79053, term79053.getClass(), "iFormatter", null);
        term79058 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term79058, term79058.getClass(), "iParseLookup", null);
        setIntField(term79058, term79058.getClass(), "iType", -2);
        Object term79030 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term79031 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term79030, term79030.getClass(), "iParsers", term79031);
        setIntField(term79030, term79030.getClass(), "iParsedLengthEstimate", 20);
        ArrayList term79028 = new ArrayList();
        ((ArrayList) term79028).add((Object)null);
        ((ArrayList) term79028).add(term79030);
        term79027 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term79027, term79027.getClass(), "iElementPairs", term79028);
        setField(term79027, term79027.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[1];
        args[0] = term79025;
        Object retValue = callMethod(klass, "appendOptional", argTypes, term78813, args);
        assertTrue(recursiveEquals(term78813, term79053));
        assertTrue(recursiveEquals(term79025, term79058));
        assertTrue(recursiveEquals(retValue, term79027));
    }

};


