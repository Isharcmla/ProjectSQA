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
import java.lang.Boolean;

public class DoubleMetaphone_handleS_47095262465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1912;
     Object term1926;
     Object term1992;
     Object term1994;

    public DoubleMetaphone_handleS_47095262465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1912 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term1912, term1912.getClass(), "maxCodeLen", 4);
        term1926 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term1927 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1940 = (byte[]) newByteArray(16);
        Object term1959 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1972 = (byte[]) newByteArray(16);
        setField(term1927, term1927.getClass(), "toStringCache", "BndsHwAFMv");
        setField(term1927, term1927.getClass(), "value", term1940);
        setByteField(term1927, term1927.getClass(), "coder", (byte) -112);
        setIntField(term1927, term1927.getClass(), "count", -14890619);
        setField(term1926, term1926.getClass(), "primary", term1927);
        setField(term1959, term1959.getClass(), "toStringCache", "GzFkzHGYFt");
        setField(term1959, term1959.getClass(), "value", term1972);
        setByteField(term1959, term1959.getClass(), "coder", (byte) -111);
        setIntField(term1959, term1959.getClass(), "count", 1632125673);
        setField(term1926, term1926.getClass(), "alternate", term1959);
        setIntField(term1926, term1926.getClass(), "maxLength", 454281060);
        setField(term1926, term1926.getClass(), "this$0", null);
        term1992 = new Integer(-1786399638);
        term1994 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "hxCBltsObl";
        args[1] = term1926;
        args[2] = term1992;
        args[3] = term1994;
        try {
            callMethod(klass, "handleS", argTypes, term1912, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


