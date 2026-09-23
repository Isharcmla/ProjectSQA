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

public class DurationFormatUtils_format_1779347976456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384450;
     Object term388389;

    public DurationFormatUtils_format_1779347976456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term385775 = new StringBuffer();
        StringBuffer term385947 = new StringBuffer();
        term384450 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term385227 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term384983 = (char[]) newCharArray(0);
        Object term385341 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term385451 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term385565 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term385603 = newInstance(Class.forName("java.lang.Object"));
        Object term385717 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term385889 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term386061 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term386163 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term385227, term385227.getClass(), "value", term384983);
        setIntField(term385227, term385227.getClass(), "count", 0);
        setElement(term384450, 0, term385227);
        setField(term385341, term385341.getClass(), "value", term385451);
        setIntField(term385341, term385341.getClass(), "count", 0);
        setElement(term384450, 1, term385341);
        setField(term385565, term385565.getClass(), "value", term385603);
        setIntField(term385565, term385565.getClass(), "count", 0);
        setElement(term384450, 2, term385565);
        setField(term385717, term385717.getClass(), "value", term385775);
        setIntField(term385717, term385717.getClass(), "count", 0);
        setElement(term384450, 3, term385717);
        setField(term385889, term385889.getClass(), "value", term385947);
        setIntField(term385889, term385889.getClass(), "count", 0);
        setElement(term384450, 4, term385889);
        setField(term386061, term386061.getClass(), "value", term386163);
        setIntField(term386061, term386061.getClass(), "count", 0);
        setElement(term384450, 5, term386061);
        term388389 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term388390 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term388391 = (char[]) newCharArray(0);
        Object term388392 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388393 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term388394 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388395 = newInstance(Class.forName("java.lang.Object"));
        Object term388396 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388397 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term388400 = (byte[]) newByteArray(16);
        Object term388401 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388402 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term388405 = (byte[]) newByteArray(16);
        Object term388406 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388407 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term388390, term388390.getClass(), "value", term388391);
        setIntField(term388390, term388390.getClass(), "count", 0);
        setElement(term388389, 0, term388390);
        setField(term388392, term388392.getClass(), "value", term388393);
        setIntField(term388392, term388392.getClass(), "count", 0);
        setElement(term388389, 1, term388392);
        setField(term388394, term388394.getClass(), "value", term388395);
        setIntField(term388394, term388394.getClass(), "count", 0);
        setElement(term388389, 2, term388394);
        setField(term388397, term388397.getClass(), "toStringCache", "");
        setField(term388397, term388397.getClass(), "value", term388400);
        setByteField(term388397, term388397.getClass(), "coder", (byte) 0);
        setIntField(term388397, term388397.getClass(), "count", 0);
        setField(term388396, term388396.getClass(), "value", term388397);
        setIntField(term388396, term388396.getClass(), "count", 0);
        setElement(term388389, 3, term388396);
        setField(term388402, term388402.getClass(), "toStringCache", "");
        setField(term388402, term388402.getClass(), "value", term388405);
        setByteField(term388402, term388402.getClass(), "coder", (byte) 0);
        setIntField(term388402, term388402.getClass(), "count", 0);
        setField(term388401, term388401.getClass(), "value", term388402);
        setIntField(term388401, term388401.getClass(), "count", 0);
        setElement(term388389, 4, term388401);
        setField(term388406, term388406.getClass(), "value", term388407);
        setIntField(term388406, term388406.getClass(), "count", 0);
        setElement(term388389, 5, term388406);
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
        args[0] = term384450;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term384450, term388389));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


