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

public class DurationFormatUtils_lexx_196378023423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10350;

    public DurationFormatUtils_lexx_196378023423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10350 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term10351 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term10352 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term10353 = (byte[]) newByteArray(16);
        Object term10373 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term10378 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term10379 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term10380 = (byte[]) newByteArray(16);
        setField(term10352, term10352.getClass(), "toStringCache", null);
        setByteElement(term10353, 0, (byte) 106);
        setByteElement(term10353, 1, (byte) 74);
        setByteElement(term10353, 2, (byte) 67);
        setByteElement(term10353, 3, (byte) 90);
        setByteElement(term10353, 4, (byte) 112);
        setByteElement(term10353, 5, (byte) 86);
        setField(term10352, term10352.getClass(), "value", term10353);
        setByteField(term10352, term10352.getClass(), "coder", (byte) 0);
        setIntField(term10352, term10352.getClass(), "count", 6);
        setField(term10351, term10351.getClass(), "value", term10352);
        setIntField(term10351, term10351.getClass(), "count", 1);
        setElement(term10350, 0, term10351);
        setField(term10373, term10373.getClass(), "value", "m");
        setIntField(term10373, term10373.getClass(), "count", 1);
        setElement(term10350, 1, term10373);
        setField(term10379, term10379.getClass(), "toStringCache", null);
        setByteElement(term10380, 0, (byte) 97);
        setByteElement(term10380, 1, (byte) 110);
        setByteElement(term10380, 2, (byte) 87);
        setField(term10379, term10379.getClass(), "value", term10380);
        setByteField(term10379, term10379.getClass(), "coder", (byte) 0);
        setIntField(term10379, term10379.getClass(), "count", 3);
        setField(term10378, term10378.getClass(), "value", term10379);
        setIntField(term10378, term10378.getClass(), "count", 1);
        setElement(term10350, 2, term10378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "lexx", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term10350));
    }

};


