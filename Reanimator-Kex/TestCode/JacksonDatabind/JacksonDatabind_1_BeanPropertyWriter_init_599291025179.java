package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanPropertyWriter_init_599291025179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355576;
     Object term362956;
     Object term363072;

    public BeanPropertyWriter_init_599291025179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term355228 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term355344 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term355442 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setField(term355228, term355228.getClass(), "_member", null);
        setField(term355228, term355228.getClass(), "_contextAnnotations", term355344);
        setField(term355228, term355228.getClass(), "_name", term355442);
        term355576 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term355736 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term355858 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term355980 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356102 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356224 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356346 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356468 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356590 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356712 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356834 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term356956 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357078 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357200 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357322 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357444 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357566 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357688 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357810 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term357932 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358054 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358176 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358298 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358420 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358542 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358664 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358786 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term358908 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359030 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359152 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359274 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359396 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359518 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359640 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359762 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term359884 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360006 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360128 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360250 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360372 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360494 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360616 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360738 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360860 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term360982 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361104 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361226 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361348 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361470 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361592 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361714 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361836 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term361958 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term362080 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term362202 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term362324 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term362446 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term362568 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term362716 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term362836 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term355576, term355576.getClass(), "_name", "");
        setField(term362568, term362568.getClass(), "_primary", term362716);
        setField(term362446, term362446.getClass(), "_primary", term362568);
        setField(term362324, term362324.getClass(), "_primary", term362446);
        setField(term362202, term362202.getClass(), "_primary", term362324);
        setField(term362080, term362080.getClass(), "_primary", term362202);
        setField(term361958, term361958.getClass(), "_primary", term362080);
        setField(term361836, term361836.getClass(), "_primary", term361958);
        setField(term361714, term361714.getClass(), "_primary", term361836);
        setField(term361592, term361592.getClass(), "_primary", term361714);
        setField(term361470, term361470.getClass(), "_primary", term361592);
        setField(term361348, term361348.getClass(), "_primary", term361470);
        setField(term361226, term361226.getClass(), "_primary", term361348);
        setField(term361104, term361104.getClass(), "_primary", term361226);
        setField(term360982, term360982.getClass(), "_primary", term361104);
        setField(term360860, term360860.getClass(), "_primary", term360982);
        setField(term360738, term360738.getClass(), "_primary", term360860);
        setField(term360616, term360616.getClass(), "_primary", term360738);
        setField(term360494, term360494.getClass(), "_primary", term360616);
        setField(term360372, term360372.getClass(), "_primary", term360494);
        setField(term360250, term360250.getClass(), "_primary", term360372);
        setField(term360128, term360128.getClass(), "_primary", term360250);
        setField(term360006, term360006.getClass(), "_primary", term360128);
        setField(term359884, term359884.getClass(), "_primary", term360006);
        setField(term359762, term359762.getClass(), "_primary", term359884);
        setField(term359640, term359640.getClass(), "_primary", term359762);
        setField(term359518, term359518.getClass(), "_primary", term359640);
        setField(term359396, term359396.getClass(), "_primary", term359518);
        setField(term359274, term359274.getClass(), "_primary", term359396);
        setField(term359152, term359152.getClass(), "_primary", term359274);
        setField(term359030, term359030.getClass(), "_primary", term359152);
        setField(term358908, term358908.getClass(), "_primary", term359030);
        setField(term358786, term358786.getClass(), "_primary", term358908);
        setField(term358664, term358664.getClass(), "_primary", term358786);
        setField(term358542, term358542.getClass(), "_primary", term358664);
        setField(term358420, term358420.getClass(), "_primary", term358542);
        setField(term358298, term358298.getClass(), "_primary", term358420);
        setField(term358176, term358176.getClass(), "_primary", term358298);
        setField(term358054, term358054.getClass(), "_primary", term358176);
        setField(term357932, term357932.getClass(), "_primary", term358054);
        setField(term357810, term357810.getClass(), "_primary", term357932);
        setField(term357688, term357688.getClass(), "_primary", term357810);
        setField(term357566, term357566.getClass(), "_primary", term357688);
        setField(term357444, term357444.getClass(), "_primary", term357566);
        setField(term357322, term357322.getClass(), "_primary", term357444);
        setField(term357200, term357200.getClass(), "_primary", term357322);
        setField(term357078, term357078.getClass(), "_primary", term357200);
        setField(term356956, term356956.getClass(), "_primary", term357078);
        setField(term356834, term356834.getClass(), "_primary", term356956);
        setField(term356712, term356712.getClass(), "_primary", term356834);
        setField(term356590, term356590.getClass(), "_primary", term356712);
        setField(term356468, term356468.getClass(), "_primary", term356590);
        setField(term356346, term356346.getClass(), "_primary", term356468);
        setField(term356224, term356224.getClass(), "_primary", term356346);
        setField(term356102, term356102.getClass(), "_primary", term356224);
        setField(term355980, term355980.getClass(), "_primary", term356102);
        setField(term355858, term355858.getClass(), "_primary", term355980);
        setField(term355736, term355736.getClass(), "_primary", term355858);
        setField(term355576, term355576.getClass(), "_introspector", term355736);
        setField(term355576, term355576.getClass(), "_member", term362836);
        term362956 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        term363072 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeSerializer");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[7] = boolean.class;
        argTypes[8] = Class.forName("java.lang.Object");
        Object[] args = new Object[9];
        args[0] = term355576;
        args[1] = term362956;
        args[2] = term363072;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
