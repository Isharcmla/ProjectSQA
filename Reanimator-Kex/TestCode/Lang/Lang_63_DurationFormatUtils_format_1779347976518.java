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

public class DurationFormatUtils_format_1779347976518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437531;
     Object term443450;

    public DurationFormatUtils_format_1779347976518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term438341 = new StringBuffer();
        StringBuffer term438741 = new StringBuffer();
        StringBuffer term438913 = new StringBuffer();
        term437531 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term438283 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term438455 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term437549 = (char[]) newCharArray(236);
        Object term438569 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term438683 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term438855 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term439027 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term438034 = (char[]) newCharArray(0);
        Object term439141 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term439255 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term438028 = (char[]) newCharArray(0);
        setField(term438283, term438283.getClass(), "value", term438341);
        setIntField(term438283, term438283.getClass(), "count", 0);
        setElement(term437531, 0, term438283);
        setField(term438455, term438455.getClass(), "value", term437549);
        setIntField(term438455, term438455.getClass(), "count", 0);
        setElement(term437531, 1, term438455);
        setField(term438569, term438569.getClass(), "value", term438341);
        setIntField(term438569, term438569.getClass(), "count", 0);
        setElement(term437531, 2, term438569);
        setField(term438683, term438683.getClass(), "value", term438741);
        setIntField(term438683, term438683.getClass(), "count", 0);
        setElement(term437531, 3, term438683);
        setField(term438855, term438855.getClass(), "value", term438913);
        setIntField(term438855, term438855.getClass(), "count", 0);
        setElement(term437531, 4, term438855);
        setField(term439027, term439027.getClass(), "value", term438034);
        setIntField(term439027, term439027.getClass(), "count", 0);
        setElement(term437531, 5, term439027);
        setField(term439141, term439141.getClass(), "value", null);
        setIntField(term439141, term439141.getClass(), "count", 0);
        setElement(term437531, 6, term439141);
        setField(term439255, term439255.getClass(), "value", term438028);
        setIntField(term439255, term439255.getClass(), "count", 0);
        setElement(term437531, 7, term439255);
        term443450 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term443451 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term443452 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term443455 = (byte[]) newByteArray(16);
        Object term443456 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term443457 = (char[]) newCharArray(236);
        Object term443458 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term443459 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term443460 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term443463 = (byte[]) newByteArray(16);
        Object term443464 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term443465 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term443468 = (byte[]) newByteArray(16);
        Object term443469 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term443470 = (char[]) newCharArray(0);
        Object term443471 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term443472 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term443473 = (char[]) newCharArray(0);
        setField(term443452, term443452.getClass(), "toStringCache", "");
        setField(term443452, term443452.getClass(), "value", term443455);
        setByteField(term443452, term443452.getClass(), "coder", (byte) 0);
        setIntField(term443452, term443452.getClass(), "count", 0);
        setField(term443451, term443451.getClass(), "value", term443452);
        setIntField(term443451, term443451.getClass(), "count", 0);
        setElement(term443450, 0, term443451);
        setField(term443456, term443456.getClass(), "value", term443457);
        setIntField(term443456, term443456.getClass(), "count", 0);
        setElement(term443450, 1, term443456);
        setField(term443458, term443458.getClass(), "value", term443452);
        setIntField(term443458, term443458.getClass(), "count", 0);
        setElement(term443450, 2, term443458);
        setField(term443460, term443460.getClass(), "toStringCache", "");
        setField(term443460, term443460.getClass(), "value", term443463);
        setByteField(term443460, term443460.getClass(), "coder", (byte) 0);
        setIntField(term443460, term443460.getClass(), "count", 0);
        setField(term443459, term443459.getClass(), "value", term443460);
        setIntField(term443459, term443459.getClass(), "count", 0);
        setElement(term443450, 3, term443459);
        setField(term443465, term443465.getClass(), "toStringCache", "");
        setField(term443465, term443465.getClass(), "value", term443468);
        setByteField(term443465, term443465.getClass(), "coder", (byte) 0);
        setIntField(term443465, term443465.getClass(), "count", 0);
        setField(term443464, term443464.getClass(), "value", term443465);
        setIntField(term443464, term443464.getClass(), "count", 0);
        setElement(term443450, 4, term443464);
        setField(term443469, term443469.getClass(), "value", term443470);
        setIntField(term443469, term443469.getClass(), "count", 0);
        setElement(term443450, 5, term443469);
        setField(term443471, term443471.getClass(), "value", null);
        setIntField(term443471, term443471.getClass(), "count", 0);
        setElement(term443450, 6, term443471);
        setField(term443472, term443472.getClass(), "value", term443473);
        setIntField(term443472, term443472.getClass(), "count", 0);
        setElement(term443450, 7, term443472);
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
        args[0] = term437531;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term437531, term443450));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


