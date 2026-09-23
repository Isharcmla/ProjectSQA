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

public class DateTimeFormatterBuilder_appendHalfdayOfDayText_690815070130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470;
     Object term10994;
     Object term10978;

    public DateTimeFormatterBuilder_appendHalfdayOfDayText_690815070130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term471 = new ArrayList();
        term470 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term475 = newInstance(Class.forName("java.lang.Object"));
        setField(term470, term470.getClass(), "iElementPairs", term471);
        setField(term470, term470.getClass(), "iFormatter", term475);
        Object term10997 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term10998 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10998, term10998.getClass(), "iOrdinal", (byte) 13);
        setField(term10998, term10998.getClass(), "iUnitType", null);
        setField(term10998, term10998.getClass(), "iRangeType", null);
        setField(term10998, term10998.getClass(), "iName", null);
        setField(term10997, term10997.getClass(), "iFieldType", term10998);
        setBooleanField(term10997, term10997.getClass(), "iShort", false);
        ArrayList term10995 = new ArrayList();
        ((ArrayList) term10995).add(term10997);
        ((ArrayList) term10995).add(term10997);
        term10994 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10994, term10994.getClass(), "iElementPairs", term10995);
        setField(term10994, term10994.getClass(), "iFormatter", null);
        Object term10981 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term10982 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term10982, term10982.getClass(), "iOrdinal", (byte) 13);
        setField(term10982, term10982.getClass(), "iUnitType", null);
        setField(term10982, term10982.getClass(), "iRangeType", null);
        setField(term10982, term10982.getClass(), "iName", null);
        setField(term10981, term10981.getClass(), "iFieldType", term10982);
        setBooleanField(term10981, term10981.getClass(), "iShort", false);
        ArrayList term10979 = new ArrayList();
        ((ArrayList) term10979).add(term10981);
        ((ArrayList) term10979).add(term10981);
        term10978 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term10978, term10978.getClass(), "iElementPairs", term10979);
        setField(term10978, term10978.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendHalfdayOfDayText", argTypes, term470, args);
        assertTrue(recursiveEquals(term470, term10994));
        assertTrue(recursiveEquals(retValue, term10978));
    }

};


