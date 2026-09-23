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

public class DateTimeFormatterBuilder_append_58061458447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75107;
     Object term74929;
     Object term75689;
     Object term75694;
     Object term75668;

    public DateTimeFormatterBuilder_append_58061458447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term75197 = new ArrayList();
        term75107 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term75145 = newInstance(Class.forName("java.lang.Object"));
        setField(term75107, term75107.getClass(), "iFormatter", term75145);
        setField(term75107, term75107.getClass(), "iElementPairs", term75197);
        Class<? extends Object> term75699 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term75698 = ((Class) term75699).getDeclaredField((String) "INSTANCE");
        ((Field) term75698).setAccessible(true);
        Object enum18 = ((Field) term75698).get((Object) null);
        term74929 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setElement(term74929, 0, enum18);
        Object term75692 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term75693 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term75692, term75692.getClass(), "iParsers", term75693);
        setIntField(term75692, term75692.getClass(), "iParsedLengthEstimate", 3);
        ArrayList term75690 = new ArrayList();
        ((ArrayList) term75690).add((Object)null);
        ((ArrayList) term75690).add(term75692);
        term75689 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term75689, term75689.getClass(), "iElementPairs", term75690);
        setField(term75689, term75689.getClass(), "iFormatter", null);
        Class<? extends Object> term76010 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term76009 = ((Class) term76010).getDeclaredField((String) "INSTANCE");
        ((Field) term76009).setAccessible(true);
        Object enum19 = ((Field) term76009).get((Object) null);
        term75694 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setElement(term75694, 0, enum19);
        Object term75671 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        Object[] term75672 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setField(term75671, term75671.getClass(), "iParsers", term75672);
        setIntField(term75671, term75671.getClass(), "iParsedLengthEstimate", 3);
        ArrayList term75669 = new ArrayList();
        ((ArrayList) term75669).add((Object)null);
        ((ArrayList) term75669).add(term75671);
        term75668 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term75668, term75668.getClass(), "iElementPairs", term75669);
        setField(term75668, term75668.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term74929;
        Object retValue = callMethod(klass, "append", argTypes, term75107, args);
        assertTrue(recursiveEquals(term75107, term75689));
        assertTrue(recursiveEquals(term74929, term75694));
        assertTrue(recursiveEquals(retValue, term75668));
    }

};


