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

public class StrBuilder_replaceFirst_1238446619238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8181;
     Object term73649;
     Object term73564;

    public StrBuilder_replaceFirst_1238446619238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8181 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8182 = (char[]) newCharArray(32);
        setField(term8181, term8181.getClass(), "buffer", term8182);
        setIntField(term8181, term8181.getClass(), "size", 1861318859);
        setField(term8181, term8181.getClass(), "newLine", "XkIoWJRNwN");
        setField(term8181, term8181.getClass(), "nullText", "aNWLJdrZMq");
        term73649 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term73650 = (char[]) newCharArray(32);
        setField(term73649, term73649.getClass(), "buffer", term73650);
        setIntField(term73649, term73649.getClass(), "size", 1861318859);
        setField(term73649, term73649.getClass(), "newLine", "XkIoWJRNwN");
        setField(term73649, term73649.getClass(), "nullText", "aNWLJdrZMq");
        term73564 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term73565 = (char[]) newCharArray(32);
        setField(term73564, term73564.getClass(), "buffer", term73565);
        setIntField(term73564, term73564.getClass(), "size", 1861318859);
        setField(term73564, term73564.getClass(), "newLine", "XkIoWJRNwN");
        setField(term73564, term73564.getClass(), "nullText", "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "HHmNoYxIGj";
        args[1] = "PtirvZmsGt";
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term8181, args);
        assertTrue(recursiveEquals(term8181, term73649));
        assertTrue(recursiveEquals(retValue, term73564));
    }

};


