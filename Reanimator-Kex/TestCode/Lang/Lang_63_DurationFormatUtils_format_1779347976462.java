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

public class DurationFormatUtils_format_1779347976462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391384;
     Object term394996;

    public DurationFormatUtils_format_1779347976462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term391985 = new StringBuffer();
        StringBuilder term392725 = new StringBuilder();
        StringBuffer term392897 = new StringBuffer();
        term391384 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term391927 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term392099 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term392213 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term392327 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term392437 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term392551 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term392665 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term392839 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term391927, term391927.getClass(), "value", term391985);
        setIntField(term391927, term391927.getClass(), "count", 0);
        setElement(term391384, 0, term391927);
        setField(term392099, term392099.getClass(), "value", null);
        setIntField(term392099, term392099.getClass(), "count", 0);
        setElement(term391384, 1, term392099);
        setField(term392213, term392213.getClass(), "value", null);
        setIntField(term392213, term392213.getClass(), "count", 0);
        setElement(term391384, 2, term392213);
        setField(term392327, term392327.getClass(), "value", term392437);
        setIntField(term392327, term392327.getClass(), "count", 0);
        setElement(term391384, 3, term392327);
        setField(term392551, term392551.getClass(), "value", null);
        setIntField(term392551, term392551.getClass(), "count", 0);
        setElement(term391384, 4, term392551);
        setField(term392665, term392665.getClass(), "value", term392725);
        setIntField(term392665, term392665.getClass(), "count", 0);
        setElement(term391384, 5, term392665);
        setField(term392839, term392839.getClass(), "value", term392897);
        setIntField(term392839, term392839.getClass(), "count", 0);
        setElement(term391384, 6, term392839);
        term394996 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term394997 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term394998 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term395001 = (byte[]) newByteArray(16);
        Object term395002 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395003 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395004 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395005 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term395006 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395007 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395008 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term395009 = (byte[]) newByteArray(16);
        Object term395010 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395011 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term395014 = (byte[]) newByteArray(16);
        setField(term394998, term394998.getClass(), "toStringCache", "");
        setField(term394998, term394998.getClass(), "value", term395001);
        setByteField(term394998, term394998.getClass(), "coder", (byte) 0);
        setIntField(term394998, term394998.getClass(), "count", 0);
        setField(term394997, term394997.getClass(), "value", term394998);
        setIntField(term394997, term394997.getClass(), "count", 0);
        setElement(term394996, 0, term394997);
        setField(term395002, term395002.getClass(), "value", null);
        setIntField(term395002, term395002.getClass(), "count", 0);
        setElement(term394996, 1, term395002);
        setField(term395003, term395003.getClass(), "value", null);
        setIntField(term395003, term395003.getClass(), "count", 0);
        setElement(term394996, 2, term395003);
        setField(term395004, term395004.getClass(), "value", term395005);
        setIntField(term395004, term395004.getClass(), "count", 0);
        setElement(term394996, 3, term395004);
        setField(term395006, term395006.getClass(), "value", null);
        setIntField(term395006, term395006.getClass(), "count", 0);
        setElement(term394996, 4, term395006);
        setField(term395008, term395008.getClass(), "value", term395009);
        setByteField(term395008, term395008.getClass(), "coder", (byte) 0);
        setIntField(term395008, term395008.getClass(), "count", 0);
        setField(term395007, term395007.getClass(), "value", term395008);
        setIntField(term395007, term395007.getClass(), "count", 0);
        setElement(term394996, 5, term395007);
        setField(term395011, term395011.getClass(), "toStringCache", "");
        setField(term395011, term395011.getClass(), "value", term395014);
        setByteField(term395011, term395011.getClass(), "coder", (byte) 0);
        setIntField(term395011, term395011.getClass(), "count", 0);
        setField(term395010, term395010.getClass(), "value", term395011);
        setIntField(term395010, term395010.getClass(), "count", 0);
        setElement(term394996, 6, term395010);
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
        args[0] = term391384;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term391384, term394996));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


