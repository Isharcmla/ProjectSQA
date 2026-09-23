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

public class DurationFormatUtils_format_1779347976445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376237;
     Object term377987;

    public DurationFormatUtils_format_1779347976445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term377059 = new StringBuffer();
        StringBuffer term377345 = new StringBuffer();
        StringBuffer term377517 = new StringBuffer();
        term376237 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term377001 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term377173 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term376781 = (char[]) newCharArray(0);
        Object term377287 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term377459 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term377631 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term377733 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term377001, term377001.getClass(), "value", term377059);
        setIntField(term377001, term377001.getClass(), "count", 0);
        setElement(term376237, 0, term377001);
        setField(term377173, term377173.getClass(), "value", term376781);
        setIntField(term377173, term377173.getClass(), "count", 0);
        setElement(term376237, 1, term377173);
        setField(term377287, term377287.getClass(), "value", term377345);
        setIntField(term377287, term377287.getClass(), "count", 0);
        setElement(term376237, 2, term377287);
        setField(term377459, term377459.getClass(), "value", term377517);
        setIntField(term377459, term377459.getClass(), "count", 0);
        setElement(term376237, 3, term377459);
        setField(term377631, term377631.getClass(), "value", term377733);
        setIntField(term377631, term377631.getClass(), "count", 0);
        setElement(term376237, 4, term377631);
        term377987 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term377988 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term377989 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term377992 = (byte[]) newByteArray(16);
        Object term377993 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term377994 = (char[]) newCharArray(0);
        Object term377995 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term377996 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term377999 = (byte[]) newByteArray(16);
        Object term378000 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term378001 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term378004 = (byte[]) newByteArray(16);
        Object term378005 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term378006 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term377989, term377989.getClass(), "toStringCache", "");
        setField(term377989, term377989.getClass(), "value", term377992);
        setByteField(term377989, term377989.getClass(), "coder", (byte) 0);
        setIntField(term377989, term377989.getClass(), "count", 0);
        setField(term377988, term377988.getClass(), "value", term377989);
        setIntField(term377988, term377988.getClass(), "count", 0);
        setElement(term377987, 0, term377988);
        setField(term377993, term377993.getClass(), "value", term377994);
        setIntField(term377993, term377993.getClass(), "count", 0);
        setElement(term377987, 1, term377993);
        setField(term377996, term377996.getClass(), "toStringCache", "");
        setField(term377996, term377996.getClass(), "value", term377999);
        setByteField(term377996, term377996.getClass(), "coder", (byte) 0);
        setIntField(term377996, term377996.getClass(), "count", 0);
        setField(term377995, term377995.getClass(), "value", term377996);
        setIntField(term377995, term377995.getClass(), "count", 0);
        setElement(term377987, 2, term377995);
        setField(term378001, term378001.getClass(), "toStringCache", "");
        setField(term378001, term378001.getClass(), "value", term378004);
        setByteField(term378001, term378001.getClass(), "coder", (byte) 0);
        setIntField(term378001, term378001.getClass(), "count", 0);
        setField(term378000, term378000.getClass(), "value", term378001);
        setIntField(term378000, term378000.getClass(), "count", 0);
        setElement(term377987, 3, term378000);
        setField(term378005, term378005.getClass(), "value", term378006);
        setIntField(term378005, term378005.getClass(), "count", 0);
        setElement(term377987, 4, term378005);
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
        args[0] = term376237;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term376237, term377987));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


