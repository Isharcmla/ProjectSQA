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

public class StrBuilder_indexOf_1329278622494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293558;
     Object term358626;

    public StrBuilder_indexOf_1329278622494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293558 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term293326 = (char[]) newCharArray(15);
        setIntField(term293558, term293558.getClass(), "size", 15);
        setField(term293558, term293558.getClass(), "buffer", term293326);
        term358626 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term358627 = (char[]) newCharArray(15);
        setField(term358626, term358626.getClass(), "buffer", term358627);
        setIntField(term358626, term358626.getClass(), "size", 15);
        setField(term358626, term358626.getClass(), "newLine", null);
        setField(term358626, term358626.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 65535;
        Object retValue = callMethod(klass, "indexOf", argTypes, term293558, args);
        assertTrue(recursiveEquals(term293558, term358626));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


