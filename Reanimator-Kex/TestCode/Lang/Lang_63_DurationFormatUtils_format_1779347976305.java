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

public class DurationFormatUtils_format_1779347976305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226249;
     Object term227740;

    public DurationFormatUtils_format_1779347976305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term227041 = new StringBuffer();
        StringBuffer term227327 = new StringBuffer();
        StringBuilder term227501 = new StringBuilder();
        term226249 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term226983 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227155 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227441 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term226983, term226983.getClass(), "value", term227041);
        setIntField(term226983, term226983.getClass(), "count", 0);
        setElement(term226249, 0, term226983);
        setField(term227155, term227155.getClass(), "value", null);
        setIntField(term227155, term227155.getClass(), "count", 0);
        setElement(term226249, 1, term227155);
        setField(term227269, term227269.getClass(), "value", term227327);
        setIntField(term227269, term227269.getClass(), "count", 0);
        setElement(term226249, 2, term227269);
        setField(term227441, term227441.getClass(), "value", term227501);
        setIntField(term227441, term227441.getClass(), "count", 0);
        setElement(term226249, 3, term227441);
        term227740 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term227741 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227742 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term227745 = (byte[]) newByteArray(16);
        Object term227746 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227747 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227748 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term227751 = (byte[]) newByteArray(16);
        Object term227752 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term227753 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term227754 = (byte[]) newByteArray(16);
        setField(term227742, term227742.getClass(), "toStringCache", "");
        setField(term227742, term227742.getClass(), "value", term227745);
        setByteField(term227742, term227742.getClass(), "coder", (byte) 0);
        setIntField(term227742, term227742.getClass(), "count", 0);
        setField(term227741, term227741.getClass(), "value", term227742);
        setIntField(term227741, term227741.getClass(), "count", 0);
        setElement(term227740, 0, term227741);
        setField(term227746, term227746.getClass(), "value", null);
        setIntField(term227746, term227746.getClass(), "count", 0);
        setElement(term227740, 1, term227746);
        setField(term227748, term227748.getClass(), "toStringCache", "");
        setField(term227748, term227748.getClass(), "value", term227751);
        setByteField(term227748, term227748.getClass(), "coder", (byte) 0);
        setIntField(term227748, term227748.getClass(), "count", 0);
        setField(term227747, term227747.getClass(), "value", term227748);
        setIntField(term227747, term227747.getClass(), "count", 0);
        setElement(term227740, 2, term227747);
        setField(term227753, term227753.getClass(), "value", term227754);
        setByteField(term227753, term227753.getClass(), "coder", (byte) 0);
        setIntField(term227753, term227753.getClass(), "count", 0);
        setField(term227752, term227752.getClass(), "value", term227753);
        setIntField(term227752, term227752.getClass(), "count", 0);
        setElement(term227740, 3, term227752);
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
        args[0] = term226249;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term226249, term227740));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


