package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class XYSeries_clone_81101341894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14757;

    public XYSeries_clone_81101341894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14757 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setField(term14757, term14757.getClass(), "data", null);
        setIntField(term14757, term14757.getClass(), "maximumItemCount", 0);
        setBooleanField(term14757, term14757.getClass(), "autoSort", false);
        setBooleanField(term14757, term14757.getClass(), "allowDuplicateXValues", false);
        setField(term14757, term14757.getClass(), "key", null);
        setField(term14757, term14757.getClass(), "description", null);
        setField(term14757, term14757.getClass(), "listeners", null);
        setField(term14757, term14757.getClass(), "propertyChangeSupport", null);
        setBooleanField(term14757, term14757.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term14757, args);
    }

};


