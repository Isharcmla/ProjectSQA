package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201654;
     Object term202997;

    public DurationFormatUtils_format_1779347976277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term202278 = new StringBuffer();
        StringBuffer term202450 = new StringBuffer();
        term201654 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term201992 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term202106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term202220 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term202392 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term202564 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term202678 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term201992, term201992.getClass(), "value", null);
        setIntField(term201992, term201992.getClass(), "count", 0);
        setElement(term201654, 0, term201992);
        setField(term202106, term202106.getClass(), "value", null);
        setIntField(term202106, term202106.getClass(), "count", 0);
        setElement(term201654, 1, term202106);
        setField(term202220, term202220.getClass(), "value", term202278);
        setIntField(term202220, term202220.getClass(), "count", 0);
        setElement(term201654, 2, term202220);
        setField(term202392, term202392.getClass(), "value", term202450);
        setIntField(term202392, term202392.getClass(), "count", 0);
        setElement(term201654, 3, term202392);
        setField(term202564, term202564.getClass(), "value", null);
        setIntField(term202564, term202564.getClass(), "count", 0);
        setElement(term201654, 4, term202564);
        setField(term202678, term202678.getClass(), "value", term201654);
        setIntField(term202678, term202678.getClass(), "count", 0);
        setElement(term201654, 5, term202678);
        term202997 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term202998 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term202999 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term203000 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term203001 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term203004 = (byte[]) newByteArray(16);
        Object term203005 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term203006 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term203009 = (byte[]) newByteArray(16);
        Object term203010 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term203011 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term203012 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        setField(term202998, term202998.getClass(), "value", null);
        setIntField(term202998, term202998.getClass(), "count", 0);
        setElement(term202997, 0, term202998);
        setField(term202999, term202999.getClass(), "value", null);
        setIntField(term202999, term202999.getClass(), "count", 0);
        setElement(term202997, 1, term202999);
        setField(term203001, term203001.getClass(), "toStringCache", "");
        setField(term203001, term203001.getClass(), "value", term203004);
        setByteField(term203001, term203001.getClass(), "coder", (byte) 0);
        setIntField(term203001, term203001.getClass(), "count", 0);
        setField(term203000, term203000.getClass(), "value", term203001);
        setIntField(term203000, term203000.getClass(), "count", 0);
        setElement(term202997, 2, term203000);
        setField(term203006, term203006.getClass(), "toStringCache", "");
        setField(term203006, term203006.getClass(), "value", term203009);
        setByteField(term203006, term203006.getClass(), "coder", (byte) 0);
        setIntField(term203006, term203006.getClass(), "count", 0);
        setField(term203005, term203005.getClass(), "value", term203006);
        setIntField(term203005, term203005.getClass(), "count", 0);
        setElement(term202997, 3, term203005);
        setField(term203010, term203010.getClass(), "value", null);
        setIntField(term203010, term203010.getClass(), "count", 0);
        setElement(term202997, 4, term203010);
        setElement(term203012, 0, term202998);
        setElement(term203012, 1, term202999);
        setElement(term203012, 2, term203000);
        setElement(term203012, 3, term203005);
        setElement(term203012, 4, term203010);
        setElement(term203012, 5, term203011);
        setField(term203011, term203011.getClass(), "value", term203012);
        setIntField(term203011, term203011.getClass(), "count", 0);
        setElement(term202997, 5, term203011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term201654;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term201654, term202997));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


