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

public class DurationFormatUtils_format_1779347976473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401028;
     Object term403245;

    public DurationFormatUtils_format_1779347976473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term401457 = new StringBuffer();
        StringBuffer term401629 = new StringBuffer();
        StringBuffer term401953 = new StringBuffer();
        StringBuffer term402125 = new StringBuffer();
        term401028 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term401399 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term401571 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term401743 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term401781 = newInstance(Class.forName("java.lang.Object"));
        Object term401895 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402067 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402239 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402349 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term402463 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term401399, term401399.getClass(), "value", term401457);
        setIntField(term401399, term401399.getClass(), "count", 0);
        setElement(term401028, 0, term401399);
        setField(term401571, term401571.getClass(), "value", term401629);
        setIntField(term401571, term401571.getClass(), "count", 0);
        setElement(term401028, 1, term401571);
        setField(term401743, term401743.getClass(), "value", term401781);
        setIntField(term401743, term401743.getClass(), "count", 0);
        setElement(term401028, 2, term401743);
        setField(term401895, term401895.getClass(), "value", term401953);
        setIntField(term401895, term401895.getClass(), "count", 0);
        setElement(term401028, 3, term401895);
        setField(term402067, term402067.getClass(), "value", term402125);
        setIntField(term402067, term402067.getClass(), "count", 0);
        setElement(term401028, 4, term402067);
        setField(term402239, term402239.getClass(), "value", term402349);
        setIntField(term402239, term402239.getClass(), "count", 0);
        setElement(term401028, 5, term402239);
        setField(term402463, term402463.getClass(), "value", null);
        setIntField(term402463, term402463.getClass(), "count", 0);
        setElement(term401028, 6, term402463);
        term403245 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term403246 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403247 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term403250 = (byte[]) newByteArray(16);
        Object term403251 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403252 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term403255 = (byte[]) newByteArray(16);
        Object term403256 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403257 = newInstance(Class.forName("java.lang.Object"));
        Object term403258 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403259 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term403262 = (byte[]) newByteArray(16);
        Object term403263 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403264 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term403267 = (byte[]) newByteArray(16);
        Object term403268 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term403269 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term403270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term403247, term403247.getClass(), "toStringCache", "");
        setField(term403247, term403247.getClass(), "value", term403250);
        setByteField(term403247, term403247.getClass(), "coder", (byte) 0);
        setIntField(term403247, term403247.getClass(), "count", 0);
        setField(term403246, term403246.getClass(), "value", term403247);
        setIntField(term403246, term403246.getClass(), "count", 0);
        setElement(term403245, 0, term403246);
        setField(term403252, term403252.getClass(), "toStringCache", "");
        setField(term403252, term403252.getClass(), "value", term403255);
        setByteField(term403252, term403252.getClass(), "coder", (byte) 0);
        setIntField(term403252, term403252.getClass(), "count", 0);
        setField(term403251, term403251.getClass(), "value", term403252);
        setIntField(term403251, term403251.getClass(), "count", 0);
        setElement(term403245, 1, term403251);
        setField(term403256, term403256.getClass(), "value", term403257);
        setIntField(term403256, term403256.getClass(), "count", 0);
        setElement(term403245, 2, term403256);
        setField(term403259, term403259.getClass(), "toStringCache", "");
        setField(term403259, term403259.getClass(), "value", term403262);
        setByteField(term403259, term403259.getClass(), "coder", (byte) 0);
        setIntField(term403259, term403259.getClass(), "count", 0);
        setField(term403258, term403258.getClass(), "value", term403259);
        setIntField(term403258, term403258.getClass(), "count", 0);
        setElement(term403245, 3, term403258);
        setField(term403264, term403264.getClass(), "toStringCache", "");
        setField(term403264, term403264.getClass(), "value", term403267);
        setByteField(term403264, term403264.getClass(), "coder", (byte) 0);
        setIntField(term403264, term403264.getClass(), "count", 0);
        setField(term403263, term403263.getClass(), "value", term403264);
        setIntField(term403263, term403263.getClass(), "count", 0);
        setElement(term403245, 4, term403263);
        setField(term403268, term403268.getClass(), "value", term403269);
        setIntField(term403268, term403268.getClass(), "count", 0);
        setElement(term403245, 5, term403268);
        setField(term403270, term403270.getClass(), "value", null);
        setIntField(term403270, term403270.getClass(), "count", 0);
        setElement(term403245, 6, term403270);
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
        args[0] = term401028;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term401028, term403245));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


