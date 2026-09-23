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

public class StrBuilder_trim_1228498113365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213904;
     Object term213934;
     Object term213923;

    public StrBuilder_trim_1228498113365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213904 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term213784 = (char[]) newCharArray(3);
        setIntField(term213904, term213904.getClass(), "size", 3);
        setField(term213904, term213904.getClass(), "buffer", term213784);
        term213934 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term213935 = (char[]) newCharArray(3);
        setField(term213934, term213934.getClass(), "buffer", term213935);
        setIntField(term213934, term213934.getClass(), "size", 0);
        setField(term213934, term213934.getClass(), "newLine", null);
        setField(term213934, term213934.getClass(), "nullText", null);
        term213923 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term213924 = (char[]) newCharArray(3);
        setField(term213923, term213923.getClass(), "buffer", term213924);
        setIntField(term213923, term213923.getClass(), "size", 0);
        setField(term213923, term213923.getClass(), "newLine", null);
        setField(term213923, term213923.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term213904, args);
        assertTrue(recursiveEquals(term213904, term213934));
        assertTrue(recursiveEquals(retValue, term213923));
    }

};


