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
import java.lang.Long;

public class ToStringStyle_appendDetail_39588682128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term936;
     Object term980;

    public ToStringStyle_appendDetail_39588682128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term936 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term949 = (byte[]) newByteArray(16);
        setField(term936, term936.getClass(), "toStringCache", "eZFUvlxvGV");
        setField(term936, term936.getClass(), "value", term949);
        setByteField(term936, term936.getClass(), "coder", (byte) 74);
        setIntField(term936, term936.getClass(), "count", -883034806);
        term980 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term936;
        args[1] = "BYqFIqCKAV";
        args[2] = term980;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


