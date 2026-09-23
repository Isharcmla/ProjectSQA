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

public class StrBuilder_replaceAll_1767806868390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537986;
     Object term551697;
     Object term551684;

    public StrBuilder_replaceAll_1767806868390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537986 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term537856 = (char[]) newCharArray(8);
        setIntField(term537986, term537986.getClass(), "size", 2);
        setField(term537986, term537986.getClass(), "buffer", term537856);
        term551697 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term551698 = (char[]) newCharArray(8);
        setField(term551697, term551697.getClass(), "buffer", term551698);
        setIntField(term551697, term551697.getClass(), "size", 2);
        setField(term551697, term551697.getClass(), "newLine", null);
        setField(term551697, term551697.getClass(), "nullText", null);
        term551684 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term551685 = (char[]) newCharArray(8);
        setField(term551684, term551684.getClass(), "buffer", term551685);
        setIntField(term551684, term551684.getClass(), "size", 2);
        setField(term551684, term551684.getClass(), "newLine", null);
        setField(term551684, term551684.getClass(), "nullText", null);
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
        Object retValue = callMethod(klass, "replaceAll", argTypes, term537986, args);
        assertTrue(recursiveEquals(term537986, term551697));
        assertTrue(recursiveEquals(retValue, term551684));
    }

};


