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

public class FormElement_equals_81763627632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9659;
     Object term9743;
     Object term10315;
     Object term10316;

    public FormElement_equals_81763627632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9659 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term9743 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        term10315 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term10315, term10315.getClass(), "elements", null);
        setField(term10315, term10315.getClass(), "tag", null);
        setField(term10315, term10315.getClass(), "parentNode", null);
        setField(term10315, term10315.getClass(), "childNodes", null);
        setField(term10315, term10315.getClass(), "attributes", null);
        setField(term10315, term10315.getClass(), "baseUri", null);
        setIntField(term10315, term10315.getClass(), "siblingIndex", 0);
        term10316 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term10316, term10316.getClass(), "escapeMode", null);
        setField(term10316, term10316.getClass(), "charset", null);
        setField(term10316, term10316.getClass(), "charsetEncoder", null);
        setBooleanField(term10316, term10316.getClass(), "prettyPrint", false);
        setBooleanField(term10316, term10316.getClass(), "outline", false);
        setIntField(term10316, term10316.getClass(), "indentAmount", 0);
        setField(term10316, term10316.getClass(), "syntax", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9743;
        callMethod(klass, "equals", argTypes, term9659, args);
        assertTrue(recursiveEquals(term9659, term10315));
        assertTrue(recursiveEquals(term9743, term10316));
    }

};


