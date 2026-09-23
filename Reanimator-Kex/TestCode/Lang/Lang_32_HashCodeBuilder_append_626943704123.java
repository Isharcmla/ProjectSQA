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

public class HashCodeBuilder_append_626943704123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33834;
     Object term33316;
     Object term35896;
     Object term35897;
     Object term35811;

    public HashCodeBuilder_append_626943704123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33834 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term33834, term33834.getClass(), "iTotal", 0);
        setIntField(term33834, term33834.getClass(), "iConstant", 0);
        term33316 = (Object[]) newArray("java.lang.Object", 6);
        Object[] term33317 = (Object[]) newArray("java.lang.Object", 0);
        Object term33898 = newInstance(Class.forName("java.util.ResourceBundle$NoFallbackControl"));
        byte[] term33320 = (byte[]) newByteArray(0);
        Object term34011 = newInstance(Class.forName("java.util.ResourceBundle$SingleFormatControl"));
        setElement(term33316, 0, term33317);
        setElement(term33316, 1, "byte");
        setElement(term33316, 2, term33898);
        setElement(term33316, 3, term33320);
        setElement(term33316, 4, "java.lang.String");
        setElement(term33316, 5, term34011);
        term35896 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term35896, term35896.getClass(), "iConstant", 0);
        setIntField(term35896, term35896.getClass(), "iTotal", 204087436);
        term35897 = (Object[]) newArray("java.lang.Object", 6);
        Object[] term35898 = (Object[]) newArray("java.lang.Object", 0);
        Object term35901 = newInstance(Class.forName("java.util.ResourceBundle$NoFallbackControl"));
        byte[] term35902 = (byte[]) newByteArray(0);
        Object term35905 = newInstance(Class.forName("java.util.ResourceBundle$SingleFormatControl"));
        setElement(term35897, 0, term35898);
        setElement(term35897, 1, "byte");
        setField(term35901, term35901.getClass(), "formats", null);
        setElement(term35897, 2, term35901);
        setElement(term35897, 3, term35902);
        setElement(term35897, 4, "java.lang.String");
        setField(term35905, term35905.getClass(), "formats", null);
        setElement(term35897, 5, term35905);
        term35811 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term35811, term35811.getClass(), "iConstant", 0);
        setIntField(term35811, term35811.getClass(), "iTotal", 204087436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term33316;
        Object retValue = callMethod(klass, "append", argTypes, term33834, args);
        assertTrue(recursiveEquals(term33834, term35896));
        assertTrue(recursiveEquals(term33316, term35897));
        assertTrue(recursiveEquals(retValue, term35811));
    }

};


