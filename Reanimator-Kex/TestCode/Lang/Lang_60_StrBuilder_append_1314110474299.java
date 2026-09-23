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

public class StrBuilder_append_1314110474299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50244;
     Object term92759;
     Object term92742;

    public StrBuilder_append_1314110474299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50244 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term92759 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92759, term92759.getClass(), "buffer", null);
        setIntField(term92759, term92759.getClass(), "size", 0);
        setField(term92759, term92759.getClass(), "newLine", null);
        setField(term92759, term92759.getClass(), "nullText", null);
        term92742 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term92742, term92742.getClass(), "buffer", null);
        setIntField(term92742, term92742.getClass(), "size", 0);
        setField(term92742, term92742.getClass(), "newLine", null);
        setField(term92742, term92742.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        Object retValue = callMethod(klass, "append", argTypes, term50244, args);
        assertTrue(recursiveEquals(term50244, term92759));
        assertTrue(recursiveEquals(retValue, term92742));
    }

};


