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

public class DurationFormatUtils_format_1779347976391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319804;
     Object term322594;

    public DurationFormatUtils_format_1779347976391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term320698 = new StringBuffer();
        StringBuilder term321328 = new StringBuilder();
        term319804 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 10);
        Object term320184 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term320298 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term320412 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term320526 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term320640 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term320812 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term320926 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term321040 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term321154 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term321268 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term321442 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term320184, term320184.getClass(), "value", null);
        setIntField(term320184, term320184.getClass(), "count", 0);
        setElement(term319804, 0, term320184);
        setField(term320298, term320298.getClass(), "value", null);
        setIntField(term320298, term320298.getClass(), "count", 0);
        setElement(term319804, 1, term320298);
        setField(term320412, term320412.getClass(), "value", null);
        setIntField(term320412, term320412.getClass(), "count", 0);
        setElement(term319804, 2, term320412);
        setField(term320526, term320526.getClass(), "value", null);
        setIntField(term320526, term320526.getClass(), "count", 0);
        setElement(term319804, 3, term320526);
        setField(term320640, term320640.getClass(), "value", term320698);
        setIntField(term320640, term320640.getClass(), "count", 0);
        setElement(term319804, 4, term320640);
        setField(term320812, term320812.getClass(), "value", null);
        setIntField(term320812, term320812.getClass(), "count", 0);
        setElement(term319804, 5, term320812);
        setField(term320926, term320926.getClass(), "value", null);
        setIntField(term320926, term320926.getClass(), "count", 0);
        setElement(term319804, 6, term320926);
        setField(term321040, term321040.getClass(), "value", term321154);
        setIntField(term321040, term321040.getClass(), "count", 0);
        setElement(term319804, 7, term321040);
        setField(term321268, term321268.getClass(), "value", term321328);
        setIntField(term321268, term321268.getClass(), "count", 0);
        setElement(term319804, 8, term321268);
        setElement(term319804, 9, term321442);
        term322594 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 10);
        Object term322595 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322596 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322597 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322598 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322599 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322600 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term322603 = (byte[]) newByteArray(16);
        Object term322604 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322605 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322606 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322607 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322608 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term322609 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term322610 = (byte[]) newByteArray(16);
        Object term322611 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term322595, term322595.getClass(), "value", null);
        setIntField(term322595, term322595.getClass(), "count", 0);
        setElement(term322594, 0, term322595);
        setField(term322596, term322596.getClass(), "value", null);
        setIntField(term322596, term322596.getClass(), "count", 0);
        setElement(term322594, 1, term322596);
        setField(term322597, term322597.getClass(), "value", null);
        setIntField(term322597, term322597.getClass(), "count", 0);
        setElement(term322594, 2, term322597);
        setField(term322598, term322598.getClass(), "value", null);
        setIntField(term322598, term322598.getClass(), "count", 0);
        setElement(term322594, 3, term322598);
        setField(term322600, term322600.getClass(), "toStringCache", "");
        setField(term322600, term322600.getClass(), "value", term322603);
        setByteField(term322600, term322600.getClass(), "coder", (byte) 0);
        setIntField(term322600, term322600.getClass(), "count", 0);
        setField(term322599, term322599.getClass(), "value", term322600);
        setIntField(term322599, term322599.getClass(), "count", 0);
        setElement(term322594, 4, term322599);
        setField(term322604, term322604.getClass(), "value", null);
        setIntField(term322604, term322604.getClass(), "count", 0);
        setElement(term322594, 5, term322604);
        setField(term322605, term322605.getClass(), "value", null);
        setIntField(term322605, term322605.getClass(), "count", 0);
        setElement(term322594, 6, term322605);
        setField(term322607, term322607.getClass(), "value", null);
        setIntField(term322607, term322607.getClass(), "count", 0);
        setField(term322606, term322606.getClass(), "value", term322607);
        setIntField(term322606, term322606.getClass(), "count", 0);
        setElement(term322594, 7, term322606);
        setField(term322609, term322609.getClass(), "value", term322610);
        setByteField(term322609, term322609.getClass(), "coder", (byte) 0);
        setIntField(term322609, term322609.getClass(), "count", 0);
        setField(term322608, term322608.getClass(), "value", term322609);
        setIntField(term322608, term322608.getClass(), "count", 0);
        setElement(term322594, 8, term322608);
        setField(term322611, term322611.getClass(), "value", null);
        setIntField(term322611, term322611.getClass(), "count", 0);
        setElement(term322594, 9, term322611);
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
        args[0] = term319804;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term319804, term322594));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


