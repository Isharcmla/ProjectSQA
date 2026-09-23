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

public class DateTimeFormatterBuilder_append_468114252362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55945;
     Object term56157;
     Object term56394;
     Object term56398;
     Object term56387;

    public DateTimeFormatterBuilder_append_468114252362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term56035 = new ArrayList();
        term55945 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term55983 = newInstance(Class.forName("java.lang.Object"));
        setField(term55945, term55945.getClass(), "iFormatter", term55983);
        setField(term55945, term55945.getClass(), "iElementPairs", term56035);
        term56157 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        Object term56397 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term56397, term56397.getClass(), "iParseLookup", null);
        setIntField(term56397, term56397.getClass(), "iType", 0);
        ArrayList term56395 = new ArrayList();
        ((ArrayList) term56395).add(term56397);
        ((ArrayList) term56395).add((Object)null);
        term56394 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term56394, term56394.getClass(), "iElementPairs", term56395);
        setField(term56394, term56394.getClass(), "iFormatter", null);
        term56398 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term56398, term56398.getClass(), "iParseLookup", null);
        setIntField(term56398, term56398.getClass(), "iType", 0);
        Object term56390 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term56390, term56390.getClass(), "iParseLookup", null);
        setIntField(term56390, term56390.getClass(), "iType", 0);
        ArrayList term56388 = new ArrayList();
        ((ArrayList) term56388).add(term56390);
        ((ArrayList) term56388).add((Object)null);
        term56387 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term56387, term56387.getClass(), "iElementPairs", term56388);
        setField(term56387, term56387.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        Object[] args = new Object[1];
        args[0] = term56157;
        Object retValue = callMethod(klass, "append", argTypes, term55945, args);
        assertTrue(recursiveEquals(term55945, term56394));
        assertTrue(recursiveEquals(term56157, term56398));
        assertTrue(recursiveEquals(retValue, term56387));
    }

};


