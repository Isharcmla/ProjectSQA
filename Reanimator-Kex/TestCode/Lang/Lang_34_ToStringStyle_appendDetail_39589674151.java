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

public class ToStringStyle_appendDetail_39589674151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2861;
     Object term2905;

    public ToStringStyle_appendDetail_39589674151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2861 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2874 = (byte[]) newByteArray(16);
        setField(term2861, term2861.getClass(), "toStringCache", "bLPjGVBhlX");
        setField(term2861, term2861.getClass(), "value", term2874);
        setByteField(term2861, term2861.getClass(), "coder", (byte) 42);
        setIntField(term2861, term2861.getClass(), "count", -1145578966);
        term2905 = (int[]) newIntArray(9);
        setIntElement(term2905, 0, 679763016);
        setIntElement(term2905, 1, 1962444399);
        setIntElement(term2905, 2, 767834723);
        setIntElement(term2905, 3, -602026508);
        setIntElement(term2905, 4, -157887805);
        setIntElement(term2905, 5, 1876565163);
        setIntElement(term2905, 6, -817164822);
        setIntElement(term2905, 7, -1016503459);
        setIntElement(term2905, 8, -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2861;
        args[1] = "whBvTVIIlC";
        args[2] = term2905;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


