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

public class DurationFormatUtils_format_1779347976501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423653;
     Object term425739;

    public DurationFormatUtils_format_1779347976501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term424016 = new StringBuffer();
        StringBuffer term424188 = new StringBuffer();
        StringBuffer term424360 = new StringBuffer();
        StringBuffer term424532 = new StringBuffer();
        StringBuffer term424704 = new StringBuffer();
        term423653 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term423958 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term424130 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term424302 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term424474 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term424646 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term424818 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term424932 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term423958, term423958.getClass(), "value", term424016);
        setIntField(term423958, term423958.getClass(), "count", 0);
        setElement(term423653, 0, term423958);
        setField(term424130, term424130.getClass(), "value", term424188);
        setIntField(term424130, term424130.getClass(), "count", 0);
        setElement(term423653, 1, term424130);
        setField(term424302, term424302.getClass(), "value", term424360);
        setIntField(term424302, term424302.getClass(), "count", 0);
        setElement(term423653, 2, term424302);
        setField(term424474, term424474.getClass(), "value", term424532);
        setIntField(term424474, term424474.getClass(), "count", 0);
        setElement(term423653, 3, term424474);
        setField(term424646, term424646.getClass(), "value", term424704);
        setIntField(term424646, term424646.getClass(), "count", 0);
        setElement(term423653, 4, term424646);
        setField(term424818, term424818.getClass(), "value", null);
        setIntField(term424818, term424818.getClass(), "count", 0);
        setElement(term423653, 5, term424818);
        setField(term424932, term424932.getClass(), "value", term424130);
        setIntField(term424932, term424932.getClass(), "count", 0);
        setElement(term423653, 6, term424932);
        term425739 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term425740 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425741 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425744 = (byte[]) newByteArray(16);
        Object term425745 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425746 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425749 = (byte[]) newByteArray(16);
        Object term425750 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425751 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425754 = (byte[]) newByteArray(16);
        Object term425755 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425756 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425759 = (byte[]) newByteArray(16);
        Object term425760 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425761 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425764 = (byte[]) newByteArray(16);
        Object term425765 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425766 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term425741, term425741.getClass(), "toStringCache", "");
        setField(term425741, term425741.getClass(), "value", term425744);
        setByteField(term425741, term425741.getClass(), "coder", (byte) 0);
        setIntField(term425741, term425741.getClass(), "count", 0);
        setField(term425740, term425740.getClass(), "value", term425741);
        setIntField(term425740, term425740.getClass(), "count", 0);
        setElement(term425739, 0, term425740);
        setField(term425746, term425746.getClass(), "toStringCache", "");
        setField(term425746, term425746.getClass(), "value", term425749);
        setByteField(term425746, term425746.getClass(), "coder", (byte) 0);
        setIntField(term425746, term425746.getClass(), "count", 0);
        setField(term425745, term425745.getClass(), "value", term425746);
        setIntField(term425745, term425745.getClass(), "count", 0);
        setElement(term425739, 1, term425745);
        setField(term425751, term425751.getClass(), "toStringCache", "");
        setField(term425751, term425751.getClass(), "value", term425754);
        setByteField(term425751, term425751.getClass(), "coder", (byte) 0);
        setIntField(term425751, term425751.getClass(), "count", 0);
        setField(term425750, term425750.getClass(), "value", term425751);
        setIntField(term425750, term425750.getClass(), "count", 0);
        setElement(term425739, 2, term425750);
        setField(term425756, term425756.getClass(), "toStringCache", "");
        setField(term425756, term425756.getClass(), "value", term425759);
        setByteField(term425756, term425756.getClass(), "coder", (byte) 0);
        setIntField(term425756, term425756.getClass(), "count", 0);
        setField(term425755, term425755.getClass(), "value", term425756);
        setIntField(term425755, term425755.getClass(), "count", 0);
        setElement(term425739, 3, term425755);
        setField(term425761, term425761.getClass(), "toStringCache", "");
        setField(term425761, term425761.getClass(), "value", term425764);
        setByteField(term425761, term425761.getClass(), "coder", (byte) 0);
        setIntField(term425761, term425761.getClass(), "count", 0);
        setField(term425760, term425760.getClass(), "value", term425761);
        setIntField(term425760, term425760.getClass(), "count", 0);
        setElement(term425739, 4, term425760);
        setField(term425765, term425765.getClass(), "value", null);
        setIntField(term425765, term425765.getClass(), "count", 0);
        setElement(term425739, 5, term425765);
        setField(term425766, term425766.getClass(), "value", term425745);
        setIntField(term425766, term425766.getClass(), "count", 0);
        setElement(term425739, 6, term425766);
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
        args[0] = term423653;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term423653, term425739));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


