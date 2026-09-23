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
import java.lang.String;
import java.lang.Object;

public class DefaultKeyedValues2D_setValue_62510549123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27075;
     Object enum13;

    public DefaultKeyedValues2D_setValue_62510549123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27127 = new ArrayList();
        ArrayList term27179 = new ArrayList();
        term27075 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setBooleanField(term27075, term27075.getClass(), "sortRowKeys", false);
        setField(term27075, term27075.getClass(), "rowKeys", term27127);
        setField(term27075, term27075.getClass(), "rows", term27179);
        Class<? extends Object> term27746 = Class.forName((String) "java.lang.Thread$State");
        Field term27745 = ((Class) term27746).getDeclaredField((String) "NEW");
        ((Field) term27745).setAccessible(true);
        enum13 = ((Field) term27745).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Number");
        argTypes[1] = Class.forName("java.lang.Comparable");
        argTypes[2] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum13;
        args[2] = null;
        try {
            callMethod(klass, "setValue", argTypes, term27075, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


