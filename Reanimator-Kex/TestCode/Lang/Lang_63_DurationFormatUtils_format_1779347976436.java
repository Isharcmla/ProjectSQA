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

public class DurationFormatUtils_format_1779347976436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364967;
     Object term371318;

    public DurationFormatUtils_format_1779347976436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term368986 = new StringBuffer();
        StringBuffer term369272 = new StringBuffer();
        term364967 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term368396 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term368434 = newInstance(Class.forName("java.lang.Object"));
        Object term368548 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term368662 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term368700 = newInstance(Class.forName("java.lang.Object"));
        Object term368814 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term367085 = (char[]) newCharArray(0);
        Object term368928 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term369100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term369214 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term369386 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term369488 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term368396, term368396.getClass(), "value", term368434);
        setIntField(term368396, term368396.getClass(), "count", 0);
        setElement(term364967, 0, term368396);
        setField(term368548, term368548.getClass(), "value", null);
        setIntField(term368548, term368548.getClass(), "count", 0);
        setElement(term364967, 1, term368548);
        setField(term368662, term368662.getClass(), "value", term368700);
        setIntField(term368662, term368662.getClass(), "count", 0);
        setElement(term364967, 2, term368662);
        setField(term368814, term368814.getClass(), "value", term367085);
        setIntField(term368814, term368814.getClass(), "count", 0);
        setElement(term364967, 3, term368814);
        setField(term368928, term368928.getClass(), "value", term368986);
        setIntField(term368928, term368928.getClass(), "count", 0);
        setElement(term364967, 4, term368928);
        setField(term369100, term369100.getClass(), "value", null);
        setIntField(term369100, term369100.getClass(), "count", 0);
        setElement(term364967, 5, term369100);
        setField(term369214, term369214.getClass(), "value", term369272);
        setIntField(term369214, term369214.getClass(), "count", 0);
        setElement(term364967, 6, term369214);
        setField(term369386, term369386.getClass(), "value", term369488);
        setIntField(term369386, term369386.getClass(), "count", 0);
        setElement(term364967, 7, term369386);
        term371318 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term371319 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371320 = newInstance(Class.forName("java.lang.Object"));
        Object term371321 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371322 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371323 = newInstance(Class.forName("java.lang.Object"));
        Object term371324 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term371325 = (char[]) newCharArray(0);
        Object term371326 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371327 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term371330 = (byte[]) newByteArray(16);
        Object term371331 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371332 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371333 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term371336 = (byte[]) newByteArray(16);
        Object term371337 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371338 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term371319, term371319.getClass(), "value", term371320);
        setIntField(term371319, term371319.getClass(), "count", 0);
        setElement(term371318, 0, term371319);
        setField(term371321, term371321.getClass(), "value", null);
        setIntField(term371321, term371321.getClass(), "count", 0);
        setElement(term371318, 1, term371321);
        setField(term371322, term371322.getClass(), "value", term371323);
        setIntField(term371322, term371322.getClass(), "count", 0);
        setElement(term371318, 2, term371322);
        setField(term371324, term371324.getClass(), "value", term371325);
        setIntField(term371324, term371324.getClass(), "count", 0);
        setElement(term371318, 3, term371324);
        setField(term371327, term371327.getClass(), "toStringCache", "");
        setField(term371327, term371327.getClass(), "value", term371330);
        setByteField(term371327, term371327.getClass(), "coder", (byte) 0);
        setIntField(term371327, term371327.getClass(), "count", 0);
        setField(term371326, term371326.getClass(), "value", term371327);
        setIntField(term371326, term371326.getClass(), "count", 0);
        setElement(term371318, 4, term371326);
        setField(term371331, term371331.getClass(), "value", null);
        setIntField(term371331, term371331.getClass(), "count", 0);
        setElement(term371318, 5, term371331);
        setField(term371333, term371333.getClass(), "toStringCache", "");
        setField(term371333, term371333.getClass(), "value", term371336);
        setByteField(term371333, term371333.getClass(), "coder", (byte) 0);
        setIntField(term371333, term371333.getClass(), "count", 0);
        setField(term371332, term371332.getClass(), "value", term371333);
        setIntField(term371332, term371332.getClass(), "count", 0);
        setElement(term371318, 6, term371332);
        setField(term371337, term371337.getClass(), "value", term371338);
        setIntField(term371337, term371337.getClass(), "count", 0);
        setElement(term371318, 7, term371337);
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
        args[0] = term364967;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term364967, term371318));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


