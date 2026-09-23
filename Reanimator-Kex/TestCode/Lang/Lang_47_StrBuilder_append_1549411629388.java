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

public class StrBuilder_append_1549411629388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67068;
     Object term115975;
     Object term115973;

    public StrBuilder_append_1549411629388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67068 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term115975 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term115975, term115975.getClass(), "buffer", null);
        setIntField(term115975, term115975.getClass(), "size", 0);
        setField(term115975, term115975.getClass(), "newLine", null);
        setField(term115975, term115975.getClass(), "nullText", null);
        term115973 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term115973, term115973.getClass(), "buffer", null);
        setIntField(term115973, term115973.getClass(), "size", 0);
        setField(term115973, term115973.getClass(), "newLine", null);
        setField(term115973, term115973.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term67068, args);
        assertTrue(recursiveEquals(term67068, term115975));
        assertTrue(recursiveEquals(retValue, term115973));
    }

};


