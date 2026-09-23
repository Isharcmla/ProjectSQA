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
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447583;

    public DurationFormatUtils_format_1779347976525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term448154 = new StringBuffer();
        StringBuffer term448326 = new StringBuffer();
        StringBuffer term448498 = new StringBuffer();
        term447583 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term447944 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448096 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448268 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448440 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448612 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448714 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term447944, term447944.getClass(), "value", "");
        setIntField(term447944, term447944.getClass(), "count", 0);
        setElement(term447583, 0, term447944);
        setField(term448096, term448096.getClass(), "value", term448154);
        setIntField(term448096, term448096.getClass(), "count", 0);
        setElement(term447583, 1, term448096);
        setField(term448268, term448268.getClass(), "value", term448326);
        setIntField(term448268, term448268.getClass(), "count", 0);
        setElement(term447583, 2, term448268);
        setField(term448440, term448440.getClass(), "value", term448498);
        setIntField(term448440, term448440.getClass(), "count", 0);
        setElement(term447583, 3, term448440);
        setField(term448612, term448612.getClass(), "value", term448714);
        setIntField(term448612, term448612.getClass(), "count", 0);
        setElement(term447583, 4, term448612);
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
        args[0] = term447583;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        callMethod(klass, "format", argTypes, null, args);
    }

};


