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

public class DurationFormatUtils_format_1779347976360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278202;
     Object term282839;

    public DurationFormatUtils_format_1779347976360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term279356 = new StringBuffer();
        StringBuffer term279528 = new StringBuffer();
        term278202 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term278732 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term278842 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term278956 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term278484 = (char[]) newCharArray(0);
        Object term279070 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term279184 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term279298 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term279470 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term279642 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term279744 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term278732, term278732.getClass(), "value", term278842);
        setIntField(term278732, term278732.getClass(), "count", 0);
        setElement(term278202, 0, term278732);
        setField(term278956, term278956.getClass(), "value", term278484);
        setIntField(term278956, term278956.getClass(), "count", 0);
        setElement(term278202, 1, term278956);
        setField(term279070, term279070.getClass(), "value", term279070);
        setIntField(term279070, term279070.getClass(), "count", 0);
        setElement(term278202, 2, term279070);
        setField(term279184, term279184.getClass(), "value", term279184);
        setIntField(term279184, term279184.getClass(), "count", 0);
        setElement(term278202, 3, term279184);
        setField(term279298, term279298.getClass(), "value", term279356);
        setIntField(term279298, term279298.getClass(), "count", 0);
        setElement(term278202, 4, term279298);
        setField(term279470, term279470.getClass(), "value", term279528);
        setIntField(term279470, term279470.getClass(), "count", 0);
        setElement(term278202, 5, term279470);
        setField(term279642, term279642.getClass(), "value", term279744);
        setIntField(term279642, term279642.getClass(), "count", 0);
        setElement(term278202, 6, term279642);
        term282839 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term282840 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282841 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term282842 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term282843 = (char[]) newCharArray(0);
        Object term282844 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282845 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282846 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282847 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term282850 = (byte[]) newByteArray(16);
        Object term282851 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282852 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term282855 = (byte[]) newByteArray(16);
        Object term282856 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282857 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term282840, term282840.getClass(), "value", term282841);
        setIntField(term282840, term282840.getClass(), "count", 0);
        setElement(term282839, 0, term282840);
        setField(term282842, term282842.getClass(), "value", term282843);
        setIntField(term282842, term282842.getClass(), "count", 0);
        setElement(term282839, 1, term282842);
        setField(term282844, term282844.getClass(), "value", term282844);
        setIntField(term282844, term282844.getClass(), "count", 0);
        setElement(term282839, 2, term282844);
        setField(term282845, term282845.getClass(), "value", term282845);
        setIntField(term282845, term282845.getClass(), "count", 0);
        setElement(term282839, 3, term282845);
        setField(term282847, term282847.getClass(), "toStringCache", "");
        setField(term282847, term282847.getClass(), "value", term282850);
        setByteField(term282847, term282847.getClass(), "coder", (byte) 0);
        setIntField(term282847, term282847.getClass(), "count", 0);
        setField(term282846, term282846.getClass(), "value", term282847);
        setIntField(term282846, term282846.getClass(), "count", 0);
        setElement(term282839, 4, term282846);
        setField(term282852, term282852.getClass(), "toStringCache", "");
        setField(term282852, term282852.getClass(), "value", term282855);
        setByteField(term282852, term282852.getClass(), "coder", (byte) 0);
        setIntField(term282852, term282852.getClass(), "count", 0);
        setField(term282851, term282851.getClass(), "value", term282852);
        setIntField(term282851, term282851.getClass(), "count", 0);
        setElement(term282839, 5, term282851);
        setField(term282856, term282856.getClass(), "value", term282857);
        setIntField(term282856, term282856.getClass(), "count", 0);
        setElement(term282839, 6, term282856);
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
        args[0] = term278202;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term278202, term282839));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


