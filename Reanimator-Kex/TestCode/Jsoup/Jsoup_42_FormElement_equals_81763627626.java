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

public class FormElement_equals_81763627626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6071;
     Object term6165;
     Object term7720;
     Object term7721;

    public FormElement_equals_81763627626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6071 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term6165 = newInstance(Class.forName("java.util.ResourceBundle$SingleFormatControl"));
        term7720 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term7720, term7720.getClass(), "elements", null);
        setField(term7720, term7720.getClass(), "tag", null);
        setField(term7720, term7720.getClass(), "parentNode", null);
        setField(term7720, term7720.getClass(), "childNodes", null);
        setField(term7720, term7720.getClass(), "attributes", null);
        setField(term7720, term7720.getClass(), "baseUri", null);
        setIntField(term7720, term7720.getClass(), "siblingIndex", 0);
        term7721 = newInstance(Class.forName("java.util.ResourceBundle$SingleFormatControl"));
        setField(term7721, term7721.getClass(), "formats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6165;
        callMethod(klass, "equals", argTypes, term6071, args);
        assertTrue(recursiveEquals(term6071, term7720));
        assertTrue(recursiveEquals(term6165, term7721));
    }

};


