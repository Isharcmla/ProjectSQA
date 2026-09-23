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

public class Partial_isMatch_1020658742141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42921;
     Object term42969;
     Object term43742;
     Object term43744;

    public Partial_isMatch_1020658742141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42921 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term42859 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term42921, term42921.getClass(), "iTypes", term42859);
        term42969 = newInstance(Class.forName("org.joda.time.Partial"));
        term43742 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term43743 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term43742, term43742.getClass(), "iChronology", null);
        setField(term43742, term43742.getClass(), "iTypes", term43743);
        setField(term43742, term43742.getClass(), "iValues", null);
        setField(term43742, term43742.getClass(), "iFormatter", null);
        term43744 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term43744, term43744.getClass(), "iChronology", null);
        setField(term43744, term43744.getClass(), "iTypes", null);
        setField(term43744, term43744.getClass(), "iValues", null);
        setField(term43744, term43744.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = term42969;
        Object retValue = callMethod(klass, "isMatch", argTypes, term42921, args);
        assertTrue(recursiveEquals(term42921, term43742));
        assertTrue(recursiveEquals(term42969, term43744));
        assertTrue(recursiveEquals(retValue, true));
    }

};


