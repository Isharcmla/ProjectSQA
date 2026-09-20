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

public class BeanPropertyWriter_init_599291025183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400662;
     Object term406098;

    public BeanPropertyWriter_init_599291025183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term400408 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term400528 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term400408, term400408.getClass(), "_member", term400528);
        setField(term400408, term400408.getClass(), "_contextAnnotations", null);
        setField(term400408, term400408.getClass(), "_name", null);
        term400662 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term400822 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term400944 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401066 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401188 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401310 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401432 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401554 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401676 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401798 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term401920 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402042 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402164 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402286 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402408 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402530 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402652 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402774 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term402896 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403018 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403140 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403262 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403384 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403506 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403628 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403750 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403872 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term403994 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404116 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404238 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404360 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404482 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404604 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404726 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404848 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term404970 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405092 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405214 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405336 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405458 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405580 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405702 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405824 = newInstance(Class.forName("com.fasterxml.jackson.databind.AnnotationIntrospector$Pair"));
        Object term405972 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term400662, term400662.getClass(), "_name", "");
        setField(term405824, term405824.getClass(), "_primary", term405972);
        setField(term405702, term405702.getClass(), "_primary", term405824);
        setField(term405580, term405580.getClass(), "_primary", term405702);
        setField(term405458, term405458.getClass(), "_primary", term405580);
        setField(term405336, term405336.getClass(), "_primary", term405458);
        setField(term405214, term405214.getClass(), "_primary", term405336);
        setField(term405092, term405092.getClass(), "_primary", term405214);
        setField(term404970, term404970.getClass(), "_primary", term405092);
        setField(term404848, term404848.getClass(), "_primary", term404970);
        setField(term404726, term404726.getClass(), "_primary", term404848);
        setField(term404604, term404604.getClass(), "_primary", term404726);
        setField(term404482, term404482.getClass(), "_primary", term404604);
        setField(term404360, term404360.getClass(), "_primary", term404482);
        setField(term404238, term404238.getClass(), "_primary", term404360);
        setField(term404116, term404116.getClass(), "_primary", term404238);
        setField(term403994, term403994.getClass(), "_primary", term404116);
        setField(term403872, term403872.getClass(), "_primary", term403994);
        setField(term403750, term403750.getClass(), "_primary", term403872);
        setField(term403628, term403628.getClass(), "_primary", term403750);
        setField(term403506, term403506.getClass(), "_primary", term403628);
        setField(term403384, term403384.getClass(), "_primary", term403506);
        setField(term403262, term403262.getClass(), "_primary", term403384);
        setField(term403140, term403140.getClass(), "_primary", term403262);
        setField(term403018, term403018.getClass(), "_primary", term403140);
        setField(term402896, term402896.getClass(), "_primary", term403018);
        setField(term402774, term402774.getClass(), "_primary", term402896);
        setField(term402652, term402652.getClass(), "_primary", term402774);
        setField(term402530, term402530.getClass(), "_primary", term402652);
        setField(term402408, term402408.getClass(), "_primary", term402530);
        setField(term402286, term402286.getClass(), "_primary", term402408);
        setField(term402164, term402164.getClass(), "_primary", term402286);
        setField(term402042, term402042.getClass(), "_primary", term402164);
        setField(term401920, term401920.getClass(), "_primary", term402042);
        setField(term401798, term401798.getClass(), "_primary", term401920);
        setField(term401676, term401676.getClass(), "_primary", term401798);
        setField(term401554, term401554.getClass(), "_primary", term401676);
        setField(term401432, term401432.getClass(), "_primary", term401554);
        setField(term401310, term401310.getClass(), "_primary", term401432);
        setField(term401188, term401188.getClass(), "_primary", term401310);
        setField(term401066, term401066.getClass(), "_primary", term401188);
        setField(term400944, term400944.getClass(), "_primary", term401066);
        setField(term400822, term400822.getClass(), "_primary", term400944);
        setField(term400662, term400662.getClass(), "_introspector", term400822);
        setField(term400662, term400662.getClass(), "_member", null);
        term406098 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
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
        args[0] = term400662;
        args[1] = term406098;
        args[2] = null;
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
