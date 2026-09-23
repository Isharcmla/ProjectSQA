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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.ArrayList;

public class DefaultKeyedValues2D_clear_13403243042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;
     Object term3872;

    public DefaultKeyedValues2D_clear_13403243042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term254 = new ArrayList();
        ArrayList term258 = new ArrayList();
        ArrayList term262 = new ArrayList();
        term253 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term253, term253.getClass(), "rowKeys", term254);
        setField(term253, term253.getClass(), "columnKeys", term258);
        setField(term253, term253.getClass(), "rows", term262);
        setBooleanField(term253, term253.getClass(), "sortRowKeys", false);
        ArrayList term3873 = new ArrayList();
        ArrayList term3875 = new ArrayList();
        ArrayList term3877 = new ArrayList();
        term3872 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3872, term3872.getClass(), "rowKeys", term3873);
        setField(term3872, term3872.getClass(), "columnKeys", term3875);
        setField(term3872, term3872.getClass(), "rows", term3877);
        setBooleanField(term3872, term3872.getClass(), "sortRowKeys", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term253, args);
        assertTrue(recursiveEquals(term253, term3872));
    }

};


