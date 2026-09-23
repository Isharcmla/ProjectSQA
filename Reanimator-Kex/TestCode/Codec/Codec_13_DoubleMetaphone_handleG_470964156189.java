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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.StringBuilder;
import java.lang.Object;

public class DoubleMetaphone_handleG_470964156189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252067;
     Object term252215;
     Object term252455;
     Object term252456;

    public DoubleMetaphone_handleG_470964156189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252067 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term251867 = (char[]) newCharArray(0);
        StringBuilder term252275 = new StringBuilder();
        ((StringBuilder) term252275).append(term251867);
        char[] term251870 = (char[]) newCharArray(0);
        StringBuilder term252335 = new StringBuilder();
        ((StringBuilder) term252335).append(term251870);
        term252215 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term252215, term252215.getClass(), "primary", term252275);
        setIntField(term252215, term252215.getClass(), "maxLength", -2147483647);
        setField(term252215, term252215.getClass(), "alternate", term252335);
        term252455 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term252455, term252455.getClass(), "maxCodeLen", 0);
        term252456 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term252457 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term252458 = (byte[]) newByteArray(16);
        Object term252459 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term252460 = (byte[]) newByteArray(16);
        setField(term252457, term252457.getClass(), "value", term252458);
        setByteField(term252457, term252457.getClass(), "coder", (byte) 0);
        setIntField(term252457, term252457.getClass(), "count", 0);
        setField(term252456, term252456.getClass(), "primary", term252457);
        setField(term252459, term252459.getClass(), "value", term252460);
        setByteField(term252459, term252459.getClass(), "coder", (byte) 0);
        setIntField(term252459, term252459.getClass(), "count", 0);
        setField(term252456, term252456.getClass(), "alternate", term252459);
        setIntField(term252456, term252456.getClass(), "maxLength", -2147483647);
        setField(term252456, term252456.getClass(), "this$0", null);
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
        args[0] = null;
        args[1] = term252215;
        args[2] = -1610612736;
        args[3] = false;
        Object retValue = callMethod(klass, "handleG", argTypes, term252067, args);
        assertTrue(recursiveEquals(term252067, term252455));
        assertTrue(recursiveEquals(term252215, term252456));
        assertTrue(recursiveEquals(retValue, -1610612735));
    }

};


