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

public class TypeValidator_mismatch_1931343499186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47747;
     Object term47883;
     Object term47983;
     Object term48389;
     Object term48392;
     Object term48393;

    public TypeValidator_mismatch_1931343499186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47747 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term47883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term47983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        term48389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term48389, term48389.getClass(), "isChecked", false);
        setBooleanField(term48389, term48389.getClass(), "visited", false);
        setField(term48389, term48389.getClass(), "docInfo", null);
        setBooleanField(term48389, term48389.getClass(), "unknown", false);
        setBooleanField(term48389, term48389.getClass(), "resolved", false);
        setField(term48389, term48389.getClass(), "resolveResult", null);
        setField(term48389, term48389.getClass(), "templateKeys", null);
        setField(term48389, term48389.getClass(), "templatizedTypes", null);
        setBooleanField(term48389, term48389.getClass(), "inTemplatedCheckVisit", false);
        setField(term48389, term48389.getClass(), "registry", null);
        term48392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term48392, term48392.getClass(), "isChecked", false);
        setBooleanField(term48392, term48392.getClass(), "visited", false);
        setField(term48392, term48392.getClass(), "docInfo", null);
        setBooleanField(term48392, term48392.getClass(), "unknown", false);
        setBooleanField(term48392, term48392.getClass(), "resolved", false);
        setField(term48392, term48392.getClass(), "resolveResult", null);
        setField(term48392, term48392.getClass(), "templateKeys", null);
        setField(term48392, term48392.getClass(), "templatizedTypes", null);
        setBooleanField(term48392, term48392.getClass(), "inTemplatedCheckVisit", false);
        setField(term48392, term48392.getClass(), "registry", null);
        term48393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term48393, term48393.getClass(), "name", null);
        setField(term48393, term48393.getClass(), "referencedType", null);
        setField(term48393, term48393.getClass(), "referencedObjType", null);
        setBooleanField(term48393, term48393.getClass(), "visited", false);
        setField(term48393, term48393.getClass(), "docInfo", null);
        setBooleanField(term48393, term48393.getClass(), "unknown", false);
        setBooleanField(term48393, term48393.getClass(), "resolved", false);
        setField(term48393, term48393.getClass(), "resolveResult", null);
        setField(term48393, term48393.getClass(), "templateKeys", null);
        setField(term48393, term48393.getClass(), "templatizedTypes", null);
        setBooleanField(term48393, term48393.getClass(), "inTemplatedCheckVisit", false);
        setField(term48393, term48393.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = "";
        args[3] = term47883;
        args[4] = term47983;
        callMethod(klass, "mismatch", argTypes, term47747, args);
        assertTrue(recursiveEquals(term47747, term48389));
        assertTrue(recursiveEquals(term47883, term48393));
        assertTrue(recursiveEquals(term47983, null));
    }

};


