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

public class StrBuilder_trim_1228498113372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169729;
     Object term182940;
     Object term182901;

    public StrBuilder_trim_1228498113372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169729 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term169449 = (char[]) newCharArray(31);
        setIntField(term169729, term169729.getClass(), "size", 22);
        setField(term169729, term169729.getClass(), "buffer", term169449);
        term182940 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term182941 = (char[]) newCharArray(31);
        setField(term182940, term182940.getClass(), "buffer", term182941);
        setIntField(term182940, term182940.getClass(), "size", 0);
        setField(term182940, term182940.getClass(), "newLine", null);
        setField(term182940, term182940.getClass(), "nullText", null);
        term182901 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term182902 = (char[]) newCharArray(31);
        setField(term182901, term182901.getClass(), "buffer", term182902);
        setIntField(term182901, term182901.getClass(), "size", 0);
        setField(term182901, term182901.getClass(), "newLine", null);
        setField(term182901, term182901.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "trim", argTypes, term169729, args);
        assertTrue(recursiveEquals(term169729, term182940));
        assertTrue(recursiveEquals(retValue, term182901));
    }

};


