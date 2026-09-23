package org.apache.commons.lang3.builder;

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
import java.lang.StackOverflowError;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HashCodeBuilder_append_626943704109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23368;
     Object term22959;

    public HashCodeBuilder_append_626943704109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23368 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term23368, term23368.getClass(), "iTotal", 0);
        setIntField(term23368, term23368.getClass(), "iConstant", 0);
        term22959 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term22960 = (Object[]) newArray("java.lang.Object", 0);
        Object term23484 = newInstance(Class.forName("java.util.stream.ReferencePipeline$3"));
        setElement(term22959, 0, term22959);
        setElement(term22959, 1, term22960);
        setElement(term22959, 2, "");
        setElement(term22959, 3, "byte[]");
        setElement(term22959, 4, term23484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term22959;
        try {
            callMethod(klass, "append", argTypes, term23368, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


