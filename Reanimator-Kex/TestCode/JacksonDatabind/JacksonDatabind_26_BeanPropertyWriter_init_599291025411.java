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

public class BeanPropertyWriter_init_599291025411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258289;
     Object term258825;
     Object term261372;
     Object term261396;
     Object term261402;

    public BeanPropertyWriter_init_599291025411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term257933 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term258049 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term257673 = (Object[]) newArray("java.lang.Class", 0);
        Object term258161 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(term257933, term257933.getClass(), "_member", null);
        setField(term257933, term257933.getClass(), "_contextAnnotations", term258049);
        setField(term257933, term257933.getClass(), "_name", null);
        setField(term257933, term257933.getClass(), "_wrapperName", null);
        setField(term257933, term257933.getClass(), "_metadata", null);
        setField(term257933, term257933.getClass(), "_includeInViews", term257673);
        setField(term257933, term257933.getClass(), "_declaredType", null);
        setField(term257933, term257933.getClass(), "_serializer", term258161);
        setField(term257933, term257933.getClass(), "_dynamicSerializers", null);
        setField(term257933, term257933.getClass(), "_typeSerializer", null);
        setField(term257933, term257933.getClass(), "_cfgSerializationType", null);
        term258289 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term258381 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term258561 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term258705 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term258381, term258381.getClass(), "_simpleName", "");
        setField(term258289, term258289.getClass(), "_name", term258381);
        setBooleanField(term258289, term258289.getClass(), "_forSerialization", false);
        setField(term258289, term258289.getClass(), "_ctorParameters", null);
        setField(term258561, term258561.getClass(), "next", null);
        setField(term258561, term258561.getClass(), "value", null);
        setField(term258289, term258289.getClass(), "_setters", term258561);
        setField(term258289, term258289.getClass(), "_fields", null);
        setField(term258289, term258289.getClass(), "_annotationIntrospector", term258705);
        Class<? extends Object> term261455 = Class.forName((String) "java.util.stream.Sink$ChainedLong");
        Object[] term261596 = (Object[]) newArray("java.lang.Class", 0);
        Method term258879 = ((Class) term261455).getDeclaredMethod((String) "end", (Class[]) term261596);
        ((Method) term258879).setAccessible(false);
        term258825 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term258825, term258825.getClass(), "_method", term258879);
        Class<? extends Object> term261668 = Class.forName((String) "java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask");
        Object[] term261982 = (Object[]) newArray("java.lang.Class", 0);
        Method term261378 = ((Class) term261668).getDeclaredMethod((String) "setNextRunTime", (Class[]) term261982);
        ((Method) term261378).setAccessible(false);
        term261372 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object term261373 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term261376 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term261377 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Object term261395 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty"));
        setField(term261373, term261373.getClass(), "_value", "");
        setField(term261373, term261373.getClass(), "_quotedUTF8Ref", null);
        setField(term261373, term261373.getClass(), "_unquotedUTF8Ref", null);
        setField(term261373, term261373.getClass(), "_quotedChars", null);
        setField(term261373, term261373.getClass(), "_jdkSerializeValue", null);
        setField(term261372, term261372.getClass(), "_name", term261373);
        setField(term261372, term261372.getClass(), "_wrapperName", null);
        setField(term261372, term261372.getClass(), "_declaredType", null);
        setField(term261372, term261372.getClass(), "_cfgSerializationType", null);
        setField(term261372, term261372.getClass(), "_nonTrivialBaseType", null);
        setField(term261372, term261372.getClass(), "_contextAnnotations", null);
        setField(term261376, term261376.getClass(), "_required", null);
        setField(term261376, term261376.getClass(), "_description", null);
        setField(term261376, term261376.getClass(), "_index", null);
        setField(term261376, term261376.getClass(), "_defaultValue", null);
        setField(term261372, term261372.getClass(), "_metadata", term261376);
        setField(term261372, term261372.getClass(), "_format", null);
        setField(term261377, term261377.getClass(), "_method", term261378);
        setField(term261377, term261377.getClass(), "_paramClasses", null);
        setField(term261377, term261377.getClass(), "_serialization", null);
        setField(term261377, term261377.getClass(), "_paramAnnotations", null);
        setField(term261377, term261377.getClass(), "_context", null);
        setField(term261377, term261377.getClass(), "_annotations", null);
        setField(term261372, term261372.getClass(), "_member", term261377);
        setField(term261372, term261372.getClass(), "_accessorMethod", term261378);
        setField(term261372, term261372.getClass(), "_field", null);
        setField(term261372, term261372.getClass(), "_serializer", null);
        setField(term261372, term261372.getClass(), "_nullSerializer", null);
        setField(term261372, term261372.getClass(), "_typeSerializer", null);
        setBooleanField(term261395, term261395.getClass(), "_resetWhenFull", false);
        setField(term261372, term261372.getClass(), "_dynamicSerializers", term261395);
        setBooleanField(term261372, term261372.getClass(), "_suppressNulls", false);
        setField(term261372, term261372.getClass(), "_suppressableValue", null);
        setField(term261372, term261372.getClass(), "_includeInViews", null);
        setField(term261372, term261372.getClass(), "_internalSettings", null);
        term261396 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term261397 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term261398 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term261401 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term261396, term261396.getClass(), "_forSerialization", false);
        setField(term261396, term261396.getClass(), "_annotationIntrospector", term261397);
        setField(term261398, term261398.getClass(), "_simpleName", "");
        setField(term261398, term261398.getClass(), "_namespace", null);
        setField(term261398, term261398.getClass(), "_encodedSimple", null);
        setField(term261396, term261396.getClass(), "_name", term261398);
        setField(term261396, term261396.getClass(), "_internalName", null);
        setField(term261396, term261396.getClass(), "_fields", null);
        setField(term261396, term261396.getClass(), "_ctorParameters", null);
        setField(term261396, term261396.getClass(), "_getters", null);
        setField(term261401, term261401.getClass(), "value", null);
        setField(term261401, term261401.getClass(), "next", null);
        setField(term261401, term261401.getClass(), "name", null);
        setBooleanField(term261401, term261401.getClass(), "isNameExplicit", false);
        setBooleanField(term261401, term261401.getClass(), "isVisible", false);
        setBooleanField(term261401, term261401.getClass(), "isMarkedIgnored", false);
        setField(term261396, term261396.getClass(), "_setters", term261401);
        Class<? extends Object> term262359 = Class.forName((String) "com.fasterxml.jackson.databind.annotation.JsonAppend");
        Object[] term262595 = (Object[]) newArray("java.lang.Class", 0);
        Method term261403 = ((Class) term262359).getDeclaredMethod((String) "prepend", (Class[]) term262595);
        ((Method) term261403).setAccessible(false);
        term261402 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(term261402, term261402.getClass(), "_method", term261403);
        setField(term261402, term261402.getClass(), "_paramClasses", null);
        setField(term261402, term261402.getClass(), "_serialization", null);
        setField(term261402, term261402.getClass(), "_paramAnnotations", null);
        setField(term261402, term261402.getClass(), "_context", null);
        setField(term261402, term261402.getClass(), "_annotations", null);
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
        args[0] = term258289;
        args[1] = term258825;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term261372));
        assertTrue(recursiveEquals(term258289, term261396));
        assertTrue(recursiveEquals(term258825, term261402));
    }

};


