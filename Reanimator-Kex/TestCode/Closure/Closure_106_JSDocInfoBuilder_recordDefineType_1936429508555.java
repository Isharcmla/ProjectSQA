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

public class JSDocInfoBuilder_recordDefineType_1936429508555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195987;
     Object term196285;
     Object term196981;
     Object term196984;

    public JSDocInfoBuilder_recordDefineType_1936429508555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195987 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term196067 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term196191 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term196067, term196067.getClass(), "bitset", -2147483648);
        setField(term196191, term196191.getClass(), "parameters", null);
        setField(term196191, term196191.getClass(), "baseType", null);
        setField(term196067, term196067.getClass(), "info", term196191);
        setField(term196067, term196067.getClass(), "thisType", null);
        setField(term195987, term195987.getClass(), "currentInfo", term196067);
        term196285 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term196981 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term196982 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term196983 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term196983, term196983.getClass(), "baseType", null);
        setField(term196983, term196983.getClass(), "implementedInterfaces", null);
        setField(term196983, term196983.getClass(), "parameters", null);
        setField(term196983, term196983.getClass(), "thrownTypes", null);
        setField(term196983, term196983.getClass(), "templateTypeName", null);
        setField(term196983, term196983.getClass(), "description", null);
        setField(term196983, term196983.getClass(), "deprecated", null);
        setField(term196983, term196983.getClass(), "license", null);
        setField(term196983, term196983.getClass(), "suppressions", null);
        setField(term196982, term196982.getClass(), "info", term196983);
        setField(term196982, term196982.getClass(), "documentation", null);
        setField(term196982, term196982.getClass(), "sourceName", null);
        setField(term196982, term196982.getClass(), "visibility", null);
        setIntField(term196982, term196982.getClass(), "bitset", -2147483648);
        setField(term196982, term196982.getClass(), "type", null);
        setField(term196982, term196982.getClass(), "thisType", null);
        setBooleanField(term196982, term196982.getClass(), "includeDocumentation", false);
        setField(term196981, term196981.getClass(), "currentInfo", term196982);
        setBooleanField(term196981, term196981.getClass(), "populated", false);
        setBooleanField(term196981, term196981.getClass(), "parseDocumentation", false);
        setField(term196981, term196981.getClass(), "currentMarker", null);
        term196984 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term196984, term196984.getClass(), "root", null);
        setField(term196984, term196984.getClass(), "sourceName", null);
        setField(term196984, term196984.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term196285;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term195987, args);
        assertTrue(recursiveEquals(term195987, term196981));
        assertTrue(recursiveEquals(term196285, term196984));
        assertTrue(recursiveEquals(retValue, false));
    }

};


