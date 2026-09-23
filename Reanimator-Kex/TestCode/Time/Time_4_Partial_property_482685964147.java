package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Partial_property_482685964147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44362;
     Object term44637;
     Object term44634;

    public Partial_property_482685964147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44362 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term44300 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 10);
        setField(term44362, term44362.getClass(), "iTypes", term44300);
        term44637 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term44638 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 10);
        setField(term44637, term44637.getClass(), "iChronology", null);
        setField(term44637, term44637.getClass(), "iTypes", term44638);
        setField(term44637, term44637.getClass(), "iValues", null);
        setField(term44637, term44637.getClass(), "iFormatter", null);
        term44634 = newInstance(Class.forName("org.joda.time.Partial$Property"));
        Object term44626 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term44627 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 10);
        setField(term44626, term44626.getClass(), "iChronology", null);
        setField(term44626, term44626.getClass(), "iTypes", term44627);
        setField(term44626, term44626.getClass(), "iValues", null);
        setField(term44626, term44626.getClass(), "iFormatter", null);
        setField(term44634, term44634.getClass(), "iPartial", term44626);
        setIntField(term44634, term44634.getClass(), "iFieldIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "property", argTypes, term44362, args);
        assertTrue(recursiveEquals(term44362, term44637));
        assertTrue(recursiveEquals(retValue, term44634));
    }

};


