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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_matchesObjectContext_192417931843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;

    public UnionType_matchesObjectContext_192417931843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term197 = new ArrayList();
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        ((ArrayList) term197).add((Object)null);
        HashMap term206 = new HashMap();
        HashMap term215 = new HashMap();
        Set<Object> term3766 =  ((Map) term215).keySet();
        HashSet term214 = new HashSet((Collection<? extends Object>) term3766);
        HashMap term222 = new HashMap();
        Set<Object> term3767 =  ((Map) term222).keySet();
        HashSet term221 = new HashSet((Collection<? extends Object>) term3767);
        HashMap term229 = new HashMap();
        Set<Object> term3768 =  ((Map) term229).keySet();
        HashSet term228 = new HashSet((Collection<? extends Object>) term3768);
        HashMap term235 = new HashMap();
        HashMap term243 = new HashMap();
        HashMap term248 = new HashMap();
        term196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term205 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term196, term196.getClass(), "alternates", term197);
        setIntField(term196, term196.getClass(), "hashcode", -1007160944);
        setBooleanField(term196, term196.getClass(), "resolved", true);
        setField(term196, term196.getClass(), "resolveResult", null);
        setBooleanField(term196, term196.getClass(), "inTemplatedCheckVisit", false);
        setField(term204, term204.getClass(), "reporter", null);
        setField(term204, term204.getClass(), "nativeTypes", term205);
        setField(term204, term204.getClass(), "namesToTypes", term206);
        setField(term204, term204.getClass(), "namespaces", term214);
        setField(term204, term204.getClass(), "nonNullableTypeNames", term221);
        setField(term204, term204.getClass(), "forwardDeclaredTypes", term228);
        setField(term204, term204.getClass(), "typesIndexedByProperty", term235);
        setField(term204, term204.getClass(), "eachRefTypeIndexedByProperty", term243);
        setField(term204, term204.getClass(), "greatestSubtypeByProperty", term248);
        setField(term204, term204.getClass(), "interfaceToImplementors", null);
        setField(term204, term204.getClass(), "unresolvedNamedTypes", null);
        setField(term204, term204.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term204, term204.getClass(), "lastGeneration", false);
        setField(term204, term204.getClass(), "templateTypes", null);
        setBooleanField(term204, term204.getClass(), "tolerateUndefinedValues", false);
        setField(term204, term204.getClass(), "resolveMode", null);
        setField(term196, term196.getClass(), "registry", term204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesObjectContext", argTypes, term196, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


