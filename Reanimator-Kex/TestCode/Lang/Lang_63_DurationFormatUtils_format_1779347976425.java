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

public class DurationFormatUtils_format_1779347976425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356109;
     Object term358227;

    public DurationFormatUtils_format_1779347976425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term356501 = new StringBuffer();
        StringBuffer term356673 = new StringBuffer();
        StringBuffer term356845 = new StringBuffer();
        StringBuffer term357017 = new StringBuffer();
        StringBuffer term357341 = new StringBuffer();
        term356109 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term356443 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term356615 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term356787 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term356959 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357131 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357283 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term356443, term356443.getClass(), "value", term356501);
        setIntField(term356443, term356443.getClass(), "count", 0);
        setElement(term356109, 0, term356443);
        setField(term356615, term356615.getClass(), "value", term356673);
        setIntField(term356615, term356615.getClass(), "count", 0);
        setElement(term356109, 1, term356615);
        setField(term356787, term356787.getClass(), "value", term356845);
        setIntField(term356787, term356787.getClass(), "count", 0);
        setElement(term356109, 2, term356787);
        setElement(term356109, 3, term356787);
        setField(term356959, term356959.getClass(), "value", term357017);
        setIntField(term356959, term356959.getClass(), "count", 0);
        setElement(term356109, 4, term356959);
        setField(term357131, term357131.getClass(), "value", "");
        setIntField(term357131, term357131.getClass(), "count", 0);
        setElement(term356109, 5, term357131);
        setField(term357283, term357283.getClass(), "value", term357341);
        setIntField(term357283, term357283.getClass(), "count", 0);
        setElement(term356109, 6, term357283);
        term358227 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term358228 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358229 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term358232 = (byte[]) newByteArray(16);
        Object term358233 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358234 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term358237 = (byte[]) newByteArray(16);
        Object term358238 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358239 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term358242 = (byte[]) newByteArray(16);
        Object term358243 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358244 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term358247 = (byte[]) newByteArray(16);
        Object term358248 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358251 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358252 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term358255 = (byte[]) newByteArray(16);
        setField(term358229, term358229.getClass(), "toStringCache", "");
        setField(term358229, term358229.getClass(), "value", term358232);
        setByteField(term358229, term358229.getClass(), "coder", (byte) 0);
        setIntField(term358229, term358229.getClass(), "count", 0);
        setField(term358228, term358228.getClass(), "value", term358229);
        setIntField(term358228, term358228.getClass(), "count", 0);
        setElement(term358227, 0, term358228);
        setField(term358234, term358234.getClass(), "toStringCache", "");
        setField(term358234, term358234.getClass(), "value", term358237);
        setByteField(term358234, term358234.getClass(), "coder", (byte) 0);
        setIntField(term358234, term358234.getClass(), "count", 0);
        setField(term358233, term358233.getClass(), "value", term358234);
        setIntField(term358233, term358233.getClass(), "count", 0);
        setElement(term358227, 1, term358233);
        setField(term358239, term358239.getClass(), "toStringCache", "");
        setField(term358239, term358239.getClass(), "value", term358242);
        setByteField(term358239, term358239.getClass(), "coder", (byte) 0);
        setIntField(term358239, term358239.getClass(), "count", 0);
        setField(term358238, term358238.getClass(), "value", term358239);
        setIntField(term358238, term358238.getClass(), "count", 0);
        setElement(term358227, 2, term358238);
        setElement(term358227, 3, term358238);
        setField(term358244, term358244.getClass(), "toStringCache", "");
        setField(term358244, term358244.getClass(), "value", term358247);
        setByteField(term358244, term358244.getClass(), "coder", (byte) 0);
        setIntField(term358244, term358244.getClass(), "count", 0);
        setField(term358243, term358243.getClass(), "value", term358244);
        setIntField(term358243, term358243.getClass(), "count", 0);
        setElement(term358227, 4, term358243);
        setField(term358248, term358248.getClass(), "value", "");
        setIntField(term358248, term358248.getClass(), "count", 0);
        setElement(term358227, 5, term358248);
        setField(term358252, term358252.getClass(), "toStringCache", "");
        setField(term358252, term358252.getClass(), "value", term358255);
        setByteField(term358252, term358252.getClass(), "coder", (byte) 0);
        setIntField(term358252, term358252.getClass(), "count", 0);
        setField(term358251, term358251.getClass(), "value", term358252);
        setIntField(term358251, term358251.getClass(), "count", 0);
        setElement(term358227, 6, term358251);
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
        args[0] = term356109;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term356109, term358227));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


