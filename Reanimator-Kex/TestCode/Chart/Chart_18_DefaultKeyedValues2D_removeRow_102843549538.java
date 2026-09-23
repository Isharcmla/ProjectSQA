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

public class DefaultKeyedValues2D_removeRow_102843549538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term207;

    public DefaultKeyedValues2D_removeRow_102843549538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term194 = new ArrayList();
        ArrayList term198 = new ArrayList();
        ArrayList term202 = new ArrayList();
        term193 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term193, term193.getClass(), "rowKeys", term194);
        setField(term193, term193.getClass(), "columnKeys", term198);
        setField(term193, term193.getClass(), "rows", term202);
        setBooleanField(term193, term193.getClass(), "sortRowKeys", false);
        term207 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term207;
        try {
            callMethod(klass, "removeRow", argTypes, term193, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


