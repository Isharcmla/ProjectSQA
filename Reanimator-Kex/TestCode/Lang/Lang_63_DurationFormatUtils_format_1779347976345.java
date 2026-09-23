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

public class DurationFormatUtils_format_1779347976345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265142;
     Object term266992;

    public DurationFormatUtils_format_1779347976345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term265959 = new StringBuffer();
        StringBuffer term266283 = new StringBuffer();
        StringBuffer term266455 = new StringBuffer();
        term265142 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term265901 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266073 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266111 = newInstance(Class.forName("java.lang.Object"));
        Object term266225 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266397 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266569 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266721 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term265901, term265901.getClass(), "value", term265959);
        setIntField(term265901, term265901.getClass(), "count", 0);
        setElement(term265142, 0, term265901);
        setField(term266073, term266073.getClass(), "value", term266111);
        setIntField(term266073, term266073.getClass(), "count", 0);
        setElement(term265142, 1, term266073);
        setField(term266225, term266225.getClass(), "value", term266283);
        setIntField(term266225, term266225.getClass(), "count", 0);
        setElement(term265142, 2, term266225);
        setField(term266397, term266397.getClass(), "value", term266455);
        setIntField(term266397, term266397.getClass(), "count", 0);
        setElement(term265142, 3, term266397);
        setField(term266569, term266569.getClass(), "value", "");
        setIntField(term266569, term266569.getClass(), "count", 0);
        setElement(term265142, 4, term266569);
        setElement(term265142, 5, term266721);
        term266992 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term266993 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266994 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term266997 = (byte[]) newByteArray(16);
        Object term266998 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term266999 = newInstance(Class.forName("java.lang.Object"));
        Object term267000 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term267001 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term267004 = (byte[]) newByteArray(16);
        Object term267005 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term267006 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term267009 = (byte[]) newByteArray(16);
        Object term267010 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term267013 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term266994, term266994.getClass(), "toStringCache", "");
        setField(term266994, term266994.getClass(), "value", term266997);
        setByteField(term266994, term266994.getClass(), "coder", (byte) 0);
        setIntField(term266994, term266994.getClass(), "count", 0);
        setField(term266993, term266993.getClass(), "value", term266994);
        setIntField(term266993, term266993.getClass(), "count", 0);
        setElement(term266992, 0, term266993);
        setField(term266998, term266998.getClass(), "value", term266999);
        setIntField(term266998, term266998.getClass(), "count", 0);
        setElement(term266992, 1, term266998);
        setField(term267001, term267001.getClass(), "toStringCache", "");
        setField(term267001, term267001.getClass(), "value", term267004);
        setByteField(term267001, term267001.getClass(), "coder", (byte) 0);
        setIntField(term267001, term267001.getClass(), "count", 0);
        setField(term267000, term267000.getClass(), "value", term267001);
        setIntField(term267000, term267000.getClass(), "count", 0);
        setElement(term266992, 2, term267000);
        setField(term267006, term267006.getClass(), "toStringCache", "");
        setField(term267006, term267006.getClass(), "value", term267009);
        setByteField(term267006, term267006.getClass(), "coder", (byte) 0);
        setIntField(term267006, term267006.getClass(), "count", 0);
        setField(term267005, term267005.getClass(), "value", term267006);
        setIntField(term267005, term267005.getClass(), "count", 0);
        setElement(term266992, 3, term267005);
        setField(term267010, term267010.getClass(), "value", "");
        setIntField(term267010, term267010.getClass(), "count", 0);
        setElement(term266992, 4, term267010);
        setField(term267013, term267013.getClass(), "value", null);
        setIntField(term267013, term267013.getClass(), "count", 0);
        setElement(term266992, 5, term267013);
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
        args[0] = term265142;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term265142, term266992));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


