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

public class DurationFormatUtils_format_1779347976216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147278;
     Object term149757;

    public DurationFormatUtils_format_1779347976216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term147851 = new StringBuffer();
        term147278 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term147565 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147679 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147793 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147965 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term147348 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term148079 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term148117 = newInstance(Class.forName("java.lang.Object"));
        setField(term147565, term147565.getClass(), "value", null);
        setIntField(term147565, term147565.getClass(), "count", 0);
        setElement(term147278, 0, term147565);
        setField(term147679, term147679.getClass(), "value", null);
        setIntField(term147679, term147679.getClass(), "count", 0);
        setElement(term147278, 1, term147679);
        setField(term147793, term147793.getClass(), "value", term147851);
        setIntField(term147793, term147793.getClass(), "count", 0);
        setElement(term147278, 2, term147793);
        setField(term147965, term147965.getClass(), "value", term147348);
        setIntField(term147965, term147965.getClass(), "count", 0);
        setElement(term147278, 3, term147965);
        setField(term148079, term148079.getClass(), "value", term148117);
        setIntField(term148079, term148079.getClass(), "count", 0);
        setElement(term147278, 4, term148079);
        term149757 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term149758 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term149759 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term149760 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term149761 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term149764 = (byte[]) newByteArray(16);
        Object term149765 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term149766 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term149767 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term149768 = newInstance(Class.forName("java.lang.Object"));
        setField(term149758, term149758.getClass(), "value", null);
        setIntField(term149758, term149758.getClass(), "count", 0);
        setElement(term149757, 0, term149758);
        setField(term149759, term149759.getClass(), "value", null);
        setIntField(term149759, term149759.getClass(), "count", 0);
        setElement(term149757, 1, term149759);
        setField(term149761, term149761.getClass(), "toStringCache", "");
        setField(term149761, term149761.getClass(), "value", term149764);
        setByteField(term149761, term149761.getClass(), "coder", (byte) 0);
        setIntField(term149761, term149761.getClass(), "count", 0);
        setField(term149760, term149760.getClass(), "value", term149761);
        setIntField(term149760, term149760.getClass(), "count", 0);
        setElement(term149757, 2, term149760);
        setField(term149765, term149765.getClass(), "value", term149766);
        setIntField(term149765, term149765.getClass(), "count", 0);
        setElement(term149757, 3, term149765);
        setField(term149767, term149767.getClass(), "value", term149768);
        setIntField(term149767, term149767.getClass(), "count", 0);
        setElement(term149757, 4, term149767);
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
        args[0] = term147278;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term147278, term149757));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


