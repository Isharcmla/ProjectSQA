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

public class DurationFormatUtils_format_1779347976405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334825;
     Object term336105;

    public DurationFormatUtils_format_1779347976405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term335169 = new StringBuffer();
        StringBuffer term335341 = new StringBuffer();
        StringBuffer term335513 = new StringBuffer();
        StringBuffer term335685 = new StringBuffer();
        term334825 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term335111 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term335283 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term335455 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term335627 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term335799 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term334916 = (char[]) newCharArray(0);
        setField(term335111, term335111.getClass(), "value", term335169);
        setIntField(term335111, term335111.getClass(), "count", 0);
        setElement(term334825, 0, term335111);
        setField(term335283, term335283.getClass(), "value", term335341);
        setIntField(term335283, term335283.getClass(), "count", 0);
        setElement(term334825, 1, term335283);
        setField(term335455, term335455.getClass(), "value", term335513);
        setIntField(term335455, term335455.getClass(), "count", 0);
        setElement(term334825, 2, term335455);
        setField(term335627, term335627.getClass(), "value", term335685);
        setIntField(term335627, term335627.getClass(), "count", 0);
        setElement(term334825, 3, term335627);
        setField(term335799, term335799.getClass(), "value", term334916);
        setIntField(term335799, term335799.getClass(), "count", 0);
        setElement(term334825, 4, term335799);
        term336105 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term336106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term336107 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term336110 = (byte[]) newByteArray(16);
        Object term336111 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term336112 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term336115 = (byte[]) newByteArray(16);
        Object term336116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term336117 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term336120 = (byte[]) newByteArray(16);
        Object term336121 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term336122 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term336125 = (byte[]) newByteArray(16);
        Object term336126 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term336127 = (char[]) newCharArray(0);
        setField(term336107, term336107.getClass(), "toStringCache", "");
        setField(term336107, term336107.getClass(), "value", term336110);
        setByteField(term336107, term336107.getClass(), "coder", (byte) 0);
        setIntField(term336107, term336107.getClass(), "count", 0);
        setField(term336106, term336106.getClass(), "value", term336107);
        setIntField(term336106, term336106.getClass(), "count", 0);
        setElement(term336105, 0, term336106);
        setField(term336112, term336112.getClass(), "toStringCache", "");
        setField(term336112, term336112.getClass(), "value", term336115);
        setByteField(term336112, term336112.getClass(), "coder", (byte) 0);
        setIntField(term336112, term336112.getClass(), "count", 0);
        setField(term336111, term336111.getClass(), "value", term336112);
        setIntField(term336111, term336111.getClass(), "count", 0);
        setElement(term336105, 1, term336111);
        setField(term336117, term336117.getClass(), "toStringCache", "");
        setField(term336117, term336117.getClass(), "value", term336120);
        setByteField(term336117, term336117.getClass(), "coder", (byte) 0);
        setIntField(term336117, term336117.getClass(), "count", 0);
        setField(term336116, term336116.getClass(), "value", term336117);
        setIntField(term336116, term336116.getClass(), "count", 0);
        setElement(term336105, 2, term336116);
        setField(term336122, term336122.getClass(), "toStringCache", "");
        setField(term336122, term336122.getClass(), "value", term336125);
        setByteField(term336122, term336122.getClass(), "coder", (byte) 0);
        setIntField(term336122, term336122.getClass(), "count", 0);
        setField(term336121, term336121.getClass(), "value", term336122);
        setIntField(term336121, term336121.getClass(), "count", 0);
        setElement(term336105, 3, term336121);
        setField(term336126, term336126.getClass(), "value", term336127);
        setIntField(term336126, term336126.getClass(), "count", 0);
        setElement(term336105, 4, term336126);
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
        args[0] = term334825;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term334825, term336105));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


