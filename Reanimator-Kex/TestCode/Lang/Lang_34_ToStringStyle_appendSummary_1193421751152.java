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

public class ToStringStyle_appendSummary_1193421751152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2960;
     Object term3004;

    public ToStringStyle_appendSummary_1193421751152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2960 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2973 = (byte[]) newByteArray(16);
        setField(term2960, term2960.getClass(), "toStringCache", "IgRJUzaCwW");
        setField(term2960, term2960.getClass(), "value", term2973);
        setByteField(term2960, term2960.getClass(), "coder", (byte) 72);
        setIntField(term2960, term2960.getClass(), "count", 579005622);
        term3004 = (int[]) newIntArray(9);
        setIntElement(term3004, 0, -14890619);
        setIntElement(term3004, 1, 1632125673);
        setIntElement(term3004, 2, 454281060);
        setIntElement(term3004, 3, -1786399638);
        setIntElement(term3004, 4, 2055867847);
        setIntElement(term3004, 5, -1048298087);
        setIntElement(term3004, 6, 292681826);
        setIntElement(term3004, 7, 458147407);
        setIntElement(term3004, 8, -184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2960;
        args[1] = "JUmudUmaaV";
        args[2] = term3004;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


