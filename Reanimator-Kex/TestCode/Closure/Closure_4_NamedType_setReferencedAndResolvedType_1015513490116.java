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

public class NamedType_setReferencedAndResolvedType_1015513490116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24091;
     Object term24440;
     Object term24814;
     Object term24817;

    public NamedType_setReferencedAndResolvedType_1015513490116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term24205 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind$1"));
        term24440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term24393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term24205, term24205.getClass(), "val$value", term24440);
        setField(term24091, term24091.getClass(), "validator", term24205);
        setField(term24091, term24091.getClass(), "referencedType", term24393);
        term24814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term24815 = newInstance(Class.forName("com.google.javascript.jscomp.graph.StandardUnionFind$1"));
        Object term24816 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term24814, term24814.getClass(), "reference", null);
        setField(term24814, term24814.getClass(), "sourceName", null);
        setIntField(term24814, term24814.getClass(), "lineno", 0);
        setIntField(term24814, term24814.getClass(), "charno", 0);
        setField(term24815, term24815.getClass(), "nodeForValue", null);
        setField(term24816, term24816.getClass(), "reference", null);
        setField(term24816, term24816.getClass(), "sourceName", null);
        setIntField(term24816, term24816.getClass(), "lineno", 0);
        setIntField(term24816, term24816.getClass(), "charno", 0);
        setField(term24816, term24816.getClass(), "validator", null);
        setField(term24816, term24816.getClass(), "propertyContinuations", null);
        setField(term24816, term24816.getClass(), "referencedType", null);
        setField(term24816, term24816.getClass(), "referencedObjType", null);
        setBooleanField(term24816, term24816.getClass(), "visited", false);
        setField(term24816, term24816.getClass(), "docInfo", null);
        setBooleanField(term24816, term24816.getClass(), "unknown", false);
        setBooleanField(term24816, term24816.getClass(), "resolved", false);
        setField(term24816, term24816.getClass(), "resolveResult", null);
        setField(term24816, term24816.getClass(), "templateKeys", null);
        setField(term24816, term24816.getClass(), "templatizedTypes", null);
        setBooleanField(term24816, term24816.getClass(), "inTemplatedCheckVisit", false);
        setField(term24816, term24816.getClass(), "registry", null);
        setField(term24815, term24815.getClass(), "val$value", term24816);
        setField(term24815, term24815.getClass(), "this$0", null);
        setField(term24814, term24814.getClass(), "validator", term24815);
        setField(term24814, term24814.getClass(), "propertyContinuations", null);
        setField(term24814, term24814.getClass(), "referencedType", term24816);
        setField(term24814, term24814.getClass(), "referencedObjType", term24816);
        setBooleanField(term24814, term24814.getClass(), "visited", false);
        setField(term24814, term24814.getClass(), "docInfo", null);
        setBooleanField(term24814, term24814.getClass(), "unknown", false);
        setBooleanField(term24814, term24814.getClass(), "resolved", true);
        setField(term24814, term24814.getClass(), "resolveResult", term24816);
        setField(term24814, term24814.getClass(), "templateKeys", null);
        setField(term24814, term24814.getClass(), "templatizedTypes", null);
        setBooleanField(term24814, term24814.getClass(), "inTemplatedCheckVisit", false);
        setField(term24814, term24814.getClass(), "registry", null);
        term24817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term24817, term24817.getClass(), "reference", null);
        setField(term24817, term24817.getClass(), "sourceName", null);
        setIntField(term24817, term24817.getClass(), "lineno", 0);
        setIntField(term24817, term24817.getClass(), "charno", 0);
        setField(term24817, term24817.getClass(), "validator", null);
        setField(term24817, term24817.getClass(), "propertyContinuations", null);
        setField(term24817, term24817.getClass(), "referencedType", null);
        setField(term24817, term24817.getClass(), "referencedObjType", null);
        setBooleanField(term24817, term24817.getClass(), "visited", false);
        setField(term24817, term24817.getClass(), "docInfo", null);
        setBooleanField(term24817, term24817.getClass(), "unknown", false);
        setBooleanField(term24817, term24817.getClass(), "resolved", false);
        setField(term24817, term24817.getClass(), "resolveResult", null);
        setField(term24817, term24817.getClass(), "templateKeys", null);
        setField(term24817, term24817.getClass(), "templatizedTypes", null);
        setBooleanField(term24817, term24817.getClass(), "inTemplatedCheckVisit", false);
        setField(term24817, term24817.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term24440;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setReferencedAndResolvedType", argTypes, term24091, args);
        assertTrue(recursiveEquals(term24091, term24814));
        assertTrue(recursiveEquals(term24440, term24817));
    }

};


