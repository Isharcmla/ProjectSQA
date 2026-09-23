package org.apache.commons.lang3.reflect;

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
import static org.apache.commons.lang3.reflect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeUtils_normalizeUpperBounds_1633234157155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24549;

    public TypeUtils_normalizeUpperBounds_1633234157155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24654 = Class.forName((String) "java.util.stream.Streams$DoubleStreamBuilderImpl");
        Class<? extends Object> term24690 = Class.forName((String) "java.lang.invoke.VarHandleDoubles$FieldStaticReadWrite");
        term24549 = (Object[]) newArray("java.lang.reflect.Type", 497);
        setElement(term24549, 0, term24654);
        setElement(term24549, 1, term24654);
        setElement(term24549, 2, term24654);
        setElement(term24549, 3, term24654);
        setElement(term24549, 4, term24690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.reflect.TypeUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24549;
        callMethod(klass, "normalizeUpperBounds", argTypes, null, args);
    }

};


