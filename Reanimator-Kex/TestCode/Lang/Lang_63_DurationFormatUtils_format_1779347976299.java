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

public class DurationFormatUtils_format_1779347976299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220987;
     Object term222730;

    public DurationFormatUtils_format_1779347976299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term221797 = new StringBuffer();
        StringBuilder term222085 = new StringBuilder();
        term220987 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term221739 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term221911 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222025 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222199 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222313 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222351 = newInstance(Class.forName("java.lang.Object"));
        Object term222465 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term221500 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term221739, term221739.getClass(), "value", term221797);
        setIntField(term221739, term221739.getClass(), "count", 0);
        setElement(term220987, 0, term221739);
        setField(term221911, term221911.getClass(), "value", null);
        setIntField(term221911, term221911.getClass(), "count", 0);
        setElement(term220987, 1, term221911);
        setField(term222025, term222025.getClass(), "value", term222085);
        setIntField(term222025, term222025.getClass(), "count", 0);
        setElement(term220987, 2, term222025);
        setField(term222199, term222199.getClass(), "value", null);
        setIntField(term222199, term222199.getClass(), "count", 0);
        setElement(term220987, 3, term222199);
        setField(term222313, term222313.getClass(), "value", term222351);
        setIntField(term222313, term222313.getClass(), "count", 0);
        setElement(term220987, 4, term222313);
        setField(term222465, term222465.getClass(), "value", term221500);
        setIntField(term222465, term222465.getClass(), "count", 0);
        setElement(term220987, 5, term222465);
        term222730 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term222731 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222732 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term222735 = (byte[]) newByteArray(16);
        Object term222736 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222737 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222738 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term222739 = (byte[]) newByteArray(16);
        Object term222740 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222741 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term222742 = newInstance(Class.forName("java.lang.Object"));
        Object term222743 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term222744 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term222732, term222732.getClass(), "toStringCache", "");
        setField(term222732, term222732.getClass(), "value", term222735);
        setByteField(term222732, term222732.getClass(), "coder", (byte) 0);
        setIntField(term222732, term222732.getClass(), "count", 0);
        setField(term222731, term222731.getClass(), "value", term222732);
        setIntField(term222731, term222731.getClass(), "count", 0);
        setElement(term222730, 0, term222731);
        setField(term222736, term222736.getClass(), "value", null);
        setIntField(term222736, term222736.getClass(), "count", 0);
        setElement(term222730, 1, term222736);
        setField(term222738, term222738.getClass(), "value", term222739);
        setByteField(term222738, term222738.getClass(), "coder", (byte) 0);
        setIntField(term222738, term222738.getClass(), "count", 0);
        setField(term222737, term222737.getClass(), "value", term222738);
        setIntField(term222737, term222737.getClass(), "count", 0);
        setElement(term222730, 2, term222737);
        setField(term222740, term222740.getClass(), "value", null);
        setIntField(term222740, term222740.getClass(), "count", 0);
        setElement(term222730, 3, term222740);
        setField(term222741, term222741.getClass(), "value", term222742);
        setIntField(term222741, term222741.getClass(), "count", 0);
        setElement(term222730, 4, term222741);
        setField(term222743, term222743.getClass(), "value", term222744);
        setIntField(term222743, term222743.getClass(), "count", 0);
        setElement(term222730, 5, term222743);
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
        args[0] = term220987;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term220987, term222730));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


