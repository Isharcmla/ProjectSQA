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

public class JSType_isSubtype_437021077217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32532;
     Object term32638;
     Object term32661;
     Object term32662;

    public JSType_isSubtype_437021077217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term32638 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term32638, term32638.getClass(), "unknown", false);
        term32661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term32661, term32661.getClass(), "primitiveType", null);
        setField(term32661, term32661.getClass(), "primitiveObjectType", null);
        setField(term32661, term32661.getClass(), "name", null);
        setBooleanField(term32661, term32661.getClass(), "visited", false);
        setField(term32661, term32661.getClass(), "docInfo", null);
        setBooleanField(term32661, term32661.getClass(), "unknown", false);
        setBooleanField(term32661, term32661.getClass(), "resolved", false);
        setField(term32661, term32661.getClass(), "resolveResult", null);
        setField(term32661, term32661.getClass(), "registry", null);
        term32662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term32662, term32662.getClass(), "typeExpr", null);
        setField(term32662, term32662.getClass(), "sourceName", null);
        setBooleanField(term32662, term32662.getClass(), "forgiving", false);
        setBooleanField(term32662, term32662.getClass(), "isChecked", false);
        setBooleanField(term32662, term32662.getClass(), "visited", false);
        setField(term32662, term32662.getClass(), "docInfo", null);
        setBooleanField(term32662, term32662.getClass(), "unknown", false);
        setBooleanField(term32662, term32662.getClass(), "resolved", false);
        setField(term32662, term32662.getClass(), "resolveResult", null);
        setField(term32662, term32662.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term32532;
        args[1] = term32638;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term32532, term32661));
        assertTrue(recursiveEquals(term32638, term32662));
        assertTrue(recursiveEquals(retValue, false));
    }

};


