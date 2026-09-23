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

public class DurationFormatUtils_format_1779347976507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428174;
     Object term430550;

    public DurationFormatUtils_format_1779347976507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term429013 = new StringBuilder();
        StringBuffer term429185 = new StringBuffer();
        StringBuffer term429357 = new StringBuffer();
        StringBuffer term429529 = new StringBuffer();
        term428174 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term428953 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term429127 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term429299 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term429471 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term429643 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term429757 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term429795 = newInstance(Class.forName("java.lang.Object"));
        setField(term428953, term428953.getClass(), "value", term429013);
        setIntField(term428953, term428953.getClass(), "count", 0);
        setElement(term428174, 0, term428953);
        setField(term429127, term429127.getClass(), "value", term429185);
        setIntField(term429127, term429127.getClass(), "count", 0);
        setElement(term428174, 1, term429127);
        setField(term429299, term429299.getClass(), "value", term429357);
        setIntField(term429299, term429299.getClass(), "count", 0);
        setElement(term428174, 2, term429299);
        setField(term429471, term429471.getClass(), "value", term429529);
        setIntField(term429471, term429471.getClass(), "count", 0);
        setElement(term428174, 3, term429471);
        setField(term429643, term429643.getClass(), "value", null);
        setIntField(term429643, term429643.getClass(), "count", 0);
        setElement(term428174, 4, term429643);
        setField(term429757, term429757.getClass(), "value", term429795);
        setIntField(term429757, term429757.getClass(), "count", 0);
        setElement(term428174, 5, term429757);
        term430550 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term430551 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430552 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term430553 = (byte[]) newByteArray(16);
        Object term430554 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430555 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430558 = (byte[]) newByteArray(16);
        Object term430559 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430560 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430563 = (byte[]) newByteArray(16);
        Object term430564 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430565 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term430568 = (byte[]) newByteArray(16);
        Object term430569 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430570 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term430571 = newInstance(Class.forName("java.lang.Object"));
        setField(term430552, term430552.getClass(), "value", term430553);
        setByteField(term430552, term430552.getClass(), "coder", (byte) 0);
        setIntField(term430552, term430552.getClass(), "count", 0);
        setField(term430551, term430551.getClass(), "value", term430552);
        setIntField(term430551, term430551.getClass(), "count", 0);
        setElement(term430550, 0, term430551);
        setField(term430555, term430555.getClass(), "toStringCache", "");
        setField(term430555, term430555.getClass(), "value", term430558);
        setByteField(term430555, term430555.getClass(), "coder", (byte) 0);
        setIntField(term430555, term430555.getClass(), "count", 0);
        setField(term430554, term430554.getClass(), "value", term430555);
        setIntField(term430554, term430554.getClass(), "count", 0);
        setElement(term430550, 1, term430554);
        setField(term430560, term430560.getClass(), "toStringCache", "");
        setField(term430560, term430560.getClass(), "value", term430563);
        setByteField(term430560, term430560.getClass(), "coder", (byte) 0);
        setIntField(term430560, term430560.getClass(), "count", 0);
        setField(term430559, term430559.getClass(), "value", term430560);
        setIntField(term430559, term430559.getClass(), "count", 0);
        setElement(term430550, 2, term430559);
        setField(term430565, term430565.getClass(), "toStringCache", "");
        setField(term430565, term430565.getClass(), "value", term430568);
        setByteField(term430565, term430565.getClass(), "coder", (byte) 0);
        setIntField(term430565, term430565.getClass(), "count", 0);
        setField(term430564, term430564.getClass(), "value", term430565);
        setIntField(term430564, term430564.getClass(), "count", 0);
        setElement(term430550, 3, term430564);
        setField(term430569, term430569.getClass(), "value", null);
        setIntField(term430569, term430569.getClass(), "count", 0);
        setElement(term430550, 4, term430569);
        setField(term430570, term430570.getClass(), "value", term430571);
        setIntField(term430570, term430570.getClass(), "count", 0);
        setElement(term430550, 5, term430570);
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
        args[0] = term428174;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term428174, term430550));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


