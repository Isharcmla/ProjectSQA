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

public class JSDocInfoBuilder_recordThrowType_1200738989340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143380;
     Object term143641;

    public JSDocInfoBuilder_recordThrowType_1200738989340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143380 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term143460 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term143584 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term143460, term143460.getClass(), "bitset", 1073741824);
        setField(term143584, term143584.getClass(), "thrownTypes", null);
        setField(term143460, term143460.getClass(), "info", term143584);
        setField(term143380, term143380.getClass(), "currentInfo", term143460);
        ArrayList term143644 = new ArrayList();
        ((ArrayList) term143644).add((Object)null);
        term143641 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term143642 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term143643 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term143643, term143643.getClass(), "baseType", null);
        setField(term143643, term143643.getClass(), "implementedInterfaces", null);
        setField(term143643, term143643.getClass(), "parameters", null);
        setField(term143643, term143643.getClass(), "thrownTypes", term143644);
        setField(term143643, term143643.getClass(), "templateTypeName", null);
        setField(term143643, term143643.getClass(), "description", null);
        setField(term143643, term143643.getClass(), "deprecated", null);
        setField(term143643, term143643.getClass(), "license", null);
        setField(term143643, term143643.getClass(), "suppressions", null);
        setField(term143642, term143642.getClass(), "info", term143643);
        setField(term143642, term143642.getClass(), "documentation", null);
        setField(term143642, term143642.getClass(), "sourceName", null);
        setField(term143642, term143642.getClass(), "visibility", null);
        setIntField(term143642, term143642.getClass(), "bitset", 1073741824);
        setField(term143642, term143642.getClass(), "type", null);
        setField(term143642, term143642.getClass(), "thisType", null);
        setBooleanField(term143642, term143642.getClass(), "includeDocumentation", false);
        setField(term143641, term143641.getClass(), "currentInfo", term143642);
        setBooleanField(term143641, term143641.getClass(), "populated", true);
        setBooleanField(term143641, term143641.getClass(), "parseDocumentation", false);
        setField(term143641, term143641.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordThrowType", argTypes, term143380, args);
        assertTrue(recursiveEquals(term143380, term143641));
        assertTrue(recursiveEquals(retValue, true));
    }

};


