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

public class FastDateParser_toArray_1026916220143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31945;
     Object term31993;
     Object term46976;
     Object term46977;
     Object term46967;

    public FastDateParser_toArray_1026916220143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31945 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        term31993 = new HashMap();
        term46976 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term46976, term46976.getClass(), "pattern", null);
        setField(term46976, term46976.getClass(), "timeZone", null);
        setField(term46976, term46976.getClass(), "locale", null);
        setField(term46976, term46976.getClass(), "parsePattern", null);
        setField(term46976, term46976.getClass(), "strategies", null);
        setIntField(term46976, term46976.getClass(), "thisYear", 0);
        setField(term46976, term46976.getClass(), "nameValues", null);
        setField(term46976, term46976.getClass(), "currentFormatField", null);
        setField(term46976, term46976.getClass(), "nextStrategy", null);
        term46977 = new HashMap();
        term46967 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term31993;
        Object retValue = callMethod(klass, "toArray", argTypes, term31945, args);
        assertTrue(recursiveEquals(term31945, term46976));
        assertTrue(recursiveEquals(term31993, term46977));
        assertTrue(recursiveEquals(retValue, term46967));
    }

};


