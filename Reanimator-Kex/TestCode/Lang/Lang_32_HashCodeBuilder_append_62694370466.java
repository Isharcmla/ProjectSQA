package org.apache.commons.lang3.builder;

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
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.builder.EqualityUtils.*;
import java.lang.Object;

public class HashCodeBuilder_append_62694370466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;
     Object term439;
     Object term5575;
     Object term5576;
     Object term5543;

    public HashCodeBuilder_append_62694370466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term436, term436.getClass(), "iConstant", 37);
        setIntField(term436, term436.getClass(), "iTotal", 17);
        term439 = (Object[]) newArray("java.lang.Object", 6);
        Object term440 = newInstance(Class.forName("java.lang.Object"));
        Object term441 = newInstance(Class.forName("java.lang.Object"));
        Object term442 = newInstance(Class.forName("java.lang.Object"));
        Object term443 = newInstance(Class.forName("java.lang.Object"));
        Object term444 = newInstance(Class.forName("java.lang.Object"));
        Object term445 = newInstance(Class.forName("java.lang.Object"));
        setElement(term439, 0, term440);
        setElement(term439, 1, term441);
        setElement(term439, 2, term442);
        setElement(term439, 3, term443);
        setElement(term439, 4, term444);
        setElement(term439, 5, term445);
        term5575 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5575, term5575.getClass(), "iConstant", 37);
        setIntField(term5575, term5575.getClass(), "iTotal", -404066439);
        term5576 = (Object[]) newArray("java.lang.Object", 6);
        Object term5577 = newInstance(Class.forName("java.lang.Object"));
        Object term5578 = newInstance(Class.forName("java.lang.Object"));
        Object term5579 = newInstance(Class.forName("java.lang.Object"));
        Object term5580 = newInstance(Class.forName("java.lang.Object"));
        Object term5581 = newInstance(Class.forName("java.lang.Object"));
        Object term5582 = newInstance(Class.forName("java.lang.Object"));
        setElement(term5576, 0, term5577);
        setElement(term5576, 1, term5578);
        setElement(term5576, 2, term5579);
        setElement(term5576, 3, term5580);
        setElement(term5576, 4, term5581);
        setElement(term5576, 5, term5582);
        term5543 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term5543, term5543.getClass(), "iConstant", 37);
        setIntField(term5543, term5543.getClass(), "iTotal", -404066439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term439;
        Object retValue = callMethod(klass, "append", argTypes, term436, args);
        assertTrue(recursiveEquals(term436, term5575));
        assertTrue(recursiveEquals(term439, term5576));
        assertTrue(recursiveEquals(retValue, term5543));
    }

};


