package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_trim_1228498113380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204319;
     Object term208077;
     Object term208043;

    public StrBuilder_trim_1228498113380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204319 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term204128 = (char[]) newCharArray(26);
        setIntField(term204319, term204319.getClass(), "size", 10);
        setField(term204319, term204319.getClass(), "buffer", term204128);
        term208077 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term208078 = (char[]) newCharArray(26);
        setField(term208077, term208077.getClass(), "buffer", term208078);
        setIntField(term208077, term208077.getClass(), "size", 0);
        setField(term208077, term208077.getClass(), "newLine", null);
        setField(term208077, term208077.getClass(), "nullText", null);
        term208043 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term208044 = (char[]) newCharArray(26);
        setField(term208043, term208043.getClass(), "buffer", term208044);
        setIntField(term208043, term208043.getClass(), "size", 0);
        setField(term208043, term208043.getClass(), "newLine", null);
        setField(term208043, term208043.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term204319, args);
        assertTrue(recursiveEquals(term204319, term208077));
        assertTrue(recursiveEquals(retValue, term208043));
    }

};


