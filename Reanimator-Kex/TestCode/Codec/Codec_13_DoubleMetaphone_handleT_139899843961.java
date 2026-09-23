package org.apache.commons.codec.language;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleMetaphone_handleT_139899843961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1564;
     Object term1578;
     Object term1620;

    public DoubleMetaphone_handleT_139899843961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1564 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1564, term1564.getClass(), "maxCodeLen", 4);
        term1578 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1579 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1580 = (byte[]) newByteArray(16);
        Object term1599 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1600 = (byte[]) newByteArray(16);
        setField(term1579, term1579.getClass(), "value", term1580);
        setByteField(term1579, term1579.getClass(), "coder", (byte) 36);
        setIntField(term1579, term1579.getClass(), "count", -184153539);
        setField(term1578, term1578.getClass(), "primary", term1579);
        setField(term1599, term1599.getClass(), "value", term1600);
        setByteField(term1599, term1599.getClass(), "coder", (byte) 118);
        setIntField(term1599, term1599.getClass(), "count", 493620644);
        setField(term1578, term1578.getClass(), "alternate", term1599);
        setIntField(term1578, term1578.getClass(), "maxLength", 1328271830);
        setField(term1578, term1578.getClass(), "this$0", null);
        term1620 = new Integer(1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "hNxWaHcfhY";
        args[1] = term1578;
        args[2] = term1620;
        try {
            callMethod(klass, "handleT", argTypes, term1564, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


