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

public class DefaultKeyedValues_sortByKeys_207805603839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;
     Object term255;
     Object term3932;
     Object term3938;

    public DefaultKeyedValues_sortByKeys_207805603839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term242 = new ArrayList();
        ArrayList term246 = new ArrayList();
        HashMap term250 = new HashMap();
        term241 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term241, term241.getClass(), "keys", term242);
        setField(term241, term241.getClass(), "values", term246);
        setField(term241, term241.getClass(), "indexMap", term250);
        term255 = newInstance(Class.forName("org.jfree.chart.util.SortOrder"));
        setField(term255, term255.getClass(), "name", "PAEBtnZtTD");
        ArrayList term3933 = new ArrayList();
        ArrayList term3935 = new ArrayList();
        HashMap term3937 = new HashMap();
        term3932 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term3932, term3932.getClass(), "keys", term3933);
        setField(term3932, term3932.getClass(), "values", term3935);
        setField(term3932, term3932.getClass(), "indexMap", term3937);
        term3938 = newInstance(Class.forName("org.jfree.chart.util.SortOrder"));
        setField(term3938, term3938.getClass(), "name", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.util.SortOrder");
        Object[] args = new Object[1];
        args[0] = term255;
        callMethod(klass, "sortByKeys", argTypes, term241, args);
        assertTrue(recursiveEquals(term241, term3932));
        assertTrue(recursiveEquals(term255, term3938));
    }

};


