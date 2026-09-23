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

public class StrBuilder_replaceAll_1767806868381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266397;
     Object term280697;
     Object term280677;

    public StrBuilder_replaceAll_1767806868381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266397 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term265943 = (char[]) newCharArray(15);
        setIntField(term266397, term266397.getClass(), "size", 15);
        setField(term266397, term266397.getClass(), "buffer", term265943);
        term280697 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term280698 = (char[]) newCharArray(15);
        setField(term280697, term280697.getClass(), "buffer", term280698);
        setIntField(term280697, term280697.getClass(), "size", 15);
        setField(term280697, term280697.getClass(), "newLine", null);
        setField(term280697, term280697.getClass(), "nullText", null);
        term280677 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term280678 = (char[]) newCharArray(15);
        setField(term280677, term280677.getClass(), "buffer", term280678);
        setIntField(term280677, term280677.getClass(), "size", 15);
        setField(term280677, term280677.getClass(), "newLine", null);
        setField(term280677, term280677.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term266397, args);
        assertTrue(recursiveEquals(term266397, term280697));
        assertTrue(recursiveEquals(retValue, term280677));
    }

};


