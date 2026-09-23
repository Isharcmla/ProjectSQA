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

public class ToStringStyle_appendDetail_39589674130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;
     Object term1144;

    public ToStringStyle_appendDetail_39589674130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1100 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1113 = (byte[]) newByteArray(16);
        setField(term1100, term1100.getClass(), "toStringCache", "OclPbYPkcH");
        setField(term1100, term1100.getClass(), "value", term1113);
        setByteField(term1100, term1100.getClass(), "coder", (byte) 49);
        setIntField(term1100, term1100.getClass(), "count", -1685132342);
        term1144 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1100;
        args[1] = "IoAlmYsBwc";
        args[2] = term1144;
        try {
            callMethod(klass, "appendDetail", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


