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

public class DurationFormatUtils_format_1779347976309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229107;
     Object term231255;

    public DurationFormatUtils_format_1779347976309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term229449 = new StringBuffer();
        StringBuffer term229621 = new StringBuffer();
        StringBuffer term229793 = new StringBuffer();
        StringBuffer term229965 = new StringBuffer();
        StringBuffer term230137 = new StringBuffer();
        StringBuilder term230311 = new StringBuilder();
        term229107 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term229391 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term229563 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term229735 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term229907 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230079 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term230251 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term229391, term229391.getClass(), "value", term229449);
        setIntField(term229391, term229391.getClass(), "count", 0);
        setElement(term229107, 0, term229391);
        setField(term229563, term229563.getClass(), "value", term229621);
        setIntField(term229563, term229563.getClass(), "count", 0);
        setElement(term229107, 1, term229563);
        setField(term229735, term229735.getClass(), "value", term229793);
        setIntField(term229735, term229735.getClass(), "count", 0);
        setElement(term229107, 2, term229735);
        setField(term229907, term229907.getClass(), "value", term229965);
        setIntField(term229907, term229907.getClass(), "count", 0);
        setElement(term229107, 3, term229907);
        setField(term230079, term230079.getClass(), "value", term230137);
        setIntField(term230079, term230079.getClass(), "count", 0);
        setElement(term229107, 4, term230079);
        setField(term230251, term230251.getClass(), "value", term230311);
        setIntField(term230251, term230251.getClass(), "count", 0);
        setElement(term229107, 5, term230251);
        term231255 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term231256 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231257 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term231260 = (byte[]) newByteArray(16);
        Object term231261 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231262 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term231265 = (byte[]) newByteArray(16);
        Object term231266 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231267 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term231270 = (byte[]) newByteArray(16);
        Object term231271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231272 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term231275 = (byte[]) newByteArray(16);
        Object term231276 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231277 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term231280 = (byte[]) newByteArray(16);
        Object term231281 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term231282 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term231283 = (byte[]) newByteArray(16);
        setField(term231257, term231257.getClass(), "toStringCache", "");
        setField(term231257, term231257.getClass(), "value", term231260);
        setByteField(term231257, term231257.getClass(), "coder", (byte) 0);
        setIntField(term231257, term231257.getClass(), "count", 0);
        setField(term231256, term231256.getClass(), "value", term231257);
        setIntField(term231256, term231256.getClass(), "count", 0);
        setElement(term231255, 0, term231256);
        setField(term231262, term231262.getClass(), "toStringCache", "");
        setField(term231262, term231262.getClass(), "value", term231265);
        setByteField(term231262, term231262.getClass(), "coder", (byte) 0);
        setIntField(term231262, term231262.getClass(), "count", 0);
        setField(term231261, term231261.getClass(), "value", term231262);
        setIntField(term231261, term231261.getClass(), "count", 0);
        setElement(term231255, 1, term231261);
        setField(term231267, term231267.getClass(), "toStringCache", "");
        setField(term231267, term231267.getClass(), "value", term231270);
        setByteField(term231267, term231267.getClass(), "coder", (byte) 0);
        setIntField(term231267, term231267.getClass(), "count", 0);
        setField(term231266, term231266.getClass(), "value", term231267);
        setIntField(term231266, term231266.getClass(), "count", 0);
        setElement(term231255, 2, term231266);
        setField(term231272, term231272.getClass(), "toStringCache", "");
        setField(term231272, term231272.getClass(), "value", term231275);
        setByteField(term231272, term231272.getClass(), "coder", (byte) 0);
        setIntField(term231272, term231272.getClass(), "count", 0);
        setField(term231271, term231271.getClass(), "value", term231272);
        setIntField(term231271, term231271.getClass(), "count", 0);
        setElement(term231255, 3, term231271);
        setField(term231277, term231277.getClass(), "toStringCache", "");
        setField(term231277, term231277.getClass(), "value", term231280);
        setByteField(term231277, term231277.getClass(), "coder", (byte) 0);
        setIntField(term231277, term231277.getClass(), "count", 0);
        setField(term231276, term231276.getClass(), "value", term231277);
        setIntField(term231276, term231276.getClass(), "count", 0);
        setElement(term231255, 4, term231276);
        setField(term231282, term231282.getClass(), "value", term231283);
        setByteField(term231282, term231282.getClass(), "coder", (byte) 0);
        setIntField(term231282, term231282.getClass(), "count", 0);
        setField(term231281, term231281.getClass(), "value", term231282);
        setIntField(term231281, term231281.getClass(), "count", 0);
        setElement(term231255, 5, term231281);
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
        args[0] = term229107;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term229107, term231255));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


