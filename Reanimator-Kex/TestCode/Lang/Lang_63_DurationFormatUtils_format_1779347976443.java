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

public class DurationFormatUtils_format_1779347976443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374527;
     Object term376168;

    public DurationFormatUtils_format_1779347976443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term375302 = new StringBuffer();
        StringBuffer term375474 = new StringBuffer();
        StringBuffer term375760 = new StringBuffer();
        term374527 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term374902 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375016 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375130 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375244 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375416 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375588 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375702 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term375874 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term375016, term375016.getClass(), "value", null);
        setIntField(term375016, term375016.getClass(), "count", 0);
        setField(term374902, term374902.getClass(), "value", term375016);
        setIntField(term374902, term374902.getClass(), "count", 0);
        setElement(term374527, 0, term374902);
        setField(term375130, term375130.getClass(), "value", null);
        setIntField(term375130, term375130.getClass(), "count", 0);
        setElement(term374527, 1, term375130);
        setField(term375244, term375244.getClass(), "value", term375302);
        setIntField(term375244, term375244.getClass(), "count", 0);
        setElement(term374527, 2, term375244);
        setElement(term374527, 3, term375016);
        setField(term375416, term375416.getClass(), "value", term375474);
        setIntField(term375416, term375416.getClass(), "count", 0);
        setElement(term374527, 4, term375416);
        setField(term375588, term375588.getClass(), "value", null);
        setIntField(term375588, term375588.getClass(), "count", 0);
        setElement(term374527, 5, term375588);
        setField(term375702, term375702.getClass(), "value", term375760);
        setIntField(term375702, term375702.getClass(), "count", 0);
        setElement(term374527, 6, term375702);
        setElement(term374527, 7, term375874);
        term376168 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term376169 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376170 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376171 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376172 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376173 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term376176 = (byte[]) newByteArray(16);
        Object term376177 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376178 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term376181 = (byte[]) newByteArray(16);
        Object term376182 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376183 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term376184 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term376187 = (byte[]) newByteArray(16);
        Object term376188 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term376170, term376170.getClass(), "value", null);
        setIntField(term376170, term376170.getClass(), "count", 0);
        setField(term376169, term376169.getClass(), "value", term376170);
        setIntField(term376169, term376169.getClass(), "count", 0);
        setElement(term376168, 0, term376169);
        setField(term376171, term376171.getClass(), "value", null);
        setIntField(term376171, term376171.getClass(), "count", 0);
        setElement(term376168, 1, term376171);
        setField(term376173, term376173.getClass(), "toStringCache", "");
        setField(term376173, term376173.getClass(), "value", term376176);
        setByteField(term376173, term376173.getClass(), "coder", (byte) 0);
        setIntField(term376173, term376173.getClass(), "count", 0);
        setField(term376172, term376172.getClass(), "value", term376173);
        setIntField(term376172, term376172.getClass(), "count", 0);
        setElement(term376168, 2, term376172);
        setElement(term376168, 3, term376170);
        setField(term376178, term376178.getClass(), "toStringCache", "");
        setField(term376178, term376178.getClass(), "value", term376181);
        setByteField(term376178, term376178.getClass(), "coder", (byte) 0);
        setIntField(term376178, term376178.getClass(), "count", 0);
        setField(term376177, term376177.getClass(), "value", term376178);
        setIntField(term376177, term376177.getClass(), "count", 0);
        setElement(term376168, 4, term376177);
        setField(term376182, term376182.getClass(), "value", null);
        setIntField(term376182, term376182.getClass(), "count", 0);
        setElement(term376168, 5, term376182);
        setField(term376184, term376184.getClass(), "toStringCache", "");
        setField(term376184, term376184.getClass(), "value", term376187);
        setByteField(term376184, term376184.getClass(), "coder", (byte) 0);
        setIntField(term376184, term376184.getClass(), "count", 0);
        setField(term376183, term376183.getClass(), "value", term376184);
        setIntField(term376183, term376183.getClass(), "count", 0);
        setElement(term376168, 6, term376183);
        setField(term376188, term376188.getClass(), "value", null);
        setIntField(term376188, term376188.getClass(), "count", 0);
        setElement(term376168, 7, term376188);
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
        args[0] = term374527;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term374527, term376168));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


