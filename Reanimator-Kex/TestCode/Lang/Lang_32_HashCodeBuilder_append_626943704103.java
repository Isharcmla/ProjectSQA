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

public class HashCodeBuilder_append_626943704103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19101;
     Object term18702;
     Object term20070;
     Object term20071;
     Object term20041;

    public HashCodeBuilder_append_626943704103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19101 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term19101, term19101.getClass(), "iTotal", 0);
        setIntField(term19101, term19101.getClass(), "iConstant", 0);
        term18702 = (Object[]) newArray("java.lang.Object", 4);
        Object term19152 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term19195 = newInstance(Class.forName("java.util.stream.ReduceOps$4ReducingSink"));
        Object term19246 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term19332 = newInstance(Class.forName("java.util.stream.ReduceOps$4ReducingSink"));
        setElement(term18702, 0, term19152);
        setElement(term18702, 1, term19195);
        setElement(term18702, 2, term19246);
        setElement(term18702, 3, term19332);
        term20070 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term20070, term20070.getClass(), "iConstant", 0);
        setIntField(term20070, term20070.getClass(), "iTotal", 618522166);
        term20071 = (Object[]) newArray("java.lang.Object", 4);
        Object term20072 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term20073 = newInstance(Class.forName("java.util.stream.ReduceOps$4ReducingSink"));
        Object term20074 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        Object term20075 = newInstance(Class.forName("java.util.stream.ReduceOps$4ReducingSink"));
        setIntField(term20072, term20072.getClass(), "iConstant", 0);
        setIntField(term20072, term20072.getClass(), "iTotal", 0);
        setElement(term20071, 0, term20072);
        setField(term20073, term20073.getClass(), "val$seedFactory", null);
        setField(term20073, term20073.getClass(), "val$accumulator", null);
        setField(term20073, term20073.getClass(), "val$reducer", null);
        setField(term20073, term20073.getClass(), "state", null);
        setElement(term20071, 1, term20073);
        setIntField(term20074, term20074.getClass(), "iConstant", 0);
        setIntField(term20074, term20074.getClass(), "iTotal", 0);
        setElement(term20071, 2, term20074);
        setField(term20075, term20075.getClass(), "val$seedFactory", null);
        setField(term20075, term20075.getClass(), "val$accumulator", null);
        setField(term20075, term20075.getClass(), "val$reducer", null);
        setField(term20075, term20075.getClass(), "state", null);
        setElement(term20071, 3, term20075);
        term20041 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term20041, term20041.getClass(), "iConstant", 0);
        setIntField(term20041, term20041.getClass(), "iTotal", 618522166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term18702;
        Object retValue = callMethod(klass, "append", argTypes, term19101, args);
        assertTrue(recursiveEquals(term19101, term20070));
        assertTrue(recursiveEquals(term18702, term20071));
        assertTrue(recursiveEquals(retValue, term20041));
    }

};


