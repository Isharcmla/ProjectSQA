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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class HashCodeBuilder_reflectionAppend_129820698038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;
     Object term6;
     Object term8;

    public HashCodeBuilder_reflectionAppend_129820698038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("java.lang.Object"));
        term3 = newInstance(Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder"));
        setIntField(term3, term3.getClass(), "iConstant", 37);
        setIntField(term3, term3.getClass(), "iTotal", 17);
        term6 = new Boolean(false);
        term8 = (Object[]) newArray("java.lang.String", 5);
        setElement(term8, 0, "PAEBtnZtTD");
        setElement(term8, 1, "sjlJAEtRrb");
        setElement(term8, 2, "MuLcgQHgqz");
        setElement(term8, 3, "xxtlPwDYFs");
        setElement(term8, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        argTypes[3] = boolean.class;
        argTypes[4] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[5];
        args[0] = term2;
        args[1] = null;
        args[2] = term3;
        args[3] = term6;
        args[4] = term8;
        try {
            callMethod(klass, "reflectionAppend", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


