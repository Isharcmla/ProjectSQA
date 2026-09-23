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

public class StrBuilder_setLength_1724723337357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52674;
     Object term104120;
     Object term104117;

    public StrBuilder_setLength_1724723337357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52674 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term104120 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term104120, term104120.getClass(), "buffer", null);
        setIntField(term104120, term104120.getClass(), "size", 0);
        setField(term104120, term104120.getClass(), "newLine", null);
        setField(term104120, term104120.getClass(), "nullText", null);
        term104117 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term104117, term104117.getClass(), "buffer", null);
        setIntField(term104117, term104117.getClass(), "size", 0);
        setField(term104117, term104117.getClass(), "newLine", null);
        setField(term104117, term104117.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "setLength", argTypes, term52674, args);
        assertTrue(recursiveEquals(term52674, term104120));
        assertTrue(recursiveEquals(retValue, term104117));
    }

};


