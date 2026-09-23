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

public class JSDocInfoBuilder_recordFileOverview_1110168625559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197261;
     Object term198200;

    public JSDocInfoBuilder_recordFileOverview_1110168625559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197261 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term197341 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term197483 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setIntField(term197341, term197341.getClass(), "bitset", 0);
        setBooleanField(term197341, term197341.getClass(), "includeDocumentation", true);
        setField(term197483, term197483.getClass(), "fileOverview", "");
        setField(term197341, term197341.getClass(), "documentation", term197483);
        setField(term197261, term197261.getClass(), "currentInfo", term197341);
        term198200 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term198201 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term198202 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term198201, term198201.getClass(), "info", null);
        setField(term198202, term198202.getClass(), "markers", null);
        setField(term198202, term198202.getClass(), "parameters", null);
        setField(term198202, term198202.getClass(), "throwsDescriptions", null);
        setField(term198202, term198202.getClass(), "blockDescription", null);
        setField(term198202, term198202.getClass(), "fileOverview", "");
        setField(term198202, term198202.getClass(), "returnDescription", null);
        setField(term198202, term198202.getClass(), "version", null);
        setField(term198202, term198202.getClass(), "authors", null);
        setField(term198202, term198202.getClass(), "sees", null);
        setField(term198201, term198201.getClass(), "documentation", term198202);
        setField(term198201, term198201.getClass(), "sourceName", null);
        setField(term198201, term198201.getClass(), "visibility", null);
        setIntField(term198201, term198201.getClass(), "bitset", 4096);
        setField(term198201, term198201.getClass(), "type", null);
        setField(term198201, term198201.getClass(), "thisType", null);
        setBooleanField(term198201, term198201.getClass(), "includeDocumentation", true);
        setField(term198200, term198200.getClass(), "currentInfo", term198201);
        setBooleanField(term198200, term198200.getClass(), "populated", false);
        setBooleanField(term198200, term198200.getClass(), "parseDocumentation", false);
        setField(term198200, term198200.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordFileOverview", argTypes, term197261, args);
        assertTrue(recursiveEquals(term197261, term198200));
        assertTrue(recursiveEquals(retValue, false));
    }

};


