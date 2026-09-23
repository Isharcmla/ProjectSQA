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

public class DurationFormatUtils_format_1779347976415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344173;
     Object term348759;

    public DurationFormatUtils_format_1779347976415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term345514 = new StringBuffer();
        StringBuffer term345686 = new StringBuffer();
        StringBuffer term345858 = new StringBuffer();
        StringBuffer term346144 = new StringBuffer();
        StringBuffer term346316 = new StringBuffer();
        term344173 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term345456 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term345628 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term345800 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term345972 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term346086 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term346258 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term345456, term345456.getClass(), "value", term345514);
        setIntField(term345456, term345456.getClass(), "count", 0);
        setElement(term344173, 0, term345456);
        setField(term345628, term345628.getClass(), "value", term345686);
        setIntField(term345628, term345628.getClass(), "count", 0);
        setElement(term344173, 1, term345628);
        setField(term345800, term345800.getClass(), "value", term345858);
        setIntField(term345800, term345800.getClass(), "count", 0);
        setElement(term344173, 2, term345800);
        setField(term345972, term345972.getClass(), "value", null);
        setIntField(term345972, term345972.getClass(), "count", 0);
        setElement(term344173, 3, term345972);
        setField(term346086, term346086.getClass(), "value", term346144);
        setIntField(term346086, term346086.getClass(), "count", 0);
        setElement(term344173, 4, term346086);
        setField(term346258, term346258.getClass(), "value", term346316);
        setIntField(term346258, term346258.getClass(), "count", 0);
        setElement(term344173, 5, term346258);
        term348759 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term348760 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term348761 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term348764 = (byte[]) newByteArray(16);
        Object term348765 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term348766 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term348769 = (byte[]) newByteArray(16);
        Object term348770 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term348771 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term348774 = (byte[]) newByteArray(16);
        Object term348775 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term348776 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term348777 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term348780 = (byte[]) newByteArray(16);
        Object term348781 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term348782 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term348785 = (byte[]) newByteArray(16);
        setField(term348761, term348761.getClass(), "toStringCache", "");
        setField(term348761, term348761.getClass(), "value", term348764);
        setByteField(term348761, term348761.getClass(), "coder", (byte) 0);
        setIntField(term348761, term348761.getClass(), "count", 0);
        setField(term348760, term348760.getClass(), "value", term348761);
        setIntField(term348760, term348760.getClass(), "count", 0);
        setElement(term348759, 0, term348760);
        setField(term348766, term348766.getClass(), "toStringCache", "");
        setField(term348766, term348766.getClass(), "value", term348769);
        setByteField(term348766, term348766.getClass(), "coder", (byte) 0);
        setIntField(term348766, term348766.getClass(), "count", 0);
        setField(term348765, term348765.getClass(), "value", term348766);
        setIntField(term348765, term348765.getClass(), "count", 0);
        setElement(term348759, 1, term348765);
        setField(term348771, term348771.getClass(), "toStringCache", "");
        setField(term348771, term348771.getClass(), "value", term348774);
        setByteField(term348771, term348771.getClass(), "coder", (byte) 0);
        setIntField(term348771, term348771.getClass(), "count", 0);
        setField(term348770, term348770.getClass(), "value", term348771);
        setIntField(term348770, term348770.getClass(), "count", 0);
        setElement(term348759, 2, term348770);
        setField(term348775, term348775.getClass(), "value", null);
        setIntField(term348775, term348775.getClass(), "count", 0);
        setElement(term348759, 3, term348775);
        setField(term348777, term348777.getClass(), "toStringCache", "");
        setField(term348777, term348777.getClass(), "value", term348780);
        setByteField(term348777, term348777.getClass(), "coder", (byte) 0);
        setIntField(term348777, term348777.getClass(), "count", 0);
        setField(term348776, term348776.getClass(), "value", term348777);
        setIntField(term348776, term348776.getClass(), "count", 0);
        setElement(term348759, 4, term348776);
        setField(term348782, term348782.getClass(), "toStringCache", "");
        setField(term348782, term348782.getClass(), "value", term348785);
        setByteField(term348782, term348782.getClass(), "coder", (byte) 0);
        setIntField(term348782, term348782.getClass(), "count", 0);
        setField(term348781, term348781.getClass(), "value", term348782);
        setIntField(term348781, term348781.getClass(), "count", 0);
        setElement(term348759, 5, term348781);
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
        args[0] = term344173;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term344173, term348759));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


