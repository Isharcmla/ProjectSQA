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

public class StrBuilder_isEmpty_1569760026358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52767;
     Object term104125;

    public StrBuilder_isEmpty_1569760026358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52767 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term52767, term52767.getClass(), "size", 0);
        term104125 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term104125, term104125.getClass(), "buffer", null);
        setIntField(term104125, term104125.getClass(), "size", 0);
        setField(term104125, term104125.getClass(), "newLine", null);
        setField(term104125, term104125.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term52767, args);
        assertTrue(recursiveEquals(term52767, term104125));
        assertTrue(recursiveEquals(retValue, true));
    }

};


