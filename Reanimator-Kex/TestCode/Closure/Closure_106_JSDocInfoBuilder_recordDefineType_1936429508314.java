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

public class JSDocInfoBuilder_recordDefineType_1936429508314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136460;
     Object term136634;
     Object term136797;
     Object term136799;

    public JSDocInfoBuilder_recordDefineType_1936429508314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136460 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term136540 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term136540, term136540.getClass(), "bitset", -2147483648);
        setField(term136540, term136540.getClass(), "info", null);
        setField(term136540, term136540.getClass(), "thisType", null);
        setField(term136460, term136460.getClass(), "currentInfo", term136540);
        term136634 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term136797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term136798 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term136798, term136798.getClass(), "info", null);
        setField(term136798, term136798.getClass(), "documentation", null);
        setField(term136798, term136798.getClass(), "sourceName", null);
        setField(term136798, term136798.getClass(), "visibility", null);
        setIntField(term136798, term136798.getClass(), "bitset", -2147483648);
        setField(term136798, term136798.getClass(), "type", null);
        setField(term136798, term136798.getClass(), "thisType", null);
        setBooleanField(term136798, term136798.getClass(), "includeDocumentation", false);
        setField(term136797, term136797.getClass(), "currentInfo", term136798);
        setBooleanField(term136797, term136797.getClass(), "populated", false);
        setBooleanField(term136797, term136797.getClass(), "parseDocumentation", false);
        setField(term136797, term136797.getClass(), "currentMarker", null);
        term136799 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term136799, term136799.getClass(), "root", null);
        setField(term136799, term136799.getClass(), "sourceName", null);
        setField(term136799, term136799.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term136634;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term136460, args);
        assertTrue(recursiveEquals(term136460, term136797));
        assertTrue(recursiveEquals(term136634, term136799));
        assertTrue(recursiveEquals(retValue, false));
    }

};


