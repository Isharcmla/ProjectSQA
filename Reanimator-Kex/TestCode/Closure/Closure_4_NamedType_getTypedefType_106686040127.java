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

public class NamedType_getTypedefType_106686040127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27370;
     Object term27462;
     Object term27588;
     Object term27589;
     Object term27565;

    public NamedType_getTypedefType_106686040127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term27462 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        Object term27556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27462, term27462.getClass(), "type", term27556);
        term27588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27588, term27588.getClass(), "reference", null);
        setField(term27588, term27588.getClass(), "sourceName", null);
        setIntField(term27588, term27588.getClass(), "lineno", 0);
        setIntField(term27588, term27588.getClass(), "charno", 0);
        setField(term27588, term27588.getClass(), "validator", null);
        setField(term27588, term27588.getClass(), "propertyContinuations", null);
        setField(term27588, term27588.getClass(), "referencedType", null);
        setField(term27588, term27588.getClass(), "referencedObjType", null);
        setBooleanField(term27588, term27588.getClass(), "visited", false);
        setField(term27588, term27588.getClass(), "docInfo", null);
        setBooleanField(term27588, term27588.getClass(), "unknown", false);
        setBooleanField(term27588, term27588.getClass(), "resolved", false);
        setField(term27588, term27588.getClass(), "resolveResult", null);
        setField(term27588, term27588.getClass(), "templateKeys", null);
        setField(term27588, term27588.getClass(), "templatizedTypes", null);
        setBooleanField(term27588, term27588.getClass(), "inTemplatedCheckVisit", false);
        setField(term27588, term27588.getClass(), "registry", null);
        term27589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        Object term27590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27589, term27589.getClass(), "name", null);
        setField(term27590, term27590.getClass(), "reference", null);
        setField(term27590, term27590.getClass(), "sourceName", null);
        setIntField(term27590, term27590.getClass(), "lineno", 0);
        setIntField(term27590, term27590.getClass(), "charno", 0);
        setField(term27590, term27590.getClass(), "validator", null);
        setField(term27590, term27590.getClass(), "propertyContinuations", null);
        setField(term27590, term27590.getClass(), "referencedType", null);
        setField(term27590, term27590.getClass(), "referencedObjType", null);
        setBooleanField(term27590, term27590.getClass(), "visited", false);
        setField(term27590, term27590.getClass(), "docInfo", null);
        setBooleanField(term27590, term27590.getClass(), "unknown", false);
        setBooleanField(term27590, term27590.getClass(), "resolved", false);
        setField(term27590, term27590.getClass(), "resolveResult", null);
        setField(term27590, term27590.getClass(), "templateKeys", null);
        setField(term27590, term27590.getClass(), "templatizedTypes", null);
        setBooleanField(term27590, term27590.getClass(), "inTemplatedCheckVisit", false);
        setField(term27590, term27590.getClass(), "registry", null);
        setField(term27589, term27589.getClass(), "type", term27590);
        setBooleanField(term27589, term27589.getClass(), "inferred", false);
        setField(term27589, term27589.getClass(), "propertyNode", null);
        setField(term27589, term27589.getClass(), "docInfo", null);
        term27565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term27565, term27565.getClass(), "reference", null);
        setField(term27565, term27565.getClass(), "sourceName", null);
        setIntField(term27565, term27565.getClass(), "lineno", 0);
        setIntField(term27565, term27565.getClass(), "charno", 0);
        setField(term27565, term27565.getClass(), "validator", null);
        setField(term27565, term27565.getClass(), "propertyContinuations", null);
        setField(term27565, term27565.getClass(), "referencedType", null);
        setField(term27565, term27565.getClass(), "referencedObjType", null);
        setBooleanField(term27565, term27565.getClass(), "visited", false);
        setField(term27565, term27565.getClass(), "docInfo", null);
        setBooleanField(term27565, term27565.getClass(), "unknown", false);
        setBooleanField(term27565, term27565.getClass(), "resolved", false);
        setField(term27565, term27565.getClass(), "resolveResult", null);
        setField(term27565, term27565.getClass(), "templateKeys", null);
        setField(term27565, term27565.getClass(), "templatizedTypes", null);
        setBooleanField(term27565, term27565.getClass(), "inTemplatedCheckVisit", false);
        setField(term27565, term27565.getClass(), "registry", null);
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
        args[1] = term27462;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term27370, args);
        assertTrue(recursiveEquals(term27370, term27588));
        assertTrue(recursiveEquals(term27462, null));
        assertTrue(recursiveEquals(retValue, term27565));
    }

};


