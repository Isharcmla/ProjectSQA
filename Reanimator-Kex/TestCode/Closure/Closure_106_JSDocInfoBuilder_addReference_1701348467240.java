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
import java.util.ArrayList;

public class JSDocInfoBuilder_addReference_1701348467240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122813;
     Object term123101;

    public JSDocInfoBuilder_addReference_1701348467240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122813 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122893 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term123035 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term122893, term122893.getClass(), "includeDocumentation", true);
        setField(term123035, term123035.getClass(), "sees", null);
        setField(term122893, term122893.getClass(), "documentation", term123035);
        setField(term122813, term122813.getClass(), "currentInfo", term122893);
        ArrayList term123104 = new ArrayList();
        ((ArrayList) term123104).add((Object)null);
        term123101 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term123102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term123103 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term123102, term123102.getClass(), "info", null);
        setField(term123103, term123103.getClass(), "markers", null);
        setField(term123103, term123103.getClass(), "parameters", null);
        setField(term123103, term123103.getClass(), "throwsDescriptions", null);
        setField(term123103, term123103.getClass(), "blockDescription", null);
        setField(term123103, term123103.getClass(), "fileOverview", null);
        setField(term123103, term123103.getClass(), "returnDescription", null);
        setField(term123103, term123103.getClass(), "version", null);
        setField(term123103, term123103.getClass(), "authors", null);
        setField(term123103, term123103.getClass(), "sees", term123104);
        setField(term123102, term123102.getClass(), "documentation", term123103);
        setField(term123102, term123102.getClass(), "sourceName", null);
        setField(term123102, term123102.getClass(), "visibility", null);
        setIntField(term123102, term123102.getClass(), "bitset", 0);
        setField(term123102, term123102.getClass(), "type", null);
        setField(term123102, term123102.getClass(), "thisType", null);
        setBooleanField(term123102, term123102.getClass(), "includeDocumentation", true);
        setField(term123101, term123101.getClass(), "currentInfo", term123102);
        setBooleanField(term123101, term123101.getClass(), "populated", true);
        setBooleanField(term123101, term123101.getClass(), "parseDocumentation", false);
        setField(term123101, term123101.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "addReference", argTypes, term122813, args);
        assertTrue(recursiveEquals(term122813, term123101));
        assertTrue(recursiveEquals(retValue, true));
    }

};


