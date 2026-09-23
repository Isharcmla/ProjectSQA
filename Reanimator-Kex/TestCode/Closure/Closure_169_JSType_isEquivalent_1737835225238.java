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

public class JSType_isEquivalent_1737835225238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29367;
     Object term29737;
     Object term29738;

    public JSType_isEquivalent_1737835225238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term29737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term29737, term29737.getClass(), "reference", null);
        setField(term29737, term29737.getClass(), "sourceName", null);
        setIntField(term29737, term29737.getClass(), "lineno", 0);
        setIntField(term29737, term29737.getClass(), "charno", 0);
        setField(term29737, term29737.getClass(), "validator", null);
        setField(term29737, term29737.getClass(), "propertyContinuations", null);
        setField(term29737, term29737.getClass(), "referencedType", null);
        setField(term29737, term29737.getClass(), "referencedObjType", null);
        setBooleanField(term29737, term29737.getClass(), "visited", false);
        setField(term29737, term29737.getClass(), "docInfo", null);
        setBooleanField(term29737, term29737.getClass(), "unknown", false);
        setBooleanField(term29737, term29737.getClass(), "resolved", false);
        setField(term29737, term29737.getClass(), "resolveResult", null);
        setBooleanField(term29737, term29737.getClass(), "inTemplatedCheckVisit", false);
        setField(term29737, term29737.getClass(), "registry", null);
        term29738 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term29738, term29738.getClass(), "reference", null);
        setField(term29738, term29738.getClass(), "sourceName", null);
        setIntField(term29738, term29738.getClass(), "lineno", 0);
        setIntField(term29738, term29738.getClass(), "charno", 0);
        setField(term29738, term29738.getClass(), "validator", null);
        setField(term29738, term29738.getClass(), "propertyContinuations", null);
        setField(term29738, term29738.getClass(), "referencedType", null);
        setField(term29738, term29738.getClass(), "referencedObjType", null);
        setBooleanField(term29738, term29738.getClass(), "visited", false);
        setField(term29738, term29738.getClass(), "docInfo", null);
        setBooleanField(term29738, term29738.getClass(), "unknown", false);
        setBooleanField(term29738, term29738.getClass(), "resolved", false);
        setField(term29738, term29738.getClass(), "resolveResult", null);
        setBooleanField(term29738, term29738.getClass(), "inTemplatedCheckVisit", false);
        setField(term29738, term29738.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term29367;
        args[1] = term29367;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term29367, term29737));
        assertTrue(recursiveEquals(term29367, term29738));
        assertTrue(recursiveEquals(retValue, true));
    }

};


