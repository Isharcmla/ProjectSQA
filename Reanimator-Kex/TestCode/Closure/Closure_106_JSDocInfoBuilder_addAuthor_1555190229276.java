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

public class JSDocInfoBuilder_addAuthor_1555190229276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129824;
     Object term130078;

    public JSDocInfoBuilder_addAuthor_1555190229276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129824 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term129904 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term130046 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term129904, term129904.getClass(), "includeDocumentation", true);
        setField(term130046, term130046.getClass(), "authors", null);
        setField(term129904, term129904.getClass(), "documentation", term130046);
        setField(term129824, term129824.getClass(), "currentInfo", term129904);
        ArrayList term130081 = new ArrayList();
        ((ArrayList) term130081).add((Object)null);
        term130078 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term130079 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term130080 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term130079, term130079.getClass(), "info", null);
        setField(term130080, term130080.getClass(), "markers", null);
        setField(term130080, term130080.getClass(), "parameters", null);
        setField(term130080, term130080.getClass(), "throwsDescriptions", null);
        setField(term130080, term130080.getClass(), "blockDescription", null);
        setField(term130080, term130080.getClass(), "fileOverview", null);
        setField(term130080, term130080.getClass(), "returnDescription", null);
        setField(term130080, term130080.getClass(), "version", null);
        setField(term130080, term130080.getClass(), "authors", term130081);
        setField(term130080, term130080.getClass(), "sees", null);
        setField(term130079, term130079.getClass(), "documentation", term130080);
        setField(term130079, term130079.getClass(), "sourceName", null);
        setField(term130079, term130079.getClass(), "visibility", null);
        setIntField(term130079, term130079.getClass(), "bitset", 0);
        setField(term130079, term130079.getClass(), "type", null);
        setField(term130079, term130079.getClass(), "thisType", null);
        setBooleanField(term130079, term130079.getClass(), "includeDocumentation", true);
        setField(term130078, term130078.getClass(), "currentInfo", term130079);
        setBooleanField(term130078, term130078.getClass(), "populated", true);
        setBooleanField(term130078, term130078.getClass(), "parseDocumentation", false);
        setField(term130078, term130078.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "addAuthor", argTypes, term129824, args);
        assertTrue(recursiveEquals(term129824, term130078));
        assertTrue(recursiveEquals(retValue, true));
    }

};


