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

public class HashCodeBuilder_append_62694370498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14927;
     Object term14544;
     Object term17618;
     Object term17619;
     Object term17561;

    public HashCodeBuilder_append_62694370498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14927 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term14927, term14927.getClass(), "iTotal", 0);
        setIntField(term14927, term14927.getClass(), "iConstant", 0);
        term14544 = (Object[]) newArray("java.lang.Object", 8);
        Object term14997 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setElement(term14544, 0, "int");
        setElement(term14544, 1, term14927);
        setElement(term14544, 2, "byte");
        setElement(term14544, 3, term14997);
        term17618 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term17618, term17618.getClass(), "iConstant", 0);
        setIntField(term17618, term17618.getClass(), "iTotal", 0);
        term17619 = (Object[]) newArray("java.lang.Object", 8);
        Object term17622 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term17625 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setElement(term17619, 0, "int");
        setIntField(term17622, term17622.getClass(), "iConstant", 0);
        setIntField(term17622, term17622.getClass(), "iTotal", 0);
        setElement(term17619, 1, term17622);
        setElement(term17619, 2, "byte");
        setIntField(term17625, term17625.getClass(), "iConstant", 0);
        setIntField(term17625, term17625.getClass(), "iTotal", 0);
        setElement(term17619, 3, term17625);
        term17561 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term17561, term17561.getClass(), "iConstant", 0);
        setIntField(term17561, term17561.getClass(), "iTotal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term14544;
        Object retValue = callMethod(klass, "append", argTypes, term14927, args);
        assertTrue(recursiveEquals(term14927, term17618));
        assertTrue(recursiveEquals(term14544, term17619));
        assertTrue(recursiveEquals(retValue, term17561));
    }

};


