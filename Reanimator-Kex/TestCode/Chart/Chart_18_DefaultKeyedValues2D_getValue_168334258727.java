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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class DefaultKeyedValues2D_getValue_168334258727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term45;
     Object term47;

    public DefaultKeyedValues2D_getValue_168334258727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32 = new ArrayList();
        ArrayList term36 = new ArrayList();
        ArrayList term40 = new ArrayList();
        term31 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term31, term31.getClass(), "rowKeys", term32);
        setField(term31, term31.getClass(), "columnKeys", term36);
        setField(term31, term31.getClass(), "rows", term40);
        setBooleanField(term31, term31.getClass(), "sortRowKeys", false);
        term45 = new Integer(568599855);
        term47 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45;
        args[1] = term47;
        try {
            callMethod(klass, "getValue", argTypes, term31, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


