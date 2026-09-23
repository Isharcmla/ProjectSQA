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

public class DurationFormatUtils_format_1779347976457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386563;
     Object term388738;

    public DurationFormatUtils_format_1779347976457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term387484 = new StringBuffer();
        StringBuffer term387656 = new StringBuffer();
        StringBuffer term387942 = new StringBuffer();
        term386563 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term387084 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term387198 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term386826 = (char[]) newCharArray(0);
        Object term387312 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term387426 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term387598 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term387770 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term387884 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388056 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388170 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term387084, term387084.getClass(), "value", null);
        setIntField(term387084, term387084.getClass(), "count", 0);
        setElement(term386563, 0, term387084);
        setField(term387198, term387198.getClass(), "value", term386826);
        setIntField(term387198, term387198.getClass(), "count", 0);
        setElement(term386563, 1, term387198);
        setField(term387312, term387312.getClass(), "value", null);
        setIntField(term387312, term387312.getClass(), "count", 0);
        setElement(term386563, 2, term387312);
        setField(term387426, term387426.getClass(), "value", term387484);
        setIntField(term387426, term387426.getClass(), "count", 0);
        setElement(term386563, 3, term387426);
        setField(term387598, term387598.getClass(), "value", term387656);
        setIntField(term387598, term387598.getClass(), "count", 0);
        setElement(term386563, 4, term387598);
        setField(term387770, term387770.getClass(), "value", null);
        setIntField(term387770, term387770.getClass(), "count", 0);
        setElement(term386563, 5, term387770);
        setField(term387884, term387884.getClass(), "value", term387942);
        setIntField(term387884, term387884.getClass(), "count", 0);
        setElement(term386563, 6, term387884);
        setField(term388056, term388056.getClass(), "value", term388170);
        setIntField(term388056, term388056.getClass(), "count", 0);
        setElement(term386563, 7, term388056);
        term388738 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term388739 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388740 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term388741 = (char[]) newCharArray(0);
        Object term388742 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388743 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388744 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term388747 = (byte[]) newByteArray(16);
        Object term388748 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388749 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term388752 = (byte[]) newByteArray(16);
        Object term388753 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388754 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388755 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term388758 = (byte[]) newByteArray(16);
        Object term388759 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term388760 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term388739, term388739.getClass(), "value", null);
        setIntField(term388739, term388739.getClass(), "count", 0);
        setElement(term388738, 0, term388739);
        setField(term388740, term388740.getClass(), "value", term388741);
        setIntField(term388740, term388740.getClass(), "count", 0);
        setElement(term388738, 1, term388740);
        setField(term388742, term388742.getClass(), "value", null);
        setIntField(term388742, term388742.getClass(), "count", 0);
        setElement(term388738, 2, term388742);
        setField(term388744, term388744.getClass(), "toStringCache", "");
        setField(term388744, term388744.getClass(), "value", term388747);
        setByteField(term388744, term388744.getClass(), "coder", (byte) 0);
        setIntField(term388744, term388744.getClass(), "count", 0);
        setField(term388743, term388743.getClass(), "value", term388744);
        setIntField(term388743, term388743.getClass(), "count", 0);
        setElement(term388738, 3, term388743);
        setField(term388749, term388749.getClass(), "toStringCache", "");
        setField(term388749, term388749.getClass(), "value", term388752);
        setByteField(term388749, term388749.getClass(), "coder", (byte) 0);
        setIntField(term388749, term388749.getClass(), "count", 0);
        setField(term388748, term388748.getClass(), "value", term388749);
        setIntField(term388748, term388748.getClass(), "count", 0);
        setElement(term388738, 4, term388748);
        setField(term388753, term388753.getClass(), "value", null);
        setIntField(term388753, term388753.getClass(), "count", 0);
        setElement(term388738, 5, term388753);
        setField(term388755, term388755.getClass(), "toStringCache", "");
        setField(term388755, term388755.getClass(), "value", term388758);
        setByteField(term388755, term388755.getClass(), "coder", (byte) 0);
        setIntField(term388755, term388755.getClass(), "count", 0);
        setField(term388754, term388754.getClass(), "value", term388755);
        setIntField(term388754, term388754.getClass(), "count", 0);
        setElement(term388738, 6, term388754);
        setField(term388760, term388760.getClass(), "value", null);
        setIntField(term388760, term388760.getClass(), "count", 0);
        setField(term388759, term388759.getClass(), "value", term388760);
        setIntField(term388759, term388759.getClass(), "count", 0);
        setElement(term388738, 7, term388759);
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
        args[0] = term386563;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term386563, term388738));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


