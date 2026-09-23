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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastDateParser_toArray_102691622056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8069;

    public FastDateParser_toArray_102691622056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8069 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term8069, term8069.getClass(), "pattern", null);
        setField(term8069, term8069.getClass(), "timeZone", null);
        setField(term8069, term8069.getClass(), "locale", null);
        setField(term8069, term8069.getClass(), "parsePattern", null);
        setField(term8069, term8069.getClass(), "strategies", null);
        setIntField(term8069, term8069.getClass(), "thisYear", 0);
        setField(term8069, term8069.getClass(), "nameValues", null);
        setField(term8069, term8069.getClass(), "currentFormatField", null);
        setField(term8069, term8069.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "toArray", argTypes, term8069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


