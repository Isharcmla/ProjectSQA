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

public class DurationFormatUtils_format_1779347976124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89631;
     Object term92545;

    public DurationFormatUtils_format_1779347976124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term90925 = new StringBuffer();
        StringBuilder term91099 = new StringBuilder();
        term89631 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term90411 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term90168 = (char[]) newCharArray(0);
        Object term90525 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term90639 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term90753 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term90867 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91039 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term90411, term90411.getClass(), "value", term90168);
        setIntField(term90411, term90411.getClass(), "count", 0);
        setElement(term89631, 0, term90411);
        setField(term90525, term90525.getClass(), "value", null);
        setIntField(term90525, term90525.getClass(), "count", 0);
        setElement(term89631, 1, term90525);
        setField(term90639, term90639.getClass(), "value", null);
        setIntField(term90639, term90639.getClass(), "count", 0);
        setElement(term89631, 2, term90639);
        setField(term90753, term90753.getClass(), "value", null);
        setIntField(term90753, term90753.getClass(), "count", 0);
        setElement(term89631, 3, term90753);
        setField(term90867, term90867.getClass(), "value", term90925);
        setIntField(term90867, term90867.getClass(), "count", 0);
        setElement(term89631, 4, term90867);
        setField(term91039, term91039.getClass(), "value", term91099);
        setIntField(term91039, term91039.getClass(), "count", 0);
        setElement(term89631, 5, term91039);
        term92545 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term92546 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term92547 = (char[]) newCharArray(0);
        Object term92548 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92549 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92550 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92551 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92552 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term92555 = (byte[]) newByteArray(16);
        Object term92556 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92557 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term92558 = (byte[]) newByteArray(16);
        setField(term92546, term92546.getClass(), "value", term92547);
        setIntField(term92546, term92546.getClass(), "count", 0);
        setElement(term92545, 0, term92546);
        setField(term92548, term92548.getClass(), "value", null);
        setIntField(term92548, term92548.getClass(), "count", 0);
        setElement(term92545, 1, term92548);
        setField(term92549, term92549.getClass(), "value", null);
        setIntField(term92549, term92549.getClass(), "count", 0);
        setElement(term92545, 2, term92549);
        setField(term92550, term92550.getClass(), "value", null);
        setIntField(term92550, term92550.getClass(), "count", 0);
        setElement(term92545, 3, term92550);
        setField(term92552, term92552.getClass(), "toStringCache", "");
        setField(term92552, term92552.getClass(), "value", term92555);
        setByteField(term92552, term92552.getClass(), "coder", (byte) 0);
        setIntField(term92552, term92552.getClass(), "count", 0);
        setField(term92551, term92551.getClass(), "value", term92552);
        setIntField(term92551, term92551.getClass(), "count", 0);
        setElement(term92545, 4, term92551);
        setField(term92557, term92557.getClass(), "value", term92558);
        setByteField(term92557, term92557.getClass(), "coder", (byte) 0);
        setIntField(term92557, term92557.getClass(), "count", 0);
        setField(term92556, term92556.getClass(), "value", term92557);
        setIntField(term92556, term92556.getClass(), "count", 0);
        setElement(term92545, 5, term92556);
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
        args[0] = term89631;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term89631, term92545));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


