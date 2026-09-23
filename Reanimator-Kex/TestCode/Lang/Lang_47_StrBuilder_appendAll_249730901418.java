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

public class StrBuilder_appendAll_249730901418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81466;
     Object term127961;

    public StrBuilder_appendAll_249730901418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81466 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term127961 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127961, term127961.getClass(), "buffer", null);
        setIntField(term127961, term127961.getClass(), "size", 0);
        setField(term127961, term127961.getClass(), "newLine", null);
        setField(term127961, term127961.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendAll", argTypes, term81466, args);
        assertTrue(recursiveEquals(term81466, term127961));
    }

};


