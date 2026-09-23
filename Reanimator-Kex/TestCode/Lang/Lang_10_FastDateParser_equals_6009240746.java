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

public class FastDateParser_equals_6009240746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2299;
     Object term10578;

    public FastDateParser_equals_6009240746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2299 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term2299, term2299.getClass(), "pattern", null);
        setField(term2299, term2299.getClass(), "timeZone", null);
        setField(term2299, term2299.getClass(), "locale", null);
        setField(term2299, term2299.getClass(), "parsePattern", null);
        setField(term2299, term2299.getClass(), "strategies", null);
        setIntField(term2299, term2299.getClass(), "thisYear", 0);
        setField(term2299, term2299.getClass(), "nameValues", null);
        setField(term2299, term2299.getClass(), "currentFormatField", null);
        setField(term2299, term2299.getClass(), "nextStrategy", null);
        term10578 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term10578, term10578.getClass(), "pattern", null);
        setField(term10578, term10578.getClass(), "timeZone", null);
        setField(term10578, term10578.getClass(), "locale", null);
        setField(term10578, term10578.getClass(), "parsePattern", null);
        setField(term10578, term10578.getClass(), "strategies", null);
        setIntField(term10578, term10578.getClass(), "thisYear", 0);
        setField(term10578, term10578.getClass(), "nameValues", null);
        setField(term10578, term10578.getClass(), "currentFormatField", null);
        setField(term10578, term10578.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term2299, args);
        assertTrue(recursiveEquals(term2299, term10578));
        assertTrue(recursiveEquals(retValue, false));
    }

};


