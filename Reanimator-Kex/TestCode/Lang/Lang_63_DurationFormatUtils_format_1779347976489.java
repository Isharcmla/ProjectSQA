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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415117;
     Object term416127;

    public DurationFormatUtils_format_1779347976489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term415650 = new StringBuffer();
        StringBuilder term415824 = new StringBuilder();
        term415117 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term415592 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term415764 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term415592, term415592.getClass(), "value", term415650);
        setIntField(term415592, term415592.getClass(), "count", 0);
        setElement(term415117, 0, term415592);
        setElement(term415117, 1, term415592);
        setField(term415764, term415764.getClass(), "value", term415824);
        setIntField(term415764, term415764.getClass(), "count", 0);
        setElement(term415117, 2, term415764);
        setElement(term415117, 3, term415592);
        setElement(term415117, 4, term415592);
        term416127 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term416128 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term416129 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term416132 = (byte[]) newByteArray(16);
        Object term416133 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term416134 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term416135 = (byte[]) newByteArray(16);
        setField(term416129, term416129.getClass(), "toStringCache", "");
        setField(term416129, term416129.getClass(), "value", term416132);
        setByteField(term416129, term416129.getClass(), "coder", (byte) 0);
        setIntField(term416129, term416129.getClass(), "count", 0);
        setField(term416128, term416128.getClass(), "value", term416129);
        setIntField(term416128, term416128.getClass(), "count", 0);
        setElement(term416127, 0, term416128);
        setElement(term416127, 1, term416128);
        setField(term416134, term416134.getClass(), "value", term416135);
        setByteField(term416134, term416134.getClass(), "coder", (byte) 0);
        setIntField(term416134, term416134.getClass(), "count", 0);
        setField(term416133, term416133.getClass(), "value", term416134);
        setIntField(term416133, term416133.getClass(), "count", 0);
        setElement(term416127, 2, term416133);
        setElement(term416127, 3, term416128);
        setElement(term416127, 4, term416128);
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
        args[0] = term415117;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term415117, term416127));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


