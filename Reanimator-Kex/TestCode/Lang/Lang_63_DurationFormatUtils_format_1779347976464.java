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

public class DurationFormatUtils_format_1779347976464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392898;
     Object term396473;

    public DurationFormatUtils_format_1779347976464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term393766 = new StringBuffer();
        term392898 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term393708 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term393880 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term393994 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term394108 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term394218 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term394332 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term394446 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term394560 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term394712 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term393708, term393708.getClass(), "value", term393766);
        setIntField(term393708, term393708.getClass(), "count", 0);
        setElement(term392898, 0, term393708);
        setField(term393880, term393880.getClass(), "value", term392898);
        setIntField(term393880, term393880.getClass(), "count", 0);
        setElement(term392898, 1, term393880);
        setField(term393994, term393994.getClass(), "value", null);
        setIntField(term393994, term393994.getClass(), "count", 0);
        setElement(term392898, 2, term393994);
        setField(term394108, term394108.getClass(), "value", term394218);
        setIntField(term394108, term394108.getClass(), "count", 0);
        setElement(term392898, 3, term394108);
        setField(term394332, term394332.getClass(), "value", null);
        setIntField(term394332, term394332.getClass(), "count", 0);
        setElement(term392898, 4, term394332);
        setField(term394446, term394446.getClass(), "value", null);
        setIntField(term394446, term394446.getClass(), "count", 0);
        setElement(term392898, 5, term394446);
        setField(term394560, term394560.getClass(), "value", "");
        setIntField(term394560, term394560.getClass(), "count", 0);
        setElement(term392898, 6, term394560);
        setElement(term392898, 7, term394712);
        term396473 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term396474 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396475 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term396478 = (byte[]) newByteArray(16);
        Object term396479 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term396480 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term396481 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396482 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396483 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term396484 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396485 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396486 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396488 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term396475, term396475.getClass(), "toStringCache", "");
        setField(term396475, term396475.getClass(), "value", term396478);
        setByteField(term396475, term396475.getClass(), "coder", (byte) 0);
        setIntField(term396475, term396475.getClass(), "count", 0);
        setField(term396474, term396474.getClass(), "value", term396475);
        setIntField(term396474, term396474.getClass(), "count", 0);
        setElement(term396473, 0, term396474);
        setElement(term396480, 0, term396474);
        setElement(term396480, 1, term396479);
        setField(term396481, term396481.getClass(), "value", null);
        setIntField(term396481, term396481.getClass(), "count", 0);
        setElement(term396480, 2, term396481);
        setField(term396482, term396482.getClass(), "value", term396483);
        setIntField(term396482, term396482.getClass(), "count", 0);
        setElement(term396480, 3, term396482);
        setField(term396484, term396484.getClass(), "value", null);
        setIntField(term396484, term396484.getClass(), "count", 0);
        setElement(term396480, 4, term396484);
        setField(term396485, term396485.getClass(), "value", null);
        setIntField(term396485, term396485.getClass(), "count", 0);
        setElement(term396480, 5, term396485);
        setField(term396486, term396486.getClass(), "value", "");
        setIntField(term396486, term396486.getClass(), "count", 0);
        setElement(term396480, 6, term396486);
        setField(term396488, term396488.getClass(), "value", null);
        setIntField(term396488, term396488.getClass(), "count", 0);
        setElement(term396480, 7, term396488);
        setField(term396479, term396479.getClass(), "value", term396480);
        setIntField(term396479, term396479.getClass(), "count", 0);
        setElement(term396473, 1, term396479);
        setElement(term396473, 2, term396481);
        setElement(term396473, 3, term396482);
        setElement(term396473, 4, term396484);
        setElement(term396473, 5, term396485);
        setElement(term396473, 6, term396486);
        setElement(term396473, 7, term396488);
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
        args[0] = term392898;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term392898, term396473));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


