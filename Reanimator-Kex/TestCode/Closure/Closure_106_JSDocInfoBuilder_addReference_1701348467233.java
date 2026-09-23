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

public class JSDocInfoBuilder_addReference_1701348467233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121917;
     Object term122215;

    public JSDocInfoBuilder_addReference_1701348467233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121917 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term121997 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term121997, term121997.getClass(), "includeDocumentation", true);
        setField(term121997, term121997.getClass(), "documentation", null);
        setField(term121917, term121917.getClass(), "currentInfo", term121997);
        ArrayList term122218 = new ArrayList();
        ((ArrayList) term122218).add((Object)null);
        term122215 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122216 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term122217 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term122216, term122216.getClass(), "info", null);
        setField(term122217, term122217.getClass(), "markers", null);
        setField(term122217, term122217.getClass(), "parameters", null);
        setField(term122217, term122217.getClass(), "throwsDescriptions", null);
        setField(term122217, term122217.getClass(), "blockDescription", null);
        setField(term122217, term122217.getClass(), "fileOverview", null);
        setField(term122217, term122217.getClass(), "returnDescription", null);
        setField(term122217, term122217.getClass(), "version", null);
        setField(term122217, term122217.getClass(), "authors", null);
        setField(term122217, term122217.getClass(), "sees", term122218);
        setField(term122216, term122216.getClass(), "documentation", term122217);
        setField(term122216, term122216.getClass(), "sourceName", null);
        setField(term122216, term122216.getClass(), "visibility", null);
        setIntField(term122216, term122216.getClass(), "bitset", 0);
        setField(term122216, term122216.getClass(), "type", null);
        setField(term122216, term122216.getClass(), "thisType", null);
        setBooleanField(term122216, term122216.getClass(), "includeDocumentation", true);
        setField(term122215, term122215.getClass(), "currentInfo", term122216);
        setBooleanField(term122215, term122215.getClass(), "populated", true);
        setBooleanField(term122215, term122215.getClass(), "parseDocumentation", false);
        setField(term122215, term122215.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "addReference", argTypes, term121917, args);
        assertTrue(recursiveEquals(term121917, term122215));
        assertTrue(recursiveEquals(retValue, true));
    }

};


