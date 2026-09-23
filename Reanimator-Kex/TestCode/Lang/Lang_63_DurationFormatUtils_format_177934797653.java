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

public class DurationFormatUtils_format_177934797653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27821;
     Object term28612;

    public DurationFormatUtils_format_177934797653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term28530 = new StringBuffer();
        term27821 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term28472 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term28472, term28472.getClass(), "value", term28530);
        setIntField(term28472, term28472.getClass(), "count", 0);
        setElement(term27821, 0, term28472);
        term28612 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term28613 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term28614 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term28617 = (byte[]) newByteArray(16);
        setField(term28614, term28614.getClass(), "toStringCache", "");
        setField(term28614, term28614.getClass(), "value", term28617);
        setByteField(term28614, term28614.getClass(), "coder", (byte) 0);
        setIntField(term28614, term28614.getClass(), "count", 0);
        setField(term28613, term28613.getClass(), "value", term28614);
        setIntField(term28613, term28613.getClass(), "count", 0);
        setElement(term28612, 0, term28613);
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
        args[0] = term27821;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term27821, term28612));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


