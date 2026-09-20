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
import java.lang.StringBuffer;

public class Metaphone_isNextChar_18475045731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15789;
     Object term15847;
     Object term15875;
     Object term15876;

    public Metaphone_isNextChar_18475045731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15789 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        term15847 = new StringBuffer();
        term15875 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term15875, term15875.getClass(), "maxCodeLen", 0);
        term15876 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term15877 = (byte[]) newByteArray(16);
        setField(term15876, term15876.getClass(), "toStringCache", null);
        setField(term15876, term15876.getClass(), "value", term15877);
        setByteField(term15876, term15876.getClass(), "coder", (byte) 0);
        setIntField(term15876, term15876.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term15847;
        args[1] = 0;
        args[2] = (char) 0;
        Object retValue = callMethod(klass, "isNextChar", argTypes, term15789, args);
        assertTrue(recursiveEquals(term15789, term15875));
        assertTrue(recursiveEquals(term15847, term15876));
        assertTrue(recursiveEquals(retValue, false));
    }

};
