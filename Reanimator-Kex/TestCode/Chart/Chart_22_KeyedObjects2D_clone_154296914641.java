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

public class KeyedObjects2D_clone_154296914641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;
     Object term3953;
     Object term3927;

    public KeyedObjects2D_clone_154296914641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term264 = new ArrayList();
        ArrayList term268 = new ArrayList();
        ArrayList term272 = new ArrayList();
        term263 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term263, term263.getClass(), "rowKeys", term264);
        setField(term263, term263.getClass(), "columnKeys", term268);
        setField(term263, term263.getClass(), "rows", term272);
        ArrayList term3954 = new ArrayList();
        ArrayList term3956 = new ArrayList();
        ArrayList term3958 = new ArrayList();
        term3953 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term3953, term3953.getClass(), "rowKeys", term3954);
        setField(term3953, term3953.getClass(), "columnKeys", term3956);
        setField(term3953, term3953.getClass(), "rows", term3958);
        ArrayList term3928 = new ArrayList();
        ArrayList term3932 = new ArrayList();
        ArrayList term3936 = new ArrayList();
        term3927 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term3927, term3927.getClass(), "rowKeys", term3928);
        setField(term3927, term3927.getClass(), "columnKeys", term3932);
        setField(term3927, term3927.getClass(), "rows", term3936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term263, args);
        assertTrue(recursiveEquals(term263, term3953));
        assertTrue(recursiveEquals(retValue, term3927));
    }

};


