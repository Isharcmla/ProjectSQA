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
import java.lang.Integer;

public class DateUtils_truncatedEquals_6375954253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11770;
     Object term11772;
     Object term11774;

    public DateUtils_truncatedEquals_6375954253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11770 = newInstance(Class.forName("java.util.Date"));
        setLongField(term11770, term11770.getClass(), "fastTime", 1442388534632L);
        setField(term11770, term11770.getClass(), "cdate", null);
        term11772 = newInstance(Class.forName("java.util.Date"));
        setLongField(term11772, term11772.getClass(), "fastTime", 1660012192918L);
        setField(term11772, term11772.getClass(), "cdate", null);
        term11774 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term11770;
        args[1] = term11772;
        args[2] = term11774;
        callMethod(klass, "truncatedEquals", argTypes, null, args);
    }

};


