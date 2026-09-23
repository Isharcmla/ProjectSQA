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

public class StrBuilder_equals_129659237336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15331;
     Object term15390;
     Object term98102;
     Object term98108;

    public StrBuilder_equals_129659237336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15331 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term15332 = (char[]) newCharArray(32);
        setField(term15331, term15331.getClass(), "buffer", term15332);
        setIntField(term15331, term15331.getClass(), "size", 1694224101);
        setField(term15331, term15331.getClass(), "newLine", "TXZAIPQJHt");
        setField(term15331, term15331.getClass(), "nullText", "DIbeDHICho");
        term15390 = newInstance(Class.forName("java.lang.Object"));
        term98102 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term98103 = (char[]) newCharArray(32);
        setField(term98102, term98102.getClass(), "buffer", term98103);
        setIntField(term98102, term98102.getClass(), "size", 1694224101);
        setField(term98102, term98102.getClass(), "newLine", "TXZAIPQJHt");
        setField(term98102, term98102.getClass(), "nullText", "DIbeDHICho");
        term98108 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15390;
        callMethod(klass, "equals", argTypes, term15331, args);
        assertTrue(recursiveEquals(term15331, term98102));
        assertTrue(recursiveEquals(term15390, term98108));
    }

};


