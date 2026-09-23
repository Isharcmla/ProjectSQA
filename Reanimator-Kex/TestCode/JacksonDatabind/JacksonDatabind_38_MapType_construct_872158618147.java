package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class MapType_construct_872158618147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43632;
     Object term43736;
     Object term43840;
     Object term45141;
     Object term45142;
     Object term45143;
     Object term44984;

    public MapType_construct_872158618147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43632 = Class.forName((String) "java.util.stream.StreamSpliterators$UnorderedSliceSpliterator$OfPrimitive");
        term43736 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term43736, term43736.getClass(), "_hash", 0);
        term43840 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term43840, term43840.getClass(), "_hash", 0);
        term45141 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term45141, term45141.getClass(), "_referencedType", null);
        setField(term45141, term45141.getClass(), "_superClass", null);
        setField(term45141, term45141.getClass(), "_superInterfaces", null);
        setField(term45141, term45141.getClass(), "_bindings", null);
        setField(term45141, term45141.getClass(), "_canonicalName", null);
        setField(term45141, term45141.getClass(), "_class", null);
        setIntField(term45141, term45141.getClass(), "_hash", 0);
        setField(term45141, term45141.getClass(), "_valueHandler", null);
        setField(term45141, term45141.getClass(), "_typeHandler", null);
        setBooleanField(term45141, term45141.getClass(), "_asStatic", false);
        term45142 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term45142, term45142.getClass(), "_referencedType", null);
        setField(term45142, term45142.getClass(), "_superClass", null);
        setField(term45142, term45142.getClass(), "_superInterfaces", null);
        setField(term45142, term45142.getClass(), "_bindings", null);
        setField(term45142, term45142.getClass(), "_canonicalName", null);
        setField(term45142, term45142.getClass(), "_class", null);
        setIntField(term45142, term45142.getClass(), "_hash", 0);
        setField(term45142, term45142.getClass(), "_valueHandler", null);
        setField(term45142, term45142.getClass(), "_typeHandler", null);
        setBooleanField(term45142, term45142.getClass(), "_asStatic", false);
        term45143 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6");
        Class<? extends Object> term44989 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6");
        term44984 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term44977 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term44981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term44985 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term44986 = (Object[]) newArray("java.lang.String", 0);
        Object[] term44987 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term44977, term44977.getClass(), "_referencedType", null);
        setField(term44977, term44977.getClass(), "_superClass", null);
        setField(term44977, term44977.getClass(), "_superInterfaces", null);
        setField(term44977, term44977.getClass(), "_bindings", null);
        setField(term44977, term44977.getClass(), "_canonicalName", null);
        setField(term44977, term44977.getClass(), "_class", null);
        setIntField(term44977, term44977.getClass(), "_hash", 0);
        setField(term44977, term44977.getClass(), "_valueHandler", null);
        setField(term44977, term44977.getClass(), "_typeHandler", null);
        setBooleanField(term44977, term44977.getClass(), "_asStatic", false);
        setField(term44984, term44984.getClass(), "_keyType", term44977);
        setField(term44981, term44981.getClass(), "_referencedType", null);
        setField(term44981, term44981.getClass(), "_superClass", null);
        setField(term44981, term44981.getClass(), "_superInterfaces", null);
        setField(term44981, term44981.getClass(), "_bindings", null);
        setField(term44981, term44981.getClass(), "_canonicalName", null);
        setField(term44981, term44981.getClass(), "_class", null);
        setIntField(term44981, term44981.getClass(), "_hash", 0);
        setField(term44981, term44981.getClass(), "_valueHandler", null);
        setField(term44981, term44981.getClass(), "_typeHandler", null);
        setBooleanField(term44981, term44981.getClass(), "_asStatic", false);
        setField(term44984, term44984.getClass(), "_valueType", term44981);
        setField(term44984, term44984.getClass(), "_superClass", null);
        setField(term44984, term44984.getClass(), "_superInterfaces", null);
        setField(term44985, term44985.getClass(), "_names", term44986);
        setField(term44985, term44985.getClass(), "_types", term44987);
        setField(term44985, term44985.getClass(), "_unboundVariables", null);
        setIntField(term44985, term44985.getClass(), "_hashCode", 1);
        setField(term44984, term44984.getClass(), "_bindings", term44985);
        setField(term44984, term44984.getClass(), "_canonicalName", null);
        setField(term44984, term44984.getClass(), "_class", term44989);
        setIntField(term44984, term44984.getClass(), "_hash", -1165529646);
        setField(term44984, term44984.getClass(), "_valueHandler", null);
        setField(term44984, term44984.getClass(), "_typeHandler", null);
        setBooleanField(term44984, term44984.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[6];
        args[0] = term43632;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term43736;
        args[5] = term43840;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term43632, term45141));
        assertTrue(recursiveEquals(term43736, null));
        assertTrue(recursiveEquals(term43840, null));
        assertTrue(recursiveEquals(retValue, term44984));
    }

};


