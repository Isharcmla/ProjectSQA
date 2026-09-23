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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203045;
     Object term204685;

    public DurationFormatUtils_format_1779347976279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term203765 = new StringBuilder();
        StringBuffer term203937 = new StringBuffer();
        StringBuffer term204109 = new StringBuffer();
        term203045 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term203705 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term203879 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204051 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204223 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204337 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204375 = newInstance(Class.forName("java.lang.Object"));
        setField(term203705, term203705.getClass(), "value", term203765);
        setIntField(term203705, term203705.getClass(), "count", 0);
        setElement(term203045, 0, term203705);
        setField(term203879, term203879.getClass(), "value", term203937);
        setIntField(term203879, term203879.getClass(), "count", 0);
        setElement(term203045, 1, term203879);
        setField(term204051, term204051.getClass(), "value", term204109);
        setIntField(term204051, term204051.getClass(), "count", 0);
        setElement(term203045, 2, term204051);
        setField(term204223, term204223.getClass(), "value", null);
        setIntField(term204223, term204223.getClass(), "count", 0);
        setElement(term203045, 3, term204223);
        setField(term204337, term204337.getClass(), "value", term204375);
        setIntField(term204337, term204337.getClass(), "count", 0);
        setElement(term203045, 4, term204337);
        term204685 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term204686 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204687 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term204688 = (byte[]) newByteArray(16);
        Object term204689 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204690 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term204693 = (byte[]) newByteArray(16);
        Object term204694 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204695 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term204698 = (byte[]) newByteArray(16);
        Object term204699 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term204701 = newInstance(Class.forName("java.lang.Object"));
        setField(term204687, term204687.getClass(), "value", term204688);
        setByteField(term204687, term204687.getClass(), "coder", (byte) 0);
        setIntField(term204687, term204687.getClass(), "count", 0);
        setField(term204686, term204686.getClass(), "value", term204687);
        setIntField(term204686, term204686.getClass(), "count", 0);
        setElement(term204685, 0, term204686);
        setField(term204690, term204690.getClass(), "toStringCache", "");
        setField(term204690, term204690.getClass(), "value", term204693);
        setByteField(term204690, term204690.getClass(), "coder", (byte) 0);
        setIntField(term204690, term204690.getClass(), "count", 0);
        setField(term204689, term204689.getClass(), "value", term204690);
        setIntField(term204689, term204689.getClass(), "count", 0);
        setElement(term204685, 1, term204689);
        setField(term204695, term204695.getClass(), "toStringCache", "");
        setField(term204695, term204695.getClass(), "value", term204698);
        setByteField(term204695, term204695.getClass(), "coder", (byte) 0);
        setIntField(term204695, term204695.getClass(), "count", 0);
        setField(term204694, term204694.getClass(), "value", term204695);
        setIntField(term204694, term204694.getClass(), "count", 0);
        setElement(term204685, 2, term204694);
        setField(term204699, term204699.getClass(), "value", null);
        setIntField(term204699, term204699.getClass(), "count", 0);
        setElement(term204685, 3, term204699);
        setField(term204700, term204700.getClass(), "value", term204701);
        setIntField(term204700, term204700.getClass(), "count", 0);
        setElement(term204685, 4, term204700);
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
        args[0] = term203045;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term203045, term204685));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


