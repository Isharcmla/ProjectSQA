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

public class DurationFormatUtils_format_1779347976407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336192;
     Object term337960;

    public DurationFormatUtils_format_1779347976407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term336770 = new StringBuffer();
        StringBuffer term337158 = new StringBuffer();
        StringBuffer term337330 = new StringBuffer();
        term336192 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term336712 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term336884 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term336986 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term337100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337444 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337596 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term336712, term336712.getClass(), "value", term336770);
        setIntField(term336712, term336712.getClass(), "count", 0);
        setElement(term336192, 0, term336712);
        setField(term336884, term336884.getClass(), "value", term336986);
        setIntField(term336884, term336884.getClass(), "count", 0);
        setElement(term336192, 1, term336884);
        setField(term337100, term337100.getClass(), "value", term337158);
        setIntField(term337100, term337100.getClass(), "count", 0);
        setElement(term336192, 2, term337100);
        setField(term337272, term337272.getClass(), "value", term337330);
        setIntField(term337272, term337272.getClass(), "count", 0);
        setElement(term336192, 3, term337272);
        setField(term337444, term337444.getClass(), "value", "");
        setIntField(term337444, term337444.getClass(), "count", 0);
        setElement(term336192, 4, term337444);
        setField(term337596, term337596.getClass(), "value", term336770);
        setIntField(term337596, term337596.getClass(), "count", 0);
        setElement(term336192, 5, term337596);
        term337960 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term337961 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337962 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term337965 = (byte[]) newByteArray(16);
        Object term337966 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337967 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term337968 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337969 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term337972 = (byte[]) newByteArray(16);
        Object term337973 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337974 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term337977 = (byte[]) newByteArray(16);
        Object term337978 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term337981 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term337962, term337962.getClass(), "toStringCache", "");
        setField(term337962, term337962.getClass(), "value", term337965);
        setByteField(term337962, term337962.getClass(), "coder", (byte) 0);
        setIntField(term337962, term337962.getClass(), "count", 0);
        setField(term337961, term337961.getClass(), "value", term337962);
        setIntField(term337961, term337961.getClass(), "count", 0);
        setElement(term337960, 0, term337961);
        setField(term337966, term337966.getClass(), "value", term337967);
        setIntField(term337966, term337966.getClass(), "count", 0);
        setElement(term337960, 1, term337966);
        setField(term337969, term337969.getClass(), "toStringCache", "");
        setField(term337969, term337969.getClass(), "value", term337972);
        setByteField(term337969, term337969.getClass(), "coder", (byte) 0);
        setIntField(term337969, term337969.getClass(), "count", 0);
        setField(term337968, term337968.getClass(), "value", term337969);
        setIntField(term337968, term337968.getClass(), "count", 0);
        setElement(term337960, 2, term337968);
        setField(term337974, term337974.getClass(), "toStringCache", "");
        setField(term337974, term337974.getClass(), "value", term337977);
        setByteField(term337974, term337974.getClass(), "coder", (byte) 0);
        setIntField(term337974, term337974.getClass(), "count", 0);
        setField(term337973, term337973.getClass(), "value", term337974);
        setIntField(term337973, term337973.getClass(), "count", 0);
        setElement(term337960, 3, term337973);
        setField(term337978, term337978.getClass(), "value", "");
        setIntField(term337978, term337978.getClass(), "count", 0);
        setElement(term337960, 4, term337978);
        setField(term337981, term337981.getClass(), "value", term337962);
        setIntField(term337981, term337981.getClass(), "count", 0);
        setElement(term337960, 5, term337981);
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
        args[0] = term336192;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term336192, term337960));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


