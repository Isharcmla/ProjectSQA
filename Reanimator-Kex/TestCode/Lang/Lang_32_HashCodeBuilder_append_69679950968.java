package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;

public class HashCodeBuilder_append_69679950968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451;
     Object term454;
     Object term5609;
     Object term5610;
     Object term5590;

    public HashCodeBuilder_append_69679950968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term451, term451.getClass(), "iConstant", 37);
        setIntField(term451, term451.getClass(), "iTotal", 17);
        term454 = (short[]) newShortArray(5);
        setShortElement(term454, 0, (short) -10960);
        setShortElement(term454, 1, (short) -1703);
        setShortElement(term454, 2, (short) 23627);
        setShortElement(term454, 3, (short) -19694);
        setShortElement(term454, 4, (short) 31942);
        term5609 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5609, term5609.getClass(), "iConstant", 37);
        setIntField(term5609, term5609.getClass(), "iTotal", 2058265757);
        term5610 = (short[]) newShortArray(5);
        setShortElement(term5610, 0, (short) -10960);
        setShortElement(term5610, 1, (short) -1703);
        setShortElement(term5610, 2, (short) 23627);
        setShortElement(term5610, 3, (short) -19694);
        setShortElement(term5610, 4, (short) 31942);
        term5590 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5590, term5590.getClass(), "iConstant", 37);
        setIntField(term5590, term5590.getClass(), "iTotal", 2058265757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term454;
        Object retValue = callMethod(klass, "append", argTypes, term451, args);
        assertTrue(recursiveEquals(term451, term5609));
        assertTrue(recursiveEquals(term454, term5610));
        assertTrue(recursiveEquals(retValue, term5590));
    }

};


