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

public class DateTimeFormatterBuilder_canBuildFormatter_73091952779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term1698;

    public DateTimeFormatterBuilder_canBuildFormatter_73091952779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20 = new ArrayList();
        term19 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term24 = newInstance(Class.forName("java.lang.Object"));
        setField(term19, term19.getClass(), "iElementPairs", term20);
        setField(term19, term19.getClass(), "iFormatter", term24);
        ArrayList term1699 = new ArrayList();
        term1698 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term1701 = newInstance(Class.forName("java.lang.Object"));
        setField(term1698, term1698.getClass(), "iElementPairs", term1699);
        setField(term1698, term1698.getClass(), "iFormatter", term1701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term19, args);
        assertTrue(recursiveEquals(term19, term1698));
    }

};


