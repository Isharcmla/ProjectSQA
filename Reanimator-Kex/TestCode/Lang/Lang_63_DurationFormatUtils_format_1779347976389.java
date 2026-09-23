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
import java.lang.NullPointerException;
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316648;

    public DurationFormatUtils_format_1779347976389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term317466 = new StringBuffer();
        StringBuffer term317854 = new StringBuffer();
        StringBuffer term318364 = new StringBuffer();
        term316648 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 22);
        Object term317408 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term317580 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term317682 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term317796 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term317968 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term318082 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term318192 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term318306 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term317408, term317408.getClass(), "value", term317466);
        setIntField(term317408, term317408.getClass(), "count", 0);
        setElement(term316648, 0, term317408);
        setField(term317580, term317580.getClass(), "value", term317682);
        setIntField(term317580, term317580.getClass(), "count", 0);
        setElement(term316648, 1, term317580);
        setField(term317796, term317796.getClass(), "value", term317854);
        setIntField(term317796, term317796.getClass(), "count", 0);
        setElement(term316648, 2, term317796);
        setField(term317968, term317968.getClass(), "value", term317466);
        setIntField(term317968, term317968.getClass(), "count", 0);
        setElement(term316648, 3, term317968);
        setField(term318082, term318082.getClass(), "value", term318192);
        setIntField(term318082, term318082.getClass(), "count", 0);
        setElement(term316648, 4, term318082);
        setField(term318306, term318306.getClass(), "value", term318364);
        setIntField(term318306, term318306.getClass(), "count", 0);
        setElement(term316648, 5, term318306);
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
        args[0] = term316648;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        try {
            callMethod(klass, "format", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


