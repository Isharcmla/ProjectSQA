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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293902;
     Object term301092;

    public DurationFormatUtils_format_1779347976373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term297522 = new StringBuilder();
        StringBuffer term297846 = new StringBuffer();
        StringBuffer term298018 = new StringBuffer();
        StringBuffer term298190 = new StringBuffer();
        term293902 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term297238 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term297348 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term297462 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term297636 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term297788 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term297960 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term298132 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term298304 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term293919 = (char[]) newCharArray(513);
        setField(term297238, term297238.getClass(), "value", term297348);
        setIntField(term297238, term297238.getClass(), "count", 0);
        setElement(term293902, 0, term297238);
        setField(term297462, term297462.getClass(), "value", term297522);
        setIntField(term297462, term297462.getClass(), "count", 0);
        setElement(term293902, 1, term297462);
        setField(term297636, term297636.getClass(), "value", "");
        setIntField(term297636, term297636.getClass(), "count", 0);
        setElement(term293902, 2, term297636);
        setField(term297788, term297788.getClass(), "value", term297846);
        setIntField(term297788, term297788.getClass(), "count", 0);
        setElement(term293902, 3, term297788);
        setField(term297960, term297960.getClass(), "value", term298018);
        setIntField(term297960, term297960.getClass(), "count", 0);
        setElement(term293902, 4, term297960);
        setField(term298132, term298132.getClass(), "value", term298190);
        setIntField(term298132, term298132.getClass(), "count", 0);
        setElement(term293902, 5, term298132);
        setField(term298304, term298304.getClass(), "value", term293919);
        setIntField(term298304, term298304.getClass(), "count", 0);
        setElement(term293902, 6, term298304);
        term301092 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term301093 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term301094 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term301095 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term301096 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term301097 = (byte[]) newByteArray(16);
        Object term301098 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term301101 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term301102 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term301105 = (byte[]) newByteArray(16);
        Object term301106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term301107 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term301110 = (byte[]) newByteArray(16);
        Object term301111 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term301112 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term301115 = (byte[]) newByteArray(16);
        Object term301116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term301117 = (char[]) newCharArray(513);
        setField(term301093, term301093.getClass(), "value", term301094);
        setIntField(term301093, term301093.getClass(), "count", 0);
        setElement(term301092, 0, term301093);
        setField(term301096, term301096.getClass(), "value", term301097);
        setByteField(term301096, term301096.getClass(), "coder", (byte) 0);
        setIntField(term301096, term301096.getClass(), "count", 0);
        setField(term301095, term301095.getClass(), "value", term301096);
        setIntField(term301095, term301095.getClass(), "count", 0);
        setElement(term301092, 1, term301095);
        setField(term301098, term301098.getClass(), "value", "");
        setIntField(term301098, term301098.getClass(), "count", 0);
        setElement(term301092, 2, term301098);
        setField(term301102, term301102.getClass(), "toStringCache", "");
        setField(term301102, term301102.getClass(), "value", term301105);
        setByteField(term301102, term301102.getClass(), "coder", (byte) 0);
        setIntField(term301102, term301102.getClass(), "count", 0);
        setField(term301101, term301101.getClass(), "value", term301102);
        setIntField(term301101, term301101.getClass(), "count", 0);
        setElement(term301092, 3, term301101);
        setField(term301107, term301107.getClass(), "toStringCache", "");
        setField(term301107, term301107.getClass(), "value", term301110);
        setByteField(term301107, term301107.getClass(), "coder", (byte) 0);
        setIntField(term301107, term301107.getClass(), "count", 0);
        setField(term301106, term301106.getClass(), "value", term301107);
        setIntField(term301106, term301106.getClass(), "count", 0);
        setElement(term301092, 4, term301106);
        setField(term301112, term301112.getClass(), "toStringCache", "");
        setField(term301112, term301112.getClass(), "value", term301115);
        setByteField(term301112, term301112.getClass(), "coder", (byte) 0);
        setIntField(term301112, term301112.getClass(), "count", 0);
        setField(term301111, term301111.getClass(), "value", term301112);
        setIntField(term301111, term301111.getClass(), "count", 0);
        setElement(term301092, 5, term301111);
        setField(term301116, term301116.getClass(), "value", term301117);
        setIntField(term301116, term301116.getClass(), "count", 0);
        setElement(term301092, 6, term301116);
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
        args[0] = term293902;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term293902, term301092));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


