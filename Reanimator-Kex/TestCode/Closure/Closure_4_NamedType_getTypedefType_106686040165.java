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

public class NamedType_getTypedefType_106686040165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40163;
     Object term40257;
     Object term40386;
     Object term40387;
     Object term40360;

    public NamedType_getTypedefType_106686040165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term40257 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        Object term40351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term40257, term40257.getClass(), "type", term40351);
        term40386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term40386, term40386.getClass(), "reference", null);
        setField(term40386, term40386.getClass(), "sourceName", null);
        setIntField(term40386, term40386.getClass(), "lineno", 0);
        setIntField(term40386, term40386.getClass(), "charno", 0);
        setField(term40386, term40386.getClass(), "validator", null);
        setField(term40386, term40386.getClass(), "propertyContinuations", null);
        setField(term40386, term40386.getClass(), "referencedType", null);
        setField(term40386, term40386.getClass(), "referencedObjType", null);
        setBooleanField(term40386, term40386.getClass(), "visited", false);
        setField(term40386, term40386.getClass(), "docInfo", null);
        setBooleanField(term40386, term40386.getClass(), "unknown", false);
        setBooleanField(term40386, term40386.getClass(), "resolved", false);
        setField(term40386, term40386.getClass(), "resolveResult", null);
        setField(term40386, term40386.getClass(), "templateKeys", null);
        setField(term40386, term40386.getClass(), "templatizedTypes", null);
        setBooleanField(term40386, term40386.getClass(), "inTemplatedCheckVisit", false);
        setField(term40386, term40386.getClass(), "registry", null);
        term40387 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        Object term40388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term40387, term40387.getClass(), "name", null);
        setField(term40387, term40387.getClass(), "nameNode", null);
        setField(term40388, term40388.getClass(), "reference", null);
        setField(term40388, term40388.getClass(), "sourceName", null);
        setIntField(term40388, term40388.getClass(), "lineno", 0);
        setIntField(term40388, term40388.getClass(), "charno", 0);
        setField(term40388, term40388.getClass(), "validator", null);
        setField(term40388, term40388.getClass(), "propertyContinuations", null);
        setField(term40388, term40388.getClass(), "referencedType", null);
        setField(term40388, term40388.getClass(), "referencedObjType", null);
        setBooleanField(term40388, term40388.getClass(), "visited", false);
        setField(term40388, term40388.getClass(), "docInfo", null);
        setBooleanField(term40388, term40388.getClass(), "unknown", false);
        setBooleanField(term40388, term40388.getClass(), "resolved", false);
        setField(term40388, term40388.getClass(), "resolveResult", null);
        setField(term40388, term40388.getClass(), "templateKeys", null);
        setField(term40388, term40388.getClass(), "templatizedTypes", null);
        setBooleanField(term40388, term40388.getClass(), "inTemplatedCheckVisit", false);
        setField(term40388, term40388.getClass(), "registry", null);
        setField(term40387, term40387.getClass(), "type", term40388);
        setBooleanField(term40387, term40387.getClass(), "typeInferred", false);
        setField(term40387, term40387.getClass(), "input", null);
        setIntField(term40387, term40387.getClass(), "index", 0);
        setField(term40387, term40387.getClass(), "scope", null);
        setBooleanField(term40387, term40387.getClass(), "markedEscaped", false);
        setBooleanField(term40387, term40387.getClass(), "markedAssignedExactlyOnce", false);
        term40360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term40360, term40360.getClass(), "reference", null);
        setField(term40360, term40360.getClass(), "sourceName", null);
        setIntField(term40360, term40360.getClass(), "lineno", 0);
        setIntField(term40360, term40360.getClass(), "charno", 0);
        setField(term40360, term40360.getClass(), "validator", null);
        setField(term40360, term40360.getClass(), "propertyContinuations", null);
        setField(term40360, term40360.getClass(), "referencedType", null);
        setField(term40360, term40360.getClass(), "referencedObjType", null);
        setBooleanField(term40360, term40360.getClass(), "visited", false);
        setField(term40360, term40360.getClass(), "docInfo", null);
        setBooleanField(term40360, term40360.getClass(), "unknown", false);
        setBooleanField(term40360, term40360.getClass(), "resolved", false);
        setField(term40360, term40360.getClass(), "resolveResult", null);
        setField(term40360, term40360.getClass(), "templateKeys", null);
        setField(term40360, term40360.getClass(), "templatizedTypes", null);
        setBooleanField(term40360, term40360.getClass(), "inTemplatedCheckVisit", false);
        setField(term40360, term40360.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term40257;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term40163, args);
        assertTrue(recursiveEquals(term40163, term40386));
        assertTrue(recursiveEquals(term40257, null));
        assertTrue(recursiveEquals(retValue, term40360));
    }

};


