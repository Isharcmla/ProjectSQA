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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ToStringStyle_appendSummary_1193421255155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3243;
     Object term3287;

    public ToStringStyle_appendSummary_1193421255155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3243 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3256 = (byte[]) newByteArray(16);
        setField(term3243, term3243.getClass(), "toStringCache", "vQVyKLdtaz");
        setField(term3243, term3243.getClass(), "value", term3256);
        setByteField(term3243, term3243.getClass(), "coder", (byte) -12);
        setIntField(term3243, term3243.getClass(), "count", 1596070772);
        term3287 = (short[]) newShortArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term3243;
        args[1] = "OWKQODBLzb";
        args[2] = term3287;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


