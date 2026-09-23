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
import java.lang.Object;
import java.util.HashMap;

public class JSDocInfoBuilder_recordDefineType_1936429508584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206012;
     Object term206462;

    public JSDocInfoBuilder_recordDefineType_1936429508584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term206264 = new HashMap();
        term206012 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term206092 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term206216 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term206092, term206092.getClass(), "bitset", -1073741824);
        setField(term206216, term206216.getClass(), "parameters", term206264);
        setField(term206216, term206216.getClass(), "baseType", null);
        setField(term206092, term206092.getClass(), "info", term206216);
        setField(term206092, term206092.getClass(), "thisType", null);
        setField(term206012, term206012.getClass(), "currentInfo", term206092);
        term206462 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term206462;
        try {
            callMethod(klass, "recordDefineType", argTypes, term206012, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


