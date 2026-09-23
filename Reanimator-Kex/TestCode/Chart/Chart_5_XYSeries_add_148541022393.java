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
import java.util.ArrayList;

public class XYSeries_add_148541022393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14704;

    public XYSeries_add_148541022393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14756 = new ArrayList();
        term14704 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setBooleanField(term14704, term14704.getClass(), "autoSort", false);
        setBooleanField(term14704, term14704.getClass(), "allowDuplicateXValues", true);
        setField(term14704, term14704.getClass(), "data", term14756);
        setIntField(term14704, term14704.getClass(), "maximumItemCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0.0;
        args[1] = 0.0;
        args[2] = false;
        callMethod(klass, "add", argTypes, term14704, args);
    }

};


