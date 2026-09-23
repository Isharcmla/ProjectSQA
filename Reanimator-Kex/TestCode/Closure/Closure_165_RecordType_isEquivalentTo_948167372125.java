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
import java.lang.Object;

public class RecordType_isEquivalentTo_948167372125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35611;
     Object term35709;
     Object term35859;
     Object term35860;

    public RecordType_isEquivalentTo_948167372125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35611 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term35709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term35833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term35709, term35709.getClass(), "referencedType", term35833);
        term35859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term35859, term35859.getClass(), "properties", null);
        setBooleanField(term35859, term35859.getClass(), "isFrozen", false);
        setField(term35859, term35859.getClass(), "className", null);
        setField(term35859, term35859.getClass(), "properties", null);
        setBooleanField(term35859, term35859.getClass(), "nativeType", false);
        setField(term35859, term35859.getClass(), "implicitPrototypeFallback", null);
        setField(term35859, term35859.getClass(), "ownerFunction", null);
        setBooleanField(term35859, term35859.getClass(), "prettyPrint", false);
        setBooleanField(term35859, term35859.getClass(), "visited", false);
        setField(term35859, term35859.getClass(), "docInfo", null);
        setBooleanField(term35859, term35859.getClass(), "unknown", false);
        setBooleanField(term35859, term35859.getClass(), "resolved", false);
        setField(term35859, term35859.getClass(), "resolveResult", null);
        setField(term35859, term35859.getClass(), "registry", null);
        term35860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term35861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term35860, term35860.getClass(), "indexType", null);
        setField(term35861, term35861.getClass(), "typeExpr", null);
        setField(term35861, term35861.getClass(), "sourceName", null);
        setBooleanField(term35861, term35861.getClass(), "isChecked", false);
        setBooleanField(term35861, term35861.getClass(), "visited", false);
        setField(term35861, term35861.getClass(), "docInfo", null);
        setBooleanField(term35861, term35861.getClass(), "unknown", false);
        setBooleanField(term35861, term35861.getClass(), "resolved", false);
        setField(term35861, term35861.getClass(), "resolveResult", null);
        setField(term35861, term35861.getClass(), "registry", null);
        setField(term35860, term35860.getClass(), "referencedType", term35861);
        setField(term35860, term35860.getClass(), "referencedObjType", null);
        setBooleanField(term35860, term35860.getClass(), "visited", false);
        setField(term35860, term35860.getClass(), "docInfo", null);
        setBooleanField(term35860, term35860.getClass(), "unknown", false);
        setBooleanField(term35860, term35860.getClass(), "resolved", false);
        setField(term35860, term35860.getClass(), "resolveResult", null);
        setField(term35860, term35860.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term35709;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term35611, args);
        assertTrue(recursiveEquals(term35611, term35859));
        assertTrue(recursiveEquals(term35709, term35860));
        assertTrue(recursiveEquals(retValue, false));
    }

};


