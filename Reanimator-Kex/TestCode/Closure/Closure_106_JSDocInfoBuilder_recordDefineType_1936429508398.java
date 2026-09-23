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

public class JSDocInfoBuilder_recordDefineType_1936429508398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155656;
     Object term155830;
     Object term155978;
     Object term155980;

    public JSDocInfoBuilder_recordDefineType_1936429508398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155656 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term155736 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term155736, term155736.getClass(), "bitset", 512);
        setField(term155656, term155656.getClass(), "currentInfo", term155736);
        term155830 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term155978 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term155979 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term155979, term155979.getClass(), "info", null);
        setField(term155979, term155979.getClass(), "documentation", null);
        setField(term155979, term155979.getClass(), "sourceName", null);
        setField(term155979, term155979.getClass(), "visibility", null);
        setIntField(term155979, term155979.getClass(), "bitset", 512);
        setField(term155979, term155979.getClass(), "type", null);
        setField(term155979, term155979.getClass(), "thisType", null);
        setBooleanField(term155979, term155979.getClass(), "includeDocumentation", false);
        setField(term155978, term155978.getClass(), "currentInfo", term155979);
        setBooleanField(term155978, term155978.getClass(), "populated", false);
        setBooleanField(term155978, term155978.getClass(), "parseDocumentation", false);
        setField(term155978, term155978.getClass(), "currentMarker", null);
        term155980 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term155980, term155980.getClass(), "root", null);
        setField(term155980, term155980.getClass(), "sourceName", null);
        setField(term155980, term155980.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term155830;
        Object retValue = callMethod(klass, "recordDefineType", argTypes, term155656, args);
        assertTrue(recursiveEquals(term155656, term155978));
        assertTrue(recursiveEquals(term155830, term155980));
        assertTrue(recursiveEquals(retValue, false));
    }

};


