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
import java.util.HashMap;

public class JSDocInfoBuilder_recordDefineType_1936429508582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205236;
     Object term205634;
     Object term205743;
     Object term205747;

    public JSDocInfoBuilder_recordDefineType_1936429508582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term205488 = new HashMap();
        term205236 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term205316 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term205440 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term205316, term205316.getClass(), "bitset", 1073741824);
        setField(term205440, term205440.getClass(), "parameters", term205488);
        setField(term205316, term205316.getClass(), "info", term205440);
        setField(term205236, term205236.getClass(), "currentInfo", term205316);
        term205634 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        HashMap term205746 = new HashMap();
        term205743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term205744 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term205745 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term205745, term205745.getClass(), "baseType", null);
        setField(term205745, term205745.getClass(), "implementedInterfaces", null);
        setField(term205745, term205745.getClass(), "parameters", term205746);
        setField(term205745, term205745.getClass(), "thrownTypes", null);
        setField(term205745, term205745.getClass(), "templateTypeName", null);
        setField(term205745, term205745.getClass(), "description", null);
        setField(term205745, term205745.getClass(), "deprecated", null);
        setField(term205745, term205745.getClass(), "license", null);
        setField(term205745, term205745.getClass(), "suppressions", null);
        setField(term205744, term205744.getClass(), "info", term205745);
        setField(term205744, term205744.getClass(), "documentation", null);
        setField(term205744, term205744.getClass(), "sourceName", null);
        setField(term205744, term205744.getClass(), "visibility", null);
        setIntField(term205744, term205744.getClass(), "bitset", 1073741824);
        setField(term205744, term205744.getClass(), "type", null);
        setField(term205744, term205744.getClass(), "thisType", null);
        setBooleanField(term205744, term205744.getClass(), "includeDocumentation", false);
        setField(term205743, term205743.getClass(), "currentInfo", term205744);
        setBooleanField(term205743, term205743.getClass(), "populated", false);
        setBooleanField(term205743, term205743.getClass(), "parseDocumentation", false);
        setField(term205743, term205743.getClass(), "currentMarker", null);
        term205747 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term205747, term205747.getClass(), "root", null);
        setField(term205747, term205747.getClass(), "sourceName", null);
        setField(term205747, term205747.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term205634;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term205236, args);
        assertTrue(recursiveEquals(term205236, term205743));
        assertTrue(recursiveEquals(term205634, term205747));
        assertTrue(recursiveEquals(retValue, false));
    }

};


