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

public class Metaphone_regionMatch_138966537617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215;
     Object term217;
     Object term249;
     Object term1379;
     Object term1380;

    public Metaphone_regionMatch_138966537617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term215, term215.getClass(), "maxCodeLen", 4);
        term217 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term230 = (byte[]) newByteArray(16);
        setField(term217, term217.getClass(), "toStringCache", "jJCZpVmanW");
        setField(term217, term217.getClass(), "value", term230);
        setByteField(term217, term217.getClass(), "coder", (byte) 75);
        setIntField(term217, term217.getClass(), "count", -1955890973);
        term249 = new Integer(-2038273078);
        term1379 = newInstance(Class.forName("org.apache.commons.codec.language.Metaphone"));
        setIntField(term1379, term1379.getClass(), "maxCodeLen", 4);
        term1380 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1383 = (byte[]) newByteArray(16);
        setField(term1380, term1380.getClass(), "toStringCache", "jJCZpVmanW");
        setField(term1380, term1380.getClass(), "value", term1383);
        setByteField(term1380, term1380.getClass(), "coder", (byte) 75);
        setIntField(term1380, term1380.getClass(), "count", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Metaphone");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term217;
        args[1] = term249;
        args[2] = "EGtDIRbSSb";
        Object retValue = callMethod(klass, "regionMatch", argTypes, term215, args);
        assertTrue(recursiveEquals(term215, term1379));
        assertTrue(recursiveEquals(term217, term1380));
        assertTrue(recursiveEquals(term249, -2038273078));
        assertTrue(recursiveEquals(retValue, false));
    }

};
