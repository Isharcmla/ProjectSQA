package org.apache.commons.collections4.map;

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
import java.lang.StackOverflowError;
import static org.apache.commons.collections4.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiValueMap_clear_1204898974162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57790;

    public MultiValueMap_clear_1204898974162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57790 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term57894 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        Object term57998 = newInstance(Class.forName("org.apache.commons.collections4.map.MultiValueMap"));
        setField(term57998, term57998.getClass(), "map", term57998);
        setField(term57894, term57894.getClass(), "map", term57998);
        setField(term57790, term57790.getClass(), "map", term57894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.map.MultiValueMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term57790, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


