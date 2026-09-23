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

public class XYSeries_hashCode_193325815597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14776;

    public XYSeries_hashCode_193325815597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14776 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setField(term14776, term14776.getClass(), "data", null);
        setIntField(term14776, term14776.getClass(), "maximumItemCount", 0);
        setBooleanField(term14776, term14776.getClass(), "autoSort", false);
        setBooleanField(term14776, term14776.getClass(), "allowDuplicateXValues", false);
        setField(term14776, term14776.getClass(), "key", null);
        setField(term14776, term14776.getClass(), "description", null);
        setField(term14776, term14776.getClass(), "listeners", null);
        setField(term14776, term14776.getClass(), "propertyChangeSupport", null);
        setBooleanField(term14776, term14776.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14776, args);
    }

};


