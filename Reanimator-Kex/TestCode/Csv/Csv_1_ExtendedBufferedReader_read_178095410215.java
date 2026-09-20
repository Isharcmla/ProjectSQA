package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;

public class ExtendedBufferedReader_read_178095410215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1832;
     Object term1846;

    public ExtendedBufferedReader_read_178095410215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1832 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        term1846 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setIntField(term1846, term1846.getClass(), "lastChar", 0);
        setIntField(term1846, term1846.getClass(), "lineCounter", 0);
        setField(term1846, term1846.getClass(), "in", null);
        setField(term1846, term1846.getClass(), "cb", null);
        setIntField(term1846, term1846.getClass(), "nChars", 0);
        setIntField(term1846, term1846.getClass(), "nextChar", 0);
        setIntField(term1846, term1846.getClass(), "markedChar", 0);
        setIntField(term1846, term1846.getClass(), "readAheadLimit", 0);
        setBooleanField(term1846, term1846.getClass(), "skipLF", false);
        setBooleanField(term1846, term1846.getClass(), "markedSkipLF", false);
        setField(term1846, term1846.getClass(), "lock", null);
        setField(term1846, term1846.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "read", argTypes, term1832, args);
        assertTrue(recursiveEquals(term1832, term1846));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
