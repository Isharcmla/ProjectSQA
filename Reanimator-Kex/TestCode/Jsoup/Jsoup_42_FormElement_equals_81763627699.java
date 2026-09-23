package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedHashMap;

public class FormElement_equals_81763627699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44723;
     Object term44811;
     Object term44969;
     Object term44971;

    public FormElement_equals_81763627699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44723 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44781 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term44723, term44723.getClass(), "childNodes", null);
        setField(term44781, term44781.getClass(), "attributes", null);
        setField(term44723, term44723.getClass(), "attributes", term44781);
        LinkedHashMap term44929 = new LinkedHashMap();
        term44811 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44869 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term44811, term44811.getClass(), "childNodes", null);
        setField(term44869, term44869.getClass(), "attributes", term44929);
        setField(term44811, term44811.getClass(), "attributes", term44869);
        term44969 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44970 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term44969, term44969.getClass(), "elements", null);
        setField(term44969, term44969.getClass(), "tag", null);
        setField(term44969, term44969.getClass(), "parentNode", null);
        setField(term44969, term44969.getClass(), "childNodes", null);
        setField(term44970, term44970.getClass(), "attributes", null);
        setField(term44969, term44969.getClass(), "attributes", term44970);
        setField(term44969, term44969.getClass(), "baseUri", null);
        setIntField(term44969, term44969.getClass(), "siblingIndex", 0);
        LinkedHashMap term44973 = new LinkedHashMap();
        term44971 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term44972 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term44971, term44971.getClass(), "elements", null);
        setField(term44971, term44971.getClass(), "tag", null);
        setField(term44971, term44971.getClass(), "parentNode", null);
        setField(term44971, term44971.getClass(), "childNodes", null);
        setField(term44972, term44972.getClass(), "attributes", term44973);
        setField(term44971, term44971.getClass(), "attributes", term44972);
        setField(term44971, term44971.getClass(), "baseUri", null);
        setIntField(term44971, term44971.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44811;
        callMethod(klass, "equals", argTypes, term44723, args);
        assertTrue(recursiveEquals(term44723, term44969));
        assertTrue(recursiveEquals(term44811, term44971));
    }

};


