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
import java.lang.Integer;

public class FastDateParser_adjustYear_31909613760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8916;
     Object term8918;
     Object term16645;

    public FastDateParser_adjustYear_31909613760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8916 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term8916, term8916.getClass(), "pattern", null);
        setField(term8916, term8916.getClass(), "timeZone", null);
        setField(term8916, term8916.getClass(), "locale", null);
        setField(term8916, term8916.getClass(), "parsePattern", null);
        setField(term8916, term8916.getClass(), "strategies", null);
        setIntField(term8916, term8916.getClass(), "thisYear", 0);
        setField(term8916, term8916.getClass(), "nameValues", null);
        setField(term8916, term8916.getClass(), "currentFormatField", null);
        setField(term8916, term8916.getClass(), "nextStrategy", null);
        term8918 = new Integer(0);
        term16645 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term16645, term16645.getClass(), "pattern", null);
        setField(term16645, term16645.getClass(), "timeZone", null);
        setField(term16645, term16645.getClass(), "locale", null);
        setField(term16645, term16645.getClass(), "parsePattern", null);
        setField(term16645, term16645.getClass(), "strategies", null);
        setIntField(term16645, term16645.getClass(), "thisYear", 0);
        setField(term16645, term16645.getClass(), "nameValues", null);
        setField(term16645, term16645.getClass(), "currentFormatField", null);
        setField(term16645, term16645.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8918;
        Object retValue = callMethod(klass, "adjustYear", argTypes, term8916, args);
        assertTrue(recursiveEquals(term8916, term16645));
        assertTrue(recursiveEquals(term8918, 0));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


