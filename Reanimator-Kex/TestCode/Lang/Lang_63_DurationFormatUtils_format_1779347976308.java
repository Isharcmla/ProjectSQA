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

public class DurationFormatUtils_format_1779347976308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228007;
     Object term230718;

    public DurationFormatUtils_format_1779347976308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term228418 = new StringBuffer();
        StringBuffer term228590 = new StringBuffer();
        StringBuffer term228762 = new StringBuffer();
        StringBuffer term228934 = new StringBuffer();
        StringBuffer term229106 = new StringBuffer();
        term228007 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term228360 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term228532 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term228704 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term228876 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term229048 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term228360, term228360.getClass(), "value", term228418);
        setIntField(term228360, term228360.getClass(), "count", 0);
        setElement(term228007, 0, term228360);
        setField(term228532, term228532.getClass(), "value", term228590);
        setIntField(term228532, term228532.getClass(), "count", 0);
        setElement(term228007, 1, term228532);
        setField(term228704, term228704.getClass(), "value", term228762);
        setIntField(term228704, term228704.getClass(), "count", 0);
        setElement(term228007, 2, term228704);
        setElement(term228007, 3, term228532);
        setField(term228876, term228876.getClass(), "value", term228934);
        setIntField(term228876, term228876.getClass(), "count", 0);
        setElement(term228007, 4, term228876);
        setField(term229048, term229048.getClass(), "value", term229106);
        setIntField(term229048, term229048.getClass(), "count", 0);
        setElement(term228007, 5, term229048);
        term230718 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term230719 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230720 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term230723 = (byte[]) newByteArray(16);
        Object term230724 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230725 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term230728 = (byte[]) newByteArray(16);
        Object term230729 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230730 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term230733 = (byte[]) newByteArray(16);
        Object term230734 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230735 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term230738 = (byte[]) newByteArray(16);
        Object term230739 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230740 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term230743 = (byte[]) newByteArray(16);
        setField(term230720, term230720.getClass(), "toStringCache", "");
        setField(term230720, term230720.getClass(), "value", term230723);
        setByteField(term230720, term230720.getClass(), "coder", (byte) 0);
        setIntField(term230720, term230720.getClass(), "count", 0);
        setField(term230719, term230719.getClass(), "value", term230720);
        setIntField(term230719, term230719.getClass(), "count", 0);
        setElement(term230718, 0, term230719);
        setField(term230725, term230725.getClass(), "toStringCache", "");
        setField(term230725, term230725.getClass(), "value", term230728);
        setByteField(term230725, term230725.getClass(), "coder", (byte) 0);
        setIntField(term230725, term230725.getClass(), "count", 0);
        setField(term230724, term230724.getClass(), "value", term230725);
        setIntField(term230724, term230724.getClass(), "count", 0);
        setElement(term230718, 1, term230724);
        setField(term230730, term230730.getClass(), "toStringCache", "");
        setField(term230730, term230730.getClass(), "value", term230733);
        setByteField(term230730, term230730.getClass(), "coder", (byte) 0);
        setIntField(term230730, term230730.getClass(), "count", 0);
        setField(term230729, term230729.getClass(), "value", term230730);
        setIntField(term230729, term230729.getClass(), "count", 0);
        setElement(term230718, 2, term230729);
        setElement(term230718, 3, term230724);
        setField(term230735, term230735.getClass(), "toStringCache", "");
        setField(term230735, term230735.getClass(), "value", term230738);
        setByteField(term230735, term230735.getClass(), "coder", (byte) 0);
        setIntField(term230735, term230735.getClass(), "count", 0);
        setField(term230734, term230734.getClass(), "value", term230735);
        setIntField(term230734, term230734.getClass(), "count", 0);
        setElement(term230718, 4, term230734);
        setField(term230740, term230740.getClass(), "toStringCache", "");
        setField(term230740, term230740.getClass(), "value", term230743);
        setByteField(term230740, term230740.getClass(), "coder", (byte) 0);
        setIntField(term230740, term230740.getClass(), "count", 0);
        setField(term230739, term230739.getClass(), "value", term230740);
        setIntField(term230739, term230739.getClass(), "count", 0);
        setElement(term230718, 5, term230739);
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
        args[0] = term228007;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term228007, term230718));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


