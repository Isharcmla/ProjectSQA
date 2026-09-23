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

public class DurationFormatUtils_format_177934797651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27071;
     Object term27671;

    public DurationFormatUtils_format_177934797651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term27348 = new StringBuffer();
        term27071 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term27290 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term27462 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term27572 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term27290, term27290.getClass(), "value", term27348);
        setIntField(term27290, term27290.getClass(), "count", 0);
        setElement(term27071, 0, term27290);
        setField(term27462, term27462.getClass(), "value", term27572);
        setIntField(term27462, term27462.getClass(), "count", 0);
        setElement(term27071, 1, term27462);
        term27671 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term27672 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term27673 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term27676 = (byte[]) newByteArray(16);
        Object term27677 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term27678 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term27673, term27673.getClass(), "toStringCache", "");
        setField(term27673, term27673.getClass(), "value", term27676);
        setByteField(term27673, term27673.getClass(), "coder", (byte) 0);
        setIntField(term27673, term27673.getClass(), "count", 0);
        setField(term27672, term27672.getClass(), "value", term27673);
        setIntField(term27672, term27672.getClass(), "count", 0);
        setElement(term27671, 0, term27672);
        setField(term27677, term27677.getClass(), "value", term27678);
        setIntField(term27677, term27677.getClass(), "count", 0);
        setElement(term27671, 1, term27677);
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
        args[0] = term27071;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term27071, term27671));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


