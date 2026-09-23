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

public class StrBuilder_indexOf_1329278622515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1241133;
     Object term1246196;

    public StrBuilder_indexOf_1329278622515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1241133 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1240909 = (char[]) newCharArray(15);
        setIntField(term1241133, term1241133.getClass(), "size", 14);
        setField(term1241133, term1241133.getClass(), "buffer", term1240909);
        term1246196 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term1246197 = (char[]) newCharArray(15);
        setField(term1246196, term1246196.getClass(), "buffer", term1246197);
        setIntField(term1246196, term1246196.getClass(), "size", 14);
        setField(term1246196, term1246196.getClass(), "newLine", null);
        setField(term1246196, term1246196.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "indexOf", argTypes, term1241133, args);
        assertTrue(recursiveEquals(term1241133, term1246196));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


