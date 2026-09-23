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
import java.util.HashSet;

public class NamedType_getTypedefType_106686040255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79791;
     Object term80251;
     Object term80345;
     Object term80448;
     Object term80449;
     Object term80452;

    public NamedType_getTypedefType_106686040255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term79943 = new HashSet();
        term79791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term79895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term79895, term79895.getClass(), "lastGeneration", true);
        setField(term79895, term79895.getClass(), "forwardDeclaredTypes", term79943);
        setField(term79791, term79791.getClass(), "registry", term79895);
        setField(term79791, term79791.getClass(), "reference", null);
        setField(term79791, term79791.getClass(), "sourceName", null);
        setIntField(term79791, term79791.getClass(), "lineno", 0);
        setIntField(term79791, term79791.getClass(), "charno", 0);
        term80251 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        term80345 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        setField(term80345, term80345.getClass(), "type", null);
        term80448 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
        term80449 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        setField(term80449, term80449.getClass(), "name", null);
        setField(term80449, term80449.getClass(), "nameNode", null);
        setField(term80449, term80449.getClass(), "type", null);
        setBooleanField(term80449, term80449.getClass(), "typeInferred", false);
        setField(term80449, term80449.getClass(), "input", null);
        setIntField(term80449, term80449.getClass(), "index", 0);
        setField(term80449, term80449.getClass(), "scope", null);
        setBooleanField(term80449, term80449.getClass(), "markedEscaped", false);
        setBooleanField(term80449, term80449.getClass(), "markedAssignedExactlyOnce", false);
        term80452 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$OldRhinoNullReporter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term80251;
        args[1] = term80345;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term79791, args);
        assertTrue(recursiveEquals(term79791, term80448));
        assertTrue(recursiveEquals(term80251, term80449));
        assertTrue(recursiveEquals(term80345, "Bad type annotation. Unknown type null"));
        assertTrue(recursiveEquals(retValue, null));
    }

};


