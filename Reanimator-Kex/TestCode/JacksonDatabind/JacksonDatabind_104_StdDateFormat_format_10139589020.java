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

public class StdDateFormat_format_10139589020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term1261;
     Object term1293;

    public StdDateFormat_format_10139589020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1259 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1259, term1259.getClass(), "fastTime", 1345889412244L);
        setField(term1259, term1259.getClass(), "cdate", null);
        term1261 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1274 = (byte[]) newByteArray(16);
        setField(term1261, term1261.getClass(), "toStringCache", "xxtlPwDYFs");
        setField(term1261, term1261.getClass(), "value", term1274);
        setByteField(term1261, term1261.getClass(), "coder", (byte) 47);
        setIntField(term1261, term1261.getClass(), "count", -1922583790);
        term1293 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term1297 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term1293, term1293.getClass(), "field", -616727354);
        setIntField(term1293, term1293.getClass(), "endIndex", -1955890973);
        setIntField(term1293, term1293.getClass(), "beginIndex", -2038273078);
        setField(term1297, term1297.getClass(), "name", "jJCZpVmanW");
        setField(term1293, term1293.getClass(), "attribute", term1297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term1259;
        args[1] = term1261;
        args[2] = term1293;
        callMethod(klass, "format", argTypes, null, args);
    }

};


