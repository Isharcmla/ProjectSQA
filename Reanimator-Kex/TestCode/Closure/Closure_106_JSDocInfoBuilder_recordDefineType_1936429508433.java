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

public class JSDocInfoBuilder_recordDefineType_1936429508433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164071;
     Object term164369;
     Object term164952;
     Object term164956;

    public JSDocInfoBuilder_recordDefineType_1936429508433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164071 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term164151 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term164275 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term164151, term164151.getClass(), "bitset", 0);
        setField(term164151, term164151.getClass(), "info", term164275);
        setField(term164071, term164071.getClass(), "currentInfo", term164151);
        term164369 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term164952 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term164953 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term164954 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term164955 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term164954, term164954.getClass(), "baseType", null);
        setField(term164954, term164954.getClass(), "implementedInterfaces", null);
        setField(term164954, term164954.getClass(), "parameters", null);
        setField(term164954, term164954.getClass(), "thrownTypes", null);
        setField(term164954, term164954.getClass(), "templateTypeName", null);
        setField(term164954, term164954.getClass(), "description", null);
        setField(term164954, term164954.getClass(), "deprecated", null);
        setField(term164954, term164954.getClass(), "license", null);
        setField(term164954, term164954.getClass(), "suppressions", null);
        setField(term164953, term164953.getClass(), "info", term164954);
        setField(term164953, term164953.getClass(), "documentation", null);
        setField(term164953, term164953.getClass(), "sourceName", null);
        setField(term164953, term164953.getClass(), "visibility", null);
        setIntField(term164953, term164953.getClass(), "bitset", 536870916);
        setField(term164955, term164955.getClass(), "root", null);
        setField(term164955, term164955.getClass(), "sourceName", null);
        setField(term164955, term164955.getClass(), "registry", null);
        setField(term164953, term164953.getClass(), "type", term164955);
        setField(term164953, term164953.getClass(), "thisType", null);
        setBooleanField(term164953, term164953.getClass(), "includeDocumentation", false);
        setField(term164952, term164952.getClass(), "currentInfo", term164953);
        setBooleanField(term164952, term164952.getClass(), "populated", true);
        setBooleanField(term164952, term164952.getClass(), "parseDocumentation", false);
        setField(term164952, term164952.getClass(), "currentMarker", null);
        term164956 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term164956, term164956.getClass(), "root", null);
        setField(term164956, term164956.getClass(), "sourceName", null);
        setField(term164956, term164956.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term164369;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term164071, args);
        assertTrue(recursiveEquals(term164071, term164952));
        assertTrue(recursiveEquals(term164369, term164956));
        assertTrue(recursiveEquals(retValue, true));
    }

};


