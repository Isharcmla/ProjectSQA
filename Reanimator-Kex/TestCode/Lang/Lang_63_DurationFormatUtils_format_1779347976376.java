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

public class DurationFormatUtils_format_1779347976376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302330;
     Object term305025;

    public DurationFormatUtils_format_1779347976376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term302897 = new StringBuffer();
        StringBuilder term303071 = new StringBuilder();
        StringBuffer term303243 = new StringBuffer();
        StringBuffer term303529 = new StringBuffer();
        StringBuffer term303701 = new StringBuffer();
        term302330 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term302839 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term303011 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term303185 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term303357 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term303471 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term303643 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term303815 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term302839, term302839.getClass(), "value", term302897);
        setIntField(term302839, term302839.getClass(), "count", 0);
        setElement(term302330, 0, term302839);
        setField(term303011, term303011.getClass(), "value", term303071);
        setIntField(term303011, term303011.getClass(), "count", 0);
        setElement(term302330, 1, term303011);
        setField(term303185, term303185.getClass(), "value", term303243);
        setIntField(term303185, term303185.getClass(), "count", 0);
        setElement(term302330, 2, term303185);
        setField(term303357, term303357.getClass(), "value", null);
        setIntField(term303357, term303357.getClass(), "count", 0);
        setElement(term302330, 3, term303357);
        setField(term303471, term303471.getClass(), "value", term303529);
        setIntField(term303471, term303471.getClass(), "count", 0);
        setElement(term302330, 4, term303471);
        setField(term303643, term303643.getClass(), "value", term303701);
        setIntField(term303643, term303643.getClass(), "count", 0);
        setElement(term302330, 5, term303643);
        setField(term303815, term303815.getClass(), "value", term303185);
        setIntField(term303815, term303815.getClass(), "count", 0);
        setElement(term302330, 6, term303815);
        term305025 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term305026 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term305027 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term305030 = (byte[]) newByteArray(16);
        Object term305031 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term305032 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term305033 = (byte[]) newByteArray(16);
        Object term305034 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term305035 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term305038 = (byte[]) newByteArray(16);
        Object term305039 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term305040 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term305041 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term305044 = (byte[]) newByteArray(16);
        Object term305045 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term305046 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term305049 = (byte[]) newByteArray(16);
        Object term305050 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term305027, term305027.getClass(), "toStringCache", "");
        setField(term305027, term305027.getClass(), "value", term305030);
        setByteField(term305027, term305027.getClass(), "coder", (byte) 0);
        setIntField(term305027, term305027.getClass(), "count", 0);
        setField(term305026, term305026.getClass(), "value", term305027);
        setIntField(term305026, term305026.getClass(), "count", 0);
        setElement(term305025, 0, term305026);
        setField(term305032, term305032.getClass(), "value", term305033);
        setByteField(term305032, term305032.getClass(), "coder", (byte) 0);
        setIntField(term305032, term305032.getClass(), "count", 0);
        setField(term305031, term305031.getClass(), "value", term305032);
        setIntField(term305031, term305031.getClass(), "count", 0);
        setElement(term305025, 1, term305031);
        setField(term305035, term305035.getClass(), "toStringCache", "");
        setField(term305035, term305035.getClass(), "value", term305038);
        setByteField(term305035, term305035.getClass(), "coder", (byte) 0);
        setIntField(term305035, term305035.getClass(), "count", 0);
        setField(term305034, term305034.getClass(), "value", term305035);
        setIntField(term305034, term305034.getClass(), "count", 0);
        setElement(term305025, 2, term305034);
        setField(term305039, term305039.getClass(), "value", null);
        setIntField(term305039, term305039.getClass(), "count", 0);
        setElement(term305025, 3, term305039);
        setField(term305041, term305041.getClass(), "toStringCache", "");
        setField(term305041, term305041.getClass(), "value", term305044);
        setByteField(term305041, term305041.getClass(), "coder", (byte) 0);
        setIntField(term305041, term305041.getClass(), "count", 0);
        setField(term305040, term305040.getClass(), "value", term305041);
        setIntField(term305040, term305040.getClass(), "count", 0);
        setElement(term305025, 4, term305040);
        setField(term305046, term305046.getClass(), "toStringCache", "");
        setField(term305046, term305046.getClass(), "value", term305049);
        setByteField(term305046, term305046.getClass(), "coder", (byte) 0);
        setIntField(term305046, term305046.getClass(), "count", 0);
        setField(term305045, term305045.getClass(), "value", term305046);
        setIntField(term305045, term305045.getClass(), "count", 0);
        setElement(term305025, 5, term305045);
        setField(term305050, term305050.getClass(), "value", term305034);
        setIntField(term305050, term305050.getClass(), "count", 0);
        setElement(term305025, 6, term305050);
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
        args[0] = term302330;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term302330, term305025));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


