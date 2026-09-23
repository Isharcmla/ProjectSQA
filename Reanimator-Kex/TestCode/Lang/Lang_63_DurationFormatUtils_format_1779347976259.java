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

public class DurationFormatUtils_format_1779347976259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187337;
     Object term188718;

    public DurationFormatUtils_format_1779347976259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term187677 = new StringBuffer();
        StringBuffer term188001 = new StringBuffer();
        StringBuffer term188397 = new StringBuffer();
        term187337 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term187619 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term187791 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term187943 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188115 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188225 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term188339 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term187619, term187619.getClass(), "value", term187677);
        setIntField(term187619, term187619.getClass(), "count", 0);
        setElement(term187337, 0, term187619);
        setField(term187791, term187791.getClass(), "value", "");
        setIntField(term187791, term187791.getClass(), "count", 0);
        setElement(term187337, 1, term187791);
        setField(term187943, term187943.getClass(), "value", term188001);
        setIntField(term187943, term187943.getClass(), "count", 0);
        setElement(term187337, 2, term187943);
        setField(term188115, term188115.getClass(), "value", term188225);
        setIntField(term188115, term188115.getClass(), "count", 0);
        setElement(term187337, 3, term188115);
        setField(term188339, term188339.getClass(), "value", term188397);
        setIntField(term188339, term188339.getClass(), "count", 0);
        setElement(term187337, 4, term188339);
        term188718 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term188719 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188720 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term188723 = (byte[]) newByteArray(16);
        Object term188724 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188727 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188728 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term188731 = (byte[]) newByteArray(16);
        Object term188732 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188733 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term188734 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term188735 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term188738 = (byte[]) newByteArray(16);
        setField(term188720, term188720.getClass(), "toStringCache", "");
        setField(term188720, term188720.getClass(), "value", term188723);
        setByteField(term188720, term188720.getClass(), "coder", (byte) 0);
        setIntField(term188720, term188720.getClass(), "count", 0);
        setField(term188719, term188719.getClass(), "value", term188720);
        setIntField(term188719, term188719.getClass(), "count", 0);
        setElement(term188718, 0, term188719);
        setField(term188724, term188724.getClass(), "value", "");
        setIntField(term188724, term188724.getClass(), "count", 0);
        setElement(term188718, 1, term188724);
        setField(term188728, term188728.getClass(), "toStringCache", "");
        setField(term188728, term188728.getClass(), "value", term188731);
        setByteField(term188728, term188728.getClass(), "coder", (byte) 0);
        setIntField(term188728, term188728.getClass(), "count", 0);
        setField(term188727, term188727.getClass(), "value", term188728);
        setIntField(term188727, term188727.getClass(), "count", 0);
        setElement(term188718, 2, term188727);
        setField(term188732, term188732.getClass(), "value", term188733);
        setIntField(term188732, term188732.getClass(), "count", 0);
        setElement(term188718, 3, term188732);
        setField(term188735, term188735.getClass(), "toStringCache", "");
        setField(term188735, term188735.getClass(), "value", term188738);
        setByteField(term188735, term188735.getClass(), "coder", (byte) 0);
        setIntField(term188735, term188735.getClass(), "count", 0);
        setField(term188734, term188734.getClass(), "value", term188735);
        setIntField(term188734, term188734.getClass(), "count", 0);
        setElement(term188718, 4, term188734);
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
        args[0] = term187337;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term187337, term188718));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


