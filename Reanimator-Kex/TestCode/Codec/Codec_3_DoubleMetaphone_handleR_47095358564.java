package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class DoubleMetaphone_handleR_47095358564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1766;
     Object term1780;
     Object term1846;
     Object term1848;
     Object term13121;
     Object term13122;

    public DoubleMetaphone_handleR_47095358564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1766 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1766, term1766.getClass(), "maxCodeLen", 4);
        term1780 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1781 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1794 = (byte[]) newByteArray(16);
        Object term1813 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1826 = (byte[]) newByteArray(16);
        setField(term1781, term1781.getClass(), "toStringCache", "UlajhuVLaP");
        setField(term1781, term1781.getClass(), "value", term1794);
        setByteField(term1781, term1781.getClass(), "coder", (byte) -2);
        setIntField(term1781, term1781.getClass(), "count", -817164822);
        setField(term1780, term1780.getClass(), "primary", term1781);
        setField(term1813, term1813.getClass(), "toStringCache", "gGSMzuGICf");
        setField(term1813, term1813.getClass(), "value", term1826);
        setByteField(term1813, term1813.getClass(), "coder", (byte) -16);
        setIntField(term1813, term1813.getClass(), "count", -1016503459);
        setField(term1780, term1780.getClass(), "alternate", term1813);
        setIntField(term1780, term1780.getClass(), "maxLength", -1968847291);
        setField(term1780, term1780.getClass(), "this$0", null);
        term1846 = new Integer(579005622);
        term1848 = new Boolean(true);
        term13121 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term13121, term13121.getClass(), "maxCodeLen", 4);
        term13122 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term13123 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term13126 = (byte[]) newByteArray(16);
        Object term13127 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term13130 = (byte[]) newByteArray(16);
        setField(term13123, term13123.getClass(), "toStringCache", "UlajhuVLaP");
        setField(term13123, term13123.getClass(), "value", term13126);
        setByteField(term13123, term13123.getClass(), "coder", (byte) -2);
        setIntField(term13123, term13123.getClass(), "count", -817164822);
        setField(term13122, term13122.getClass(), "primary", term13123);
        setField(term13127, term13127.getClass(), "toStringCache", "gGSMzuGICf");
        setField(term13127, term13127.getClass(), "value", term13130);
        setByteField(term13127, term13127.getClass(), "coder", (byte) -16);
        setIntField(term13127, term13127.getClass(), "count", -1016503459);
        setField(term13122, term13122.getClass(), "alternate", term13127);
        setIntField(term13122, term13122.getClass(), "maxLength", -1968847291);
        setField(term13122, term13122.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "wSQxaModmm";
        args[1] = term1780;
        args[2] = term1846;
        args[3] = term1848;
        Object retValue = callMethod(klass, "handleR", argTypes, term1766, args);
        assertTrue(recursiveEquals(term1766, term13121));
        assertTrue(recursiveEquals(term1780, "wSQxaModmm"));
        assertTrue(recursiveEquals(term1846, 579005622));
        assertTrue(recursiveEquals(term1848, true));
        assertTrue(recursiveEquals(retValue, 579005623));
    }

};


