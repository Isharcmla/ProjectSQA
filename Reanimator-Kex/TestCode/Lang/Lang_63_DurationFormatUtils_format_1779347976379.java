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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305648;
     Object term311833;

    public DurationFormatUtils_format_1779347976379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term310610 = new StringBuilder();
        StringBuffer term310782 = new StringBuffer();
        StringBuffer term311296 = new StringBuffer();
        term305648 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term310550 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term310724 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term310896 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311010 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311124 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311238 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311410 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311512 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term310550, term310550.getClass(), "value", term310610);
        setIntField(term310550, term310550.getClass(), "count", 0);
        setElement(term305648, 0, term310550);
        setField(term310724, term310724.getClass(), "value", term310782);
        setIntField(term310724, term310724.getClass(), "count", 0);
        setElement(term305648, 1, term310724);
        setField(term310896, term310896.getClass(), "value", null);
        setIntField(term310896, term310896.getClass(), "count", 0);
        setElement(term305648, 2, term310896);
        setField(term311010, term311010.getClass(), "value", null);
        setIntField(term311010, term311010.getClass(), "count", 0);
        setElement(term305648, 3, term311010);
        setField(term311124, term311124.getClass(), "value", term310782);
        setIntField(term311124, term311124.getClass(), "count", 0);
        setElement(term305648, 4, term311124);
        setField(term311238, term311238.getClass(), "value", term311296);
        setIntField(term311238, term311238.getClass(), "count", 0);
        setElement(term305648, 5, term311238);
        setField(term311410, term311410.getClass(), "value", term311512);
        setIntField(term311410, term311410.getClass(), "count", 0);
        setElement(term305648, 6, term311410);
        term311833 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term311834 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311835 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term311836 = (byte[]) newByteArray(16);
        Object term311837 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311838 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term311841 = (byte[]) newByteArray(16);
        Object term311842 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311843 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311844 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311845 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311846 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term311849 = (byte[]) newByteArray(16);
        Object term311850 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term311851 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term311835, term311835.getClass(), "value", term311836);
        setByteField(term311835, term311835.getClass(), "coder", (byte) 0);
        setIntField(term311835, term311835.getClass(), "count", 0);
        setField(term311834, term311834.getClass(), "value", term311835);
        setIntField(term311834, term311834.getClass(), "count", 0);
        setElement(term311833, 0, term311834);
        setField(term311838, term311838.getClass(), "toStringCache", "");
        setField(term311838, term311838.getClass(), "value", term311841);
        setByteField(term311838, term311838.getClass(), "coder", (byte) 0);
        setIntField(term311838, term311838.getClass(), "count", 0);
        setField(term311837, term311837.getClass(), "value", term311838);
        setIntField(term311837, term311837.getClass(), "count", 0);
        setElement(term311833, 1, term311837);
        setField(term311842, term311842.getClass(), "value", null);
        setIntField(term311842, term311842.getClass(), "count", 0);
        setElement(term311833, 2, term311842);
        setField(term311843, term311843.getClass(), "value", null);
        setIntField(term311843, term311843.getClass(), "count", 0);
        setElement(term311833, 3, term311843);
        setField(term311844, term311844.getClass(), "value", term311838);
        setIntField(term311844, term311844.getClass(), "count", 0);
        setElement(term311833, 4, term311844);
        setField(term311846, term311846.getClass(), "toStringCache", "");
        setField(term311846, term311846.getClass(), "value", term311849);
        setByteField(term311846, term311846.getClass(), "coder", (byte) 0);
        setIntField(term311846, term311846.getClass(), "count", 0);
        setField(term311845, term311845.getClass(), "value", term311846);
        setIntField(term311845, term311845.getClass(), "count", 0);
        setElement(term311833, 5, term311845);
        setField(term311850, term311850.getClass(), "value", term311851);
        setIntField(term311850, term311850.getClass(), "count", 0);
        setElement(term311833, 6, term311850);
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
        args[0] = term305648;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term305648, term311833));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


