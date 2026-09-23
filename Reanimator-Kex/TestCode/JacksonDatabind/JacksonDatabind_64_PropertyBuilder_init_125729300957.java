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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class PropertyBuilder_init_125729300957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47066;
     Object term47302;
     Object term47622;
     Object term47632;
     Object term47634;

    public PropertyBuilder_init_125729300957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46724 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term46830 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term46960 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term46724, term46724.getClass(), "_config", term46830);
        setField(term46724, term46724.getClass(), "_beanDesc", term46960);
        term47066 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term47172 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term47172, term47172.getClass(), "_overrides", null);
        setField(term47066, term47066.getClass(), "_configOverrides", term47172);
        term47302 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term47406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term47302, term47302.getClass(), "_annotationIntrospector", null);
        setField(term47406, term47406.getClass(), "_class", null);
        setField(term47302, term47302.getClass(), "_type", term47406);
        Class<? extends Object> term47637 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonInclude$Include");
        Field term47636 = ((Class) term47637).getDeclaredField((String) "USE_DEFAULTS");
        ((Field) term47636).setAccessible(true);
        Object enum5 = ((Field) term47636).get((Object) null);
        term47622 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        Object term47623 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term47624 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        Object term47625 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term47626 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term47627 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term47628 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Value"));
        setField(term47623, term47623.getClass(), "_filterProvider", null);
        setField(term47623, term47623.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term47623, term47623.getClass(), "_serFeatures", 0);
        setIntField(term47623, term47623.getClass(), "_generatorFeatures", 0);
        setIntField(term47623, term47623.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term47623, term47623.getClass(), "_formatWriteFeatures", 0);
        setIntField(term47623, term47623.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term47623, term47623.getClass(), "_serializationInclusion", null);
        setField(term47623, term47623.getClass(), "_mixIns", null);
        setField(term47623, term47623.getClass(), "_subtypeResolver", null);
        setField(term47623, term47623.getClass(), "_rootName", null);
        setField(term47623, term47623.getClass(), "_view", null);
        setField(term47623, term47623.getClass(), "_attributes", null);
        setField(term47623, term47623.getClass(), "_rootNames", null);
        setField(term47624, term47624.getClass(), "_overrides", null);
        setField(term47623, term47623.getClass(), "_configOverrides", term47624);
        setIntField(term47623, term47623.getClass(), "_mapperFeatures", 0);
        setField(term47623, term47623.getClass(), "_base", null);
        setField(term47622, term47622.getClass(), "_config", term47623);
        setField(term47625, term47625.getClass(), "_propCollector", null);
        setField(term47625, term47625.getClass(), "_config", null);
        setField(term47625, term47625.getClass(), "_annotationIntrospector", null);
        setField(term47625, term47625.getClass(), "_classInfo", null);
        setField(term47625, term47625.getClass(), "_properties", null);
        setField(term47625, term47625.getClass(), "_objectIdInfo", null);
        setField(term47626, term47626.getClass(), "_referencedType", null);
        setField(term47626, term47626.getClass(), "_anchorType", null);
        setField(term47626, term47626.getClass(), "_superClass", null);
        setField(term47626, term47626.getClass(), "_superInterfaces", null);
        setField(term47626, term47626.getClass(), "_bindings", null);
        setField(term47626, term47626.getClass(), "_canonicalName", null);
        setField(term47626, term47626.getClass(), "_class", null);
        setIntField(term47626, term47626.getClass(), "_hash", 0);
        setField(term47626, term47626.getClass(), "_valueHandler", null);
        setField(term47626, term47626.getClass(), "_typeHandler", null);
        setBooleanField(term47626, term47626.getClass(), "_asStatic", false);
        setField(term47625, term47625.getClass(), "_type", term47626);
        setField(term47622, term47622.getClass(), "_beanDesc", term47625);
        setField(term47622, term47622.getClass(), "_annotationIntrospector", term47627);
        setField(term47622, term47622.getClass(), "_defaultBean", null);
        setField(term47628, term47628.getClass(), "_valueInclusion", enum5);
        setField(term47628, term47628.getClass(), "_contentInclusion", enum5);
        setField(term47622, term47622.getClass(), "_defaultInclusion", term47628);
        setBooleanField(term47622, term47622.getClass(), "_useRealPropertyDefaults", false);
        term47632 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term47633 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term47632, term47632.getClass(), "_propCollector", null);
        setField(term47632, term47632.getClass(), "_config", null);
        setField(term47632, term47632.getClass(), "_annotationIntrospector", null);
        setField(term47632, term47632.getClass(), "_classInfo", null);
        setField(term47632, term47632.getClass(), "_properties", null);
        setField(term47632, term47632.getClass(), "_objectIdInfo", null);
        setField(term47633, term47633.getClass(), "_referencedType", null);
        setField(term47633, term47633.getClass(), "_anchorType", null);
        setField(term47633, term47633.getClass(), "_superClass", null);
        setField(term47633, term47633.getClass(), "_superInterfaces", null);
        setField(term47633, term47633.getClass(), "_bindings", null);
        setField(term47633, term47633.getClass(), "_canonicalName", null);
        setField(term47633, term47633.getClass(), "_class", null);
        setIntField(term47633, term47633.getClass(), "_hash", 0);
        setField(term47633, term47633.getClass(), "_valueHandler", null);
        setField(term47633, term47633.getClass(), "_typeHandler", null);
        setBooleanField(term47633, term47633.getClass(), "_asStatic", false);
        setField(term47632, term47632.getClass(), "_type", term47633);
        term47634 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Object term47635 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ConfigOverrides"));
        setField(term47634, term47634.getClass(), "_filterProvider", null);
        setField(term47634, term47634.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term47634, term47634.getClass(), "_serFeatures", 0);
        setIntField(term47634, term47634.getClass(), "_generatorFeatures", 0);
        setIntField(term47634, term47634.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term47634, term47634.getClass(), "_formatWriteFeatures", 0);
        setIntField(term47634, term47634.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term47634, term47634.getClass(), "_serializationInclusion", null);
        setField(term47634, term47634.getClass(), "_mixIns", null);
        setField(term47634, term47634.getClass(), "_subtypeResolver", null);
        setField(term47634, term47634.getClass(), "_rootName", null);
        setField(term47634, term47634.getClass(), "_view", null);
        setField(term47634, term47634.getClass(), "_attributes", null);
        setField(term47634, term47634.getClass(), "_rootNames", null);
        setField(term47635, term47635.getClass(), "_overrides", null);
        setField(term47634, term47634.getClass(), "_configOverrides", term47635);
        setIntField(term47634, term47634.getClass(), "_mapperFeatures", 0);
        setField(term47634, term47634.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        Object[] args = new Object[2];
        args[0] = term47066;
        args[1] = term47302;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47622));
        assertTrue(recursiveEquals(term47066, term47632));
        assertTrue(recursiveEquals(term47302, term47634));
    }

};


