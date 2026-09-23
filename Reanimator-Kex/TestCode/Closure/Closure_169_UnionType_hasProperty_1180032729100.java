package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class UnionType_hasProperty_1180032729100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16614;
     Object term17231;

    public UnionType_hasProperty_1180032729100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16666 = new ArrayList();
        term16614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term16614, term16614.getClass(), "alternates", term16666);
        ArrayList term17232 = new ArrayList();
        term17231 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term17231, term17231.getClass(), "alternates", term17232);
        setIntField(term17231, term17231.getClass(), "hashcode", 0);
        setBooleanField(term17231, term17231.getClass(), "resolved", false);
        setField(term17231, term17231.getClass(), "resolveResult", null);
        setBooleanField(term17231, term17231.getClass(), "inTemplatedCheckVisit", false);
        setField(term17231, term17231.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "hasProperty", argTypes, term16614, args);
        assertTrue(recursiveEquals(term16614, term17231));
        assertTrue(recursiveEquals(retValue, false));
    }

};


