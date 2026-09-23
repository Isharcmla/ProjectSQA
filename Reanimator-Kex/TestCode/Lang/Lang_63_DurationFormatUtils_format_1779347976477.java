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

public class DurationFormatUtils_format_1779347976477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404707;
     Object term406684;

    public DurationFormatUtils_format_1779347976477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term405162 = new StringBuffer();
        StringBuffer term405486 = new StringBuffer();
        StringBuffer term405658 = new StringBuffer();
        StringBuffer term405830 = new StringBuffer();
        term404707 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term404990 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term405104 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term405276 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term405428 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term405600 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term405772 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term404990, term404990.getClass(), "value", term404707);
        setIntField(term404990, term404990.getClass(), "count", 0);
        setElement(term404707, 0, term404990);
        setField(term405104, term405104.getClass(), "value", term405162);
        setIntField(term405104, term405104.getClass(), "count", 0);
        setElement(term404707, 1, term405104);
        setField(term405276, term405276.getClass(), "value", "");
        setIntField(term405276, term405276.getClass(), "count", 0);
        setElement(term404707, 2, term405276);
        setField(term405428, term405428.getClass(), "value", term405486);
        setIntField(term405428, term405428.getClass(), "count", 0);
        setElement(term404707, 3, term405428);
        setField(term405600, term405600.getClass(), "value", term405658);
        setIntField(term405600, term405600.getClass(), "count", 0);
        setElement(term404707, 4, term405600);
        setField(term405772, term405772.getClass(), "value", term405830);
        setIntField(term405772, term405772.getClass(), "count", 0);
        setElement(term404707, 5, term405772);
        term406684 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term406685 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term406686 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term406687 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406688 = newInstance(Class.forName("java.lang.StringBuffer"));
        Object term406689 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406691 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406692 = newInstance(Class.forName("java.lang.StringBuffer"));
        Object term406693 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406694 = newInstance(Class.forName("java.lang.StringBuffer"));
        Object term406695 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term406696 = newInstance(Class.forName("java.lang.StringBuffer"));
        setElement(term406686, 0, term406685);
        setField(term406688, term406688.getClass(), "toStringCache", null);
        setField(term406688, term406688.getClass(), "value", null);
        setByteField(term406688, term406688.getClass(), "coder", (byte) 0);
        setIntField(term406688, term406688.getClass(), "count", 0);
        setField(term406687, term406687.getClass(), "value", term406688);
        setIntField(term406687, term406687.getClass(), "count", 0);
        setElement(term406686, 1, term406687);
        setField(term406689, term406689.getClass(), "value", "");
        setIntField(term406689, term406689.getClass(), "count", 0);
        setElement(term406686, 2, term406689);
        setField(term406692, term406692.getClass(), "toStringCache", null);
        setField(term406692, term406692.getClass(), "value", null);
        setByteField(term406692, term406692.getClass(), "coder", (byte) 0);
        setIntField(term406692, term406692.getClass(), "count", 0);
        setField(term406691, term406691.getClass(), "value", term406692);
        setIntField(term406691, term406691.getClass(), "count", 0);
        setElement(term406686, 3, term406691);
        setField(term406694, term406694.getClass(), "toStringCache", null);
        setField(term406694, term406694.getClass(), "value", null);
        setByteField(term406694, term406694.getClass(), "coder", (byte) 0);
        setIntField(term406694, term406694.getClass(), "count", 0);
        setField(term406693, term406693.getClass(), "value", term406694);
        setIntField(term406693, term406693.getClass(), "count", 0);
        setElement(term406686, 4, term406693);
        setField(term406696, term406696.getClass(), "toStringCache", null);
        setField(term406696, term406696.getClass(), "value", null);
        setByteField(term406696, term406696.getClass(), "coder", (byte) 0);
        setIntField(term406696, term406696.getClass(), "count", 0);
        setField(term406695, term406695.getClass(), "value", term406696);
        setIntField(term406695, term406695.getClass(), "count", 0);
        setElement(term406686, 5, term406695);
        setField(term406685, term406685.getClass(), "value", term406686);
        setIntField(term406685, term406685.getClass(), "count", 0);
        setElement(term406684, 0, term406685);
        setElement(term406684, 1, term406687);
        setElement(term406684, 2, term406689);
        setElement(term406684, 3, term406691);
        setElement(term406684, 4, term406693);
        setElement(term406684, 5, term406695);
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
        args[0] = term404707;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term404707, term406684));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


