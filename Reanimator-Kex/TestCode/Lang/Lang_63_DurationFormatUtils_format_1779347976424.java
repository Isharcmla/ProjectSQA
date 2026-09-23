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

public class DurationFormatUtils_format_1779347976424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353797;
     Object term357712;

    public DurationFormatUtils_format_1779347976424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term355148 = new StringBuffer();
        StringBuffer term355320 = new StringBuffer();
        StringBuffer term355492 = new StringBuffer();
        StringBuffer term355664 = new StringBuffer();
        term353797 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term355090 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term355262 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term355434 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term355606 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term355778 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term355892 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term355994 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term356108 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term355090, term355090.getClass(), "value", term355148);
        setIntField(term355090, term355090.getClass(), "count", 0);
        setElement(term353797, 0, term355090);
        setField(term355262, term355262.getClass(), "value", term355320);
        setIntField(term355262, term355262.getClass(), "count", 0);
        setElement(term353797, 1, term355262);
        setField(term355434, term355434.getClass(), "value", term355492);
        setIntField(term355434, term355434.getClass(), "count", 0);
        setElement(term353797, 2, term355434);
        setField(term355606, term355606.getClass(), "value", term355664);
        setIntField(term355606, term355606.getClass(), "count", 0);
        setElement(term353797, 3, term355606);
        setField(term355778, term355778.getClass(), "value", term355492);
        setIntField(term355778, term355778.getClass(), "count", 0);
        setElement(term353797, 4, term355778);
        setField(term355892, term355892.getClass(), "value", term355994);
        setIntField(term355892, term355892.getClass(), "count", 0);
        setElement(term353797, 5, term355892);
        setField(term356108, term356108.getClass(), "value", null);
        setIntField(term356108, term356108.getClass(), "count", 0);
        setElement(term353797, 6, term356108);
        term357712 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term357713 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357714 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term357717 = (byte[]) newByteArray(16);
        Object term357718 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357719 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term357722 = (byte[]) newByteArray(16);
        Object term357723 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357724 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term357727 = (byte[]) newByteArray(16);
        Object term357728 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357729 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term357732 = (byte[]) newByteArray(16);
        Object term357733 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357734 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term357735 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term357736 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term357714, term357714.getClass(), "toStringCache", "");
        setField(term357714, term357714.getClass(), "value", term357717);
        setByteField(term357714, term357714.getClass(), "coder", (byte) 0);
        setIntField(term357714, term357714.getClass(), "count", 0);
        setField(term357713, term357713.getClass(), "value", term357714);
        setIntField(term357713, term357713.getClass(), "count", 0);
        setElement(term357712, 0, term357713);
        setField(term357719, term357719.getClass(), "toStringCache", "");
        setField(term357719, term357719.getClass(), "value", term357722);
        setByteField(term357719, term357719.getClass(), "coder", (byte) 0);
        setIntField(term357719, term357719.getClass(), "count", 0);
        setField(term357718, term357718.getClass(), "value", term357719);
        setIntField(term357718, term357718.getClass(), "count", 0);
        setElement(term357712, 1, term357718);
        setField(term357724, term357724.getClass(), "toStringCache", "");
        setField(term357724, term357724.getClass(), "value", term357727);
        setByteField(term357724, term357724.getClass(), "coder", (byte) 0);
        setIntField(term357724, term357724.getClass(), "count", 0);
        setField(term357723, term357723.getClass(), "value", term357724);
        setIntField(term357723, term357723.getClass(), "count", 0);
        setElement(term357712, 2, term357723);
        setField(term357729, term357729.getClass(), "toStringCache", "");
        setField(term357729, term357729.getClass(), "value", term357732);
        setByteField(term357729, term357729.getClass(), "coder", (byte) 0);
        setIntField(term357729, term357729.getClass(), "count", 0);
        setField(term357728, term357728.getClass(), "value", term357729);
        setIntField(term357728, term357728.getClass(), "count", 0);
        setElement(term357712, 3, term357728);
        setField(term357733, term357733.getClass(), "value", term357724);
        setIntField(term357733, term357733.getClass(), "count", 0);
        setElement(term357712, 4, term357733);
        setField(term357734, term357734.getClass(), "value", term357735);
        setIntField(term357734, term357734.getClass(), "count", 0);
        setElement(term357712, 5, term357734);
        setField(term357736, term357736.getClass(), "value", null);
        setIntField(term357736, term357736.getClass(), "count", 0);
        setElement(term357712, 6, term357736);
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
        args[0] = term353797;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term353797, term357712));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


