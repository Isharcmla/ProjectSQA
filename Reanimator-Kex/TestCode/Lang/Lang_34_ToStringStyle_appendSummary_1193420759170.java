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

public class ToStringStyle_appendSummary_1193420759170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4544;
     Object term4588;

    public ToStringStyle_appendSummary_1193420759170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4544 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4557 = (byte[]) newByteArray(16);
        setField(term4544, term4544.getClass(), "toStringCache", "sEnIVFtZuQ");
        setField(term4544, term4544.getClass(), "value", term4557);
        setByteField(term4544, term4544.getClass(), "coder", (byte) 116);
        setIntField(term4544, term4544.getClass(), "count", 1551099402);
        term4588 = (boolean[]) newBooleanArray(3);
        setBooleanElement(term4588, 0, true);
        setBooleanElement(term4588, 1, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4544;
        args[1] = "ZVecLZMLHF";
        args[2] = term4588;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


