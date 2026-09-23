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
import java.lang.Boolean;

public class ToStringStyle_append_1450939456162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3846;
     Object term3890;
     Object term3896;

    public ToStringStyle_append_1450939456162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3846 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3859 = (byte[]) newByteArray(16);
        setField(term3846, term3846.getClass(), "toStringCache", "xOcJIiQQDu");
        setField(term3846, term3846.getClass(), "value", term3859);
        setByteField(term3846, term3846.getClass(), "coder", (byte) 106);
        setIntField(term3846, term3846.getClass(), "count", -93135961);
        term3890 = (double[]) newDoubleArray(5);
        setDoubleElement(term3890, 0, 0.5523635872663106);
        setDoubleElement(term3890, 1, 0.544608645520025);
        setDoubleElement(term3890, 2, 0.28570734989730284);
        setDoubleElement(term3890, 3, 0.40176586625454525);
        setDoubleElement(term3890, 4, 0.2641345529914265);
        term3896 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.ToStringStyle");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[4];
        args[0] = term3846;
        args[1] = "GVizqqzXpy";
        args[2] = term3890;
        args[3] = term3896;
        try {
            callMethod(klass, "append", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


