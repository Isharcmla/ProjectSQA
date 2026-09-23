package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_replaceAll_1767806868428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1719362;
     Object term1771232;
     Object term1771196;

    public StrBuilder_replaceAll_1767806868428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1719362 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1718468 = (char[]) newCharArray(31);
        setIntField(term1719362, term1719362.getClass(), "size", 20);
        setField(term1719362, term1719362.getClass(), "buffer", term1718468);
        term1771232 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1771233 = (char[]) newCharArray(31);
        setField(term1771232, term1771232.getClass(), "buffer", term1771233);
        setIntField(term1771232, term1771232.getClass(), "size", 20);
        setField(term1771232, term1771232.getClass(), "newLine", null);
        setField(term1771232, term1771232.getClass(), "nullText", null);
        term1771196 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1771197 = (char[]) newCharArray(31);
        setField(term1771196, term1771196.getClass(), "buffer", term1771197);
        setIntField(term1771196, term1771196.getClass(), "size", 20);
        setField(term1771196, term1771196.getClass(), "newLine", null);
        setField(term1771196, term1771196.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceAll", argTypes, term1719362, args);
        assertTrue(recursiveEquals(term1719362, term1771232));
        assertTrue(recursiveEquals(retValue, term1771196));
    }

};


