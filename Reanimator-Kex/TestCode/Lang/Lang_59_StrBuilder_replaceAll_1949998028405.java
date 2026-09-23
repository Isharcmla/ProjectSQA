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

public class StrBuilder_replaceAll_1949998028405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1369641;
     Object term1407013;

    public StrBuilder_replaceAll_1949998028405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1369641 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term1407013 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term1407013, term1407013.getClass(), "buffer", null);
        setIntField(term1407013, term1407013.getClass(), "size", 0);
        setField(term1407013, term1407013.getClass(), "newLine", null);
        setField(term1407013, term1407013.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        callMethod(klass, "replaceAll", argTypes, term1369641, args);
        assertTrue(recursiveEquals(term1369641, term1407013));
    }

};


