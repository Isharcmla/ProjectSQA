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
import java.lang.Object;

public class JSType_isSubtype_437021077557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155116;
     Object term155210;
     Object term155352;
     Object term155354;

    public JSType_isSubtype_437021077557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term155210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term155302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term155210, term155210.getClass(), "referencedType", term155302);
        term155352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term155353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term155352, term155352.getClass(), "reference", null);
        setField(term155352, term155352.getClass(), "sourceName", null);
        setIntField(term155352, term155352.getClass(), "lineno", 0);
        setIntField(term155352, term155352.getClass(), "charno", 0);
        setBooleanField(term155352, term155352.getClass(), "forgiving", false);
        setField(term155353, term155353.getClass(), "elementsType", null);
        setField(term155353, term155353.getClass(), "elements", null);
        setField(term155353, term155353.getClass(), "className", null);
        setField(term155353, term155353.getClass(), "properties", null);
        setField(term155353, term155353.getClass(), "implicitPrototype", null);
        setBooleanField(term155353, term155353.getClass(), "nativeType", false);
        setBooleanField(term155353, term155353.getClass(), "prettyPrint", false);
        setBooleanField(term155353, term155353.getClass(), "visited", false);
        setField(term155353, term155353.getClass(), "docInfo", null);
        setBooleanField(term155353, term155353.getClass(), "unknown", false);
        setBooleanField(term155353, term155353.getClass(), "resolved", false);
        setField(term155353, term155353.getClass(), "resolveResult", null);
        setField(term155353, term155353.getClass(), "registry", null);
        setField(term155352, term155352.getClass(), "referencedType", term155353);
        setBooleanField(term155352, term155352.getClass(), "visited", false);
        setField(term155352, term155352.getClass(), "docInfo", null);
        setBooleanField(term155352, term155352.getClass(), "unknown", false);
        setBooleanField(term155352, term155352.getClass(), "resolved", false);
        setField(term155352, term155352.getClass(), "resolveResult", null);
        setField(term155352, term155352.getClass(), "registry", null);
        term155354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term155354, term155354.getClass(), "resolved", false);
        setField(term155354, term155354.getClass(), "resolveResult", null);
        setField(term155354, term155354.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term155116;
        args[1] = term155210;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term155116, term155352));
        assertTrue(recursiveEquals(term155210, term155354));
        assertTrue(recursiveEquals(retValue, false));
    }

};


