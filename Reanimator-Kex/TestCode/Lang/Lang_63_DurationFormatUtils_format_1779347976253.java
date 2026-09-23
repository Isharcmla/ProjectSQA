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

public class DurationFormatUtils_format_1779347976253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179162;
     Object term180620;

    public DurationFormatUtils_format_1779347976253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term179534 = new StringBuffer();
        StringBuilder term179708 = new StringBuilder();
        StringBuilder term179996 = new StringBuilder();
        StringBuffer term180168 = new StringBuffer();
        term179162 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term179476 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term179648 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term179822 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term179177 = (char[]) newCharArray(34);
        Object term179936 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term180110 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term179476, term179476.getClass(), "value", term179534);
        setIntField(term179476, term179476.getClass(), "count", 0);
        setElement(term179162, 0, term179476);
        setField(term179648, term179648.getClass(), "value", term179708);
        setIntField(term179648, term179648.getClass(), "count", 0);
        setElement(term179162, 1, term179648);
        setField(term179822, term179822.getClass(), "value", term179177);
        setIntField(term179822, term179822.getClass(), "count", 0);
        setElement(term179162, 2, term179822);
        setField(term179936, term179936.getClass(), "value", term179996);
        setIntField(term179936, term179936.getClass(), "count", 0);
        setElement(term179162, 3, term179936);
        setField(term180110, term180110.getClass(), "value", term180168);
        setIntField(term180110, term180110.getClass(), "count", 0);
        setElement(term179162, 4, term180110);
        term180620 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term180621 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term180622 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term180625 = (byte[]) newByteArray(16);
        Object term180626 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term180627 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term180628 = (byte[]) newByteArray(16);
        Object term180629 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term180630 = (char[]) newCharArray(34);
        Object term180631 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term180632 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term180633 = (byte[]) newByteArray(16);
        Object term180634 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term180635 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term180638 = (byte[]) newByteArray(16);
        setField(term180622, term180622.getClass(), "toStringCache", "");
        setField(term180622, term180622.getClass(), "value", term180625);
        setByteField(term180622, term180622.getClass(), "coder", (byte) 0);
        setIntField(term180622, term180622.getClass(), "count", 0);
        setField(term180621, term180621.getClass(), "value", term180622);
        setIntField(term180621, term180621.getClass(), "count", 0);
        setElement(term180620, 0, term180621);
        setField(term180627, term180627.getClass(), "value", term180628);
        setByteField(term180627, term180627.getClass(), "coder", (byte) 0);
        setIntField(term180627, term180627.getClass(), "count", 0);
        setField(term180626, term180626.getClass(), "value", term180627);
        setIntField(term180626, term180626.getClass(), "count", 0);
        setElement(term180620, 1, term180626);
        setField(term180629, term180629.getClass(), "value", term180630);
        setIntField(term180629, term180629.getClass(), "count", 0);
        setElement(term180620, 2, term180629);
        setField(term180632, term180632.getClass(), "value", term180633);
        setByteField(term180632, term180632.getClass(), "coder", (byte) 0);
        setIntField(term180632, term180632.getClass(), "count", 0);
        setField(term180631, term180631.getClass(), "value", term180632);
        setIntField(term180631, term180631.getClass(), "count", 0);
        setElement(term180620, 3, term180631);
        setField(term180635, term180635.getClass(), "toStringCache", "");
        setField(term180635, term180635.getClass(), "value", term180638);
        setByteField(term180635, term180635.getClass(), "coder", (byte) 0);
        setIntField(term180635, term180635.getClass(), "count", 0);
        setField(term180634, term180634.getClass(), "value", term180635);
        setIntField(term180634, term180634.getClass(), "count", 0);
        setElement(term180620, 4, term180634);
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
        args[0] = term179162;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term179162, term180620));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


