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

public class NamedType_finishPropertyContinuations_167806891137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29269;
     Object term29422;

    public NamedType_finishPropertyContinuations_167806891137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term29393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term29269, term29269.getClass(), "referencedObjType", term29393);
        term29422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term29423 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term29422, term29422.getClass(), "reference", null);
        setField(term29422, term29422.getClass(), "sourceName", null);
        setIntField(term29422, term29422.getClass(), "lineno", 0);
        setIntField(term29422, term29422.getClass(), "charno", 0);
        setField(term29422, term29422.getClass(), "validator", null);
        setField(term29422, term29422.getClass(), "propertyContinuations", null);
        setField(term29422, term29422.getClass(), "referencedType", null);
        setField(term29423, term29423.getClass(), "typeExpr", null);
        setField(term29423, term29423.getClass(), "sourceName", null);
        setBooleanField(term29423, term29423.getClass(), "isChecked", false);
        setBooleanField(term29423, term29423.getClass(), "visited", false);
        setField(term29423, term29423.getClass(), "docInfo", null);
        setBooleanField(term29423, term29423.getClass(), "unknown", false);
        setBooleanField(term29423, term29423.getClass(), "resolved", false);
        setField(term29423, term29423.getClass(), "resolveResult", null);
        setField(term29423, term29423.getClass(), "templateKeys", null);
        setField(term29423, term29423.getClass(), "templatizedTypes", null);
        setBooleanField(term29423, term29423.getClass(), "inTemplatedCheckVisit", false);
        setField(term29423, term29423.getClass(), "registry", null);
        setField(term29422, term29422.getClass(), "referencedObjType", term29423);
        setBooleanField(term29422, term29422.getClass(), "visited", false);
        setField(term29422, term29422.getClass(), "docInfo", null);
        setBooleanField(term29422, term29422.getClass(), "unknown", false);
        setBooleanField(term29422, term29422.getClass(), "resolved", false);
        setField(term29422, term29422.getClass(), "resolveResult", null);
        setField(term29422, term29422.getClass(), "templateKeys", null);
        setField(term29422, term29422.getClass(), "templatizedTypes", null);
        setBooleanField(term29422, term29422.getClass(), "inTemplatedCheckVisit", false);
        setField(term29422, term29422.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term29269, args);
        assertTrue(recursiveEquals(term29269, term29422));
    }

};


