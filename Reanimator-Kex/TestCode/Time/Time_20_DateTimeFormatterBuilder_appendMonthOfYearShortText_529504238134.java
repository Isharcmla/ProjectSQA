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

public class DateTimeFormatterBuilder_appendMonthOfYearShortText_529504238134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;
     Object term11238;
     Object term11222;

    public DateTimeFormatterBuilder_appendMonthOfYearShortText_529504238134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term495 = new ArrayList();
        term494 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term499 = newInstance(Class.forName("java.lang.Object"));
        setField(term494, term494.getClass(), "iElementPairs", term495);
        setField(term494, term494.getClass(), "iFormatter", term499);
        Object term11241 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11242 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11242, term11242.getClass(), "iOrdinal", (byte) 7);
        setField(term11242, term11242.getClass(), "iUnitType", null);
        setField(term11242, term11242.getClass(), "iRangeType", null);
        setField(term11242, term11242.getClass(), "iName", null);
        setField(term11241, term11241.getClass(), "iFieldType", term11242);
        setBooleanField(term11241, term11241.getClass(), "iShort", true);
        ArrayList term11239 = new ArrayList();
        ((ArrayList) term11239).add(term11241);
        ((ArrayList) term11239).add(term11241);
        term11238 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11238, term11238.getClass(), "iElementPairs", term11239);
        setField(term11238, term11238.getClass(), "iFormatter", null);
        Object term11225 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11226 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11226, term11226.getClass(), "iOrdinal", (byte) 7);
        setField(term11226, term11226.getClass(), "iUnitType", null);
        setField(term11226, term11226.getClass(), "iRangeType", null);
        setField(term11226, term11226.getClass(), "iName", null);
        setField(term11225, term11225.getClass(), "iFieldType", term11226);
        setBooleanField(term11225, term11225.getClass(), "iShort", true);
        ArrayList term11223 = new ArrayList();
        ((ArrayList) term11223).add(term11225);
        ((ArrayList) term11223).add(term11225);
        term11222 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11222, term11222.getClass(), "iElementPairs", term11223);
        setField(term11222, term11222.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendMonthOfYearShortText", argTypes, term494, args);
        assertTrue(recursiveEquals(term494, term11238));
        assertTrue(recursiveEquals(retValue, term11222));
    }

};


