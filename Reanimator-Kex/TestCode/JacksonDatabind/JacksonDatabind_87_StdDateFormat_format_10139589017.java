package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StdDateFormat_format_10139589017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1560;
     Object term1562;
     Object term1594;

    public StdDateFormat_format_10139589017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1560 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1560, term1560.getClass(), "fastTime", 1345889412244L);
        setField(term1560, term1560.getClass(), "cdate", null);
        term1562 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1575 = (byte[]) newByteArray(16);
        setField(term1562, term1562.getClass(), "toStringCache", "MuLcgQHgqz");
        setField(term1562, term1562.getClass(), "value", term1575);
        setByteField(term1562, term1562.getClass(), "coder", (byte) 47);
        setIntField(term1562, term1562.getClass(), "count", 1484323161);
        term1594 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term1598 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term1594, term1594.getClass(), "field", 391863371);
        setIntField(term1594, term1594.getClass(), "endIndex", -1922583790);
        setIntField(term1594, term1594.getClass(), "beginIndex", -616727354);
        setField(term1598, term1598.getClass(), "name", "xxtlPwDYFs");
        setField(term1594, term1594.getClass(), "attribute", term1598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term1560;
        args[1] = term1562;
        args[2] = term1594;
        callMethod(klass, "format", argTypes, null, args);
    }

};


