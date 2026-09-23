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
import java.lang.Integer;

public class ToStringStyle_appendSummarySize_571409816179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5163;
     Object term5207;

    public ToStringStyle_appendSummarySize_571409816179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5163 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5176 = (byte[]) newByteArray(16);
        setField(term5163, term5163.getClass(), "toStringCache", "dpNsDgfPso");
        setField(term5163, term5163.getClass(), "value", term5176);
        setByteField(term5163, term5163.getClass(), "coder", (byte) 44);
        setIntField(term5163, term5163.getClass(), "count", -1465035361);
        term5207 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5163;
        args[1] = "hCWPJQKpdc";
        args[2] = term5207;
        try {
            callMethod(klass, "appendSummarySize", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


