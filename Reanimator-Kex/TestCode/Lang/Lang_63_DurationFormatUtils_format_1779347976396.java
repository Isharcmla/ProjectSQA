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

public class DurationFormatUtils_format_1779347976396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323673;
     Object term328866;

    public DurationFormatUtils_format_1779347976396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term324239 = new StringBuffer();
        StringBuffer term324525 = new StringBuffer();
        StringBuffer term324697 = new StringBuffer();
        StringBuilder term325209 = new StringBuilder();
        StringBuilder term325383 = new StringBuilder();
        term323673 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term324181 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term324353 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term323691 = (char[]) newCharArray(106);
        Object term324467 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term324639 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term324811 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term324921 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term325035 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term325149 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term325323 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term324181, term324181.getClass(), "value", term324239);
        setIntField(term324181, term324181.getClass(), "count", 0);
        setElement(term323673, 0, term324181);
        setField(term324353, term324353.getClass(), "value", term323691);
        setIntField(term324353, term324353.getClass(), "count", 0);
        setElement(term323673, 1, term324353);
        setField(term324467, term324467.getClass(), "value", term324525);
        setIntField(term324467, term324467.getClass(), "count", 0);
        setElement(term323673, 2, term324467);
        setField(term324639, term324639.getClass(), "value", term324697);
        setIntField(term324639, term324639.getClass(), "count", 0);
        setElement(term323673, 3, term324639);
        setField(term324811, term324811.getClass(), "value", term324921);
        setIntField(term324811, term324811.getClass(), "count", 0);
        setElement(term323673, 4, term324811);
        setField(term325035, term325035.getClass(), "value", null);
        setIntField(term325035, term325035.getClass(), "count", 0);
        setElement(term323673, 5, term325035);
        setField(term325149, term325149.getClass(), "value", term325209);
        setIntField(term325149, term325149.getClass(), "count", 0);
        setElement(term323673, 6, term325149);
        setField(term325323, term325323.getClass(), "value", term325383);
        setIntField(term325323, term325323.getClass(), "count", 0);
        setElement(term323673, 7, term325323);
        term328866 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term328867 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328868 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term328871 = (byte[]) newByteArray(16);
        Object term328872 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term328873 = (char[]) newCharArray(106);
        Object term328874 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328875 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term328878 = (byte[]) newByteArray(16);
        Object term328879 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328880 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term328883 = (byte[]) newByteArray(16);
        Object term328884 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328885 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term328886 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328887 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328888 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term328889 = (byte[]) newByteArray(16);
        Object term328890 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328891 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term328892 = (byte[]) newByteArray(16);
        setField(term328868, term328868.getClass(), "toStringCache", "");
        setField(term328868, term328868.getClass(), "value", term328871);
        setByteField(term328868, term328868.getClass(), "coder", (byte) 0);
        setIntField(term328868, term328868.getClass(), "count", 0);
        setField(term328867, term328867.getClass(), "value", term328868);
        setIntField(term328867, term328867.getClass(), "count", 0);
        setElement(term328866, 0, term328867);
        setField(term328872, term328872.getClass(), "value", term328873);
        setIntField(term328872, term328872.getClass(), "count", 0);
        setElement(term328866, 1, term328872);
        setField(term328875, term328875.getClass(), "toStringCache", "");
        setField(term328875, term328875.getClass(), "value", term328878);
        setByteField(term328875, term328875.getClass(), "coder", (byte) 0);
        setIntField(term328875, term328875.getClass(), "count", 0);
        setField(term328874, term328874.getClass(), "value", term328875);
        setIntField(term328874, term328874.getClass(), "count", 0);
        setElement(term328866, 2, term328874);
        setField(term328880, term328880.getClass(), "toStringCache", "");
        setField(term328880, term328880.getClass(), "value", term328883);
        setByteField(term328880, term328880.getClass(), "coder", (byte) 0);
        setIntField(term328880, term328880.getClass(), "count", 0);
        setField(term328879, term328879.getClass(), "value", term328880);
        setIntField(term328879, term328879.getClass(), "count", 0);
        setElement(term328866, 3, term328879);
        setField(term328884, term328884.getClass(), "value", term328885);
        setIntField(term328884, term328884.getClass(), "count", 0);
        setElement(term328866, 4, term328884);
        setField(term328886, term328886.getClass(), "value", null);
        setIntField(term328886, term328886.getClass(), "count", 0);
        setElement(term328866, 5, term328886);
        setField(term328888, term328888.getClass(), "value", term328889);
        setByteField(term328888, term328888.getClass(), "coder", (byte) 0);
        setIntField(term328888, term328888.getClass(), "count", 0);
        setField(term328887, term328887.getClass(), "value", term328888);
        setIntField(term328887, term328887.getClass(), "count", 0);
        setElement(term328866, 6, term328887);
        setField(term328891, term328891.getClass(), "value", term328892);
        setByteField(term328891, term328891.getClass(), "coder", (byte) 0);
        setIntField(term328891, term328891.getClass(), "count", 0);
        setField(term328890, term328890.getClass(), "value", term328891);
        setIntField(term328890, term328890.getClass(), "count", 0);
        setElement(term328866, 7, term328890);
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
        args[0] = term323673;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term323673, term328866));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


