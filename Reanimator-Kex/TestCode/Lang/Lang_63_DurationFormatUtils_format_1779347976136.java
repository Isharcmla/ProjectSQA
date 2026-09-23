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

public class DurationFormatUtils_format_1779347976136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97653;
     Object term99534;

    public DurationFormatUtils_format_1779347976136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term98415 = new StringBuffer();
        term97653 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term98019 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term97807 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term98133 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term98243 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term98357 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term98529 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term98643 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term98019, term98019.getClass(), "value", term97807);
        setIntField(term98019, term98019.getClass(), "count", 0);
        setElement(term97653, 0, term98019);
        setField(term98133, term98133.getClass(), "value", term98243);
        setIntField(term98133, term98133.getClass(), "count", 0);
        setElement(term97653, 1, term98133);
        setField(term98357, term98357.getClass(), "value", term98415);
        setIntField(term98357, term98357.getClass(), "count", 0);
        setElement(term97653, 2, term98357);
        setField(term98529, term98529.getClass(), "value", term98415);
        setIntField(term98529, term98529.getClass(), "count", 0);
        setElement(term97653, 3, term98529);
        setElement(term97653, 4, term98643);
        term99534 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term99535 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term99536 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term99537 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99538 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term99539 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99540 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term99543 = (byte[]) newByteArray(16);
        Object term99544 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99545 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term99535, term99535.getClass(), "value", term99536);
        setIntField(term99535, term99535.getClass(), "count", 0);
        setElement(term99534, 0, term99535);
        setField(term99537, term99537.getClass(), "value", term99538);
        setIntField(term99537, term99537.getClass(), "count", 0);
        setElement(term99534, 1, term99537);
        setField(term99540, term99540.getClass(), "toStringCache", "");
        setField(term99540, term99540.getClass(), "value", term99543);
        setByteField(term99540, term99540.getClass(), "coder", (byte) 0);
        setIntField(term99540, term99540.getClass(), "count", 0);
        setField(term99539, term99539.getClass(), "value", term99540);
        setIntField(term99539, term99539.getClass(), "count", 0);
        setElement(term99534, 2, term99539);
        setField(term99544, term99544.getClass(), "value", term99540);
        setIntField(term99544, term99544.getClass(), "count", 0);
        setElement(term99534, 3, term99544);
        setField(term99545, term99545.getClass(), "value", null);
        setIntField(term99545, term99545.getClass(), "count", 0);
        setElement(term99534, 4, term99545);
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
        args[0] = term97653;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term97653, term99534));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


