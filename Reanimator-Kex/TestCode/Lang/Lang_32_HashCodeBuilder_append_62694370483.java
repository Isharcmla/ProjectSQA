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

public class HashCodeBuilder_append_62694370483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9087;
     Object term9153;
     Object term9163;
     Object term9164;
     Object term9156;

    public HashCodeBuilder_append_62694370483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9087 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        term9153 = newInstance(Class.forName("java.util.AbstractList$ListItr"));
        term9163 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term9163, term9163.getClass(), "iConstant", 0);
        setIntField(term9163, term9163.getClass(), "iTotal", 562290366);
        term9164 = newInstance(Class.forName("java.util.AbstractList$ListItr"));
        setField(term9164, term9164.getClass(), "this$0", null);
        setIntField(term9164, term9164.getClass(), "cursor", 0);
        setIntField(term9164, term9164.getClass(), "lastRet", 0);
        setIntField(term9164, term9164.getClass(), "expectedModCount", 0);
        term9156 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term9156, term9156.getClass(), "iConstant", 0);
        setIntField(term9156, term9156.getClass(), "iTotal", 562290366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9153;
        Object retValue = callMethod(klass, "append", argTypes, term9087, args);
        assertTrue(recursiveEquals(term9087, term9163));
        assertTrue(recursiveEquals(term9153, term9164));
        assertTrue(recursiveEquals(retValue, term9156));
    }

};


