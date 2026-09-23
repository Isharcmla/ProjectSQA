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

public class DurationFormatUtils_format_1779347976513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433336;
     Object term435728;

    public DurationFormatUtils_format_1779347976513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term433721 = new StringBuffer();
        StringBuffer term434007 = new StringBuffer();
        StringBuffer term434179 = new StringBuffer();
        StringBuffer term434351 = new StringBuffer();
        StringBuffer term434523 = new StringBuffer();
        term433336 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term433663 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term433835 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term433949 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term434121 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term434293 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term434465 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term434637 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term434751 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term433403 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term433663, term433663.getClass(), "value", term433721);
        setIntField(term433663, term433663.getClass(), "count", 0);
        setElement(term433336, 0, term433663);
        setField(term433835, term433835.getClass(), "value", term433663);
        setIntField(term433835, term433835.getClass(), "count", 0);
        setElement(term433336, 1, term433835);
        setField(term433949, term433949.getClass(), "value", term434007);
        setIntField(term433949, term433949.getClass(), "count", 0);
        setElement(term433336, 2, term433949);
        setField(term434121, term434121.getClass(), "value", term434179);
        setIntField(term434121, term434121.getClass(), "count", 0);
        setElement(term433336, 3, term434121);
        setField(term434293, term434293.getClass(), "value", term434351);
        setIntField(term434293, term434293.getClass(), "count", 0);
        setElement(term433336, 4, term434293);
        setField(term434465, term434465.getClass(), "value", term434523);
        setIntField(term434465, term434465.getClass(), "count", 0);
        setElement(term433336, 5, term434465);
        setField(term434637, term434637.getClass(), "value", null);
        setIntField(term434637, term434637.getClass(), "count", 0);
        setElement(term433336, 6, term434637);
        setField(term434751, term434751.getClass(), "value", term433403);
        setIntField(term434751, term434751.getClass(), "count", 0);
        setElement(term433336, 7, term434751);
        setElement(term433336, 8, term434465);
        term435728 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term435729 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435730 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435733 = (byte[]) newByteArray(16);
        Object term435734 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435735 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435736 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435739 = (byte[]) newByteArray(16);
        Object term435740 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435741 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435744 = (byte[]) newByteArray(16);
        Object term435745 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435746 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435749 = (byte[]) newByteArray(16);
        Object term435750 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435751 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term435754 = (byte[]) newByteArray(16);
        Object term435755 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term435756 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term435757 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term435730, term435730.getClass(), "toStringCache", "");
        setField(term435730, term435730.getClass(), "value", term435733);
        setByteField(term435730, term435730.getClass(), "coder", (byte) 0);
        setIntField(term435730, term435730.getClass(), "count", 0);
        setField(term435729, term435729.getClass(), "value", term435730);
        setIntField(term435729, term435729.getClass(), "count", 0);
        setElement(term435728, 0, term435729);
        setField(term435734, term435734.getClass(), "value", term435729);
        setIntField(term435734, term435734.getClass(), "count", 0);
        setElement(term435728, 1, term435734);
        setField(term435736, term435736.getClass(), "toStringCache", "");
        setField(term435736, term435736.getClass(), "value", term435739);
        setByteField(term435736, term435736.getClass(), "coder", (byte) 0);
        setIntField(term435736, term435736.getClass(), "count", 0);
        setField(term435735, term435735.getClass(), "value", term435736);
        setIntField(term435735, term435735.getClass(), "count", 0);
        setElement(term435728, 2, term435735);
        setField(term435741, term435741.getClass(), "toStringCache", "");
        setField(term435741, term435741.getClass(), "value", term435744);
        setByteField(term435741, term435741.getClass(), "coder", (byte) 0);
        setIntField(term435741, term435741.getClass(), "count", 0);
        setField(term435740, term435740.getClass(), "value", term435741);
        setIntField(term435740, term435740.getClass(), "count", 0);
        setElement(term435728, 3, term435740);
        setField(term435746, term435746.getClass(), "toStringCache", "");
        setField(term435746, term435746.getClass(), "value", term435749);
        setByteField(term435746, term435746.getClass(), "coder", (byte) 0);
        setIntField(term435746, term435746.getClass(), "count", 0);
        setField(term435745, term435745.getClass(), "value", term435746);
        setIntField(term435745, term435745.getClass(), "count", 0);
        setElement(term435728, 4, term435745);
        setField(term435751, term435751.getClass(), "toStringCache", "");
        setField(term435751, term435751.getClass(), "value", term435754);
        setByteField(term435751, term435751.getClass(), "coder", (byte) 0);
        setIntField(term435751, term435751.getClass(), "count", 0);
        setField(term435750, term435750.getClass(), "value", term435751);
        setIntField(term435750, term435750.getClass(), "count", 0);
        setElement(term435728, 5, term435750);
        setField(term435755, term435755.getClass(), "value", null);
        setIntField(term435755, term435755.getClass(), "count", 0);
        setElement(term435728, 6, term435755);
        setField(term435756, term435756.getClass(), "value", term435757);
        setIntField(term435756, term435756.getClass(), "count", 0);
        setElement(term435728, 7, term435756);
        setElement(term435728, 8, term435750);
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
        args[0] = term433336;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term433336, term435728));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


