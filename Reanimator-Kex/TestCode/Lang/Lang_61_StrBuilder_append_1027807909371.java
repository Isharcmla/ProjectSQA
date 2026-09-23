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

public class StrBuilder_append_1027807909371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169446;
     Object term169349;
     Object term182846;
     Object term182847;
     Object term182843;

    public StrBuilder_append_1027807909371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169446 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term169349 = (char[]) newCharArray(0);
        term182846 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term182846, term182846.getClass(), "buffer", null);
        setIntField(term182846, term182846.getClass(), "size", 0);
        setField(term182846, term182846.getClass(), "newLine", null);
        setField(term182846, term182846.getClass(), "nullText", null);
        term182847 = (char[]) newCharArray(0);
        term182843 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term182843, term182843.getClass(), "buffer", null);
        setIntField(term182843, term182843.getClass(), "size", 0);
        setField(term182843, term182843.getClass(), "newLine", null);
        setField(term182843, term182843.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term169349;
        Object retValue = callMethod(klass, "append", argTypes, term169446, args);
        assertTrue(recursiveEquals(term169446, term182846));
        assertTrue(recursiveEquals(term169349, term182847));
        assertTrue(recursiveEquals(retValue, term182843));
    }

};


