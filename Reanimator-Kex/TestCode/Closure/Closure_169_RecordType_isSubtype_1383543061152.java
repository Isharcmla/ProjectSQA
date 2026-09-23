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

public class RecordType_isSubtype_1383543061152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66583;
     Object term66707;
     Object term66728;
     Object term66729;

    public RecordType_isSubtype_1383543061152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term66707 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term66728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term66728, term66728.getClass(), "properties", null);
        setBooleanField(term66728, term66728.getClass(), "declared", false);
        setBooleanField(term66728, term66728.getClass(), "isFrozen", false);
        setField(term66728, term66728.getClass(), "className", null);
        setField(term66728, term66728.getClass(), "properties", null);
        setBooleanField(term66728, term66728.getClass(), "nativeType", false);
        setField(term66728, term66728.getClass(), "implicitPrototypeFallback", null);
        setField(term66728, term66728.getClass(), "ownerFunction", null);
        setBooleanField(term66728, term66728.getClass(), "prettyPrint", false);
        setBooleanField(term66728, term66728.getClass(), "visited", false);
        setField(term66728, term66728.getClass(), "docInfo", null);
        setBooleanField(term66728, term66728.getClass(), "unknown", false);
        setBooleanField(term66728, term66728.getClass(), "resolved", false);
        setField(term66728, term66728.getClass(), "resolveResult", null);
        setBooleanField(term66728, term66728.getClass(), "inTemplatedCheckVisit", false);
        setField(term66728, term66728.getClass(), "registry", null);
        term66729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term66729, term66729.getClass(), "typeExpr", null);
        setField(term66729, term66729.getClass(), "sourceName", null);
        setBooleanField(term66729, term66729.getClass(), "isChecked", false);
        setBooleanField(term66729, term66729.getClass(), "visited", false);
        setField(term66729, term66729.getClass(), "docInfo", null);
        setBooleanField(term66729, term66729.getClass(), "unknown", false);
        setBooleanField(term66729, term66729.getClass(), "resolved", false);
        setField(term66729, term66729.getClass(), "resolveResult", null);
        setBooleanField(term66729, term66729.getClass(), "inTemplatedCheckVisit", false);
        setField(term66729, term66729.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term66707;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term66583, args);
        assertTrue(recursiveEquals(term66583, term66728));
        assertTrue(recursiveEquals(term66707, term66729));
        assertTrue(recursiveEquals(retValue, true));
    }

};


