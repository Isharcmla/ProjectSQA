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

public class Metaphone_isNextChar_18475045733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18611;
     Object term18669;
     Object term18697;
     Object term18698;

    public Metaphone_isNextChar_18475045733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18611 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        term18669 = new StringBuffer();
        term18697 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term18697, term18697.getClass(), "maxCodeLen", 0);
        term18698 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term18699 = (byte[]) newByteArray(16);
        setField(term18698, term18698.getClass(), "toStringCache", null);
        setField(term18698, term18698.getClass(), "value", term18699);
        setByteField(term18698, term18698.getClass(), "coder", (byte) 0);
        setIntField(term18698, term18698.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term18669;
        args[1] = 0;
        args[2] = (char) 0;
        Object retValue = callMethod(klass, "isNextChar", argTypes, term18611, args);
        assertTrue(recursiveEquals(term18611, term18697));
        assertTrue(recursiveEquals(term18669, term18698));
        assertTrue(recursiveEquals(retValue, false));
    }

};
