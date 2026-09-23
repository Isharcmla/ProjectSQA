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

public class StrBuilder_appendAll_1799107050241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6740;
     Object term70873;

    public StrBuilder_appendAll_1799107050241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6740 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term6740, term6740.getClass(), "buffer", null);
        setIntField(term6740, term6740.getClass(), "size", 0);
        setField(term6740, term6740.getClass(), "newLine", null);
        setField(term6740, term6740.getClass(), "nullText", null);
        term70873 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term70873, term70873.getClass(), "buffer", null);
        setIntField(term70873, term70873.getClass(), "size", 0);
        setField(term70873, term70873.getClass(), "newLine", null);
        setField(term70873, term70873.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendAll", argTypes, term6740, args);
        assertTrue(recursiveEquals(term6740, term70873));
    }

};


