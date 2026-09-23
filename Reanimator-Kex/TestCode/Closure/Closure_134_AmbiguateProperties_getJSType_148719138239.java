package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class AmbiguateProperties_getJSType_148719138239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7626;
     Object term7696;
     Object term187062;
     Object term187063;
     Object term187018;

    public AmbiguateProperties_getJSType_148719138239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7626 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        term7696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term7696, term7696.getClass(), "jsType", term7790);
        term187062 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        setField(term187062, term187062.getClass(), "compiler", null);
        setField(term187062, term187062.getClass(), "stringNodesToRename", null);
        setField(term187062, term187062.getClass(), "reservedCharacters", null);
        setField(term187062, term187062.getClass(), "propertyMap", null);
        setField(term187062, term187062.getClass(), "externedNames", null);
        setField(term187062, term187062.getClass(), "quotedNames", null);
        setField(term187062, term187062.getClass(), "renamingMap", null);
        setField(term187062, term187062.getClass(), "colorMap", null);
        setField(term187062, term187062.getClass(), "intForType", null);
        setField(term187062, term187062.getClass(), "relatedBitsets", null);
        setField(term187062, term187062.getClass(), "invalidatingTypes", null);
        term187063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setIntField(term187063, term187063.getClass(), "type", 0);
        setField(term187063, term187063.getClass(), "next", null);
        setField(term187063, term187063.getClass(), "first", null);
        setField(term187063, term187063.getClass(), "last", null);
        setField(term187063, term187063.getClass(), "propListHead", null);
        setIntField(term187063, term187063.getClass(), "sourcePosition", 0);
        setField(term187064, term187064.getClass(), "reference", null);
        setField(term187064, term187064.getClass(), "sourceName", null);
        setIntField(term187064, term187064.getClass(), "lineno", 0);
        setIntField(term187064, term187064.getClass(), "charno", 0);
        setBooleanField(term187064, term187064.getClass(), "isResolved", false);
        setBooleanField(term187064, term187064.getClass(), "forgiving", false);
        setField(term187064, term187064.getClass(), "referencedType", null);
        setBooleanField(term187064, term187064.getClass(), "visited", false);
        setField(term187064, term187064.getClass(), "docInfo", null);
        setBooleanField(term187064, term187064.getClass(), "unknown", false);
        setField(term187064, term187064.getClass(), "registry", null);
        setField(term187063, term187063.getClass(), "jsType", term187064);
        setField(term187063, term187063.getClass(), "parent", null);
        term187018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term187018, term187018.getClass(), "reference", null);
        setField(term187018, term187018.getClass(), "sourceName", null);
        setIntField(term187018, term187018.getClass(), "lineno", 0);
        setIntField(term187018, term187018.getClass(), "charno", 0);
        setBooleanField(term187018, term187018.getClass(), "isResolved", false);
        setBooleanField(term187018, term187018.getClass(), "forgiving", false);
        setField(term187018, term187018.getClass(), "referencedType", null);
        setBooleanField(term187018, term187018.getClass(), "visited", false);
        setField(term187018, term187018.getClass(), "docInfo", null);
        setBooleanField(term187018, term187018.getClass(), "unknown", false);
        setField(term187018, term187018.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7696;
        Object retValue = callMethod(klass, "getJSType", argTypes, term7626, args);
        assertTrue(recursiveEquals(term7626, term187062));
        assertTrue(recursiveEquals(term7696, term187063));
        assertTrue(recursiveEquals(retValue, term187018));
    }

};


