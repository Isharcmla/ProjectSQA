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

public class StrBuilder_replaceAll_1767806868365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200223;
     Object term207308;
     Object term207272;

    public StrBuilder_replaceAll_1767806868365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200223 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term199129 = (char[]) newCharArray(31);
        setIntField(term200223, term200223.getClass(), "size", 25);
        setField(term200223, term200223.getClass(), "buffer", term199129);
        term207308 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term207309 = (char[]) newCharArray(31);
        setField(term207308, term207308.getClass(), "buffer", term207309);
        setIntField(term207308, term207308.getClass(), "size", 25);
        setField(term207308, term207308.getClass(), "newLine", null);
        setField(term207308, term207308.getClass(), "nullText", null);
        term207272 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term207273 = (char[]) newCharArray(31);
        setField(term207272, term207272.getClass(), "buffer", term207273);
        setIntField(term207272, term207272.getClass(), "size", 25);
        setField(term207272, term207272.getClass(), "newLine", null);
        setField(term207272, term207272.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceAll", argTypes, term200223, args);
        assertTrue(recursiveEquals(term200223, term207308));
        assertTrue(recursiveEquals(retValue, term207272));
    }

};


