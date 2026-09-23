package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class JSDocInfoBuilder_recordThisType_1193895769181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113274;
     Object term113448;
     Object term113654;
     Object term113656;

    public JSDocInfoBuilder_recordThisType_1193895769181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113274 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term113354 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term113354, term113354.getClass(), "bitset", 536870912);
        setField(term113274, term113274.getClass(), "currentInfo", term113354);
        term113448 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term113654 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term113655 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term113655, term113655.getClass(), "info", null);
        setField(term113655, term113655.getClass(), "documentation", null);
        setField(term113655, term113655.getClass(), "sourceName", null);
        setField(term113655, term113655.getClass(), "visibility", null);
        setIntField(term113655, term113655.getClass(), "bitset", 536870912);
        setField(term113655, term113655.getClass(), "type", null);
        setField(term113655, term113655.getClass(), "thisType", null);
        setBooleanField(term113655, term113655.getClass(), "includeDocumentation", false);
        setField(term113654, term113654.getClass(), "currentInfo", term113655);
        setBooleanField(term113654, term113654.getClass(), "populated", false);
        setBooleanField(term113654, term113654.getClass(), "parseDocumentation", false);
        setField(term113654, term113654.getClass(), "currentMarker", null);
        term113656 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term113656, term113656.getClass(), "root", null);
        setField(term113656, term113656.getClass(), "sourceName", null);
        setField(term113656, term113656.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term113448;
        Object retValue = callMethod(klass, "recordThisType", argTypes, term113274, args);
        assertTrue(recursiveEquals(term113274, term113654));
        assertTrue(recursiveEquals(term113448, term113656));
        assertTrue(recursiveEquals(retValue, false));
    }

};


