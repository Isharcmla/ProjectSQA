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

public class TypeBindings_init_352540534163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55163;
     Object term55164;
     Object term55551;
     Object term55556;
     Object term55557;

    public TypeBindings_init_352540534163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55304 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term55167 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term55304, term55304.getClass(), "_names", null);
        setField(term55304, term55304.getClass(), "_types", term55167);
        term55163 = (Object[]) newArray("java.lang.String", 2);
        term55164 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term55424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term55524 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setIntField(term55424, term55424.getClass(), "_hash", 0);
        setElement(term55164, 0, term55424);
        setElement(term55164, 1, term55524);
        term55551 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term55552 = (Object[]) newArray("java.lang.String", 2);
        Object[] term55553 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term55554 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term55555 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term55551, term55551.getClass(), "_names", term55552);
        setField(term55554, term55554.getClass(), "_referencedType", null);
        setField(term55554, term55554.getClass(), "_superClass", null);
        setField(term55554, term55554.getClass(), "_superInterfaces", null);
        setField(term55554, term55554.getClass(), "_bindings", null);
        setField(term55554, term55554.getClass(), "_canonicalName", null);
        setField(term55554, term55554.getClass(), "_class", null);
        setIntField(term55554, term55554.getClass(), "_hash", 0);
        setField(term55554, term55554.getClass(), "_valueHandler", null);
        setField(term55554, term55554.getClass(), "_typeHandler", null);
        setBooleanField(term55554, term55554.getClass(), "_asStatic", false);
        setElement(term55553, 0, term55554);
        setField(term55555, term55555.getClass(), "_keyType", null);
        setField(term55555, term55555.getClass(), "_valueType", null);
        setField(term55555, term55555.getClass(), "_superClass", null);
        setField(term55555, term55555.getClass(), "_superInterfaces", null);
        setField(term55555, term55555.getClass(), "_bindings", null);
        setField(term55555, term55555.getClass(), "_canonicalName", null);
        setField(term55555, term55555.getClass(), "_class", null);
        setIntField(term55555, term55555.getClass(), "_hash", 0);
        setField(term55555, term55555.getClass(), "_valueHandler", null);
        setField(term55555, term55555.getClass(), "_typeHandler", null);
        setBooleanField(term55555, term55555.getClass(), "_asStatic", false);
        setElement(term55553, 1, term55555);
        setField(term55551, term55551.getClass(), "_types", term55553);
        setField(term55551, term55551.getClass(), "_unboundVariables", null);
        setIntField(term55551, term55551.getClass(), "_hashCode", 1);
        term55556 = (Object[]) newArray("java.lang.String", 2);
        term55557 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 2);
        Object term55558 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term55559 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term55558, term55558.getClass(), "_referencedType", null);
        setField(term55558, term55558.getClass(), "_superClass", null);
        setField(term55558, term55558.getClass(), "_superInterfaces", null);
        setField(term55558, term55558.getClass(), "_bindings", null);
        setField(term55558, term55558.getClass(), "_canonicalName", null);
        setField(term55558, term55558.getClass(), "_class", null);
        setIntField(term55558, term55558.getClass(), "_hash", 0);
        setField(term55558, term55558.getClass(), "_valueHandler", null);
        setField(term55558, term55558.getClass(), "_typeHandler", null);
        setBooleanField(term55558, term55558.getClass(), "_asStatic", false);
        setElement(term55557, 0, term55558);
        setField(term55559, term55559.getClass(), "_keyType", null);
        setField(term55559, term55559.getClass(), "_valueType", null);
        setField(term55559, term55559.getClass(), "_superClass", null);
        setField(term55559, term55559.getClass(), "_superInterfaces", null);
        setField(term55559, term55559.getClass(), "_bindings", null);
        setField(term55559, term55559.getClass(), "_canonicalName", null);
        setField(term55559, term55559.getClass(), "_class", null);
        setIntField(term55559, term55559.getClass(), "_hash", 0);
        setField(term55559, term55559.getClass(), "_valueHandler", null);
        setField(term55559, term55559.getClass(), "_typeHandler", null);
        setBooleanField(term55559, term55559.getClass(), "_asStatic", false);
        setElement(term55557, 1, term55559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term55163;
        args[1] = term55164;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55551));
        assertTrue(recursiveEquals(term55163, term55556));
        assertTrue(recursiveEquals(term55164, term55557));
    }

};


