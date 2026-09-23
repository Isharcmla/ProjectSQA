package org.apache.commons.lang.text;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StrBuilder_appendln_1342001368216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916;
     Object term4975;

    public StrBuilder_appendln_1342001368216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term4917 = (char[]) newCharArray(32);
        setField(term4916, term4916.getClass(), "buffer", term4917);
        setIntField(term4916, term4916.getClass(), "size", 1324040357);
        setField(term4916, term4916.getClass(), "newLine", "xOcJIiQQDu");
        setField(term4916, term4916.getClass(), "nullText", "GVizqqzXpy");
        term4975 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term4988 = (byte[]) newByteArray(16);
        setField(term4975, term4975.getClass(), "toStringCache", "JqXGgAhZPl");
        setField(term4975, term4975.getClass(), "value", term4988);
        setByteField(term4975, term4975.getClass(), "coder", (byte) 89);
        setIntField(term4975, term4975.getClass(), "count", -1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[1];
        args[0] = term4975;
        try {
            callMethod(klass, "appendln", argTypes, term4916, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


