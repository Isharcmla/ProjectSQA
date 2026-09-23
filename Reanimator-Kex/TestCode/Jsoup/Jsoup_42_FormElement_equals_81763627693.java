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

public class FormElement_equals_81763627693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42800;
     Object term42948;
     Object term43046;
     Object term43049;

    public FormElement_equals_81763627693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term42918 = new LinkedHashMap();
        term42800 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term42858 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term42800, term42800.getClass(), "childNodes", null);
        setField(term42858, term42858.getClass(), "attributes", term42918);
        setField(term42800, term42800.getClass(), "attributes", term42858);
        term42948 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43006 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term42948, term42948.getClass(), "childNodes", null);
        setField(term42948, term42948.getClass(), "attributes", term43006);
        LinkedHashMap term43048 = new LinkedHashMap();
        term43046 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43047 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term43046, term43046.getClass(), "elements", null);
        setField(term43046, term43046.getClass(), "tag", null);
        setField(term43046, term43046.getClass(), "parentNode", null);
        setField(term43046, term43046.getClass(), "childNodes", null);
        setField(term43047, term43047.getClass(), "attributes", term43048);
        setField(term43046, term43046.getClass(), "attributes", term43047);
        setField(term43046, term43046.getClass(), "baseUri", null);
        setIntField(term43046, term43046.getClass(), "siblingIndex", 0);
        term43049 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term43050 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term43049, term43049.getClass(), "elements", null);
        setField(term43049, term43049.getClass(), "tag", null);
        setField(term43049, term43049.getClass(), "parentNode", null);
        setField(term43049, term43049.getClass(), "childNodes", null);
        setField(term43050, term43050.getClass(), "attributes", null);
        setField(term43049, term43049.getClass(), "attributes", term43050);
        setField(term43049, term43049.getClass(), "baseUri", null);
        setIntField(term43049, term43049.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42948;
        callMethod(klass, "equals", argTypes, term42800, args);
        assertTrue(recursiveEquals(term42800, term43046));
        assertTrue(recursiveEquals(term42948, term43049));
    }

};


