package com.google.javascript.rhino.jstype;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RecordTypeBuilder_build_3325644665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;

    public RecordTypeBuilder_build_3325644665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term208 = new HashMap();
        HashMap term217 = new HashMap();
        Set<Object> term891 =  ((Map) term217).keySet();
        HashSet term216 = new HashSet((Collection<? extends Object>) term891);
        HashMap term224 = new HashMap();
        Set<Object> term892 =  ((Map) term224).keySet();
        HashSet term223 = new HashSet((Collection<? extends Object>) term892);
        HashMap term231 = new HashMap();
        Set<Object> term893 =  ((Map) term231).keySet();
        HashSet term230 = new HashSet((Collection<? extends Object>) term893);
        HashMap term237 = new HashMap();
        HashMap term245 = new HashMap();
        HashMap term250 = new HashMap();
        HashMap term260 = new HashMap();
        term204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordTypeBuilder"));
        Object term206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term207 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setBooleanField(term204, term204.getClass(), "isEmpty", false);
        setField(term206, term206.getClass(), "reporter", null);
        setField(term206, term206.getClass(), "nativeTypes", term207);
        setField(term206, term206.getClass(), "namesToTypes", term208);
        setField(term206, term206.getClass(), "namespaces", term216);
        setField(term206, term206.getClass(), "nonNullableTypeNames", term223);
        setField(term206, term206.getClass(), "forwardDeclaredTypes", term230);
        setField(term206, term206.getClass(), "typesIndexedByProperty", term237);
        setField(term206, term206.getClass(), "eachRefTypeIndexedByProperty", term245);
        setField(term206, term206.getClass(), "greatestSubtypeByProperty", term250);
        setField(term206, term206.getClass(), "interfaceToImplementors", null);
        setField(term206, term206.getClass(), "unresolvedNamedTypes", null);
        setField(term206, term206.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term206, term206.getClass(), "lastGeneration", false);
        setField(term206, term206.getClass(), "templateTypeName", null);
        setField(term206, term206.getClass(), "templateType", null);
        setBooleanField(term206, term206.getClass(), "tolerateUndefinedValues", false);
        setField(term206, term206.getClass(), "resolveMode", null);
        setField(term204, term204.getClass(), "registry", term206);
        setField(term204, term204.getClass(), "properties", term260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term204, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


