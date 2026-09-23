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

public class DurationFormatUtils_format_1779347976450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379288;
     Object term382683;

    public DurationFormatUtils_format_1779347976450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term379961 = new StringBuffer();
        StringBuffer term380133 = new StringBuffer();
        term379288 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term379561 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term379675 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term379789 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term379903 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380075 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380247 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term380349 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term379561, term379561.getClass(), "value", null);
        setIntField(term379561, term379561.getClass(), "count", 0);
        setElement(term379288, 0, term379561);
        setField(term379675, term379675.getClass(), "value", null);
        setIntField(term379675, term379675.getClass(), "count", 0);
        setElement(term379288, 1, term379675);
        setField(term379789, term379789.getClass(), "value", null);
        setIntField(term379789, term379789.getClass(), "count", 0);
        setElement(term379288, 2, term379789);
        setField(term379903, term379903.getClass(), "value", term379961);
        setIntField(term379903, term379903.getClass(), "count", 0);
        setElement(term379288, 3, term379903);
        setField(term380075, term380075.getClass(), "value", term380133);
        setIntField(term380075, term380075.getClass(), "count", 0);
        setElement(term379288, 4, term380075);
        setField(term380247, term380247.getClass(), "value", term380349);
        setIntField(term380247, term380247.getClass(), "count", 0);
        setElement(term379288, 5, term380247);
        setElement(term379288, 6, term380075);
        term382683 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term382684 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382685 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382686 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382687 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382688 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term382691 = (byte[]) newByteArray(16);
        Object term382692 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382693 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term382696 = (byte[]) newByteArray(16);
        Object term382697 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382698 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term382684, term382684.getClass(), "value", null);
        setIntField(term382684, term382684.getClass(), "count", 0);
        setElement(term382683, 0, term382684);
        setField(term382685, term382685.getClass(), "value", null);
        setIntField(term382685, term382685.getClass(), "count", 0);
        setElement(term382683, 1, term382685);
        setField(term382686, term382686.getClass(), "value", null);
        setIntField(term382686, term382686.getClass(), "count", 0);
        setElement(term382683, 2, term382686);
        setField(term382688, term382688.getClass(), "toStringCache", "");
        setField(term382688, term382688.getClass(), "value", term382691);
        setByteField(term382688, term382688.getClass(), "coder", (byte) 0);
        setIntField(term382688, term382688.getClass(), "count", 0);
        setField(term382687, term382687.getClass(), "value", term382688);
        setIntField(term382687, term382687.getClass(), "count", 0);
        setElement(term382683, 3, term382687);
        setField(term382693, term382693.getClass(), "toStringCache", "");
        setField(term382693, term382693.getClass(), "value", term382696);
        setByteField(term382693, term382693.getClass(), "coder", (byte) 0);
        setIntField(term382693, term382693.getClass(), "count", 0);
        setField(term382692, term382692.getClass(), "value", term382693);
        setIntField(term382692, term382692.getClass(), "count", 0);
        setElement(term382683, 4, term382692);
        setField(term382697, term382697.getClass(), "value", term382698);
        setIntField(term382697, term382697.getClass(), "count", 0);
        setElement(term382683, 5, term382697);
        setElement(term382683, 6, term382692);
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
        args[0] = term379288;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term379288, term382683));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


