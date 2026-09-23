package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class FastDateParser_toArray_102691622095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22227;
     Object term22275;
     Object term22539;
     Object term22540;
     Object term22530;

    public FastDateParser_toArray_102691622095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22227 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        term22275 = new HashMap();
        term22539 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term22539, term22539.getClass(), "pattern", null);
        setField(term22539, term22539.getClass(), "timeZone", null);
        setField(term22539, term22539.getClass(), "locale", null);
        setField(term22539, term22539.getClass(), "parsePattern", null);
        setField(term22539, term22539.getClass(), "strategies", null);
        setIntField(term22539, term22539.getClass(), "thisYear", 0);
        setField(term22539, term22539.getClass(), "nameValues", null);
        setField(term22539, term22539.getClass(), "currentFormatField", null);
        setField(term22539, term22539.getClass(), "nextStrategy", null);
        term22540 = new HashMap();
        term22530 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term22275;
        Object retValue = callMethod(klass, "toArray", argTypes, term22227, args);
        assertTrue(recursiveEquals(term22227, term22539));
        assertTrue(recursiveEquals(term22275, term22540));
        assertTrue(recursiveEquals(retValue, term22530));
    }

};


