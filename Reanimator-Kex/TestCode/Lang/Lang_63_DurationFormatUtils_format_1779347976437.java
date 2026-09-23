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

public class DurationFormatUtils_format_1779347976437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369495;
     Object term371723;

    public DurationFormatUtils_format_1779347976437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term370439 = new StringBuffer();
        StringBuffer term370611 = new StringBuffer();
        StringBuffer term370897 = new StringBuffer();
        StringBuilder term371071 = new StringBuilder();
        term369495 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term370039 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term370153 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term370267 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term370381 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term370553 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term370725 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term369761 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term370839 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371011 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term370039, term370039.getClass(), "value", null);
        setIntField(term370039, term370039.getClass(), "count", 0);
        setElement(term369495, 0, term370039);
        setField(term370153, term370153.getClass(), "value", null);
        setIntField(term370153, term370153.getClass(), "count", 0);
        setElement(term369495, 1, term370153);
        setField(term370267, term370267.getClass(), "value", null);
        setIntField(term370267, term370267.getClass(), "count", 0);
        setElement(term369495, 2, term370267);
        setField(term370381, term370381.getClass(), "value", term370439);
        setIntField(term370381, term370381.getClass(), "count", 0);
        setElement(term369495, 3, term370381);
        setField(term370553, term370553.getClass(), "value", term370611);
        setIntField(term370553, term370553.getClass(), "count", 0);
        setElement(term369495, 4, term370553);
        setField(term370725, term370725.getClass(), "value", term369761);
        setIntField(term370725, term370725.getClass(), "count", 0);
        setElement(term369495, 5, term370725);
        setField(term370839, term370839.getClass(), "value", term370897);
        setIntField(term370839, term370839.getClass(), "count", 0);
        setElement(term369495, 6, term370839);
        setField(term371011, term371011.getClass(), "value", term371071);
        setIntField(term371011, term371011.getClass(), "count", 0);
        setElement(term369495, 7, term371011);
        term371723 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term371724 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371725 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371726 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371727 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371728 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term371731 = (byte[]) newByteArray(16);
        Object term371732 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371733 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term371736 = (byte[]) newByteArray(16);
        Object term371737 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term371738 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term371739 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371740 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term371743 = (byte[]) newByteArray(16);
        Object term371744 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term371745 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term371746 = (byte[]) newByteArray(16);
        setField(term371724, term371724.getClass(), "value", null);
        setIntField(term371724, term371724.getClass(), "count", 0);
        setElement(term371723, 0, term371724);
        setField(term371725, term371725.getClass(), "value", null);
        setIntField(term371725, term371725.getClass(), "count", 0);
        setElement(term371723, 1, term371725);
        setField(term371726, term371726.getClass(), "value", null);
        setIntField(term371726, term371726.getClass(), "count", 0);
        setElement(term371723, 2, term371726);
        setField(term371728, term371728.getClass(), "toStringCache", "");
        setField(term371728, term371728.getClass(), "value", term371731);
        setByteField(term371728, term371728.getClass(), "coder", (byte) 0);
        setIntField(term371728, term371728.getClass(), "count", 0);
        setField(term371727, term371727.getClass(), "value", term371728);
        setIntField(term371727, term371727.getClass(), "count", 0);
        setElement(term371723, 3, term371727);
        setField(term371733, term371733.getClass(), "toStringCache", "");
        setField(term371733, term371733.getClass(), "value", term371736);
        setByteField(term371733, term371733.getClass(), "coder", (byte) 0);
        setIntField(term371733, term371733.getClass(), "count", 0);
        setField(term371732, term371732.getClass(), "value", term371733);
        setIntField(term371732, term371732.getClass(), "count", 0);
        setElement(term371723, 4, term371732);
        setField(term371737, term371737.getClass(), "value", term371738);
        setIntField(term371737, term371737.getClass(), "count", 0);
        setElement(term371723, 5, term371737);
        setField(term371740, term371740.getClass(), "toStringCache", "");
        setField(term371740, term371740.getClass(), "value", term371743);
        setByteField(term371740, term371740.getClass(), "coder", (byte) 0);
        setIntField(term371740, term371740.getClass(), "count", 0);
        setField(term371739, term371739.getClass(), "value", term371740);
        setIntField(term371739, term371739.getClass(), "count", 0);
        setElement(term371723, 6, term371739);
        setField(term371745, term371745.getClass(), "value", term371746);
        setByteField(term371745, term371745.getClass(), "coder", (byte) 0);
        setIntField(term371745, term371745.getClass(), "count", 0);
        setField(term371744, term371744.getClass(), "value", term371745);
        setIntField(term371744, term371744.getClass(), "count", 0);
        setElement(term371723, 7, term371744);
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
        args[0] = term369495;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term369495, term371723));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


