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

public class StrBuilder_append_957951608314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53863;
     Object term92337;
     Object term92335;

    public StrBuilder_append_957951608314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53863 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term92337 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92337, term92337.getClass(), "buffer", null);
        setIntField(term92337, term92337.getClass(), "size", 0);
        setField(term92337, term92337.getClass(), "newLine", null);
        setField(term92337, term92337.getClass(), "nullText", null);
        term92335 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92335, term92335.getClass(), "buffer", null);
        setIntField(term92335, term92335.getClass(), "size", 0);
        setField(term92335, term92335.getClass(), "newLine", null);
        setField(term92335, term92335.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term53863, args);
        assertTrue(recursiveEquals(term53863, term92337));
        assertTrue(recursiveEquals(retValue, term92335));
    }

};


