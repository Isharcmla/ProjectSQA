package org.joda.time.base;

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
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BasePeriod_addFieldInto_75662301037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term100;

    public BasePeriod_addFieldInto_75662301037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = (int[]) newIntArray(9);
        setIntElement(term90, 0, -2095575670);
        setIntElement(term90, 1, 1225272962);
        setIntElement(term90, 2, 1324040357);
        setIntElement(term90, 3, -1588772968);
        setIntElement(term90, 4, -93135961);
        setIntElement(term90, 5, -112921587);
        setIntElement(term90, 6, 933028652);
        setIntElement(term90, 7, 287287233);
        setIntElement(term90, 8, 962840079);
        term100 = new Integer(1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BasePeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("org.joda.time.DurationFieldType");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term90;
        args[1] = null;
        args[2] = term100;
        try {
            callMethod(klass, "addFieldInto", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


