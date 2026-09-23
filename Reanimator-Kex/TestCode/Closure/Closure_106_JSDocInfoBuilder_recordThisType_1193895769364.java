package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class JSDocInfoBuilder_recordThisType_1193895769364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147431;
     Object term147699;
     Object term147746;
     Object term147749;

    public JSDocInfoBuilder_recordThisType_1193895769364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147431 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term147511 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term147605 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term147511, term147511.getClass(), "bitset", -1073741824);
        setField(term147511, term147511.getClass(), "thisType", term147605);
        setField(term147431, term147431.getClass(), "currentInfo", term147511);
        term147699 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term147746 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term147747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term147748 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term147747, term147747.getClass(), "info", null);
        setField(term147747, term147747.getClass(), "documentation", null);
        setField(term147747, term147747.getClass(), "sourceName", null);
        setField(term147747, term147747.getClass(), "visibility", null);
        setIntField(term147747, term147747.getClass(), "bitset", -1073741824);
        setField(term147747, term147747.getClass(), "type", null);
        setField(term147748, term147748.getClass(), "root", null);
        setField(term147748, term147748.getClass(), "sourceName", null);
        setField(term147748, term147748.getClass(), "registry", null);
        setField(term147747, term147747.getClass(), "thisType", term147748);
        setBooleanField(term147747, term147747.getClass(), "includeDocumentation", false);
        setField(term147746, term147746.getClass(), "currentInfo", term147747);
        setBooleanField(term147746, term147746.getClass(), "populated", false);
        setBooleanField(term147746, term147746.getClass(), "parseDocumentation", false);
        setField(term147746, term147746.getClass(), "currentMarker", null);
        term147749 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term147749, term147749.getClass(), "root", null);
        setField(term147749, term147749.getClass(), "sourceName", null);
        setField(term147749, term147749.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term147699;
        Object retValue = callMethod(klass, "recordThisType", argTypes, term147431, args);
        assertTrue(recursiveEquals(term147431, term147746));
        assertTrue(recursiveEquals(term147699, term147749));
        assertTrue(recursiveEquals(retValue, false));
    }

};


