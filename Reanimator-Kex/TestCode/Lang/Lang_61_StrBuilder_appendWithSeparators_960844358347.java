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

public class StrBuilder_appendWithSeparators_960844358347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100314;
     Object term100366;
     Object term122937;
     Object term122938;

    public StrBuilder_appendWithSeparators_960844358347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100314 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term100366 = new ArrayList();
        term122937 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term122937, term122937.getClass(), "buffer", null);
        setIntField(term122937, term122937.getClass(), "size", 0);
        setField(term122937, term122937.getClass(), "newLine", null);
        setField(term122937, term122937.getClass(), "nullText", null);
        term122938 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term100366;
        args[1] = null;
        callMethod(klass, "appendWithSeparators", argTypes, term100314, args);
        assertTrue(recursiveEquals(term100314, term122937));
        assertTrue(recursiveEquals(term100366, term122938));
    }

};


