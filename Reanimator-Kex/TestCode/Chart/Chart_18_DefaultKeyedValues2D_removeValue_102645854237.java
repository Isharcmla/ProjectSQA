package org.jfree.data;

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
import java.lang.IllegalArgumentException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DefaultKeyedValues2D_removeValue_102645854237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public DefaultKeyedValues2D_removeValue_102645854237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term180 = new ArrayList();
        ArrayList term184 = new ArrayList();
        ArrayList term188 = new ArrayList();
        term179 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term179, term179.getClass(), "rowKeys", term180);
        setField(term179, term179.getClass(), "columnKeys", term184);
        setField(term179, term179.getClass(), "rows", term188);
        setBooleanField(term179, term179.getClass(), "sortRowKeys", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "removeValue", argTypes, term179, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


