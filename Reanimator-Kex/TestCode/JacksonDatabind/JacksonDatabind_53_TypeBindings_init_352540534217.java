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
import java.lang.Object;

public class TypeBindings_init_352540534217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71366;
     Object term71367;
     Object term71952;
     Object term71958;
     Object term71959;

    public TypeBindings_init_352540534217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71529 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term71371 = (Object[]) newArray("java.lang.String", 0);
        setField(term71529, term71529.getClass(), "_names", term71371);
        setField(term71529, term71529.getClass(), "_types", null);
        term71366 = (Object[]) newArray("java.lang.String", 4);
        term71367 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term71649 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term71753 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term71857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term71649, term71649.getClass(), "_hash", 0);
        setElement(term71367, 0, term71649);
        setIntField(term71753, term71753.getClass(), "_hash", 0);
        setElement(term71367, 1, term71753);
        setIntField(term71857, term71857.getClass(), "_hash", 0);
        setElement(term71367, 2, term71857);
        setElement(term71367, 3, term71649);
        term71952 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term71953 = (Object[]) newArray("java.lang.String", 4);
        Object[] term71954 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term71955 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term71956 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term71957 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term71952, term71952.getClass(), "_names", term71953);
        setField(term71955, term71955.getClass(), "_referencedType", null);
        setField(term71955, term71955.getClass(), "_superClass", null);
        setField(term71955, term71955.getClass(), "_superInterfaces", null);
        setField(term71955, term71955.getClass(), "_bindings", null);
        setField(term71955, term71955.getClass(), "_canonicalName", null);
        setField(term71955, term71955.getClass(), "_class", null);
        setIntField(term71955, term71955.getClass(), "_hash", 0);
        setField(term71955, term71955.getClass(), "_valueHandler", null);
        setField(term71955, term71955.getClass(), "_typeHandler", null);
        setBooleanField(term71955, term71955.getClass(), "_asStatic", false);
        setElement(term71954, 0, term71955);
        setField(term71956, term71956.getClass(), "_referencedType", null);
        setField(term71956, term71956.getClass(), "_superClass", null);
        setField(term71956, term71956.getClass(), "_superInterfaces", null);
        setField(term71956, term71956.getClass(), "_bindings", null);
        setField(term71956, term71956.getClass(), "_canonicalName", null);
        setField(term71956, term71956.getClass(), "_class", null);
        setIntField(term71956, term71956.getClass(), "_hash", 0);
        setField(term71956, term71956.getClass(), "_valueHandler", null);
        setField(term71956, term71956.getClass(), "_typeHandler", null);
        setBooleanField(term71956, term71956.getClass(), "_asStatic", false);
        setElement(term71954, 1, term71956);
        setField(term71957, term71957.getClass(), "_referencedType", null);
        setField(term71957, term71957.getClass(), "_superClass", null);
        setField(term71957, term71957.getClass(), "_superInterfaces", null);
        setField(term71957, term71957.getClass(), "_bindings", null);
        setField(term71957, term71957.getClass(), "_canonicalName", null);
        setField(term71957, term71957.getClass(), "_class", null);
        setIntField(term71957, term71957.getClass(), "_hash", 0);
        setField(term71957, term71957.getClass(), "_valueHandler", null);
        setField(term71957, term71957.getClass(), "_typeHandler", null);
        setBooleanField(term71957, term71957.getClass(), "_asStatic", false);
        setElement(term71954, 2, term71957);
        setElement(term71954, 3, term71955);
        setField(term71952, term71952.getClass(), "_types", term71954);
        setField(term71952, term71952.getClass(), "_unboundVariables", null);
        setIntField(term71952, term71952.getClass(), "_hashCode", 1);
        term71958 = (Object[]) newArray("java.lang.String", 4);
        term71959 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term71960 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term71961 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term71962 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term71960, term71960.getClass(), "_referencedType", null);
        setField(term71960, term71960.getClass(), "_superClass", null);
        setField(term71960, term71960.getClass(), "_superInterfaces", null);
        setField(term71960, term71960.getClass(), "_bindings", null);
        setField(term71960, term71960.getClass(), "_canonicalName", null);
        setField(term71960, term71960.getClass(), "_class", null);
        setIntField(term71960, term71960.getClass(), "_hash", 0);
        setField(term71960, term71960.getClass(), "_valueHandler", null);
        setField(term71960, term71960.getClass(), "_typeHandler", null);
        setBooleanField(term71960, term71960.getClass(), "_asStatic", false);
        setElement(term71959, 0, term71960);
        setField(term71961, term71961.getClass(), "_referencedType", null);
        setField(term71961, term71961.getClass(), "_superClass", null);
        setField(term71961, term71961.getClass(), "_superInterfaces", null);
        setField(term71961, term71961.getClass(), "_bindings", null);
        setField(term71961, term71961.getClass(), "_canonicalName", null);
        setField(term71961, term71961.getClass(), "_class", null);
        setIntField(term71961, term71961.getClass(), "_hash", 0);
        setField(term71961, term71961.getClass(), "_valueHandler", null);
        setField(term71961, term71961.getClass(), "_typeHandler", null);
        setBooleanField(term71961, term71961.getClass(), "_asStatic", false);
        setElement(term71959, 1, term71961);
        setField(term71962, term71962.getClass(), "_referencedType", null);
        setField(term71962, term71962.getClass(), "_superClass", null);
        setField(term71962, term71962.getClass(), "_superInterfaces", null);
        setField(term71962, term71962.getClass(), "_bindings", null);
        setField(term71962, term71962.getClass(), "_canonicalName", null);
        setField(term71962, term71962.getClass(), "_class", null);
        setIntField(term71962, term71962.getClass(), "_hash", 0);
        setField(term71962, term71962.getClass(), "_valueHandler", null);
        setField(term71962, term71962.getClass(), "_typeHandler", null);
        setBooleanField(term71962, term71962.getClass(), "_asStatic", false);
        setElement(term71959, 2, term71962);
        setElement(term71959, 3, term71960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term71366;
        args[1] = term71367;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term71952));
        assertTrue(recursiveEquals(term71366, term71958));
        assertTrue(recursiveEquals(term71367, term71959));
    }

};


