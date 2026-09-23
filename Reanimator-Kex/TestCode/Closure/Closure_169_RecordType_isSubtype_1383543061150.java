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

public class RecordType_isSubtype_1383543061150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66087;
     Object term66187;
     Object term66362;
     Object term66363;

    public RecordType_isSubtype_1383543061150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term66187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term66311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setBooleanField(term66187, term66187.getClass(), "unknown", true);
        setField(term66187, term66187.getClass(), "implicitPrototypeFallback", term66311);
        term66362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term66362, term66362.getClass(), "properties", null);
        setBooleanField(term66362, term66362.getClass(), "declared", false);
        setBooleanField(term66362, term66362.getClass(), "isFrozen", false);
        setField(term66362, term66362.getClass(), "className", null);
        setField(term66362, term66362.getClass(), "properties", null);
        setBooleanField(term66362, term66362.getClass(), "nativeType", false);
        setField(term66362, term66362.getClass(), "implicitPrototypeFallback", null);
        setField(term66362, term66362.getClass(), "ownerFunction", null);
        setBooleanField(term66362, term66362.getClass(), "prettyPrint", false);
        setBooleanField(term66362, term66362.getClass(), "visited", false);
        setField(term66362, term66362.getClass(), "docInfo", null);
        setBooleanField(term66362, term66362.getClass(), "unknown", false);
        setBooleanField(term66362, term66362.getClass(), "resolved", false);
        setField(term66362, term66362.getClass(), "resolveResult", null);
        setBooleanField(term66362, term66362.getClass(), "inTemplatedCheckVisit", false);
        setField(term66362, term66362.getClass(), "registry", null);
        term66363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term66364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term66363, term66363.getClass(), "call", null);
        setField(term66363, term66363.getClass(), "prototypeSlot", null);
        setField(term66363, term66363.getClass(), "kind", null);
        setField(term66363, term66363.getClass(), "propAccess", null);
        setField(term66363, term66363.getClass(), "typeOfThis", null);
        setField(term66363, term66363.getClass(), "source", null);
        setField(term66363, term66363.getClass(), "implementedInterfaces", null);
        setField(term66363, term66363.getClass(), "extendedInterfaces", null);
        setField(term66363, term66363.getClass(), "subTypes", null);
        setField(term66363, term66363.getClass(), "templateTypeNames", null);
        setField(term66363, term66363.getClass(), "className", null);
        setField(term66363, term66363.getClass(), "properties", null);
        setBooleanField(term66363, term66363.getClass(), "nativeType", false);
        setField(term66364, term66364.getClass(), "typeExpr", null);
        setField(term66364, term66364.getClass(), "sourceName", null);
        setBooleanField(term66364, term66364.getClass(), "isChecked", false);
        setBooleanField(term66364, term66364.getClass(), "visited", false);
        setField(term66364, term66364.getClass(), "docInfo", null);
        setBooleanField(term66364, term66364.getClass(), "unknown", false);
        setBooleanField(term66364, term66364.getClass(), "resolved", false);
        setField(term66364, term66364.getClass(), "resolveResult", null);
        setBooleanField(term66364, term66364.getClass(), "inTemplatedCheckVisit", false);
        setField(term66364, term66364.getClass(), "registry", null);
        setField(term66363, term66363.getClass(), "implicitPrototypeFallback", term66364);
        setField(term66363, term66363.getClass(), "ownerFunction", null);
        setBooleanField(term66363, term66363.getClass(), "prettyPrint", false);
        setBooleanField(term66363, term66363.getClass(), "visited", false);
        setField(term66363, term66363.getClass(), "docInfo", null);
        setBooleanField(term66363, term66363.getClass(), "unknown", true);
        setBooleanField(term66363, term66363.getClass(), "resolved", false);
        setField(term66363, term66363.getClass(), "resolveResult", null);
        setBooleanField(term66363, term66363.getClass(), "inTemplatedCheckVisit", false);
        setField(term66363, term66363.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term66187;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term66087, args);
        assertTrue(recursiveEquals(term66087, term66362));
        assertTrue(recursiveEquals(term66187, term66363));
        assertTrue(recursiveEquals(retValue, true));
    }

};


