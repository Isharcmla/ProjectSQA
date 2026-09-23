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

public class StrBuilder_appendWithSeparators_960844358244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6993;
     Object term71526;

    public StrBuilder_appendWithSeparators_960844358244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6993 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term6993, term6993.getClass(), "buffer", null);
        setIntField(term6993, term6993.getClass(), "size", 0);
        setField(term6993, term6993.getClass(), "newLine", null);
        setField(term6993, term6993.getClass(), "nullText", null);
        term71526 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term71526, term71526.getClass(), "buffer", null);
        setIntField(term71526, term71526.getClass(), "size", 0);
        setField(term71526, term71526.getClass(), "newLine", null);
        setField(term71526, term71526.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term6993, args);
        assertTrue(recursiveEquals(term6993, term71526));
    }

};


