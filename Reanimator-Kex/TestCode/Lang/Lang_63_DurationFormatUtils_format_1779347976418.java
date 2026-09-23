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

public class DurationFormatUtils_format_1779347976418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348866;
     Object term351698;

    public DurationFormatUtils_format_1779347976418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term349265 = new StringBuffer();
        StringBuffer term349437 = new StringBuffer();
        StringBuffer term349609 = new StringBuffer();
        StringBuffer term349781 = new StringBuffer();
        term348866 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term349207 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term349379 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term349551 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term349723 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term349895 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term349003 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term350009 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term349207, term349207.getClass(), "value", term349265);
        setIntField(term349207, term349207.getClass(), "count", 0);
        setElement(term348866, 0, term349207);
        setField(term349379, term349379.getClass(), "value", term349437);
        setIntField(term349379, term349379.getClass(), "count", 0);
        setElement(term348866, 1, term349379);
        setField(term349551, term349551.getClass(), "value", term349609);
        setIntField(term349551, term349551.getClass(), "count", 0);
        setElement(term348866, 2, term349551);
        setField(term349723, term349723.getClass(), "value", term349781);
        setIntField(term349723, term349723.getClass(), "count", 0);
        setElement(term348866, 3, term349723);
        setElement(term348866, 4, term349379);
        setField(term349895, term349895.getClass(), "value", term349003);
        setIntField(term349895, term349895.getClass(), "count", 0);
        setElement(term348866, 5, term349895);
        setElement(term348866, 6, term350009);
        term351698 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term351699 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term351700 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term351703 = (byte[]) newByteArray(16);
        Object term351704 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term351705 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term351708 = (byte[]) newByteArray(16);
        Object term351709 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term351710 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term351713 = (byte[]) newByteArray(16);
        Object term351714 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term351715 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term351718 = (byte[]) newByteArray(16);
        Object term351719 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term351720 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term351721 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term351700, term351700.getClass(), "toStringCache", "");
        setField(term351700, term351700.getClass(), "value", term351703);
        setByteField(term351700, term351700.getClass(), "coder", (byte) 0);
        setIntField(term351700, term351700.getClass(), "count", 0);
        setField(term351699, term351699.getClass(), "value", term351700);
        setIntField(term351699, term351699.getClass(), "count", 0);
        setElement(term351698, 0, term351699);
        setField(term351705, term351705.getClass(), "toStringCache", "");
        setField(term351705, term351705.getClass(), "value", term351708);
        setByteField(term351705, term351705.getClass(), "coder", (byte) 0);
        setIntField(term351705, term351705.getClass(), "count", 0);
        setField(term351704, term351704.getClass(), "value", term351705);
        setIntField(term351704, term351704.getClass(), "count", 0);
        setElement(term351698, 1, term351704);
        setField(term351710, term351710.getClass(), "toStringCache", "");
        setField(term351710, term351710.getClass(), "value", term351713);
        setByteField(term351710, term351710.getClass(), "coder", (byte) 0);
        setIntField(term351710, term351710.getClass(), "count", 0);
        setField(term351709, term351709.getClass(), "value", term351710);
        setIntField(term351709, term351709.getClass(), "count", 0);
        setElement(term351698, 2, term351709);
        setField(term351715, term351715.getClass(), "toStringCache", "");
        setField(term351715, term351715.getClass(), "value", term351718);
        setByteField(term351715, term351715.getClass(), "coder", (byte) 0);
        setIntField(term351715, term351715.getClass(), "count", 0);
        setField(term351714, term351714.getClass(), "value", term351715);
        setIntField(term351714, term351714.getClass(), "count", 0);
        setElement(term351698, 3, term351714);
        setElement(term351698, 4, term351704);
        setField(term351719, term351719.getClass(), "value", term351720);
        setIntField(term351719, term351719.getClass(), "count", 0);
        setElement(term351698, 5, term351719);
        setField(term351721, term351721.getClass(), "value", null);
        setIntField(term351721, term351721.getClass(), "count", 0);
        setElement(term351698, 6, term351721);
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
        args[0] = term348866;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term348866, term351698));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


