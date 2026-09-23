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

public class DateTimeFormatterBuilder_append0_9443206891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;
     Object term123;
     Object term3693;
     Object term3697;
     Object term3687;

    public DateTimeFormatterBuilder_append0_9443206891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term118 = new ArrayList();
        term117 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term122 = newInstance(Class.forName("java.lang.Object"));
        setField(term117, term117.getClass(), "iElementPairs", term118);
        setField(term117, term117.getClass(), "iFormatter", term122);
        term123 = newInstance(Class.forName("java.lang.Object"));
        Object term3696 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3694 = new ArrayList();
        ((ArrayList) term3694).add(term3696);
        ((ArrayList) term3694).add(term3696);
        term3693 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3693, term3693.getClass(), "iElementPairs", term3694);
        setField(term3693, term3693.getClass(), "iFormatter", null);
        term3697 = newInstance(Class.forName("java.lang.Object"));
        Object term3690 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3688 = new ArrayList();
        ((ArrayList) term3688).add(term3690);
        ((ArrayList) term3688).add(term3690);
        term3687 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term3687, term3687.getClass(), "iElementPairs", term3688);
        setField(term3687, term3687.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123;
        Object retValue = callMethod(klass, "append0", argTypes, term117, args);
        assertTrue(recursiveEquals(term117, term3693));
        assertTrue(recursiveEquals(term123, term3697));
        assertTrue(recursiveEquals(retValue, term3687));
    }

};


