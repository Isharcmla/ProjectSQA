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

public class DoubleMetaphone_handleJ_470961273203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281016;
     Object term281202;
     Object term281970;
     Object term281973;

    public DoubleMetaphone_handleJ_470961273203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281016 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term280806 = (char[]) newCharArray(0);
        StringBuilder term281262 = new StringBuilder();
        ((StringBuilder) term281262).append(term280806);
        StringBuilder term281322 = new StringBuilder();
        term281202 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term281202, term281202.getClass(), "primary", term281262);
        setIntField(term281202, term281202.getClass(), "maxLength", 1);
        setField(term281202, term281202.getClass(), "alternate", term281322);
        term281970 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term281970, term281970.getClass(), "maxCodeLen", 0);
        term281973 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term281974 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term281975 = (byte[]) newByteArray(16);
        Object term281976 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term281977 = (byte[]) newByteArray(16);
        setByteElement(term281975, 0, (byte) 74);
        setField(term281974, term281974.getClass(), "value", term281975);
        setByteField(term281974, term281974.getClass(), "coder", (byte) 0);
        setIntField(term281974, term281974.getClass(), "count", 1);
        setField(term281973, term281973.getClass(), "primary", term281974);
        setByteElement(term281977, 0, (byte) 74);
        setField(term281976, term281976.getClass(), "value", term281977);
        setByteField(term281976, term281976.getClass(), "coder", (byte) 0);
        setIntField(term281976, term281976.getClass(), "count", 1);
        setField(term281973, term281973.getClass(), "alternate", term281976);
        setIntField(term281973, term281973.getClass(), "maxLength", 1);
        setField(term281973, term281973.getClass(), "this$0", null);
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
        args[0] = "\u0010UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
        args[1] = term281202;
        args[2] = -1610612736;
        args[3] = false;
        Object retValue = callMethod(klass, "handleJ", argTypes, term281016, args);
        assertTrue(recursiveEquals(term281016, term281970));
        assertTrue(recursiveEquals(term281202, -1610612736));
        assertTrue(recursiveEquals(retValue, -1610612735));
    }

};


