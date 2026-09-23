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

public class JSDocInfoBuilder_markAnnotation_1356395335488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176001;
     Object term176718;

    public JSDocInfoBuilder_markAnnotation_1356395335488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176001 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term176081 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term176223 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term176081, term176081.getClass(), "includeDocumentation", true);
        setField(term176223, term176223.getClass(), "markers", null);
        setField(term176081, term176081.getClass(), "documentation", term176223);
        setField(term176001, term176001.getClass(), "currentInfo", term176081);
        ArrayList term176721 = new ArrayList();
        ((ArrayList) term176721).add((Object)null);
        term176718 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term176719 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term176720 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term176723 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term176724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$StringPosition"));
        setField(term176719, term176719.getClass(), "info", null);
        setField(term176720, term176720.getClass(), "markers", term176721);
        setField(term176720, term176720.getClass(), "parameters", null);
        setField(term176720, term176720.getClass(), "throwsDescriptions", null);
        setField(term176720, term176720.getClass(), "blockDescription", null);
        setField(term176720, term176720.getClass(), "fileOverview", null);
        setField(term176720, term176720.getClass(), "returnDescription", null);
        setField(term176720, term176720.getClass(), "version", null);
        setField(term176720, term176720.getClass(), "authors", null);
        setField(term176720, term176720.getClass(), "sees", null);
        setField(term176719, term176719.getClass(), "documentation", term176720);
        setField(term176719, term176719.getClass(), "sourceName", null);
        setField(term176719, term176719.getClass(), "visibility", null);
        setIntField(term176719, term176719.getClass(), "bitset", 0);
        setField(term176719, term176719.getClass(), "type", null);
        setField(term176719, term176719.getClass(), "thisType", null);
        setBooleanField(term176719, term176719.getClass(), "includeDocumentation", true);
        setField(term176718, term176718.getClass(), "currentInfo", term176719);
        setBooleanField(term176718, term176718.getClass(), "populated", false);
        setBooleanField(term176718, term176718.getClass(), "parseDocumentation", false);
        setField(term176724, term176724.getClass(), "item", "");
        setIntField(term176724, term176724.getClass(), "startLineno", 0);
        setIntField(term176724, term176724.getClass(), "startCharno", 0);
        setIntField(term176724, term176724.getClass(), "endLineno", 0);
        setIntField(term176724, term176724.getClass(), "endCharno", 0);
        setField(term176723, term176723.getClass(), "annotation", term176724);
        setField(term176723, term176723.getClass(), "name", null);
        setField(term176723, term176723.getClass(), "description", null);
        setField(term176723, term176723.getClass(), "type", null);
        setField(term176718, term176718.getClass(), "currentMarker", term176723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "markAnnotation", argTypes, term176001, args);
        assertTrue(recursiveEquals(term176001, term176718));
    }

};


