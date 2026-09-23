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

public class DefaultKeyedValues2D_removeColumn_136441732741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239;
     Object term3851;

    public DefaultKeyedValues2D_removeColumn_136441732741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term240 = new ArrayList();
        ArrayList term244 = new ArrayList();
        ArrayList term248 = new ArrayList();
        term239 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term239, term239.getClass(), "rowKeys", term240);
        setField(term239, term239.getClass(), "columnKeys", term244);
        setField(term239, term239.getClass(), "rows", term248);
        setBooleanField(term239, term239.getClass(), "sortRowKeys", true);
        ArrayList term3852 = new ArrayList();
        ArrayList term3854 = new ArrayList();
        ArrayList term3856 = new ArrayList();
        term3851 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3851, term3851.getClass(), "rowKeys", term3852);
        setField(term3851, term3851.getClass(), "columnKeys", term3854);
        setField(term3851, term3851.getClass(), "rows", term3856);
        setBooleanField(term3851, term3851.getClass(), "sortRowKeys", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeColumn", argTypes, term239, args);
        assertTrue(recursiveEquals(term239, term3851));
    }

};


