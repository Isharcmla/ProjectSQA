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
import java.util.ArrayList;

public class JSDocInfoBuilder_recordThrowType_1200738989460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170308;
     Object term170443;

    public JSDocInfoBuilder_recordThrowType_1200738989460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170308 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term170388 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term170388, term170388.getClass(), "bitset", 1073741824);
        setField(term170388, term170388.getClass(), "info", null);
        setField(term170308, term170308.getClass(), "currentInfo", term170388);
        ArrayList term170446 = new ArrayList();
        ((ArrayList) term170446).add((Object)null);
        term170443 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term170444 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term170445 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term170445, term170445.getClass(), "baseType", null);
        setField(term170445, term170445.getClass(), "implementedInterfaces", null);
        setField(term170445, term170445.getClass(), "parameters", null);
        setField(term170445, term170445.getClass(), "thrownTypes", term170446);
        setField(term170445, term170445.getClass(), "templateTypeName", null);
        setField(term170445, term170445.getClass(), "description", null);
        setField(term170445, term170445.getClass(), "deprecated", null);
        setField(term170445, term170445.getClass(), "license", null);
        setField(term170445, term170445.getClass(), "suppressions", null);
        setField(term170444, term170444.getClass(), "info", term170445);
        setField(term170444, term170444.getClass(), "documentation", null);
        setField(term170444, term170444.getClass(), "sourceName", null);
        setField(term170444, term170444.getClass(), "visibility", null);
        setIntField(term170444, term170444.getClass(), "bitset", 1073741824);
        setField(term170444, term170444.getClass(), "type", null);
        setField(term170444, term170444.getClass(), "thisType", null);
        setBooleanField(term170444, term170444.getClass(), "includeDocumentation", false);
        setField(term170443, term170443.getClass(), "currentInfo", term170444);
        setBooleanField(term170443, term170443.getClass(), "populated", true);
        setBooleanField(term170443, term170443.getClass(), "parseDocumentation", false);
        setField(term170443, term170443.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordThrowType", argTypes, term170308, args);
        assertTrue(recursiveEquals(term170308, term170443));
        assertTrue(recursiveEquals(retValue, true));
    }

};


