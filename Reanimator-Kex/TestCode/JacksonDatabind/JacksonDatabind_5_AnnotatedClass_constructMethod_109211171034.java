package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AnnotatedClass_constructMethod_109211171034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;

    public AnnotatedClass_constructMethod_109211171034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term382 = Class.forName((String) "java.util.regex.Pattern$GroupHead");
        Class<? extends Object> term562 = Class.forName((String) "java.util.regex.Matcher");
        Class term568 = int.class;
        Class<? extends Object> term593 = Class.forName((String) "java.lang.CharSequence");
        Object[] term594 = (Object[]) newArray("java.lang.Class", 3);
        setElement(term594, 0, term562);
        setElement(term594, 1, term568);
        setElement(term594, 2, term593);
        term121 = ((Class) term382).getDeclaredMethod((String) "match", (Class[]) term594);
        ((Method) term121).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term121;
        callMethod(klass, "_constructMethod", argTypes, null, args);
    }

};


