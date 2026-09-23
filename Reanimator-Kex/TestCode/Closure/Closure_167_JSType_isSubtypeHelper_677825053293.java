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

public class JSType_isSubtypeHelper_677825053293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42652;
     Object term42744;
     Object term42772;
     Object term42773;

    public JSType_isSubtypeHelper_677825053293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term42744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setBooleanField(term42744, term42744.getClass(), "unknown", false);
        term42772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term42772, term42772.getClass(), "source", null);
        setField(term42772, term42772.getClass(), "elementsType", null);
        setField(term42772, term42772.getClass(), "elements", null);
        setField(term42772, term42772.getClass(), "className", null);
        setField(term42772, term42772.getClass(), "properties", null);
        setBooleanField(term42772, term42772.getClass(), "nativeType", false);
        setField(term42772, term42772.getClass(), "implicitPrototypeFallback", null);
        setField(term42772, term42772.getClass(), "ownerFunction", null);
        setBooleanField(term42772, term42772.getClass(), "prettyPrint", false);
        setBooleanField(term42772, term42772.getClass(), "visited", false);
        setField(term42772, term42772.getClass(), "docInfo", null);
        setBooleanField(term42772, term42772.getClass(), "unknown", false);
        setBooleanField(term42772, term42772.getClass(), "resolved", false);
        setField(term42772, term42772.getClass(), "resolveResult", null);
        setBooleanField(term42772, term42772.getClass(), "inTemplatedCheckVisit", false);
        setField(term42772, term42772.getClass(), "registry", null);
        term42773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term42773, term42773.getClass(), "typeExpr", null);
        setField(term42773, term42773.getClass(), "sourceName", null);
        setBooleanField(term42773, term42773.getClass(), "isChecked", false);
        setBooleanField(term42773, term42773.getClass(), "visited", false);
        setField(term42773, term42773.getClass(), "docInfo", null);
        setBooleanField(term42773, term42773.getClass(), "unknown", false);
        setBooleanField(term42773, term42773.getClass(), "resolved", false);
        setField(term42773, term42773.getClass(), "resolveResult", null);
        setBooleanField(term42773, term42773.getClass(), "inTemplatedCheckVisit", false);
        setField(term42773, term42773.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term42652;
        args[1] = term42744;
        Object retValue = callMethod(klass, "isSubtypeHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term42652, term42772));
        assertTrue(recursiveEquals(term42744, term42773));
        assertTrue(recursiveEquals(retValue, false));
    }

};


