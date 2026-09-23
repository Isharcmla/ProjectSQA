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

public class DoubleMetaphone_handleJ_470961273217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305970;
     Object term306156;
     Object term306932;
     Object term306935;

    public DoubleMetaphone_handleJ_470961273217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305970 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        char[] term305246 = (char[]) newCharArray(0);
        StringBuilder term306216 = new StringBuilder();
        ((StringBuilder) term306216).append(term305246);
        char[] term305249 = (char[]) newCharArray(256);
        StringBuilder term306276 = new StringBuilder();
        ((StringBuilder) term306276).append(term305249);
        term306156 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        setField(term306156, term306156.getClass(), "primary", term306216);
        setIntField(term306156, term306156.getClass(), "maxLength", 1);
        setField(term306156, term306156.getClass(), "alternate", term306276);
        term306932 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term306932, term306932.getClass(), "maxCodeLen", 0);
        term306935 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult"));
        Object term306936 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term306937 = (byte[]) newByteArray(16);
        Object term306938 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term306939 = (byte[]) newByteArray(256);
        setByteElement(term306937, 0, (byte) 74);
        setField(term306936, term306936.getClass(), "value", term306937);
        setByteField(term306936, term306936.getClass(), "coder", (byte) 0);
        setIntField(term306936, term306936.getClass(), "count", 1);
        setField(term306935, term306935.getClass(), "primary", term306936);
        setField(term306938, term306938.getClass(), "value", term306939);
        setByteField(term306938, term306938.getClass(), "coder", (byte) 0);
        setIntField(term306938, term306938.getClass(), "count", 256);
        setField(term306935, term306935.getClass(), "alternate", term306938);
        setIntField(term306935, term306935.getClass(), "maxLength", 1);
        setField(term306935, term306935.getClass(), "this$0", null);
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
        args[0] = "\b\uFFE1\uFFE1\uFFE1\uFFE1\uFFE1\uFFE1\uFFE1";
        args[1] = term306156;
        args[2] = -1811939328;
        args[3] = false;
        Object retValue = callMethod(klass, "handleJ", argTypes, term305970, args);
        assertTrue(recursiveEquals(term305970, term306932));
        assertTrue(recursiveEquals(term306156, -1811939328));
        assertTrue(recursiveEquals(retValue, -1811939327));
    }

};


