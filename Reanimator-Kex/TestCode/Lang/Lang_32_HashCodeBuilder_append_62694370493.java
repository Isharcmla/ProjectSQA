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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.lang.Object;

public class HashCodeBuilder_append_62694370493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12804;
     Object term12453;
     Object term14485;
     Object term14486;
     Object term13471;

    public HashCodeBuilder_append_62694370493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12804 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term12804, term12804.getClass(), "iTotal", 0);
        setIntField(term12804, term12804.getClass(), "iConstant", 0);
        term12453 = (Object[]) newArray("java.lang.Object", 496);
        Object[] term12454 = (Object[]) newArray("java.lang.Object", 0);
        Object term12823 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12453, 0, term12454);
        setElement(term12453, 1, term12823);
        setElement(term12453, 2, "byte");
        term14485 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term14485, term14485.getClass(), "iConstant", 0);
        setIntField(term14485, term14485.getClass(), "iTotal", 0);
        term14486 = (Object[]) newArray("java.lang.Object", 496);
        Object[] term14487 = (Object[]) newArray("java.lang.Object", 0);
        Object term14488 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14486, 0, term14487);
        setElement(term14486, 1, term14488);
        setElement(term14486, 2, "byte");
        term13471 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term13471, term13471.getClass(), "iConstant", 0);
        setIntField(term13471, term13471.getClass(), "iTotal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12453;
        Object retValue = callMethod(klass, "append", argTypes, term12804, args);
        assertTrue(recursiveEquals(term12804, term14485));
        assertTrue(recursiveEquals(term12453, term14486));
        assertTrue(recursiveEquals(retValue, term13471));
    }

};


