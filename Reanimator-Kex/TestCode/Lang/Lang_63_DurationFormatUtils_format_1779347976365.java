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

public class DurationFormatUtils_format_1779347976365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287431;
     Object term289598;

    public DurationFormatUtils_format_1779347976365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term287807 = new StringBuffer();
        StringBuilder term288095 = new StringBuilder();
        StringBuffer term288267 = new StringBuffer();
        StringBuffer term288439 = new StringBuffer();
        StringBuffer term288611 = new StringBuffer();
        term287431 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term287749 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term287921 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term288035 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term288209 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term288381 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term288553 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term288725 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term287749, term287749.getClass(), "value", term287807);
        setIntField(term287749, term287749.getClass(), "count", 0);
        setElement(term287431, 0, term287749);
        setField(term288035, term288035.getClass(), "value", term288095);
        setIntField(term288035, term288035.getClass(), "count", 0);
        setField(term287921, term287921.getClass(), "value", term288035);
        setIntField(term287921, term287921.getClass(), "count", 0);
        setElement(term287431, 1, term287921);
        setField(term288209, term288209.getClass(), "value", term288267);
        setIntField(term288209, term288209.getClass(), "count", 0);
        setElement(term287431, 2, term288209);
        setElement(term287431, 3, term288035);
        setField(term288381, term288381.getClass(), "value", term288439);
        setIntField(term288381, term288381.getClass(), "count", 0);
        setElement(term287431, 4, term288381);
        setField(term288553, term288553.getClass(), "value", term288611);
        setIntField(term288553, term288553.getClass(), "count", 0);
        setElement(term287431, 5, term288553);
        setField(term288725, term288725.getClass(), "value", null);
        setIntField(term288725, term288725.getClass(), "count", 0);
        setElement(term287431, 6, term288725);
        term289598 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term289599 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term289600 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term289603 = (byte[]) newByteArray(16);
        Object term289604 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term289605 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term289606 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term289607 = (byte[]) newByteArray(16);
        Object term289608 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term289609 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term289612 = (byte[]) newByteArray(16);
        Object term289613 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term289614 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term289617 = (byte[]) newByteArray(16);
        Object term289618 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term289619 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term289622 = (byte[]) newByteArray(16);
        Object term289623 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term289600, term289600.getClass(), "toStringCache", "");
        setField(term289600, term289600.getClass(), "value", term289603);
        setByteField(term289600, term289600.getClass(), "coder", (byte) 0);
        setIntField(term289600, term289600.getClass(), "count", 0);
        setField(term289599, term289599.getClass(), "value", term289600);
        setIntField(term289599, term289599.getClass(), "count", 0);
        setElement(term289598, 0, term289599);
        setField(term289606, term289606.getClass(), "value", term289607);
        setByteField(term289606, term289606.getClass(), "coder", (byte) 0);
        setIntField(term289606, term289606.getClass(), "count", 0);
        setField(term289605, term289605.getClass(), "value", term289606);
        setIntField(term289605, term289605.getClass(), "count", 0);
        setField(term289604, term289604.getClass(), "value", term289605);
        setIntField(term289604, term289604.getClass(), "count", 0);
        setElement(term289598, 1, term289604);
        setField(term289609, term289609.getClass(), "toStringCache", "");
        setField(term289609, term289609.getClass(), "value", term289612);
        setByteField(term289609, term289609.getClass(), "coder", (byte) 0);
        setIntField(term289609, term289609.getClass(), "count", 0);
        setField(term289608, term289608.getClass(), "value", term289609);
        setIntField(term289608, term289608.getClass(), "count", 0);
        setElement(term289598, 2, term289608);
        setElement(term289598, 3, term289605);
        setField(term289614, term289614.getClass(), "toStringCache", "");
        setField(term289614, term289614.getClass(), "value", term289617);
        setByteField(term289614, term289614.getClass(), "coder", (byte) 0);
        setIntField(term289614, term289614.getClass(), "count", 0);
        setField(term289613, term289613.getClass(), "value", term289614);
        setIntField(term289613, term289613.getClass(), "count", 0);
        setElement(term289598, 4, term289613);
        setField(term289619, term289619.getClass(), "toStringCache", "");
        setField(term289619, term289619.getClass(), "value", term289622);
        setByteField(term289619, term289619.getClass(), "coder", (byte) 0);
        setIntField(term289619, term289619.getClass(), "count", 0);
        setField(term289618, term289618.getClass(), "value", term289619);
        setIntField(term289618, term289618.getClass(), "count", 0);
        setElement(term289598, 5, term289618);
        setField(term289623, term289623.getClass(), "value", null);
        setIntField(term289623, term289623.getClass(), "count", 0);
        setElement(term289598, 6, term289623);
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
        args[0] = term287431;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term287431, term289598));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


