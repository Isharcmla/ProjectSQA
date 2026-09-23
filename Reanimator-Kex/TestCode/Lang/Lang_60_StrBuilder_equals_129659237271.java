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

public class StrBuilder_equals_129659237271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12511;
     Object term12570;
     Object term83516;
     Object term83522;

    public StrBuilder_equals_129659237271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12511 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term12512 = (char[]) newCharArray(32);
        setField(term12511, term12511.getClass(), "buffer", term12512);
        setIntField(term12511, term12511.getClass(), "size", -1731761810);
        setField(term12511, term12511.getClass(), "newLine", "pJbnHTYrxn");
        setField(term12511, term12511.getClass(), "nullText", "iIRsCSYqXH");
        term12570 = newInstance(Class.forName("java.lang.Object"));
        term83516 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term83517 = (char[]) newCharArray(32);
        setField(term83516, term83516.getClass(), "buffer", term83517);
        setIntField(term83516, term83516.getClass(), "size", -1731761810);
        setField(term83516, term83516.getClass(), "newLine", "pJbnHTYrxn");
        setField(term83516, term83516.getClass(), "nullText", "iIRsCSYqXH");
        term83522 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12570;
        callMethod(klass, "equals", argTypes, term12511, args);
        assertTrue(recursiveEquals(term12511, term83516));
        assertTrue(recursiveEquals(term12570, term83522));
    }

};


