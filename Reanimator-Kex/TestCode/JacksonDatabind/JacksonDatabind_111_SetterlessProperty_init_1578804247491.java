package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetterlessProperty_init_1578804247491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554399;

    public SetterlessProperty_init_1578804247491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term554265 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty"));
        term554399 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term554541 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term554683 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term554825 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term554967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555109 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555251 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555393 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555535 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555677 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555819 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term555961 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556103 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556245 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556387 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556671 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556813 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term556955 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557097 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557239 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557523 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557665 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557807 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term557949 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558091 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558233 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558375 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558517 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558659 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558801 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term558943 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559085 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559227 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559369 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559511 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559653 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559795 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term559937 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560079 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560221 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560363 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560505 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560647 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560789 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term560931 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561073 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561215 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561357 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561499 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561641 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561783 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term561925 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562067 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562209 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562351 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562493 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562635 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562777 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term562919 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term563061 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        Object term563209 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term563339 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(term554399, term554399.getClass(), "_fullName", null);
        setField(term563061, term563061.getClass(), "_primary", term563209);
        setField(term562919, term562919.getClass(), "_primary", term563061);
        setField(term562777, term562777.getClass(), "_primary", term562919);
        setField(term562635, term562635.getClass(), "_primary", term562777);
        setField(term562493, term562493.getClass(), "_primary", term562635);
        setField(term562351, term562351.getClass(), "_primary", term562493);
        setField(term562209, term562209.getClass(), "_primary", term562351);
        setField(term562067, term562067.getClass(), "_primary", term562209);
        setField(term561925, term561925.getClass(), "_primary", term562067);
        setField(term561783, term561783.getClass(), "_primary", term561925);
        setField(term561641, term561641.getClass(), "_primary", term561783);
        setField(term561499, term561499.getClass(), "_primary", term561641);
        setField(term561357, term561357.getClass(), "_primary", term561499);
        setField(term561215, term561215.getClass(), "_primary", term561357);
        setField(term561073, term561073.getClass(), "_primary", term561215);
        setField(term560931, term560931.getClass(), "_primary", term561073);
        setField(term560789, term560789.getClass(), "_primary", term560931);
        setField(term560647, term560647.getClass(), "_primary", term560789);
        setField(term560505, term560505.getClass(), "_primary", term560647);
        setField(term560363, term560363.getClass(), "_primary", term560505);
        setField(term560221, term560221.getClass(), "_primary", term560363);
        setField(term560079, term560079.getClass(), "_primary", term560221);
        setField(term559937, term559937.getClass(), "_primary", term560079);
        setField(term559795, term559795.getClass(), "_primary", term559937);
        setField(term559653, term559653.getClass(), "_primary", term559795);
        setField(term559511, term559511.getClass(), "_primary", term559653);
        setField(term559369, term559369.getClass(), "_primary", term559511);
        setField(term559227, term559227.getClass(), "_primary", term559369);
        setField(term559085, term559085.getClass(), "_primary", term559227);
        setField(term558943, term558943.getClass(), "_primary", term559085);
        setField(term558801, term558801.getClass(), "_primary", term558943);
        setField(term558659, term558659.getClass(), "_primary", term558801);
        setField(term558517, term558517.getClass(), "_primary", term558659);
        setField(term558375, term558375.getClass(), "_primary", term558517);
        setField(term558233, term558233.getClass(), "_primary", term558375);
        setField(term558091, term558091.getClass(), "_primary", term558233);
        setField(term557949, term557949.getClass(), "_primary", term558091);
        setField(term557807, term557807.getClass(), "_primary", term557949);
        setField(term557665, term557665.getClass(), "_primary", term557807);
        setField(term557523, term557523.getClass(), "_primary", term557665);
        setField(term557381, term557381.getClass(), "_primary", term557523);
        setField(term557239, term557239.getClass(), "_primary", term557381);
        setField(term557097, term557097.getClass(), "_primary", term557239);
        setField(term556955, term556955.getClass(), "_primary", term557097);
        setField(term556813, term556813.getClass(), "_primary", term556955);
        setField(term556671, term556671.getClass(), "_primary", term556813);
        setField(term556529, term556529.getClass(), "_primary", term556671);
        setField(term556387, term556387.getClass(), "_primary", term556529);
        setField(term556245, term556245.getClass(), "_primary", term556387);
        setField(term556103, term556103.getClass(), "_primary", term556245);
        setField(term555961, term555961.getClass(), "_primary", term556103);
        setField(term555819, term555819.getClass(), "_primary", term555961);
        setField(term555677, term555677.getClass(), "_primary", term555819);
        setField(term555535, term555535.getClass(), "_primary", term555677);
        setField(term555393, term555393.getClass(), "_primary", term555535);
        setField(term555251, term555251.getClass(), "_primary", term555393);
        setField(term555109, term555109.getClass(), "_primary", term555251);
        setField(term554967, term554967.getClass(), "_primary", term555109);
        setField(term554825, term554825.getClass(), "_primary", term554967);
        setField(term554683, term554683.getClass(), "_primary", term554825);
        setField(term554541, term554541.getClass(), "_primary", term554683);
        setField(term554399, term554399.getClass(), "_annotationIntrospector", term554541);
        setField(term554399, term554399.getClass(), "_member", term563339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.SetterlessProperty");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.Annotations");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
        Object[] args = new Object[5];
        args[0] = term554399;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


