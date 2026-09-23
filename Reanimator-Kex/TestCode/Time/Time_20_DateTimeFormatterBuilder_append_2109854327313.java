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

public class DateTimeFormatterBuilder_append_2109854327313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46180;
     Object term46392;
     Object term46688;
     Object term46692;
     Object term46679;

    public DateTimeFormatterBuilder_append_2109854327313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term46270 = new ArrayList();
        term46180 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term46218 = newInstance(Class.forName("java.lang.Object"));
        setField(term46180, term46180.getClass(), "iFormatter", term46218);
        setField(term46180, term46180.getClass(), "iElementPairs", term46270);
        term46392 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        Object term46691 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term46691, term46691.getClass(), "iMinPrintedDigits", 0);
        setField(term46691, term46691.getClass(), "iFieldType", null);
        setIntField(term46691, term46691.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term46691, term46691.getClass(), "iSigned", false);
        ArrayList term46689 = new ArrayList();
        ((ArrayList) term46689).add((Object)null);
        ((ArrayList) term46689).add(term46691);
        term46688 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term46688, term46688.getClass(), "iElementPairs", term46689);
        setField(term46688, term46688.getClass(), "iFormatter", null);
        term46692 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term46692, term46692.getClass(), "iMinPrintedDigits", 0);
        setField(term46692, term46692.getClass(), "iFieldType", null);
        setIntField(term46692, term46692.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term46692, term46692.getClass(), "iSigned", false);
        Object term46682 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setIntField(term46682, term46682.getClass(), "iMinPrintedDigits", 0);
        setField(term46682, term46682.getClass(), "iFieldType", null);
        setIntField(term46682, term46682.getClass(), "iMaxParsedDigits", 0);
        setBooleanField(term46682, term46682.getClass(), "iSigned", false);
        ArrayList term46680 = new ArrayList();
        ((ArrayList) term46680).add((Object)null);
        ((ArrayList) term46680).add(term46682);
        term46679 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term46679, term46679.getClass(), "iElementPairs", term46680);
        setField(term46679, term46679.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[1];
        args[0] = term46392;
        Object retValue = callMethod(klass, "append", argTypes, term46180, args);
        assertTrue(recursiveEquals(term46180, term46688));
        assertTrue(recursiveEquals(term46392, term46692));
        assertTrue(recursiveEquals(retValue, term46679));
    }

};


