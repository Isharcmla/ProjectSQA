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

public class JSDocInfoBuilder_markAnnotation_1356395335162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110551;
     Object term110757;

    public JSDocInfoBuilder_markAnnotation_1356395335162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110551 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110631 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term110631, term110631.getClass(), "includeDocumentation", true);
        setField(term110631, term110631.getClass(), "documentation", null);
        setField(term110551, term110551.getClass(), "currentInfo", term110631);
        ArrayList term110760 = new ArrayList();
        ((ArrayList) term110760).add((Object)null);
        term110757 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110758 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term110759 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term110762 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term110763 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$StringPosition"));
        setField(term110758, term110758.getClass(), "info", null);
        setField(term110759, term110759.getClass(), "markers", term110760);
        setField(term110759, term110759.getClass(), "parameters", null);
        setField(term110759, term110759.getClass(), "throwsDescriptions", null);
        setField(term110759, term110759.getClass(), "blockDescription", null);
        setField(term110759, term110759.getClass(), "fileOverview", null);
        setField(term110759, term110759.getClass(), "returnDescription", null);
        setField(term110759, term110759.getClass(), "version", null);
        setField(term110759, term110759.getClass(), "authors", null);
        setField(term110759, term110759.getClass(), "sees", null);
        setField(term110758, term110758.getClass(), "documentation", term110759);
        setField(term110758, term110758.getClass(), "sourceName", null);
        setField(term110758, term110758.getClass(), "visibility", null);
        setIntField(term110758, term110758.getClass(), "bitset", 0);
        setField(term110758, term110758.getClass(), "type", null);
        setField(term110758, term110758.getClass(), "thisType", null);
        setBooleanField(term110758, term110758.getClass(), "includeDocumentation", true);
        setField(term110757, term110757.getClass(), "currentInfo", term110758);
        setBooleanField(term110757, term110757.getClass(), "populated", false);
        setBooleanField(term110757, term110757.getClass(), "parseDocumentation", false);
        setField(term110763, term110763.getClass(), "item", "");
        setIntField(term110763, term110763.getClass(), "startLineno", 0);
        setIntField(term110763, term110763.getClass(), "startCharno", 0);
        setIntField(term110763, term110763.getClass(), "endLineno", 0);
        setIntField(term110763, term110763.getClass(), "endCharno", 0);
        setField(term110762, term110762.getClass(), "annotation", term110763);
        setField(term110762, term110762.getClass(), "name", null);
        setField(term110762, term110762.getClass(), "description", null);
        setField(term110762, term110762.getClass(), "type", null);
        setField(term110757, term110757.getClass(), "currentMarker", term110762);
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
        callMethod(klass, "markAnnotation", argTypes, term110551, args);
        assertTrue(recursiveEquals(term110551, term110757));
    }

};


