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

public class DurationFormatUtils_format_1779347976316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234383;
     Object term237696;

    public DurationFormatUtils_format_1779347976316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term235195 = new StringBuffer();
        StringBuffer term235367 = new StringBuffer();
        StringBuffer term235539 = new StringBuffer();
        StringBuffer term235711 = new StringBuffer();
        StringBuffer term235883 = new StringBuffer();
        StringBuffer term236055 = new StringBuffer();
        term234383 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term235137 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term235309 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term235481 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term235653 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term235825 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term235997 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term236169 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term235137, term235137.getClass(), "value", term235195);
        setIntField(term235137, term235137.getClass(), "count", 0);
        setElement(term234383, 0, term235137);
        setField(term235309, term235309.getClass(), "value", term235367);
        setIntField(term235309, term235309.getClass(), "count", 0);
        setElement(term234383, 1, term235309);
        setField(term235481, term235481.getClass(), "value", term235539);
        setIntField(term235481, term235481.getClass(), "count", 0);
        setElement(term234383, 2, term235481);
        setField(term235653, term235653.getClass(), "value", term235711);
        setIntField(term235653, term235653.getClass(), "count", 0);
        setElement(term234383, 3, term235653);
        setField(term235825, term235825.getClass(), "value", term235883);
        setIntField(term235825, term235825.getClass(), "count", 0);
        setElement(term234383, 4, term235825);
        setField(term235997, term235997.getClass(), "value", term236055);
        setIntField(term235997, term235997.getClass(), "count", 0);
        setElement(term234383, 5, term235997);
        setElement(term234383, 6, term236169);
        term237696 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term237697 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237698 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term237701 = (byte[]) newByteArray(16);
        Object term237702 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237703 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term237706 = (byte[]) newByteArray(16);
        Object term237707 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237708 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term237711 = (byte[]) newByteArray(16);
        Object term237712 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237713 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term237716 = (byte[]) newByteArray(16);
        Object term237717 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237718 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term237721 = (byte[]) newByteArray(16);
        Object term237722 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term237723 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term237726 = (byte[]) newByteArray(16);
        Object term237727 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term237698, term237698.getClass(), "toStringCache", "");
        setField(term237698, term237698.getClass(), "value", term237701);
        setByteField(term237698, term237698.getClass(), "coder", (byte) 0);
        setIntField(term237698, term237698.getClass(), "count", 0);
        setField(term237697, term237697.getClass(), "value", term237698);
        setIntField(term237697, term237697.getClass(), "count", 0);
        setElement(term237696, 0, term237697);
        setField(term237703, term237703.getClass(), "toStringCache", "");
        setField(term237703, term237703.getClass(), "value", term237706);
        setByteField(term237703, term237703.getClass(), "coder", (byte) 0);
        setIntField(term237703, term237703.getClass(), "count", 0);
        setField(term237702, term237702.getClass(), "value", term237703);
        setIntField(term237702, term237702.getClass(), "count", 0);
        setElement(term237696, 1, term237702);
        setField(term237708, term237708.getClass(), "toStringCache", "");
        setField(term237708, term237708.getClass(), "value", term237711);
        setByteField(term237708, term237708.getClass(), "coder", (byte) 0);
        setIntField(term237708, term237708.getClass(), "count", 0);
        setField(term237707, term237707.getClass(), "value", term237708);
        setIntField(term237707, term237707.getClass(), "count", 0);
        setElement(term237696, 2, term237707);
        setField(term237713, term237713.getClass(), "toStringCache", "");
        setField(term237713, term237713.getClass(), "value", term237716);
        setByteField(term237713, term237713.getClass(), "coder", (byte) 0);
        setIntField(term237713, term237713.getClass(), "count", 0);
        setField(term237712, term237712.getClass(), "value", term237713);
        setIntField(term237712, term237712.getClass(), "count", 0);
        setElement(term237696, 3, term237712);
        setField(term237718, term237718.getClass(), "toStringCache", "");
        setField(term237718, term237718.getClass(), "value", term237721);
        setByteField(term237718, term237718.getClass(), "coder", (byte) 0);
        setIntField(term237718, term237718.getClass(), "count", 0);
        setField(term237717, term237717.getClass(), "value", term237718);
        setIntField(term237717, term237717.getClass(), "count", 0);
        setElement(term237696, 4, term237717);
        setField(term237723, term237723.getClass(), "toStringCache", "");
        setField(term237723, term237723.getClass(), "value", term237726);
        setByteField(term237723, term237723.getClass(), "coder", (byte) 0);
        setIntField(term237723, term237723.getClass(), "count", 0);
        setField(term237722, term237722.getClass(), "value", term237723);
        setIntField(term237722, term237722.getClass(), "count", 0);
        setElement(term237696, 5, term237722);
        setField(term237727, term237727.getClass(), "value", null);
        setIntField(term237727, term237727.getClass(), "count", 0);
        setElement(term237696, 6, term237727);
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
        args[0] = term234383;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term234383, term237696));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


