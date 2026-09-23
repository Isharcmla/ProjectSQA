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

public class NamedType_lookupViaProperties_209659290555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11177;
     Object term11315;
     Object term11331;
     Object term11334;

    public NamedType_lookupViaProperties_209659290555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term11177, term11177.getClass(), "reference", "");
        term11315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        term11331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term11331, term11331.getClass(), "reference", "");
        setField(term11331, term11331.getClass(), "sourceName", null);
        setIntField(term11331, term11331.getClass(), "lineno", 0);
        setIntField(term11331, term11331.getClass(), "charno", 0);
        setField(term11331, term11331.getClass(), "validator", null);
        setField(term11331, term11331.getClass(), "propertyContinuations", null);
        setField(term11331, term11331.getClass(), "referencedType", null);
        setField(term11331, term11331.getClass(), "referencedObjType", null);
        setBooleanField(term11331, term11331.getClass(), "visited", false);
        setField(term11331, term11331.getClass(), "docInfo", null);
        setBooleanField(term11331, term11331.getClass(), "unknown", false);
        setBooleanField(term11331, term11331.getClass(), "resolved", false);
        setField(term11331, term11331.getClass(), "resolveResult", null);
        setField(term11331, term11331.getClass(), "templateKeys", null);
        setField(term11331, term11331.getClass(), "templatizedTypes", null);
        setBooleanField(term11331, term11331.getClass(), "inTemplatedCheckVisit", false);
        setField(term11331, term11331.getClass(), "registry", null);
        term11334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11334, term11334.getClass(), "name", null);
        setField(term11334, term11334.getClass(), "referencedType", null);
        setField(term11334, term11334.getClass(), "referencedObjType", null);
        setBooleanField(term11334, term11334.getClass(), "visited", false);
        setField(term11334, term11334.getClass(), "docInfo", null);
        setBooleanField(term11334, term11334.getClass(), "unknown", false);
        setBooleanField(term11334, term11334.getClass(), "resolved", false);
        setField(term11334, term11334.getClass(), "resolveResult", null);
        setField(term11334, term11334.getClass(), "templateKeys", null);
        setField(term11334, term11334.getClass(), "templatizedTypes", null);
        setBooleanField(term11334, term11334.getClass(), "inTemplatedCheckVisit", false);
        setField(term11334, term11334.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11315;
        Object retValue = callMethod(klass, "lookupViaProperties", argTypes, term11177, args);
        assertTrue(recursiveEquals(term11177, term11331));
        assertTrue(recursiveEquals(term11315, term11334));
        assertTrue(recursiveEquals(retValue, null));
    }

};


