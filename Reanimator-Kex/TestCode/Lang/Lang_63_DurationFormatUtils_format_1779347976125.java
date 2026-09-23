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

public class DurationFormatUtils_format_1779347976125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91267;
     Object term92938;

    public DurationFormatUtils_format_1779347976125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term91872 = new StringBuffer();
        StringBuffer term92044 = new StringBuffer();
        StringBuffer term92216 = new StringBuffer();
        term91267 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term91590 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91700 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term91814 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91986 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92158 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92330 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term91590, term91590.getClass(), "value", term91700);
        setIntField(term91590, term91590.getClass(), "count", 0);
        setElement(term91267, 0, term91590);
        setField(term91814, term91814.getClass(), "value", term91872);
        setIntField(term91814, term91814.getClass(), "count", 0);
        setElement(term91267, 1, term91814);
        setField(term91986, term91986.getClass(), "value", term92044);
        setIntField(term91986, term91986.getClass(), "count", 0);
        setElement(term91267, 2, term91986);
        setElement(term91267, 3, term91814);
        setField(term92158, term92158.getClass(), "value", term92216);
        setIntField(term92158, term92158.getClass(), "count", 0);
        setElement(term91267, 4, term92158);
        setField(term92330, term92330.getClass(), "value", term91814);
        setIntField(term92330, term92330.getClass(), "count", 0);
        setElement(term91267, 5, term92330);
        term92938 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term92939 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92940 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term92941 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92942 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term92945 = (byte[]) newByteArray(16);
        Object term92946 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92947 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term92950 = (byte[]) newByteArray(16);
        Object term92951 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term92952 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term92955 = (byte[]) newByteArray(16);
        Object term92956 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term92939, term92939.getClass(), "value", term92940);
        setIntField(term92939, term92939.getClass(), "count", 0);
        setElement(term92938, 0, term92939);
        setField(term92942, term92942.getClass(), "toStringCache", "");
        setField(term92942, term92942.getClass(), "value", term92945);
        setByteField(term92942, term92942.getClass(), "coder", (byte) 0);
        setIntField(term92942, term92942.getClass(), "count", 0);
        setField(term92941, term92941.getClass(), "value", term92942);
        setIntField(term92941, term92941.getClass(), "count", 0);
        setElement(term92938, 1, term92941);
        setField(term92947, term92947.getClass(), "toStringCache", "");
        setField(term92947, term92947.getClass(), "value", term92950);
        setByteField(term92947, term92947.getClass(), "coder", (byte) 0);
        setIntField(term92947, term92947.getClass(), "count", 0);
        setField(term92946, term92946.getClass(), "value", term92947);
        setIntField(term92946, term92946.getClass(), "count", 0);
        setElement(term92938, 2, term92946);
        setElement(term92938, 3, term92941);
        setField(term92952, term92952.getClass(), "toStringCache", "");
        setField(term92952, term92952.getClass(), "value", term92955);
        setByteField(term92952, term92952.getClass(), "coder", (byte) 0);
        setIntField(term92952, term92952.getClass(), "count", 0);
        setField(term92951, term92951.getClass(), "value", term92952);
        setIntField(term92951, term92951.getClass(), "count", 0);
        setElement(term92938, 4, term92951);
        setField(term92956, term92956.getClass(), "value", term92941);
        setIntField(term92956, term92956.getClass(), "count", 0);
        setElement(term92938, 5, term92956);
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
        args[0] = term91267;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term91267, term92938));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


