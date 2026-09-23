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
import java.lang.Object;

public class ToStringStyle_appendSummary_1263277060146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2420;
     Object term2464;

    public ToStringStyle_appendSummary_1263277060146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2420 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2433 = (byte[]) newByteArray(16);
        setField(term2420, term2420.getClass(), "toStringCache", "nHXjMycHlU");
        setField(term2420, term2420.getClass(), "value", term2433);
        setByteField(term2420, term2420.getClass(), "coder", (byte) 66);
        setIntField(term2420, term2420.getClass(), "count", -226514366);
        term2464 = (Object[]) newArray("java.lang.Object", 4);
        Object term2465 = newInstance(Class.forName("java.lang.Object"));
        Object term2466 = newInstance(Class.forName("java.lang.Object"));
        Object term2467 = newInstance(Class.forName("java.lang.Object"));
        Object term2468 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2464, 0, term2465);
        setElement(term2464, 1, term2466);
        setElement(term2464, 2, term2467);
        setElement(term2464, 3, term2468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2420;
        args[1] = "ieCtQFdkii";
        args[2] = term2464;
        try {
            callMethod(klass, "appendSummary", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


