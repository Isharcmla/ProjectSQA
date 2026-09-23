package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class ParseSettings_normalizeAttributes_58794925421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;
     Object term1878;
     Object term1886;
     Object term1887;
     Object term1881;

    public ParseSettings_normalizeAttributes_58794925421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1820 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term1820, term1820.getClass(), "preserveAttributeCase", false);
        term1878 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term1886 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term1886, term1886.getClass(), "preserveTagCase", false);
        setBooleanField(term1886, term1886.getClass(), "preserveAttributeCase", false);
        term1887 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1887, term1887.getClass(), "size", 0);
        setField(term1887, term1887.getClass(), "keys", null);
        setField(term1887, term1887.getClass(), "vals", null);
        term1881 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1881, term1881.getClass(), "size", 0);
        setField(term1881, term1881.getClass(), "keys", null);
        setField(term1881, term1881.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term1878;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term1820, args);
        assertTrue(recursiveEquals(term1820, term1886));
        assertTrue(recursiveEquals(term1878, term1887));
        assertTrue(recursiveEquals(retValue, term1881));
    }

};


