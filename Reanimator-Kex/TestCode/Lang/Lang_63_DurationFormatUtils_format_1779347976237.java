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

public class DurationFormatUtils_format_1779347976237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161525;
     Object term163101;

    public DurationFormatUtils_format_1779347976237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term161950 = new StringBuffer();
        StringBuilder term162276 = new StringBuilder();
        StringBuffer term162448 = new StringBuffer();
        term161525 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term161892 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term162064 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term162216 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term162390 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term162562 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term161892, term161892.getClass(), "value", term161950);
        setIntField(term161892, term161892.getClass(), "count", 0);
        setElement(term161525, 0, term161892);
        setField(term162064, term162064.getClass(), "value", "");
        setIntField(term162064, term162064.getClass(), "count", 0);
        setElement(term161525, 1, term162064);
        setField(term162216, term162216.getClass(), "value", term162276);
        setIntField(term162216, term162216.getClass(), "count", 0);
        setElement(term161525, 2, term162216);
        setField(term162390, term162390.getClass(), "value", term162448);
        setIntField(term162390, term162390.getClass(), "count", 0);
        setElement(term161525, 3, term162390);
        setElement(term161525, 4, term162562);
        term163101 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term163102 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163103 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term163106 = (byte[]) newByteArray(16);
        Object term163107 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163110 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163111 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term163112 = (byte[]) newByteArray(16);
        Object term163113 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163114 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term163117 = (byte[]) newByteArray(16);
        Object term163118 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term163103, term163103.getClass(), "toStringCache", "");
        setField(term163103, term163103.getClass(), "value", term163106);
        setByteField(term163103, term163103.getClass(), "coder", (byte) 0);
        setIntField(term163103, term163103.getClass(), "count", 0);
        setField(term163102, term163102.getClass(), "value", term163103);
        setIntField(term163102, term163102.getClass(), "count", 0);
        setElement(term163101, 0, term163102);
        setField(term163107, term163107.getClass(), "value", "");
        setIntField(term163107, term163107.getClass(), "count", 0);
        setElement(term163101, 1, term163107);
        setField(term163111, term163111.getClass(), "value", term163112);
        setByteField(term163111, term163111.getClass(), "coder", (byte) 0);
        setIntField(term163111, term163111.getClass(), "count", 0);
        setField(term163110, term163110.getClass(), "value", term163111);
        setIntField(term163110, term163110.getClass(), "count", 0);
        setElement(term163101, 2, term163110);
        setField(term163114, term163114.getClass(), "toStringCache", "");
        setField(term163114, term163114.getClass(), "value", term163117);
        setByteField(term163114, term163114.getClass(), "coder", (byte) 0);
        setIntField(term163114, term163114.getClass(), "count", 0);
        setField(term163113, term163113.getClass(), "value", term163114);
        setIntField(term163113, term163113.getClass(), "count", 0);
        setElement(term163101, 3, term163113);
        setField(term163118, term163118.getClass(), "value", null);
        setIntField(term163118, term163118.getClass(), "count", 0);
        setElement(term163101, 4, term163118);
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
        args[0] = term161525;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term161525, term163101));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


