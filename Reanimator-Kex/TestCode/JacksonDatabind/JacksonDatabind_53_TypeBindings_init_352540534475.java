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

public class TypeBindings_init_352540534475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186508;
     Object term186513;
     Object term187493;
     Object term187508;
     Object term187517;

    public TypeBindings_init_352540534475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186679 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term186518 = (Object[]) newArray("java.lang.String", 0);
        Object[] term186519 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term186679, term186679.getClass(), "_names", term186518);
        setField(term186679, term186679.getClass(), "_types", term186519);
        term186508 = (Object[]) newArray("java.lang.String", 4);
        setElement(term186508, 0, "");
        setElement(term186508, 1, "");
        setElement(term186508, 2, "");
        setElement(term186508, 3, "");
        term186513 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term186937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term187033 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term187153 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term187257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term186937, term186937.getClass(), "_hash", 0);
        setElement(term186513, 0, term186937);
        setIntField(term187033, term187033.getClass(), "_hash", 0);
        setElement(term186513, 1, term187033);
        setIntField(term187153, term187153.getClass(), "_hash", 0);
        setElement(term186513, 2, term187153);
        setElement(term186513, 3, term187257);
        term187493 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term187494 = (Object[]) newArray("java.lang.String", 4);
        Object[] term187503 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term187504 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term187505 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term187506 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term187507 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setElement(term187494, 0, "");
        setElement(term187494, 1, "");
        setElement(term187494, 2, "");
        setElement(term187494, 3, "");
        setField(term187493, term187493.getClass(), "_names", term187494);
        setField(term187504, term187504.getClass(), "_elementType", null);
        setField(term187504, term187504.getClass(), "_superClass", null);
        setField(term187504, term187504.getClass(), "_superInterfaces", null);
        setField(term187504, term187504.getClass(), "_bindings", null);
        setField(term187504, term187504.getClass(), "_canonicalName", null);
        setField(term187504, term187504.getClass(), "_class", null);
        setIntField(term187504, term187504.getClass(), "_hash", 0);
        setField(term187504, term187504.getClass(), "_valueHandler", null);
        setField(term187504, term187504.getClass(), "_typeHandler", null);
        setBooleanField(term187504, term187504.getClass(), "_asStatic", false);
        setElement(term187503, 0, term187504);
        setField(term187505, term187505.getClass(), "_componentType", null);
        setField(term187505, term187505.getClass(), "_emptyArray", null);
        setField(term187505, term187505.getClass(), "_superClass", null);
        setField(term187505, term187505.getClass(), "_superInterfaces", null);
        setField(term187505, term187505.getClass(), "_bindings", null);
        setField(term187505, term187505.getClass(), "_canonicalName", null);
        setField(term187505, term187505.getClass(), "_class", null);
        setIntField(term187505, term187505.getClass(), "_hash", 0);
        setField(term187505, term187505.getClass(), "_valueHandler", null);
        setField(term187505, term187505.getClass(), "_typeHandler", null);
        setBooleanField(term187505, term187505.getClass(), "_asStatic", false);
        setElement(term187503, 1, term187505);
        setField(term187506, term187506.getClass(), "_referencedType", null);
        setField(term187506, term187506.getClass(), "_superClass", null);
        setField(term187506, term187506.getClass(), "_superInterfaces", null);
        setField(term187506, term187506.getClass(), "_bindings", null);
        setField(term187506, term187506.getClass(), "_canonicalName", null);
        setField(term187506, term187506.getClass(), "_class", null);
        setIntField(term187506, term187506.getClass(), "_hash", 0);
        setField(term187506, term187506.getClass(), "_valueHandler", null);
        setField(term187506, term187506.getClass(), "_typeHandler", null);
        setBooleanField(term187506, term187506.getClass(), "_asStatic", false);
        setElement(term187503, 2, term187506);
        setField(term187507, term187507.getClass(), "_referencedType", null);
        setField(term187507, term187507.getClass(), "_superClass", null);
        setField(term187507, term187507.getClass(), "_superInterfaces", null);
        setField(term187507, term187507.getClass(), "_bindings", null);
        setField(term187507, term187507.getClass(), "_canonicalName", null);
        setField(term187507, term187507.getClass(), "_class", null);
        setIntField(term187507, term187507.getClass(), "_hash", 0);
        setField(term187507, term187507.getClass(), "_valueHandler", null);
        setField(term187507, term187507.getClass(), "_typeHandler", null);
        setBooleanField(term187507, term187507.getClass(), "_asStatic", false);
        setElement(term187503, 3, term187507);
        setField(term187493, term187493.getClass(), "_types", term187503);
        setField(term187493, term187493.getClass(), "_unboundVariables", null);
        setIntField(term187493, term187493.getClass(), "_hashCode", 1);
        term187508 = (Object[]) newArray("java.lang.String", 4);
        setElement(term187508, 0, "");
        setElement(term187508, 1, "");
        setElement(term187508, 2, "");
        setElement(term187508, 3, "");
        term187517 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term187518 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term187519 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term187520 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term187521 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term187518, term187518.getClass(), "_elementType", null);
        setField(term187518, term187518.getClass(), "_superClass", null);
        setField(term187518, term187518.getClass(), "_superInterfaces", null);
        setField(term187518, term187518.getClass(), "_bindings", null);
        setField(term187518, term187518.getClass(), "_canonicalName", null);
        setField(term187518, term187518.getClass(), "_class", null);
        setIntField(term187518, term187518.getClass(), "_hash", 0);
        setField(term187518, term187518.getClass(), "_valueHandler", null);
        setField(term187518, term187518.getClass(), "_typeHandler", null);
        setBooleanField(term187518, term187518.getClass(), "_asStatic", false);
        setElement(term187517, 0, term187518);
        setField(term187519, term187519.getClass(), "_componentType", null);
        setField(term187519, term187519.getClass(), "_emptyArray", null);
        setField(term187519, term187519.getClass(), "_superClass", null);
        setField(term187519, term187519.getClass(), "_superInterfaces", null);
        setField(term187519, term187519.getClass(), "_bindings", null);
        setField(term187519, term187519.getClass(), "_canonicalName", null);
        setField(term187519, term187519.getClass(), "_class", null);
        setIntField(term187519, term187519.getClass(), "_hash", 0);
        setField(term187519, term187519.getClass(), "_valueHandler", null);
        setField(term187519, term187519.getClass(), "_typeHandler", null);
        setBooleanField(term187519, term187519.getClass(), "_asStatic", false);
        setElement(term187517, 1, term187519);
        setField(term187520, term187520.getClass(), "_referencedType", null);
        setField(term187520, term187520.getClass(), "_superClass", null);
        setField(term187520, term187520.getClass(), "_superInterfaces", null);
        setField(term187520, term187520.getClass(), "_bindings", null);
        setField(term187520, term187520.getClass(), "_canonicalName", null);
        setField(term187520, term187520.getClass(), "_class", null);
        setIntField(term187520, term187520.getClass(), "_hash", 0);
        setField(term187520, term187520.getClass(), "_valueHandler", null);
        setField(term187520, term187520.getClass(), "_typeHandler", null);
        setBooleanField(term187520, term187520.getClass(), "_asStatic", false);
        setElement(term187517, 2, term187520);
        setField(term187521, term187521.getClass(), "_referencedType", null);
        setField(term187521, term187521.getClass(), "_superClass", null);
        setField(term187521, term187521.getClass(), "_superInterfaces", null);
        setField(term187521, term187521.getClass(), "_bindings", null);
        setField(term187521, term187521.getClass(), "_canonicalName", null);
        setField(term187521, term187521.getClass(), "_class", null);
        setIntField(term187521, term187521.getClass(), "_hash", 0);
        setField(term187521, term187521.getClass(), "_valueHandler", null);
        setField(term187521, term187521.getClass(), "_typeHandler", null);
        setBooleanField(term187521, term187521.getClass(), "_asStatic", false);
        setElement(term187517, 3, term187521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term186508;
        args[1] = term186513;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term187493));
        assertTrue(recursiveEquals(term186508, term187508));
        assertTrue(recursiveEquals(term186513, term187517));
    }

};


