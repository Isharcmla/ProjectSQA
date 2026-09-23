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
import java.util.HashMap;

public class DefaultKeyedValues_hashCode_77694947842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;
     Object term4112;

    public DefaultKeyedValues_hashCode_77694947842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term331 = new ArrayList();
        ArrayList term335 = new ArrayList();
        HashMap term339 = new HashMap();
        term330 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term330, term330.getClass(), "keys", term331);
        setField(term330, term330.getClass(), "values", term335);
        setField(term330, term330.getClass(), "indexMap", term339);
        ArrayList term4113 = new ArrayList();
        ArrayList term4115 = new ArrayList();
        HashMap term4117 = new HashMap();
        term4112 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term4112, term4112.getClass(), "keys", term4113);
        setField(term4112, term4112.getClass(), "values", term4115);
        setField(term4112, term4112.getClass(), "indexMap", term4117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term330, args);
        assertTrue(recursiveEquals(term330, term4112));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


