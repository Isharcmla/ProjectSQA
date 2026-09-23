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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.HashSet;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class UnionType_meet_864061386147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44985;
     Object term45279;
     Object term45720;
     Object term45724;
     Object term45703;

    public UnionType_meet_864061386147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term45033 = new HashSet();
        term44985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term44985, term44985.getClass(), "registry", null);
        setField(term44985, term44985.getClass(), "alternates", term45033);
        Object term45527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        HashSet term45327 = new HashSet();
        ((HashSet) term45327).add(term45527);
        term45279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term45279, term45279.getClass(), "alternates", term45327);
        HashMap term45722 = new HashMap();
        Set<Object> term45731 =  ((Map) term45722).keySet();
        HashSet term45721 = new HashSet((Collection<? extends Object>) term45731);
        term45720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term45720, term45720.getClass(), "alternates", term45721);
        setBooleanField(term45720, term45720.getClass(), "resolved", false);
        setField(term45720, term45720.getClass(), "resolveResult", null);
        setField(term45720, term45720.getClass(), "registry", null);
        HashMap term45726 = new HashMap();
        Set<Object> term45732 =  ((Map) term45726).keySet();
        HashSet term45725 = new HashSet((Collection<? extends Object>) term45732);
        term45724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term45724, term45724.getClass(), "alternates", term45725);
        setBooleanField(term45724, term45724.getClass(), "resolved", false);
        setField(term45724, term45724.getClass(), "resolveResult", null);
        setField(term45724, term45724.getClass(), "registry", null);
        term45703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term45703, term45703.getClass(), "leastSupertypeVisitor", null);
        setField(term45703, term45703.getClass(), "greatestSubtypeVisitor", null);
        setField(term45703, term45703.getClass(), "call", null);
        setField(term45703, term45703.getClass(), "prototype", null);
        setField(term45703, term45703.getClass(), "kind", null);
        setField(term45703, term45703.getClass(), "typeOfThis", null);
        setField(term45703, term45703.getClass(), "source", null);
        setField(term45703, term45703.getClass(), "implementedInterfaces", null);
        setField(term45703, term45703.getClass(), "subTypes", null);
        setField(term45703, term45703.getClass(), "templateTypeName", null);
        setField(term45703, term45703.getClass(), "className", null);
        setField(term45703, term45703.getClass(), "properties", null);
        setField(term45703, term45703.getClass(), "implicitPrototype", null);
        setBooleanField(term45703, term45703.getClass(), "nativeType", false);
        setBooleanField(term45703, term45703.getClass(), "visited", false);
        setField(term45703, term45703.getClass(), "docInfo", null);
        setBooleanField(term45703, term45703.getClass(), "unknown", false);
        setBooleanField(term45703, term45703.getClass(), "resolved", false);
        setField(term45703, term45703.getClass(), "resolveResult", null);
        setField(term45703, term45703.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term45279;
        Object retValue = callMethod(klass, "meet", argTypes, term44985, args);
        assertTrue(recursiveEquals(term44985, term45720));
        assertTrue(recursiveEquals(term45279, term45724));
        assertTrue(recursiveEquals(retValue, term45703));
    }

};


