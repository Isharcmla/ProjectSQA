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

public class DurationFormatUtils_format_1779347976476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403335;
     Object term406227;

    public DurationFormatUtils_format_1779347976476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term403810 = new StringBuffer();
        StringBuffer term403982 = new StringBuffer();
        StringBuffer term404268 = new StringBuffer();
        StringBuffer term404440 = new StringBuffer();
        term403335 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term403638 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403752 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403924 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term404096 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term403380 = (char[]) newCharArray(0);
        Object term404210 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term404382 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term404554 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term403386 = (char[]) newCharArray(0);
        Object term404668 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term404706 = newInstance(Class.forName("java.lang.Object"));
        setField(term403752, term403752.getClass(), "value", term403810);
        setIntField(term403752, term403752.getClass(), "count", 0);
        setField(term403638, term403638.getClass(), "value", term403752);
        setIntField(term403638, term403638.getClass(), "count", 0);
        setElement(term403335, 0, term403638);
        setField(term403924, term403924.getClass(), "value", term403982);
        setIntField(term403924, term403924.getClass(), "count", 0);
        setElement(term403335, 1, term403924);
        setField(term404096, term404096.getClass(), "value", term403380);
        setIntField(term404096, term404096.getClass(), "count", 0);
        setElement(term403335, 2, term404096);
        setField(term404210, term404210.getClass(), "value", term404268);
        setIntField(term404210, term404210.getClass(), "count", 0);
        setElement(term403335, 3, term404210);
        setField(term404382, term404382.getClass(), "value", term404440);
        setIntField(term404382, term404382.getClass(), "count", 0);
        setElement(term403335, 4, term404382);
        setField(term404554, term404554.getClass(), "value", term403386);
        setIntField(term404554, term404554.getClass(), "count", 0);
        setElement(term403335, 5, term404554);
        setElement(term403335, 6, term403752);
        setField(term404668, term404668.getClass(), "value", term404706);
        setIntField(term404668, term404668.getClass(), "count", 0);
        setElement(term403335, 7, term404668);
        term406227 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term406228 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406229 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406230 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term406232 = (byte[]) newByteArray(16);
        Object term406233 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406234 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term406237 = (byte[]) newByteArray(16);
        Object term406238 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term406239 = (char[]) newCharArray(0);
        Object term406240 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406241 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term406244 = (byte[]) newByteArray(16);
        Object term406245 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406246 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term406249 = (byte[]) newByteArray(16);
        Object term406250 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term406251 = (char[]) newCharArray(0);
        Object term406252 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406253 = newInstance(Class.forName("java.lang.Object"));
        setField(term406230, term406230.getClass(), "toStringCache", "");
        setField(term406230, term406230.getClass(), "value", term406232);
        setByteField(term406230, term406230.getClass(), "coder", (byte) 0);
        setIntField(term406230, term406230.getClass(), "count", 0);
        setField(term406229, term406229.getClass(), "value", term406230);
        setIntField(term406229, term406229.getClass(), "count", 0);
        setField(term406228, term406228.getClass(), "value", term406229);
        setIntField(term406228, term406228.getClass(), "count", 0);
        setElement(term406227, 0, term406228);
        setField(term406234, term406234.getClass(), "toStringCache", "");
        setField(term406234, term406234.getClass(), "value", term406237);
        setByteField(term406234, term406234.getClass(), "coder", (byte) 0);
        setIntField(term406234, term406234.getClass(), "count", 0);
        setField(term406233, term406233.getClass(), "value", term406234);
        setIntField(term406233, term406233.getClass(), "count", 0);
        setElement(term406227, 1, term406233);
        setField(term406238, term406238.getClass(), "value", term406239);
        setIntField(term406238, term406238.getClass(), "count", 0);
        setElement(term406227, 2, term406238);
        setField(term406241, term406241.getClass(), "toStringCache", "");
        setField(term406241, term406241.getClass(), "value", term406244);
        setByteField(term406241, term406241.getClass(), "coder", (byte) 0);
        setIntField(term406241, term406241.getClass(), "count", 0);
        setField(term406240, term406240.getClass(), "value", term406241);
        setIntField(term406240, term406240.getClass(), "count", 0);
        setElement(term406227, 3, term406240);
        setField(term406246, term406246.getClass(), "toStringCache", "");
        setField(term406246, term406246.getClass(), "value", term406249);
        setByteField(term406246, term406246.getClass(), "coder", (byte) 0);
        setIntField(term406246, term406246.getClass(), "count", 0);
        setField(term406245, term406245.getClass(), "value", term406246);
        setIntField(term406245, term406245.getClass(), "count", 0);
        setElement(term406227, 4, term406245);
        setField(term406250, term406250.getClass(), "value", term406251);
        setIntField(term406250, term406250.getClass(), "count", 0);
        setElement(term406227, 5, term406250);
        setElement(term406227, 6, term406229);
        setField(term406252, term406252.getClass(), "value", term406253);
        setIntField(term406252, term406252.getClass(), "count", 0);
        setElement(term406227, 7, term406252);
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
        args[0] = term403335;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term403335, term406227));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


