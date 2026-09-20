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

public class Metaphone_isPreviousChar_169152269955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33730;
     Object term33788;
     Object term33816;
     Object term33817;

    public Metaphone_isPreviousChar_169152269955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33730 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        term33788 = new StringBuffer();
        term33816 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term33816, term33816.getClass(), "maxCodeLen", 0);
        term33817 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term33818 = (byte[]) newByteArray(16);
        setField(term33817, term33817.getClass(), "toStringCache", null);
        setField(term33817, term33817.getClass(), "value", term33818);
        setByteField(term33817, term33817.getClass(), "coder", (byte) 0);
        setIntField(term33817, term33817.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term33788;
        args[1] = 1022;
        args[2] = (char) 0;
        Object retValue = callMethod(klass, "isPreviousChar", argTypes, term33730, args);
        assertTrue(recursiveEquals(term33730, term33816));
        assertTrue(recursiveEquals(term33788, term33817));
        assertTrue(recursiveEquals(retValue, false));
    }

};
