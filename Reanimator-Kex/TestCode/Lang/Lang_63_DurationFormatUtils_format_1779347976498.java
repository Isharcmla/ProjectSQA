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

public class DurationFormatUtils_format_1779347976498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420091;
     Object term423586;

    public DurationFormatUtils_format_1779347976498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term420903 = new StringBuffer();
        StringBuffer term421299 = new StringBuffer();
        StringBuffer term421471 = new StringBuffer();
        term420091 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term420845 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term421017 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term421127 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term421241 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term421413 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term421585 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term420845, term420845.getClass(), "value", term420903);
        setIntField(term420845, term420845.getClass(), "count", 0);
        setElement(term420091, 0, term420845);
        setField(term421017, term421017.getClass(), "value", term421127);
        setIntField(term421017, term421017.getClass(), "count", 0);
        setElement(term420091, 1, term421017);
        setField(term421241, term421241.getClass(), "value", term421299);
        setIntField(term421241, term421241.getClass(), "count", 0);
        setElement(term420091, 2, term421241);
        setElement(term420091, 3, term421241);
        setField(term421413, term421413.getClass(), "value", term421471);
        setIntField(term421413, term421413.getClass(), "count", 0);
        setElement(term420091, 4, term421413);
        setField(term421585, term421585.getClass(), "value", null);
        setIntField(term421585, term421585.getClass(), "count", 0);
        setElement(term420091, 5, term421585);
        term423586 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term423587 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423588 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term423591 = (byte[]) newByteArray(16);
        Object term423592 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423593 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term423594 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423595 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term423598 = (byte[]) newByteArray(16);
        Object term423599 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423600 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term423603 = (byte[]) newByteArray(16);
        Object term423604 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term423588, term423588.getClass(), "toStringCache", "");
        setField(term423588, term423588.getClass(), "value", term423591);
        setByteField(term423588, term423588.getClass(), "coder", (byte) 0);
        setIntField(term423588, term423588.getClass(), "count", 0);
        setField(term423587, term423587.getClass(), "value", term423588);
        setIntField(term423587, term423587.getClass(), "count", 0);
        setElement(term423586, 0, term423587);
        setField(term423592, term423592.getClass(), "value", term423593);
        setIntField(term423592, term423592.getClass(), "count", 0);
        setElement(term423586, 1, term423592);
        setField(term423595, term423595.getClass(), "toStringCache", "");
        setField(term423595, term423595.getClass(), "value", term423598);
        setByteField(term423595, term423595.getClass(), "coder", (byte) 0);
        setIntField(term423595, term423595.getClass(), "count", 0);
        setField(term423594, term423594.getClass(), "value", term423595);
        setIntField(term423594, term423594.getClass(), "count", 0);
        setElement(term423586, 2, term423594);
        setElement(term423586, 3, term423594);
        setField(term423600, term423600.getClass(), "toStringCache", "");
        setField(term423600, term423600.getClass(), "value", term423603);
        setByteField(term423600, term423600.getClass(), "coder", (byte) 0);
        setIntField(term423600, term423600.getClass(), "count", 0);
        setField(term423599, term423599.getClass(), "value", term423600);
        setIntField(term423599, term423599.getClass(), "count", 0);
        setElement(term423586, 4, term423599);
        setField(term423604, term423604.getClass(), "value", null);
        setIntField(term423604, term423604.getClass(), "count", 0);
        setElement(term423586, 5, term423604);
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
        args[0] = term420091;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term420091, term423586));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


