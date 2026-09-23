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
import java.lang.String;

public class DateTimeFormatterBuilder_append_58061458467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80415;
     Object term80192;
     Object term81961;
     Object term81966;
     Object term81940;

    public DateTimeFormatterBuilder_append_58061458467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term80505 = new ArrayList();
        term80415 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term80453 = newInstance(Class.forName("java.lang.Object"));
        setField(term80415, term80415.getClass(), "iFormatter", term80453);
        setField(term80415, term80415.getClass(), "iElementPairs", term80505);
        Class<? extends Object> term81971 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term81970 = ((Class) term81971).getDeclaredField((String) "INSTANCE");
        ((Field) term81970).setAccessible(true);
        Object enum23 = ((Field) term81970).get((Object) null);
        Class<? extends Object> term82282 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term82281 = ((Class) term82282).getDeclaredField((String) "INSTANCE");
        ((Field) term82281).setAccessible(true);
        Object enum24 = ((Field) term82281).get((Object) null);
        Class<? extends Object> term82593 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term82592 = ((Class) term82593).getDeclaredField((String) "INSTANCE");
        ((Field) term82592).setAccessible(true);
        Object enum25 = ((Field) term82592).get((Object) null);
        term80192 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        setElement(term80192, 0, enum23);
        setElement(term80192, 1, enum23);
        setElement(term80192, 2, enum24);
        setElement(term80192, 3, enum23);
        setElement(term80192, 4, enum25);
        Object term81964 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term81965 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        setField(term81964, term81964.getClass(), "iParsers", term81965);
        setIntField(term81964, term81964.getClass(), "iParsedLengthEstimate", 3);
        ArrayList term81962 = new ArrayList();
        ((ArrayList) term81962).add((Object)null);
        ((ArrayList) term81962).add(term81964);
        term81961 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term81961, term81961.getClass(), "iElementPairs", term81962);
        setField(term81961, term81961.getClass(), "iFormatter", null);
        Class<? extends Object> term82904 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term82903 = ((Class) term82904).getDeclaredField((String) "INSTANCE");
        ((Field) term82903).setAccessible(true);
        Object enum26 = ((Field) term82903).get((Object) null);
        term81966 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        setElement(term81966, 0, enum26);
        setElement(term81966, 1, enum26);
        setElement(term81966, 2, enum26);
        setElement(term81966, 3, enum26);
        setElement(term81966, 4, enum26);
        Object term81943 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term81944 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        setField(term81943, term81943.getClass(), "iParsers", term81944);
        setIntField(term81943, term81943.getClass(), "iParsedLengthEstimate", 3);
        ArrayList term81941 = new ArrayList();
        ((ArrayList) term81941).add((Object)null);
        ((ArrayList) term81941).add(term81943);
        term81940 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term81940, term81940.getClass(), "iElementPairs", term81941);
        setField(term81940, term81940.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term80192;
        Object retValue = callMethod(klass, "append", argTypes, term80415, args);
        assertTrue(recursiveEquals(term80415, term81961));
        assertTrue(recursiveEquals(term80192, term81966));
        assertTrue(recursiveEquals(retValue, term81940));
    }

};


