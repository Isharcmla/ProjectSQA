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

public class UnionType_canBeCalled_23005174746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413;

    public UnionType_canBeCalled_23005174746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term414 = new ArrayList();
        ((ArrayList) term414).add((Object)null);
        HashMap term423 = new HashMap();
        HashMap term432 = new HashMap();
        Set<Object> term4422 =  ((Map) term432).keySet();
        HashSet term431 = new HashSet((Collection<? extends Object>) term4422);
        HashMap term439 = new HashMap();
        Set<Object> term4423 =  ((Map) term439).keySet();
        HashSet term438 = new HashSet((Collection<? extends Object>) term4423);
        HashMap term446 = new HashMap();
        Set<Object> term4424 =  ((Map) term446).keySet();
        HashSet term445 = new HashSet((Collection<? extends Object>) term4424);
        HashMap term452 = new HashMap();
        HashMap term460 = new HashMap();
        HashMap term465 = new HashMap();
        term413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term422 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term413, term413.getClass(), "alternates", term414);
        setIntField(term413, term413.getClass(), "hashcode", -602026508);
        setBooleanField(term413, term413.getClass(), "resolved", true);
        setField(term413, term413.getClass(), "resolveResult", null);
        setBooleanField(term413, term413.getClass(), "inTemplatedCheckVisit", false);
        setField(term421, term421.getClass(), "reporter", null);
        setField(term421, term421.getClass(), "nativeTypes", term422);
        setField(term421, term421.getClass(), "namesToTypes", term423);
        setField(term421, term421.getClass(), "namespaces", term431);
        setField(term421, term421.getClass(), "nonNullableTypeNames", term438);
        setField(term421, term421.getClass(), "forwardDeclaredTypes", term445);
        setField(term421, term421.getClass(), "typesIndexedByProperty", term452);
        setField(term421, term421.getClass(), "eachRefTypeIndexedByProperty", term460);
        setField(term421, term421.getClass(), "greatestSubtypeByProperty", term465);
        setField(term421, term421.getClass(), "interfaceToImplementors", null);
        setField(term421, term421.getClass(), "unresolvedNamedTypes", null);
        setField(term421, term421.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term421, term421.getClass(), "lastGeneration", false);
        setField(term421, term421.getClass(), "templateTypes", null);
        setBooleanField(term421, term421.getClass(), "tolerateUndefinedValues", false);
        setField(term421, term421.getClass(), "resolveMode", null);
        setField(term413, term413.getClass(), "registry", term421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "canBeCalled", argTypes, term413, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


