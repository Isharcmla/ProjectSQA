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

public class NamedType_defineProperty_346418567175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43042;
     Object term43169;

    public NamedType_defineProperty_346418567175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term43136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setBooleanField(term43042, term43042.getClass(), "resolved", true);
        setBooleanField(term43136, term43136.getClass(), "resolved", true);
        setField(term43042, term43042.getClass(), "referencedObjType", term43136);
        term43169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term43170 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term43169, term43169.getClass(), "reference", null);
        setField(term43169, term43169.getClass(), "sourceName", null);
        setIntField(term43169, term43169.getClass(), "lineno", 0);
        setIntField(term43169, term43169.getClass(), "charno", 0);
        setField(term43169, term43169.getClass(), "validator", null);
        setField(term43169, term43169.getClass(), "propertyContinuations", null);
        setField(term43169, term43169.getClass(), "referencedType", null);
        setField(term43170, term43170.getClass(), "reference", null);
        setField(term43170, term43170.getClass(), "sourceName", null);
        setIntField(term43170, term43170.getClass(), "lineno", 0);
        setIntField(term43170, term43170.getClass(), "charno", 0);
        setField(term43170, term43170.getClass(), "validator", null);
        setField(term43170, term43170.getClass(), "propertyContinuations", null);
        setField(term43170, term43170.getClass(), "referencedType", null);
        setField(term43170, term43170.getClass(), "referencedObjType", null);
        setBooleanField(term43170, term43170.getClass(), "visited", false);
        setField(term43170, term43170.getClass(), "docInfo", null);
        setBooleanField(term43170, term43170.getClass(), "unknown", false);
        setBooleanField(term43170, term43170.getClass(), "resolved", true);
        setField(term43170, term43170.getClass(), "resolveResult", null);
        setField(term43170, term43170.getClass(), "templateKeys", null);
        setField(term43170, term43170.getClass(), "templatizedTypes", null);
        setBooleanField(term43170, term43170.getClass(), "inTemplatedCheckVisit", false);
        setField(term43170, term43170.getClass(), "registry", null);
        setField(term43169, term43169.getClass(), "referencedObjType", term43170);
        setBooleanField(term43169, term43169.getClass(), "visited", false);
        setField(term43169, term43169.getClass(), "docInfo", null);
        setBooleanField(term43169, term43169.getClass(), "unknown", false);
        setBooleanField(term43169, term43169.getClass(), "resolved", true);
        setField(term43169, term43169.getClass(), "resolveResult", null);
        setField(term43169, term43169.getClass(), "templateKeys", null);
        setField(term43169, term43169.getClass(), "templatizedTypes", null);
        setBooleanField(term43169, term43169.getClass(), "inTemplatedCheckVisit", false);
        setField(term43169, term43169.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term43042, args);
        assertTrue(recursiveEquals(term43042, term43169));
        assertTrue(recursiveEquals(retValue, true));
    }

};


