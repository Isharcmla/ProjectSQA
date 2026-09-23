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
import java.util.ArrayList;

public class StrBuilder_appendWithSeparators_960844358415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81065;
     Object term81117;
     Object term127908;
     Object term127909;

    public StrBuilder_appendWithSeparators_960844358415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81065 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term81117 = new ArrayList();
        term127908 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127908, term127908.getClass(), "buffer", null);
        setIntField(term127908, term127908.getClass(), "size", 0);
        setField(term127908, term127908.getClass(), "newLine", null);
        setField(term127908, term127908.getClass(), "nullText", null);
        term127909 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term81117;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term81065, args);
        assertTrue(recursiveEquals(term81065, term127908));
        assertTrue(recursiveEquals(term81117, term127909));
    }

};


