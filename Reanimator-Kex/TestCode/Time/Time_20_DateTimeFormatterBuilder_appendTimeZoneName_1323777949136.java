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

public class DateTimeFormatterBuilder_appendTimeZoneName_1323777949136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;
     Object term11297;
     Object term11290;

    public DateTimeFormatterBuilder_appendTimeZoneName_1323777949136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term507 = new ArrayList();
        term506 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term511 = newInstance(Class.forName("java.lang.Object"));
        setField(term506, term506.getClass(), "iElementPairs", term507);
        setField(term506, term506.getClass(), "iFormatter", term511);
        Object term11300 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11300, term11300.getClass(), "iParseLookup", null);
        setIntField(term11300, term11300.getClass(), "iType", 0);
        ArrayList term11298 = new ArrayList();
        ((ArrayList) term11298).add(term11300);
        ((ArrayList) term11298).add((Object)null);
        term11297 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11297, term11297.getClass(), "iElementPairs", term11298);
        setField(term11297, term11297.getClass(), "iFormatter", null);
        Object term11293 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11293, term11293.getClass(), "iParseLookup", null);
        setIntField(term11293, term11293.getClass(), "iType", 0);
        ArrayList term11291 = new ArrayList();
        ((ArrayList) term11291).add(term11293);
        ((ArrayList) term11291).add((Object)null);
        term11290 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11290, term11290.getClass(), "iElementPairs", term11291);
        setField(term11290, term11290.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendTimeZoneName", argTypes, term506, args);
        assertTrue(recursiveEquals(term506, term11297));
        assertTrue(recursiveEquals(retValue, term11290));
    }

};


