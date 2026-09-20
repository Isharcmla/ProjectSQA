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
import java.lang.Integer;
import java.lang.Character;

public class Metaphone_isNextChar_18475045716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term153;
     Object term185;
     Object term187;
     Object term1272;
     Object term1273;

    public Metaphone_isNextChar_18475045716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term151, term151.getClass(), "maxCodeLen", 4);
        term153 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term166 = (byte[]) newByteArray(16);
        setField(term153, term153.getClass(), "toStringCache", "xxtlPwDYFs");
        setField(term153, term153.getClass(), "value", term166);
        setByteField(term153, term153.getClass(), "coder", (byte) 89);
        setIntField(term153, term153.getClass(), "count", -1922583790);
        term185 = new Integer(-616727354);
        term187 = new Character('A');
        term1272 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term1272, term1272.getClass(), "maxCodeLen", 4);
        term1273 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1276 = (byte[]) newByteArray(16);
        setField(term1273, term1273.getClass(), "toStringCache", "xxtlPwDYFs");
        setField(term1273, term1273.getClass(), "value", term1276);
        setByteField(term1273, term1273.getClass(), "coder", (byte) 89);
        setIntField(term1273, term1273.getClass(), "count", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term153;
        args[1] = term185;
        args[2] = term187;
        Object retValue = callMethod(klass, "isNextChar", argTypes, term151, args);
        assertTrue(recursiveEquals(term151, term1272));
        assertTrue(recursiveEquals(term153, term1273));
        assertTrue(recursiveEquals(term185, -616727354));
        assertTrue(recursiveEquals(term187, 'A'));
        assertTrue(recursiveEquals(retValue, false));
    }

};
