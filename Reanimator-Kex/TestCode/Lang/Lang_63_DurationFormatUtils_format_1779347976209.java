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

public class DurationFormatUtils_format_1779347976209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144393;
     Object term145436;

    public DurationFormatUtils_format_1779347976209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term144817 = new StringBuffer();
        term144393 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term144645 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144759 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144931 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145045 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term144645, term144645.getClass(), "value", null);
        setIntField(term144645, term144645.getClass(), "count", 0);
        setElement(term144393, 0, term144645);
        setField(term144759, term144759.getClass(), "value", term144817);
        setIntField(term144759, term144759.getClass(), "count", 0);
        setElement(term144393, 1, term144759);
        setField(term144931, term144931.getClass(), "value", null);
        setIntField(term144931, term144931.getClass(), "count", 0);
        setElement(term144393, 2, term144931);
        setField(term145045, term145045.getClass(), "value", "");
        setIntField(term145045, term145045.getClass(), "count", 0);
        setElement(term144393, 3, term145045);
        term145436 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term145437 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145438 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145439 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term145442 = (byte[]) newByteArray(16);
        Object term145443 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145444 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term145437, term145437.getClass(), "value", null);
        setIntField(term145437, term145437.getClass(), "count", 0);
        setElement(term145436, 0, term145437);
        setField(term145439, term145439.getClass(), "toStringCache", "");
        setField(term145439, term145439.getClass(), "value", term145442);
        setByteField(term145439, term145439.getClass(), "coder", (byte) 0);
        setIntField(term145439, term145439.getClass(), "count", 0);
        setField(term145438, term145438.getClass(), "value", term145439);
        setIntField(term145438, term145438.getClass(), "count", 0);
        setElement(term145436, 1, term145438);
        setField(term145443, term145443.getClass(), "value", null);
        setIntField(term145443, term145443.getClass(), "count", 0);
        setElement(term145436, 2, term145443);
        setField(term145444, term145444.getClass(), "value", "");
        setIntField(term145444, term145444.getClass(), "count", 0);
        setElement(term145436, 3, term145444);
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
        args[0] = term144393;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term144393, term145436));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


