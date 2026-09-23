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

public class DoubleMetaphone_handleJ_470961273117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109407;
     Object term109593;
     Object term111369;
     Object term111372;

    public DoubleMetaphone_handleJ_470961273117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109407 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term108682 = (char[]) newCharArray(256);
        StringBuilder term109653 = new StringBuilder();
        ((StringBuilder) term109653).append(term108682);
        char[] term109197 = (char[]) newCharArray(0);
        StringBuilder term109713 = new StringBuilder();
        ((StringBuilder) term109713).append(term109197);
        term109593 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term109593, term109593.getClass(), "primary", term109653);
        setIntField(term109593, term109593.getClass(), "maxLength", 1);
        setField(term109593, term109593.getClass(), "alternate", term109713);
        term111369 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term111369, term111369.getClass(), "maxCodeLen", 0);
        term111372 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term111373 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term111374 = (byte[]) newByteArray(256);
        Object term111375 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term111376 = (byte[]) newByteArray(16);
        setField(term111373, term111373.getClass(), "value", term111374);
        setByteField(term111373, term111373.getClass(), "coder", (byte) 0);
        setIntField(term111373, term111373.getClass(), "count", 256);
        setField(term111372, term111372.getClass(), "primary", term111373);
        setByteElement(term111376, 0, (byte) 74);
        setField(term111375, term111375.getClass(), "value", term111376);
        setByteField(term111375, term111375.getClass(), "coder", (byte) 0);
        setIntField(term111375, term111375.getClass(), "count", 1);
        setField(term111372, term111372.getClass(), "alternate", term111375);
        setIntField(term111372, term111372.getClass(), "maxLength", 1);
        setField(term111372, term111372.getClass(), "this$0", null);
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
        args[0] = "@UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
        args[1] = term109593;
        args[2] = -1845493760;
        args[3] = false;
        Object retValue = callMethod(klass, "handleJ", argTypes, term109407, args);
        assertTrue(recursiveEquals(term109407, term111369));
        assertTrue(recursiveEquals(term109593, -1845493760));
        assertTrue(recursiveEquals(retValue, -1845493759));
    }

};


