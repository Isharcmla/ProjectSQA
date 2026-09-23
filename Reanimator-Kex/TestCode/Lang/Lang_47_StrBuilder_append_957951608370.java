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

public class StrBuilder_append_957951608370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58346;
     Object term110376;
     Object term110374;

    public StrBuilder_append_957951608370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58346 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term110376 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110376, term110376.getClass(), "buffer", null);
        setIntField(term110376, term110376.getClass(), "size", 0);
        setField(term110376, term110376.getClass(), "newLine", null);
        setField(term110376, term110376.getClass(), "nullText", null);
        term110374 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term110374, term110374.getClass(), "buffer", null);
        setIntField(term110374, term110374.getClass(), "size", 0);
        setField(term110374, term110374.getClass(), "newLine", null);
        setField(term110374, term110374.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term58346, args);
        assertTrue(recursiveEquals(term58346, term110376));
        assertTrue(recursiveEquals(retValue, term110374));
    }

};


