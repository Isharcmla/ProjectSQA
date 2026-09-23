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

public class DurationFormatUtils_format_1779347976285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207734;
     Object term209571;

    public DurationFormatUtils_format_1779347976285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term208193 = new StringBuffer();
        StringBuilder term208367 = new StringBuilder();
        StringBuffer term208767 = new StringBuffer();
        StringBuffer term208939 = new StringBuffer();
        term207734 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term208135 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term208307 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term208481 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term207834 = (char[]) newCharArray(0);
        Object term208595 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term207750 = (char[]) newCharArray(76);
        Object term208709 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term208881 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term208135, term208135.getClass(), "value", term208193);
        setIntField(term208135, term208135.getClass(), "count", 0);
        setElement(term207734, 0, term208135);
        setField(term208307, term208307.getClass(), "value", term208367);
        setIntField(term208307, term208307.getClass(), "count", 0);
        setElement(term207734, 1, term208307);
        setField(term208481, term208481.getClass(), "value", term207834);
        setIntField(term208481, term208481.getClass(), "count", 0);
        setElement(term207734, 2, term208481);
        setField(term208595, term208595.getClass(), "value", term207750);
        setIntField(term208595, term208595.getClass(), "count", 0);
        setElement(term207734, 3, term208595);
        setField(term208709, term208709.getClass(), "value", term208767);
        setIntField(term208709, term208709.getClass(), "count", 0);
        setElement(term207734, 4, term208709);
        setField(term208881, term208881.getClass(), "value", term208939);
        setIntField(term208881, term208881.getClass(), "count", 0);
        setElement(term207734, 5, term208881);
        term209571 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term209572 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term209573 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term209576 = (byte[]) newByteArray(16);
        Object term209577 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term209578 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term209579 = (byte[]) newByteArray(16);
        Object term209580 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term209581 = (char[]) newCharArray(0);
        Object term209582 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term209583 = (char[]) newCharArray(76);
        Object term209584 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term209585 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term209588 = (byte[]) newByteArray(16);
        Object term209589 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term209590 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term209593 = (byte[]) newByteArray(16);
        setField(term209573, term209573.getClass(), "toStringCache", "");
        setField(term209573, term209573.getClass(), "value", term209576);
        setByteField(term209573, term209573.getClass(), "coder", (byte) 0);
        setIntField(term209573, term209573.getClass(), "count", 0);
        setField(term209572, term209572.getClass(), "value", term209573);
        setIntField(term209572, term209572.getClass(), "count", 0);
        setElement(term209571, 0, term209572);
        setField(term209578, term209578.getClass(), "value", term209579);
        setByteField(term209578, term209578.getClass(), "coder", (byte) 0);
        setIntField(term209578, term209578.getClass(), "count", 0);
        setField(term209577, term209577.getClass(), "value", term209578);
        setIntField(term209577, term209577.getClass(), "count", 0);
        setElement(term209571, 1, term209577);
        setField(term209580, term209580.getClass(), "value", term209581);
        setIntField(term209580, term209580.getClass(), "count", 0);
        setElement(term209571, 2, term209580);
        setField(term209582, term209582.getClass(), "value", term209583);
        setIntField(term209582, term209582.getClass(), "count", 0);
        setElement(term209571, 3, term209582);
        setField(term209585, term209585.getClass(), "toStringCache", "");
        setField(term209585, term209585.getClass(), "value", term209588);
        setByteField(term209585, term209585.getClass(), "coder", (byte) 0);
        setIntField(term209585, term209585.getClass(), "count", 0);
        setField(term209584, term209584.getClass(), "value", term209585);
        setIntField(term209584, term209584.getClass(), "count", 0);
        setElement(term209571, 4, term209584);
        setField(term209590, term209590.getClass(), "toStringCache", "");
        setField(term209590, term209590.getClass(), "value", term209593);
        setByteField(term209590, term209590.getClass(), "coder", (byte) 0);
        setIntField(term209590, term209590.getClass(), "count", 0);
        setField(term209589, term209589.getClass(), "value", term209590);
        setIntField(term209589, term209589.getClass(), "count", 0);
        setElement(term209571, 5, term209589);
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
        args[0] = term207734;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term207734, term209571));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


