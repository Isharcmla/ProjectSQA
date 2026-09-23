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
import java.util.ArrayList;

public class FormElement_formData_212170994251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68285;
     Object term68352;
     Object term68343;

    public FormElement_formData_212170994251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68285 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68341 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term68285, term68285.getClass(), "elements", term68341);
        term68352 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68353 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term68353, term68353.getClass(), "elementData", null);
        setIntField(term68353, term68353.getClass(), "size", 0);
        setIntField(term68353, term68353.getClass(), "modCount", 0);
        setField(term68352, term68352.getClass(), "elements", term68353);
        setField(term68352, term68352.getClass(), "tag", null);
        setField(term68352, term68352.getClass(), "shadowChildrenRef", null);
        setField(term68352, term68352.getClass(), "childNodes", null);
        setField(term68352, term68352.getClass(), "attributes", null);
        setField(term68352, term68352.getClass(), "baseUri", null);
        setField(term68352, term68352.getClass(), "parentNode", null);
        setIntField(term68352, term68352.getClass(), "siblingIndex", 0);
        term68343 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term68285, args);
        assertTrue(recursiveEquals(term68285, term68352));
        assertTrue(recursiveEquals(retValue, term68343));
    }

};


