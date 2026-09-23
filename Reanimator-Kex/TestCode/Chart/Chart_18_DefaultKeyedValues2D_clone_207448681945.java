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

public class DefaultKeyedValues2D_clone_207448681945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term3974;
     Object term3946;

    public DefaultKeyedValues2D_clone_207448681945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term297 = new ArrayList();
        ArrayList term301 = new ArrayList();
        ArrayList term305 = new ArrayList();
        term296 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term296, term296.getClass(), "rowKeys", term297);
        setField(term296, term296.getClass(), "columnKeys", term301);
        setField(term296, term296.getClass(), "rows", term305);
        setBooleanField(term296, term296.getClass(), "sortRowKeys", true);
        ArrayList term3975 = new ArrayList();
        ArrayList term3977 = new ArrayList();
        ArrayList term3979 = new ArrayList();
        term3974 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3974, term3974.getClass(), "rowKeys", term3975);
        setField(term3974, term3974.getClass(), "columnKeys", term3977);
        setField(term3974, term3974.getClass(), "rows", term3979);
        setBooleanField(term3974, term3974.getClass(), "sortRowKeys", true);
        ArrayList term3947 = new ArrayList();
        ArrayList term3951 = new ArrayList();
        ArrayList term3955 = new ArrayList();
        term3946 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3946, term3946.getClass(), "rowKeys", term3947);
        setField(term3946, term3946.getClass(), "columnKeys", term3951);
        setField(term3946, term3946.getClass(), "rows", term3955);
        setBooleanField(term3946, term3946.getClass(), "sortRowKeys", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term296, args);
        assertTrue(recursiveEquals(term296, term3974));
        assertTrue(recursiveEquals(retValue, term3946));
    }

};


