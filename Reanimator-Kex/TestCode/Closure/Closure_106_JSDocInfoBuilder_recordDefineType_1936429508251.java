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

public class JSDocInfoBuilder_recordDefineType_1936429508251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125332;
     Object term125506;
     Object term125696;
     Object term125698;

    public JSDocInfoBuilder_recordDefineType_1936429508251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125332 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term125412 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term125412, term125412.getClass(), "bitset", 536870912);
        setField(term125412, term125412.getClass(), "info", null);
        setField(term125412, term125412.getClass(), "thisType", null);
        setField(term125332, term125332.getClass(), "currentInfo", term125412);
        term125506 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term125696 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term125697 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term125697, term125697.getClass(), "info", null);
        setField(term125697, term125697.getClass(), "documentation", null);
        setField(term125697, term125697.getClass(), "sourceName", null);
        setField(term125697, term125697.getClass(), "visibility", null);
        setIntField(term125697, term125697.getClass(), "bitset", 536870912);
        setField(term125697, term125697.getClass(), "type", null);
        setField(term125697, term125697.getClass(), "thisType", null);
        setBooleanField(term125697, term125697.getClass(), "includeDocumentation", false);
        setField(term125696, term125696.getClass(), "currentInfo", term125697);
        setBooleanField(term125696, term125696.getClass(), "populated", false);
        setBooleanField(term125696, term125696.getClass(), "parseDocumentation", false);
        setField(term125696, term125696.getClass(), "currentMarker", null);
        term125698 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term125698, term125698.getClass(), "root", null);
        setField(term125698, term125698.getClass(), "sourceName", null);
        setField(term125698, term125698.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term125506;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term125332, args);
        assertTrue(recursiveEquals(term125332, term125696));
        assertTrue(recursiveEquals(term125506, term125698));
        assertTrue(recursiveEquals(retValue, false));
    }

};


