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

public class StrBuilder_append_1027807909322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58901;
     Object term99843;
     Object term99836;

    public StrBuilder_append_1027807909322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58901 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term58804 = (char[]) newCharArray(0);
        setIntField(term58901, term58901.getClass(), "size", 0);
        setField(term58901, term58901.getClass(), "buffer", term58804);
        term99843 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term99844 = (char[]) newCharArray(1);
        setField(term99843, term99843.getClass(), "buffer", term99844);
        setIntField(term99843, term99843.getClass(), "size", 1);
        setField(term99843, term99843.getClass(), "newLine", null);
        setField(term99843, term99843.getClass(), "nullText", null);
        term99836 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term99837 = (char[]) newCharArray(1);
        setField(term99836, term99836.getClass(), "buffer", term99837);
        setIntField(term99836, term99836.getClass(), "size", 1);
        setField(term99836, term99836.getClass(), "newLine", null);
        setField(term99836, term99836.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "append", argTypes, term58901, args);
        assertTrue(recursiveEquals(term58901, term99843));
        assertTrue(recursiveEquals(retValue, term99836));
    }

};


